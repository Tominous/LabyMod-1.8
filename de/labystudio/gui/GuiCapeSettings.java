package de.labystudio.gui;

import ave;
import avh;
import avs;
import axu;
import bet;
import bnq;
import de.labystudio.capes.CapeCallback;
import de.labystudio.capes.CapeManager;
import de.labystudio.capes.CapeMover;
import de.labystudio.capes.CapeUploader;
import de.labystudio.capes.EnumCapePriority;
import de.labystudio.cosmetic.CosmeticManager;
import de.labystudio.downloader.ModInfoDownloader;
import de.labystudio.downloader.UserCapesDownloader;
import de.labystudio.downloader.UserCosmeticsDownloader;
import de.labystudio.gui.extras.ModGuiTextField;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.lwjgl.input.Keyboard;
import wo;

public class GuiCapeSettings
  extends axu
{
  private axu lastScreen;
  String error = "";
  private static long cdPriority = 0L;
  private static long cdRefresh = 0L;
  boolean hasCape = false;
  boolean moveCape = false;
  boolean accept = false;
  EnumCapePriority capeType;
  avs a;
  avs b;
  avs c;
  avs d;
  ModGuiTextField e;
  avs f;
  avs g;
  avs h;
  avs j;
  
  public GuiCapeSettings(axu lastScreen)
  {
    Keyboard.enableRepeatEvents(true);
    this.lastScreen = lastScreen;
    checkCape();
  }
  
  public void checkCape()
  {
    hasCape = ((ave.A() != null) && (Ah != null) && ((Ah instanceof bet)) && (Ah.capeType != null));
    if (hasCape) {
      capeType = Ah.capeType;
    }
  }
  
  public void b()
  {
    accept = false;
    moveCape = false;
    n.clear();
    
    n.add(a = new avs(1, l / 2 - 110, m / 2 - 28 - 20, 80, 20, ""));
    n.add(b = new avs(2, l / 2 - 110, m / 2 + 11 - 20, 80, 20, ""));
    n.add(c = new avs(3, l / 2 - 110, m / 2 + 35 - 20, 80, 20, ""));
    n.add(d = new avs(4, l / 2 - 110, m / 2 + 59 - 20, 80, 20, ""));
    n.add(h = new avs(7, 2, m - 22, 60, 20, ""));
    e = new ModGuiTextField(0, jdField_j_of_type_Ave.k, l / 2 - 100, m / 4 - 30, 200, 20);
    e.setBlacklistWord(" ");
    n.add(f = new avs(5, l / 2 - 100, m / 4 - 5, 200, 20, ""));
    n.add(g = new avs(6, 2, 2, 40, 20, ""));
    
    n.add(jdField_j_of_type_Avs = new avs(9, l / 2 - 110, m / 2 + 82 - 20, 80, 20, ""));
    n.add(new avs(200, l / 2 - 100, m / 2 + 90, bnq.a("gui.done", new Object[0])));
    
    refreshButtons();
  }
  
  public void refreshButtons()
  {
    if (settingscapePriority.equals("of")) {
      a.j = "OptiFine";
    } else if (settingscapePriority.equals("original")) {
      a.j = "Original";
    } else {
      a.j = "LabyMod";
    }
    b.j = getStatus("Cape", wo.a);
    d.j = "Move";
    if (accept) {
      f.j = (Color.cl("c") + Color.cl("l") + "Press again to accept");
    } else {
      f.j = "Move";
    }
    g.j = (Color.cl("6") + "Donate");
    h.j = "Refresh";
    if (settingscapes) {
      jdField_j_of_type_Avs.j = ("Capes: " + Color.cl("a") + "ON");
    } else {
      jdField_j_of_type_Avs.j = ("Capes: " + Color.cl("c") + "OFF");
    }
  }
  
  public String getStatus(String name, wo part)
  {
    String var2;
    String var2;
    if (jdField_j_of_type_Ave.t.d().contains(part)) {
      var2 = Color.cl("a") + "SHOWN";
    } else {
      var2 = Color.cl("C") + "HIDDEN";
    }
    if (!hasCape) {
      var2 = "NO CAPE";
    }
    return var2 + Color.cl("f") + "";
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (l) {
      if (k == 1)
      {
        if (settingscapePriority.equals("of")) {
          settingscapePriority = "labymod";
        } else if (settingscapePriority.equals("labymod")) {
          settingscapePriority = "original";
        } else {
          settingscapePriority = "of";
        }
        cdPriority = System.currentTimeMillis();
        LabyMod.getInstance().getCapeManager().refresh();
        refreshButtons();
        ConfigManager.save();
      }
      else if (k == 2)
      {
        jdField_j_of_type_Ave.t.a(wo.a);
        refreshButtons();
      }
      else if (k == 3)
      {
        new CapeUploader(new CapeCallback()
        {
          public void failed(String error)
          {
            GuiCapeSettings.this.error = error;
          }
          
          public void done()
          {
            error = (Color.cl("a") + "Cape uploaded!");
          }
        })
        
          .start();
      }
      else if (k == 4)
      {
        moveCape = true;
        refreshButtons();
      }
      else if (k == 5)
      {
        if ((!accept) && (e.b().length() != 0))
        {
          accept = true;
          refreshButtons();
        }
        else
        {
          l = false;
          new CapeMover(e.b(), new CapeCallback()
          {
            public void done()
            {
              LabyMod.getInstance().getCapeManager().refresh();
              checkCape();
              b();
            }
            
            public void failed(String error)
            {
              b();
              GuiCapeSettings.this.error = error;
            }
          })
          
            .start();
        }
      }
      else if (k == 6)
      {
        LabyMod.getInstance().openWebpage("https://LabyMod.net/donate");
      }
      else if (k == 200)
      {
        jdField_j_of_type_Ave.t.b();
        jdField_j_of_type_Ave.a(lastScreen);
      }
      else if (k == 7)
      {
        cdRefresh = System.currentTimeMillis();
        LabyMod.getInstance().getCapeManager().refresh();
        LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics().clear();
        new ModInfoDownloader();
        new UserCosmeticsDownloader();
        new UserCapesDownloader();
        refreshButtons();
      }
      else if (k == 9)
      {
        settingscapes = (!settingscapes);
        refreshButtons();
      }
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (keyCode == 1)
    {
      jdField_j_of_type_Ave.t.b();
      jdField_j_of_type_Ave.a(lastScreen);
    }
    if ((moveCape) && 
      (e.a(typedChar, keyCode)) && 
      (e.b().length() > 16)) {
      e.a(e.b().substring(0, 16));
    }
    super.a(typedChar, keyCode);
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (moveCape) {
      e.a(mouseX, mouseY, mouseButton);
    }
    super.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    if (!LabyMod.getInstance().isInGame())
    {
      jdField_j_of_type_Ave.a(lastScreen);
      return;
    }
    c();
    a(q, "Cape Settings", this.l / 2, 20, 16777215);
    if (!error.isEmpty())
    {
      int l = getInstancedraw.getStringWidth(error) / 2 + 20;
      LabyMod.getInstance();LabyMod.a(this.l / 2 - l, 2, this.l / 2 + l, 16, Integer.MIN_VALUE);
      if (error.contains("Cape uploaded")) {
        getInstancedraw.drawCenteredString(Color.cl("a") + error, this.l / 2, 5);
      } else {
        getInstancedraw.drawCenteredString(Color.cl("4") + "Error: " + Color.cl("c") + error, this.l / 2, 5);
      }
    }
    boolean z = a.l;
    a.l = (cdPriority + 2000L < System.currentTimeMillis());
    if ((a.l != z) && (a.l)) {
      refreshButtons();
    }
    if (!a.l) {
      a.j = ("Switch.. " + getLoading());
    }
    boolean t = h.l;
    h.l = (cdRefresh + 10000L < System.currentTimeMillis());
    if ((h.l != t) && (h.l)) {
      refreshButtons();
    }
    if (!h.l) {
      h.j = ("Refresh.. " + getLoading());
    }
    c.l = ((!CapeUploader.openUpload) && (!CapeUploader.upload));
    if (CapeUploader.upload) {
      c.j = ("Upload.. " + getLoading());
    } else {
      c.j = "Upload..";
    }
    if (CapeMover.moving) {
      f.j = ("Moving.. " + getLoading());
    }
    if (jdField_j_of_type_Ave.h == null)
    {
      DrawUtils.a(this.l / 2 - 20, m / 2 - 30, this.l / 2 + 100, m / 2 + 78, 1129010000);
      getInstancedraw.drawCenteredString("Preview not available.", this.l / 2 + 40, m / 2 + 17);
      getInstancedraw.drawCenteredString(Color.cl("c") + "You are not ingame!", this.l / 2 + 40, m / 2 + 27);
    }
    d.l = ((!moveCape) && (!CapeMover.moving));
    f.l = ((!e.b().isEmpty()) && (!CapeMover.moving));
    f.m = moveCape;
    
    boolean old = hasCape;
    checkCape();
    if (old != hasCape) {
      b.j = getStatus("Cape", wo.a);
    }
    if (!hasCape)
    {
      b.l = false;
      c.l = false;
      d.l = false;
      moveCape = false;
    }
    else if ((capeType != null) && (capeType != EnumCapePriority.LABYMOD))
    {
      c.l = false;
      d.l = false;
      moveCape = false;
    }
    else
    {
      c.l = true;
      d.l = true;
    }
    g.m = (!hasCape);
    
    boolean info = (e.b().isEmpty()) && (!e.m());
    if (moveCape)
    {
      e.g();
      if (info)
      {
        getInstancedraw.drawString(Color.cl("7") + "Enter the name of the new owner..", e.a + 5, e.f + 6);
      }
      else
      {
        for (int i = 0; i <= 2; i++)
        {
          LabyMod.getInstance();LabyMod.a(this.l / 2 - 120, m / 4 + 20, this.l / 2 + 120, m / 2 + 85, Integer.MIN_VALUE);
        }
        int i = 25;
        getInstancedraw.drawCenteredString(Color.cl("4") + "Caution!", this.l / 2, m / 4 + i);i += 10;
        getInstancedraw.drawCenteredString(Color.cl("c") + "Yow won't be the owner of your cape", this.l / 2, m / 4 + i);i += 10;
        getInstancedraw.drawCenteredString(Color.cl("c") + "after moving it to another account.", this.l / 2, m / 4 + i);i += 20;
        if (e.b().isEmpty())
        {
          getInstancedraw.drawString("-> The new owner of the cape will", this.l / 2 - 110, m / 4 + i);i += 10;
          getInstancedraw.drawString("then be changed", this.l / 2 - 95, m / 4 + i);i += 20;
          getInstancedraw.drawString("-> That cannot be undone unless ", this.l / 2 - 110, m / 4 + i);i += 10;
          getInstancedraw.drawString("the new owner moves their", this.l / 2 - 95, m / 4 + i);i += 10;
          getInstancedraw.drawString("cape back to your account.", this.l / 2 - 95, m / 4 + i);i += 10;
        }
        else
        {
          getInstancedraw.drawString("-> The new owner of the cape will", this.l / 2 - 110, m / 4 + i);i += 10;
          getInstancedraw.drawString("then be " + Color.cl("e") + e.b(), this.l / 2 - 95, m / 4 + i);i += 20;
          getInstancedraw.drawString("-> That cannot be undone unless ", this.l / 2 - 110, m / 4 + i);i += 10;
          getInstancedraw.drawString("" + Color.cl("e") + e.b() + Color.cl("f") + " moves their", this.l / 2 - 95, m / 4 + i);i += 10;
          getInstancedraw.drawString("cape back to your account.", this.l / 2 - 95, m / 4 + i);i += 10;
        }
      }
    }
    a.m = info;
    b.m = info;
    c.m = info;
    d.m = info;
    if (info)
    {
      getInstancedraw.drawString("Priority:", this.l / 2 - 110, m / 2 - 40 - 20);
      getInstancedraw.drawString("My cape:", this.l / 2 - 110, m / 2 + 0 - 20);
      if (jdField_j_of_type_Ave.h != null) {
        DrawUtils.drawEntityOnScreen(this.l / 2 + 40, m / 2 + 80, 30, (this.l / 2 + 35 - mouseX) * -1.0F, m / 2 - 20 - mouseY, 180, jdField_j_of_type_Ave.h);
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
}
