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
    this.x = other.x;
    this.y = other.y;
    this.z = other.z;
  }
  
  public Vector()
  {
    this.x = 0.0D;
    this.y = 0.0D;
    this.z = 0.0D;
  }
  
  public double getX()
  {
    return this.x;
  }
  
  public int getBlockX()
  {
    return (int)Math.round(this.x);
  }
  
  public Vector setX(double x)
  {
    return new Vector(x, this.y, this.z);
  }
  
  public Vector setX(int x)
  {
    return new Vector(x, this.y, this.z);
  }
  
  public double getY()
  {
    return this.y;
  }
  
  public int getBlockY()
  {
    return (int)Math.round(this.y);
  }
  
  public Vector setY(double y)
  {
    return new Vector(this.x, y, this.z);
  }
  
  public Vector setY(int y)
  {
    return new Vector(this.x, y, this.z);
  }
  
  public double getZ()
  {
    return this.z;
  }
  
  public int getBlockZ()
  {
    return (int)Math.round(this.z);
  }
  
  public Vector setZ(double z)
  {
    return new Vector(this.x, this.y, z);
  }
  
  public Vector setZ(int z)
  {
    return new Vector(this.x, this.y, z);
  }
  
  public Vector add(Vector other)
  {
    return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
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
    double newX = this.x;double newY = this.y;double newZ = this.z;
    for (Vector other : others)
    {
      newX += other.x;
      newY += other.y;
      newZ += other.z;
    }
    return new Vector(newX, newY, newZ);
  }
  
  public Vector subtract(Vector other)
  {
    return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
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
    double newX = this.x;double newY = this.y;double newZ = this.z;
    for (Vector other : others)
    {
      newX -= other.x;
      newY -= other.y;
      newZ -= other.z;
    }
    return new Vector(newX, newY, newZ);
  }
  
  public Vector multiply(Vector other)
  {
    return new Vector(this.x * other.x, this.y * other.y, this.z * other.z);
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
    double newX = this.x;double newY = this.y;double newZ = this.z;
    for (Vector other : others)
    {
      newX *= other.x;
      newY *= other.y;
      newZ *= other.z;
    }
    return new Vector(newX, newY, newZ);
  }
  
  public Vector multiply(double n)
  {
    return new Vector(this.x * n, this.y * n, this.z * n);
  }
  
  public Vector multiply(float n)
  {
    return new Vector(this.x * n, this.y * n, this.z * n);
  }
  
  public Vector multiply(int n)
  {
    return new Vector(this.x * n, this.y * n, this.z * n);
  }
  
  public Vector divide(Vector other)
  {
    return new Vector(this.x / other.x, this.y / other.y, this.z / other.z);
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
    return new Vector(this.x / n, this.y / n, this.z / n);
  }
  
  public Vector divide(double n)
  {
    return new Vector(this.x / n, this.y / n, this.z / n);
  }
  
  public Vector divide(float n)
  {
    return new Vector(this.x / n, this.y / n, this.z / n);
  }
  
  public double length()
  {
    return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
  }
  
  public double lengthSq()
  {
    return this.x * this.x + this.y * this.y + this.z * this.z;
  }
  
  public double distance(Vector other)
  {
    return Math.sqrt(Math.pow(other.x - this.x, 2.0D) + Math.pow(other.y - this.y, 2.0D) + 
      Math.pow(other.z - this.z, 2.0D));
  }
  
  public double distanceSq(Vector other)
  {
    return Math.pow(other.x - this.x, 2.0D) + Math.pow(other.y - this.y, 2.0D) + Math.pow(other.z - this.z, 2.0D);
  }
  
  public Vector normalize()
  {
    return divide(length());
  }
  
  public double dot(Vector other)
  {
    return this.x * other.x + this.y * other.y + this.z * other.z;
  }
  
  public Vector cross(Vector other)
  {
    return new Vector(this.y * other.z - this.z * other.y, this.z * other.x - this.x * other.z, this.x * other.y - this.y * other.x);
  }
  
  public boolean containedWithin(Vector min, Vector max)
  {
    return (this.x >= min.x) && (this.x <= max.x) && (this.y >= min.y) && (this.y <= max.y) && (this.z >= min.z) && (this.z <= max.z);
  }
  
  public boolean containedWithinBlock(Vector min, Vector max)
  {
    return (getBlockX() >= min.getBlockX()) && (getBlockX() <= max.getBlockX()) && (getBlockY() >= min.getBlockY()) && (getBlockY() <= max.getBlockY()) && (getBlockZ() >= min.getBlockZ()) && (getBlockZ() <= max.getBlockZ());
  }
  
  public Vector clampY(int min, int max)
  {
    return new Vector(this.x, Math.max(min, Math.min(max, this.y)), this.z);
  }
  
  public Vector floor()
  {
    return new Vector(Math.floor(this.x), Math.floor(this.y), Math.floor(this.z));
  }
  
  public Vector ceil()
  {
    return new Vector(Math.ceil(this.x), Math.ceil(this.y), Math.ceil(this.z));
  }
  
  public Vector round()
  {
    return new Vector(Math.floor(this.x + 0.5D), Math.floor(this.y + 0.5D), Math.floor(this.z + 0.5D));
  }
  
  public Vector positive()
  {
    return new Vector(Math.abs(this.x), Math.abs(this.y), Math.abs(this.z));
  }
  
  public Vector transform2D(double angle, double aboutX, double aboutZ, double translateX, double translateZ)
  {
    angle = Math.toRadians(angle);
    double x = this.x - aboutX;
    double z = this.z - aboutZ;
    double x2 = x * Math.cos(angle) - z * Math.sin(angle);
    double z2 = x * Math.sin(angle) + z * Math.cos(angle);
    
    return new Vector(x2 + aboutX + translateX, this.y, z2 + aboutZ + translateZ);
  }
  
  public boolean isCollinearWith(Vector other)
  {
    if ((this.x == 0.0D) && (this.y == 0.0D) && (this.z == 0.0D)) {
      return true;
    }
    double otherX = other.x;
    double otherY = other.y;
    double otherZ = other.z;
    if ((otherX == 0.0D) && (otherY == 0.0D) && (otherZ == 0.0D)) {
      return true;
    }
    if ((this.x == 0.0D ? 1 : 0) != (otherX == 0.0D ? 1 : 0)) {
      return false;
    }
    if ((this.y == 0.0D ? 1 : 0) != (otherY == 0.0D ? 1 : 0)) {
      return false;
    }
    if ((this.z == 0.0D ? 1 : 0) != (otherZ == 0.0D ? 1 : 0)) {
      return false;
    }
    double quotientX = otherX / this.x;
    if (!Double.isNaN(quotientX)) {
      return other.equals(multiply(quotientX));
    }
    double quotientY = otherY / this.y;
    if (!Double.isNaN(quotientY)) {
      return other.equals(multiply(quotientY));
    }
    double quotientZ = otherZ / this.z;
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
    return (other.x == this.x) && (other.y == this.y) && (other.z == this.z);
  }
  
  public int compareTo(Vector other)
  {
    if (other == null) {
      throw new IllegalArgumentException("null not supported");
    }
    if (this.y != other.y) {
      return Double.compare(this.y, other.y);
    }
    if (this.z != other.z) {
      return Double.compare(this.z, other.z);
    }
    if (this.x != other.x) {
      return Double.compare(this.x, other.x);
    }
    return 0;
  }
  
  public int hashCode()
  {
    int hash = 7;
    
    hash = 79 * hash + (int)(Double.doubleToLongBits(this.x) ^ Double.doubleToLongBits(this.x) >>> 32);
    
    hash = 79 * hash + (int)(Double.doubleToLongBits(this.y) ^ Double.doubleToLongBits(this.y) >>> 32);
    
    hash = 79 * hash + (int)(Double.doubleToLongBits(this.z) ^ Double.doubleToLongBits(this.z) >>> 32);
    return hash;
  }
  
  public String toString()
  {
    return "(" + this.x + ", " + this.y + ", " + this.z + ")";
  }
  
  public static Vector getMinimum(Vector v1, Vector v2)
  {
    return new Vector(Math.min(v1.x, v2.x), Math.min(v1.y, v2.y), Math.min(v1.z, v2.z));
  }
  
  public static Vector getMaximum(Vector v1, Vector v2)
  {
    return new Vector(Math.max(v1.x, v2.x), Math.max(v1.y, v2.y), Math.max(v1.z, v2.z));
  }
  
  public static Vector getMidpoint(Vector v1, Vector v2)
  {
    return new Vector((v1.x + v2.x) / 2.0D, (v1.y + v2.y) / 2.0D, (v1.z + v2.z) / 2.0D);
  }
}
