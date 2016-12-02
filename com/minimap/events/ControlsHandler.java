package com.minimap.events;

import avb;
import ave;
import avh;
import com.minimap.XaeroMinimap;
import com.minimap.gui.GuiAddWaypoint;
import com.minimap.gui.GuiMinimap;
import com.minimap.gui.GuiWaypoints;
import com.minimap.minimap.Minimap;
import com.minimap.minimap.Waypoint;
import com.minimap.minimap.WaypointSet;
import com.minimap.settings.ModOptions;
import com.minimap.settings.ModSettings;
import java.io.IOException;
import java.util.ArrayList;
import pk;

public class ControlsHandler
{
  public ControlsHandler()
  {
    avh settings = At;
    avb[] binds = aw;
    int size = binds.length + toAdd.length;
    aw = new avb[size];
    for (int i = 0; i < binds.length; i++) {
      aw[i] = binds[i];
    }
    for (int i = binds.length; i < size; i++) {
      aw[i] = toAdd[(i - binds.length)];
    }
  }
  
  public static void setKeyState(avb kb, boolean pressed)
  {
    if (kb.d() != pressed) {
      avb.a(kb.i(), pressed);
    }
  }
  
  public static boolean isDown(avb kb)
  {
    return avh.a(kb);
  }
  
  public void keyDown(avb kb, boolean tickEnd, boolean isRepeat)
  {
    ave mc = XaeroMinimap.mc;
    if (!tickEnd)
    {
      if (kb == ModSettings.keyBindSettings) {
        mc.a(new GuiMinimap(XaeroMinimap.getSettings()));
      }
      if ((kb == ModSettings.newWaypoint) && (Minimap.waypoints != null)) {
        mc.a(new GuiAddWaypoint(null, XaeroMinimap.getSettings(), null));
      }
      if ((kb == ModSettings.keyWaypoints) && (Minimap.waypoints != null)) {
        mc.a(new GuiWaypoints(null));
      }
      if (kb == ModSettings.keyLargeMap)
      {
        Minimap.enlargedMap = true;
        Minimap.resetImage();
      }
      if (kb == ModSettings.keyToggleWaypoints) {
        try
        {
          XaeroMinimap.getSettings().setOptionValue(ModOptions.INGAME_WAYPOINTS, 0);
          XaeroMinimap.getSettings().setOptionValue(ModOptions.WAYPOINTS, 0);
          XaeroMinimap.getSettings().saveSettings();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      }
      if (kb == ModSettings.keyToggleMap) {
        try
        {
          XaeroMinimap.getSettings().setOptionValue(ModOptions.MINIMAP, 0);
          XaeroMinimap.getSettings().saveSettings();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      }
      if (kb == ModSettings.keyToggleSlimes) {
        try
        {
          XaeroMinimap.getSettings().setOptionValue(ModOptions.SLIME_CHUNKS, 0);
          XaeroMinimap.getSettings().saveSettings();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      }
      if (kb == ModSettings.keyToggleGrid) {
        try
        {
          XaeroMinimap.getSettings().setOptionValue(ModOptions.CHUNK_GRID, 0);
          XaeroMinimap.getSettings().saveSettings();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      }
      if (kb == ModSettings.keyInstantWaypoint)
      {
        Waypoint instant = new Waypoint(Minimap.myFloor(h.s), Minimap.myFloor(h.t), Minimap.myFloor(h.u), "Waypoint", "X", (int)(Math.random() * (ModSettings.ENCHANT_COLORS.length - 1)));
        waypointslist.add(instant);
        try
        {
          XaeroMinimap.settings.saveWaypoints();
        }
        catch (IOException e2)
        {
          e2.printStackTrace();
        }
      }
    }
  }
  
  public void keyUp(avb kb, boolean tickEnd)
  {
    if (!tickEnd)
    {
      if (kb == ModSettings.keyBindZoom) {
        try
        {
          XaeroMinimap.getSettings().setOptionValue(ModOptions.ZOOM, 1);
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      }
      if (kb == ModSettings.keyBindZoom1)
      {
        ModSettings settings = XaeroMinimap.getSettings();
        zoom -= 1;
        if (getSettingszoom == -1) {
          getSettingszoom = (getSettingszooms.length - 1);
        }
        try
        {
          XaeroMinimap.getSettings().saveSettings();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      }
      if (kb == ModSettings.keyLargeMap)
      {
        Minimap.enlargedMap = false;
        Minimap.resetImage();
        Minimap.frameUpdateNeeded = Minimap.usingFBO();
      }
    }
  }
  
  public static avb[] toAdd = { ModSettings.keyInstantWaypoint, ModSettings.keyToggleSlimes, ModSettings.keyToggleGrid, ModSettings.keyToggleWaypoints, ModSettings.keyToggleMap, ModSettings.keyLargeMap, ModSettings.keyWaypoints, ModSettings.keyBindZoom, ModSettings.keyBindZoom1, ModSettings.keyBindSettings, ModSettings.newWaypoint };
}
