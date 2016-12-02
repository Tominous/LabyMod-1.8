package mods.worldeditcui.util;

public class Vector2m
  extends Vector2
{
  public Vector2m() {}
  
  public Vector2m(Double x, Double y)
  {
    super(x, y);
  }
  
  public Vector2m(float x, float y)
  {
    super(x, y);
  }
  
  public Vector2m(Vector2 original)
  {
    super(original);
  }
  
  public void setX(float x)
  {
    this.x = x;
  }
  
  public void setY(float y)
  {
    z = y;
  }
  
  public Vector2 add(Vector2 that)
  {
    x += x;
    z += z;
    return this;
  }
  
  public Vector2 subtract(Vector2 that)
  {
    x -= x;
    z -= z;
    return this;
  }
  
  public Vector2 scale(double scale)
  {
    x *= scale;
    z *= scale;
    return this;
  }
  
  public Vector2 cross(Vector2 that)
  {
    double tmp = z;
    z = (-x);
    x = tmp;
    return this;
  }
  
  public Vector2 ceil()
  {
    x = ((float)Math.ceil(x));
    z = ((float)Math.ceil(z));
    return this;
  }
  
  public Vector2 floor()
  {
    x = ((float)Math.floor(x));
    z = ((float)Math.floor(z));
    return this;
  }
  
  public Vector2 round()
  {
    x = Math.round(x);
    z = Math.round(z);
    return this;
  }
  
  public Vector2 abs()
  {
    x = Math.abs(x);
    z = Math.abs(z);
    return this;
  }
  
  public Vector2 normalize()
  {
    double length = length();
    x *= 1.0D / length;
    z *= 1.0D / length;
    return this;
  }
}
