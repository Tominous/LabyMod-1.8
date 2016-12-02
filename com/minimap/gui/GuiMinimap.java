package com.minimap.gui;

import ave;
import avs;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.minimap.Minimap;
import com.minimap.settings.ModOptions;
import com.minimap.settings.ModSettings;
import java.util.List;

public class GuiMinimap
  extends GuiSettings
{
  private MySmallButton waypointsButton;
  private MyTinyButton nextButton;
  private MyTinyButton prevButton;
  private String title;
  
  public GuiMinimap(ModSettings par2ModSettings)
  {
    super(par2ModSettings);
    this.options = new ModOptions[] { ModOptions.MINIMAP, ModOptions.ZOOM, ModOptions.SIZE, ModOptions.CAVE_MAPS, ModOptions.PLAYERS, ModOptions.MOBS, ModOptions.HOSTILE, ModOptions.ITEMS, ModOptions.ENTITIES, ModOptions.NORTH, ModOptions.EDIT };
  }
  
  public void b()
  {
    super.b();
    this.screenTitle = XaeroMinimap.message;
    this.title = bnq.a("gui.xaero_minimap_settings", new Object[0]);
    if (ModSettings.serverSettings != Integer.MAX_VALUE) {
      this.title = ("§e" + bnq.a("gui.xaero_server_disabled", new Object[0]));
    }
    this.n.add(this.waypointsButton = new MySmallButton(201, this.l / 2 + 5, this.m / 7 + 120, bnq.a("gui.xaero_waypoints", new Object[0])));
    this.n.add(this.nextButton = new MyTinyButton(202, this.l / 2 + 80, this.m / 7 + 144, bnq.a("gui.xaero_next", new Object[0])));
    this.n.add(this.prevButton = new MyTinyButton(203, this.l / 2 - 155, this.m / 7 + 144, bnq.a("gui.xaero_previous", new Object[0])));
    this.prevButton.l = false;
  }
  
  protected void a(avs par1GuiButton)
  {
    super.a(par1GuiButton);
    if (par1GuiButton.l)
    {
      if (par1GuiButton.k == 201) {
        this.j.a(new GuiWaypoints(this));
      }
      if (par1GuiButton.k == 202) {
        this.j.a(new GuiMinimap2(this.guiModSettings));
      }
    }
  }
  
  public void a(int par1, int par2, float par3)
  {
    this.waypointsButton.l = ((XaeroMinimap.mc.h != null) && (Minimap.waypoints != null));
    super.a(par1, par2, par3);
    a(this.q, this.title, this.l / 2, 5, 16777215);
  }
}
