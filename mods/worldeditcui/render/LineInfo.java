package mods.worldeditcui.render;

import org.lwjgl.opengl.GL11;

public class LineInfo
{
  public float lineWidth;
  public float red;
  public float green;
  public float blue;
  public float alpha;
  public int depthfunc;
  
  public LineInfo(float lineWidth, float r, float g, float b, float a, int depthfunc)
  {
    this.lineWidth = lineWidth;
    red = r;
    green = g;
    blue = b;
    alpha = a;
    this.depthfunc = depthfunc;
  }
  
  public LineInfo(float lineWidth, float r, float g, float b)
  {
    this(lineWidth, r, g, b, 1.0F, 515);
  }
  
  public LineInfo(LineInfo orig)
  {
    lineWidth = lineWidth;
    red = red;
    green = green;
    blue = blue;
    alpha = alpha;
    depthfunc = depthfunc;
  }
  
  public void prepareRender()
  {
    GL11.glLineWidth(lineWidth);
    GL11.glDepthFunc(depthfunc);
  }
  
  public void prepareColour()
  {
    GL11.glColor4f(red, green, blue, alpha);
  }
}
