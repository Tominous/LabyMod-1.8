package net.minecraft.realms;

import ave;
import avs;
import bfl;
import bmj;
import ns;

public class RealmsSliderButton
  extends RealmsButton
{
  public float value = 1.0F;
  public boolean sliding;
  private final float minValue;
  private final float maxValue;
  private int steps;
  
  public RealmsSliderButton(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, 0, 1.0F, ☃);
  }
  
  public RealmsSliderButton(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, float ☃, float ☃)
  {
    super(☃, ☃, ☃, ☃, 20, "");
    minValue = ☃;
    maxValue = ☃;
    
    value = toPct(☃);
    getProxyj = getMessage();
  }
  
  public String getMessage()
  {
    return "";
  }
  
  public float toPct(float ☃)
  {
    return ns.a((clamp(☃) - minValue) / (maxValue - minValue), 0.0F, 1.0F);
  }
  
  public float toValue(float ☃)
  {
    return clamp(minValue + (maxValue - minValue) * ns.a(☃, 0.0F, 1.0F));
  }
  
  public float clamp(float ☃)
  {
    ☃ = clampSteps(☃);
    return ns.a(☃, minValue, maxValue);
  }
  
  protected float clampSteps(float ☃)
  {
    if (steps > 0) {
      ☃ = steps * Math.round(☃ / steps);
    }
    return ☃;
  }
  
  public int getYImage(boolean ☃)
  {
    return 0;
  }
  
  public void renderBg(int ☃, int ☃)
  {
    if (!getProxym) {
      return;
    }
    if (sliding)
    {
      value = ((☃ - (getProxyh + 4)) / (getProxy().b() - 8));
      value = ns.a(value, 0.0F, 1.0F);
      float ☃ = toValue(value);
      clicked(☃);
      value = toPct(☃);
      getProxyj = getMessage();
    }
    ave.A().P().a(WIDGETS_LOCATION);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    blit(getProxyh + (int)(value * (getProxy().b() - 8)), getProxyi, 0, 66, 4, 20);
    blit(getProxyh + (int)(value * (getProxy().b() - 8)) + 4, getProxyi, 196, 66, 4, 20);
  }
  
  public void clicked(int ☃, int ☃)
  {
    value = ((☃ - (getProxyh + 4)) / (getProxy().b() - 8));
    value = ns.a(value, 0.0F, 1.0F);
    clicked(toValue(value));
    getProxyj = getMessage();
    sliding = true;
  }
  
  public void clicked(float ☃) {}
  
  public void released(int ☃, int ☃)
  {
    sliding = false;
  }
}
