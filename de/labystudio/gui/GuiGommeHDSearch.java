package de.labystudio.gui;

import ave;
import avs;
import avw;
import axp;
import axu;
import aya;
import azh;
import de.labystudio.gommehd.GommeHDSign;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import java.io.IOException;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class GuiGommeHDSearch
  extends axu
{
  private DrawUtils draw;
  private avw field_146302_g;
  private avw field_146302_g2;
  private avw field_146302_g3;
  avs gommeSeachAllowedButton;
  avs gommeAutoJoinButton;
  avs gommeSoundButton;
  avs gommeNightMode;
  avs buttonClear;
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    this.draw = LabyMod.getInstance().draw;
    this.n.clear();
    boolean var2 = true;
    
    this.buttonClear = new avs(0, this.l / 2 + 81, this.m / 2 - 53, 20, 20, Color.c + "4" + "X");
    this.n.add(this.buttonClear);
    
    this.field_146302_g = new avw(2, this.draw.fontRenderer, this.l / 2 - 99, this.m / 2 - 53, 178, 20);
    this.field_146302_g.b(true);
    this.field_146302_g.a(GommeHDSign.search);
    this.field_146302_g.f(400);
    this.buttonClear.l = ((this.field_146302_g.b().length() > 0) && (this.field_146302_g.b().split(":").length > 0));
    
    this.field_146302_g2 = new avw(2, this.draw.fontRenderer, this.l / 2 + 10, this.m / 2 - 12, 90, 20);
    this.field_146302_g2.a(GommeHDSign.partySize + "");
    this.field_146302_g2.f(2);
    
    this.field_146302_g3 = new avw(8, this.draw.fontRenderer, this.l / 2 + 10, this.m / 2 + 29, 90, 20);
    this.field_146302_g3.a(GommeHDSign.blacklist + "");
    this.field_146302_g3.f(400);
    
    this.gommeSeachAllowedButton = new avs(1, this.l / 2 - 100, this.m / 2 - 12, 90, 20, getSymbol(GommeHDSign.allowed));
    this.n.add(this.gommeSeachAllowedButton);
    
    this.gommeAutoJoinButton = new avs(2, this.l / 2 - 100, this.m / 2 + 28, 90, 20, getSymbol(GommeHDSign.autoJoin));
    this.n.add(this.gommeAutoJoinButton);
    
    this.gommeSoundButton = new avs(3, this.l / 2 - 100, this.m / 2 + 65, 90, 20, getSymbol(GommeHDSign.sound));
    this.n.add(this.gommeSoundButton);
    
    this.gommeNightMode = new avs(4, this.l / 2 + 9, this.m / 2 + 65, 93, 20, getSymbol(GommeHDSign.nightMode));
    this.n.add(this.gommeNightMode);
    
    avs b = new avs(-1, this.l - 53, this.m - 23, 50, 20, "Search");
    b.l = false;
    this.n.add(b);
  }
  
  public String getSymbol(boolean b)
  {
    if (b) {
      return Color.c + "a✔ Enabled";
    }
    return Color.c + "4✖ Disabled";
  }
  
  protected void a(avs button)
  {
    switch (button.k)
    {
    case 0: 
      this.field_146302_g.a("");
      this.buttonClear.l = false;
      break;
    case 1: 
      GommeHDSign.allowed = !GommeHDSign.allowed;
      if (!GommeHDSign.allowed)
      {
        GommeHDSign.autoJoin = false;
        GommeHDSign.sound = false;
      }
      button.j = getSymbol(GommeHDSign.allowed);
      this.gommeAutoJoinButton.j = getSymbol(GommeHDSign.autoJoin);
      
      button.j = getSymbol(GommeHDSign.allowed);
      this.gommeSoundButton.j = getSymbol(GommeHDSign.sound);
      break;
    case 2: 
      GommeHDSign.autoJoin = !GommeHDSign.autoJoin;
      button.j = getSymbol(GommeHDSign.autoJoin);
      break;
    case 3: 
      GommeHDSign.sound = !GommeHDSign.sound;
      button.j = getSymbol(GommeHDSign.sound);
      break;
    case 4: 
      GommeHDSign.nightMode = !GommeHDSign.nightMode;
      button.j = getSymbol(GommeHDSign.nightMode);
    }
    save();
  }
  
  public void back()
  {
    save();
    if (LabyMod.getInstance().isInGame()) {
      this.j.a(new axp());
    } else {
      this.j.a(new azh(new aya()));
    }
  }
  
  public void save()
  {
    GommeHDSign.search = this.field_146302_g.b();
    GommeHDSign.blacklist = this.field_146302_g3.b();
    if (!this.field_146302_g2.b().isEmpty())
    {
      if (isNumeric(this.field_146302_g2.b())) {
        GommeHDSign.partySize = Integer.parseInt(this.field_146302_g2.b());
      } else {
        this.field_146302_g2.a("0");
      }
    }
    else {
      GommeHDSign.partySize = 0;
    }
  }
  
  public static boolean isNumeric(String str)
  {
    for (char c : str.toCharArray()) {
      if (!Character.isDigit(c)) {
        return false;
      }
    }
    return true;
  }
  
  protected void a(char typedChar, int keyCode)
  {
    if (this.field_146302_g.a(typedChar, keyCode))
    {
      this.buttonClear.l = ((this.field_146302_g.b().length() > 0) && (this.field_146302_g.b().split(":").length > 0));
      save();
    }
    if (this.field_146302_g3.a(typedChar, keyCode)) {
      save();
    }
    if ((isNumeric(typedChar + "")) || (keyCode == 14))
    {
      if (this.field_146302_g2.a(typedChar, keyCode)) {
        save();
      }
    }
    else if (keyCode == 1) {
      this.j.a(null);
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    this.field_146302_g.a(mouseX, mouseY, mouseButton);
    this.field_146302_g2.a(mouseX, mouseY, mouseButton);
    this.field_146302_g3.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    
    this.gommeAutoJoinButton.l = GommeHDSign.allowed;
    this.gommeSoundButton.l = GommeHDSign.allowed;
    
    this.draw.drawCenteredString("" + Color.c + "fGommeHD Map Search", this.l / 2, this.m / 2 - 70);
    this.draw.drawString("" + Color.c + "fColored Signs:", this.l / 2 - 99, this.m / 2 - 24);
    this.draw.drawString("" + Color.c + "fParty size:", this.l / 2 + 10, this.m / 2 - 24);
    
    this.draw.drawString("" + Color.c + "fAutojoin:", this.l / 2 - 99, this.m / 2 + 17);
    this.draw.drawString("" + Color.c + "fBlacklist:", this.l / 2 + 10, this.m / 2 + 17);
    
    this.draw.drawString("" + Color.c + "fSounds:", this.l / 2 - 99, this.m / 2 + 55);
    
    this.draw.drawString("" + Color.c + "fNightmode:", this.l / 2 + 10, this.m / 2 + 55);
    
    this.draw.drawBox(this.l / 2 + 80, this.m / 2 - 54, this.l / 2 - 99 + 201, this.m / 2 - 53 + 21);
    
    this.field_146302_g.g();
    this.field_146302_g2.g();
    this.field_146302_g3.g();
    if ((!GommeHDSign.search.isEmpty()) && 
      (GommeHDSign.search.toLowerCase().contains(GommeHDSign.blacklist.toLowerCase())))
    {
      if (GommeHDSign.blacklist.length() < 13) {
        this.draw.drawString(Color.c + "c" + GommeHDSign.blacklist, this.l / 2 + 14, this.m / 2 + 35);
      }
      if (GommeHDSign.search.length() < 22) {
        this.draw.drawString(GommeHDSign.search.replace(GommeHDSign.blacklist, Color.c + "c" + GommeHDSign.blacklist + Color.c + "f"), this.l / 2 - 95, this.m / 2 - 47);
      }
    }
    super.a(mouseX, mouseY, partialTicks);
  }
}
