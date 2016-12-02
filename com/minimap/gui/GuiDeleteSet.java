package com.minimap.gui;

import ave;
import avs;
import awx;
import awy;
import axu;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.minimap.Minimap;
import com.minimap.minimap.WaypointWorld;
import com.minimap.settings.ModSettings;
import java.io.IOException;
import java.util.HashMap;

public class GuiDeleteSet
  extends awy
{
  private String key;
  private String name;
  private axu parentScreen;
  
  public GuiDeleteSet(String setName, String key, String name, axu parent)
  {
    super((awx)null, bnq.a("gui.xaero_delete_set_message", new Object[0]) + ": " + setName + "?", bnq.a("gui.xaero_delete_set_message2", new Object[0]), 0);
    parentScreen = parent;
    this.key = key;
    this.name = name;
  }
  
  protected void a(avs button)
    throws IOException
  {
    switch (k)
    {
    case 0: 
      waypointMapgetkey)).sets.remove(name);
      waypointMapgetkey)).current = "gui.xaero_default";
      Minimap.updateWaypoints();
      XaeroMinimap.getSettings().saveWaypoints();
      j.a(new GuiWaypoints(parentScreen).parentScreen));
      break;
    case 1: 
      j.a(parentScreen);
    }
  }
}
