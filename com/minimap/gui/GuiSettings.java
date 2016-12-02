package com.minimap.gui;

import ave;
import avh;
import avr;
import avs;
import axu;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.settings.ModOptions;
import com.minimap.settings.ModSettings;
import de.labystudio.modapi.ModAPI;
import java.io.IOException;
import java.util.List;

public class GuiSettings
  extends axu
{
  protected String screenTitle;
  protected ModSettings guiModSettings;
  protected ModOptions[] options;
  
  public GuiSettings(ModSettings par2ModSettings)
  {
    guiModSettings = par2ModSettings;
  }
  
  public void b()
  {
    n.clear();
    n.add(new avs(200, l / 2 - 100, m / 6 + 168, bnq.a("gui.xaero_back", new Object[0])));
    int var8 = 0;
    if (options == null) {
      return;
    }
    int var2 = options.length;
    for (int var3 = 0; var3 < var2; var3++)
    {
      ModOptions option = options[var3];
      if (!option.getEnumFloat()) {
        n.add(new MySmallButton(option.returnEnumOrdinal(), l / 2 - 155 + var8 % 2 * 160, m / 7 + 24 * (var8 >> 1), option, guiModSettings.getKeyBinding(option)));
      } else {
        n.add(new MyOptionSlider(option.returnEnumOrdinal(), l / 2 - 155 + var8 % 2 * 160, m / 7 + 24 * (var8 >> 1), option));
      }
      var8++;
    }
  }
  
  protected void a(avs par1GuiButton)
  {
    if (l)
    {
      int var2 = j.t.aK;
      try
      {
        if ((par1GuiButton instanceof MySmallButton)) {
          if (((MySmallButton)par1GuiButton).returnModOptions() == ModOptions.EDIT) {
            j.a(new GuiEditMode(this, XaeroMinimap.getSettings()));
          } else if (((MySmallButton)par1GuiButton).returnModOptions() == ModOptions.RESET) {
            j.a(new GuiReset(ModAPI.getLastScreen()));
          } else if (((MySmallButton)par1GuiButton).returnModOptions() == ModOptions.DOTS) {
            j.a(new GuiDotColors(this, XaeroMinimap.getSettings()));
          }
        }
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
      if ((k < 100) && ((par1GuiButton instanceof MySmallButton)))
      {
        try
        {
          guiModSettings.setOptionValue(((MySmallButton)par1GuiButton).returnModOptions(), 1);
        }
        catch (IOException e2)
        {
          e2.printStackTrace();
        }
        j = guiModSettings.getKeyBinding(ModOptions.getModOptions(k));
      }
      if (k == 200)
      {
        try
        {
          guiModSettings.saveSettings();
        }
        catch (IOException e2)
        {
          e2.printStackTrace();
        }
        j.a(ModAPI.getLastScreen());
      }
      if (j.t.aK != var2)
      {
        avr res = new avr(j);
        int var3 = res.a();
        int var4 = res.b();
        a(j, var3, var4);
      }
    }
  }
  
  public void a(int par1, int par2, float par3)
  {
    c();
    a(q, screenTitle, l / 2, 20, 16777215);
    super.a(par1, par2, par3);
  }
}
