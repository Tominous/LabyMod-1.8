package mods.worldeditcui.util;

public class Vector2
  implements Comparable<Vector2>
{
  public Vector2(double x, double y)
  {
    this.x = x;
    z = y;
  }
  
  public Vector2(Double x, Double y)
  {
    this(x.doubleValue(), y.doubleValue());
  }
  
  public Vector2()
  {
    this(0.0D, 0.0D);
  }
  
  public Vector2(Vector2 original)
  {
    this(x, z);
  }
  
  public double getX()
  {
    return x;
  }
  
  public double getY()
  {
    return z;
  }
  
  public Vector2 add(Vector2 that)
  {
    return add(this, that);
  }
  
  public Vector2 subtract(Vector2 that)
  {
    return subtract(this, that);
  }
  
  public Vector2 scale(double scale)
  {
    return scale(this, scale);
  }
  
  public double dot(Vector2 that)
  {
    return dot(this, that);
  }
  
  public Vector3 toVector3()
  {
    return toVector3(this);
  }
  
  public Vector3 toVector3(double y)
  {
    return toVector3(this, y);
  }
  
  public Vector2 cross()
  {
    return new Vector2(z, -x);
  }
  
  public Vector2 ceil()
  {
    return new Vector2(Math.ceil(x), Math.ceil(z));
  }
  
  public Vector2 floor()
  {
    return new Vector2(Math.floor(x), Math.floor(z));
  }
  
  public Vector2 round()
  {
    return new Vector2(Math.round(x), Math.round(z));
  }
  
  public Vector2 abs()
  {
    return new Vector2(Math.abs(x), Math.abs(z));
  }
  
  public double distance(Vector2 a)
  {
    return distance(a, this);
  }
  
  public Vector2 pow(double power)
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
  
  public Vector2 normalize()
  {
    return normalize(this);
  }
  
  public double[] toArray()
  {
    return toArray(this);
  }
  
  public int compareTo(Vector2 o)
  {
    return compareTo(this, o);
  }
  
  public boolean equals(Object o)
  {
    return equals(this, o);
  }
  
  public static double length(Vector2 a)
  {
    return Math.sqrt(lengthSquared(a));
  }
  
  public static double lengthSquared(Vector2 a)
  {
    return dot(a, a);
  }
  
  public static Vector2 normalize(Vector2 a)
  {
    return scale(a, 1.0D / a.length());
  }
  
  public static Vector2 subtract(Vector2 a, Vector2 b)
  {
    return new Vector2(a.getX() - b.getX(), a.getY() - b.getY());
  }
  
  public static Vector2 add(Vector2 a, Vector2 b)
  {
    return new Vector2(a.getX() + b.getX(), a.getY() + b.getY());
  }
  
  public static Vector2 scale(Vector2 a, double b)
  {
    return new Vector2(a.getX() * b, a.getY() * b);
  }
  
  public static double dot(Vector2 a, Vector2 b)
  {
    return a.getX() * b.getX() + a.getY() * b.getY();
  }
  
  public static Vector3 toVector3(Vector2 o)
  {
    return new Vector3(x, 0.0D, z);
  }
  
  public static Vector3 toVector3(Vector2 o, double y)
  {
    return new Vector3(x, y, z);
  }
  
  public static Vector2 ceil(Vector2 o)
  {
    return new Vector2(Math.ceil(x), Math.ceil(z));
  }
  
  public static Vector2 floor(Vector2 o)
  {
    return new Vector2(Math.floor(x), Math.floor(z));
  }
  
  public static Vector2 round(Vector2 o)
  {
    return new Vector2(Math.round(x), Math.round(z));
  }
  
  public static Vector2 abs(Vector2 o)
  {
    return new Vector2(Math.abs(x), Math.abs(z));
  }
  
  public static Vector2 min(Vector2 o1, Vector2 o2)
  {
    return new Vector2(Math.min(x, x), Math.min(z, z));
  }
  
  public static Vector2 max(Vector2 o1, Vector2 o2)
  {
    return new Vector2(Math.max(x, x), Math.max(z, z));
  }
  
  public static Vector2 rand()
  {
    return new Vector2(Math.random(), Math.random());
  }
  
  public static double[] toArray(Vector2 a)
  {
    return new double[] { a.getX(), a.getY() };
  }
  
  public static int compareTo(Vector2 a, Vector2 b)
  {
    return (int)a.lengthSquared() - (int)b.lengthSquared();
  }
  
  public static double distance(Vector2 a, Vector2 b)
  {
    Vector2 tempVector = pow(subtract(a, b), 2.0D);
    return Math.sqrt(x + z);
  }
  
  public static Vector2 pow(Vector2 o, double power)
  {
    return new Vector2(Math.pow(x, power), Math.pow(z, power));
  }
  
  public static boolean equals(Object a, Object b)
  {
    return ((a instanceof Vector2)) && ((b instanceof Vector2)) && ((a == b) || (compareTo((Vector2)a, (Vector2)b) == 0));
  }
  
  public String toString()
  {
    return "(" + x + ", " + z + ")";
  }
  
  public int hashCode()
  {
    return (int)(x % z);
  }
  
  public static final Vector2 ZERO = new Vector2(0.0D, 0.0D);
  public static final Vector2 UNIT_X = new Vector2(1.0D, 0.0D);
  public static final Vector2 UNIT_Y = new Vector2(0.0D, 1.0D);
  public static Vector2 ONE = new Vector2(1.0D, 1.0D);
  protected double x;
  protected double z;
}
