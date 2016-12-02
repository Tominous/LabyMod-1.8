package com.minimap.gui;

import ave;
import avs;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.settings.ModOptions;
import com.minimap.settings.ModSettings;
import java.util.List;

public class GuiMinimap2
  extends GuiSettings
{
  private MyTinyButton nextButton;
  private MyTinyButton prevButton;
  private String title;
  
  public GuiMinimap2(ModSettings par2ModSettings)
  {
    super(par2ModSettings);
    options = new ModOptions[] { ModOptions.DISPLAY_OTHER_TEAM, ModOptions.EAMOUNT, ModOptions.COORDS, ModOptions.WAYPOINTS, ModOptions.INGAME_WAYPOINTS, ModOptions.DEATHPOINTS, ModOptions.OLD_DEATHPOINTS, ModOptions.CHUNK_GRID, ModOptions.DOTS, ModOptions.DOTS_SCALE, ModOptions.OPACITY, ModOptions.SLIME_CHUNKS };
  }
  
  public void b()
  {
    super.b();
    screenTitle = XaeroMinimap.message;
    title = bnq.a("gui.xaero_minimap_settings", new Object[0]);
    if (ModSettings.serverSettings != Integer.MAX_VALUE) {
      title = ("§e" + bnq.a("gui.xaero_server_disabled", new Object[0]));
    }
    n.add(nextButton = new MyTinyButton(202, l / 2 + 80, m / 7 + 144, bnq.a("gui.xaero_next", new Object[0])));
    n.add(prevButton = new MyTinyButton(203, l / 2 - 155, m / 7 + 144, bnq.a("gui.xaero_previous", new Object[0])));
  }
  
  protected void a(avs par1GuiButton)
  {
    super.a(par1GuiButton);
    if (l)
    {
      if (k == 201) {
        j.a(new GuiWaypoints(this));
      }
      if (k == 202) {
        j.a(new GuiMinimap3(guiModSettings));
      }
      if (k == 203) {
        j.a(new GuiMinimap(guiModSettings));
      }
    }
  }
  
  public void a(int par1, int par2, float par3)
  {
    super.a(par1, par2, par3);
    a(q, title, l / 2, 5, 16777215);
  }
}
