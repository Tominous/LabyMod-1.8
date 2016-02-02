package com.minimap;

import ave;
import com.minimap.events.ControlsHandler;
import com.minimap.events.Events;
import com.minimap.events.FMLEvents;
import com.minimap.gui.GuiMinimap;
import com.minimap.interfaces.InterfaceHandler;
import com.minimap.settings.ModSettings;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.Module;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;

public class XaeroMinimap
  extends Module
{
  public static ModSettings getSettings()
  {
    return settings;
  }
  
  public static Map<String, Map<String, String>> languages = new HashMap();
  
  public void onEnable()
  {
    instance = this;
    InterfaceHandler.loadPresets();
    InterfaceHandler.load();
    try
    {
      (settings = new ModSettings()).loadSettings();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    events = new Events();
    fmlEvents = new FMLEvents();
    ModAPI.addSettingsButton("Minimap", new GuiMinimap(
      getSettings()));
    ModAPI.registerListener(events);
    ModAPI.registerListener(fmlEvents);
    try
    {
      List<String> langFiles = new ArrayList();
      
      CodeSource src = XaeroMinimap.class.getProtectionDomain().getCodeSource();
      if (src != null)
      {
        URL jar = src.getLocation();
        System.out.println(jar.toString());
        JarInputStream zip = new JarInputStream(jar.openStream());
        JarEntry ze = null;
        while ((ze = zip.getNextJarEntry()) != null)
        {
          String entryName = ze.getName();
          if ((entryName.startsWith("assets/minecraft/xaerobetterpvp/lang")) && 
            (!entryName.equals("assets/minecraft/xaerobetterpvp/lang/"))) {
            langFiles.add(entryName);
          }
        }
      }
      File file = null;
      jar = null;
      try
      {
        file = new File(src.getLocation().toURI());
        jar = new JarFile(file);
      }
      catch (Exception localException1) {}
      for (String langFile : langFiles)
      {
        JarEntry entry = jar.getJarEntry(langFile);
        BufferedReader input = new BufferedReader(new InputStreamReader(jar.getInputStream(entry), "UTF-8"));
        
        Map<String, String> messages = new HashMap();
        String rawFileName = langFile.substring(langFile.lastIndexOf('/') + 1, langFile.length());
        String fileName = rawFileName.substring(0, rawFileName.indexOf('.'));
        
        languages.put(fileName, messages);
        
        String line = null;
        while ((line = input.readLine()) != null) {
          if (line.split("=").length >= 2) {
            messages.put(line.split("=")[0], line.split("=")[1]);
          }
        }
      }
    }
    catch (Exception ex)
    {
      JarFile jar;
      ex.printStackTrace();
    }
  }
  
  public static String message = "";
  public static File optionsFile = new File("./xaerominimap.txt");
  public static File waypointsFile = new File("./xaerowaypoints.txt");
  public static ave mc = ave.A();
  public static XaeroMinimap instance;
  public static final String versionID = "1.8.8_1.7.6";
  public static int newestUpdateID;
  public static ModSettings settings;
  public static ControlsHandler ch;
  public static Events events;
  public static FMLEvents fmlEvents;
}
