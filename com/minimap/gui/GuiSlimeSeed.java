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
    this.options = new ModOptions[] { ModOptions.SLIME_CHUNKS };
  }
  
  public void b()
  {
    super.b();
    this.screenTitle = bnq.a("gui.xaero_slime_chunks", new Object[0]);
    (this.seedTextField = new avw(0, this.q, this.l / 2 - 100, this.m / 7 + 68, 200, 20)).a("" + (XaeroMinimap.getSettings().serverSlimeSeed == 0L ? "" : Long.valueOf(XaeroMinimap.getSettings().serverSlimeSeed)));
    Keyboard.enableRepeatEvents(true);
  }
  
  public void a(int mouseX, int mouseY, float partial)
  {
    super.a(mouseX, mouseY, partial);
    this.seedTextField.g();
    a(this.q, bnq.a("gui.xaero_used_seed", new Object[0]), this.l / 2, this.m / 7 + 55, 16777215);
  }
  
  public void e()
  {
    this.seedTextField.a();
  }
  
  protected void a(int par1, int par2, int par3)
    throws IOException
  {
    super.a(par1, par2, par3);
    this.seedTextField.a(par1, par2, par3);
  }
  
  protected void a(char par1, int par2)
    throws IOException
  {
    if (this.seedTextField.m()) {
      this.seedTextField.a(par1, par2);
    }
    if (par2 == 28) {
      a((avs)this.n.get(0));
    }
    String s = this.seedTextField.b();
    if (!StringUtils.isEmpty(s)) {
      try
      {
        long j = Long.parseLong(s);
        if (j != 0L) {
          XaeroMinimap.getSettings().serverSlimeSeed = j;
        }
      }
      catch (NumberFormatException numberformatexception)
      {
        XaeroMinimap.getSettings().serverSlimeSeed = s.hashCode();
      }
    }
    super.a(par1, par2);
  }
  
  protected void a(avs par1GuiButton)
  {
    if ((par1GuiButton.l) && (par1GuiButton.k == 200)) {
      this.j.a(ModAPI.getLastScreen());
    }
    super.a(par1GuiButton);
  }
}
