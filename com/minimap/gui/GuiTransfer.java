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
    this.dropDowns = new ArrayList();
    this.dropped = false;
    this.parentScreen = par1;
    this.worlds1 = new GuiWaypointWorlds(Minimap.getCurrentWorldID(), Minimap.getAutoWorldID());
    this.worlds2 = new GuiWaypointWorlds(Minimap.getAutoWorldID(), Minimap.getAutoWorldID());
  }
  
  public void b()
  {
    this.n.clear();
    this.n.add(this.transferButton = new MySmallButton(5, this.l / 2 - 155, this.m / 7 + 120, bnq.a("gui.xaero_transfer", new Object[0])));
    this.transferButton.l = false;
    this.n.add(new MySmallButton(6, this.l / 2 + 5, this.m / 7 + 120, bnq.a("gui.xaero_cancel", new Object[0])));
    this.dropDowns.clear();
    this.dropDowns.add(new GuiDropDown(this.worlds1.options, this.l / 2 - 100, this.m / 7 + 20, 200, Integer.valueOf(this.worlds1.currentWorld)));
    this.dropDowns.add(new GuiDropDown(this.worlds2.options, this.l / 2 - 100, this.m / 7 + 50, 200, Integer.valueOf(this.worlds2.currentWorld)));
  }
  
  protected void a(int par1, int par2, int par3)
    throws IOException
  {
    for (GuiDropDown d : this.dropDowns)
    {
      if ((!d.closed) && (d.onDropDown(par1, par2)))
      {
        d.mouseClicked(par1, par2, par3);
        return;
      }
      d.closed = true;
    }
    for (GuiDropDown d : this.dropDowns)
    {
      if (d.onDropDown(par1, par2))
      {
        d.mouseClicked(par1, par2, par3);
        return;
      }
      d.closed = true;
    }
    if (this.dropped) {
      return;
    }
    super.a(par1, par2, par3);
  }
  
  protected void a(avs p_146284_1_)
  {
    if (p_146284_1_.l) {
      switch (p_146284_1_.k)
      {
      case 5: 
        transfer();
        break;
      case 6: 
        this.j.a(this.parentScreen);
      }
    }
  }
  
  public void transfer()
  {
    try
    {
      WaypointWorld currentWorld = Minimap.getCurrentWorld();
      WaypointWorld from = (WaypointWorld)Minimap.waypointMap.get(this.worlds1.keys[this.worlds1.currentWorld]);
      WaypointWorld to = (WaypointWorld)Minimap.waypointMap.get(this.worlds2.keys[this.worlds2.currentWorld]);
      Object[] keys = from.sets.keySet().toArray();
      Object[] values = from.sets.values().toArray();
      for (int i = 0; i < keys.length; i++)
      {
        String setName = (String)keys[i];
        WaypointSet fromSet = (WaypointSet)values[i];
        WaypointSet toSet = (WaypointSet)to.sets.get(setName);
        if (toSet == null) {
          toSet = new WaypointSet(currentWorld);
        }
        for (Waypoint w : fromSet.list) {
          toSet.list.add(new Waypoint(w.x, w.y, w.z, w.name, w.symbol, w.color, w.type));
        }
        to.sets.put(setName, toSet);
      }
      Minimap.customWorldID = (String)this.worlds2.keys[this.worlds2.currentWorld];
      Minimap.updateWaypoints();
      if ((this.parentScreen instanceof GuiWaypoints)) {
        this.j.a(new GuiWaypoints(((GuiWaypoints)this.parentScreen).parentScreen));
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
    a(this.q, bnq.a("gui.xaero_transfer_all", new Object[0]), this.l / 2, 5, 16777215);
    a(this.q, bnq.a("gui.xaero_from", new Object[0]) + ":", this.l / 2, this.m / 7 + 10, 16777215);
    a(this.q, bnq.a("gui.xaero_to", new Object[0]) + ":", this.l / 2, this.m / 7 + 40, 16777215);
    if (this.dropped) {
      super.a(0, 0, par3);
    } else {
      super.a(par1, par2, par3);
    }
    this.dropped = false;
    for (int k = 0; k < this.dropDowns.size(); k++) {
      if (((GuiDropDown)this.dropDowns.get(k)).closed) {
        ((GuiDropDown)this.dropDowns.get(k)).drawButton(par1, par2);
      } else {
        this.dropped = true;
      }
    }
    for (int k = 0; k < this.dropDowns.size(); k++) {
      if (!((GuiDropDown)this.dropDowns.get(k)).closed) {
        ((GuiDropDown)this.dropDowns.get(k)).drawButton(par1, par2);
      }
    }
  }
  
  private void updateSelections()
  {
    this.worlds1.currentWorld = ((GuiDropDown)this.dropDowns.get(0)).selected;
    this.worlds2.currentWorld = ((GuiDropDown)this.dropDowns.get(1)).selected;
    this.transferButton.l = (this.worlds1.currentWorld != this.worlds2.currentWorld);
  }
}
