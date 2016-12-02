package com.minimap.minimap;

import java.util.HashMap;

public class WaypointWorld
{
  public HashMap<String, WaypointSet> sets;
  public String current;
  
  public WaypointWorld()
  {
    this.current = "gui.xaero_default";
    (this.sets = new HashMap()).put("gui.xaero_default", new WaypointSet(this));
  }
  
  public WaypointSet getCurrentSet()
  {
    return (WaypointSet)this.sets.get(this.current);
  }
}
