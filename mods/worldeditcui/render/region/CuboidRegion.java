package mods.worldeditcui.render.region;

import mods.worldeditcui.WorldEditCUI;
import mods.worldeditcui.render.LineColour;
import mods.worldeditcui.render.points.PointCube;
import mods.worldeditcui.render.shapes.Render3DBox;
import mods.worldeditcui.render.shapes.Render3DGrid;
import mods.worldeditcui.util.BoundingBox;
import mods.worldeditcui.util.Vector3;

public class CuboidRegion
  extends BaseRegion
{
  protected PointCube firstPoint;
  protected PointCube secondPoint;
  private Render3DGrid grid;
  private Render3DBox box;
  
  public CuboidRegion(WorldEditCUI controller)
  {
    super(controller);
  }
  
  public void render(Vector3 cameraPos)
  {
    if ((firstPoint != null) && (secondPoint != null))
    {
      grid.render(cameraPos);
      box.render(cameraPos);
      firstPoint.render(cameraPos);
      secondPoint.render(cameraPos);
    }
    else if (firstPoint != null)
    {
      firstPoint.render(cameraPos);
    }
    else if (secondPoint != null)
    {
      secondPoint.render(cameraPos);
    }
  }
  
  public void setCuboidPoint(int id, double x, double y, double z)
  {
    if (id == 0) {
      (firstPoint = new PointCube(x, y, z)).setColour(LineColour.CUBOIDPOINT1);
    } else if (id == 1) {
      (secondPoint = new PointCube(x, y, z)).setColour(LineColour.CUBOIDPOINT2);
    }
    if ((firstPoint != null) && (secondPoint != null))
    {
      BoundingBox bounds = new BoundingBox(firstPoint, secondPoint);
      grid = new Render3DGrid(LineColour.CUBOIDGRID, bounds);
      box = new Render3DBox(LineColour.CUBOIDBOX, bounds);
    }
  }
  
  public void clear()
  {
    firstPoint = null;
    secondPoint = null;
  }
  
  public PointCube getFirstPoint()
  {
    return firstPoint;
  }
  
  public PointCube getSecondPoint()
  {
    return secondPoint;
  }
  
  public RegionType getType()
  {
    return RegionType.CUBOID;
  }
  
  public void expandVert()
  {
    setFirstSecond(new PointCube(firstPoint.getPoint().getX(), 0.0D, firstPoint.getPoint().getZ()), new PointCube(secondPoint
      .getPoint().getX(), 255.0D, secondPoint.getPoint().getZ()));
  }
  
  public void setFirstSecond(PointCube first, PointCube second)
  {
    (firstPoint = first).setColour(LineColour.CUBOIDPOINT1);
    (secondPoint = second).setColour(LineColour.CUBOIDPOINT2);
    
    BoundingBox bounds = new BoundingBox(firstPoint, secondPoint);
    grid = new Render3DGrid(LineColour.CUBOIDGRID, bounds);
    box = new Render3DBox(LineColour.CUBOIDBOX, bounds);
  }
}
