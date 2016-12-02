package de.labystudio.slider;

import ave;
import avs;
import bfl;
import bmj;
import ns;

public class CustomSlider
  extends avs
{
  private float sliderValue;
  public boolean dragging;
  private SliderOption options;
  
  public CustomSlider(int id, int x, int y, SliderOption options, int width, int height)
  {
    super(id, x, y, width, height, "");
    sliderValue = 1.0F;
    this.options = options;
    ave minecraft = ave.A();
    sliderValue = options.normalizeValue(options.getCallback().getValue());
    j = options.getCallback().getTitle(options.getCallback().getValue());
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
        options.getCallback().setValue((int)f);
        sliderValue = options.normalizeValue(f);
        j = options.getCallback().getTitle(options.getCallback().getValue());
      }
      mc.P().a(a);
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
      options.getCallback().setValue((int)options.denormalizeValue(sliderValue));
      j = options.getCallback().getTitle(options.getCallback().getValue());
      dragging = true;
      return true;
    }
    return false;
  }
  
  public void a(int mouseX, int mouseY)
  {
    dragging = false;
  }
}
