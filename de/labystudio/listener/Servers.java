package de.labystudio.listener;

import de.labystudio.labymod.LabyMod;

public class Servers
{
  public static boolean isDeinProjektHost = false;
  
  public static void updateDeinProjektHost()
  {
    String ip = LabyMod.getInstance().ip.toLowerCase();
    isDeinProjektHost = (ip.contains("deinprojekthost")) || (ip.contains("miniminerlps.de")) || (ip.contains("dph-games.de"));
  }
  
  public static boolean isDeinProjektHost()
  {
    return isDeinProjektHost;
  }
}
