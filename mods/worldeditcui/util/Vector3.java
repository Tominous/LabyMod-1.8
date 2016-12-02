package mods.worldeditcui.util;

import pk;

public class Vector3
  implements Comparable<Vector3>
{
  public Vector3(pk entity, double partialTicks)
  {
    this(p + (s - p) * partialTicks, q + (t - q) * partialTicks, r + (u - r) * partialTicks);
  }
  
  public Vector3(double x, double y, double z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public Vector3(Double x, Double y, Double z)
  {
    this(x.doubleValue(), y.doubleValue(), z.doubleValue());
  }
  
  public Vector3()
  {
    this(0.0D, 0.0D, 0.0D);
  }
  
  public Vector3(Vector3 clone)
  {
    this(clone.getX(), clone.getY(), clone.getZ());
  }
  
  public Vector3(Vector2 vector, double z)
  {
    this(vector.getX(), vector.getY(), z);
  }
  
  public Vector3(Vector2 vector)
  {
    this(vector, 0.0D);
  }
  
  public double getX()
  {
    return x;
  }
  
  public double getY()
  {
    return y;
  }
  
  public double getZ()
  {
    return z;
  }
  
  public Vector3 add(Vector3 that)
  {
    return add(this, that);
  }
  
  public Vector3 subtract(Vector3 that)
  {
    return subtract(this, that);
  }
  
  public Vector3 scale(double scale)
  {
    return scale(this, scale);
  }
  
  public double dot(Vector3 that)
  {
    return dot(this, that);
  }
  
  public Vector3 cross(Vector3 that)
  {
    return cross(this, that);
  }
  
  public Vector2 toVector2()
  {
    return toVector2(this);
  }
  
  public Vector2m toVector2m()
  {
    return toVector2m(this);
  }
  
  public Vector3 ceil()
  {
    return new Vector3(Math.ceil(x), Math.ceil(y), Math.ceil(z));
  }
  
  public Vector3 floor()
  {
    return new Vector3(Math.floor(x), Math.floor(y), Math.floor(z));
  }
  
  public Vector3 round()
  {
    return new Vector3(Math.round(x), Math.round(y), Math.round(z));
  }
  
  public Vector3 abs()
  {
    return new Vector3(Math.abs(x), Math.abs(y), Math.abs(z));
  }
  
  public double distance(Vector3 a)
  {
    return distance(a, this);
  }
  
  public Vector3 pow(double power)
  {
    return pow(this, power);
  }
  
  public double lengthSquared()
  {
    return lengthSquared(this);
  }
  
  public double length()
  {
    return length(this);
  }
  
  public double fastLength()
  {
    return fastLength(this);
  }
  
  public Vector3 normalize()
  {
    return normalize(this);
  }
  
  public double[] toArray()
  {
    return toArray(this);
  }
  
  public int compareTo(Vector3 o)
  {
    return compareTo(this, o);
  }
  
  public boolean equals(Object o)
  {
    return equals(this, o);
  }
  
  public String toString()
  {
    return String.format("{ %f, %f, %f }", new Object[] { Double.valueOf(x), Double.valueOf(y), Double.valueOf(z) });
  }
  
  public static double length(Vector3 a)
  {
    return Math.sqrt(lengthSquared(a));
  }
  
  public static double fastLength(Vector3 a)
  {
    return Math.sqrt(lengthSquared(a));
  }
  
  public static double lengthSquared(Vector3 a)
  {
    return dot(a, a);
  }
  
  public static Vector3 normalize(Vector3 a)
  {
    return scale(a, 1.0D / a.length());
  }
  
  public static Vector3 subtract(Vector3 a, Vector3 b)
  {
    return new Vector3(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
  }
  
  public static Vector3 add(Vector3 a, Vector3 b)
  {
    return new Vector3(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
  }
  
  public static Vector3 scale(Vector3 a, double b)
  {
    return new Vector3(a.getX() * b, a.getY() * b, a.getZ() * b);
  }
  
  public static double dot(Vector3 a, Vector3 b)
  {
    return a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() * b.getZ();
  }
  
  public static Vector3 cross(Vector3 a, Vector3 b)
  {
    return new Vector3(a.getY() * b.getZ() - a.getZ() * b.getY(), a.getZ() * b.getX() - a.getX() * b.getZ(), a.getX() * b.getY() - a.getY() * b.getX());
  }
  
  public static Vector3 ceil(Vector3 o)
  {
    return new Vector3(Math.ceil(x), Math.ceil(y), Math.ceil(z));
  }
  
  public static Vector3 floor(Vector3 o)
  {
    return new Vector3(Math.floor(x), Math.floor(y), Math.floor(z));
  }
  
  public static Vector3 round(Vector3 o)
  {
    return new Vector3(Math.round(x), Math.round(y), Math.round(z));
  }
  
  public static Vector3 abs(Vector3 o)
  {
    return new Vector3(Math.abs(x), Math.abs(y), Math.abs(z));
  }
  
  public static Vector3 min(Vector3 o1, Vector3 o2)
  {
    return new Vector3(Math.min(x, x), Math.min(y, y), Math.min(z, z));
  }
  
  public static Vector3 max(Vector3 o1, Vector3 o2)
  {
    return new Vector3(Math.max(x, x), Math.max(y, y), Math.max(z, z));
  }
  
  public static Vector3 rand()
  {
    return new Vector3(Math.random(), Math.random(), Math.random());
  }
  
  public static double distance(Vector3 a, Vector3 b)
  {
    double xzDist = Vector2.distance(a.toVector2(), b.toVector2());
    return Math.sqrt(Math.pow(xzDist, 2.0D) + Math.pow(Math.abs(subtract(a, b).getY()), 2.0D));
  }
  
  public static Vector3 pow(Vector3 o, double power)
  {
    return new Vector3(Math.pow(x, power), Math.pow(y, power), Math.pow(z, power));
  }
  
  public static Vector2 toVector2(Vector3 o)
  {
    return new Vector2(x, z);
  }
  
  public static Vector2m toVector2m(Vector3 o)
  {
    return new Vector2m(Double.valueOf(x), Double.valueOf(z));
  }
  
  public static double[] toArray(Vector3 a)
  {
    return new double[] { a.getX(), a.getY(), a.getZ() };
  }
  
  public static int compareTo(Vector3 a, Vector3 b)
  {
    return (int)a.lengthSquared() - (int)b.lengthSquared();
  }
  
  public static boolean equals(Object a, Object b)
  {
    if ((!(a instanceof Vector3)) || (!(b instanceof Vector3))) {
      return false;
    }
    if (a == b) {
      return true;
    }
    Vector3 x = (Vector3)a;
    Vector3 y = (Vector3)b;
    return (x.getX() == y.getX()) && (x.getY() == y.getY()) && (x.getZ() == y.getZ());
  }
  
  public int hashCode()
  {
    return (int)(x * y % z);
  }
  
  public static final Vector3 ZERO = new Vector3(0.0D, 0.0D, 0.0D);
  public static final Vector3 UNIT_X = new Vector3(1.0D, 0.0D, 0.0D);
  public static final Vector3 Forward = UNIT_X;
  public static final Vector3 UNIT_Y = new Vector3(0.0D, 1.0D, 0.0D);
  public static final Vector3 Up = UNIT_Y;
  public static final Vector3 UNIT_Z = new Vector3(0.0D, 0.0D, 1.0D);
  public static final Vector3 Right = UNIT_Z;
  public static final Vector3 ONE = new Vector3(1.0D, 1.0D, 1.0D);
  protected double x;
  protected double y;
  protected double z;
}
