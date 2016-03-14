package de.labystudio.gui;

import avc;
import ave;
import avh;
import avm;
import avs;
import axu;
import bfl;
import biu;
import bnq;
import bqs;
import com.mojang.authlib.GameProfile;
import de.labystudio.capes.CapeManager;
import de.labystudio.capes.CapeMover;
import de.labystudio.capes.CapeUploader;
import de.labystudio.capes.MoveCallback;
import de.labystudio.cosmetic.CosmeticManager;
import de.labystudio.downloader.ModInfoDownloader;
import de.labystudio.downloader.UserCapeDownloader;
import de.labystudio.gui.extras.ModGuiTextField;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.labymod.Source;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.lwjgl.input.Keyboard;
import pr;
import wo;

public class GuiCapeSettings
  extends axu
{
  private axu lastScreen;
  private static long cdPriority = 0L;
  private static long cdRefresh = 0L;
  boolean hasCape = false;
  boolean moveCape = false;
  boolean accept = false;
  avs a;
  avs b;
  avs c;
  avs d;
  ModGuiTextField e;
  avs f;
  avs g;
  avs h;
  
  public GuiCapeSettings(axu lastScreen)
  {
    Keyboard.enableRepeatEvents(true);
    this.lastScreen = lastScreen;
    checkCape();
  }
  
  public void checkCape()
  {
    this.hasCape = LabyMod.getInstance().getCapeManager().hasLabyModCape(ave.A().L().e().getId());
  }
  
  public void b()
  {
    this.accept = false;
    this.moveCape = false;
    this.n.clear();
    
    this.n.add(this.a = new avs(1, this.l / 2 - 110, this.m / 2 - 28 - 20, 80, 20, ""));
    this.n.add(this.b = new avs(2, this.l / 2 - 110, this.m / 2 + 11 - 20, 80, 20, ""));
    this.n.add(this.c = new avs(3, this.l / 2 - 110, this.m / 2 + 35 - 20, 80, 20, ""));
    this.n.add(this.d = new avs(4, this.l / 2 - 110, this.m / 2 + 59 - 20, 80, 20, ""));
    this.n.add(this.h = new avs(7, this.l / 2 - 110, this.m / 2 + 82 - 20, 80, 20, ""));
    this.e = new ModGuiTextField(0, this.j.k, this.l / 2 - 100, this.m / 4 - 30, 200, 20);
    this.e.setBlacklistWord(" ");
    this.n.add(this.f = new avs(5, this.l / 2 - 100, this.m / 4 - 5, 200, 20, ""));
    this.n.add(this.g = new avs(6, 2, 2, 40, 20, ""));
    refreshButtons();
    
    this.n.add(new avs(200, this.l / 2 - 100, this.m / 2 + 90, bnq.a("gui.done", new Object[0])));
  }
  
  public void refreshButtons()
  {
    if (ConfigManager.settings.capePriority.equals("of")) {
      this.a.j = "OptiFine";
    } else {
      this.a.j = "LabyMod";
    }
    this.b.j = getStatus("Cape", wo.a);
    this.d.j = "Move";
    if (this.accept) {
      this.f.j = (Color.cl("c") + Color.cl("l") + "Press again to accept");
    } else {
      this.f.j = "Move";
    }
    this.g.j = (Color.cl("6") + "Donate");
    this.h.j = "Refresh";
  }
  
  public String getStatus(String name, wo part)
  {
    String var2;
    String var2;
    if (this.j.t.d().contains(part)) {
      var2 = Color.cl("a") + "SHOWN";
    } else {
      var2 = Color.cl("C") + "HIDDEN";
    }
    if (!this.hasCape) {
      var2 = "NO CAPE";
    }
    return var2 + Color.cl("f") + "";
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.l) {
      if (button.k == 1)
      {
        if (ConfigManager.settings.capePriority.equals("of")) {
          ConfigManager.settings.capePriority = "labymod";
        } else {
          ConfigManager.settings.capePriority = "of";
        }
        cdPriority = System.currentTimeMillis();
        LabyMod.getInstance().getCapeManager().refresh();
        refreshButtons();
        ConfigManager.save();
      }
      else if (button.k == 2)
      {
        this.j.t.a(wo.a);
        refreshButtons();
      }
      else if (button.k == 3)
      {
        new CapeUploader().start();
      }
      else if (button.k == 4)
      {
        this.moveCape = true;
        refreshButtons();
      }
      else if (button.k == 5)
      {
        if ((!this.accept) && (this.e.b().length() != 0))
        {
          this.accept = true;
          refreshButtons();
        }
        else
        {
          button.l = false;
          new CapeMover(this.e.b(), new MoveCallback()
          {
            public void done()
            {
              LabyMod.getInstance().getCapeManager().refresh();
              GuiCapeSettings.this.checkCape();
              GuiCapeSettings.this.b();
            }
            
            public void failed()
            {
              GuiCapeSettings.this.b();
            }
          })
          
            .start();
        }
      }
      else if (button.k == 6)
      {
        LabyMod.getInstance().openWebpage(Source.url_donate);
      }
      else if (button.k == 200)
      {
        this.j.t.b();
        this.j.a(this.lastScreen);
      }
      else if (button.k == 7)
      {
        cdRefresh = System.currentTimeMillis();
        LabyMod.getInstance().getCapeManager().refresh();
        LabyMod.getInstance().getCosmeticManager().getCosmetics().clear();
        new UserCapeDownloader();
        new ModInfoDownloader();
        refreshButtons();
      }
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (keyCode == 1)
    {
      this.j.t.b();
      this.j.a(this.lastScreen);
    }
    if ((this.moveCape) && 
      (this.e.a(typedChar, keyCode)) && 
      (this.e.b().length() > 16)) {
      this.e.a(this.e.b().substring(0, 16));
    }
    super.a(typedChar, keyCode);
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (this.moveCape) {
      this.e.a(mouseX, mouseY, mouseButton);
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(this.q, "Cape Settings", this.l / 2, 20, 16777215);
    
    boolean z = this.a.l;
    this.a.l = (cdPriority + 2000L < System.currentTimeMillis());
    if ((this.a.l != z) && (this.a.l)) {
      refreshButtons();
    }
    if (!this.a.l) {
      this.a.j = ("Switch.. " + getLoading());
    }
    boolean t = this.h.l;
    this.h.l = (cdRefresh + 10000L < System.currentTimeMillis());
    if ((this.h.l != t) && (this.h.l)) {
      refreshButtons();
    }
    if (!this.h.l) {
      this.h.j = ("Refresh.. " + getLoading());
    }
    this.c.l = ((!CapeUploader.openUpload) && (!CapeUploader.upload));
    if (CapeUploader.upload) {
      this.c.j = ("Upload.. " + getLoading());
    } else {
      this.c.j = "Upload..";
    }
    if (CapeMover.moving) {
      this.f.j = ("Moving.. " + getLoading());
    }
    if (this.j.h == null)
    {
      DrawUtils.a(this.l / 2 - 20, this.m / 2 - 30, this.l / 2 + 100, this.m / 2 + 78, 1129010000);
      LabyMod.getInstance().draw.drawCenteredString("Preview not available.", this.l / 2 + 40, this.m / 2 + 17);
      LabyMod.getInstance().draw.drawCenteredString(Color.cl("c") + "You are not ingame!", this.l / 2 + 40, this.m / 2 + 27);
    }
    this.d.l = ((!this.moveCape) && (!CapeMover.moving));
    this.f.l = ((!this.e.b().isEmpty()) && (!CapeMover.moving));
    this.f.m = this.moveCape;
    if (!this.hasCape)
    {
      this.b.l = false;
      this.c.l = false;
      this.d.l = false;
      this.moveCape = false;
    }
    else
    {
      LabyMod.getInstance().draw.drawString(Color.cl("6") + "Donator " + Color.cl("a") + "✔", 2.0D, 2.0D);
    }
    this.g.m = (!this.hasCape);
    
    boolean info = (this.e.b().isEmpty()) && (!this.e.m());
    if (this.moveCape)
    {
      this.e.g();
      if (info)
      {
        LabyMod.getInstance().draw.drawString(Color.cl("7") + "Enter the name of the new owner..", this.e.a + 5, this.e.f + 6);
      }
      else
      {
        for (int i = 0; i <= 2; i++)
        {
          LabyMod.getInstance();LabyMod.a(this.l / 2 - 120, this.m / 4 + 20, this.l / 2 + 120, this.m / 2 + 85, Integer.MIN_VALUE);
        }
        int i = 25;
        LabyMod.getInstance().draw.drawCenteredString(Color.cl("4") + "Caution!", this.l / 2, this.m / 4 + i);i += 10;
        LabyMod.getInstance().draw.drawCenteredString(Color.cl("c") + "Yow won't be the owner of your cape", this.l / 2, this.m / 4 + i);i += 10;
        LabyMod.getInstance().draw.drawCenteredString(Color.cl("c") + "after moving it to another account.", this.l / 2, this.m / 4 + i);i += 20;
        if (this.e.b().isEmpty())
        {
          LabyMod.getInstance().draw.drawString("-> The new owner of the cape will", this.l / 2 - 110, this.m / 4 + i);i += 10;
          LabyMod.getInstance().draw.drawString("then be changed", this.l / 2 - 95, this.m / 4 + i);i += 20;
          LabyMod.getInstance().draw.drawString("-> That cannot be undone unless ", this.l / 2 - 110, this.m / 4 + i);i += 10;
          LabyMod.getInstance().draw.drawString("the new owner moves their", this.l / 2 - 95, this.m / 4 + i);i += 10;
          LabyMod.getInstance().draw.drawString("cape back to your account.", this.l / 2 - 95, this.m / 4 + i);i += 10;
        }
        else
        {
          LabyMod.getInstance().draw.drawString("-> The new owner of the cape will", this.l / 2 - 110, this.m / 4 + i);i += 10;
          LabyMod.getInstance().draw.drawString("then be " + Color.cl("e") + this.e.b(), this.l / 2 - 95, this.m / 4 + i);i += 20;
          LabyMod.getInstance().draw.drawString("-> That cannot be undone unless ", this.l / 2 - 110, this.m / 4 + i);i += 10;
          LabyMod.getInstance().draw.drawString("" + Color.cl("e") + this.e.b() + Color.cl("f") + " moves their", this.l / 2 - 95, this.m / 4 + i);i += 10;
          LabyMod.getInstance().draw.drawString("cape back to your account.", this.l / 2 - 95, this.m / 4 + i);i += 10;
        }
      }
    }
    this.a.m = info;
    this.b.m = info;
    this.c.m = info;
    this.d.m = info;
    if (info)
    {
      LabyMod.getInstance().draw.drawString("Priority:", this.l / 2 - 110, this.m / 2 - 40 - 20);
      LabyMod.getInstance().draw.drawString("My cape:", this.l / 2 - 110, this.m / 2 + 0 - 20);
      if (this.j.h != null) {
        drawEntityOnScreen(this.l / 2 + 40, this.m / 2 + 80, 30, (this.l / 2 + 35 - mouseX) * -1.0F, this.m / 2 - 20 - mouseY, this.j.h);
      }
    }
    super.a(mouseX, mouseY, partialTicks);
    LabyMod.getInstance().overlay(mouseX, mouseY);
  }
  
  private String getLoading()
  {
    String m = "";
    int i = (int)(System.currentTimeMillis() / 100L % 3L);
    switch (i)
    {
    case 0: 
      m = "\\";
      break;
    case 1: 
      m = "-";
      break;
    case 2: 
      m = "/";
      break;
    case 3: 
      m = "|";
    }
    return m;
  }
  
  public static void drawEntityOnScreen(int p_147046_0_, int p_147046_1_, int p_147046_2_, float p_147046_3_, float p_147046_4_, pr p_147046_5_)
  {
    bfl.g();
    bfl.E();
    bfl.b(p_147046_0_, p_147046_1_, 50.0F);
    bfl.a(-p_147046_2_ - 30.0F, p_147046_2_ + 30.0F, p_147046_2_);
    bfl.b(180.0F, 0.0F, 0.0F, 1.0F);
    float var6 = p_147046_5_.aI;
    float var7 = p_147046_5_.y;
    float var8 = p_147046_5_.z;
    float var9 = p_147046_5_.aL;
    float var10 = p_147046_5_.aK;
    bfl.b(135.0F, 0.0F, 1.0F, 0.0F);
    avc.b();
    bfl.b(45.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(-(float)Math.atan(p_147046_4_ / 40.0F) * 20.0F, 1.0F, 0.0F, 0.0F);
    p_147046_5_.aI = ((float)Math.atan(p_147046_3_ / 40.0F) * 20.0F);
    p_147046_5_.y = ((float)Math.atan(p_147046_3_ / 40.0F) * 40.0F);
    p_147046_5_.z = (-(float)Math.atan(p_147046_4_ / 40.0F) * 20.0F);
    p_147046_5_.aK = p_147046_5_.y;
    p_147046_5_.aL = p_147046_5_.y;
    bfl.b(0.0F, 0.0F, 0.0F);
    biu var11 = ave.A().af();
    var11.a(180.0F);
    var11.a(false);
    var11.a(p_147046_5_, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
    var11.a(true);
    p_147046_5_.aI = var6;
    p_147046_5_.y = var7;
    p_147046_5_.z = var8;
    p_147046_5_.aL = var9;
    p_147046_5_.aK = var10;
    bfl.F();
    avc.a();
    bfl.C();
    bfl.g(bqs.r);
    bfl.x();
    bfl.g(bqs.q);
  }
}
