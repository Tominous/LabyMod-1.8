import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmv
{
  private static final Logger a = ;
  private final bmv.a b;
  private final bmv.b c;
  private int d;
  private int e;
  
  public bmv(int ☃, bmv.a ☃, bmv.b ☃, int ☃)
  {
    if (!a(☃, ☃))
    {
      a.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
      c = bmv.b.d;
    }
    else
    {
      c = ☃;
    }
    b = ☃;
    d = ☃;
    e = ☃;
  }
  
  private final boolean a(int ☃, bmv.b ☃)
  {
    return (☃ == 0) || (☃ == bmv.b.d);
  }
  
  public final bmv.a a()
  {
    return b;
  }
  
  public final bmv.b b()
  {
    return c;
  }
  
  public final int c()
  {
    return e;
  }
  
  public final int d()
  {
    return d;
  }
  
  public String toString()
  {
    return e + "," + c.a() + "," + b.b();
  }
  
  public final int e()
  {
    return b.a() * e;
  }
  
  public final boolean f()
  {
    return c == bmv.b.a;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ == null) || (getClass() != ☃.getClass())) {
      return false;
    }
    bmv ☃ = (bmv)☃;
    if (e != e) {
      return false;
    }
    if (d != d) {
      return false;
    }
    if (b != b) {
      return false;
    }
    if (c != c) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    int ☃ = b.hashCode();
    ☃ = 31 * ☃ + c.hashCode();
    ☃ = 31 * ☃ + d;
    ☃ = 31 * ☃ + e;
    return ☃;
  }
  
  public static enum b
  {
    private final String h;
    
    private b(String ☃)
    {
      h = ☃;
    }
    
    public String a()
    {
      return h;
    }
  }
  
  public static enum a
  {
    private final int h;
    private final String i;
    private final int j;
    
    private a(int ☃, String ☃, int ☃)
    {
      h = ☃;
      i = ☃;
      j = ☃;
    }
    
    public int a()
    {
      return h;
    }
    
    public String b()
    {
      return i;
    }
    
    public int c()
    {
      return j;
    }
  }
}
