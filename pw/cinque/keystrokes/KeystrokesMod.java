package pw.cinque.keystrokes;

import a;
import ave;
import bew;
import de.labystudio.modapi.EventHandler;
import de.labystudio.modapi.Listener;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.Module;
import de.labystudio.modapi.events.GameTickEvent;
import de.labystudio.modapi.events.SendChatMessageEvent;
import ez;
import fa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import pw.cinque.keystrokes.render.Key;
import pw.cinque.keystrokes.render.KeystrokesRenderer;
import pw.cinque.keystrokes.settings.Location;

public class KeystrokesMod
  extends Module
  implements Listener
{
  public static void reloadKeys()
  {
    keys.clear();
    int line = -1;
    try
    {
      File keysFile = new File(mcv + File.separator + "KeystrokesMod", "keys.cfg");
      if (!keysFile.exists())
      {
        keysFile.getParentFile().mkdirs();
        keysFile.createNewFile();
        if (mch != null) {
          mch.a(new fa("Created a new empty Key configuration file."));
        }
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(keysFile));
        
        printWriter.println("# Format: KEY:X-OFFSET:Y-OFFSET");
        printWriter.println("# Auf Deusch: TASTE:NACH RECHTS:NACH UNTEN");
        printWriter.println("");
        printWriter.println("W:18:0");
        printWriter.println("A:0:18");
        printWriter.println("S:18:18");
        printWriter.println("D:36:18");
        printWriter.println("LMB:0:38");
        printWriter.println("RMB:28:38");
        
        printWriter.flush();
        printWriter.close();
      }
      BufferedReader reader = new BufferedReader(new FileReader(keysFile));
      line = 0;
      String readLine;
      String[] parts;
      while ((readLine = reader.readLine()) != null)
      {
        line++;
        if ((!readLine.isEmpty()) && 
        
          (!readLine.replace(" ", "").isEmpty()) && 
          
          (!readLine.startsWith("#")))
        {
          parts = readLine.split(":");
          String name = parts[0];
          int x = Integer.valueOf(parts[1]).intValue();
          int y = Integer.valueOf(parts[2]).intValue();
          keys.add(new Key(name, x, y));
        }
      }
      line = -1;
      reader.close();
      for (Key key : keys)
      {
        width = Math.max(width, key.getX() + key.getWidth() + 10);
        height = Math.max(height, key.getY() + key.getHeight() + 10);
      }
      if (mch != null) {
        mch.a(new fa("Key configuration has been reloaded."));
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
      keys.clear();
      if (mch != null)
      {
        mch.a(new fa("An error occured while loading the Key configuration file:").a(new ez().a(a.m)));
        mch.a(new fa(" - " + e.toString()).a(new ez().a(a.m)));
        if (line != -1) {
          mch.a(new fa(" - At line #" + line).a(new ez().a(a.m)));
        }
      }
    }
  }
  
  public static void reloadLocation()
  {
    locationFile = new File(mcv + File.separator + "KeystrokesMod", "location.txt");
    try
    {
      if (!locationFile.exists())
      {
        locationFile.createNewFile();
        
        FileWriter writer = new FileWriter(locationFile);
        writer.append(location + "\n");
        
        writer.flush();
        writer.close();
      }
      BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(locationFile)));
      
      String readLine = null;
      if ((readLine = reader.readLine()) != null)
      {
        try
        {
          location = Integer.parseInt(readLine);
        }
        catch (NumberFormatException ex)
        {
          if (mch != null) {
            mch.a(new fa("[KeystrokesMod] The location in the location.txt is not an integer!"));
          }
        }
        reader.close();
        return;
      }
      if (mch != null) {
        mch.a(new fa("[KeystrokesMod] Couldn't load location from location.txt!")
          .a(new ez().a(a.m)));
      }
      reader.close();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public void onEnable()
  {
    reloadKeys();
    reloadLocation();
    
    ModAPI.registerListener(new KeystrokesRenderer());
    ModAPI.registerListener(this);
  }
  
  @EventHandler
  public void onTick(GameTickEvent event)
  {
    for (Key key : keys) {
      if (!key.isMouseKey()) {
        key.setPressed(Keyboard.isKeyDown(key.getKey()));
      }
    }
    for (Key key : keys) {
      if (key.isMouseKey()) {
        key.setPressed(Mouse.isButtonDown(key.getKey()));
      }
    }
  }
  
  @EventHandler
  public void onCommand(SendChatMessageEvent event)
  {
    String message = event.getMessage();
    if (!message.toLowerCase().startsWith("/keystrokes")) {
      return;
    }
    event.setCancelled(true);
    
    String[] rawArgs = message.split(" ");
    if (rawArgs.length == 1)
    {
      Ah.b(new fa("/keystrokes <setlocation|reload>"));
      return;
    }
    String[] args = new String[rawArgs.length - 1];
    System.arraycopy(rawArgs, 1, args, 0, rawArgs.length - 1);
    if (args[0].equalsIgnoreCase("setlocation"))
    {
      String locations = "";
      for (int i = 0; i < Location.values().length; i++) {
        locations = locations + (!locations.equals("") ? ", " : "") + Location.values()[i].name();
      }
      if (args.length < 2)
      {
        Ah.b(new fa("Invalid location. Possible locations: " + locations.toString()));
        return;
      }
      for (int i = 0; i < Location.values().length; i++)
      {
        Location location = Location.values()[i];
        if (location.name().equalsIgnoreCase(args[1]))
        {
          location = i;
          try
          {
            PrintWriter printWriter = new PrintWriter(new FileWriter(locationFile));
            
            printWriter.println(i);
            
            printWriter.flush();
            printWriter.close();
          }
          catch (IOException e)
          {
            e.printStackTrace();
          }
          Ah.b(new fa("Location set to " + location + "."));
          return;
        }
      }
      Ah.b(new fa("Invalid location. Possible locations: " + locations.toString()));
      return;
    }
    if (args[0].equalsIgnoreCase("reload"))
    {
      reloadKeys();
      reloadLocation();
      return;
    }
    Ah.b(new fa("/keystrokes <setlocation|reload>"));
  }
  
  private static ave mc = ;
  public static int location = 0;
  public static List<Key> keys = new ArrayList();
  public static int width = 0;
  public static int height = 0;
  private static File locationFile;
}
