package de.labystudio.listener;

import de.labystudio.labymod.LabyMod;

public class Hypixel
{
  public static boolean isHypixel = false;
  
  public static void updateHypixel()
  {
    isHypixel = getInstanceip.toLowerCase().contains("hypixel");
  }
  
  public static boolean isHypixel()
  {
    return isHypixel;
  }
}
