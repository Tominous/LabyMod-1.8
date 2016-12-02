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
    screenTitle = "Customization";
    parentGuiScreen = par1GuiScreen;
    guiModSettings = par2ModSettings;
  }
  
  public void b()
  {
    screenTitle = bnq.a("gui.xaero_edit_mode", new Object[0]);
    InterfaceHandler.selectedId = -1;
    InterfaceHandler.draggingId = -1;
    n.clear();
    n.add(new MySmallButton(200, l / 2 - 155, m / 6 + 143, bnq.a("gui.xaero_confirm", new Object[0])));
    n.add(new MySmallButton(202, l / 2 + 5, m / 6 + 143, bnq.a("gui.xaero_choose_a_preset", new Object[0])));
    n.add(new avs(201, l / 2 - 100, m / 6 + 168, bnq.a("gui.xaero_cancel", new Object[0])));
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
        try
        {
          InterfaceHandler.confirm();
          guiModSettings.saveSettings();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
        j.a(parentGuiScreen);
      }
      if (k == 201)
      {
        InterfaceHandler.cancel();
        j.a(parentGuiScreen);
      }
      if (k == 202) {
        j.a(new GuiChoosePreset(this, XaeroMinimap.getSettings()));
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
  
  public List<avs> getButtons()
  {
    return n;
  }
  
  public void a(int par1, int par2, float par3)
  {
    if (InterfaceHandler.draggingId == -1)
    {
      if (j.h == null)
      {
        c();
        a(q, bnq.a("gui.xaero_not_ingame", new Object[0]), l / 2, m / 6 + 128, 16777215);
      }
      else
      {
        a(q, bnq.a("gui.xaero_minimap_guide", new Object[0]), l / 2, m / 6 + 128, 16777215);
      }
      super.a(par1, par2, par3);
    }
    if (j.h != null)
    {
      avr scaledresolution = new avr(XaeroMinimap.mc);
      int width = scaledresolution.a();
      int height = scaledresolution.b();
      int scale = scaledresolution.e();
      InterfaceHandler.drawBoxes(par1, par2, width, height, scale);
    }
  }
}
