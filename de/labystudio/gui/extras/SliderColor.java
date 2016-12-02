package de.labystudio.gui.extras;

import ave;
import avs;
import bfl;
import bmj;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import ns;

public class SliderColor
  extends avs
{
  private float sliderValue;
  public boolean dragging;
  private final float field_146132_r;
  private final float field_146131_s;
  private final float size;
  private int valueMin;
  private int color;
  private int colorID;
  private float valueMax;
  private float valueStep;
  private static final String __OBFID = "CL_00000680";
  
  public SliderColor(int id, int x, int y, int size, int color)
  {
    super(id, x, y, size + 5, 20, "");
    sliderValue = 1.0F;
    field_146132_r = 0.0F;
    field_146131_s = 1.0F;
    this.size = (size - 5);
    colorID = color;
    this.color = getColor();
    ave var7 = ave.A();
    updateText();
    valueMin = 0;
    valueMax = 15.0F;
    valueStep = 1.0F;
  }
  
  public void setColor(int newColor)
  {
    switch (colorID)
    {
    case 1: 
      settingscolor1 = Color.IDToColor(newColor);
      break;
    case 2: 
      settingscolor2 = Color.IDToColor(newColor);
      break;
    case 3: 
      settingscolor3 = Color.IDToColor(newColor);
      break;
    case 4: 
      settingscolor4 = Color.IDToColor(newColor);
      break;
    case 5: 
      settingscolor5 = Color.IDToColor(newColor);
      break;
    case 6: 
      settingscolor6 = Color.IDToColor(newColor);
      break;
    case 7: 
      settingscolor7 = Color.IDToColor(newColor);
      break;
    case 8: 
      settingscolor8 = Color.IDToColor(newColor);
      break;
    case 9: 
      settingscolor9 = Color.IDToColor(newColor);
      break;
    case 10: 
      settingscolor10 = Color.IDToColor(newColor);
    }
  }
  
  public int getColor()
  {
    switch (colorID)
    {
    case 1: 
      return Color.colorToID(settingscolor1);
    case 2: 
      return Color.colorToID(settingscolor2);
    case 3: 
      return Color.colorToID(settingscolor3);
    case 4: 
      return Color.colorToID(settingscolor4);
    case 5: 
      return Color.colorToID(settingscolor5);
    case 6: 
      return Color.colorToID(settingscolor6);
    case 7: 
      return Color.colorToID(settingscolor7);
    case 8: 
      return Color.colorToID(settingscolor8);
    case 9: 
      return Color.colorToID(settingscolor9);
    case 10: 
      return Color.colorToID(settingscolor10);
    }
    return 0;
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
    color = getColor();
    j = "";
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
        setColor((int)sliderValue);
        updateText();
      }
      mc.P().a(a);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      for (int a = 0; a <= 2; a++) {
        for (int i = 0; i <= 15; i++) {
          if (i == getColor()) {
            c(k, Color.IDToColor(i) + Color.clc("l") + "▌", getX() + (int)(i * 100 / valueMax * 0.76D) + 2, getY() + a * 5 + 1, 0);
          } else {
            c(k, Color.IDToColor(i) + "*", getX() + (int)(i * 100 / valueMax * 0.76D) + 2, getY() + 5 + 1, 0);
          }
        }
      }
    }
  }
  
  public boolean c(ave mc, int mouseX, int mouseY)
  {
    if (super.c(mc, mouseX, mouseY))
    {
      sliderValue = ((mouseX - (getX() + 4)) / (f - 8));
      sliderValue = ns.a(sliderValue, 0.0F, 1.0F);
      setColor((int)sliderValue);
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
