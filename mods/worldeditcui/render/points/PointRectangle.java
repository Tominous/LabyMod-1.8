package mods.worldeditcui.render.points;

import mods.worldeditcui.render.LineColour;
import mods.worldeditcui.render.shapes.Render3DBox;
import mods.worldeditcui.util.Vector2;
import mods.worldeditcui.util.Vector3;

public class PointRectangle
{
  private static final double OFF = 0.03D;
  
  public PointRectangle(int x, int z)
  {
    this(new Vector2(x, z));
  }
  
  public PointRectangle(Vector2 point)
  {
    colour = LineColour.POLYPOINT;
    setPoint(point);
  }
  
  public void render(Vector3 cameraPos)
  {
    box.render(cameraPos);
  }
  
  public Vector2 getPoint()
  {
    return point;
  }
  
  public void setPoint(Vector2 point)
  {
    this.point = point;
  }
  
  public LineColour getColour()
  {
    return colour;
  }
  
  public void setColour(LineColour colour)
  {
    this.colour = colour;
  }
  
  public void setMinMax(int min, int max)
  {
    this.min = min;
    this.max = max;
    update();
  }
  
  public int getMin()
  {
    return min;
  }
  
  public int getMax()
  {
    return max;
  }
  
  private void update()
  {
    box = new Render3DBox(colour, point.subtract(MIN_VEC).toVector3(min - 0.03F), point.add(MAX_VEC).toVector3(max + 1 + 0.03F));
  }
  
  private static final Vector2 MIN_VEC = new Vector2(0.03D, 0.03D);
  private static final Vector2 MAX_VEC = new Vector2(1.03D, 1.03D);
  protected Vector2 point;
  protected LineColour colour;
  private int min;
  private int max;
  private Render3DBox box;
}
