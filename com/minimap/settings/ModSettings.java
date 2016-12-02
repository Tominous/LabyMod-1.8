package com.minimap.settings;

import avb;
import ave;
import axu;
import bnq;
import com.minimap.ServerFilter;
import com.minimap.ServerFilter.FilterType;
import com.minimap.XaeroMinimap;
import com.minimap.events.ControlsHandler;
import com.minimap.gui.GuiSlimeSeed;
import com.minimap.interfaces.Interface;
import com.minimap.interfaces.InterfaceHandler;
import com.minimap.minimap.Minimap;
import com.minimap.minimap.Waypoint;
import com.minimap.minimap.WaypointSet;
import com.minimap.minimap.WaypointWorld;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ModSettings
{
  public static final int defaultSettings = Integer.MAX_VALUE;
  public static int ignoreUpdate;
  public static final String format = "§";
  
  public ModSettings()
  {
    minimap = true;
    zoom = 2;
    zooms = new float[] { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
    entityAmount = 1;
    showPlayers = true;
    showMobs = true;
    showHostile = true;
    showItems = true;
    showOther = true;
    caveMaps = true;
    showOtherTeam = true;
    showWaypoints = true;
    deathpoints = true;
    oldDeathpoints = true;
    chunkGrid = false;
    slimeChunks = false;
    serverSlimeSeed = 0L;
    showIngameWaypoints = true;
    showCoords = true;
    lockNorth = false;
    antiAliasing = true;
    displayRedstone = true;
    mapSafeMode = false;
    distance = 1;
    blockColours = 0;
    lighting = true;
    compassOverWaypoints = false;
    mapSize = -1;
    playersColor = 15;
    mobsColor = 14;
    hostileColor = 14;
    itemsColor = 12;
    otherColor = 5;
    minimapOpacity = 100.0F;
    waypointsScale = 1.0F;
    dotsScale = 1.0F;
    showBiome = false;
    showEntityHeight = true;
    showFlowers = true;
    if (!keysLoaded)
    {
      XaeroMinimap.ch = new ControlsHandler();
      keysLoaded = true;
    }
  }
  
  public static boolean isKeyRepeat(avb kb)
  {
    return (kb != keyWaypoints) && (kb != keyBindSettings) && (kb != newWaypoint) && (kb != keyLargeMap) && (kb != keyToggleMap) && (kb != keyToggleWaypoints) && (kb != keyToggleSlimes) && (kb != keyToggleGrid) && (kb != keyInstantWaypoint);
  }
  
  public boolean getMinimap()
  {
    return (minimap) && (!minimapDisabled());
  }
  
  public boolean getShowPlayers()
  {
    return (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_RADAR) && (XaeroMinimap.allowPlayerRadar) && (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_PLAYER_RADAR) && (showPlayers) && (!minimapDisplayPlayersDisabled());
  }
  
  public boolean getShowMobs()
  {
    return (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_RADAR) && (XaeroMinimap.allowRadar) && (showMobs) && (!minimapDisplayMobsDisabled());
  }
  
  public boolean getShowHostile()
  {
    return (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_RADAR) && (XaeroMinimap.allowRadar) && (showHostile) && (!minimapDisplayMobsDisabled());
  }
  
  public boolean getShowItems()
  {
    return (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_RADAR) && (XaeroMinimap.allowRadar) && (showItems) && (!minimapDisplayItemsDisabled());
  }
  
  public boolean getShowOther()
  {
    return (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_RADAR) && (XaeroMinimap.allowRadar) && (showOther) && (!minimapDisplayOtherDisabled());
  }
  
  public boolean getCaveMaps()
  {
    return (caveMaps) && (!caveMapsDisabled());
  }
  
  public boolean getShowOtherTeam()
  {
    return (showOtherTeam) && (!showOtherTeamDisabled());
  }
  
  public boolean getShowWaypoints()
  {
    return (showWaypoints) && (!showWaypointsDisabled());
  }
  
  public boolean getDeathpoints()
  {
    return (deathpoints) && (!deathpointsDisabled());
  }
  
  public boolean getOldDeathpoints()
  {
    return oldDeathpoints;
  }
  
  public boolean getChunkGrid()
  {
    return chunkGrid;
  }
  
  public boolean customSlimeSeedNeeded()
  {
    return (!(Am instanceof GuiSlimeSeed)) && (ave.A().G() == null) && (Af != null);
  }
  
  public boolean getSlimeChunks()
  {
    return (slimeChunks) && ((serverSlimeSeed != -1L) || (ave.A().G() != null));
  }
  
  public boolean getShowIngameWaypoints()
  {
    return (showIngameWaypoints) && (!showWaypointsDisabled());
  }
  
  public boolean getShowCoords()
  {
    return showCoords;
  }
  
  public boolean getLockNorth()
  {
    return lockNorth;
  }
  
  public boolean getAntiAliasing()
  {
    return (!Minimap.triedFBO) || ((antiAliasing) && (Minimap.usingFBO()));
  }
  
  public int getMinimapSize()
  {
    if (mapSize > -1) {
      return mapSize;
    }
    int height = Ae;
    int width = Ad;
    int size = height <= width ? height : width;
    if (size <= 480) {
      return 0;
    }
    if (size <= 720) {
      return 1;
    }
    if (size <= 1080) {
      return 2;
    }
    return 3;
  }
  
  public void saveWaypoints()
    throws IOException
  {
    PrintWriter writer = new PrintWriter(new FileWriter(XaeroMinimap.waypointsFile));
    if (!Minimap.waypointMap.isEmpty())
    {
      Set<Map.Entry<String, WaypointWorld>> keyMap = Minimap.waypointMap.entrySet();
      for (Map.Entry<String, WaypointWorld> entry : keyMap)
      {
        String worldID = (String)entry.getKey();
        WaypointWorld world = (WaypointWorld)entry.getValue();
        Object[] keys = sets.keySet().toArray();
        if (keys.length > 1)
        {
          writer.print("world:" + worldID + ":" + current);
          for (int i = 0; i < keys.length; i++)
          {
            String name = (String)keys[i];
            if (!name.equals(current)) {
              writer.print(":" + (String)keys[i]);
            }
          }
          writer.println("");
        }
        String name;
        for (int i = 0; i < keys.length; i++)
        {
          name = (String)keys[i];
          WaypointSet set = (WaypointSet)sets.get(name);
          if (set != null) {
            for (Waypoint w : list) {
              writer.println("waypoint:" + worldID + ":" + name + ":" + symbol + ":" + x + ":" + y + ":" + z + ":" + color + ":" + disabled + ":" + type + ":" + name + ":" + rotation + ":" + yaw);
            }
          }
        }
      }
    }
    writer.close();
  }
  
  public boolean loadWaypoints(File file)
    throws IOException
  {
    if (!file.exists()) {
      return false;
    }
    Minimap.waypointMap.clear();
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String s;
    while ((s = reader.readLine()) != null)
    {
      String[] args = s.split(":");
      try
      {
        if (args[0].equalsIgnoreCase("world"))
        {
          if (!args[1].contains("_"))
          {
            int tmp85_84 = 1; String[] tmp85_82 = args;tmp85_82[tmp85_84] = (tmp85_82[tmp85_84] + "_null");
          }
          Minimap.addWorld(args[1]);
          WaypointWorld map = (WaypointWorld)Minimap.waypointMap.get(args[1]);
          current = args[2];
          for (int i = 2; i < args.length; i++) {
            sets.put(args[i], new WaypointSet(map));
          }
        }
        else
        {
          if (!args[0].equalsIgnoreCase("waypoint")) {
            continue;
          }
          if (!args[1].contains("_"))
          {
            int tmp213_212 = 1; String[] tmp213_210 = args;tmp213_210[tmp213_212] = (tmp213_210[tmp213_212] + "_null");
          }
          Minimap.addWorld(args[1]);
          String setName = "gui.xaero_default";
          if (args.length > 10) {
            setName = args[10];
          }
          WaypointWorld map2 = (WaypointWorld)Minimap.waypointMap.get(args[1]);
          WaypointSet waypoints = (WaypointSet)sets.get(setName);
          if (waypoints == null) {
            sets.put(setName, waypoints = new WaypointSet(map2));
          }
          Waypoint loadWaypoint = new Waypoint(Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]), args[2], args[3], Integer.parseInt(args[7]));
          if (args.length > 8) {
            disabled = args[8].equals("true");
          }
          if (args.length > 9) {
            type = Integer.parseInt(args[9]);
          }
          if (args.length > 11) {
            rotation = args[11].equals("true");
          }
          if (args.length > 12) {
            yaw = Integer.parseInt(args[12]);
          }
          list.add(loadWaypoint);
        }
      }
      catch (Exception e)
      {
        System.out.println("Skipping setting:" + args[0]);
      }
    }
    return true;
  }
  
  public void saveSettings()
    throws IOException
  {
    PrintWriter writer = new PrintWriter(new FileWriter(XaeroMinimap.optionsFile));
    writer.println("ignoreUpdate:" + ignoreUpdate);
    writer.println("updateNotification:" + updateNotification);
    writer.println("settingsButton:" + settingsButton);
    writer.println("minimap:" + minimap);
    writer.println("caveMaps:" + caveMaps);
    writer.println("showPlayers:" + showPlayers);
    writer.println("showHostile:" + showHostile);
    writer.println("showMobs:" + showMobs);
    writer.println("showItems:" + showItems);
    writer.println("showOther:" + showOther);
    writer.println("showOtherTeam:" + showOtherTeam);
    writer.println("showWaypoints:" + showWaypoints);
    writer.println("showIngameWaypoints:" + showIngameWaypoints);
    writer.println("displayRedstone:" + displayRedstone);
    writer.println("deathpoints:" + deathpoints);
    writer.println("oldDeathpoints:" + oldDeathpoints);
    writer.println("distance:" + distance);
    writer.println("showCoords:" + showCoords);
    writer.println("lockNorth:" + lockNorth);
    writer.println("zoom:" + zoom);
    writer.println("mapSize:" + mapSize);
    writer.println("entityAmount:" + entityAmount);
    writer.println("chunkGrid:" + chunkGrid);
    writer.println("slimeChunks:" + slimeChunks);
    writer.println("playersColor:" + playersColor);
    writer.println("mobsColor:" + mobsColor);
    writer.println("hostileColor:" + hostileColor);
    writer.println("itemsColor:" + itemsColor);
    writer.println("otherColor:" + otherColor);
    writer.println("mapSafeMode:" + mapSafeMode);
    writer.println("minimapOpacity:" + minimapOpacity);
    writer.println("waypointsScale:" + waypointsScale);
    writer.println("antiAliasing:" + antiAliasing);
    writer.println("blockColours:" + blockColours);
    writer.println("lighting:" + lighting);
    writer.println("dotsScale:" + waypointsScale);
    writer.println("compassOverWaypoints:" + compassOverWaypoints);
    writer.println("showBiome:" + showBiome);
    writer.println("showEntityHeight:" + showEntityHeight);
    writer.println("showFlowers:" + showFlowers);
    for (Interface l : InterfaceHandler.list) {
      writer.println("interface:" + iname + ":" + actualx + ":" + actualy + ":" + centered + ":" + flipped + ":" + fromRight);
    }
    writer.println("#WAYPOINTS HAVE BEEN MOVED TO xaerowaypoints.txt!");
    for (int i = 0; i < ControlsHandler.toAdd.length; i++)
    {
      avb kb = ControlsHandler.toAdd[i];
      writer.println("key_" + kb.g() + ":" + kb.i());
    }
    writer.close();
    saveWaypoints();
  }
  
  public void loadSettings()
    throws IOException
  {
    if (!XaeroMinimap.optionsFile.exists())
    {
      saveSettings();
      return;
    }
    BufferedReader reader = new BufferedReader(new FileReader(XaeroMinimap.optionsFile));
    String s;
    while ((s = reader.readLine()) != null)
    {
      String[] args = s.split(":");
      try
      {
        if (args[0].equalsIgnoreCase("ignoreUpdate"))
        {
          ignoreUpdate = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("updateNotification"))
        {
          updateNotification = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("settingsButton"))
        {
          settingsButton = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("minimap"))
        {
          minimap = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("caveMaps"))
        {
          caveMaps = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showPlayers"))
        {
          showPlayers = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showHostile"))
        {
          showHostile = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showMobs"))
        {
          showMobs = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showItems"))
        {
          showItems = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showOther"))
        {
          showOther = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showOtherTeam"))
        {
          showOtherTeam = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showWaypoints"))
        {
          showWaypoints = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("deathpoints"))
        {
          deathpoints = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("oldDeathpoints"))
        {
          oldDeathpoints = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showIngameWaypoints"))
        {
          showIngameWaypoints = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("displayRedstone"))
        {
          displayRedstone = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("distance"))
        {
          distance = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("showCoords"))
        {
          showCoords = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("lockNorth"))
        {
          lockNorth = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("zoom"))
        {
          zoom = Integer.parseInt(args[1]);
          if (zoom < zooms.length) {
            continue;
          }
          zoom = (zooms.length - 1);
        }
        else if (args[0].equalsIgnoreCase("mapSize"))
        {
          mapSize = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("entityAmount"))
        {
          entityAmount = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("chunkGrid"))
        {
          chunkGrid = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("slimeChunks"))
        {
          slimeChunks = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("playersColor"))
        {
          playersColor = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("mobsColor"))
        {
          mobsColor = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("hostileColor"))
        {
          hostileColor = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("itemsColor"))
        {
          itemsColor = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("otherColor"))
        {
          otherColor = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("mapSafeMode"))
        {
          mapSafeMode = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("minimapOpacity"))
        {
          minimapOpacity = Float.valueOf(args[1]).floatValue();
        }
        else if (args[0].equalsIgnoreCase("waypointsScale"))
        {
          waypointsScale = Float.valueOf(args[1]).floatValue();
        }
        else if (args[0].equalsIgnoreCase("antiAliasing"))
        {
          antiAliasing = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("blockColours"))
        {
          blockColours = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("lighting"))
        {
          lighting = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("dotsScale"))
        {
          dotsScale = Float.valueOf(args[1]).floatValue();
        }
        else if (args[0].equalsIgnoreCase("compassOverWaypoints"))
        {
          compassOverWaypoints = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showBiome"))
        {
          showBiome = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showEntityHeight"))
        {
          showEntityHeight = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showFlowers"))
        {
          showFlowers = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("interface"))
        {
          for (Interface l : InterfaceHandler.list) {
            if (args[1].equals(iname))
            {
              Interface interface1 = l;
              Interface interface2 = l;
              Interface interface3 = l;
              int int1 = Integer.parseInt(args[2]);
              x = int1;
              actualx = int1;
              bx = int1;
              Interface interface4 = l;
              Interface interface5 = l;
              Interface interface6 = l;
              int int2 = Integer.parseInt(args[3]);
              y = int2;
              actualy = int2;
              by = int2;
              Interface interface7 = l;
              Interface interface8 = l;
              boolean equals = args[4].equals("true");
              centered = equals;
              bcentered = equals;
              Interface interface9 = l;
              Interface interface10 = l;
              boolean equals2 = args[5].equals("true");
              flipped = equals2;
              bflipped = equals2;
              Interface interface11 = l;
              Interface interface12 = l;
              boolean equals3 = args[6].equals("true");
              fromRight = equals3;
              bfromRight = equals3;
            }
          }
        }
        else
        {
          if (!args[0].startsWith("key_")) {
            continue;
          }
          for (int i = 0; i < ControlsHandler.toAdd.length; i++)
          {
            avb kb = ControlsHandler.toAdd[i];
            if (kb.g().equals(args[0].substring(4)))
            {
              kb.b(Integer.parseInt(args[1]));
              break;
            }
          }
        }
      }
      catch (Exception e)
      {
        System.out.println("Skipping setting:" + args[0]);
      }
    }
    if (!loadWaypoints(XaeroMinimap.waypointsFile)) {
      loadWaypoints(XaeroMinimap.optionsFile);
    }
    avb.b();
  }
  
  public String getKeyBinding(ModOptions par1EnumOptions)
  {
    String s = par1EnumOptions.getEnumString() + ": ";
    if ((par1EnumOptions == ModOptions.DOTS_SCALE) && (!Minimap.usingFBO())) {
      return s + "§e" + getTranslation(false);
    }
    if (par1EnumOptions.getEnumFloat())
    {
      float f1 = getOptionFloatValue(par1EnumOptions);
      return s + f1;
    }
    if (par1EnumOptions == ModOptions.EDIT)
    {
      s = par1EnumOptions.getEnumString();
    }
    else if (par1EnumOptions == ModOptions.DOTS)
    {
      s = par1EnumOptions.getEnumString();
    }
    else if (par1EnumOptions == ModOptions.RESET)
    {
      s = par1EnumOptions.getEnumString();
    }
    else if (par1EnumOptions == ModOptions.ZOOM)
    {
      s = s + zooms[zoom] + "x";
    }
    else if (par1EnumOptions == ModOptions.COLOURS)
    {
      s = s + bnq.a(blockColourTypes[blockColours], new Object[0]);
    }
    else if (par1EnumOptions == ModOptions.DISTANCE)
    {
      s = s + bnq.a(distanceTypes[distance], new Object[0]);
    }
    else if ((par1EnumOptions == ModOptions.SLIME_CHUNKS) && (customSlimeSeedNeeded()))
    {
      s = par1EnumOptions.getEnumString();
    }
    else if (par1EnumOptions == ModOptions.SIZE)
    {
      s = s + bnq.a(mapSize > -1 ? MINIMAP_SIZE[mapSize] : "gui.xaero_auto_map_size", new Object[0]);
    }
    else if (par1EnumOptions == ModOptions.EAMOUNT)
    {
      s = s + 100 * entityAmount;
    }
    else
    {
      boolean clientSetting = getClientBooleanValue(par1EnumOptions);
      boolean serverSetting = getBooleanValue(par1EnumOptions);
      s = s + getTranslation(clientSetting) + (serverSetting != clientSetting ? "§e (" + getTranslation(serverSetting) + ")" : "");
    }
    return s;
  }
  
  public boolean getBooleanValue(ModOptions o)
  {
    if (o == ModOptions.MINIMAP) {
      return getMinimap();
    }
    if (o == ModOptions.CAVE_MAPS) {
      return getCaveMaps();
    }
    if (o == ModOptions.DISPLAY_OTHER_TEAM) {
      return getShowOtherTeam();
    }
    if (o == ModOptions.WAYPOINTS) {
      return getShowWaypoints();
    }
    if (o == ModOptions.DEATHPOINTS) {
      return getDeathpoints();
    }
    if (o == ModOptions.OLD_DEATHPOINTS) {
      return getOldDeathpoints();
    }
    if (o == ModOptions.INGAME_WAYPOINTS) {
      return getShowIngameWaypoints();
    }
    if (o == ModOptions.COORDS) {
      return getShowCoords();
    }
    if (o == ModOptions.NORTH) {
      return getLockNorth();
    }
    if (o == ModOptions.PLAYERS) {
      return getShowPlayers();
    }
    if (o == ModOptions.HOSTILE) {
      return getShowHostile();
    }
    if (o == ModOptions.MOBS) {
      return getShowMobs();
    }
    if (o == ModOptions.ITEMS) {
      return getShowItems();
    }
    if (o == ModOptions.ENTITIES) {
      return getShowOther();
    }
    if (o == ModOptions.CHUNK_GRID) {
      return getChunkGrid();
    }
    if (o == ModOptions.SAFE_MAP) {
      return (Minimap.triedFBO) && (!Minimap.usingFBO());
    }
    if (o == ModOptions.AA) {
      return getAntiAliasing();
    }
    return getClientBooleanValue(o);
  }
  
  public boolean getClientBooleanValue(ModOptions o)
  {
    if (o == ModOptions.MINIMAP) {
      return minimap;
    }
    if (o == ModOptions.CAVE_MAPS) {
      return caveMaps;
    }
    if (o == ModOptions.DISPLAY_OTHER_TEAM) {
      return showOtherTeam;
    }
    if (o == ModOptions.WAYPOINTS) {
      return showWaypoints;
    }
    if (o == ModOptions.DEATHPOINTS) {
      return deathpoints;
    }
    if (o == ModOptions.OLD_DEATHPOINTS) {
      return oldDeathpoints;
    }
    if (o == ModOptions.INGAME_WAYPOINTS) {
      return showIngameWaypoints;
    }
    if (o == ModOptions.REDSTONE) {
      return displayRedstone;
    }
    if (o == ModOptions.COORDS) {
      return showCoords;
    }
    if (o == ModOptions.NORTH) {
      return lockNorth;
    }
    if (o == ModOptions.PLAYERS) {
      return showPlayers;
    }
    if (o == ModOptions.HOSTILE) {
      return showHostile;
    }
    if (o == ModOptions.MOBS) {
      return showMobs;
    }
    if (o == ModOptions.ITEMS) {
      return showItems;
    }
    if (o == ModOptions.ENTITIES) {
      return showOther;
    }
    if (o == ModOptions.CHUNK_GRID) {
      return chunkGrid;
    }
    if (o == ModOptions.SLIME_CHUNKS) {
      return slimeChunks;
    }
    if (o == ModOptions.SAFE_MAP) {
      return mapSafeMode;
    }
    if (o == ModOptions.AA) {
      return antiAliasing;
    }
    if (o == ModOptions.LIGHT) {
      return lighting;
    }
    if (o == ModOptions.COMPASS) {
      return compassOverWaypoints;
    }
    if (o == ModOptions.BIOME) {
      return showBiome;
    }
    if (o == ModOptions.ENTITY_HEIGHT) {
      return showEntityHeight;
    }
    return (o == ModOptions.FLOWERS) && (showFlowers);
  }
  
  private static String getTranslation(boolean o)
  {
    return bnq.a("gui.xaero_" + (o ? "on" : "off"), new Object[0]);
  }
  
  public void setOptionValue(ModOptions par1EnumOptions, int par2)
    throws IOException
  {
    if (par1EnumOptions == ModOptions.ZOOM)
    {
      zoom = ((zoom + 1) % zooms.length);
    }
    else if (par1EnumOptions == ModOptions.SIZE)
    {
      if (mapSize == 3) {
        mapSize = -1;
      } else {
        mapSize = ((mapSize + 1) % 4);
      }
    }
    else if (par1EnumOptions == ModOptions.EAMOUNT)
    {
      entityAmount = ((entityAmount + 1) % 11);
    }
    else if (par1EnumOptions == ModOptions.MINIMAP)
    {
      minimap = (!minimap);
    }
    else if (par1EnumOptions == ModOptions.CAVE_MAPS)
    {
      caveMaps = (!caveMaps);
    }
    else if (par1EnumOptions == ModOptions.DISPLAY_OTHER_TEAM)
    {
      showOtherTeam = (!showOtherTeam);
    }
    else if (par1EnumOptions == ModOptions.WAYPOINTS)
    {
      showWaypoints = (!showWaypoints);
    }
    else if (par1EnumOptions == ModOptions.DEATHPOINTS)
    {
      deathpoints = (!deathpoints);
    }
    else if (par1EnumOptions == ModOptions.OLD_DEATHPOINTS)
    {
      oldDeathpoints = (!oldDeathpoints);
    }
    else if (par1EnumOptions == ModOptions.INGAME_WAYPOINTS)
    {
      showIngameWaypoints = (!showIngameWaypoints);
    }
    else if (par1EnumOptions == ModOptions.REDSTONE)
    {
      displayRedstone = (!displayRedstone);
    }
    else if (par1EnumOptions == ModOptions.DISTANCE)
    {
      distance = ((distance + 1) % distanceTypes.length);
    }
    else if (par1EnumOptions == ModOptions.COORDS)
    {
      showCoords = (!showCoords);
    }
    else if (par1EnumOptions == ModOptions.NORTH)
    {
      lockNorth = (!lockNorth);
    }
    else if (par1EnumOptions == ModOptions.PLAYERS)
    {
      showPlayers = (!showPlayers);
    }
    else if (par1EnumOptions == ModOptions.HOSTILE)
    {
      showHostile = (!showHostile);
    }
    else if (par1EnumOptions == ModOptions.MOBS)
    {
      showMobs = (!showMobs);
    }
    else if (par1EnumOptions == ModOptions.ITEMS)
    {
      showItems = (!showItems);
    }
    else if (par1EnumOptions == ModOptions.ENTITIES)
    {
      showOther = (!showOther);
    }
    else if (par1EnumOptions == ModOptions.CHUNK_GRID)
    {
      chunkGrid = (!chunkGrid);
      Minimap.frameUpdateNeeded = Minimap.usingFBO();
    }
    else if (par1EnumOptions == ModOptions.SLIME_CHUNKS)
    {
      if (customSlimeSeedNeeded())
      {
        ave.A().a(new GuiSlimeSeed());
        return;
      }
      slimeChunks = (!slimeChunks);
      Minimap.frameUpdateNeeded = Minimap.usingFBO();
    }
    else if (par1EnumOptions == ModOptions.SAFE_MAP)
    {
      mapSafeMode = (!mapSafeMode);
      Minimap.resetImage();
      Minimap.frameUpdateNeeded = Minimap.usingFBO();
    }
    else if (par1EnumOptions == ModOptions.AA)
    {
      antiAliasing = (!antiAliasing);
    }
    else if (par1EnumOptions == ModOptions.COLOURS)
    {
      blockColours = ((blockColours + 1) % blockColourTypes.length);
    }
    else if (par1EnumOptions == ModOptions.LIGHT)
    {
      lighting = (!lighting);
    }
    else if (par1EnumOptions == ModOptions.COMPASS)
    {
      compassOverWaypoints = (!compassOverWaypoints);
    }
    else if (par1EnumOptions == ModOptions.BIOME)
    {
      showBiome = (!showBiome);
    }
    else if (par1EnumOptions == ModOptions.ENTITY_HEIGHT)
    {
      showEntityHeight = (!showEntityHeight);
    }
    else if (par1EnumOptions == ModOptions.FLOWERS)
    {
      showFlowers = (!showFlowers);
    }
    saveSettings();
    if (Am != null) {
      Am.b();
    }
  }
  
  public void setOptionFloatValue(ModOptions options, float f)
    throws IOException
  {
    if (options == ModOptions.OPACITY) {
      minimapOpacity = f;
    }
    if (options == ModOptions.WAYPOINTS_SCALE) {
      waypointsScale = f;
    }
    if (options == ModOptions.DOTS_SCALE) {
      dotsScale = f;
    }
    saveSettings();
  }
  
  public float getOptionFloatValue(ModOptions options)
  {
    if (options == ModOptions.OPACITY) {
      return minimapOpacity;
    }
    if (options == ModOptions.WAYPOINTS_SCALE) {
      return waypointsScale;
    }
    if (options == ModOptions.DOTS_SCALE) {
      return dotsScale;
    }
    return 1.0F;
  }
  
  public boolean minimapDisabled()
  {
    return (serverSettings & 0x1) != 1;
  }
  
  public boolean minimapDisplayPlayersDisabled()
  {
    return (serverSettings & 0x400) != 1024;
  }
  
  public boolean minimapDisplayMobsDisabled()
  {
    return (serverSettings & 0x800) != 2048;
  }
  
  public boolean minimapDisplayItemsDisabled()
  {
    return (serverSettings & 0x1000) != 4096;
  }
  
  public boolean minimapDisplayOtherDisabled()
  {
    return (serverSettings & 0x2000) != 8192;
  }
  
  public boolean caveMapsDisabled()
  {
    return (serverSettings & 0x4000) != 16384;
  }
  
  public boolean showOtherTeamDisabled()
  {
    return (serverSettings & 0x8000) != 32768;
  }
  
  public boolean showWaypointsDisabled()
  {
    return (serverSettings & 0x10000) != 65536;
  }
  
  public boolean deathpointsDisabled()
  {
    return (serverSettings & 0x200000) == 0;
  }
  
  public void resetServerSettings()
  {
    serverSettings = Integer.MAX_VALUE;
  }
  
  private static boolean keysLoaded = false;
  public static final String[] ENCHANT_COLORS = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
  public static final String[] ENCHANT_COLOR_NAMES = { "gui.xaero_black", "gui.xaero_dark_blue", "gui.xaero_dark_green", "gui.xaero_dark_aqua", "gui.xaero_dark_red", "gui.xaero_dark_purple", "gui.xaero_gold", "gui.xaero_gray", "gui.xaero_dark_gray", "gui.xaero_blue", "gui.xaero_green", "gui.xaero_aqua", "gui.xaero_red", "gui.xaero_purple", "gui.xaero_yellow", "gui.xaero_white" };
  public static final int[] COLORS = { new Color(0, 0, 0, 255).hashCode(), new Color(0, 0, 170, 255).hashCode(), new Color(0, 170, 0, 255).hashCode(), new Color(0, 170, 170, 255).hashCode(), new Color(170, 0, 0, 255).hashCode(), new Color(170, 0, 170, 255).hashCode(), new Color(255, 170, 0, 255).hashCode(), new Color(170, 170, 170, 255).hashCode(), new Color(85, 85, 85, 255).hashCode(), new Color(85, 85, 255, 255).hashCode(), new Color(85, 255, 85, 255).hashCode(), new Color(85, 255, 255, 255).hashCode(), new Color(255, 0, 0, 255).hashCode(), new Color(255, 85, 255, 255).hashCode(), new Color(255, 255, 85, 255).hashCode(), new Color(255, 255, 255, 255).hashCode() };
  public static final String[] MINIMAP_SIZE = { "gui.xaero_tiny", "gui.xaero_small", "gui.xaero_medium", "gui.xaero_large" };
  public static int serverSettings = Integer.MAX_VALUE;
  public static avb keyBindSettings = new avb("gui.xaero_minimap_settings", 21, "Xaero's Minimap");
  public static avb keyBindZoom = new avb("gui.xaero_zoom_in", 23, "Xaero's Minimap");
  public static avb keyBindZoom1 = new avb("gui.xaero_zoom_out", 24, "Xaero's Minimap");
  public static avb newWaypoint = new avb("gui.xaero_new_waypoint", 48, "Xaero's Minimap");
  public static avb keyWaypoints = new avb("gui.xaero_waypoints_key", 22, "Xaero's Minimap");
  public static avb keyLargeMap = new avb("gui.xaero_enlarge_map", 44, "Xaero's Minimap");
  public static avb keyToggleMap = new avb("gui.xaero_toggle_map", 35, "Xaero's Minimap");
  public static avb keyToggleWaypoints = new avb("gui.xaero_toggle_waypoints", 40, "Xaero's Minimap");
  public static avb keyToggleSlimes = new avb("gui.xaero_toggle_slime", 0, "Xaero's Minimap");
  public static avb keyToggleGrid = new avb("gui.xaero_toggle_grid", 0, "Xaero's Minimap");
  public static avb keyInstantWaypoint = new avb("gui.xaero_instant_waypoint", 78, "Xaero's Minimap");
  private boolean minimap;
  public int zoom;
  public float[] zooms;
  public int entityAmount;
  private boolean showPlayers;
  private boolean showMobs;
  private boolean showHostile;
  private boolean showItems;
  private boolean showOther;
  private boolean caveMaps;
  private boolean showOtherTeam;
  private boolean showWaypoints;
  private boolean deathpoints;
  private boolean oldDeathpoints;
  private boolean chunkGrid;
  private boolean slimeChunks;
  public long serverSlimeSeed;
  private boolean showIngameWaypoints;
  private boolean showCoords;
  private boolean lockNorth;
  private boolean antiAliasing;
  public boolean displayRedstone;
  public boolean mapSafeMode;
  public int distance;
  public static final String[] distanceTypes = { "gui.xaero_off", "gui.xaero_looking_at", "gui.xaero_all" };
  public int blockColours;
  public static final String[] blockColourTypes = { "gui.xaero_accurate", "gui.xaero_vanilla" };
  public boolean lighting;
  public boolean compassOverWaypoints;
  private int mapSize;
  public int playersColor;
  public int mobsColor;
  public int hostileColor;
  public int itemsColor;
  public int otherColor;
  public float minimapOpacity;
  public float waypointsScale;
  public float dotsScale;
  public static boolean settingsButton = true;
  public boolean showBiome;
  public static boolean updateNotification = true;
  public boolean showEntityHeight;
  public boolean showFlowers;
  
  public static void setServerSettings() {}
}
