package de.labystudio.gui.extras;

import ave;
import avs;
import bfl;
import bmj;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import ns;

public class SliderSize
  extends avs
{
  private float sliderValue;
  public boolean dragging;
  private final float field_146132_r;
  private final float field_146131_s;
  private final float size;
  private int valueMin;
  private float valueMax;
  private float valueStep;
  private static final String __OBFID = "CL_00000680";
  
  public SliderSize(int id, int x, int y, int size)
  {
    super(id, x, y, size + 3, 20, "");
    sliderValue = 1.0F;
    field_146132_r = 0.0F;
    field_146131_s = 1.0F;
    this.size = size;
    ave var7 = ave.A();
    updateText();
    valueMin = 0;
    valueMax = 100.0F;
    valueStep = 1.0F;
  }
  
  public int getX()
  {
    return h;
  }
  
  public int getY()
  {
    return i;
  }
  
  protected int a(boolean mouseOver)
  {
    return 0;
  }
  
  public float denormalizeValue(float p_148262_1_)
  {
    return snapToStepClamp(valueMin + (valueMax - valueMin) * ns.a(p_148262_1_, 0.0F, 1.0F));
  }
  
  public float snapToStepClamp(float p_148268_1_)
  {
    p_148268_1_ = snapToStep(p_148268_1_);
    return ns.a(p_148268_1_, valueMin, valueMax);
  }
  
  protected float snapToStep(float p_148264_1_)
  {
    if (valueStep > 0.0F) {
      p_148264_1_ = valueStep * Math.round(p_148264_1_ / valueStep);
    }
    return p_148264_1_;
  }
  
  public void updateText()
  {
    if (settingssize == 50) {
      j = ("" + Color.c + "a" + (settingssize + 50) + "%");
    } else {
      j = (settingssize + 50 + "%");
    }
  }
  
  protected void b(ave mc, int mouseX, int mouseY)
  {
    if (m)
    {
      if (dragging)
      {
        sliderValue = ((mouseX - (getX() + 4)) / (f - 8));
        sliderValue = ns.a(sliderValue, 0.0F, 1.0F);
        sliderValue = ((mouseX - (h + 4)) / (f - 8));
        sliderValue = ns.a(sliderValue, 0.0F, 1.0F);
        sliderValue = denormalizeValue(sliderValue);
        settingssize = ((int)sliderValue);
        updateText();
      }
      mc.P().a(a);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      b(getX() + (int)(settingssize * 100 / valueMax * 0.72D), getY(), 0, 66, 4, 20);
      b(getX() + (int)(settingssize * 100 / valueMax * 0.72D) + 4, getY(), 196, 66, 4, 20);
    }
  }
  
  public boolean c(ave mc, int mouseX, int mouseY)
  {
    if (super.c(mc, mouseX, mouseY))
    {
      sliderValue = ((mouseX - (getX() + 4)) / (f - 8));
      sliderValue = ns.a(sliderValue, 0.0F, 1.0F);
      settingssize = ((int)sliderValue);
      updateText();
      dragging = true;
      return true;
    }
    return false;
  }
  
  public void a(int mouseX, int mouseY)
  {
    dragging = false;
    ConfigManager.save();
  }
}
