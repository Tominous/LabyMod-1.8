package com.minimap.gui;

import com.minimap.minimap.Minimap;
import java.util.HashMap;
import java.util.Set;

public class GuiWaypointWorlds
{
  public int currentWorld;
  public int autoWorld;
  public Object[] keys;
  String[] options;
  
  public GuiWaypointWorlds(String c, String a)
  {
    this.keys = Minimap.waypointMap.keySet().toArray();
    this.options = new String[this.keys.length];
    this.currentWorld = -1;
    this.autoWorld = -1;
    for (int i = 0; i < this.options.length; i++) {
      try
      {
        this.options[i] = "Error";
        String worldID = (String)this.keys[i];
        if ((this.currentWorld == -1) && (worldID.equals(c))) {
          this.currentWorld = i;
        }
        if ((this.autoWorld == -1) && (worldID.equals(a))) {
          this.autoWorld = i;
        }
        String[] details = worldID.split("_");
        String dimension = "";
        if (details[(details.length - 1)].startsWith("DIM"))
        {
          String dim = details[(details.length - 1)].substring(3);
          try
          {
            int id = Integer.parseInt(dim) + 1;
            if ((id < dimensions.length) && (id >= 0)) {
              dimension = " " + dimensions[id];
            } else {
              dimension = " Dimension " + id;
            }
          }
          catch (NumberFormatException e2)
          {
            dimension = " " + dim.substring(1);
          }
        }
        this.options[i] = (details[(details.length - 2)] + dimension);
        if (this.autoWorld == i)
        {
          int tmp315_314 = i; String[] tmp315_311 = this.options;tmp315_311[tmp315_314] = (tmp315_311[tmp315_314] + " (auto)");
        }
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
  }
  
  public static final String[] dimensions = { "Nether", "Overworld", "The End" };
}
