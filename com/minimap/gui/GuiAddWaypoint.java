package com.minimap.gui;

import ave;
import avh;
import avr;
import avs;
import avw;
import axu;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.minimap.Minimap;
import com.minimap.minimap.Waypoint;
import com.minimap.minimap.WaypointSet;
import com.minimap.minimap.WaypointWorld;
import com.minimap.settings.ModOptions;
import com.minimap.settings.ModSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.lwjgl.input.Keyboard;
import pk;

public class GuiAddWaypoint
  extends axu
{
  private axu parentGuiScreen;
  protected String screenTitle;
  public avw nameTextField;
  public String nameText;
  public avw xTextField;
  public avw yTextField;
  public avw zTextField;
  public avw yawTextField;
  public avw charTextField;
  public String initial;
  public String yaw;
  public ArrayList<GuiDropDown> dropDowns;
  public GuiWaypointSets sets;
  public String fromSet;
  public int color;
  private Waypoint point;
  private ModSettings guiModSettings;
  private boolean dropped;
  
  public String[] createColorOptions()
  {
    String[] options = new String[ModSettings.ENCHANT_COLOR_NAMES.length - 1];
    for (int i = 0; i < options.length; i++) {
      if (i == 0) {
        options[i] = bnq.a(ModSettings.ENCHANT_COLOR_NAMES[i], new Object[0]);
      } else {
        options[i] = ("§" + ModSettings.ENCHANT_COLORS[i] + bnq.a(ModSettings.ENCHANT_COLOR_NAMES[i], new Object[0]));
      }
    }
    return options;
  }
  
  public int[] createValues()
  {
    int[] values = new int[ModSettings.ENCHANT_COLOR_NAMES.length];
    for (int i = 0; i < values.length; i++) {
      values[i] = i;
    }
    return values;
  }
  
  public GuiAddWaypoint(axu par1GuiScreen, ModSettings par2ModSettings, Waypoint point)
  {
    this.nameText = "";
    this.initial = "";
    this.yaw = "";
    this.dropDowns = new ArrayList();
    this.fromSet = null;
    this.color = 0;
    this.dropped = false;
    this.parentGuiScreen = par1GuiScreen;
    this.guiModSettings = par2ModSettings;
    this.point = point;
    this.fromSet = Minimap.getCurrentWorld().current;
    this.sets = new GuiWaypointSets(this.fromSet, Minimap.getCurrentWorldID(), false);
  }
  
  public void b()
  {
    com.minimap.interfaces.InterfaceHandler.selectedId = -1;
    com.minimap.interfaces.InterfaceHandler.draggingId = -1;
    this.n.clear();
    this.n.add(new MySmallButton(200, this.l / 2 - 155, this.m / 6 + 168, bnq.a("gui.xaero_confirm", new Object[0])));
    this.n.add(new MySmallButton(201, this.l / 2 + 5, this.m / 6 + 168, bnq.a("gui.xaero_cancel", new Object[0])));
    this.nameTextField = new avw(0, this.q, this.l / 2 - 100, 82, 200, 20);
    this.xTextField = new avw(0, this.q, this.l / 2 - 109, 112, 50, 20);
    this.yTextField = new avw(0, this.q, this.l / 2 - 53, 112, 50, 20);
    this.zTextField = new avw(0, this.q, this.l / 2 + 3, 112, 50, 20);
    this.yawTextField = new avw(0, this.q, this.l / 2 + 59, 112, 50, 20);
    this.charTextField = new avw(0, this.q, this.l / 2 - 25, 142, 50, 20);
    if (this.point == null)
    {
      this.screenTitle = bnq.a("gui.xaero_new_waypoint", new Object[0]);
      this.nameTextField.a(this.nameText);
      this.xTextField.a("" + Minimap.myFloor(this.j.h.s));
      this.yTextField.a("" + Minimap.myFloor(this.j.h.t));
      this.zTextField.a("" + Minimap.myFloor(this.j.h.u));
      this.yawTextField.a("§8" + bnq.a("gui.xaero_yaw", new Object[0]));
      this.charTextField.a("§8" + bnq.a("gui.xaero_initial", new Object[0]));
      this.color = ((int)(Math.random() * (ModSettings.ENCHANT_COLORS.length - 1)));
    }
    else
    {
      this.screenTitle = bnq.a("gui.xaero_edit_waypoint", new Object[0]);
      this.nameTextField.a(this.point.getName());
      this.xTextField.a("" + this.point.x);
      this.yTextField.a("" + this.point.y);
      this.zTextField.a("" + this.point.z);
      this.initial = this.point.symbol;
      if (this.point.rotation) {
        this.yaw = ("" + this.point.yaw);
      }
      this.yawTextField.a(this.yaw);
      this.charTextField.a(this.initial);
      this.color = this.point.color;
    }
    if (!this.dropDowns.isEmpty()) {
      this.color = ((GuiDropDown)this.dropDowns.get(0)).selected;
    }
    this.dropDowns.clear();
    GuiDropDown colorSelect = new GuiDropDown(createColorOptions(), this.l / 2 - 60, 60, 120, Integer.valueOf(this.color));
    this.dropDowns.add(colorSelect);
    this.dropDowns.add(new GuiDropDown(this.sets.options, this.l / 2 - 101, 38, 201, Integer.valueOf(this.sets.currentSet)));
    this.nameTextField.b(true);
    Keyboard.enableRepeatEvents(true);
    updateConfirmButton();
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void a(char par1, int par2)
    throws IOException
  {
    if (this.nameTextField.m())
    {
      if (par2 == 15)
      {
        this.nameTextField.b(false);
        this.xTextField.b(true);
      }
      this.nameTextField.a(par1, par2);
      if ((this.initial.length() == 0) && (this.nameTextField.b().length() > 0)) {
        this.initial = this.nameTextField.b().substring(0, 1);
      }
    }
    else if (this.xTextField.m())
    {
      if (par2 == 15)
      {
        this.xTextField.b(false);
        this.yTextField.b(true);
      }
      this.xTextField.a(par1, par2);
    }
    else if (this.yTextField.m())
    {
      if (par2 == 15)
      {
        this.yTextField.b(false);
        this.zTextField.b(true);
      }
      this.yTextField.a(par1, par2);
    }
    else if (this.zTextField.m())
    {
      if (par2 == 15)
      {
        this.zTextField.b(false);
        this.yawTextField.b(true);
      }
      this.zTextField.a(par1, par2);
    }
    else if (this.yawTextField.m())
    {
      if (par2 == 15)
      {
        this.yawTextField.b(false);
        this.charTextField.b(true);
      }
      this.yawTextField.a(par1, par2);
      GuiMisc.checkField(this.yawTextField);
      this.yaw = this.yawTextField.b();
    }
    else if (this.charTextField.m())
    {
      if (par2 == 15)
      {
        this.charTextField.b(false);
        this.nameTextField.b(true);
      }
      if (par2 != 57) {
        this.charTextField.a(par1, par2);
      }
      this.initial = this.charTextField.b();
    }
    if ((par2 == 28) || (par2 == 156)) {
      a((avs)this.n.get(0));
    }
    checkFields();
    updateConfirmButton();
    super.a(par1, par2);
  }
  
  private void updateConfirmButton()
  {
    ((avs)this.n.get(0)).l = ((this.nameTextField.b().length() > 0) && (this.initial.length() > 0) && (this.xTextField.b().length() > 0) && (this.yTextField.b().length() > 0) && (this.zTextField.b().length() > 0));
  }
  
  protected void checkFields()
  {
    GuiMisc.checkField(this.xTextField);
    GuiMisc.checkField(this.yTextField);
    GuiMisc.checkField(this.zTextField);
    this.initial = this.initial.toUpperCase();
    if (this.initial.length() > 1) {
      this.initial = this.initial.substring(0, 1);
    }
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
    super.a(par1, par2, par3);
    this.nameTextField.a(par1, par2, par3);
    this.xTextField.a(par1, par2, par3);
    this.yTextField.a(par1, par2, par3);
    this.zTextField.a(par1, par2, par3);
    this.yawTextField.a(par1, par2, par3);
    this.charTextField.a(par1, par2, par3);
  }
  
  public void e()
  {
    if (this.j.h == null)
    {
      this.j.a((axu)null);
      return;
    }
    this.nameTextField.a();
    this.xTextField.a();
    this.yTextField.a();
    this.zTextField.a();
    this.yawTextField.a();
    this.charTextField.a();
    if ((this.yawTextField.m()) || (this.yaw.length() > 0)) {
      this.yawTextField.a(this.yaw);
    } else {
      this.yawTextField.a("§8" + bnq.a("gui.xaero_yaw", new Object[0]));
    }
    if ((this.charTextField.m()) || (this.initial.length() > 0)) {
      this.charTextField.a(this.initial);
    } else {
      this.charTextField.a("§8" + bnq.a("gui.xaero_initial", new Object[0]));
    }
    this.color = ((GuiDropDown)this.dropDowns.get(0)).selected;
    if (this.sets.currentSet != ((GuiDropDown)this.dropDowns.get(1)).selected)
    {
      this.sets.currentSet = ((GuiDropDown)this.dropDowns.get(1)).selected;
      Minimap.getCurrentWorld().current = ((GuiDropDown)this.dropDowns.get(1)).getSelectedOption();
      Minimap.updateWaypoints();
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
  
  protected void a(avs par1GuiButton)
  {
    if (par1GuiButton.l)
    {
      int var2 = this.j.t.aK;
      if ((par1GuiButton.k < 100) && ((par1GuiButton instanceof MySmallButton)))
      {
        try
        {
          this.guiModSettings.setOptionValue(((MySmallButton)par1GuiButton).returnModOptions(), 1);
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
        par1GuiButton.j = this.guiModSettings.getKeyBinding(ModOptions.getModOptions(par1GuiButton.k));
      }
      if (par1GuiButton.k == 200)
      {
        int x = Integer.parseInt(this.xTextField.b());
        int y = Integer.parseInt(this.yTextField.b());
        int z = Integer.parseInt(this.zTextField.b());
        String name = this.nameTextField.b();
        Waypoint created = new Waypoint(x, y, z, name, this.initial, this.color);
        if (this.yaw.length() > 0)
        {
          created.rotation = true;
          created.yaw = Integer.parseInt(this.yawTextField.b());
        }
        Minimap.waypoints.list.add(created);
        if (this.point != null) {
          ((WaypointSet)Minimap.getCurrentWorld().sets.get(this.fromSet)).list.remove(this.point);
        }
        try
        {
          XaeroMinimap.settings.saveWaypoints();
        }
        catch (IOException e2)
        {
          e2.printStackTrace();
        }
        this.j.a(this.parentGuiScreen);
      }
      if (par1GuiButton.k == 201) {
        this.j.a(this.parentGuiScreen);
      }
      if (par1GuiButton.k == 202) {
        this.color = ((this.color + 1) % (ModSettings.ENCHANT_COLORS.length - 1));
      }
      if (this.j.t.aK != var2)
      {
        avr res = new avr(this.j);
        int var3 = res.a();
        int var4 = res.b();
        a(this.j, var3, var4);
      }
    }
  }
  
  public List getButtons()
  {
    return this.n;
  }
  
  public void a(int par1, int par2, float par3)
  {
    c();
    a(this.q, this.screenTitle, this.l / 2, 20, 16777215);
    this.nameTextField.g();
    this.xTextField.g();
    this.yTextField.g();
    this.zTextField.g();
    this.yawTextField.g();
    this.charTextField.g();
    if (this.dropped) {
      super.a(0, 0, par3);
    } else {
      super.a(par1, par2, par3);
    }
    this.dropped = false;
    for (int k = 0; k < this.dropDowns.size(); k++)
    {
      if (!((GuiDropDown)this.dropDowns.get(k)).closed) {
        this.dropped = true;
      }
      ((GuiDropDown)this.dropDowns.get(k)).drawButton(par1, par2);
    }
  }
}
