package mods.itemphysic;

import ave;
import avs;
import java.text.DecimalFormat;
import org.lwjgl.opengl.GL11;

public class GuiSlideControl
  extends avs
{
  public String label;
  public float curValue;
  public float minValue;
  public float maxValue;
  public boolean isSliding;
  public boolean useIntegers;
  private static DecimalFormat numFormat = new DecimalFormat("#.00");
  
  public GuiSlideControl(int id, int x, int y, int width, int height, String displayString, float minVal, float maxVal, float curVal, boolean useInts)
  {
    super(id, x, y, width, height, displayString + numFormat.format(curVal));
    
    label = displayString;
    minValue = minVal;
    maxValue = maxVal;
    curValue = ((curVal - minVal) / (maxVal - minVal));
    useIntegers = useInts;
  }
  
  public float GetValueAsFloat()
  {
    return (maxValue - minValue) * curValue + minValue;
  }
  
  public int GetValueAsInt()
  {
    return (int)((maxValue - minValue) * curValue + minValue);
  }
  
  protected float roundValue(float value)
  {
    value = 0.01F * Math.round(value / 0.01F);
    return value;
  }
  
  public String GetLabel()
  {
    if (useIntegers) {
      return label + GetValueAsInt();
    }
    return label + numFormat.format(GetValueAsFloat());
  }
  
  protected void SetLabel()
  {
    j = GetLabel();
  }
  
  protected int a(boolean isMouseOver)
  {
    return 0;
  }
  
  protected void b(ave mc, int mousePosX, int mousePosY)
  {
    if (m)
    {
      if (isSliding)
      {
        curValue = roundValue((mousePosX - (h + 4)) / (f - 8));
        if (curValue < 0.0F) {
          curValue = 0.0F;
        }
        if (curValue > 1.0F) {
          curValue = 1.0F;
        }
        SetLabel();
      }
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      b(h + (int)(curValue * (f - 8)), i, 0, 66, 4, 20);
      b(h + (int)(curValue * (f - 8)) + 4, i, 196, 66, 4, 20);
    }
  }
  
  public boolean c(ave mc, int mousePosX, int mousePosY)
  {
    if (super.c(mc, mousePosX, mousePosY))
    {
      curValue = roundValue((mousePosX - (h + 4)) / (f - 8));
      if (curValue < 0.0F) {
        curValue = 0.0F;
      }
      if (curValue > 1.0F) {
        curValue = 1.0F;
      }
      SetLabel();
      isSliding = true;
      return true;
    }
    return false;
  }
  
  public void a(int mousePosX, int mousePosY)
  {
    isSliding = false;
  }
}
