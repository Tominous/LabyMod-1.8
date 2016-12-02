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
    this.minimap = true;
    this.zoom = 2;
    this.zooms = new float[] { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
    this.entityAmount = 1;
    this.showPlayers = true;
    this.showMobs = true;
    this.showHostile = true;
    this.showItems = true;
    this.showOther = true;
    this.caveMaps = true;
    this.showOtherTeam = true;
    this.showWaypoints = true;
    this.deathpoints = true;
    this.oldDeathpoints = true;
    this.chunkGrid = false;
    this.slimeChunks = false;
    this.serverSlimeSeed = 0L;
    this.showIngameWaypoints = true;
    this.showCoords = true;
    this.lockNorth = false;
    this.antiAliasing = true;
    this.displayRedstone = true;
    this.mapSafeMode = false;
    this.distance = 1;
    this.blockColours = 0;
    this.lighting = true;
    this.compassOverWaypoints = false;
    this.mapSize = -1;
    this.playersColor = 15;
    this.mobsColor = 14;
    this.hostileColor = 14;
    this.itemsColor = 12;
    this.otherColor = 5;
    this.minimapOpacity = 100.0F;
    this.waypointsScale = 1.0F;
    this.dotsScale = 1.0F;
    this.showBiome = false;
    this.showEntityHeight = true;
    this.showFlowers = true;
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
    return (this.minimap) && (!minimapDisabled());
  }
  
  public boolean getShowPlayers()
  {
    return (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_RADAR) && (XaeroMinimap.allowPlayerRadar) && (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_PLAYER_RADAR) && (this.showPlayers) && (!minimapDisplayPlayersDisabled());
  }
  
  public boolean getShowMobs()
  {
    return (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_RADAR) && (XaeroMinimap.allowRadar) && (this.showMobs) && (!minimapDisplayMobsDisabled());
  }
  
  public boolean getShowHostile()
  {
    return (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_RADAR) && (XaeroMinimap.allowRadar) && (this.showHostile) && (!minimapDisplayMobsDisabled());
  }
  
  public boolean getShowItems()
  {
    return (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_RADAR) && (XaeroMinimap.allowRadar) && (this.showItems) && (!minimapDisplayItemsDisabled());
  }
  
  public boolean getShowOther()
  {
    return (ServerFilter.getCurrentFilterType() != ServerFilter.FilterType.NO_RADAR) && (XaeroMinimap.allowRadar) && (this.showOther) && (!minimapDisplayOtherDisabled());
  }
  
  public boolean getCaveMaps()
  {
    return (this.caveMaps) && (!caveMapsDisabled());
  }
  
  public boolean getShowOtherTeam()
  {
    return (this.showOtherTeam) && (!showOtherTeamDisabled());
  }
  
  public boolean getShowWaypoints()
  {
    return (this.showWaypoints) && (!showWaypointsDisabled());
  }
  
  public boolean getDeathpoints()
  {
    return (this.deathpoints) && (!deathpointsDisabled());
  }
  
  public boolean getOldDeathpoints()
  {
    return this.oldDeathpoints;
  }
  
  public boolean getChunkGrid()
  {
    return this.chunkGrid;
  }
  
  public boolean customSlimeSeedNeeded()
  {
    return (!(ave.A().m instanceof GuiSlimeSeed)) && (ave.A().G() == null) && (ave.A().f != null);
  }
  
  public boolean getSlimeChunks()
  {
    return (this.slimeChunks) && ((this.serverSlimeSeed != -1L) || (ave.A().G() != null));
  }
  
  public boolean getShowIngameWaypoints()
  {
    return (this.showIngameWaypoints) && (!showWaypointsDisabled());
  }
  
  public boolean getShowCoords()
  {
    return this.showCoords;
  }
  
  public boolean getLockNorth()
  {
    return this.lockNorth;
  }
  
  public boolean getAntiAliasing()
  {
    return (!Minimap.triedFBO) || ((this.antiAliasing) && (Minimap.usingFBO()));
  }
  
  public int getMinimapSize()
  {
    if (this.mapSize > -1) {
      return this.mapSize;
    }
    int height = ave.A().e;
    int width = ave.A().d;
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
        Object[] keys = world.sets.keySet().toArray();
        if (keys.length > 1)
        {
          writer.print("world:" + worldID + ":" + world.current);
          for (int i = 0; i < keys.length; i++)
          {
            String name = (String)keys[i];
            if (!name.equals(world.current)) {
              writer.print(":" + (String)keys[i]);
            }
          }
          writer.println("");
        }
        String name;
        for (int i = 0; i < keys.length; i++)
        {
          name = (String)keys[i];
          WaypointSet set = (WaypointSet)world.sets.get(name);
          if (set != null) {
            for (Waypoint w : set.list) {
              writer.println("waypoint:" + worldID + ":" + w.name + ":" + w.symbol + ":" + w.x + ":" + w.y + ":" + w.z + ":" + w.color + ":" + w.disabled + ":" + w.type + ":" + name + ":" + w.rotation + ":" + w.yaw);
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
          map.current = args[2];
          for (int i = 2; i < args.length; i++) {
            map.sets.put(args[i], new WaypointSet(map));
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
          WaypointSet waypoints = (WaypointSet)map2.sets.get(setName);
          if (waypoints == null) {
            map2.sets.put(setName, waypoints = new WaypointSet(map2));
          }
          Waypoint loadWaypoint = new Waypoint(Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]), args[2], args[3], Integer.parseInt(args[7]));
          if (args.length > 8) {
            loadWaypoint.disabled = args[8].equals("true");
          }
          if (args.length > 9) {
            loadWaypoint.type = Integer.parseInt(args[9]);
          }
          if (args.length > 11) {
            loadWaypoint.rotation = args[11].equals("true");
          }
          if (args.length > 12) {
            loadWaypoint.yaw = Integer.parseInt(args[12]);
          }
          waypoints.list.add(loadWaypoint);
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
    writer.println("minimap:" + this.minimap);
    writer.println("caveMaps:" + this.caveMaps);
    writer.println("showPlayers:" + this.showPlayers);
    writer.println("showHostile:" + this.showHostile);
    writer.println("showMobs:" + this.showMobs);
    writer.println("showItems:" + this.showItems);
    writer.println("showOther:" + this.showOther);
    writer.println("showOtherTeam:" + this.showOtherTeam);
    writer.println("showWaypoints:" + this.showWaypoints);
    writer.println("showIngameWaypoints:" + this.showIngameWaypoints);
    writer.println("displayRedstone:" + this.displayRedstone);
    writer.println("deathpoints:" + this.deathpoints);
    writer.println("oldDeathpoints:" + this.oldDeathpoints);
    writer.println("distance:" + this.distance);
    writer.println("showCoords:" + this.showCoords);
    writer.println("lockNorth:" + this.lockNorth);
    writer.println("zoom:" + this.zoom);
    writer.println("mapSize:" + this.mapSize);
    writer.println("entityAmount:" + this.entityAmount);
    writer.println("chunkGrid:" + this.chunkGrid);
    writer.println("slimeChunks:" + this.slimeChunks);
    writer.println("playersColor:" + this.playersColor);
    writer.println("mobsColor:" + this.mobsColor);
    writer.println("hostileColor:" + this.hostileColor);
    writer.println("itemsColor:" + this.itemsColor);
    writer.println("otherColor:" + this.otherColor);
    writer.println("mapSafeMode:" + this.mapSafeMode);
    writer.println("minimapOpacity:" + this.minimapOpacity);
    writer.println("waypointsScale:" + this.waypointsScale);
    writer.println("antiAliasing:" + this.antiAliasing);
    writer.println("blockColours:" + this.blockColours);
    writer.println("lighting:" + this.lighting);
    writer.println("dotsScale:" + this.waypointsScale);
    writer.println("compassOverWaypoints:" + this.compassOverWaypoints);
    writer.println("showBiome:" + this.showBiome);
    writer.println("showEntityHeight:" + this.showEntityHeight);
    writer.println("showFlowers:" + this.showFlowers);
    for (Interface l : InterfaceHandler.list) {
      writer.println("interface:" + l.iname + ":" + l.actualx + ":" + l.actualy + ":" + l.centered + ":" + l.flipped + ":" + l.fromRight);
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
          this.minimap = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("caveMaps"))
        {
          this.caveMaps = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showPlayers"))
        {
          this.showPlayers = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showHostile"))
        {
          this.showHostile = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showMobs"))
        {
          this.showMobs = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showItems"))
        {
          this.showItems = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showOther"))
        {
          this.showOther = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showOtherTeam"))
        {
          this.showOtherTeam = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showWaypoints"))
        {
          this.showWaypoints = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("deathpoints"))
        {
          this.deathpoints = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("oldDeathpoints"))
        {
          this.oldDeathpoints = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showIngameWaypoints"))
        {
          this.showIngameWaypoints = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("displayRedstone"))
        {
          this.displayRedstone = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("distance"))
        {
          this.distance = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("showCoords"))
        {
          this.showCoords = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("lockNorth"))
        {
          this.lockNorth = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("zoom"))
        {
          this.zoom = Integer.parseInt(args[1]);
          if (this.zoom < this.zooms.length) {
            continue;
          }
          this.zoom = (this.zooms.length - 1);
        }
        else if (args[0].equalsIgnoreCase("mapSize"))
        {
          this.mapSize = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("entityAmount"))
        {
          this.entityAmount = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("chunkGrid"))
        {
          this.chunkGrid = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("slimeChunks"))
        {
          this.slimeChunks = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("playersColor"))
        {
          this.playersColor = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("mobsColor"))
        {
          this.mobsColor = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("hostileColor"))
        {
          this.hostileColor = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("itemsColor"))
        {
          this.itemsColor = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("otherColor"))
        {
          this.otherColor = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("mapSafeMode"))
        {
          this.mapSafeMode = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("minimapOpacity"))
        {
          this.minimapOpacity = Float.valueOf(args[1]).floatValue();
        }
        else if (args[0].equalsIgnoreCase("waypointsScale"))
        {
          this.waypointsScale = Float.valueOf(args[1]).floatValue();
        }
        else if (args[0].equalsIgnoreCase("antiAliasing"))
        {
          this.antiAliasing = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("blockColours"))
        {
          this.blockColours = Integer.parseInt(args[1]);
        }
        else if (args[0].equalsIgnoreCase("lighting"))
        {
          this.lighting = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("dotsScale"))
        {
          this.dotsScale = Float.valueOf(args[1]).floatValue();
        }
        else if (args[0].equalsIgnoreCase("compassOverWaypoints"))
        {
          this.compassOverWaypoints = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showBiome"))
        {
          this.showBiome = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showEntityHeight"))
        {
          this.showEntityHeight = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("showFlowers"))
        {
          this.showFlowers = args[1].equals("true");
        }
        else if (args[0].equalsIgnoreCase("interface"))
        {
          for (Interface l : InterfaceHandler.list) {
            if (args[1].equals(l.iname))
            {
              Interface interface1 = l;
              Interface interface2 = l;
              Interface interface3 = l;
              int int1 = Integer.parseInt(args[2]);
              interface3.x = int1;
              interface2.actualx = int1;
              interface1.bx = int1;
              Interface interface4 = l;
              Interface interface5 = l;
              Interface interface6 = l;
              int int2 = Integer.parseInt(args[3]);
              interface6.y = int2;
              interface5.actualy = int2;
              interface4.by = int2;
              Interface interface7 = l;
              Interface interface8 = l;
              boolean equals = args[4].equals("true");
              interface8.centered = equals;
              interface7.bcentered = equals;
              Interface interface9 = l;
              Interface interface10 = l;
              boolean equals2 = args[5].equals("true");
              interface10.flipped = equals2;
              interface9.bflipped = equals2;
              Interface interface11 = l;
              Interface interface12 = l;
              boolean equals3 = args[6].equals("true");
              interface12.fromRight = equals3;
              interface11.bfromRight = equals3;
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
      s = s + this.zooms[this.zoom] + "x";
    }
    else if (par1EnumOptions == ModOptions.COLOURS)
    {
      s = s + bnq.a(blockColourTypes[this.blockColours], new Object[0]);
    }
    else if (par1EnumOptions == ModOptions.DISTANCE)
    {
      s = s + bnq.a(distanceTypes[this.distance], new Object[0]);
    }
    else if ((par1EnumOptions == ModOptions.SLIME_CHUNKS) && (customSlimeSeedNeeded()))
    {
      s = par1EnumOptions.getEnumString();
    }
    else if (par1EnumOptions == ModOptions.SIZE)
    {
      s = s + bnq.a(this.mapSize > -1 ? MINIMAP_SIZE[this.mapSize] : "gui.xaero_auto_map_size", new Object[0]);
    }
    else if (par1EnumOptions == ModOptions.EAMOUNT)
    {
      s = s + 100 * this.entityAmount;
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
      return this.minimap;
    }
    if (o == ModOptions.CAVE_MAPS) {
      return this.caveMaps;
    }
    if (o == ModOptions.DISPLAY_OTHER_TEAM) {
      return this.showOtherTeam;
    }
    if (o == ModOptions.WAYPOINTS) {
      return this.showWaypoints;
    }
    if (o == ModOptions.DEATHPOINTS) {
      return this.deathpoints;
    }
    if (o == ModOptions.OLD_DEATHPOINTS) {
      return this.oldDeathpoints;
    }
    if (o == ModOptions.INGAME_WAYPOINTS) {
      return this.showIngameWaypoints;
    }
    if (o == ModOptions.REDSTONE) {
      return this.displayRedstone;
    }
    if (o == ModOptions.COORDS) {
      return this.showCoords;
    }
    if (o == ModOptions.NORTH) {
      return this.lockNorth;
    }
    if (o == ModOptions.PLAYERS) {
      return this.showPlayers;
    }
    if (o == ModOptions.HOSTILE) {
      return this.showHostile;
    }
    if (o == ModOptions.MOBS) {
      return this.showMobs;
    }
    if (o == ModOptions.ITEMS) {
      return this.showItems;
    }
    if (o == ModOptions.ENTITIES) {
      return this.showOther;
    }
    if (o == ModOptions.CHUNK_GRID) {
      return this.chunkGrid;
    }
    if (o == ModOptions.SLIME_CHUNKS) {
      return this.slimeChunks;
    }
    if (o == ModOptions.SAFE_MAP) {
      return this.mapSafeMode;
    }
    if (o == ModOptions.AA) {
      return this.antiAliasing;
    }
    if (o == ModOptions.LIGHT) {
      return this.lighting;
    }
    if (o == ModOptions.COMPASS) {
      return this.compassOverWaypoints;
    }
    if (o == ModOptions.BIOME) {
      return this.showBiome;
    }
    if (o == ModOptions.ENTITY_HEIGHT) {
      return this.showEntityHeight;
    }
    return (o == ModOptions.FLOWERS) && (this.showFlowers);
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
      this.zoom = ((this.zoom + 1) % this.zooms.length);
    }
    else if (par1EnumOptions == ModOptions.SIZE)
    {
      if (this.mapSize == 3) {
        this.mapSize = -1;
      } else {
        this.mapSize = ((this.mapSize + 1) % 4);
      }
    }
    else if (par1EnumOptions == ModOptions.EAMOUNT)
    {
      this.entityAmount = ((this.entityAmount + 1) % 11);
    }
    else if (par1EnumOptions == ModOptions.MINIMAP)
    {
      this.minimap = (!this.minimap);
    }
    else if (par1EnumOptions == ModOptions.CAVE_MAPS)
    {
      this.caveMaps = (!this.caveMaps);
    }
    else if (par1EnumOptions == ModOptions.DISPLAY_OTHER_TEAM)
    {
      this.showOtherTeam = (!this.showOtherTeam);
    }
    else if (par1EnumOptions == ModOptions.WAYPOINTS)
    {
      this.showWaypoints = (!this.showWaypoints);
    }
    else if (par1EnumOptions == ModOptions.DEATHPOINTS)
    {
      this.deathpoints = (!this.deathpoints);
    }
    else if (par1EnumOptions == ModOptions.OLD_DEATHPOINTS)
    {
      this.oldDeathpoints = (!this.oldDeathpoints);
    }
    else if (par1EnumOptions == ModOptions.INGAME_WAYPOINTS)
    {
      this.showIngameWaypoints = (!this.showIngameWaypoints);
    }
    else if (par1EnumOptions == ModOptions.REDSTONE)
    {
      this.displayRedstone = (!this.displayRedstone);
    }
    else if (par1EnumOptions == ModOptions.DISTANCE)
    {
      this.distance = ((this.distance + 1) % distanceTypes.length);
    }
    else if (par1EnumOptions == ModOptions.COORDS)
    {
      this.showCoords = (!this.showCoords);
    }
    else if (par1EnumOptions == ModOptions.NORTH)
    {
      this.lockNorth = (!this.lockNorth);
    }
    else if (par1EnumOptions == ModOptions.PLAYERS)
    {
      this.showPlayers = (!this.showPlayers);
    }
    else if (par1EnumOptions == ModOptions.HOSTILE)
    {
      this.showHostile = (!this.showHostile);
    }
    else if (par1EnumOptions == ModOptions.MOBS)
    {
      this.showMobs = (!this.showMobs);
    }
    else if (par1EnumOptions == ModOptions.ITEMS)
    {
      this.showItems = (!this.showItems);
    }
    else if (par1EnumOptions == ModOptions.ENTITIES)
    {
      this.showOther = (!this.showOther);
    }
    else if (par1EnumOptions == ModOptions.CHUNK_GRID)
    {
      this.chunkGrid = (!this.chunkGrid);
      Minimap.frameUpdateNeeded = Minimap.usingFBO();
    }
    else if (par1EnumOptions == ModOptions.SLIME_CHUNKS)
    {
      if (customSlimeSeedNeeded())
      {
        ave.A().a(new GuiSlimeSeed());
        return;
      }
      this.slimeChunks = (!this.slimeChunks);
      Minimap.frameUpdateNeeded = Minimap.usingFBO();
    }
    else if (par1EnumOptions == ModOptions.SAFE_MAP)
    {
      this.mapSafeMode = (!this.mapSafeMode);
      Minimap.resetImage();
      Minimap.frameUpdateNeeded = Minimap.usingFBO();
    }
    else if (par1EnumOptions == ModOptions.AA)
    {
      this.antiAliasing = (!this.antiAliasing);
    }
    else if (par1EnumOptions == ModOptions.COLOURS)
    {
      this.blockColours = ((this.blockColours + 1) % blockColourTypes.length);
    }
    else if (par1EnumOptions == ModOptions.LIGHT)
    {
      this.lighting = (!this.lighting);
    }
    else if (par1EnumOptions == ModOptions.COMPASS)
    {
      this.compassOverWaypoints = (!this.compassOverWaypoints);
    }
    else if (par1EnumOptions == ModOptions.BIOME)
    {
      this.showBiome = (!this.showBiome);
    }
    else if (par1EnumOptions == ModOptions.ENTITY_HEIGHT)
    {
      this.showEntityHeight = (!this.showEntityHeight);
    }
    else if (par1EnumOptions == ModOptions.FLOWERS)
    {
      this.showFlowers = (!this.showFlowers);
    }
    saveSettings();
    if (ave.A().m != null) {
      ave.A().m.b();
    }
  }
  
  public void setOptionFloatValue(ModOptions options, float f)
    throws IOException
  {
    if (options == ModOptions.OPACITY) {
      this.minimapOpacity = f;
    }
    if (options == ModOptions.WAYPOINTS_SCALE) {
      this.waypointsScale = f;
    }
    if (options == ModOptions.DOTS_SCALE) {
      this.dotsScale = f;
    }
    saveSettings();
  }
  
  public float getOptionFloatValue(ModOptions options)
  {
    if (options == ModOptions.OPACITY) {
      return this.minimapOpacity;
    }
    if (options == ModOptions.WAYPOINTS_SCALE) {
      return this.waypointsScale;
    }
    if (options == ModOptions.DOTS_SCALE) {
      return this.dotsScale;
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
