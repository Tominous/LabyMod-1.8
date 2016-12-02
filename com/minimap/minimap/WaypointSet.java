package com.minimap.minimap;

import java.util.ArrayList;

public class WaypointSet
{
  public WaypointWorld world;
  public ArrayList<Waypoint> list;
  
  public WaypointSet(WaypointWorld world)
  {
    this.world = world;
    list = new ArrayList();
  }
}
