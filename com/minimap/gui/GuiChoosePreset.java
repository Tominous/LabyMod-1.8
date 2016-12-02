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
    screenTitle = "Customization";
    parentGuiScreen = par1GuiScreen;
  }
  
  public void b()
  {
    screenTitle = bnq.a("gui.xaero_choose_a_preset", new Object[0]);
    InterfaceHandler.selectedId = -1;
    InterfaceHandler.draggingId = -1;
    n.clear();
    n.add(new avs(200, l / 2 - 100, m / 6 + 168, bnq.a("gui.xaero_cancel", new Object[0])));
    int var8 = 0;
    ArrayList<Preset> var2 = InterfaceHandler.presets;
    int var3 = var2.size();
    for (int var4 = 0; var4 < var3; var4++)
    {
      Preset var5 = (Preset)var2.get(var4);
      n.add(new MySmallButton(var4, l / 2 - 155 + var8 % 2 * 160, m / 7 + 24 * (var8 >> 1), var5.getName()));
      var8++;
    }
  }
  
  protected void a(avs par1GuiButton)
  {
    if (l)
    {
      int var2 = j.t.aK;
      if ((k < 100) && ((par1GuiButton instanceof MySmallButton)))
      {
        InterfaceHandler.applyPreset(k);
        j.a(parentGuiScreen);
      }
      if (k == 200) {
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
  
  public List getButtons()
  {
    return n;
  }
  
  public void a(int par1, int par2, float par3)
  {
    c();
    a(q, screenTitle, l / 2, 20, 16777215);
    super.a(par1, par2, par3);
  }
}
