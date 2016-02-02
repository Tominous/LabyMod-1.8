package com.minimap.animation;

public class Animation
{
  public static void tick()
  {
    lastTick = System.currentTimeMillis();
  }
  
  public static double animate(double a, double factor)
  {
    double times = (System.currentTimeMillis() - lastTick) / 16.666666666666668D;
    a *= Math.pow(factor, times);
    return a;
  }
  
  public static long lastTick = ;
  public static final double animationThing = 16.666666666666668D;
}
