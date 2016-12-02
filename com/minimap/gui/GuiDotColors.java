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
    this.dropDowns = new ArrayList();
    this.dropped = false;
    this.parentGuiScreen = par1GuiScreen;
    this.guiModSettings = par2ModSettings;
  }
  
  public void b()
  {
    this.screenTitle = bnq.a("gui.xaero_entity_colours", new Object[0]);
    this.n.clear();
    this.n.add(new MySmallButton(200, this.l / 2 - 155, this.m / 6 + 168, bnq.a("gui.xaero_confirm", new Object[0])));
    this.n.add(new MySmallButton(201, this.l / 2 + 5, this.m / 6 + 168, bnq.a("gui.xaero_cancel", new Object[0])));
    this.dropDowns.clear();
    this.colorOptions = createColorOptions();
    String[] playerOptions = new String[this.colorOptions.length + 1];
    for (int i = 0; i < this.colorOptions.length; i++) {
      playerOptions[i] = this.colorOptions[i];
    }
    playerOptions[this.colorOptions.length] = "gui.xaero_team_colours";
    this.dropDowns.add(new GuiDropDown(this.colorOptions, this.l / 2 - 60, this.m / 7 + 50, 120, Integer.valueOf(XaeroMinimap.getSettings().mobsColor)));
    this.dropDowns.add(new GuiDropDown(this.colorOptions, this.l / 2 - 60, this.m / 7 + 80, 120, Integer.valueOf(XaeroMinimap.getSettings().hostileColor)));
    this.dropDowns.add(new GuiDropDown(this.colorOptions, this.l / 2 - 60, this.m / 7 + 110, 120, Integer.valueOf(XaeroMinimap.getSettings().itemsColor)));
    this.dropDowns.add(new GuiDropDown(this.colorOptions, this.l / 2 - 60, this.m / 7 + 140, 120, Integer.valueOf(XaeroMinimap.getSettings().otherColor)));
    this.dropDowns.add(new GuiDropDown(playerOptions, this.l / 2 - 60, this.m / 7 + 20, 120, Integer.valueOf(XaeroMinimap.getSettings().playersColor != -1 ? XaeroMinimap.getSettings().playersColor : this.colorOptions.length)));
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
    if (par1GuiButton.l)
    {
      int var2 = this.j.t.aK;
      if ((par1GuiButton.k < 100) && ((par1GuiButton instanceof MySmallButton)))
      {
        try
        {
          this.guiModSettings.setOptionValue(((MySmallButton)par1GuiButton).returnModOptions(), 1);
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
        par1GuiButton.j = this.guiModSettings.getKeyBinding(ModOptions.getModOptions(par1GuiButton.k));
      }
      if (par1GuiButton.k == 200)
      {
        XaeroMinimap.getSettings().mobsColor = ((GuiDropDown)this.dropDowns.get(0)).selected;
        XaeroMinimap.getSettings().hostileColor = ((GuiDropDown)this.dropDowns.get(1)).selected;
        XaeroMinimap.getSettings().itemsColor = ((GuiDropDown)this.dropDowns.get(2)).selected;
        XaeroMinimap.getSettings().otherColor = ((GuiDropDown)this.dropDowns.get(3)).selected;
        int playerOption = ((GuiDropDown)this.dropDowns.get(4)).selected;
        XaeroMinimap.getSettings().playersColor = (playerOption < this.colorOptions.length ? playerOption : -1);
        try
        {
          this.guiModSettings.saveSettings();
        }
        catch (IOException e2)
        {
          e2.printStackTrace();
        }
        this.j.a(this.parentGuiScreen);
      }
      if (par1GuiButton.k == 201) {
        this.j.a(this.parentGuiScreen);
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
  
  protected void a(int par1, int par2, int par3)
    throws IOException
  {
    for (GuiDropDown d : this.dropDowns)
    {
      if ((!d.closed) && (d.onDropDown(par1, par2)))
      {
        d.mouseClicked(par1, par2, par3);
        return;
      }
      d.closed = true;
    }
    for (GuiDropDown d : this.dropDowns)
    {
      if (d.onDropDown(par1, par2))
      {
        d.mouseClicked(par1, par2, par3);
        return;
      }
      d.closed = true;
    }
    super.a(par1, par2, par3);
  }
  
  public void a(int par1, int par2, float par3)
  {
    c();
    a(this.q, this.screenTitle, this.l / 2, 20, 16777215);
    a(this.q, bnq.a("gui.xaero_players", new Object[0]) + ":", this.l / 2, this.m / 7 + 10, 16777215);
    a(this.q, bnq.a("gui.xaero_mobs", new Object[0]) + ":", this.l / 2, this.m / 7 + 40, 16777215);
    a(this.q, bnq.a("gui.xaero_hostile", new Object[0]) + ":", this.l / 2, this.m / 7 + 70, 16777215);
    a(this.q, bnq.a("gui.xaero_items", new Object[0]) + ":", this.l / 2, this.m / 7 + 100, 16777215);
    a(this.q, bnq.a("gui.xaero_other", new Object[0]) + ":", this.l / 2, this.m / 7 + 130, 16777215);
    if (this.dropped) {
      super.a(0, 0, par3);
    } else {
      super.a(par1, par2, par3);
    }
    this.dropped = false;
    for (int k = 0; k < this.dropDowns.size(); k++) {
      if (((GuiDropDown)this.dropDowns.get(k)).closed) {
        ((GuiDropDown)this.dropDowns.get(k)).drawButton(par1, par2);
      } else {
        this.dropped = true;
      }
    }
    for (int k = 0; k < this.dropDowns.size(); k++) {
      if (!((GuiDropDown)this.dropDowns.get(k)).closed) {
        ((GuiDropDown)this.dropDowns.get(k)).drawButton(par1, par2);
      }
    }
  }
}
