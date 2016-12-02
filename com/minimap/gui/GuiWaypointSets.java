package com.minimap.gui;

import bnq;
import com.minimap.minimap.Minimap;
import com.minimap.minimap.WaypointWorld;
import java.util.HashMap;
import java.util.Set;

public class GuiWaypointSets
{
  public int currentSet;
  String[] options;
  
  public GuiWaypointSets(String c, String worldID, boolean canCreate)
  {
    WaypointWorld w = (WaypointWorld)Minimap.waypointMap.get(worldID);
    int size = sets.size() + (canCreate ? 1 : 0);
    options = new String[size];
    Object[] keys = sets.keySet().toArray();
    for (int i = 0; i < keys.length; i++)
    {
      options[i] = ((String)keys[i]);
      if (options[i].equals(c)) {
        currentSet = i;
      }
    }
    if (canCreate) {
      options[(options.length - 1)] = ("§8" + bnq.a("gui.xaero_create_set", new Object[0]));
    }
  }
}
