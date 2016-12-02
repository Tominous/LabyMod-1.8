package de.labystudio.utils;

import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class FriendsLoader
{
  public static Map<String, String> friends = new HashMap();
  
  public static void loadFriends()
  {
    if (!friends.isEmpty()) {
      return;
    }
    friends.clear();
    String json = "";
    try
    {
      create();
      BufferedReader br = new BufferedReader(new FileReader("LabyMod/friend_tags.json"));
      try
      {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null)
        {
          sb.append(line);
          sb.append("\n");
          line = br.readLine();
        }
        json = sb.toString();
      }
      finally
      {
        br.close();
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    try
    {
      friends = (Map)Utils.ConvertJsonToObject.getFromJSON(json, Map.class);
    }
    catch (Exception error)
    {
      new File("LabyMod/friend_tags.json").delete();
      error.printStackTrace();
    }
    if (friends == null) {
      friends = new HashMap();
    }
  }
  
  public static void create()
  {
    if (!new File("LabyMod/friend_tags.json").exists()) {
      try
      {
        if (!new File("LabyMod/friend_tags.json").getParentFile().exists()) {
          new File("LabyMod/friend_tags.json").getParentFile().mkdirs();
        }
        new File("LabyMod/friend_tags.json").createNewFile();
      }
      catch (IOException localIOException) {}
    }
  }
  
  public static String getNick(String name, String blank)
  {
    if ((!Allowed.nick()) || (!ConfigManager.settings.tags) || (friends.isEmpty())) {
      return name;
    }
    if ((friends.containsKey(blank)) && 
      (!((String)friends.get(blank)).replace(" ", "").isEmpty())) {
      return ((String)friends.get(blank)).replace("&", Color.c);
    }
    for (String tag : friends.keySet()) {
      if (tag.startsWith("@"))
      {
        tag = tag.replace("@", "");
        if (blank.contains(tag)) {
          return name.replace(tag, ((String)friends.get("@" + tag)).replace("&", Color.c));
        }
      }
    }
    return name;
  }
  
  public static void saveFriends()
  {
    create();
    String json = Utils.ConvertJsonToObject.toJSON(friends);
    try
    {
      PrintWriter w = new PrintWriter(new FileOutputStream("LabyMod/friend_tags.json"));
      w.print(json);
      w.flush();
      w.close();
    }
    catch (FileNotFoundException localFileNotFoundException) {}
  }
}
