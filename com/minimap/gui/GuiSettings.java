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
    this.guiModSettings = par2ModSettings;
  }
  
  public void b()
  {
    this.n.clear();
    this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 168, bnq.a("gui.xaero_back", new Object[0])));
    int var8 = 0;
    if (this.options == null) {
      return;
    }
    int var2 = this.options.length;
    for (int var3 = 0; var3 < var2; var3++)
    {
      ModOptions option = this.options[var3];
      if (!option.getEnumFloat()) {
        this.n.add(new MySmallButton(option.returnEnumOrdinal(), this.l / 2 - 155 + var8 % 2 * 160, this.m / 7 + 24 * (var8 >> 1), option, this.guiModSettings.getKeyBinding(option)));
      } else {
        this.n.add(new MyOptionSlider(option.returnEnumOrdinal(), this.l / 2 - 155 + var8 % 2 * 160, this.m / 7 + 24 * (var8 >> 1), option));
      }
      var8++;
    }
  }
  
  protected void a(avs par1GuiButton)
  {
    if (par1GuiButton.l)
    {
      int var2 = this.j.t.aK;
      try
      {
        if ((par1GuiButton instanceof MySmallButton)) {
          if (((MySmallButton)par1GuiButton).returnModOptions() == ModOptions.EDIT) {
            this.j.a(new GuiEditMode(this, XaeroMinimap.getSettings()));
          } else if (((MySmallButton)par1GuiButton).returnModOptions() == ModOptions.RESET) {
            this.j.a(new GuiReset(ModAPI.getLastScreen()));
          } else if (((MySmallButton)par1GuiButton).returnModOptions() == ModOptions.DOTS) {
            this.j.a(new GuiDotColors(this, XaeroMinimap.getSettings()));
          }
        }
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
      if ((par1GuiButton.k < 100) && ((par1GuiButton instanceof MySmallButton)))
      {
        try
        {
          this.guiModSettings.setOptionValue(((MySmallButton)par1GuiButton).returnModOptions(), 1);
        }
        catch (IOException e2)
        {
          e2.printStackTrace();
        }
        par1GuiButton.j = this.guiModSettings.getKeyBinding(ModOptions.getModOptions(par1GuiButton.k));
      }
      if (par1GuiButton.k == 200)
      {
        try
        {
          this.guiModSettings.saveSettings();
        }
        catch (IOException e2)
        {
          e2.printStackTrace();
        }
        this.j.a(ModAPI.getLastScreen());
      }
      if (this.j.t.aK != var2)
      {
        avr res = new avr(this.j);
        int var3 = res.a();
        int var4 = res.b();
        a(this.j, var3, var4);
      }
    }
  }
  
  public void a(int par1, int par2, float par3)
  {
    c();
    a(this.q, this.screenTitle, this.l / 2, 20, 16777215);
    super.a(par1, par2, par3);
  }
}
