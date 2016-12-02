import java.io.IOException;

public class ip
  implements ff<ic>
{
  protected double a;
  protected double b;
  protected double c;
  protected float d;
  protected float e;
  protected boolean f;
  protected boolean g;
  protected boolean h;
  public ip() {}
  
  public static class b
    extends ip
  {
    public b()
    {
      g = true;
      h = true;
    }
    
    public b(double ☃, double ☃, double ☃, float ☃, float ☃, boolean ☃)
    {
      a = ☃;
      b = ☃;
      c = ☃;
      d = ☃;
      e = ☃;
      f = ☃;
      h = true;
      g = true;
    }
    
    public void a(em ☃)
      throws IOException
    {
      a = ☃.readDouble();
      b = ☃.readDouble();
      c = ☃.readDouble();
      d = ☃.readFloat();
      e = ☃.readFloat();
      super.a(☃);
    }
    
    public void b(em ☃)
      throws IOException
    {
      ☃.writeDouble(a);
      ☃.writeDouble(b);
      ☃.writeDouble(c);
      ☃.writeFloat(d);
      ☃.writeFloat(e);
      super.b(☃);
    }
  }
  
  public static class a
    extends ip
  {
    public a()
    {
      g = true;
    }
    
    public a(double ☃, double ☃, double ☃, boolean ☃)
    {
      a = ☃;
      b = ☃;
      c = ☃;
      f = ☃;
      g = true;
    }
    
    public void a(em ☃)
      throws IOException
    {
      a = ☃.readDouble();
      b = ☃.readDouble();
      c = ☃.readDouble();
      super.a(☃);
    }
    
    public void b(em ☃)
      throws IOException
    {
      ☃.writeDouble(a);
      ☃.writeDouble(b);
      ☃.writeDouble(c);
      super.b(☃);
    }
  }
  
  public static class c
    extends ip
  {
    public c()
    {
      h = true;
    }
    
    public c(float ☃, float ☃, boolean ☃)
    {
      d = ☃;
      e = ☃;
      f = ☃;
      h = true;
    }
    
    public void a(em ☃)
      throws IOException
    {
      d = ☃.readFloat();
      e = ☃.readFloat();
      super.a(☃);
    }
    
    public void b(em ☃)
      throws IOException
    {
      ☃.writeFloat(d);
      ☃.writeFloat(e);
      super.b(☃);
    }
  }
  
  public ip(boolean ☃)
  {
    f = ☃;
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    f = (☃.readUnsignedByte() != 0);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(f ? 1 : 0);
  }
  
  public double a()
  {
    return a;
  }
  
  public double b()
  {
    return b;
  }
  
  public double c()
  {
    return c;
  }
  
  public float d()
  {
    return d;
  }
  
  public float e()
  {
    return e;
  }
  
  public boolean f()
  {
    return f;
  }
  
  public boolean g()
  {
    return g;
  }
  
  public boolean h()
  {
    return h;
  }
  
  public void a(boolean ☃)
  {
    g = ☃;
  }
}
