package com.minimap.interfaces;

import bnq;
import java.util.ArrayList;

public class Preset
{
  public int[][] coords;
  public boolean[][] types;
  private String name;
  
  public Preset(String name, int[][] coords, boolean[][] types)
  {
    this.coords = coords;
    this.types = types;
    this.name = name;
    InterfaceHandler.presets.add(this);
  }
  
  public String getName()
  {
    return bnq.a(this.name, new Object[0]);
  }
}
