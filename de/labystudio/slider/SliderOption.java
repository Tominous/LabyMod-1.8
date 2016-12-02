package de.labystudio.slider;

import ns;

public class SliderOption
{
  private final boolean enumFloat;
  private final boolean enumBoolean;
  private final float valueStep;
  private float valueMin;
  private float valueMax;
  private SliderCallback callback;
  
  public SliderOption(boolean isFloat, boolean isBoolean, SliderCallback callback)
  {
    this(isFloat, isBoolean, 0.0F, 1.0F, 0.0F, callback);
  }
  
  public SliderOption(float min, float max, SliderCallback callback)
  {
    this(true, false, min, max, 0.0F, callback);
  }
  
  public SliderOption(boolean isFloat, boolean isBoolean, float valMin, float valMax, float valStep, SliderCallback callback)
  {
    enumFloat = isFloat;
    enumBoolean = isBoolean;
    valueMin = valMin;
    valueMax = valMax;
    valueStep = valStep;
    this.callback = callback;
  }
  
  public boolean getEnumFloat()
  {
    return enumFloat;
  }
  
  public boolean getEnumBoolean()
  {
    return enumBoolean;
  }
  
  public float getValueMin()
  {
    return valueMin;
  }
  
  public float getValueMax()
  {
    return valueMax;
  }
  
  public SliderCallback getCallback()
  {
    return callback;
  }
  
  public void setValueMax(float value)
  {
    valueMax = value;
  }
  
  public float normalizeValue(float value)
  {
    return ns.a((snapToStepClamp(value) - valueMin) / (valueMax - valueMin), 0.0F, 1.0F);
  }
  
  public float denormalizeValue(float value)
  {
    return snapToStepClamp(valueMin + (valueMax - valueMin) * ns.a(value, 0.0F, 1.0F));
  }
  
  public float snapToStepClamp(float value)
  {
    value = snapToStep(value);
    return ns.a(value, valueMin, valueMax);
  }
  
  protected float snapToStep(float value)
  {
    if (valueStep > 0.0F) {
      value = valueStep * Math.round(value / valueStep);
    }
    return value;
  }
}
