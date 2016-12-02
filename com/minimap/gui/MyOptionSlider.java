package com.minimap.gui;

import ave;
import avs;
import bfl;
import bmj;
import com.minimap.XaeroMinimap;
import com.minimap.settings.ModOptions;
import com.minimap.settings.ModSettings;
import java.io.IOException;
import ns;

public class MyOptionSlider
  extends avs
{
  private float sliderValue;
  public boolean dragging;
  private ModOptions options;
  
  public MyOptionSlider(int p_i45016_1_, int p_i45016_2_, int p_i45016_3_, ModOptions p_i45016_4_)
  {
    this(p_i45016_1_, p_i45016_2_, p_i45016_3_, p_i45016_4_, 0.0F, 1.0F);
  }
  
  public MyOptionSlider(int p_i45017_1_, int p_i45017_2_, int p_i45017_3_, ModOptions p_i45017_4_, float p_i45017_5_, float p_i45017_6_)
  {
    super(p_i45017_1_, p_i45017_2_, p_i45017_3_, 150, 20, "");
    sliderValue = 1.0F;
    options = p_i45017_4_;
    sliderValue = p_i45017_4_.normalizeValue(XaeroMinimap.getSettings().getOptionFloatValue(p_i45017_4_));
    j = XaeroMinimap.getSettings().getKeyBinding(p_i45017_4_);
  }
  
  protected int a(boolean mouseOver)
  {
    return 0;
  }
  
  protected void b(ave mc, int mouseX, int mouseY)
  {
    if (m)
    {
      if (dragging)
      {
        sliderValue = ((mouseX - (h + 4)) / (this.f - 8));
        sliderValue = ns.a(sliderValue, 0.0F, 1.0F);
        float f = options.denormalizeValue(sliderValue);
        try
        {
          XaeroMinimap.getSettings().setOptionFloatValue(options, f);
        }
        catch (IOException e)
        {
          e.printStackTrace();
        }
        sliderValue = options.normalizeValue(f);
        j = XaeroMinimap.getSettings().getKeyBinding(options);
      }
      mc.P().a(avs.a);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      b(h + (int)(sliderValue * (this.f - 8)), i, 0, 66, 4, 20);
      b(h + (int)(sliderValue * (this.f - 8)) + 4, i, 196, 66, 4, 20);
    }
  }
  
  public boolean c(ave mc, int mouseX, int mouseY)
  {
    if (super.c(mc, mouseX, mouseY))
    {
      sliderValue = ((mouseX - (h + 4)) / (f - 8));
      sliderValue = ns.a(sliderValue, 0.0F, 1.0F);
      try
      {
        XaeroMinimap.getSettings().setOptionFloatValue(options, options.denormalizeValue(sliderValue));
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      j = XaeroMinimap.getSettings().getKeyBinding(options);
      return dragging = 1;
    }
    return false;
  }
  
  public void a(int mouseX, int mouseY)
  {
    dragging = false;
  }
}
