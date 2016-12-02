package com.minimap.interfaces;

import bfl;
import bnq;
import com.minimap.settings.ModOptions;
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;

public abstract class Interface
{
  public CursorBox cBox;
  public String iname;
  public int id;
  public int bx;
  public int by;
  public int x;
  public int y;
  public int actualx;
  public int actualy;
  public int w0;
  public int h0;
  public int w;
  public int h;
  public int wc;
  public int hc;
  public boolean multi;
  public boolean centered;
  public boolean bcentered;
  public boolean flipped;
  public boolean bflipped;
  public boolean cflipped;
  public boolean fromRight;
  public boolean bfromRight;
  public ModOptions option;
  
  public Interface(String name, int w, int h, ModOptions option)
  {
    this(name, w, h, w, h, option);
  }
  
  public Interface(String name, int w, int h, int wc, int hc, ModOptions option)
  {
    iname = name;
    this.w = w;
    w0 = w;
    this.h = h;
    h0 = h;
    this.wc = wc;
    this.hc = hc;
    multi = ((wc != w) || (hc != h));
    boolean b = false;
    flipped = false;
    cflipped = false;
    bflipped = false;
    InterfaceHandler.list.add(this);
    id = InterfaceHandler.list.indexOf(this);
    Preset preset = (Preset)InterfaceHandler.presets.get(0);
    int bx = coords[id][0];
    x = bx;
    actualx = bx;
    this.bx = bx;
    int by = coords[id][1];
    y = by;
    actualy = by;
    this.by = by;
    boolean b2 = types[id][0];
    centered = b2;
    bcentered = b2;
    boolean b3 = types[id][1];
    fromRight = b3;
    bfromRight = b3;
    this.option = option;
    cBox = new CursorBox(2)
    {
      public String getString(int line)
      {
        switch (line)
        {
        case 0: 
          return bnq.a(iname, new Object[0]);
        case 1: 
          return bnq.a("gui.xaero_centered", new Object[0]) + " " + centered + " " + bnq.a("gui.xaero_press_c", new Object[0]);
        }
        return "";
      }
    };
  }
  
  public int getW(int scale)
  {
    return w;
  }
  
  public int getH(int scale)
  {
    return h;
  }
  
  public int getWC(int scale)
  {
    return wc;
  }
  
  public int getHC(int scale)
  {
    return hc;
  }
  
  public int getW0(int scale)
  {
    return w0;
  }
  
  public int getH0(int scale)
  {
    return h0;
  }
  
  public int getSize()
  {
    return w * h;
  }
  
  public void drawInterface(int width, int height, int scale, float partial)
  {
    if (fromRight) {
      x = (width - x);
    }
    GL11.glEnable(3008);
    bfl.l();
    bfl.b(770, 771);
  }
}
