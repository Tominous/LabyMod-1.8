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
    h = ☃;
    i = ☃;
    
    j = new Random(☃);
    o = new arc(j, 16);
    p = new arc(j, 16);
    q = new arc(j, 8);
    r = new arc(j, 4);
    s = new arc(j, 4);
    
    a = new arc(j, 10);
    b = new arc(j, 16);
    
    ☃.b(63);
  }
  
  public void a(int ☃, int ☃, ans ☃)
  {
    int ☃ = 4;
    int ☃ = h.F() / 2 + 1;
    
    int ☃ = ☃ + 1;
    int ☃ = 17;
    int ☃ = ☃ + 1;
    n = a(n, ☃ * ☃, 0, ☃ * ☃, ☃, ☃, ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        for (int ☃ = 0; ☃ < 16; ☃++)
        {
          double ☃ = 0.125D;
          double ☃ = n[(((☃ + 0) * ☃ + (☃ + 0)) * ☃ + (☃ + 0))];
          double ☃ = n[(((☃ + 0) * ☃ + (☃ + 1)) * ☃ + (☃ + 0))];
          double ☃ = n[(((☃ + 1) * ☃ + (☃ + 0)) * ☃ + (☃ + 0))];
          double ☃ = n[(((☃ + 1) * ☃ + (☃ + 1)) * ☃ + (☃ + 0))];
          
          double ☃ = (n[(((☃ + 0) * ☃ + (☃ + 0)) * ☃ + (☃ + 1))] - ☃) * ☃;
          double ☃ = (n[(((☃ + 0) * ☃ + (☃ + 1)) * ☃ + (☃ + 1))] - ☃) * ☃;
          double ☃ = (n[(((☃ + 1) * ☃ + (☃ + 0)) * ☃ + (☃ + 1))] - ☃) * ☃;
          double ☃ = (n[(((☃ + 1) * ☃ + (☃ + 1)) * ☃ + (☃ + 1))] - ☃) * ☃;
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
    int ☃ = h.F() + 1;
    
    double ☃ = 0.03125D;
    k = r.a(k, ☃ * 16, ☃ * 16, 0, 16, 16, 1, ☃, ☃, 1.0D);
    l = r.a(l, ☃ * 16, 109, ☃ * 16, 16, 1, 16, ☃, 1.0D, ☃);
    m = s.a(m, ☃ * 16, ☃ * 16, 0, 16, 16, 1, ☃ * 2.0D, ☃ * 2.0D, ☃ * 2.0D);
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        boolean ☃ = k[(☃ + ☃ * 16)] + j.nextDouble() * 0.2D > 0.0D;
        boolean ☃ = l[(☃ + ☃ * 16)] + j.nextDouble() * 0.2D > 0.0D;
        int ☃ = (int)(m[(☃ + ☃ * 16)] / 3.0D + 3.0D + j.nextDouble() * 0.25D);
        
        int ☃ = -1;
        
        alz ☃ = afi.aV.Q();
        alz ☃ = afi.aV.Q();
        for (int ☃ = 127; ☃ >= 0; ☃--) {
          if ((☃ >= 127 - j.nextInt(5)) || (☃ <= j.nextInt(5)))
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
    j.setSeed(☃ * 341873128712L + ☃ * 132897987541L);
    
    ans ☃ = new ans();
    
    a(☃, ☃, ☃);
    b(☃, ☃, ☃);
    
    C.a(this, h, ☃, ☃, ☃);
    if (i) {
      B.a(this, h, ☃, ☃, ☃);
    }
    amy ☃ = new amy(h, ☃, ☃, ☃);
    ady[] ☃ = h.v().b(null, ☃ * 16, ☃ * 16, 16, 16);
    byte[] ☃ = ☃.k();
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      ☃[☃] = ((byte)az);
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
    
    f = a.a(f, ☃, ☃, ☃, ☃, 1, ☃, 1.0D, 0.0D, 1.0D);
    g = b.a(g, ☃, ☃, ☃, ☃, 1, ☃, 100.0D, 0.0D, 100.0D);
    
    c = q.a(c, ☃, ☃, ☃, ☃, ☃, ☃, ☃ / 80.0D, ☃ / 60.0D, ☃ / 80.0D);
    d = o.a(d, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    e = p.a(e, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
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
          double ☃ = d[☃] / 512.0D;
          double ☃ = e[☃] / 512.0D;
          double ☃ = (c[☃] / 10.0D + 1.0D) / 2.0D;
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
    
    B.a(h, j, ☃);
    for (int ☃ = 0; ☃ < 8; ☃++) {
      y.b(h, j, ☃.a(j.nextInt(16) + 8, j.nextInt(120) + 4, j.nextInt(16) + 8));
    }
    for (int ☃ = 0; ☃ < j.nextInt(j.nextInt(10) + 1) + 1; ☃++) {
      t.b(h, j, ☃.a(j.nextInt(16) + 8, j.nextInt(120) + 4, j.nextInt(16) + 8));
    }
    for (int ☃ = 0; ☃ < j.nextInt(j.nextInt(10) + 1); ☃++) {
      u.b(h, j, ☃.a(j.nextInt(16) + 8, j.nextInt(120) + 4, j.nextInt(16) + 8));
    }
    for (int ☃ = 0; ☃ < 10; ☃++) {
      v.b(h, j, ☃.a(j.nextInt(16) + 8, j.nextInt(128), j.nextInt(16) + 8));
    }
    if (j.nextBoolean()) {
      z.b(h, j, ☃.a(j.nextInt(16) + 8, j.nextInt(128), j.nextInt(16) + 8));
    }
    if (j.nextBoolean()) {
      A.b(h, j, ☃.a(j.nextInt(16) + 8, j.nextInt(128), j.nextInt(16) + 8));
    }
    for (int ☃ = 0; ☃ < 16; ☃++) {
      w.b(h, j, ☃.a(j.nextInt(16), j.nextInt(108) + 10, j.nextInt(16)));
    }
    for (int ☃ = 0; ☃ < 16; ☃++) {
      x.b(h, j, ☃.a(j.nextInt(16), j.nextInt(108) + 10, j.nextInt(16)));
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
      if (B.b(☃)) {
        return B.b();
      }
      if ((B.a(h, ☃)) && (h.p(☃.b()).c() == afi.by)) {
        return B.b();
      }
    }
    ady ☃ = h.b(☃);
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
    B.a(this, h, ☃, ☃, null);
  }
  
  public amy a(cj ☃)
  {
    return d(☃.n() >> 4, ☃.p() >> 4);
  }
}
