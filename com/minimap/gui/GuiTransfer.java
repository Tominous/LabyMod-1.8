package com.minimap.gui;

import ave;
import avs;
import axu;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.minimap.Minimap;
import com.minimap.minimap.Waypoint;
import com.minimap.minimap.WaypointSet;
import com.minimap.minimap.WaypointWorld;
import com.minimap.settings.ModSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class GuiTransfer
  extends axu
{
  public axu parentScreen;
  public MySmallButton transferButton;
  public ArrayList<GuiDropDown> dropDowns;
  public GuiWaypointWorlds worlds1;
  public GuiWaypointWorlds worlds2;
  private boolean dropped;
  
  public GuiTransfer(axu par1)
  {
    dropDowns = new ArrayList();
    dropped = false;
    parentScreen = par1;
    worlds1 = new GuiWaypointWorlds(Minimap.getCurrentWorldID(), Minimap.getAutoWorldID());
    worlds2 = new GuiWaypointWorlds(Minimap.getAutoWorldID(), Minimap.getAutoWorldID());
  }
  
  public void b()
  {
    n.clear();
    n.add(transferButton = new MySmallButton(5, l / 2 - 155, m / 7 + 120, bnq.a("gui.xaero_transfer", new Object[0])));
    transferButton.l = false;
    n.add(new MySmallButton(6, l / 2 + 5, m / 7 + 120, bnq.a("gui.xaero_cancel", new Object[0])));
    dropDowns.clear();
    dropDowns.add(new GuiDropDown(worlds1.options, l / 2 - 100, m / 7 + 20, 200, Integer.valueOf(worlds1.currentWorld)));
    dropDowns.add(new GuiDropDown(worlds2.options, l / 2 - 100, m / 7 + 50, 200, Integer.valueOf(worlds2.currentWorld)));
  }
  
  protected void a(int par1, int par2, int par3)
    throws IOException
  {
    for (GuiDropDown d : dropDowns)
    {
      if ((!closed) && (d.onDropDown(par1, par2)))
      {
        d.mouseClicked(par1, par2, par3);
        return;
      }
      closed = true;
    }
    for (GuiDropDown d : dropDowns)
    {
      if (d.onDropDown(par1, par2))
      {
        d.mouseClicked(par1, par2, par3);
        return;
      }
      closed = true;
    }
    if (dropped) {
      return;
    }
    super.a(par1, par2, par3);
  }
  
  protected void a(avs p_146284_1_)
  {
    if (l) {
      switch (k)
      {
      case 5: 
        transfer();
        break;
      case 6: 
        j.a(parentScreen);
      }
    }
  }
  
  public void transfer()
  {
    try
    {
      WaypointWorld currentWorld = Minimap.getCurrentWorld();
      WaypointWorld from = (WaypointWorld)Minimap.waypointMap.get(worlds1.keys[worlds1.currentWorld]);
      WaypointWorld to = (WaypointWorld)Minimap.waypointMap.get(worlds2.keys[worlds2.currentWorld]);
      Object[] keys = sets.keySet().toArray();
      Object[] values = sets.values().toArray();
      for (int i = 0; i < keys.length; i++)
      {
        String setName = (String)keys[i];
        WaypointSet fromSet = (WaypointSet)values[i];
        WaypointSet toSet = (WaypointSet)sets.get(setName);
        if (toSet == null) {
          toSet = new WaypointSet(currentWorld);
        }
        for (Waypoint w : list) {
          list.add(new Waypoint(x, y, z, name, symbol, color, type));
        }
        sets.put(setName, toSet);
      }
      Minimap.customWorldID = (String)worlds2.keys[worlds2.currentWorld];
      Minimap.updateWaypoints();
      if ((parentScreen instanceof GuiWaypoints)) {
        j.a(new GuiWaypoints(parentScreen).parentScreen));
      }
      XaeroMinimap.getSettings().saveWaypoints();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public void a(int par1, int par2, float par3)
  {
    super.c();
    updateSelections();
    a(q, bnq.a("gui.xaero_transfer_all", new Object[0]), l / 2, 5, 16777215);
    a(q, bnq.a("gui.xaero_from", new Object[0]) + ":", l / 2, m / 7 + 10, 16777215);
    a(q, bnq.a("gui.xaero_to", new Object[0]) + ":", l / 2, m / 7 + 40, 16777215);
    if (dropped) {
      super.a(0, 0, par3);
    } else {
      super.a(par1, par2, par3);
    }
    dropped = false;
    for (int k = 0; k < dropDowns.size(); k++) {
      if (dropDowns.get(k)).closed) {
        ((GuiDropDown)dropDowns.get(k)).drawButton(par1, par2);
      } else {
        dropped = true;
      }
    }
    for (int k = 0; k < dropDowns.size(); k++) {
      if (!dropDowns.get(k)).closed) {
        ((GuiDropDown)dropDowns.get(k)).drawButton(par1, par2);
      }
    }
  }
  
  private void updateSelections()
  {
    worlds1.currentWorld = dropDowns.get(0)).selected;
    worlds2.currentWorld = dropDowns.get(1)).selected;
    transferButton.l = (worlds1.currentWorld != worlds2.currentWorld);
  }
}
