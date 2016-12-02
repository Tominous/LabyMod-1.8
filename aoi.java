import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aoi
  extends aoh
{
  private Random k;
  private adm l;
  
  static class a
    extends cj
  {
    private final int c;
    
    public a(cj ☃, int ☃)
    {
      super(☃.o(), ☃.p());
      c = ☃;
    }
    
    public int q()
    {
      return c;
    }
  }
  
  private cj m = cj.a;
  int a;
  int b;
  double c = 0.618D;
  double d = 0.381D;
  double e = 1.0D;
  double f = 1.0D;
  int g = 1;
  int h = 12;
  int i = 4;
  List<aoi.a> j;
  
  public aoi(boolean ☃)
  {
    super(☃);
  }
  
  void a()
  {
    b = ((int)(a * c));
    if (b >= a) {
      b = (a - 1);
    }
    int ☃ = (int)(1.382D + Math.pow(f * a / 13.0D, 2.0D));
    if (☃ < 1) {
      ☃ = 1;
    }
    int ☃ = m.o() + b;
    int ☃ = a - i;
    
    j = Lists.newArrayList();
    j.add(new aoi.a(m.b(☃), ☃));
    for (; ☃ >= 0; ☃--)
    {
      float ☃ = a(☃);
      if (☃ >= 0.0F) {
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          double ☃ = e * ☃ * (k.nextFloat() + 0.328D);
          double ☃ = k.nextFloat() * 2.0F * 3.141592653589793D;
          
          double ☃ = ☃ * Math.sin(☃) + 0.5D;
          double ☃ = ☃ * Math.cos(☃) + 0.5D;
          
          cj ☃ = m.a(☃, ☃ - 1, ☃);
          cj ☃ = ☃.b(i);
          if (a(☃, ☃) == -1)
          {
            int ☃ = m.n() - ☃.n();
            int ☃ = m.p() - ☃.p();
            
            double ☃ = ☃.o() - Math.sqrt(☃ * ☃ + ☃ * ☃) * d;
            int ☃ = ☃ > ☃ ? ☃ : (int)☃;
            cj ☃ = new cj(m.n(), ☃, m.p());
            if (a(☃, ☃) == -1) {
              j.add(new aoi.a(☃, ☃.o()));
            }
          }
        }
      }
    }
  }
  
  void a(cj ☃, float ☃, alz ☃)
  {
    int ☃ = (int)(☃ + 0.618D);
    for (int ☃ = -☃; ☃ <= ☃; ☃++) {
      for (int ☃ = -☃; ☃ <= ☃; ☃++) {
        if (Math.pow(Math.abs(☃) + 0.5D, 2.0D) + Math.pow(Math.abs(☃) + 0.5D, 2.0D) <= ☃ * ☃)
        {
          cj ☃ = ☃.a(☃, 0, ☃);
          
          arm ☃ = l.p(☃).c().t();
          if ((☃ == arm.a) || (☃ == arm.j)) {
            a(l, ☃, ☃);
          }
        }
      }
    }
  }
  
  float a(int ☃)
  {
    if (☃ < a * 0.3F) {
      return -1.0F;
    }
    float ☃ = a / 2.0F;
    float ☃ = ☃ - ☃;
    
    float ☃ = ns.c(☃ * ☃ - ☃ * ☃);
    if (☃ == 0.0F) {
      ☃ = ☃;
    } else if (Math.abs(☃) >= ☃) {
      return 0.0F;
    }
    return ☃ * 0.5F;
  }
  
  float b(int ☃)
  {
    if ((☃ < 0) || (☃ >= i)) {
      return -1.0F;
    }
    if ((☃ == 0) || (☃ == i - 1)) {
      return 2.0F;
    }
    return 3.0F;
  }
  
  void a(cj ☃)
  {
    for (int ☃ = 0; ☃ < i; ☃++) {
      a(☃.b(☃), b(☃), afi.t.Q().a(ahs.b, Boolean.valueOf(false)));
    }
  }
  
  void a(cj ☃, cj ☃, afh ☃)
  {
    cj ☃ = ☃.a(-☃.n(), -☃.o(), -☃.p());
    
    int ☃ = b(☃);
    
    float ☃ = ☃.n() / ☃;
    float ☃ = ☃.o() / ☃;
    float ☃ = ☃.p() / ☃;
    for (int ☃ = 0; ☃ <= ☃; ☃++)
    {
      cj ☃ = ☃.a(0.5F + ☃ * ☃, 0.5F + ☃ * ☃, 0.5F + ☃ * ☃);
      ahw.a ☃ = b(☃, ☃);
      
      a(l, ☃, ☃.Q().a(ahw.a, ☃));
    }
  }
  
  private int b(cj ☃)
  {
    int ☃ = ns.a(☃.n());
    int ☃ = ns.a(☃.o());
    int ☃ = ns.a(☃.p());
    if ((☃ > ☃) && (☃ > ☃)) {
      return ☃;
    }
    if (☃ > ☃) {
      return ☃;
    }
    return ☃;
  }
  
  private ahw.a b(cj ☃, cj ☃)
  {
    ahw.a ☃ = ahw.a.b;
    int ☃ = Math.abs(☃.n() - ☃.n());
    int ☃ = Math.abs(☃.p() - ☃.p());
    int ☃ = Math.max(☃, ☃);
    if (☃ > 0) {
      if (☃ == ☃) {
        ☃ = ahw.a.a;
      } else if (☃ == ☃) {
        ☃ = ahw.a.c;
      }
    }
    return ☃;
  }
  
  void b()
  {
    for (aoi.a ☃ : j) {
      a(☃);
    }
  }
  
  boolean c(int ☃)
  {
    return ☃ >= a * 0.2D;
  }
  
  void c()
  {
    cj ☃ = m;
    cj ☃ = m.b(b);
    afh ☃ = afi.r;
    
    a(☃, ☃, ☃);
    if (g == 2)
    {
      a(☃.f(), ☃.f(), ☃);
      a(☃.f().d(), ☃.f().d(), ☃);
      a(☃.d(), ☃.d(), ☃);
    }
  }
  
  void d()
  {
    for (aoi.a ☃ : j)
    {
      int ☃ = ☃.q();
      cj ☃ = new cj(m.n(), ☃, m.p());
      if ((!☃.equals(☃)) && 
        (c(☃ - m.o()))) {
        a(☃, ☃, afi.r);
      }
    }
  }
  
  int a(cj ☃, cj ☃)
  {
    cj ☃ = ☃.a(-☃.n(), -☃.o(), -☃.p());
    
    int ☃ = b(☃);
    
    float ☃ = ☃.n() / ☃;
    float ☃ = ☃.o() / ☃;
    float ☃ = ☃.p() / ☃;
    if (☃ == 0) {
      return -1;
    }
    for (int ☃ = 0; ☃ <= ☃; ☃++)
    {
      cj ☃ = ☃.a(0.5F + ☃ * ☃, 0.5F + ☃ * ☃, 0.5F + ☃ * ☃);
      if (!a(l.p(☃).c())) {
        return ☃;
      }
    }
    return -1;
  }
  
  public void e()
  {
    i = 5;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    l = ☃;
    m = ☃;
    
    k = new Random(☃.nextLong());
    if (a == 0) {
      a = (5 + k.nextInt(h));
    }
    if (!f()) {
      return false;
    }
    a();
    b();
    c();
    d();
    
    return true;
  }
  
  private boolean f()
  {
    afh ☃ = l.p(m.b()).c();
    if ((☃ != afi.d) && (☃ != afi.c) && (☃ != afi.ak)) {
      return false;
    }
    int ☃ = a(m, m.b(a - 1));
    if (☃ == -1) {
      return true;
    }
    if (☃ < 6) {
      return false;
    }
    a = ☃;
    return true;
  }
}
