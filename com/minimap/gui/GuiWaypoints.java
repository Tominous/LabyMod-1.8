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
    this.dropDowns = new ArrayList();
    this.draggingFromX = -1;
    this.draggingFromY = -1;
    this.draggingFromSlot = -1;
    this.draggingWaypoint = null;
    this.dropped = false;
    this.parentScreen = par1GuiScreen;
  }
  
  public void b()
  {
    this.worlds = new GuiWaypointWorlds(Minimap.getCurrentWorldID(), Minimap.getAutoWorldID());
    this.sets = new GuiWaypointSets(Minimap.getCurrentWorld().current, Minimap.getCurrentWorldID(), true);
    this.n.clear();
    this.n.add(new MyTinyButton(5, this.l / 2 + 83, this.m - 53, bnq.a("gui.xaero_delete", new Object[0])));
    this.n.add(new avs(6, this.l / 2 - 100, this.m - 29, bnq.a("gui.done", new Object[0])));
    this.n.add(new MyTinyButton(7, this.l / 2 - 154, this.m - 53, bnq.a("gui.xaero_add_edit", new Object[0])));
    this.n.add(new MyTinyButton(8, this.l / 2 - 75, this.m - 53, bnq.a("gui.xaero_waypoint_teleport", new Object[0])));
    this.n.add(new MyTinyButton(9, this.l / 2 + 4, this.m - 53, bnq.a("gui.xaero_disable_enable", new Object[0])));
    this.n.add(new MyTinyButton(10, this.l / 2 + 130, 32, bnq.a("gui.xaero_clear", new Object[0])));
    this.n.add(new MyTinyButton(11, this.l / 2 - 203, 32, bnq.a("gui.xaero_transfer", new Object[0])));
    (this.list = new List()).d(7, 8);
    this.dropDowns.clear();
    this.dropDowns.add(new GuiDropDown(this.worlds.options, this.l / 2 - 202, 17, 200, Integer.valueOf(this.worlds.currentWorld)));
    this.dropDowns.add(new GuiDropDown(this.sets.options, this.l / 2 + 2, 17, 200, Integer.valueOf(this.sets.currentSet)));
  }
  
  protected void a(avs p_146284_1_)
  {
    if (p_146284_1_.l) {
      switch (p_146284_1_.k)
      {
      case 5: 
        Minimap.waypoints.list.remove(this.selected);
        this.selected = null;
        try
        {
          XaeroMinimap.settings.saveWaypoints();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
      case 6: 
        this.j.a(this.parentScreen);
        break;
      case 7: 
        this.j.a(new GuiAddWaypoint(this, XaeroMinimap.getSettings(), this.selected));
        break;
      case 8: 
        if (!this.selected.rotation) {
          b("/tp " + this.selected.x + " " + this.selected.y + " " + this.selected.z, false);
        } else {
          b("/tp " + this.selected.x + " " + this.selected.y + " " + this.selected.z + " " + this.selected.yaw + " ~", false);
        }
        this.j.a((axu)null);
        break;
      case 9: 
        this.selected.disabled = (!this.selected.disabled);
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
          this.j.a(new GuiDeleteSet(bnq.a(this.sets.options[this.sets.currentSet], new Object[0]), (String)this.worlds.keys[this.worlds.currentWorld], this.sets.options[this.sets.currentSet], this));
        } else {
          this.j.a(new GuiClearSet(bnq.a(this.sets.options[this.sets.currentSet], new Object[0]), (String)this.worlds.keys[this.worlds.currentWorld], this.sets.options[this.sets.currentSet], this));
        }
        break;
      case 11: 
        this.j.a(new GuiTransfer(this));
      }
    }
  }
  
  public boolean shouldDeleteSet()
  {
    return (!this.sets.options[this.sets.currentSet].equals("gui.xaero_default")) && (Minimap.waypoints.list.isEmpty());
  }
  
  public void k()
    throws IOException
  {
    super.k();
    this.list.p();
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
    this.draggingFromX = par1;
    this.draggingFromY = par2;
    this.draggingFromSlot = this.list.c(par1, par2);
    super.a(par1, par2, par3);
  }
  
  protected void b(int par1, int par2, int par3)
  {
    try
    {
      if (this.draggingWaypoint != null) {
        XaeroMinimap.getSettings().saveWaypoints();
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    this.draggingFromX = -1;
    this.draggingFromY = -1;
    this.draggingFromSlot = -1;
    this.draggingWaypoint = null;
    super.b(par1, par2, par3);
  }
  
  protected void a(char par1, int par2)
    throws IOException
  {
    super.a(par1, par2);
    switch (par2)
    {
    case 211: 
      a((avs)this.n.get(0));
      break;
    case 20: 
      a((avs)this.n.get(3));
    }
  }
  
  public void a(int par1, int par2, float par3)
  {
    if (this.j.h == null)
    {
      this.j.a((axu)null);
      return;
    }
    updateButtons();
    this.list.a(par1, par2, par3);
    a(this.q, bnq.a("gui.xaero_world", new Object[0]), this.l / 2 - 102, 5, 16777215);
    a(this.q, bnq.a("gui.xaero_waypoint_set", new Object[0]), this.l / 2 + 102, 5, 16777215);
    a(this.q, bnq.a("gui.xaero_waypoints", new Object[0]), this.l / 2, 44, 16777215);
    if (this.draggingFromSlot != -1)
    {
      int distance = (int)Math.sqrt(Math.pow(par1 - this.draggingFromX, 2.0D) + Math.pow(par2 - this.draggingFromY, 2.0D));
      int toSlot = this.list.c(par1, par2);
      if ((distance > 4) && (this.draggingWaypoint == null))
      {
        this.draggingWaypoint = ((Waypoint)Minimap.waypoints.list.get(this.draggingFromSlot));
        this.selected = null;
      }
      if ((this.draggingWaypoint != null) && (this.draggingFromSlot != toSlot) && (toSlot != -1))
      {
        int direction = toSlot > this.draggingFromSlot ? 1 : -1;
        for (int i = this.draggingFromSlot; i != toSlot; i += direction) {
          Minimap.waypoints.list.set(i, Minimap.waypoints.list.get(i + direction));
        }
        Minimap.waypoints.list.set(toSlot, this.draggingWaypoint);
        this.draggingFromSlot = toSlot;
      }
      int fromCenter = this.draggingFromX - this.list.getWidth() / 2;
      this.list.drawWaypointSlot(this.draggingWaypoint, par1 - 108 - fromCenter, par2 - this.list.r() / 4);
    }
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
  
  private void updateButtons()
  {
    avs guiButton = (avs)this.n.get(0);
    avs guiButton2 = (avs)this.n.get(3);
    avs guiButton3 = (avs)this.n.get(4);
    boolean enabled;
    boolean b = enabled = (this.selected != null ? 1 : 0) != 0 ? 1 : 0;
    guiButton3.l = b;
    guiButton2.l = b;
    guiButton.l = enabled;
    ((avs)this.n.get(2)).l = ((this.j.h != null) || (this.selected != null));
    ((avs)this.n.get(3)).j = (bnq.a("gui.xaero_waypoint_teleport", new Object[0]) + " (T)");
    ((avs)this.n.get(5)).j = bnq.a(shouldDeleteSet() ? "gui.xaero_delete_set" : "gui.xaero_clear", new Object[0]);
    String[] enabledisable = bnq.a("gui.xaero_disable_enable", new Object[0]).split("/");
    ((avs)this.n.get(4)).j = enabledisable[0];
    if (this.worlds.currentWorld != ((GuiDropDown)this.dropDowns.get(0)).selected)
    {
      this.worlds.currentWorld = ((GuiDropDown)this.dropDowns.get(0)).selected;
      if (this.worlds.currentWorld != this.worlds.autoWorld) {
        Minimap.customWorldID = (String)this.worlds.keys[this.worlds.currentWorld];
      } else if (Minimap.customWorldID != null) {
        Minimap.customWorldID = null;
      }
      WaypointWorld w = Minimap.getCurrentWorld();
      Minimap.updateWaypoints();
      this.selected = null;
      this.sets = new GuiWaypointSets(w.current, Minimap.getCurrentWorldID(), true);
      this.dropDowns.set(1, new GuiDropDown(this.sets.options, this.l / 2 + 2, 17, 200, Integer.valueOf(this.sets.currentSet)));
    }
    else if (this.sets.currentSet != ((GuiDropDown)this.dropDowns.get(1)).selected)
    {
      if (((GuiDropDown)this.dropDowns.get(1)).selected == ((GuiDropDown)this.dropDowns.get(1)).size() - 1)
      {
        System.out.println("New waypoint set gui");
        ((GuiDropDown)this.dropDowns.get(1)).selectValue(this.sets.currentSet);
        this.j.a(new GuiNewSet(this));
        return;
      }
      this.sets.currentSet = ((GuiDropDown)this.dropDowns.get(1)).selected;
      Minimap.getCurrentWorld().current = ((GuiDropDown)this.dropDowns.get(1)).getSelectedOption();
      Minimap.updateWaypoints();
      this.selected = null;
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
      super(GuiWaypoints.this.l, GuiWaypoints.this.m, 58, GuiWaypoints.this.m - 61, 18);
    }
    
    protected int b()
    {
      return Minimap.waypoints.list.size();
    }
    
    protected void a(int slotIndex, boolean isDoubleClick, int mouseX, int mouseY)
    {
      Waypoint waypoint = (Waypoint)Minimap.waypoints.list.get(slotIndex);
      System.out.println("Element clicked: " + waypoint.name);
      if (GuiWaypoints.this.selected != waypoint) {
        GuiWaypoints.this.selected = waypoint;
      }
    }
    
    protected boolean a(int p_148131_1_)
    {
      return (GuiWaypoints.this.selected != null) && (GuiWaypoints.this.selected == Minimap.waypoints.list.get(p_148131_1_));
    }
    
    public int getWidth()
    {
      return this.b;
    }
    
    protected int k()
    {
      return b() * 18;
    }
    
    protected void a()
    {
      GuiWaypoints.this.c();
    }
    
    public void a(int p_180791_1_, int p_180791_2_, int p_180791_3_, int p_180791_4_, int p_180791_5_, int p_180791_6_)
    {
      Waypoint w = (Waypoint)Minimap.waypoints.list.get(p_180791_1_);
      if (w == GuiWaypoints.this.draggingWaypoint) {
        return;
      }
      drawWaypointSlot(w, p_180791_2_, p_180791_3_);
    }
    
    public void drawWaypointSlot(Waypoint w, int p_180791_2_, int p_180791_3_)
    {
      if (w == null) {
        return;
      }
      GuiWaypoints.this.a(GuiWaypoints.this.q, w.getName() + (w.disabled ? " §4" + bnq.a("gui.xaero_disabled", new Object[0]) : ""), p_180791_2_ + 110, p_180791_3_ + 1, 16777215);
      int rectX = p_180791_2_ + 8;
      w.drawIconOnGUI(rectX, p_180791_3_);
    }
    
    public boolean q()
    {
      return (!GuiWaypoints.this.dropped) && (GuiWaypoints.this.draggingWaypoint == null) && (super.q());
    }
  }
}
