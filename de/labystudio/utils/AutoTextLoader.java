package de.labystudio.utils;

import ave;
import avh;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import org.apache.commons.io.IOUtils;
import org.lwjgl.input.Keyboard;

public class AutoTextLoader
{
  public static HashMap<String, String> autoText = new HashMap();
  public static boolean enabled = true;
  public static boolean listening = false;
  public static int key = -1;
  public static boolean ctrl = false;
  public static boolean shift = false;
  public static boolean alt = false;
  
  public static void load()
  {
    if (!autoText.isEmpty()) {
      return;
    }
    autoText.clear();
    String json = "";
    create();
    try
    {
      json = IOUtils.toString(new FileInputStream("LabyMod/friend_autotext.json"));
    }
    catch (FileNotFoundException localFileNotFoundException) {}catch (IOException localIOException) {}
    try
    {
      autoText = (HashMap)Utils.ConvertJsonToObject.getFromJSON(json, HashMap.class);
    }
    catch (Exception error)
    {
      new File("LabyMod/friend_autotext.json").delete();
      error.printStackTrace();
    }
    if (autoText == null) {
      autoText = new HashMap();
    }
  }
  
  public static void create()
  {
    if (!new File("LabyMod/friend_autotext.json").exists()) {
      try
      {
        if (!new File("LabyMod/friend_autotext.json").getParentFile().exists()) {
          new File("LabyMod/friend_autotext.json").getParentFile().mkdirs();
        }
        new File("LabyMod/friend_autotext.json").createNewFile();
      }
      catch (IOException localIOException) {}
    }
  }
  
  public static void save()
  {
    FriendsLoader.create();
    String json = Utils.ConvertJsonToObject.toJSON(autoText);
    try
    {
      PrintWriter w = new PrintWriter(new FileOutputStream("LabyMod/friend_autotext.json"));
      w.print(json);
      w.flush();
      w.close();
    }
    catch (FileNotFoundException localFileNotFoundException) {}
  }
  
  static boolean repeat = false;
  
  public static void handleKeyboardInput(int key)
  {
    if (listening)
    {
      if ((key != 29) && (key != 42) && (key != 56)) {
        key = key;
      }
      if (Keyboard.isKeyDown(29)) {
        ctrl = true;
      }
      if (Keyboard.isKeyDown(42)) {
        shift = true;
      }
      if (Keyboard.isKeyDown(56)) {
        alt = true;
      }
      return;
    }
    if (key == -1)
    {
      repeat = false;
      return;
    }
    if ((getInstancemc.m == null) && (settingsautoText) && (enabled) && (!repeat) && (Allowed.chat())) {
      for (String set : autoText.keySet()) {
        try
        {
          if (Keyboard.isKeyDown(getNormalKey(set)))
          {
            if (((isShift(set)) && (!Keyboard.isKeyDown(42))) || 
            
              ((isCtrl(set)) && (!Keyboard.isKeyDown(29))) || (
              
              (isAlt(set)) && (!Keyboard.isKeyDown(56)))) {
              continue;
            }
            repeat = true;
            String text = (String)autoText.get(set);
            if (text.contains("%togglelayer%")) {
              try
              {
                int layer = Integer.parseInt(text.split("%togglelayer%")[1]);
                At.a(wo.values()[layer]);
              }
              catch (Exception error)
              {
                error.printStackTrace();
              }
            } else {
              LabyMod.getInstance().sendChatMessage(text);
            }
          }
        }
        catch (Exception error)
        {
          error.printStackTrace();
        }
      }
    }
  }
  
  public static boolean isShift(String hotKeyCode)
  {
    return hotKeyCode.contains("#SHIFT");
  }
  
  public static boolean isAlt(String hotKeyCode)
  {
    return hotKeyCode.contains("#ALT");
  }
  
  public static boolean isCtrl(String hotKeyCode)
  {
    return hotKeyCode.contains("#CTRL");
  }
  
  public static int getNormalKey(String hotKeyCode)
  {
    try
    {
      return Integer.parseInt(hotKeyCode.replace("#SHIFT", "").replace("#ALT", "").replace("#CTRL", "").replace(";", ""));
    }
    catch (Exception error) {}
    return -1;
  }
}
