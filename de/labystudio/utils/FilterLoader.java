package de.labystudio.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.apache.commons.io.IOUtils;

public class FilterLoader
{
  public static ArrayList<String> filters = new ArrayList();
  public static boolean enabled = true;
  
  public static void loadFilters()
  {
    if (!filters.isEmpty()) {
      return;
    }
    filters.clear();
    String json = "";
    create();
    try
    {
      json = IOUtils.toString(new FileInputStream("LabyMod/filters.json"));
    }
    catch (FileNotFoundException localFileNotFoundException) {}catch (IOException localIOException) {}
    try
    {
      filters = (ArrayList)Utils.ConvertJsonToObject.getFromJSON(json, ArrayList.class);
    }
    catch (Exception error)
    {
      new File("LabyMod/filters.json").delete();
      error.printStackTrace();
    }
    if (filters == null) {
      filters = new ArrayList();
    }
  }
  
  public static void create()
  {
    if (!new File("LabyMod/filters.json").exists()) {
      try
      {
        if (!new File("LabyMod/filters.json").getParentFile().exists()) {
          new File("LabyMod/filters.json").getParentFile().mkdirs();
        }
        new File("LabyMod/filters.json").createNewFile();
      }
      catch (IOException localIOException) {}
    }
  }
  
  public static void saveFilters()
  {
    FriendsLoader.create();
    String json = Utils.ConvertJsonToObject.toJSON(filters);
    try
    {
      PrintWriter w = new PrintWriter(new FileOutputStream("LabyMod/filters.json"));
      w.print(json);
      w.flush();
      w.close();
    }
    catch (FileNotFoundException localFileNotFoundException) {}
  }
}
