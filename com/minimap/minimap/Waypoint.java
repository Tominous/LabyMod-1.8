package com.minimap.minimap;

import ave;
import avn;
import avo;
import avp;
import bfd;
import bfl;
import bfx;
import bmj;
import bms;
import bnq;
import com.minimap.XaeroMinimap;
import com.minimap.interfaces.InterfaceHandler;
import com.minimap.settings.ModSettings;
import java.awt.Color;

public class Waypoint
{
  public int x;
  public int y;
  public int z;
  public String name;
  public String symbol;
  public int color;
  public boolean disabled;
  public int type;
  public boolean rotation;
  public int yaw;
  
  public Waypoint(int x, int y, int z, String name, String symbol, int color)
  {
    this(x, y, z, name, symbol, color, 0);
  }
  
  public Waypoint(int x, int y, int z, String name, String symbol, int color, int type)
  {
    this.disabled = false;
    this.type = 0;
    this.rotation = false;
    this.yaw = 0;
    this.x = x;
    this.y = y;
    this.z = z;
    this.symbol = symbol;
    this.color = color;
    this.type = type;
    this.name = name;
  }
  
  public double getDistanceSq(double x, double y, double z)
  {
    double d3 = this.x - x;
    double d2 = this.y - y;
    d3 = this.z - z;
    return d3 * d3 + d2 * d2 + d3 * d3;
  }
  
  public String getName()
  {
    return bnq.a(this.name, new Object[0]);
  }
  
  public void drawIconInWorld(bfd worldrenderer, bfx tessellator, avn fontrenderer, String text, float textSize, boolean background, boolean showDistance)
  {
    bfl.a(XaeroMinimap.getSettings().waypointsScale, XaeroMinimap.getSettings().waypointsScale, 1.0F);
    if (this.type == 0)
    {
      int c = ModSettings.COLORS[this.color];
      float l = (c >> 16 & 0xFF) / 255.0F;
      float i1 = (c >> 8 & 0xFF) / 255.0F;
      float j1 = (c & 0xFF) / 255.0F;
      int s = fontrenderer.a(this.symbol) / 2;
      bfl.x();
      worldrenderer.a(7, bms.e);
      bfl.c(l, i1, j1, 0.4705882F);
      worldrenderer.b(-5.0D, -9.0D, 0.0D).d();
      worldrenderer.b(-5.0D, 0.0D, 0.0D).d();
      worldrenderer.b(4.0D, 0.0D, 0.0D).d();
      worldrenderer.b(4.0D, -9.0D, 0.0D).d();
      tessellator.b();
      bfl.w();
      fontrenderer.a(this.symbol, -s, -8, 553648127);
      fontrenderer.a(this.symbol, -s, -8, -1);
      bfl.a(textSize / 2.0F, textSize / 2.0F, 1.0F);
      int t = fontrenderer.a(text) / 2;
      if (background)
      {
        bfl.x();
        bfl.c(0.0F, 0.0F, 0.0F, 0.2745098F);
        worldrenderer.a(7, bms.e);
        worldrenderer.b(-t - 1.0D, 1.0D, 0.0D).d();
        worldrenderer.b(-t - 1.0D, 11.0D, 0.0D).d();
        worldrenderer.b(t + 1.0D, 11.0D, 0.0D).d();
        worldrenderer.b(t + 1.0D, 1.0D, 0.0D).d();
        tessellator.b();
        bfl.w();
      }
      fontrenderer.a(text, -t, 2, 553648127);
      fontrenderer.a(text, -t, 2, -1);
    }
    else if (this.type == 1)
    {
      ave.A().P().a(InterfaceHandler.guiTextures);
      float f = 0.00390625F;
      float f1 = 0.00390625F;
      bfl.c(1.0F, 1.0F, 1.0F, 0.7843137F);
      worldrenderer.a(7, bms.g);
      worldrenderer.b(-5.0D, -9.0D, 0.0D).a(0.0D, 78.0F * f1).d();
      worldrenderer.b(-5.0D, 0.0D, 0.0D).a(0.0D, 87.0F * f1).d();
      worldrenderer.b(4.0D, 0.0D, 0.0D).a(9.0F * f, 87.0F * f1).d();
      worldrenderer.b(4.0D, -9.0D, 0.0D).a(9.0F * f, 78.0F * f1).d();
      tessellator.b();
      if (!showDistance)
      {
        text = getName();
        textSize = 1.0F;
      }
      bfl.a(textSize / 2.0F, textSize / 2.0F, 1.0F);
      int t = fontrenderer.a(text) / 2;
      if (background)
      {
        bfl.x();
        bfl.c(0.0F, 0.0F, 0.0F, 0.2745098F);
        worldrenderer.a(7, bms.e);
        worldrenderer.b(-t - 1.0D, 1.0D, 0.0D).d();
        worldrenderer.b(-t - 1.0D, 11.0D, 0.0D).d();
        worldrenderer.b(t + 1.0D, 11.0D, 0.0D).d();
        worldrenderer.b(t + 1.0D, 1.0D, 0.0D).d();
        tessellator.b();
        bfl.w();
      }
      fontrenderer.a(text, -t, 2, 553648127);
      fontrenderer.a(text, -t, 2, -1);
    }
  }
  
  public void drawIconOnGUI(int drawX, int drawY)
  {
    if (this.type == 0)
    {
      int rectX2 = drawX + 9;
      int rectY2 = drawY + 9;
      avp.a(drawX, drawY, rectX2, rectY2, ModSettings.COLORS[this.color]);
      int j = ave.A().k.a(this.symbol) / 2;
      ave.A().k.a(this.symbol, drawX + 5 - j, drawY + 1, Minimap.radarPlayers.hashCode());
    }
    else if (this.type == 1)
    {
      ave.A().P().a(InterfaceHandler.guiTextures);
      ave.A().q.b(drawX, drawY, 0, 78, 9, 9);
    }
  }
}
