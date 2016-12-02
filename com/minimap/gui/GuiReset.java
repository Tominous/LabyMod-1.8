package com.minimap.gui;

import ave;
import avs;
import awx;
import awy;
import axu;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.minimap.Minimap;
import com.minimap.settings.ModSettings;
import java.io.IOException;

public class GuiReset
  extends awy
{
  axu parent;
  
  public GuiReset(axu p)
  {
    super((awx)null, bnq.a("gui.xaero_reset_message", new Object[0]), bnq.a("gui.xaero_reset_message2", new Object[0]), 0);
    this.parent = p;
  }
  
  protected void a(avs button)
    throws IOException
  {
    switch (button.k)
    {
    case 0: 
      Minimap.resetImage();
      XaeroMinimap.settings = new ModSettings();
    case 1: 
      this.j.a(new GuiMinimap3(XaeroMinimap.getSettings()));
    }
  }
}
