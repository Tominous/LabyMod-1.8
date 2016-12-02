import com.google.common.collect.Lists;
import java.util.List;

public class ams
{
  private final List<amq> a = Lists.newArrayList();
  private double b = 0.0D;
  private double c = 0.0D;
  private double d = 6.0E7D;
  private double e = d;
  private long f;
  private long g;
  private int h = 29999984;
  private double i = 0.2D;
  private double j = 5.0D;
  private int k = 15;
  private int l = 5;
  
  public boolean a(cj ☃)
  {
    return (☃.n() + 1 > b()) && (☃.n() < d()) && (☃.p() + 1 > c()) && (☃.p() < e());
  }
  
  public boolean a(adg ☃)
  {
    return (☃.e() > b()) && (☃.c() < d()) && (☃.f() > c()) && (☃.d() < e());
  }
  
  public boolean a(aug ☃)
  {
    return (d > b()) && (a < d()) && (f > c()) && (c < e());
  }
  
  public double a(pk ☃)
  {
    return b(s, u);
  }
  
  public double b(double ☃, double ☃)
  {
    double ☃ = ☃ - c();
    double ☃ = e() - ☃;
    double ☃ = ☃ - b();
    double ☃ = d() - ☃;
    double ☃ = Math.min(☃, ☃);
    ☃ = Math.min(☃, ☃);
    return Math.min(☃, ☃);
  }
  
  public amr a()
  {
    if (e < d) {
      return amr.b;
    }
    if (e > d) {
      return amr.a;
    }
    return amr.c;
  }
  
  public double b()
  {
    double ☃ = f() - h() / 2.0D;
    if (☃ < -h) {
      ☃ = -h;
    }
    return ☃;
  }
  
  public double c()
  {
    double ☃ = g() - h() / 2.0D;
    if (☃ < -h) {
      ☃ = -h;
    }
    return ☃;
  }
  
  public double d()
  {
    double ☃ = f() + h() / 2.0D;
    if (☃ > h) {
      ☃ = h;
    }
    return ☃;
  }
  
  public double e()
  {
    double ☃ = g() + h() / 2.0D;
    if (☃ > h) {
      ☃ = h;
    }
    return ☃;
  }
  
  public double f()
  {
    return b;
  }
  
  public double g()
  {
    return c;
  }
  
  public void c(double ☃, double ☃)
  {
    b = ☃;
    c = ☃;
    for (amq ☃ : k()) {
      ☃.a(this, ☃, ☃);
    }
  }
  
  public double h()
  {
    if (a() != amr.c)
    {
      double ☃ = (float)(System.currentTimeMillis() - g) / (float)(f - g);
      if (☃ >= 1.0D) {
        a(e);
      } else {
        return d + (e - d) * ☃;
      }
    }
    return d;
  }
  
  public long i()
  {
    if (a() != amr.c) {
      return f - System.currentTimeMillis();
    }
    return 0L;
  }
  
  public double j()
  {
    return e;
  }
  
  public void a(double ☃)
  {
    d = ☃;
    e = ☃;
    f = System.currentTimeMillis();
    g = f;
    for (amq ☃ : k()) {
      ☃.a(this, ☃);
    }
  }
  
  public void a(double ☃, double ☃, long ☃)
  {
    d = ☃;
    e = ☃;
    g = System.currentTimeMillis();
    f = (g + ☃);
    for (amq ☃ : k()) {
      ☃.a(this, ☃, ☃, ☃);
    }
  }
  
  protected List<amq> k()
  {
    return Lists.newArrayList(a);
  }
  
  public void a(amq ☃)
  {
    a.add(☃);
  }
  
  public void a(int ☃)
  {
    h = ☃;
  }
  
  public int l()
  {
    return h;
  }
  
  public double m()
  {
    return j;
  }
  
  public void b(double ☃)
  {
    j = ☃;
    for (amq ☃ : k()) {
      ☃.c(this, ☃);
    }
  }
  
  public double n()
  {
    return i;
  }
  
  public void c(double ☃)
  {
    i = ☃;
    for (amq ☃ : k()) {
      ☃.b(this, ☃);
    }
  }
  
  public double o()
  {
    if (f == g) {
      return 0.0D;
    }
    return Math.abs(d - e) / (f - g);
  }
  
  public int p()
  {
    return k;
  }
  
  public void b(int ☃)
  {
    k = ☃;
    for (amq ☃ : k()) {
      ☃.a(this, ☃);
    }
  }
  
  public int q()
  {
    return l;
  }
  
  public void c(int ☃)
  {
    l = ☃;
    for (amq ☃ : k()) {
      ☃.b(this, ☃);
    }
  }
}
