import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class mw
{
  public final String e;
  private final eu a;
  public boolean f;
  private final mx b;
  private final auu c;
  private Class<? extends mz> d;
  
  public mw(String ☃, eu ☃, mx ☃)
  {
    e = ☃;
    a = ☃;
    b = ☃;
    c = new auv(this);
    
    auu.a.put(c.a(), c);
  }
  
  public mw(String ☃, eu ☃)
  {
    this(☃, ☃, g);
  }
  
  public mw i()
  {
    f = true;
    return this;
  }
  
  public mw h()
  {
    if (na.a.containsKey(e)) {
      throw new RuntimeException("Duplicate stat id: \"" + agete)).a + "\" and \"" + a + "\" at id " + e);
    }
    na.b.add(this);
    na.a.put(e, this);
    
    return this;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public String a(int ☃)
  {
    return b.a(☃);
  }
  
  private static NumberFormat k = NumberFormat.getIntegerInstance(Locale.US);
  public static mx g = new mx()
  {
    public String a(int ☃)
    {
      return mw.m().format(☃);
    }
  };
  private static DecimalFormat l = new DecimalFormat("########0.00");
  public static mx h = new mx()
  {
    public String a(int ☃)
    {
      double ☃ = ☃ / 20.0D;
      double ☃ = ☃ / 60.0D;
      double ☃ = ☃ / 60.0D;
      double ☃ = ☃ / 24.0D;
      double ☃ = ☃ / 365.0D;
      if (☃ > 0.5D) {
        return mw.n().format(☃) + " y";
      }
      if (☃ > 0.5D) {
        return mw.n().format(☃) + " d";
      }
      if (☃ > 0.5D) {
        return mw.n().format(☃) + " h";
      }
      if (☃ > 0.5D) {
        return mw.n().format(☃) + " m";
      }
      return ☃ + " s";
    }
  };
  public static mx i = new mx()
  {
    public String a(int ☃)
    {
      double ☃ = ☃ / 100.0D;
      double ☃ = ☃ / 1000.0D;
      if (☃ > 0.5D) {
        return mw.n().format(☃) + " km";
      }
      if (☃ > 0.5D) {
        return mw.n().format(☃) + " m";
      }
      return ☃ + " cm";
    }
  };
  public static mx j = new mx()
  {
    public String a(int ☃)
    {
      return mw.n().format(☃ * 0.1D);
    }
  };
  
  public eu e()
  {
    eu ☃ = a.f();
    ☃.b().a(a.h);
    ☃.b().a(new ew(ew.a.b, new fa(e)));
    return ☃;
  }
  
  public eu j()
  {
    eu ☃ = e();
    eu ☃ = new fa("[").a(☃).a("]");
    ☃.a(☃.b());
    return ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ == null) || (getClass() != ☃.getClass())) {
      return false;
    }
    mw ☃ = (mw)☃;
    
    return e.equals(e);
  }
  
  public int hashCode()
  {
    return e.hashCode();
  }
  
  public String toString()
  {
    return "Stat{id=" + e + ", nameId=" + a + ", awardLocallyOnly=" + f + ", formatter=" + b + ", objectiveCriteria=" + c + '}';
  }
  
  public auu k()
  {
    return c;
  }
  
  public Class<? extends mz> l()
  {
    return d;
  }
  
  public mw b(Class<? extends mz> ☃)
  {
    d = ☃;
    return this;
  }
}
