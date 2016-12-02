package mods.worldeditcui.util;

import ave;
import bew;
import java.io.PrintStream;

public class RegionUtils
{
  private static float rotationYaw;
  private static float rotationPitch;
  
  public static Vector getDirection(String dirStr)
  {
    dirStr = dirStr.toLowerCase();
    
    PlayerDirection dir = getPlayerDirection(dirStr);
    
    System.out.println(dir.name());
    switch (dir)
    {
    case WEST: 
    case EAST: 
    case SOUTH: 
    case NORTH: 
    case UP: 
    case DOWN: 
      return dir.vector();
    }
    return null;
  }
  
  private static PlayerDirection getPlayerDirection(String dirStr)
  {
    PlayerDirection dir = null;
    switch (dirStr.charAt(0))
    {
    case 'w': 
      dir = PlayerDirection.WEST;
      break;
    case 'e': 
      dir = PlayerDirection.EAST;
      break;
    case 's': 
      if (dirStr.indexOf('w') > 0) {
        return PlayerDirection.SOUTH_WEST;
      }
      if (dirStr.indexOf('e') > 0) {
        return PlayerDirection.SOUTH_EAST;
      }
      dir = PlayerDirection.SOUTH;
      break;
    case 'n': 
      if (dirStr.indexOf('w') > 0) {
        return PlayerDirection.NORTH_WEST;
      }
      if (dirStr.indexOf('e') > 0) {
        return PlayerDirection.NORTH_EAST;
      }
      dir = PlayerDirection.NORTH;
      break;
    case 'u': 
      dir = PlayerDirection.UP;
      break;
    case 'd': 
      dir = PlayerDirection.DOWN;
      break;
    case 'f': 
    case 'm': 
      dir = getCardinalDirection(0);
      break;
    case 'b': 
      dir = getCardinalDirection(180);
      break;
    case 'l': 
      dir = getCardinalDirection(-90);
      break;
    case 'r': 
      dir = getCardinalDirection(90);
    }
    return dir;
  }
  
  private static PlayerDirection getCardinalDirection(int yawOffset)
  {
    if (getPitch() > 67.5D) {
      return PlayerDirection.DOWN;
    }
    if (getPitch() < -67.5D) {
      return PlayerDirection.UP;
    }
    double rot = (getYaw() + yawOffset) % 360.0F;
    if (rot < 0.0D) {
      rot += 360.0D;
    }
    return getDirection(rot);
  }
  
  private static float getPitch()
  {
    return rotationPitch;
  }
  
  private static float getYaw()
  {
    return rotationYaw;
  }
  
  public static void setLastYawAndPitch()
  {
    rotationPitch = Ah.z;
    rotationYaw = Ah.y;
  }
  
  private static PlayerDirection getDirection(double rot)
  {
    if ((0.0D <= rot) && (rot < 22.5D)) {
      return PlayerDirection.SOUTH;
    }
    if ((22.5D <= rot) && (rot < 67.5D)) {
      return PlayerDirection.SOUTH_WEST;
    }
    if ((67.5D <= rot) && (rot < 112.5D)) {
      return PlayerDirection.WEST;
    }
    if ((112.5D <= rot) && (rot < 157.5D)) {
      return PlayerDirection.NORTH_WEST;
    }
    if ((157.5D <= rot) && (rot < 202.5D)) {
      return PlayerDirection.NORTH;
    }
    if ((202.5D <= rot) && (rot < 247.5D)) {
      return PlayerDirection.NORTH_EAST;
    }
    if ((247.5D <= rot) && (rot < 292.5D)) {
      return PlayerDirection.EAST;
    }
    if ((292.5D <= rot) && (rot < 337.5D)) {
      return PlayerDirection.SOUTH_EAST;
    }
    if ((337.5D <= rot) && (rot < 360.0D)) {
      return PlayerDirection.SOUTH;
    }
    return null;
  }
  
  public static class VectorSet
  {
    private Vector vector1;
    private Vector vector2;
    
    public VectorSet(Vector vector1, Vector vector2)
    {
      this.vector1 = vector1;
      this.vector2 = vector2;
    }
    
    public Vector getVector1()
    {
      return vector1;
    }
    
    public Vector getVector2()
    {
      return vector2;
    }
  }
  
