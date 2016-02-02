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
      this.c = ☃;
    }
    
    public int q()
    {
      return this.c;
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
    this.b = ((int)(this.a * this.c));
    if (this.b >= this.a) {
      this.b = (this.a - 1);
    }
    int ☃ = (int)(1.382D + Math.pow(this.f * this.a / 13.0D, 2.0D));
    if (☃ < 1) {
      ☃ = 1;
    }
    int ☃ = this.m.o() + this.b;
    int ☃ = this.a - this.i;
    
    this.j = Lists.newArrayList();
    this.j.add(new aoi.a(this.m.b(☃), ☃));
    for (; ☃ >= 0; ☃--)
    {
      float ☃ = a(☃);
      if (☃ >= 0.0F) {
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          double ☃ = this.e * ☃ * (this.k.nextFloat() + 0.328D);
          double ☃ = this.k.nextFloat() * 2.0F * 3.141592653589793D;
          
          double ☃ = ☃ * Math.sin(☃) + 0.5D;
          double ☃ = ☃ * Math.cos(☃) + 0.5D;
          
          cj ☃ = this.m.a(☃, ☃ - 1, ☃);
          cj ☃ = ☃.b(this.i);
          if (a(☃, ☃) == -1)
          {
            int ☃ = this.m.n() - ☃.n();
            int ☃ = this.m.p() - ☃.p();
            
            double ☃ = ☃.o() - Math.sqrt(☃ * ☃ + ☃ * ☃) * this.d;
            int ☃ = ☃ > ☃ ? ☃ : (int)☃;
            cj ☃ = new cj(this.m.n(), ☃, this.m.p());
            if (a(☃, ☃) == -1) {
              this.j.add(new aoi.a(☃, ☃.o()));
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
          
          arm ☃ = this.l.p(☃).c().t();
          if ((☃ == arm.a) || (☃ == arm.j)) {
            a(this.l, ☃, ☃);
          }
        }
      }
    }
  }
  
  float a(int ☃)
  {
    if (☃ < this.a * 0.3F) {
      return -1.0F;
    }
    float ☃ = this.a / 2.0F;
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
    if ((☃ < 0) || (☃ >= this.i)) {
      return -1.0F;
    }
    if ((☃ == 0) || (☃ == this.i - 1)) {
      return 2.0F;
    }
    return 3.0F;
  }
  
  void a(cj ☃)
  {
    for (int ☃ = 0; ☃ < this.i; ☃++) {
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
      
      a(this.l, ☃, ☃.Q().a(ahw.a, ☃));
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
    for (aoi.a ☃ : this.j) {
      a(☃);
    }
  }
  
  boolean c(int ☃)
  {
    return ☃ >= this.a * 0.2D;
  }
  
  void c()
  {
    cj ☃ = this.m;
    cj ☃ = this.m.b(this.b);
    afh ☃ = afi.r;
    
    a(☃, ☃, ☃);
    if (this.g == 2)
    {
      a(☃.f(), ☃.f(), ☃);
      a(☃.f().d(), ☃.f().d(), ☃);
      a(☃.d(), ☃.d(), ☃);
    }
  }
  
  void d()
  {
    for (aoi.a ☃ : this.j)
    {
      int ☃ = ☃.q();
      cj ☃ = new cj(this.m.n(), ☃, this.m.p());
      if ((!☃.equals(☃)) && 
        (c(☃ - this.m.o()))) {
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
      if (!a(this.l.p(☃).c())) {
        return ☃;
      }
    }
    return -1;
  }
  
  public void e()
  {
    this.i = 5;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    this.l = ☃;
    this.m = ☃;
    
    this.k = new Random(☃.nextLong());
    if (this.a == 0) {
      this.a = (5 + this.k.nextInt(this.h));
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
    afh ☃ = this.l.p(this.m.b()).c();
    if ((☃ != afi.d) && (☃ != afi.c) && (☃ != afi.ak)) {
      return false;
    }
    int ☃ = a(this.m, this.m.b(this.a - 1));
    if (☃ == -1) {
      return true;
    }
    if (☃ < 6) {
      return false;
    }
    this.a = ☃;
    return true;
  }
}
