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
    this.iname = name;
    this.w = w;
    this.w0 = w;
    this.h = h;
    this.h0 = h;
    this.wc = wc;
    this.hc = hc;
    this.multi = ((wc != w) || (hc != h));
    boolean b = false;
    this.flipped = false;
    this.cflipped = false;
    this.bflipped = false;
    InterfaceHandler.list.add(this);
    this.id = InterfaceHandler.list.indexOf(this);
    Preset preset = (Preset)InterfaceHandler.presets.get(0);
    int bx = preset.coords[this.id][0];
    this.x = bx;
    this.actualx = bx;
    this.bx = bx;
    int by = preset.coords[this.id][1];
    this.y = by;
    this.actualy = by;
    this.by = by;
    boolean b2 = preset.types[this.id][0];
    this.centered = b2;
    this.bcentered = b2;
    boolean b3 = preset.types[this.id][1];
    this.fromRight = b3;
    this.bfromRight = b3;
    this.option = option;
    this.cBox = new CursorBox(2)
    {
      public String getString(int line)
      {
        switch (line)
        {
        case 0: 
          return bnq.a(Interface.this.iname, new Object[0]);
        case 1: 
          return bnq.a("gui.xaero_centered", new Object[0]) + " " + Interface.this.centered + " " + bnq.a("gui.xaero_press_c", new Object[0]);
        }
        return "";
      }
    };
  }
  
  public int getW(int scale)
  {
    return this.w;
  }
  
  public int getH(int scale)
  {
    return this.h;
  }
  
  public int getWC(int scale)
  {
    return this.wc;
  }
  
  public int getHC(int scale)
  {
    return this.hc;
  }
  
  public int getW0(int scale)
  {
    return this.w0;
  }
  
  public int getH0(int scale)
  {
    return this.h0;
  }
  
  public int getSize()
  {
    return this.w * this.h;
  }
  
  public void drawInterface(int width, int height, int scale, float partial)
  {
    if (this.fromRight) {
      this.x = (width - this.x);
    }
    GL11.glEnable(3008);
    bfl.l();
    bfl.b(770, 771);
  }
}
