package de.labystudio.listener;

import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Color;
import de.labystudio.utils.ModGui;

public class Revayd
{
  public static int kills = 0;
  public static int deaths = 0;
  public static boolean isRevayd = false;
  
  public static void updateRevayd()
  {
    isRevayd = (getInstanceip.toLowerCase().contains("revayd.net")) || (getInstanceip.toLowerCase().contains("revayd.living-bots.net")) || (getInstanceip.toLowerCase().contains("212.224.88.206"));
  }
  
  public static boolean isRevayd()
  {
    return isRevayd;
  }
  
  public static void serverRevaydChat(String clean, String raw)
  {
    if ((clean.contains("Du hast")) && (clean.contains(" mit ")) && (clean.contains(" getötet."))) {
      kills += 1;
    }
    if ((clean.contains("Du wurdest von ")) && (clean.contains(" mit ")) && (clean.contains(" getötet."))) {
      deaths += 1;
    }
  }
  
  public static void drawRevaydGui()
  {
    if (!isRevayd()) {
      return;
    }
    ModGui.addMainLabel("Stats", Color.cl("a") + kills + Color.cl("7") + " | " + Color.cl("c") + deaths, ModGui.mainList);
  }
  
  public static void reset()
  {
    kills = 0;
    deaths = 0;
  }
}
