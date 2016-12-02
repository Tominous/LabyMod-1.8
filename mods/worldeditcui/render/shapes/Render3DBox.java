package mods.worldeditcui.render.shapes;

import bfd;
import bfx;
import bms;
import mods.worldeditcui.render.LineColour;
import mods.worldeditcui.render.LineInfo;
import mods.worldeditcui.util.BoundingBox;
import mods.worldeditcui.util.Vector3;
import org.lwjgl.opengl.GL11;

public class Render3DBox
{
  protected LineColour colour;
  protected Vector3 first;
  protected Vector3 second;
  
  public Render3DBox(LineColour colour, BoundingBox region)
  {
    this(colour, region.getMin(), region.getMax());
  }
  
  public Render3DBox(LineColour colour, Vector3 first, Vector3 second)
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
    for (LineInfo tempColour : colour.getColours())
    {
      tempColour.prepareRender();
      
      worldRenderer.a(2, bms.e);
      tempColour.prepareColour();
      worldRenderer.b(x1, y1, z1).d();
      worldRenderer.b(x2, y1, z1).d();
      worldRenderer.b(x2, y1, z2).d();
      worldRenderer.b(x1, y1, z2).d();
      tessellator.b();
      
      worldRenderer.a(2, bms.e);
      tempColour.prepareColour();
      worldRenderer.b(x1, y2, z1).d();
      worldRenderer.b(x2, y2, z1).d();
      worldRenderer.b(x2, y2, z2).d();
      worldRenderer.b(x1, y2, z2).d();
      tessellator.b();
      
      worldRenderer.a(1, bms.e);
      tempColour.prepareColour();
      
      worldRenderer.b(x1, y1, z1).d();
      worldRenderer.b(x1, y2, z1).d();
      
      worldRenderer.b(x2, y1, z1).d();
      worldRenderer.b(x2, y2, z1).d();
      
      worldRenderer.b(x2, y1, z2).d();
      worldRenderer.b(x2, y2, z2).d();
      
      worldRenderer.b(x1, y1, z2).d();
      worldRenderer.b(x1, y2, z2).d();
      
      tessellator.b();
    }
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
  }
}
