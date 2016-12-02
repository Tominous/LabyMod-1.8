package mods.batty.main;

import java.util.logging.Logger;
import ns;

public class BattyUtils
{
  private static BattyUI ui = BattyMod.getInstance().getBatheartgui();
  
  public static int nameSearch(String[] names, String name)
  {
    for (int n = 0; n < names.length; n++) {
      if (names[n].equals(name)) {
        return n;
      }
    }
    return -1;
  }
  
  public static int getCardinalPoint(float par0)
  {
    double myPoint = ns.g(par0) + 180.0D;
    myPoint += 22.5D;
    myPoint %= 360.0D;
    myPoint /= 45.0D;
    return ns.c(myPoint);
  }
  
  public static String constructCoordVisString()
  {
    String var1 = "";
    var1 = var1 + uishowCoords;
    return var1;
  }
  
  public static String constructTimerVisString()
  {
    String var1;
    String var1;
    if (uihideTimer) {
      var1 = "false";
    } else {
      var1 = "true";
    }
    return var1;
  }
  
  public static String constructCoordLocString()
  {
    String var1 = "";
    var1 = var1 + uicoordLocation;
    return var1;
  }
  
  public static String constructTimerRunString()
  {
    String var1;
    String var1;
    if (uitimerRunning) {
      var1 = "true";
    } else {
      var1 = "false";
    }
    return var1;
  }
  
  public static String constructFPSVisString()
  {
    String var1;
    String var1;
    if (uihideFPS) {
      var1 = "false";
    } else {
      var1 = "true";
    }
    return var1;
  }
  
  public static String constructFPSLocString()
  {
    String var1 = "";
    var1 = var1 + uifpsLocation;
    return var1;
  }
  
  public static String constructTimerLocString()
  {
    String var1 = "";
    var1 = var1 + uitimerLocation;
    return var1;
  }
  
  public static void parseTimeString(String var1)
  {
    Logger.getLogger("Minecraft").info(var1);
    String[] var2 = var1.split("\\|");
    uihourCounter = Integer.parseInt(var2[0]);
    uiminuteCounter = Integer.parseInt(var2[1]);
    uisecondCounter = Integer.parseInt(var2[2]);
  }
  
  public static String constructTimeString()
  {
    String var1 = "";
    var1 = var1 + (uihourCounter >= 10 ? "" : "0");
    var1 = var1 + uihourCounter;
    var1 = var1 + ":";
    var1 = var1 + (uiminuteCounter >= 10 ? "" : "0");
    var1 = var1 + uiminuteCounter;
    var1 = var1 + ":";
    var1 = var1 + (uisecondCounter >= 10 ? "" : "0");
    var1 = var1 + uisecondCounter;
    return var1;
  }
  
  public static String getSaveString()
  {
    return constructTimeString().replace(":", "|");
  }
  
  public static void resetTimer()
  {
    uiresetTimer = false;
    uitickCounter = (uihourCounter = uiminuteCounter = uisecondCounter = 0);
    
    BattyConfig.storeRuntimeOptions();
  }
  
  public static void addOneSecond()
  {
    uisecondCounter += 1;
    if (uisecondCounter >= 60)
    {
      uisecondCounter -= 60;
      uiminuteCounter += 1;
    }
    if (uiminuteCounter >= 60)
    {
      uiminuteCounter -= 60;
      uihourCounter += 1;
    }
  }
  
  public static void updateTimer(int var1)
  {
    if (uiresetTimer) {
      resetTimer();
    }
    if (uitoggleTimer)
    {
      uitoggleTimer = false;
      uitickCounter = 0;
      uitimerRunning = (!uitimerRunning);
      BattyConfig.storeRuntimeOptions();
    }
    if (uitimerRunning)
    {
      if (uitickCounter == 0) {
        uitickCounter = var1;
      }
      if (var1 - uitickCounter >= 20)
      {
        addOneSecond();
        uitickCounter += 20;
      }
    }
  }
}
