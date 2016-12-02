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
    this.e = ☃;
    this.a = ☃;
    this.b = ☃;
    this.c = new auv(this);
    
    auu.a.put(this.c.a(), this.c);
  }
  
  public mw(String ☃, eu ☃)
  {
    this(☃, ☃, g);
  }
  
  public mw i()
  {
    this.f = true;
    return this;
  }
  
  public mw h()
  {
    if (na.a.containsKey(this.e)) {
      throw new RuntimeException("Duplicate stat id: \"" + ((mw)na.a.get(this.e)).a + "\" and \"" + this.a + "\" at id " + this.e);
    }
    na.b.add(this);
    na.a.put(this.e, this);
    
    return this;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public String a(int ☃)
  {
    return this.b.a(☃);
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
    eu ☃ = this.a.f();
    ☃.b().a(a.h);
    ☃.b().a(new ew(ew.a.b, new fa(this.e)));
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
    
    return this.e.equals(☃.e);
  }
  
  public int hashCode()
  {
    return this.e.hashCode();
  }
  
  public String toString()
  {
    return "Stat{id=" + this.e + ", nameId=" + this.a + ", awardLocallyOnly=" + this.f + ", formatter=" + this.b + ", objectiveCriteria=" + this.c + '}';
  }
  
  public auu k()
  {
    return this.c;
  }
  
  public Class<? extends mz> l()
  {
    return this.d;
  }
  
  public mw b(Class<? extends mz> ☃)
  {
    this.d = ☃;
    return this;
  }
}
