package de.labystudio.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.io.IOUtils;

public class StatsLoader
{
  public static HashMap<String, ArrayList<String>> stats = new HashMap();
  
  public static void loadstats()
  {
    if (!stats.isEmpty()) {
      return;
    }
    stats.clear();
    String json = "";
    create();
    try
    {
      json = IOUtils.toString(new FileInputStream("LabyMod/minigames_stats.json"));
    }
    catch (FileNotFoundException localFileNotFoundException) {}catch (IOException localIOException) {}
    try
    {
      stats = (HashMap)Utils.ConvertJsonToObject.getFromJSON(json, HashMap.class);
    }
    catch (Exception error)
    {
      new File("LabyMod/minigames_stats.json").delete();
      error.printStackTrace();
    }
    if (stats == null) {
      stats = new HashMap();
    }
  }
  
  public static void create()
  {
    if (!new File("LabyMod/minigames_stats.json").exists()) {
      try
      {
        if (!new File("LabyMod/minigames_stats.json").getParentFile().exists()) {
          new File("LabyMod/minigames_stats.json").getParentFile().mkdirs();
        }
        new File("LabyMod/minigames_stats.json").createNewFile();
      }
      catch (IOException localIOException) {}
    }
  }
  
  public static void savestats()
  {
    create();
    String json = Utils.ConvertJsonToObject.toJSON(stats);
    try
    {
      PrintWriter w = new PrintWriter(new FileOutputStream("LabyMod/minigames_stats.json"));
      w.print(json);
      w.flush();
      w.close();
    }
    catch (FileNotFoundException localFileNotFoundException) {}
  }
  
  public static boolean isHighScore(int i, ArrayList<String> list)
  {
    if (list.isEmpty()) {
      return true;
    }
    for (int m = 0; m < list.size(); m++)
    {
      String string = (String)list.get(m);
      try
      {
        int l = Integer.parseInt(string);
        if (i <= l) {
          return false;
        }
      }
      catch (Exception localException) {}
    }
    return true;
  }
}
