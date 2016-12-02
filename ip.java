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
      this.g = true;
      this.h = true;
    }
    
    public b(double ☃, double ☃, double ☃, float ☃, float ☃, boolean ☃)
    {
      this.a = ☃;
      this.b = ☃;
      this.c = ☃;
      this.d = ☃;
      this.e = ☃;
      this.f = ☃;
      this.h = true;
      this.g = true;
    }
    
    public void a(em ☃)
      throws IOException
    {
      this.a = ☃.readDouble();
      this.b = ☃.readDouble();
      this.c = ☃.readDouble();
      this.d = ☃.readFloat();
      this.e = ☃.readFloat();
      super.a(☃);
    }
    
    public void b(em ☃)
      throws IOException
    {
      ☃.writeDouble(this.a);
      ☃.writeDouble(this.b);
      ☃.writeDouble(this.c);
      ☃.writeFloat(this.d);
      ☃.writeFloat(this.e);
      super.b(☃);
    }
  }
  
  public static class a
    extends ip
  {
    public a()
    {
      this.g = true;
    }
    
    public a(double ☃, double ☃, double ☃, boolean ☃)
    {
      this.a = ☃;
      this.b = ☃;
      this.c = ☃;
      this.f = ☃;
      this.g = true;
    }
    
    public void a(em ☃)
      throws IOException
    {
      this.a = ☃.readDouble();
      this.b = ☃.readDouble();
      this.c = ☃.readDouble();
      super.a(☃);
    }
    
    public void b(em ☃)
      throws IOException
    {
      ☃.writeDouble(this.a);
      ☃.writeDouble(this.b);
      ☃.writeDouble(this.c);
      super.b(☃);
    }
  }
  
  public static class c
    extends ip
  {
    public c()
    {
      this.h = true;
    }
    
    public c(float ☃, float ☃, boolean ☃)
    {
      this.d = ☃;
      this.e = ☃;
      this.f = ☃;
      this.h = true;
    }
    
    public void a(em ☃)
      throws IOException
    {
      this.d = ☃.readFloat();
      this.e = ☃.readFloat();
      super.a(☃);
    }
    
    public void b(em ☃)
      throws IOException
    {
      ☃.writeFloat(this.d);
      ☃.writeFloat(this.e);
      super.b(☃);
    }
  }
  
  public ip(boolean ☃)
  {
    this.f = ☃;
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.f = (☃.readUnsignedByte() != 0);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(this.f ? 1 : 0);
  }
  
  public double a()
  {
    return this.a;
  }
  
  public double b()
  {
    return this.b;
  }
  
  public double c()
  {
    return this.c;
  }
  
  public float d()
  {
    return this.d;
  }
  
  public float e()
  {
    return this.e;
  }
  
  public boolean f()
  {
    return this.f;
  }
  
  public boolean g()
  {
    return this.g;
  }
  
  public boolean h()
  {
    return this.h;
  }
  
  public void a(boolean ☃)
  {
    this.g = ☃;
  }
}
