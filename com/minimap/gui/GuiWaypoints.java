package com.minimap.gui;

import ave;
import avs;
import awi;
import axu;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.minimap.Minimap;
import com.minimap.minimap.Waypoint;
import com.minimap.minimap.WaypointSet;
import com.minimap.minimap.WaypointWorld;
import com.minimap.settings.ModSettings;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class GuiWaypoints
  extends axu
{
  public axu parentScreen;
  private List list;
  private Waypoint selected;
  public ArrayList<GuiDropDown> dropDowns;
  public GuiWaypointWorlds worlds;
  public GuiWaypointSets sets;
  public int draggingFromX;
  public int draggingFromY;
  public int draggingFromSlot;
  public Waypoint draggingWaypoint;
  private boolean dropped;
  
  public GuiWaypoints(axu par1GuiScreen)
  {
    dropDowns = new ArrayList();
    draggingFromX = -1;
    draggingFromY = -1;
    draggingFromSlot = -1;
    draggingWaypoint = null;
    dropped = false;
    parentScreen = par1GuiScreen;
  }
  
  public void b()
  {
    worlds = new GuiWaypointWorlds(Minimap.getCurrentWorldID(), Minimap.getAutoWorldID());
    sets = new GuiWaypointSets(getCurrentWorldcurrent, Minimap.getCurrentWorldID(), true);
    n.clear();
    n.add(new MyTinyButton(5, l / 2 + 83, m - 53, bnq.a("gui.xaero_delete", new Object[0])));
    n.add(new avs(6, l / 2 - 100, m - 29, bnq.a("gui.done", new Object[0])));
    n.add(new MyTinyButton(7, l / 2 - 154, m - 53, bnq.a("gui.xaero_add_edit", new Object[0])));
    n.add(new MyTinyButton(8, l / 2 - 75, m - 53, bnq.a("gui.xaero_waypoint_teleport", new Object[0])));
    n.add(new MyTinyButton(9, l / 2 + 4, m - 53, bnq.a("gui.xaero_disable_enable", new Object[0])));
    n.add(new MyTinyButton(10, l / 2 + 130, 32, bnq.a("gui.xaero_clear", new Object[0])));
    n.add(new MyTinyButton(11, l / 2 - 203, 32, bnq.a("gui.xaero_transfer", new Object[0])));
    (list = new List()).d(7, 8);
    dropDowns.clear();
    dropDowns.add(new GuiDropDown(worlds.options, l / 2 - 202, 17, 200, Integer.valueOf(worlds.currentWorld)));
    dropDowns.add(new GuiDropDown(sets.options, l / 2 + 2, 17, 200, Integer.valueOf(sets.currentSet)));
  }
  
  protected void a(avs p_146284_1_)
  {
    if (l) {
      switch (k)
      {
      case 5: 
        waypointslist.remove(selected);
        selected = null;
        try
        {
          XaeroMinimap.settings.saveWaypoints();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      case 6: 
        j.a(parentScreen);
        break;
      case 7: 
        j.a(new GuiAddWaypoint(this, XaeroMinimap.getSettings(), selected));
        break;
      case 8: 
        if (!selected.rotation) {
          b("/tp " + selected.x + " " + selected.y + " " + selected.z, false);
        } else {
          b("/tp " + selected.x + " " + selected.y + " " + selected.z + " " + selected.yaw + " ~", false);
        }
        j.a((axu)null);
        break;
      case 9: 
        selected.disabled = (!selected.disabled);
        try
        {
          XaeroMinimap.settings.saveWaypoints();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      case 10: 
        if (shouldDeleteSet()) {
          j.a(new GuiDeleteSet(bnq.a(sets.options[sets.currentSet], new Object[0]), (String)worlds.keys[worlds.currentWorld], sets.options[sets.currentSet], this));
        } else {
          j.a(new GuiClearSet(bnq.a(sets.options[sets.currentSet], new Object[0]), (String)worlds.keys[worlds.currentWorld], sets.options[sets.currentSet], this));
        }
        break;
      case 11: 
        j.a(new GuiTransfer(this));
      }
    }
  }
  
  public boolean shouldDeleteSet()
  {
    return (!sets.options[sets.currentSet].equals("gui.xaero_default")) && (waypointslist.isEmpty());
  }
  
  public void k()
    throws IOException
  {
    super.k();
    list.p();
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
    draggingFromX = par1;
    draggingFromY = par2;
    draggingFromSlot = list.c(par1, par2);
    super.a(par1, par2, par3);
  }
  
  protected void b(int par1, int par2, int par3)
  {
    try
    {
      if (draggingWaypoint != null) {
        XaeroMinimap.getSettings().saveWaypoints();
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    draggingFromX = -1;
    draggingFromY = -1;
    draggingFromSlot = -1;
    draggingWaypoint = null;
    super.b(par1, par2, par3);
  }
  
  protected void a(char par1, int par2)
    throws IOException
  {
    super.a(par1, par2);
    switch (par2)
    {
    case 211: 
      a((avs)n.get(0));
      break;
    case 20: 
      a((avs)n.get(3));
    }
  }
  
  public void a(int par1, int par2, float par3)
  {
    if (j.h == null)
    {
      j.a((axu)null);
      return;
    }
    updateButtons();
    list.a(par1, par2, par3);
    a(q, bnq.a("gui.xaero_world", new Object[0]), l / 2 - 102, 5, 16777215);
    a(q, bnq.a("gui.xaero_waypoint_set", new Object[0]), l / 2 + 102, 5, 16777215);
    a(q, bnq.a("gui.xaero_waypoints", new Object[0]), l / 2, 44, 16777215);
    if (draggingFromSlot != -1)
    {
      int distance = (int)Math.sqrt(Math.pow(par1 - draggingFromX, 2.0D) + Math.pow(par2 - draggingFromY, 2.0D));
      int toSlot = list.c(par1, par2);
      if ((distance > 4) && (draggingWaypoint == null))
      {
        draggingWaypoint = ((Waypoint)waypointslist.get(draggingFromSlot));
        selected = null;
      }
      if ((draggingWaypoint != null) && (draggingFromSlot != toSlot) && (toSlot != -1))
      {
        int direction = toSlot > draggingFromSlot ? 1 : -1;
        for (int i = draggingFromSlot; i != toSlot; i += direction) {
          waypointslist.set(i, waypointslist.get(i + direction));
        }
        waypointslist.set(toSlot, draggingWaypoint);
        draggingFromSlot = toSlot;
      }
      int fromCenter = draggingFromX - list.getWidth() / 2;
      list.drawWaypointSlot(draggingWaypoint, par1 - 108 - fromCenter, par2 - list.r() / 4);
    }
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
  
  private void updateButtons()
  {
    avs guiButton = (avs)n.get(0);
    avs guiButton2 = (avs)n.get(3);
    avs guiButton3 = (avs)n.get(4);
    boolean enabled;
    boolean b = enabled = (selected != null ? 1 : 0) != 0 ? 1 : 0;
    l = b;
    l = b;
    l = enabled;
    n.get(2)).l = ((j.h != null) || (selected != null));
    n.get(3)).j = (bnq.a("gui.xaero_waypoint_teleport", new Object[0]) + " (T)");
    n.get(5)).j = bnq.a(shouldDeleteSet() ? "gui.xaero_delete_set" : "gui.xaero_clear", new Object[0]);
    String[] enabledisable = bnq.a("gui.xaero_disable_enable", new Object[0]).split("/");
    n.get(4)).j = enabledisable[0];
    if (worlds.currentWorld != dropDowns.get(0)).selected)
    {
      worlds.currentWorld = dropDowns.get(0)).selected;
      if (worlds.currentWorld != worlds.autoWorld) {
        Minimap.customWorldID = (String)worlds.keys[worlds.currentWorld];
      } else if (Minimap.customWorldID != null) {
        Minimap.customWorldID = null;
      }
      WaypointWorld w = Minimap.getCurrentWorld();
      Minimap.updateWaypoints();
      selected = null;
      sets = new GuiWaypointSets(current, Minimap.getCurrentWorldID(), true);
      dropDowns.set(1, new GuiDropDown(sets.options, l / 2 + 2, 17, 200, Integer.valueOf(sets.currentSet)));
    }
    else if (sets.currentSet != dropDowns.get(1)).selected)
    {
      if (dropDowns.get(1)).selected == ((GuiDropDown)dropDowns.get(1)).size() - 1)
      {
        System.out.println("New waypoint set gui");
        ((GuiDropDown)dropDowns.get(1)).selectValue(sets.currentSet);
        j.a(new GuiNewSet(this));
        return;
      }
      sets.currentSet = dropDowns.get(1)).selected;
      getCurrentWorldcurrent = ((GuiDropDown)dropDowns.get(1)).getSelectedOption();
      Minimap.updateWaypoints();
      selected = null;
      try
      {
        XaeroMinimap.getSettings().saveWaypoints();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }
  
  class List
    extends awi
  {
    public List()
    {
      super(l, m, 58, m - 61, 18);
    }
    
    protected int b()
    {
      return waypointslist.size();
    }
    
    protected void a(int slotIndex, boolean isDoubleClick, int mouseX, int mouseY)
    {
      Waypoint waypoint = (Waypoint)waypointslist.get(slotIndex);
      System.out.println("Element clicked: " + name);
      if (selected != waypoint) {
        selected = waypoint;
      }
    }
    
    protected boolean a(int p_148131_1_)
    {
      return (selected != null) && (selected == waypointslist.get(p_148131_1_));
    }
    
    public int getWidth()
    {
      return b;
    }
    
    protected int k()
    {
      return b() * 18;
    }
    
    protected void a()
    {
      c();
    }
    
    public void a(int p_180791_1_, int p_180791_2_, int p_180791_3_, int p_180791_4_, int p_180791_5_, int p_180791_6_)
    {
      Waypoint w = (Waypoint)waypointslist.get(p_180791_1_);
      if (w == draggingWaypoint) {
        return;
      }
      drawWaypointSlot(w, p_180791_2_, p_180791_3_);
    }
    
    public void drawWaypointSlot(Waypoint w, int p_180791_2_, int p_180791_3_)
    {
      if (w == null) {
        return;
      }
      a(q, w.getName() + (disabled ? " §4" + bnq.a("gui.xaero_disabled", new Object[0]) : ""), p_180791_2_ + 110, p_180791_3_ + 1, 16777215);
      int rectX = p_180791_2_ + 8;
      w.drawIconOnGUI(rectX, p_180791_3_);
    }
    
    public boolean q()
    {
      return (!dropped) && (draggingWaypoint == null) && (super.q());
    }
  }
}
