package com.minimap.gui;

import ave;
import avs;
import awx;
import awy;
import axu;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.minimap.Minimap;
import com.minimap.minimap.WaypointSet;
import com.minimap.minimap.WaypointWorld;
import com.minimap.settings.ModSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class GuiClearSet
  extends awy
{
  private String key;
  private String name;
  private axu parentScreen;
  
  public GuiClearSet(String setName, String key, String name, axu parent)
  {
    super((awx)null, bnq.a("gui.xaero_clear_set_message", new Object[0]) + ": " + setName + "?", bnq.a("gui.xaero_clear_set_message2", new Object[0]), 0);
    this.parentScreen = parent;
    this.key = key;
    this.name = name;
  }
  
  protected void a(avs button)
    throws IOException
  {
    switch (button.k)
    {
    case 0: 
      WaypointSet set = (WaypointSet)((WaypointWorld)Minimap.waypointMap.get(this.key)).sets.get(this.name);
      if (set != null) {
        set.list.clear();
      }
      XaeroMinimap.getSettings().saveWaypoints();
    case 1: 
      this.j.a(this.parentScreen);
    }
  }
}
