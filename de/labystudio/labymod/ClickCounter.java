package de.labystudio.labymod;

import org.lwjgl.input.Mouse;

public class ClickCounter
{
  private static boolean click = false;
  private static double clicks = 0.0D;
  private static double clickResult = 0.0D;
  
  public static double getClicks()
  {
    return clicks;
  }
  
  public static double getClickResult()
  {
    return clickResult;
  }
  
  public static void update()
  {
    if ((Mouse.isCreated()) && (ConfigManager.settings.clicktest != 0)) {
      if ((Mouse.isButtonDown(0)) || (Mouse.isButtonDown(1)))
      {
        if (!click)
        {
          clicks += 1.0D;
          click = true;
        }
      }
      else {
        click = false;
      }
    }
  }
  
  public static void calc(int min)
  {
    if ((ConfigManager.settings.clicktest != 0) && 
      (min % ConfigManager.settings.clicktest == 0))
    {
      clickResult = 0.0D;
      clickResult = getClicks() / ConfigManager.settings.clicktest;
      clicks = 0.0D;
    }
  }
}
