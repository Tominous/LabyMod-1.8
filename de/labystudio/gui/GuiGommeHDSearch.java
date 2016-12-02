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
    draw = getInstancedraw;
    n.clear();
    boolean var2 = true;
    
    buttonClear = new avs(0, l / 2 + 81, m / 2 - 53, 20, 20, Color.c + "4" + "X");
    n.add(buttonClear);
    
    field_146302_g = new avw(2, draw.fontRenderer, l / 2 - 99, m / 2 - 53, 178, 20);
    field_146302_g.b(true);
    field_146302_g.a(GommeHDSign.search);
    field_146302_g.f(400);
    buttonClear.l = ((field_146302_g.b().length() > 0) && (field_146302_g.b().split(":").length > 0));
    
    field_146302_g2 = new avw(2, draw.fontRenderer, l / 2 + 10, m / 2 - 12, 90, 20);
    field_146302_g2.a(GommeHDSign.partySize + "");
    field_146302_g2.f(2);
    
    field_146302_g3 = new avw(8, draw.fontRenderer, l / 2 + 10, m / 2 + 29, 90, 20);
    field_146302_g3.a(GommeHDSign.blacklist + "");
    field_146302_g3.f(400);
    
    gommeSeachAllowedButton = new avs(1, l / 2 - 100, m / 2 - 12, 90, 20, getSymbol(GommeHDSign.allowed));
    n.add(gommeSeachAllowedButton);
    
    gommeAutoJoinButton = new avs(2, l / 2 - 100, m / 2 + 28, 90, 20, getSymbol(GommeHDSign.autoJoin));
    n.add(gommeAutoJoinButton);
    
    gommeSoundButton = new avs(3, l / 2 - 100, m / 2 + 65, 90, 20, getSymbol(GommeHDSign.sound));
    n.add(gommeSoundButton);
    
    gommeNightMode = new avs(4, l / 2 + 9, m / 2 + 65, 93, 20, getSymbol(GommeHDSign.nightMode));
    n.add(gommeNightMode);
    
    avs b = new avs(-1, l - 53, m - 23, 50, 20, "Search");
    l = false;
    n.add(b);
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
    switch (k)
    {
    case 0: 
      field_146302_g.a("");
      buttonClear.l = false;
      break;
    case 1: 
      GommeHDSign.allowed = !GommeHDSign.allowed;
      if (!GommeHDSign.allowed)
      {
        GommeHDSign.autoJoin = false;
        GommeHDSign.sound = false;
      }
      j = getSymbol(GommeHDSign.allowed);
      gommeAutoJoinButton.j = getSymbol(GommeHDSign.autoJoin);
      
      j = getSymbol(GommeHDSign.allowed);
      gommeSoundButton.j = getSymbol(GommeHDSign.sound);
      break;
    case 2: 
      GommeHDSign.autoJoin = !GommeHDSign.autoJoin;
      j = getSymbol(GommeHDSign.autoJoin);
      break;
    case 3: 
      GommeHDSign.sound = !GommeHDSign.sound;
      j = getSymbol(GommeHDSign.sound);
      break;
    case 4: 
      GommeHDSign.nightMode = !GommeHDSign.nightMode;
      j = getSymbol(GommeHDSign.nightMode);
    }
    save();
  }
  
  public void back()
  {
    save();
    if (LabyMod.getInstance().isInGame()) {
      j.a(new axp());
    } else {
      j.a(new azh(new aya()));
    }
  }
  
  public void save()
  {
    GommeHDSign.search = field_146302_g.b();
    GommeHDSign.blacklist = field_146302_g3.b();
    if (!field_146302_g2.b().isEmpty())
    {
      if (isNumeric(field_146302_g2.b())) {
        GommeHDSign.partySize = Integer.parseInt(field_146302_g2.b());
      } else {
        field_146302_g2.a("0");
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
    if (field_146302_g.a(typedChar, keyCode))
    {
      buttonClear.l = ((field_146302_g.b().length() > 0) && (field_146302_g.b().split(":").length > 0));
      save();
    }
    if (field_146302_g3.a(typedChar, keyCode)) {
      save();
    }
    if ((isNumeric(typedChar + "")) || (keyCode == 14))
    {
      if (field_146302_g2.a(typedChar, keyCode)) {
        save();
      }
    }
    else if (keyCode == 1) {
      j.a(null);
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    field_146302_g.a(mouseX, mouseY, mouseButton);
    field_146302_g2.a(mouseX, mouseY, mouseButton);
    field_146302_g3.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    
    gommeAutoJoinButton.l = GommeHDSign.allowed;
    gommeSoundButton.l = GommeHDSign.allowed;
    
    draw.drawCenteredString("" + Color.c + "fGommeHD Map Search", l / 2, m / 2 - 70);
    draw.drawString("" + Color.c + "fColored Signs:", l / 2 - 99, m / 2 - 24);
    draw.drawString("" + Color.c + "fParty size:", l / 2 + 10, m / 2 - 24);
    
    draw.drawString("" + Color.c + "fAutojoin:", l / 2 - 99, m / 2 + 17);
    draw.drawString("" + Color.c + "fBlacklist:", l / 2 + 10, m / 2 + 17);
    
    draw.drawString("" + Color.c + "fSounds:", l / 2 - 99, m / 2 + 55);
    
    draw.drawString("" + Color.c + "fNightmode:", l / 2 + 10, m / 2 + 55);
    
    draw.drawBox(l / 2 + 80, m / 2 - 54, l / 2 - 99 + 201, m / 2 - 53 + 21);
    
    field_146302_g.g();
    field_146302_g2.g();
    field_146302_g3.g();
    if ((!GommeHDSign.search.isEmpty()) && 
      (GommeHDSign.search.toLowerCase().contains(GommeHDSign.blacklist.toLowerCase())))
    {
      if (GommeHDSign.blacklist.length() < 13) {
        draw.drawString(Color.c + "c" + GommeHDSign.blacklist, l / 2 + 14, m / 2 + 35);
      }
      if (GommeHDSign.search.length() < 22) {
        draw.drawString(GommeHDSign.search.replace(GommeHDSign.blacklist, Color.c + "c" + GommeHDSign.blacklist + Color.c + "f"), l / 2 - 95, m / 2 - 47);
      }
    }
    super.a(mouseX, mouseY, partialTicks);
  }
}
