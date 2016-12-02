package de.labystudio.gui.extras;

import ave;
import avs;
import bfl;
import bmj;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import ns;

public class SliderCoords
  extends avs
{
  private float sliderValue;
  private boolean dragging;
  private final float field_146132_r;
  private final float field_146131_s;
  private final float size;
  private int valueMin;
  private float valueMax;
  private float valueStep;
  private static final String __OBFID = "CL_00000680";
  
  public SliderCoords(int x, int y, int size)
  {
    super(-3, x, y, size + 5, 20, "");
    sliderValue = 1.0F;
    field_146132_r = 0.0F;
    field_146131_s = 1.0F;
    this.size = (size - 5);
    ave var7 = ave.A();
    updateText();
    valueMin = 0;
    valueMax = 4.0F;
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
    if (settingstruncateCoords == 0) {
      j = (Color.cl("c") + settingstruncateCoords + " digits");
    } else {
      j = (settingstruncateCoords + " digits");
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
        settingstruncateCoords = ((int)sliderValue);
        updateText();
      }
      mc.P().a(a);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      b(getX() + (int)(settingstruncateCoords * 100 / valueMax * 0.72D), getY(), 0, 66, 4, 20);
      b(getX() + (int)(settingstruncateCoords * 100 / valueMax * 0.72D) + 4, getY(), 196, 66, 4, 20);
    }
  }
  
  public boolean c(ave mc, int mouseX, int mouseY)
  {
    if (super.c(mc, mouseX, mouseY))
    {
      sliderValue = ((mouseX - (getX() + 4)) / (f - 8));
      sliderValue = ns.a(sliderValue, 0.0F, 1.0F);
      settingstruncateCoords = ((int)(sliderValue * valueMax));
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
