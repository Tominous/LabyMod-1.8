package com.minimap.gui;

import ave;
import avh;
import avr;
import avs;
import axu;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.interfaces.InterfaceHandler;
import com.minimap.settings.ModOptions;
import com.minimap.settings.ModSettings;
import java.io.IOException;
import java.util.List;

public class GuiEditMode
  extends axu
{
  private axu parentGuiScreen;
  protected String screenTitle;
  private ModSettings guiModSettings;
  
  public GuiEditMode(axu par1GuiScreen, ModSettings par2ModSettings)
  {
    this.screenTitle = "Customization";
    this.parentGuiScreen = par1GuiScreen;
    this.guiModSettings = par2ModSettings;
  }
  
  public void b()
  {
    this.screenTitle = bnq.a("gui.xaero_edit_mode", new Object[0]);
    InterfaceHandler.selectedId = -1;
    InterfaceHandler.draggingId = -1;
    this.n.clear();
    this.n.add(new MySmallButton(200, this.l / 2 - 155, this.m / 6 + 143, bnq.a("gui.xaero_confirm", new Object[0])));
    this.n.add(new MySmallButton(202, this.l / 2 + 5, this.m / 6 + 143, bnq.a("gui.xaero_choose_a_preset", new Object[0])));
    this.n.add(new avs(201, this.l / 2 - 100, this.m / 6 + 168, bnq.a("gui.xaero_cancel", new Object[0])));
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
        try
        {
          InterfaceHandler.confirm();
          this.guiModSettings.saveSettings();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
        this.j.a(this.parentGuiScreen);
      }
      if (par1GuiButton.k == 201)
      {
        InterfaceHandler.cancel();
        this.j.a(this.parentGuiScreen);
      }
      if (par1GuiButton.k == 202) {
        this.j.a(new GuiChoosePreset(this, XaeroMinimap.getSettings()));
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
  
  public List<avs> getButtons()
  {
    return this.n;
  }
  
  public void a(int par1, int par2, float par3)
  {
    if (InterfaceHandler.draggingId == -1)
    {
      if (this.j.h == null)
      {
        c();
        a(this.q, bnq.a("gui.xaero_not_ingame", new Object[0]), this.l / 2, this.m / 6 + 128, 16777215);
      }
      else
      {
        a(this.q, bnq.a("gui.xaero_minimap_guide", new Object[0]), this.l / 2, this.m / 6 + 128, 16777215);
      }
      super.a(par1, par2, par3);
    }
    if (this.j.h != null)
    {
      avr scaledresolution = new avr(XaeroMinimap.mc);
      int width = scaledresolution.a();
      int height = scaledresolution.b();
      int scale = scaledresolution.e();
      InterfaceHandler.drawBoxes(par1, par2, width, height, scale);
    }
  }
}
