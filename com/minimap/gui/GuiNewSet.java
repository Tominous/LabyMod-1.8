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
    this.nameText = "";
    this.parentGuiScreen = par1GuiScreen;
  }
  
  public void b()
  {
    this.screenTitle = bnq.a("gui.xaero_create_set", new Object[0]);
    this.n.clear();
    this.n.add(new MySmallButton(200, this.l / 2 - 155, this.m / 6 + 168, bnq.a("gui.xaero_confirm", new Object[0])));
    this.n.add(new MySmallButton(201, this.l / 2 + 5, this.m / 6 + 168, bnq.a("gui.xaero_cancel", new Object[0])));
    (this.nameTextField = new avw(0, this.q, this.l / 2 - 100, 60, 200, 20)).a(this.nameText);
    this.nameTextField.b(true);
    Keyboard.enableRepeatEvents(true);
    updateConfirmButton();
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  private void updateConfirmButton()
  {
    ((avs)this.n.get(0)).l = ((this.nameTextField.b().length() > 0) && (Minimap.getCurrentWorld().sets.get(this.nameTextField.b()) == null));
  }
  
  protected void a(char par1, int par2)
    throws IOException
  {
    if (this.nameTextField.m())
    {
      this.nameTextField.a(par1, par2);
      this.nameTextField.a(this.nameText = this.nameTextField.b().replaceAll(":", ""));
      updateConfirmButton();
    }
    if ((par2 == 28) || (par2 == 156)) {
      a((avs)this.n.get(0));
    }
    super.a(par1, par2);
  }
  
  protected void a(int par1, int par2, int par3)
    throws IOException
  {
    super.a(par1, par2, par3);
    this.nameTextField.a(par1, par2, par3);
  }
  
  public void e()
  {
    this.nameTextField.a();
  }
  
  protected void a(avs par1GuiButton)
  {
    if (par1GuiButton.l)
    {
      int var2 = this.j.t.aK;
      if (par1GuiButton.k == 200)
      {
        Minimap.getCurrentWorld().sets.put(this.nameTextField.b(), new WaypointSet(Minimap.getCurrentWorld()));
        Minimap.getCurrentWorld().current = this.nameTextField.b();
        Minimap.updateWaypoints();
        try
        {
          XaeroMinimap.settings.saveWaypoints();
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
        this.j.a(new GuiWaypoints(((GuiWaypoints)this.parentGuiScreen).parentScreen));
      }
      if (par1GuiButton.k == 201) {
        this.j.a(this.parentGuiScreen);
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
  
  public void a(int par1, int par2, float par3)
  {
    c();
    a(this.q, this.screenTitle, this.l / 2, 20, 16777215);
    this.nameTextField.g();
    super.a(par1, par2, par3);
  }
}
