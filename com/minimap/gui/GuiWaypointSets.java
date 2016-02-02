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
    int size = w.sets.size() + (canCreate ? 1 : 0);
    this.options = new String[size];
    Object[] keys = w.sets.keySet().toArray();
    for (int i = 0; i < keys.length; i++)
    {
      this.options[i] = ((String)keys[i]);
      if (this.options[i].equals(c)) {
        this.currentSet = i;
      }
    }
    if (canCreate) {
      this.options[(this.options.length - 1)] = ("§8" + bnq.a("gui.xaero_create_set", new Object[0]));
    }
  }
}
