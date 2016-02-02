package com.minimap.events;

import avb;

public class KeyEvent
{
  public avb kb;
  public boolean tickEnd;
  public boolean isRepeat;
  public boolean keyDown;
  
  public KeyEvent(avb kb, boolean tickEnd, boolean isRepeat, boolean keyDown)
  {
    this.kb = kb;
    this.tickEnd = tickEnd;
    this.isRepeat = isRepeat;
    this.keyDown = keyDown;
  }
}
