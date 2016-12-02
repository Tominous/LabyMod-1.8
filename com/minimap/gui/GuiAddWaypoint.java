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
    nameText = "";
    initial = "";
    yaw = "";
    dropDowns = new ArrayList();
    fromSet = null;
    color = 0;
    dropped = false;
    parentGuiScreen = par1GuiScreen;
    guiModSettings = par2ModSettings;
    this.point = point;
    fromSet = getCurrentWorldcurrent;
    sets = new GuiWaypointSets(fromSet, Minimap.getCurrentWorldID(), false);
  }
  
  public void b()
  {
    com.minimap.interfaces.InterfaceHandler.selectedId = -1;
    com.minimap.interfaces.InterfaceHandler.draggingId = -1;
    n.clear();
    n.add(new MySmallButton(200, l / 2 - 155, m / 6 + 168, bnq.a("gui.xaero_confirm", new Object[0])));
    n.add(new MySmallButton(201, l / 2 + 5, m / 6 + 168, bnq.a("gui.xaero_cancel", new Object[0])));
    nameTextField = new avw(0, q, l / 2 - 100, 82, 200, 20);
    xTextField = new avw(0, q, l / 2 - 109, 112, 50, 20);
    yTextField = new avw(0, q, l / 2 - 53, 112, 50, 20);
    zTextField = new avw(0, q, l / 2 + 3, 112, 50, 20);
    yawTextField = new avw(0, q, l / 2 + 59, 112, 50, 20);
    charTextField = new avw(0, q, l / 2 - 25, 142, 50, 20);
    if (point == null)
    {
      screenTitle = bnq.a("gui.xaero_new_waypoint", new Object[0]);
      nameTextField.a(nameText);
      xTextField.a("" + Minimap.myFloor(j.h.s));
      yTextField.a("" + Minimap.myFloor(j.h.t));
      zTextField.a("" + Minimap.myFloor(j.h.u));
      yawTextField.a("§8" + bnq.a("gui.xaero_yaw", new Object[0]));
      charTextField.a("§8" + bnq.a("gui.xaero_initial", new Object[0]));
      color = ((int)(Math.random() * (ModSettings.ENCHANT_COLORS.length - 1)));
    }
    else
    {
      screenTitle = bnq.a("gui.xaero_edit_waypoint", new Object[0]);
      nameTextField.a(point.getName());
      xTextField.a("" + point.x);
      yTextField.a("" + point.y);
      zTextField.a("" + point.z);
      initial = point.symbol;
      if (point.rotation) {
        yaw = ("" + point.yaw);
      }
      yawTextField.a(yaw);
      charTextField.a(initial);
      color = point.color;
    }
    if (!dropDowns.isEmpty()) {
      color = dropDowns.get(0)).selected;
    }
    dropDowns.clear();
    GuiDropDown colorSelect = new GuiDropDown(createColorOptions(), l / 2 - 60, 60, 120, Integer.valueOf(color));
    dropDowns.add(colorSelect);
    dropDowns.add(new GuiDropDown(sets.options, l / 2 - 101, 38, 201, Integer.valueOf(sets.currentSet)));
    nameTextField.b(true);
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
    if (nameTextField.m())
    {
      if (par2 == 15)
      {
        nameTextField.b(false);
        xTextField.b(true);
      }
      nameTextField.a(par1, par2);
      if ((initial.length() == 0) && (nameTextField.b().length() > 0)) {
        initial = nameTextField.b().substring(0, 1);
      }
    }
    else if (xTextField.m())
    {
      if (par2 == 15)
      {
        xTextField.b(false);
        yTextField.b(true);
      }
      xTextField.a(par1, par2);
    }
    else if (yTextField.m())
    {
      if (par2 == 15)
      {
        yTextField.b(false);
        zTextField.b(true);
      }
      yTextField.a(par1, par2);
    }
    else if (zTextField.m())
    {
      if (par2 == 15)
      {
        zTextField.b(false);
        yawTextField.b(true);
      }
      zTextField.a(par1, par2);
    }
    else if (yawTextField.m())
    {
      if (par2 == 15)
      {
        yawTextField.b(false);
        charTextField.b(true);
      }
      yawTextField.a(par1, par2);
      GuiMisc.checkField(yawTextField);
      yaw = yawTextField.b();
    }
    else if (charTextField.m())
    {
      if (par2 == 15)
      {
        charTextField.b(false);
        nameTextField.b(true);
      }
      if (par2 != 57) {
        charTextField.a(par1, par2);
      }
      initial = charTextField.b();
    }
    if ((par2 == 28) || (par2 == 156)) {
      a((avs)n.get(0));
    }
    checkFields();
    updateConfirmButton();
    super.a(par1, par2);
  }
  
  private void updateConfirmButton()
  {
    n.get(0)).l = ((nameTextField.b().length() > 0) && (initial.length() > 0) && (xTextField.b().length() > 0) && (yTextField.b().length() > 0) && (zTextField.b().length() > 0));
  }
  
  protected void checkFields()
  {
    GuiMisc.checkField(xTextField);
    GuiMisc.checkField(yTextField);
    GuiMisc.checkField(zTextField);
    initial = initial.toUpperCase();
    if (initial.length() > 1) {
      initial = initial.substring(0, 1);
    }
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
    super.a(par1, par2, par3);
    nameTextField.a(par1, par2, par3);
    xTextField.a(par1, par2, par3);
    yTextField.a(par1, par2, par3);
    zTextField.a(par1, par2, par3);
    yawTextField.a(par1, par2, par3);
    charTextField.a(par1, par2, par3);
  }
  
  public void e()
  {
    if (j.h == null)
    {
      j.a((axu)null);
      return;
    }
    nameTextField.a();
    xTextField.a();
    yTextField.a();
    zTextField.a();
    yawTextField.a();
    charTextField.a();
    if ((yawTextField.m()) || (yaw.length() > 0)) {
      yawTextField.a(yaw);
    } else {
      yawTextField.a("§8" + bnq.a("gui.xaero_yaw", new Object[0]));
    }
    if ((charTextField.m()) || (initial.length() > 0)) {
      charTextField.a(initial);
    } else {
      charTextField.a("§8" + bnq.a("gui.xaero_initial", new Object[0]));
    }
    color = dropDowns.get(0)).selected;
    if (sets.currentSet != dropDowns.get(1)).selected)
    {
      sets.currentSet = dropDowns.get(1)).selected;
      getCurrentWorldcurrent = ((GuiDropDown)dropDowns.get(1)).getSelectedOption();
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
    if (l)
    {
      int var2 = j.t.aK;
      if ((k < 100) && ((par1GuiButton instanceof MySmallButton)))
      {
        try
        {
          guiModSettings.setOptionValue(((MySmallButton)par1GuiButton).returnModOptions(), 1);
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
        j = guiModSettings.getKeyBinding(ModOptions.getModOptions(k));
      }
      if (k == 200)
      {
        int x = Integer.parseInt(xTextField.b());
        int y = Integer.parseInt(yTextField.b());
        int z = Integer.parseInt(zTextField.b());
        String name = nameTextField.b();
        Waypoint created = new Waypoint(x, y, z, name, initial, color);
        if (yaw.length() > 0)
        {
          rotation = true;
          yaw = Integer.parseInt(yawTextField.b());
        }
        waypointslist.add(created);
        if (point != null) {
          getCurrentWorldsets.get(fromSet)).list.remove(point);
        }
        try
        {
          XaeroMinimap.settings.saveWaypoints();
        }
        catch (IOException e2)
        {
          e2.printStackTrace();
        }
        j.a(parentGuiScreen);
      }
      if (k == 201) {
        j.a(parentGuiScreen);
      }
      if (k == 202) {
        color = ((color + 1) % (ModSettings.ENCHANT_COLORS.length - 1));
      }
      if (j.t.aK != var2)
      {
        avr res = new avr(j);
        int var3 = res.a();
        int var4 = res.b();
        a(j, var3, var4);
      }
    }
  }
  
  public List getButtons()
  {
    return n;
  }
  
  public void a(int par1, int par2, float par3)
  {
    c();
    a(q, screenTitle, l / 2, 20, 16777215);
    nameTextField.g();
    xTextField.g();
    yTextField.g();
    zTextField.g();
    yawTextField.g();
    charTextField.g();
    if (dropped) {
      super.a(0, 0, par3);
    } else {
      super.a(par1, par2, par3);
    }
    dropped = false;
    for (int k = 0; k < dropDowns.size(); k++)
    {
      if (!dropDowns.get(k)).closed) {
        dropped = true;
      }
      ((GuiDropDown)dropDowns.get(k)).drawButton(par1, par2);
    }
  }
}
