package mods.worldeditcui.render.shapes;

import bfd;
import bfx;
import bms;
import mods.worldeditcui.render.LineColour;
import mods.worldeditcui.render.LineInfo;
import mods.worldeditcui.util.BoundingBox;
import mods.worldeditcui.util.Vector3;
import org.lwjgl.opengl.GL11;

public class Render3DGrid
{
  protected LineColour colour;
  protected Vector3 first;
  protected Vector3 second;
  
  public Render3DGrid(LineColour colour, BoundingBox region)
  {
    this(colour, region.getMin(), region.getMax());
  }
  
  public Render3DGrid(LineColour colour, Vector3 first, Vector3 second)
  {
    this.colour = colour;
    this.first = first;
    this.second = second;
  }
  
  public void render(Vector3 cameraPos)
  {
    bfx tessellator = bfx.a();
    bfd worldRenderer = tessellator.c();
    double x1 = first.getX() - cameraPos.getX();
    double y1 = first.getY() - cameraPos.getY();
    double z1 = first.getZ() - cameraPos.getZ();
    double x2 = second.getX() - cameraPos.getX();
    double y2 = second.getY() - cameraPos.getY();
    double z2 = second.getZ() - cameraPos.getZ();
    double cullAt = 128.0D;
    for (LineInfo tempColour : colour.getColours())
    {
      tempColour.prepareRender();
      worldRenderer.a(1, bms.e);
      tempColour.prepareColour();
      double offsetSize = 1.0D;
      for (double yoff = 0.0D; yoff + y1 <= y2; yoff += 1.0D)
      {
        double y3 = y1 + yoff;
        worldRenderer.b(x1, y3, z2).d();
        worldRenderer.b(x2, y3, z2).d();
        worldRenderer.b(x1, y3, z1).d();
        worldRenderer.b(x2, y3, z1).d();
        worldRenderer.b(x1, y3, z1).d();
        worldRenderer.b(x1, y3, z2).d();
        worldRenderer.b(x2, y3, z1).d();
        worldRenderer.b(x2, y3, z2).d();
      }
      for (double xoff = 0.0D; xoff + x1 <= x2; xoff += 1.0D)
      {
        double x3 = x1 + xoff;
        if (x3 >= -128.0D)
        {
          if (x3 > 128.0D) {
            break;
          }
          worldRenderer.b(x3, y1, z1).d();
          worldRenderer.b(x3, y2, z1).d();
          worldRenderer.b(x3, y1, z2).d();
          worldRenderer.b(x3, y2, z2).d();
          worldRenderer.b(x3, y2, z1).d();
          worldRenderer.b(x3, y2, z2).d();
          worldRenderer.b(x3, y1, z1).d();
          worldRenderer.b(x3, y1, z2).d();
        }
      }
      for (double zoff = 0.0D; zoff + z1 <= z2; zoff += 1.0D)
      {
        double z3 = z1 + zoff;
        if (z3 >= -128.0D)
        {
          if (z3 > 128.0D) {
            break;
          }
          worldRenderer.b(x1, y1, z3).d();
          worldRenderer.b(x2, y1, z3).d();
          worldRenderer.b(x1, y2, z3).d();
          worldRenderer.b(x2, y2, z3).d();
          worldRenderer.b(x2, y1, z3).d();
          worldRenderer.b(x2, y2, z3).d();
          worldRenderer.b(x1, y1, z3).d();
          worldRenderer.b(x1, y2, z3).d();
        }
      }
      tessellator.b();
    }
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
  }
}