  public static VectorSet expand(Vector pos1, Vector pos2, Vector... changes)
  {
    for (Vector change : changes)
    {
      if (change.getX() > 0.0D)
      {
        if (Math.max(pos1.getX(), pos2.getX()) == pos1.getX()) {
          pos1 = pos1.add(new Vector(change.getX(), 0.0D, 0.0D));
        } else {
          pos2 = pos2.add(new Vector(change.getX(), 0.0D, 0.0D));
        }
      }
      else if (Math.min(pos1.getX(), pos2.getX()) == pos1.getX()) {
        pos1 = pos1.add(new Vector(change.getX(), 0.0D, 0.0D));
      } else {
        pos2 = pos2.add(new Vector(change.getX(), 0.0D, 0.0D));
      }
      if (change.getY() > 0.0D)
      {
        if (Math.max(pos1.getY(), pos2.getY()) == pos1.getY()) {
          pos1 = pos1.add(new Vector(0.0D, change.getY(), 0.0D));
        } else {
          pos2 = pos2.add(new Vector(0.0D, change.getY(), 0.0D));
        }
      }
      else if (Math.min(pos1.getY(), pos2.getY()) == pos1.getY()) {
        pos1 = pos1.add(new Vector(0.0D, change.getY(), 0.0D));
      } else {
        pos2 = pos2.add(new Vector(0.0D, change.getY(), 0.0D));
      }
      if (change.getZ() > 0.0D)
      {
        if (Math.max(pos1.getZ(), pos2.getZ()) == pos1.getZ()) {
          pos1 = pos1.add(new Vector(0.0D, 0.0D, change.getZ()));
        } else {
          pos2 = pos2.add(new Vector(0.0D, 0.0D, change.getZ()));
        }
      }
      else if (Math.min(pos1.getZ(), pos2.getZ()) == pos1.getZ()) {
        pos1 = pos1.add(new Vector(0.0D, 0.0D, change.getZ()));
      } else {
        pos2 = pos2.add(new Vector(0.0D, 0.0D, change.getZ()));
      }
    }
    return new VectorSet(pos1, pos2);
  }
  
  public static VectorSet shift(Vector pos1, Vector pos2, Vector... changes)
  {
    for (Vector change : changes)
    {
      pos1 = pos1.add(change);
      pos2 = pos2.add(change);
    }
    return new VectorSet(pos1, pos2);
  }
  
  public static VectorSet contract(Vector pos1, Vector pos2, Vector... changes)
  {
    for (Vector change : changes)
    {
      if (change.getX() < 0.0D)
      {
        if (Math.max(pos1.getX(), pos2.getX()) == pos1.getX()) {
          pos1 = pos1.add(new Vector(change.getX(), 0.0D, 0.0D));
        } else {
          pos2 = pos2.add(new Vector(change.getX(), 0.0D, 0.0D));
        }
      }
      else if (Math.min(pos1.getX(), pos2.getX()) == pos1.getX()) {
        pos1 = pos1.add(new Vector(change.getX(), 0.0D, 0.0D));
      } else {
        pos2 = pos2.add(new Vector(change.getX(), 0.0D, 0.0D));
      }
      if (change.getY() < 0.0D)
      {
        if (Math.max(pos1.getY(), pos2.getY()) == pos1.getY()) {
          pos1 = pos1.add(new Vector(0.0D, change.getY(), 0.0D));
        } else {
          pos2 = pos2.add(new Vector(0.0D, change.getY(), 0.0D));
        }
      }
      else if (Math.min(pos1.getY(), pos2.getY()) == pos1.getY()) {
        pos1 = pos1.add(new Vector(0.0D, change.getY(), 0.0D));
      } else {
        pos2 = pos2.add(new Vector(0.0D, change.getY(), 0.0D));
      }
      if (change.getZ() < 0.0D)
      {
        if (Math.max(pos1.getZ(), pos2.getZ()) == pos1.getZ()) {
          pos1 = pos1.add(new Vector(0.0D, 0.0D, change.getZ()));
        } else {
          pos2 = pos2.add(new Vector(0.0D, 0.0D, change.getZ()));
        }
      }
      else if (Math.min(pos1.getZ(), pos2.getZ()) == pos1.getZ()) {
        pos1 = pos1.add(new Vector(0.0D, 0.0D, change.getZ()));
      } else {
        pos2 = pos2.add(new Vector(0.0D, 0.0D, change.getZ()));
      }
    }
    return new VectorSet(pos1, pos2);
  }
}
