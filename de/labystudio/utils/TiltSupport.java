package de.labystudio.utils;

import wn;

public class TiltSupport
{
  public static RenderCallback tiltCamera = null;
  
  public static abstract interface RenderCallback
  {
    public abstract void render(wn paramwn);
  }
}
