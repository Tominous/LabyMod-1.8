import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;

public class fi
  implements ff<fj>
{
  private double a;
  private double b;
  private double c;
  private float d;
  private float e;
  private Set<fi.a> f;
  
  public fi() {}
  
  public fi(double ☃, double ☃, double ☃, float ☃, float ☃, Set<fi.a> ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
    f = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readDouble();
    b = ☃.readDouble();
    c = ☃.readDouble();
    d = ☃.readFloat();
    e = ☃.readFloat();
    f = fi.a.a(☃.readUnsignedByte());
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeDouble(a);
    ☃.writeDouble(b);
    ☃.writeDouble(c);
    ☃.writeFloat(d);
    ☃.writeFloat(e);
    ☃.writeByte(fi.a.a(f));
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
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
  
  public Set<fi.a> f()
  {
    return f;
  }
  
  public static enum a
  {
    private int f;
    
    private a(int ☃)
    {
      f = ☃;
    }
    
    private int a()
    {
      return 1 << f;
    }
    
    private boolean b(int ☃)
    {
      return (☃ & a()) == a();
    }
    
    public static Set<a> a(int ☃)
    {
      Set<a> ☃ = EnumSet.noneOf(a.class);
      for (a ☃ : values()) {
        if (☃.b(☃)) {
          ☃.add(☃);
        }
      }
      return ☃;
    }
    
    public static int a(Set<a> ☃)
    {
      int ☃ = 0;
      for (a ☃ : ☃) {
        ☃ |= ☃.a();
      }
      return ☃;
    }
  }
}
