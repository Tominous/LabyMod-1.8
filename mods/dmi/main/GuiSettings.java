package mods.dmi.main;

import ave;
import avs;
import axu;
import de.labystudio.labymod.LabyMod;
import de.labystudio.modapi.ModAPI;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import java.io.IOException;
import java.util.List;

public class GuiSettings
  extends axu
{
  avs a;
  avs b;
  SliderDMI slider;
  
  public void b()
  {
    n.add(new avs(0, l / 2 - 100, m / 6 + 150, "Done"));
    n.add(a = new avs(1, l / 2 - 100, m / 6 + 30, ""));
    n.add(b = new avs(2, l / 2 - 100, m / 6 + 70, ""));
    
    n.add(slider = new SliderDMI(3, l / 2 - 100, m / 6 + 110, 197));
    
    refresh();
  }
  
  public void refresh()
  {
    String s = Color.cl("a") + "Enabled";
    if (!settingsenabled) {
      s = Color.cl("c") + "Disabled";
    }
    a.j = s;
    
    s = "Hearts";
    if (!settingsDMILayout) {
      s = "Number";
    }
    b.j = s;
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (k == 0)
    {
      Settings.save();
      j.a(ModAPI.getLastScreen());
    }
    if (k == 1)
    {
      settingsenabled = (!settingsenabled);
      refresh();
    }
    if (k == 2)
    {
      settingsDMILayout = (!settingsDMILayout);
      refresh();
    }
    super.a(button);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (keyCode == 1)
    {
      Settings.save();
      j.a(ModAPI.getLastScreen());
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    
    getInstancedraw.drawString("Damage Indicator:", l / 2 - 100, m / 6 + 20);
    getInstancedraw.drawString("Layout:", l / 2 - 100, m / 6 + 60);
    getInstancedraw.drawString("Scale:", l / 2 - 100, m / 6 + 100);
    
    super.a(mouseX, mouseY, partialTicks);
  }
}
