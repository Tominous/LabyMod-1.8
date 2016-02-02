package de.labystudio.utils;

import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;

public class Debug
{
  public static boolean chat()
  {
    if (ConfigManager.settings == null) {
      return false;
    }
    return ConfigManager.settings.motd.startsWith("/debug chat");
  }
  
  public static boolean teamspeak()
  {
    if (ConfigManager.settings == null) {
      return false;
    }
    return ConfigManager.settings.motd.equals("/debug ts");
  }
  
  public static boolean timings()
  {
    if (ConfigManager.settings == null) {
      return false;
    }
    return ConfigManager.settings.motd.equals("/debug timings");
  }
  
  public static boolean server()
  {
    if (ConfigManager.settings == null) {
      return false;
    }
    return ConfigManager.settings.motd.equals("/debug chat-setport");
  }
  
  public static boolean capes()
  {
    if (ConfigManager.settings == null) {
      return false;
    }
    return ConfigManager.settings.motd.equals("/debug capes");
  }
  
  public static boolean api()
  {
    if (ConfigManager.settings == null) {
      return false;
    }
    return ConfigManager.settings.motd.equals("/debug api");
  }
}
