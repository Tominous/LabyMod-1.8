package de.labystudio.gui.extras;

import ave;
import avs;
import bfl;
import bmj;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import ns;

public class SliderClicks
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
  
  public SliderClicks(int id, int x, int y, int size)
  {
    super(id, x, y, size, 20, "");
    this.sliderValue = 1.0F;
    this.field_146132_r = 0.0F;
    this.field_146131_s = 1.0F;
    this.size = (size + 15);
    ave var7 = ave.A();
    updateText();
    this.valueMin = 0;
    this.valueMax = 10.0F;
    this.valueStep = 1.0F;
  }
  
  public int getX()
  {
    return this.h;
  }
  
  public int getY()
  {
    return this.i;
  }
  
  protected int a(boolean mouseOver)
  {
    return 0;
  }
  
  public float denormalizeValue(float p_148262_1_)
  {
    return snapToStepClamp(this.valueMin + (this.valueMax - this.valueMin) * ns.a(p_148262_1_, 0.0F, 1.0F));
  }
  
  public float snapToStepClamp(float p_148268_1_)
  {
    p_148268_1_ = snapToStep(p_148268_1_);
    return ns.a(p_148268_1_, this.valueMin, this.valueMax);
  }
  
  protected float snapToStep(float p_148264_1_)
  {
    if (this.valueStep > 0.0F) {
      p_148264_1_ = this.valueStep * Math.round(p_148264_1_ / this.valueStep);
    }
    return p_148264_1_;
  }
  
  public void updateText()
  {
    if (ConfigManager.settings.clicktest == 0) {
      this.j = (Color.cl("c") + "OFF");
    } else {
      this.j = (ConfigManager.settings.clicktest + " seconds");
    }
  }
  
  protected void b(ave mc, int mouseX, int mouseY)
  {
    if (this.m)
    {
      if (this.dragging)
      {
        this.sliderValue = ((mouseX - (getX() + 4)) / (this.f - 8));
        this.sliderValue = ns.a(this.sliderValue, 0.0F, 1.0F);
        this.sliderValue = ((mouseX - (this.h + 4)) / (this.f - 8));
        this.sliderValue = ns.a(this.sliderValue, 0.0F, 1.0F);
        this.sliderValue = denormalizeValue(this.sliderValue);
        boolean run = false;
        if (ConfigManager.settings.clicktest == 0) {
          run = true;
        }
        ConfigManager.settings.clicktest = ((int)this.sliderValue);
        updateText();
      }
      mc.P().a(a);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      b(getX() + (int)(ConfigManager.settings.clicktest * this.size / this.valueMax * 0.76D), getY(), 0, 66, 4, 20);
      b(getX() + (int)(ConfigManager.settings.clicktest * this.size / this.valueMax * 0.76D) + 4, getY(), 196, 66, 4, 20);
    }
  }
  
  public boolean c(ave mc, int mouseX, int mouseY)
  {
    if (super.c(mc, mouseX, mouseY))
    {
      this.sliderValue = ((mouseX - (getX() + 4)) / (this.f - 8));
      this.sliderValue = ns.a(this.sliderValue, 0.0F, 1.0F);
      boolean run = false;
      if (ConfigManager.settings.clicktest == 0) {
        run = true;
      }
      ConfigManager.settings.clicktest = ((int)this.sliderValue);
      updateText();
      this.dragging = true;
      return true;
    }
    return false;
  }
  
  public void a(int mouseX, int mouseY)
  {
    this.dragging = false;
    ConfigManager.save();
  }
}
