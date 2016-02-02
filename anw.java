import java.util.List;
import java.util.Random;

public class anw
  implements amv
{
  private final adm h;
  private final boolean i;
  private final Random j;
  private double[] k = new double['Ā'];
  private double[] l = new double['Ā'];
  private double[] m = new double['Ā'];
  private double[] n;
  private final arc o;
  private final arc p;
  private final arc q;
  private final arc r;
  private final arc s;
  public final arc a;
  public final arc b;
  private final aow t = new aow();
  private final apd u = new apd();
  private final aox v = new aox();
  private final aot w = new apj(afi.co.Q(), 14, amg.a(afi.aV));
  private final aoy x = new aoy(afi.k, true);
  private final aoy y = new aoy(afi.k, false);
  private final aom z = new aom(afi.P);
  private final aom A = new aom(afi.Q);
  private final aqi B = new aqi();
  private final any C = new anz();
  double[] c;
  double[] d;
  double[] e;
  double[] f;
  double[] g;
  
  public anw(adm ☃, boolean ☃, long ☃)
  {
    this.h = ☃;
    this.i = ☃;
    
    this.j = new Random(☃);
    this.o = new arc(this.j, 16);
    this.p = new arc(this.j, 16);
    this.q = new arc(this.j, 8);
    this.r = new arc(this.j, 4);
    this.s = new arc(this.j, 4);
    
    this.a = new arc(this.j, 10);
    this.b = new arc(this.j, 16);
    
    ☃.b(63);
  }
  
  public void a(int ☃, int ☃, ans ☃)
  {
    int ☃ = 4;
    int ☃ = this.h.F() / 2 + 1;
    
    int ☃ = ☃ + 1;
    int ☃ = 17;
    int ☃ = ☃ + 1;
    this.n = a(this.n, ☃ * ☃, 0, ☃ * ☃, ☃, ☃, ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        for (int ☃ = 0; ☃ < 16; ☃++)
        {
          double ☃ = 0.125D;
          double ☃ = this.n[(((☃ + 0) * ☃ + (☃ + 0)) * ☃ + (☃ + 0))];
          double ☃ = this.n[(((☃ + 0) * ☃ + (☃ + 1)) * ☃ + (☃ + 0))];
          double ☃ = this.n[(((☃ + 1) * ☃ + (☃ + 0)) * ☃ + (☃ + 0))];
          double ☃ = this.n[(((☃ + 1) * ☃ + (☃ + 1)) * ☃ + (☃ + 0))];
          
          double ☃ = (this.n[(((☃ + 0) * ☃ + (☃ + 0)) * ☃ + (☃ + 1))] - ☃) * ☃;
          double ☃ = (this.n[(((☃ + 0) * ☃ + (☃ + 1)) * ☃ + (☃ + 1))] - ☃) * ☃;
          double ☃ = (this.n[(((☃ + 1) * ☃ + (☃ + 0)) * ☃ + (☃ + 1))] - ☃) * ☃;
          double ☃ = (this.n[(((☃ + 1) * ☃ + (☃ + 1)) * ☃ + (☃ + 1))] - ☃) * ☃;
          for (int ☃ = 0; ☃ < 8; ☃++)
          {
            double ☃ = 0.25D;
            
            double ☃ = ☃;
            double ☃ = ☃;
            double ☃ = (☃ - ☃) * ☃;
            double ☃ = (☃ - ☃) * ☃;
            for (int ☃ = 0; ☃ < 4; ☃++)
            {
              double ☃ = 0.25D;
              
              double ☃ = ☃;
              double ☃ = (☃ - ☃) * ☃;
              for (int ☃ = 0; ☃ < 4; ☃++)
              {
                alz ☃ = null;
                if (☃ * 8 + ☃ < ☃) {
                  ☃ = afi.l.Q();
                }
                if (☃ > 0.0D) {
                  ☃ = afi.aV.Q();
                }
                int ☃ = ☃ + ☃ * 4;
                int ☃ = ☃ + ☃ * 8;
                int ☃ = ☃ + ☃ * 4;
                ☃.a(☃, ☃, ☃, ☃);
                ☃ += ☃;
              }
              ☃ += ☃;
              ☃ += ☃;
            }
            ☃ += ☃;
            ☃ += ☃;
            ☃ += ☃;
            ☃ += ☃;
          }
        }
      }
    }
  }
  
  public void b(int ☃, int ☃, ans ☃)
  {
    int ☃ = this.h.F() + 1;
    
    double ☃ = 0.03125D;
    this.k = this.r.a(this.k, ☃ * 16, ☃ * 16, 0, 16, 16, 1, ☃, ☃, 1.0D);
    this.l = this.r.a(this.l, ☃ * 16, 109, ☃ * 16, 16, 1, 16, ☃, 1.0D, ☃);
    this.m = this.s.a(this.m, ☃ * 16, ☃ * 16, 0, 16, 16, 1, ☃ * 2.0D, ☃ * 2.0D, ☃ * 2.0D);
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        boolean ☃ = this.k[(☃ + ☃ * 16)] + this.j.nextDouble() * 0.2D > 0.0D;
        boolean ☃ = this.l[(☃ + ☃ * 16)] + this.j.nextDouble() * 0.2D > 0.0D;
        int ☃ = (int)(this.m[(☃ + ☃ * 16)] / 3.0D + 3.0D + this.j.nextDouble() * 0.25D);
        
        int ☃ = -1;
        
        alz ☃ = afi.aV.Q();
        alz ☃ = afi.aV.Q();
        for (int ☃ = 127; ☃ >= 0; ☃--) {
          if ((☃ >= 127 - this.j.nextInt(5)) || (☃ <= this.j.nextInt(5)))
          {
            ☃.a(☃, ☃, ☃, afi.h.Q());
          }
          else
          {
            alz ☃ = ☃.a(☃, ☃, ☃);
            if ((☃.c() == null) || (☃.c().t() == arm.a)) {
              ☃ = -1;
            } else if (☃.c() == afi.aV) {
              if (☃ == -1)
              {
                if (☃ <= 0)
                {
                  ☃ = null;
                  ☃ = afi.aV.Q();
                }
                else if ((☃ >= ☃ - 4) && (☃ <= ☃ + 1))
                {
                  ☃ = afi.aV.Q();
                  ☃ = afi.aV.Q();
                  if (☃)
                  {
                    ☃ = afi.n.Q();
                    ☃ = afi.aV.Q();
                  }
                  if (☃)
                  {
                    ☃ = afi.aW.Q();
                    ☃ = afi.aW.Q();
                  }
                }
                if ((☃ < ☃) && ((☃ == null) || (☃.c().t() == arm.a))) {
                  ☃ = afi.l.Q();
                }
                ☃ = ☃;
                if (☃ >= ☃ - 1) {
                  ☃.a(☃, ☃, ☃, ☃);
                } else {
                  ☃.a(☃, ☃, ☃, ☃);
                }
              }
              else if (☃ > 0)
              {
                ☃--;
                ☃.a(☃, ☃, ☃, ☃);
              }
            }
          }
        }
      }
    }
  }
  
  public amy d(int ☃, int ☃)
  {
    this.j.setSeed(☃ * 341873128712L + ☃ * 132897987541L);
    
    ans ☃ = new ans();
    
    a(☃, ☃, ☃);
    b(☃, ☃, ☃);
    
    this.C.a(this, this.h, ☃, ☃, ☃);
    if (this.i) {
      this.B.a(this, this.h, ☃, ☃, ☃);
    }
    amy ☃ = new amy(this.h, ☃, ☃, ☃);
    ady[] ☃ = this.h.v().b(null, ☃ * 16, ☃ * 16, 16, 16);
    byte[] ☃ = ☃.k();
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      ☃[☃] = ((byte)☃[☃].az);
    }
    ☃.l();
    
    return ☃;
  }
  
  private double[] a(double[] ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if (☃ == null) {
      ☃ = new double[☃ * ☃ * ☃];
    }
    double ☃ = 684.412D;
    double ☃ = 2053.236D;
    
    this.f = this.a.a(this.f, ☃, ☃, ☃, ☃, 1, ☃, 1.0D, 0.0D, 1.0D);
    this.g = this.b.a(this.g, ☃, ☃, ☃, ☃, 1, ☃, 100.0D, 0.0D, 100.0D);
    
    this.c = this.q.a(this.c, ☃, ☃, ☃, ☃, ☃, ☃, ☃ / 80.0D, ☃ / 60.0D, ☃ / 80.0D);
    this.d = this.o.a(this.d, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    this.e = this.p.a(this.e, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    int ☃ = 0;
    double[] ☃ = new double[☃];
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      ☃[☃] = (Math.cos(☃ * 3.141592653589793D * 6.0D / ☃) * 2.0D);
      
      double ☃ = ☃;
      if (☃ > ☃ / 2) {
        ☃ = ☃ - 1 - ☃;
      }
      if (☃ < 4.0D)
      {
        ☃ = 4.0D - ☃;
        ☃[☃] -= ☃ * ☃ * ☃ * 10.0D;
      }
    }
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        double ☃ = 0.0D;
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          double ☃ = 0.0D;
          double ☃ = ☃[☃];
          double ☃ = this.d[☃] / 512.0D;
          double ☃ = this.e[☃] / 512.0D;
          double ☃ = (this.c[☃] / 10.0D + 1.0D) / 2.0D;
          if (☃ < 0.0D) {
            ☃ = ☃;
          } else if (☃ > 1.0D) {
            ☃ = ☃;
          } else {
            ☃ = ☃ + (☃ - ☃) * ☃;
          }
          ☃ -= ☃;
          if (☃ > ☃ - 4)
          {
            double ☃ = (☃ - (☃ - 4)) / 3.0F;
            ☃ = ☃ * (1.0D - ☃) + -10.0D * ☃;
          }
          if (☃ < ☃)
          {
            double ☃ = (☃ - ☃) / 4.0D;
            ☃ = ns.a(☃, 0.0D, 1.0D);
            ☃ = ☃ * (1.0D - ☃) + -10.0D * ☃;
          }
          ☃[☃] = ☃;
          ☃++;
        }
      }
    }
    return ☃;
  }
  
  public boolean a(int ☃, int ☃)
  {
    return true;
  }
  
  public void a(amv ☃, int ☃, int ☃)
  {
    agr.N = true;
    cj ☃ = new cj(☃ * 16, 0, ☃ * 16);
    
    adg ☃ = new adg(☃, ☃);
    
    this.B.a(this.h, this.j, ☃);
    for (int ☃ = 0; ☃ < 8; ☃++) {
      this.y.b(this.h, this.j, ☃.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
    }
    for (int ☃ = 0; ☃ < this.j.nextInt(this.j.nextInt(10) + 1) + 1; ☃++) {
      this.t.b(this.h, this.j, ☃.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
    }
    for (int ☃ = 0; ☃ < this.j.nextInt(this.j.nextInt(10) + 1); ☃++) {
      this.u.b(this.h, this.j, ☃.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
    }
    for (int ☃ = 0; ☃ < 10; ☃++) {
      this.v.b(this.h, this.j, ☃.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
    }
    if (this.j.nextBoolean()) {
      this.z.b(this.h, this.j, ☃.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
    }
    if (this.j.nextBoolean()) {
      this.A.b(this.h, this.j, ☃.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
    }
    for (int ☃ = 0; ☃ < 16; ☃++) {
      this.w.b(this.h, this.j, ☃.a(this.j.nextInt(16), this.j.nextInt(108) + 10, this.j.nextInt(16)));
    }
    for (int ☃ = 0; ☃ < 16; ☃++) {
      this.x.b(this.h, this.j, ☃.a(this.j.nextInt(16), this.j.nextInt(108) + 10, this.j.nextInt(16)));
    }
    agr.N = false;
  }
  
  public boolean a(amv ☃, amy ☃, int ☃, int ☃)
  {
    return false;
  }
  
  public boolean a(boolean ☃, nu ☃)
  {
    return true;
  }
  
  public void c() {}
  
  public boolean d()
  {
    return false;
  }
  
  public boolean e()
  {
    return true;
  }
  
  public String f()
  {
    return "HellRandomLevelSource";
  }
  
  public List<ady.c> a(pt ☃, cj ☃)
  {
    if (☃ == pt.a)
    {
      if (this.B.b(☃)) {
        return this.B.b();
      }
      if ((this.B.a(this.h, ☃)) && (this.h.p(☃.b()).c() == afi.by)) {
        return this.B.b();
      }
    }
    ady ☃ = this.h.b(☃);
    return ☃.a(☃);
  }
  
  public cj a(adm ☃, String ☃, cj ☃)
  {
    return null;
  }
  
  public int g()
  {
    return 0;
  }
  
  public void a(amy ☃, int ☃, int ☃)
  {
    this.B.a(this, this.h, ☃, ☃, null);
  }
  
  public amy a(cj ☃)
  {
    return d(☃.n() >> 4, ☃.p() >> 4);
  }
}
