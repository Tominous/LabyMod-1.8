package de.labystudio.utils;

import pk;

public class OldSneaking
{
  private static long sneak = 0L;
  private static boolean is = false;
  private static int value = 0;
  
  public static float getCustomEyeHeight(pk entity)
  {
    if ((is != entity.av()) || (sneak <= 0L)) {
      sneak = System.currentTimeMillis();
    }
    is = entity.av();
    
    float f = 1.62F;
    if (entity.av())
    {
      int a = (int)(sneak + 8L - System.currentTimeMillis());
      if (a > -50)
      {
        f += (float)(a * 0.0017D);
        if ((f < 0.0F) || (f > 10.0F)) {
          f = 1.54F;
        }
      }
      else
      {
        f = (float)(f - 0.08D);
      }
    }
    else
    {
      int a = (int)(sneak + 8L - System.currentTimeMillis());
      if (a > -50)
      {
        f -= (float)(a * 0.0017D);
        f = (float)(f - 0.08D);
        if (f < 0.0F) {
          f = 1.62F;
        }
      }
      else
      {
        f -= 0.0F;
      }
    }
    return f;
  }
}
