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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GuiDotColors
  extends axu
{
  private axu parentGuiScreen;
  protected String screenTitle;
  private ModSettings guiModSettings;
  public ArrayList<GuiDropDown> dropDowns;
  private String[] colorOptions;
  private boolean dropped;
  
  public GuiDotColors(axu par1GuiScreen, ModSettings par2ModSettings)
  {
    dropDowns = new ArrayList();
    dropped = false;
    parentGuiScreen = par1GuiScreen;
    guiModSettings = par2ModSettings;
  }
  
  public void b()
  {
    screenTitle = bnq.a("gui.xaero_entity_colours", new Object[0]);
    n.clear();
    n.add(new MySmallButton(200, l / 2 - 155, m / 6 + 168, bnq.a("gui.xaero_confirm", new Object[0])));
    n.add(new MySmallButton(201, l / 2 + 5, m / 6 + 168, bnq.a("gui.xaero_cancel", new Object[0])));
    dropDowns.clear();
    colorOptions = createColorOptions();
    String[] playerOptions = new String[colorOptions.length + 1];
    for (int i = 0; i < colorOptions.length; i++) {
      playerOptions[i] = colorOptions[i];
    }
    playerOptions[colorOptions.length] = "gui.xaero_team_colours";
    dropDowns.add(new GuiDropDown(colorOptions, l / 2 - 60, m / 7 + 50, 120, Integer.valueOf(getSettingsmobsColor)));
    dropDowns.add(new GuiDropDown(colorOptions, l / 2 - 60, m / 7 + 80, 120, Integer.valueOf(getSettingshostileColor)));
    dropDowns.add(new GuiDropDown(colorOptions, l / 2 - 60, m / 7 + 110, 120, Integer.valueOf(getSettingsitemsColor)));
    dropDowns.add(new GuiDropDown(colorOptions, l / 2 - 60, m / 7 + 140, 120, Integer.valueOf(getSettingsotherColor)));
    dropDowns.add(new GuiDropDown(playerOptions, l / 2 - 60, m / 7 + 20, 120, Integer.valueOf(getSettingsplayersColor != -1 ? getSettingsplayersColor : colorOptions.length)));
  }
  
  public String[] createColorOptions()
  {
    String[] options = new String[ModSettings.ENCHANT_COLOR_NAMES.length];
    for (int i = 0; i < options.length; i++) {
      if (i == 0) {
        options[i] = bnq.a(ModSettings.ENCHANT_COLOR_NAMES[i], new Object[0]);
      } else {
        options[i] = ("§" + ModSettings.ENCHANT_COLORS[i] + bnq.a(ModSettings.ENCHANT_COLOR_NAMES[i], new Object[0]));
      }
    }
    return options;
  }
  
  protected void a(avs par1GuiButton)
  {
    if (l)
    {
      int var2 = j.t.aK;
      if ((k < 100) && ((par1GuiButton instanceof MySmallButton)))
      {
        try
        {
          guiModSettings.setOptionValue(((MySmallButton)par1GuiButton).returnModOptions(), 1);
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
        j = guiModSettings.getKeyBinding(ModOptions.getModOptions(k));
      }
      if (k == 200)
      {
        getSettingsmobsColor = dropDowns.get(0)).selected;
        getSettingshostileColor = dropDowns.get(1)).selected;
        getSettingsitemsColor = dropDowns.get(2)).selected;
        getSettingsotherColor = dropDowns.get(3)).selected;
        int playerOption = dropDowns.get(4)).selected;
        getSettingsplayersColor = (playerOption < colorOptions.length ? playerOption : -1);
        try
        {
          guiModSettings.saveSettings();
        }
        catch (IOException e2)
        {
          e2.printStackTrace();
        }
        j.a(parentGuiScreen);
      }
      if (k == 201) {
        j.a(parentGuiScreen);
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
  
  protected void a(int par1, int par2, int par3)
    throws IOException
  {
    for (GuiDropDown d : dropDowns)
    {
      if ((!closed) && (d.onDropDown(par1, par2)))
      {
        d.mouseClicked(par1, par2, par3);
        return;
      }
      closed = true;
    }
    for (GuiDropDown d : dropDowns)
    {
      if (d.onDropDown(par1, par2))
      {
        d.mouseClicked(par1, par2, par3);
        return;
      }
      closed = true;
    }
    super.a(par1, par2, par3);
  }
  
  public void a(int par1, int par2, float par3)
  {
    c();
    a(q, screenTitle, l / 2, 20, 16777215);
    a(q, bnq.a("gui.xaero_players", new Object[0]) + ":", l / 2, m / 7 + 10, 16777215);
    a(q, bnq.a("gui.xaero_mobs", new Object[0]) + ":", l / 2, m / 7 + 40, 16777215);
    a(q, bnq.a("gui.xaero_hostile", new Object[0]) + ":", l / 2, m / 7 + 70, 16777215);
    a(q, bnq.a("gui.xaero_items", new Object[0]) + ":", l / 2, m / 7 + 100, 16777215);
    a(q, bnq.a("gui.xaero_other", new Object[0]) + ":", l / 2, m / 7 + 130, 16777215);
    if (dropped) {
      super.a(0, 0, par3);
    } else {
      super.a(par1, par2, par3);
    }
    dropped = false;
    for (int k = 0; k < dropDowns.size(); k++) {
      if (dropDowns.get(k)).closed) {
        ((GuiDropDown)dropDowns.get(k)).drawButton(par1, par2);
      } else {
        dropped = true;
      }
    }
    for (int k = 0; k < dropDowns.size(); k++) {
      if (!dropDowns.get(k)).closed) {
        ((GuiDropDown)dropDowns.get(k)).drawButton(par1, par2);
      }
    }
  }
}
