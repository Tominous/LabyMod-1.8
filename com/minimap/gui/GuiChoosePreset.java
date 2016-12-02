package com.minimap.gui;

import ave;
import avh;
import avr;
import avs;
import axu;
import bnq;
import com.minimap.interfaces.InterfaceHandler;
import com.minimap.interfaces.Preset;
import com.minimap.settings.ModSettings;
import java.util.ArrayList;
import java.util.List;

public class GuiChoosePreset
  extends axu
{
  private axu parentGuiScreen;
  protected String screenTitle;
  
  public GuiChoosePreset(axu par1GuiScreen, ModSettings par2ModSettings)
  {
    this.screenTitle = "Customization";
    this.parentGuiScreen = par1GuiScreen;
  }
  
  public void b()
  {
    this.screenTitle = bnq.a("gui.xaero_choose_a_preset", new Object[0]);
    InterfaceHandler.selectedId = -1;
    InterfaceHandler.draggingId = -1;
    this.n.clear();
    this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 168, bnq.a("gui.xaero_cancel", new Object[0])));
    int var8 = 0;
    ArrayList<Preset> var2 = InterfaceHandler.presets;
    int var3 = var2.size();
    for (int var4 = 0; var4 < var3; var4++)
    {
      Preset var5 = (Preset)var2.get(var4);
      this.n.add(new MySmallButton(var4, this.l / 2 - 155 + var8 % 2 * 160, this.m / 7 + 24 * (var8 >> 1), var5.getName()));
      var8++;
    }
  }
  
  protected void a(avs par1GuiButton)
  {
    if (par1GuiButton.l)
    {
      int var2 = this.j.t.aK;
      if ((par1GuiButton.k < 100) && ((par1GuiButton instanceof MySmallButton)))
      {
        InterfaceHandler.applyPreset(par1GuiButton.k);
        this.j.a(this.parentGuiScreen);
      }
      if (par1GuiButton.k == 200) {
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
  
  public List getButtons()
  {
    return this.n;
  }
  
  public void a(int par1, int par2, float par3)
  {
    c();
    a(this.q, this.screenTitle, this.l / 2, 20, 16777215);
    super.a(par1, par2, par3);
  }
}
