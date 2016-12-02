package com.minimap.gui;

import ave;
import avs;
import avw;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.settings.ModOptions;
import com.minimap.settings.ModSettings;
import de.labystudio.modapi.ModAPI;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Keyboard;

public class GuiSlimeSeed
  extends GuiSettings
{
  public avw seedTextField;
  
  public GuiSlimeSeed()
  {
    super(XaeroMinimap.getSettings());
    options = new ModOptions[] { ModOptions.SLIME_CHUNKS };
  }
  
  public void b()
  {
    super.b();
    screenTitle = bnq.a("gui.xaero_slime_chunks", new Object[0]);
    (seedTextField = new avw(0, q, l / 2 - 100, m / 7 + 68, 200, 20)).a("" + (getSettingsserverSlimeSeed == 0L ? "" : Long.valueOf(getSettingsserverSlimeSeed)));
    Keyboard.enableRepeatEvents(true);
  }
  
  public void a(int mouseX, int mouseY, float partial)
  {
    super.a(mouseX, mouseY, partial);
    seedTextField.g();
    a(q, bnq.a("gui.xaero_used_seed", new Object[0]), l / 2, m / 7 + 55, 16777215);
  }
  
  public void e()
  {
    seedTextField.a();
  }
  
  protected void a(int par1, int par2, int par3)
    throws IOException
  {
    super.a(par1, par2, par3);
    seedTextField.a(par1, par2, par3);
  }
  
  protected void a(char par1, int par2)
    throws IOException
  {
    if (seedTextField.m()) {
      seedTextField.a(par1, par2);
    }
    if (par2 == 28) {
      a((avs)n.get(0));
    }
    String s = seedTextField.b();
    if (!StringUtils.isEmpty(s)) {
      try
      {
        long j = Long.parseLong(s);
        if (j != 0L) {
          getSettingsserverSlimeSeed = j;
        }
      }
      catch (NumberFormatException numberformatexception)
      {
        getSettingsserverSlimeSeed = s.hashCode();
      }
    }
    super.a(par1, par2);
  }
  
  protected void a(avs par1GuiButton)
  {
    if ((l) && (k == 200)) {
      j.a(ModAPI.getLastScreen());
    }
    super.a(par1GuiButton);
  }
}
