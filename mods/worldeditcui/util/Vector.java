package mods.worldeditcui.util;

public class Vector
  implements Comparable<Vector>
{
  public static final Vector ZERO = new Vector(0, 0, 0);
  public static final Vector UNIT_X = new Vector(1, 0, 0);
  public static final Vector UNIT_Y = new Vector(0, 1, 0);
  public static final Vector UNIT_Z = new Vector(0, 0, 1);
  public static final Vector ONE = new Vector(1, 1, 1);
  protected final double x;
  protected final double y;
  protected final double z;
  
  public Vector(double x, double y, double z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public Vector(int x, int y, int z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public Vector(float x, float y, float z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public Vector(Vector other)
  {
    x = x;
    y = y;
    z = z;
  }
  
  public Vector()
  {
    x = 0.0D;
    y = 0.0D;
    z = 0.0D;
  }
  
  public double getX()
  {
    return x;
  }
  
  public int getBlockX()
  {
    return (int)Math.round(x);
  }
  
  public Vector setX(double x)
  {
    return new Vector(x, y, z);
  }
  
  public Vector setX(int x)
  {
    return new Vector(x, y, z);
  }
  
  public double getY()
  {
    return y;
  }
  
  public int getBlockY()
  {
    return (int)Math.round(y);
  }
  
  public Vector setY(double y)
  {
    return new Vector(x, y, z);
  }
  
  public Vector setY(int y)
  {
    return new Vector(x, y, z);
  }
  
  public double getZ()
  {
    return z;
  }
  
  public int getBlockZ()
  {
    return (int)Math.round(z);
  }
  
  public Vector setZ(double z)
  {
    return new Vector(x, y, z);
  }
  
  public Vector setZ(int z)
  {
    return new Vector(x, y, z);
  }
  
  public Vector add(Vector other)
  {
    return new Vector(x + x, y + y, z + z);
  }
  
  public Vector add(double x, double y, double z)
  {
    return new Vector(this.x + x, this.y + y, this.z + z);
  }
  
  public Vector add(int x, int y, int z)
  {
    return new Vector(this.x + x, this.y + y, this.z + z);
  }
  
  public Vector add(Vector... others)
  {
    double newX = x;double newY = y;double newZ = z;
    for (Vector other : others)
    {
      newX += x;
      newY += y;
      newZ += z;
    }
    return new Vector(newX, newY, newZ);
  }
  
  public Vector subtract(Vector other)
  {
    return new Vector(x - x, y - y, z - z);
  }
  
  public Vector subtract(double x, double y, double z)
  {
    return new Vector(this.x - x, this.y - y, this.z - z);
  }
  
  public Vector subtract(int x, int y, int z)
  {
    return new Vector(this.x - x, this.y - y, this.z - z);
  }
  
  public Vector subtract(Vector... others)
  {
    double newX = x;double newY = y;double newZ = z;
    for (Vector other : others)
    {
      newX -= x;
      newY -= y;
      newZ -= z;
    }
    return new Vector(newX, newY, newZ);
  }
  
  public Vector multiply(Vector other)
  {
    return new Vector(x * x, y * y, z * z);
  }
  
  public Vector multiply(double x, double y, double z)
  {
    return new Vector(this.x * x, this.y * y, this.z * z);
  }
  
  public Vector multiply(int x, int y, int z)
  {
    return new Vector(this.x * x, this.y * y, this.z * z);
  }
  
  public Vector multiply(Vector... others)
  {
    double newX = x;double newY = y;double newZ = z;
    for (Vector other : others)
    {
      newX *= x;
      newY *= y;
      newZ *= z;
    }
    return new Vector(newX, newY, newZ);
  }
  
  public Vector multiply(double n)
  {
    return new Vector(x * n, y * n, z * n);
  }
  
  public Vector multiply(float n)
  {
    return new Vector(x * n, y * n, z * n);
  }
  
  public Vector multiply(int n)
  {
    return new Vector(x * n, y * n, z * n);
  }
  
  public Vector divide(Vector other)
  {
    return new Vector(x / x, y / y, z / z);
  }
  
  public Vector divide(double x, double y, double z)
  {
    return new Vector(this.x / x, this.y / y, this.z / z);
  }
  
  public Vector divide(int x, int y, int z)
  {
    return new Vector(this.x / x, this.y / y, this.z / z);
  }
  
  public Vector divide(int n)
  {
    return new Vector(x / n, y / n, z / n);
  }
  
  public Vector divide(double n)
  {
    return new Vector(x / n, y / n, z / n);
  }
  
  public Vector divide(float n)
  {
    return new Vector(x / n, y / n, z / n);
  }
  
  public double length()
  {
    return Math.sqrt(x * x + y * y + z * z);
  }
  
  public double lengthSq()
  {
    return x * x + y * y + z * z;
  }
  
  public double distance(Vector other)
  {
    return Math.sqrt(Math.pow(x - x, 2.0D) + Math.pow(y - y, 2.0D) + 
      Math.pow(z - z, 2.0D));
  }
  
  public double distanceSq(Vector other)
  {
    return Math.pow(x - x, 2.0D) + Math.pow(y - y, 2.0D) + Math.pow(z - z, 2.0D);
  }
  
  public Vector normalize()
  {
    return divide(length());
  }
  
  public double dot(Vector other)
  {
    return x * x + y * y + z * z;
  }
  
  public Vector cross(Vector other)
  {
    return new Vector(y * z - z * y, z * x - x * z, x * y - y * x);
  }
  
  public boolean containedWithin(Vector min, Vector max)
  {
    return (x >= x) && (x <= x) && (y >= y) && (y <= y) && (z >= z) && (z <= z);
  }
  
  public boolean containedWithinBlock(Vector min, Vector max)
  {
    return (getBlockX() >= min.getBlockX()) && (getBlockX() <= max.getBlockX()) && (getBlockY() >= min.getBlockY()) && (getBlockY() <= max.getBlockY()) && (getBlockZ() >= min.getBlockZ()) && (getBlockZ() <= max.getBlockZ());
  }
  
  public Vector clampY(int min, int max)
  {
    return new Vector(x, Math.max(min, Math.min(max, y)), z);
  }
  
  public Vector floor()
  {
    return new Vector(Math.floor(x), Math.floor(y), Math.floor(z));
  }
  
  public Vector ceil()
  {
    return new Vector(Math.ceil(x), Math.ceil(y), Math.ceil(z));
  }
  
  public Vector round()
  {
    return new Vector(Math.floor(x + 0.5D), Math.floor(y + 0.5D), Math.floor(z + 0.5D));
  }
  
  public Vector positive()
  {
    return new Vector(Math.abs(x), Math.abs(y), Math.abs(z));
  }
  
  public Vector transform2D(double angle, double aboutX, double aboutZ, double translateX, double translateZ)
  {
    angle = Math.toRadians(angle);
    double x = this.x - aboutX;
    double z = this.z - aboutZ;
    double x2 = x * Math.cos(angle) - z * Math.sin(angle);
    double z2 = x * Math.sin(angle) + z * Math.cos(angle);
    
    return new Vector(x2 + aboutX + translateX, y, z2 + aboutZ + translateZ);
  }
  
  public boolean isCollinearWith(Vector other)
  {
    if ((x == 0.0D) && (y == 0.0D) && (z == 0.0D)) {
      return true;
    }
    double otherX = x;
    double otherY = y;
    double otherZ = z;
    if ((otherX == 0.0D) && (otherY == 0.0D) && (otherZ == 0.0D)) {
      return true;
    }
    if ((x == 0.0D ? 1 : 0) != (otherX == 0.0D ? 1 : 0)) {
      return false;
    }
    if ((y == 0.0D ? 1 : 0) != (otherY == 0.0D ? 1 : 0)) {
      return false;
    }
    if ((z == 0.0D ? 1 : 0) != (otherZ == 0.0D ? 1 : 0)) {
      return false;
    }
    double quotientX = otherX / x;
    if (!Double.isNaN(quotientX)) {
      return other.equals(multiply(quotientX));
    }
    double quotientY = otherY / y;
    if (!Double.isNaN(quotientY)) {
      return other.equals(multiply(quotientY));
    }
    double quotientZ = otherZ / z;
    if (!Double.isNaN(quotientZ)) {
      return other.equals(multiply(quotientZ));
    }
    throw new RuntimeException("This should not happen");
  }
  
  public float toPitch()
  {
    double x = getX();
    double z = getZ();
    if ((x == 0.0D) && (z == 0.0D)) {
      return getY() > 0.0D ? -90.0F : 90.0F;
    }
    double x2 = x * x;
    double z2 = z * z;
    double xz = Math.sqrt(x2 + z2);
    return (float)Math.toDegrees(Math.atan(-getY() / xz));
  }
  
  public float toYaw()
  {
    double x = getX();
    double z = getZ();
    
    double t = Math.atan2(-x, z);
    double _2pi = 6.283185307179586D;
    
    return (float)Math.toDegrees((t + _2pi) % _2pi);
  }
  
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Vector)) {
      return false;
    }
    Vector other = (Vector)obj;
    return (x == x) && (y == y) && (z == z);
  }
  
  public int compareTo(Vector other)
  {
    if (other == null) {
      throw new IllegalArgumentException("null not supported");
    }
    if (y != y) {
      return Double.compare(y, y);
    }
    if (z != z) {
      return Double.compare(z, z);
    }
    if (x != x) {
      return Double.compare(x, x);
    }
    return 0;
  }
  
  public int hashCode()
  {
    int hash = 7;
    
    hash = 79 * hash + (int)(Double.doubleToLongBits(x) ^ Double.doubleToLongBits(x) >>> 32);
    
    hash = 79 * hash + (int)(Double.doubleToLongBits(y) ^ Double.doubleToLongBits(y) >>> 32);
    
    hash = 79 * hash + (int)(Double.doubleToLongBits(z) ^ Double.doubleToLongBits(z) >>> 32);
    return hash;
  }
  
  public String toString()
  {
    return "(" + x + ", " + y + ", " + z + ")";
  }
  
  public static Vector getMinimum(Vector v1, Vector v2)
  {
    return new Vector(Math.min(x, x), Math.min(y, y), Math.min(z, z));
  }
  
  public static Vector getMaximum(Vector v1, Vector v2)
  {
    return new Vector(Math.max(x, x), Math.max(y, y), Math.max(z, z));
  }
  
  public static Vector getMidpoint(Vector v1, Vector v2)
  {
    return new Vector((x + x) / 2.0D, (y + y) / 2.0D, (z + z) / 2.0D);
  }
}
