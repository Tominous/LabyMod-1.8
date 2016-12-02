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
import com.minimap.minimap.WaypointSet;
import com.minimap.minimap.WaypointWorld;
import com.minimap.settings.ModSettings;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class GuiNewSet
  extends axu
{
  private axu parentGuiScreen;
  protected String screenTitle;
  public avw nameTextField;
  public String nameText;
  
  public GuiNewSet(axu par1GuiScreen)
  {
    nameText = "";
    parentGuiScreen = par1GuiScreen;
  }
  
  public void b()
  {
    screenTitle = bnq.a("gui.xaero_create_set", new Object[0]);
    n.clear();
    n.add(new MySmallButton(200, l / 2 - 155, m / 6 + 168, bnq.a("gui.xaero_confirm", new Object[0])));
    n.add(new MySmallButton(201, l / 2 + 5, m / 6 + 168, bnq.a("gui.xaero_cancel", new Object[0])));
    (nameTextField = new avw(0, q, l / 2 - 100, 60, 200, 20)).a(nameText);
    nameTextField.b(true);
    Keyboard.enableRepeatEvents(true);
    updateConfirmButton();
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  private void updateConfirmButton()
  {
    n.get(0)).l = ((nameTextField.b().length() > 0) && (getCurrentWorldsets.get(nameTextField.b()) == null));
  }
  
  protected void a(char par1, int par2)
    throws IOException
  {
    if (nameTextField.m())
    {
      nameTextField.a(par1, par2);
      nameTextField.a(nameText = nameTextField.b().replaceAll(":", ""));
      updateConfirmButton();
    }
    if ((par2 == 28) || (par2 == 156)) {
      a((avs)n.get(0));
    }
    super.a(par1, par2);
  }
  
  protected void a(int par1, int par2, int par3)
    throws IOException
  {
    super.a(par1, par2, par3);
    nameTextField.a(par1, par2, par3);
  }
  
  public void e()
  {
    nameTextField.a();
  }
  
  protected void a(avs par1GuiButton)
  {
    if (l)
    {
      int var2 = j.t.aK;
      if (k == 200)
      {
        getCurrentWorldsets.put(nameTextField.b(), new WaypointSet(Minimap.getCurrentWorld()));
        getCurrentWorldcurrent = nameTextField.b();
        Minimap.updateWaypoints();
        try
        {
          XaeroMinimap.settings.saveWaypoints();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
        j.a(new GuiWaypoints(parentGuiScreen).parentScreen));
      }
      if (k == 201) {
        j.a(parentGuiScreen);
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
  
  public void a(int par1, int par2, float par3)
  {
    c();
    a(q, screenTitle, l / 2, 20, 16777215);
    nameTextField.g();
    super.a(par1, par2, par3);
  }
}
