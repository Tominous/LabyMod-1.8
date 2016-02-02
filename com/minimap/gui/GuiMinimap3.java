package com.minimap.gui;

import ave;
import avs;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.settings.ModOptions;
import com.minimap.settings.ModSettings;
import java.util.List;

public class GuiMinimap3
  extends GuiSettings
{
  private MyTinyButton nextButton;
  private MyTinyButton prevButton;
  private String title;
  
  public GuiMinimap3(ModSettings par2ModSettings)
  {
    super(par2ModSettings);
    this.options = new ModOptions[] { ModOptions.DISTANCE, ModOptions.AA, ModOptions.WAYPOINTS_SCALE, ModOptions.COLOURS, ModOptions.LIGHT, ModOptions.REDSTONE, ModOptions.FLOWERS, ModOptions.COMPASS, ModOptions.BIOME, ModOptions.ENTITY_HEIGHT, ModOptions.SAFE_MAP, ModOptions.RESET };
  }
  
  public void b()
  {
    super.b();
    this.screenTitle = XaeroMinimap.message;
    this.title = bnq.a("gui.xaero_minimap_settings", new Object[0]);
    if (ModSettings.serverSettings != Integer.MAX_VALUE) {
      this.title = ("§e" + bnq.a("gui.xaero_server_disabled", new Object[0]));
    }
    this.n.add(this.nextButton = new MyTinyButton(202, this.l / 2 + 80, this.m / 7 + 144, bnq.a("gui.xaero_next", new Object[0])));
    this.n.add(this.prevButton = new MyTinyButton(203, this.l / 2 - 155, this.m / 7 + 144, bnq.a("gui.xaero_previous", new Object[0])));
    this.nextButton.l = false;
  }
  
  protected void a(avs par1GuiButton)
  {
    super.a(par1GuiButton);
    if (par1GuiButton.l)
    {
      if (par1GuiButton.k == 201) {
        this.j.a(new GuiWaypoints(this));
      }
      if (par1GuiButton.k == 203) {
        this.j.a(new GuiMinimap2(this.guiModSettings));
      }
    }
  }
  
  public void a(int par1, int par2, float par3)
  {
    super.a(par1, par2, par3);
    a(this.q, this.title, this.l / 2, 5, 16777215);
  }
}
