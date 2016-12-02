import java.util.List;
import java.util.Random;

public class aoa
  implements amv
{
  private Random h;
  private arc i;
  private arc j;
  private arc k;
  private ard l;
  public arc a;
  public arc b;
  public arc c;
  private adm m;
  private final boolean n;
  private adr o;
  private final double[] p;
  private final float[] q;
  private ant r;
  private afh s = afi.j;
  
  public aoa(adm ☃, long ☃, boolean ☃, String ☃)
  {
    m = ☃;
    n = ☃;
    o = ☃.P().u();
    
    h = new Random(☃);
    i = new arc(h, 16);
    j = new arc(h, 16);
    k = new arc(h, 8);
    l = new ard(h, 4);
    
    a = new arc(h, 10);
    b = new arc(h, 16);
    
    c = new arc(h, 8);
    
    p = new double['̹'];
    
    q = new float[25];
    for (int ☃ = -2; ☃ <= 2; ☃++) {
      for (int ☃ = -2; ☃ <= 2; ☃++)
      {
        float ☃ = 10.0F / ns.c(☃ * ☃ + ☃ * ☃ + 0.2F);
        q[(☃ + 2 + (☃ + 2) * 5)] = ☃;
      }
    }
    if (☃ != null)
    {
      r = ant.a.a(☃).b();
      s = (r.E ? afi.l : afi.j);
      ☃.b(r.q);
    }
  }
  
  public void a(int ☃, int ☃, ans ☃)
  {
    B = m.v().a(B, ☃ * 4 - 2, ☃ * 4 - 2, 10, 10);
    a(☃ * 4, 0, ☃ * 4);
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      int ☃ = ☃ * 5;
      int ☃ = (☃ + 1) * 5;
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        int ☃ = (☃ + ☃) * 33;
        int ☃ = (☃ + ☃ + 1) * 33;
        int ☃ = (☃ + ☃) * 33;
        int ☃ = (☃ + ☃ + 1) * 33;
        for (int ☃ = 0; ☃ < 32; ☃++)
        {
          double ☃ = 0.125D;
          double ☃ = p[(☃ + ☃)];
          double ☃ = p[(☃ + ☃)];
          double ☃ = p[(☃ + ☃)];
          double ☃ = p[(☃ + ☃)];
          
          double ☃ = (p[(☃ + ☃ + 1)] - ☃) * ☃;
          double ☃ = (p[(☃ + ☃ + 1)] - ☃) * ☃;
          double ☃ = (p[(☃ + ☃ + 1)] - ☃) * ☃;
          double ☃ = (p[(☃ + ☃ + 1)] - ☃) * ☃;
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
              ☃ -= ☃;
              for (int ☃ = 0; ☃ < 4; ☃++) {
                if (☃ += ☃ > 0.0D) {
                  ☃.a(☃ * 4 + ☃, ☃ * 8 + ☃, ☃ * 4 + ☃, afi.b.Q());
                } else if (☃ * 8 + ☃ < r.q) {
                  ☃.a(☃ * 4 + ☃, ☃ * 8 + ☃, ☃ * 4 + ☃, s.Q());
                }
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
  
  private double[] t = new double['Ā'];
  
  public void a(int ☃, int ☃, ans ☃, ady[] ☃)
  {
    double ☃ = 0.03125D;
    t = l.a(t, ☃ * 16, ☃ * 16, 16, 16, ☃ * 2.0D, ☃ * 2.0D, 1.0D);
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        ady ☃ = ☃[(☃ + ☃ * 16)];
        ☃.a(m, h, ☃, ☃ * 16 + ☃, ☃ * 16 + ☃, t[(☃ + ☃ * 16)]);
      }
    }
  }
  
  private any u = new anx();
  private aqo v = new aqo();
  private aqv w = new aqv();
  private aqf x = new aqf();
  private aqm y = new aqm();
  private any z = new anr();
  private aqk A = new aqk();
  private ady[] B;
  double[] d;
  double[] e;
  double[] f;
  double[] g;
  
  public amy d(int ☃, int ☃)
  {
    h.setSeed(☃ * 341873128712L + ☃ * 132897987541L);
    
    ans ☃ = new ans();
    
    a(☃, ☃, ☃);
    B = m.v().b(B, ☃ * 16, ☃ * 16, 16, 16);
    a(☃, ☃, ☃, B);
    if (r.r) {
      u.a(this, m, ☃, ☃, ☃);
    }
    if (r.z) {
      z.a(this, m, ☃, ☃, ☃);
    }
    if ((r.w) && (n)) {
      x.a(this, m, ☃, ☃, ☃);
    }
    if ((r.v) && (n)) {
      w.a(this, m, ☃, ☃, ☃);
    }
    if ((r.u) && (n)) {
      v.a(this, m, ☃, ☃, ☃);
    }
    if ((r.x) && (n)) {
      y.a(this, m, ☃, ☃, ☃);
    }
    if ((r.y) && (n)) {
      A.a(this, m, ☃, ☃, ☃);
    }
    amy ☃ = new amy(m, ☃, ☃, ☃);
    byte[] ☃ = ☃.k();
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      ☃[☃] = ((byte)B[☃].az);
    }
    ☃.b();
    
    return ☃;
  }
  
  private void a(int ☃, int ☃, int ☃)
  {
    g = b.a(g, ☃, ☃, 5, 5, r.e, r.f, r.g);
    
    float ☃ = r.a;
    float ☃ = r.b;
    d = k.a(d, ☃, ☃, ☃, 5, 33, 5, ☃ / r.h, ☃ / r.i, ☃ / r.j);
    e = i.a(e, ☃, ☃, ☃, 5, 33, 5, ☃, ☃, ☃);
    f = j.a(f, ☃, ☃, ☃, 5, 33, 5, ☃, ☃, ☃);
    ☃ = ☃ = 0;
    
    int ☃ = 0;
    int ☃ = 0;
    for (int ☃ = 0; ☃ < 5; ☃++) {
      for (int ☃ = 0; ☃ < 5; ☃++)
      {
        float ☃ = 0.0F;
        float ☃ = 0.0F;
        float ☃ = 0.0F;
        
        int ☃ = 2;
        
        ady ☃ = B[(☃ + 2 + (☃ + 2) * 10)];
        for (int ☃ = -☃; ☃ <= ☃; ☃++) {
          for (int ☃ = -☃; ☃ <= ☃; ☃++)
          {
            ady ☃ = B[(☃ + ☃ + 2 + (☃ + ☃ + 2) * 10)];
            float ☃ = r.n + an * r.m;
            float ☃ = r.p + ao * r.o;
            if ((o == adr.e) && (☃ > 0.0F))
            {
              ☃ = 1.0F + ☃ * 2.0F;
              ☃ = 1.0F + ☃ * 4.0F;
            }
            float ☃ = q[(☃ + 2 + (☃ + 2) * 5)] / (☃ + 2.0F);
            if (an > an) {
              ☃ /= 2.0F;
            }
            ☃ += ☃ * ☃;
            ☃ += ☃ * ☃;
            ☃ += ☃;
          }
        }
        ☃ /= ☃;
        ☃ /= ☃;
        
        ☃ = ☃ * 0.9F + 0.1F;
        ☃ = (☃ * 4.0F - 1.0F) / 8.0F;
        
        double ☃ = g[☃] / 8000.0D;
        if (☃ < 0.0D) {
          ☃ = -☃ * 0.3D;
        }
        ☃ = ☃ * 3.0D - 2.0D;
        if (☃ < 0.0D)
        {
          ☃ /= 2.0D;
          if (☃ < -1.0D) {
            ☃ = -1.0D;
          }
          ☃ /= 1.4D;
          ☃ /= 2.0D;
        }
        else
        {
          if (☃ > 1.0D) {
            ☃ = 1.0D;
          }
          ☃ /= 8.0D;
        }
        ☃++;
        
        double ☃ = ☃;
        double ☃ = ☃;
        ☃ += ☃ * 0.2D;
        ☃ = ☃ * r.k / 8.0D;
        
        double ☃ = r.k + ☃ * 4.0D;
        for (int ☃ = 0; ☃ < 33; ☃++)
        {
          double ☃ = (☃ - ☃) * r.l * 128.0D / 256.0D / ☃;
          if (☃ < 0.0D) {
            ☃ *= 4.0D;
          }
          double ☃ = e[☃] / r.d;
          double ☃ = f[☃] / r.c;
          
          double ☃ = (d[☃] / 10.0D + 1.0D) / 2.0D;
          double ☃ = ns.b(☃, ☃, ☃) - ☃;
          if (☃ > 29)
          {
            double ☃ = (☃ - 29) / 3.0F;
            ☃ = ☃ * (1.0D - ☃) + -10.0D * ☃;
          }
          p[☃] = ☃;
          ☃++;
        }
      }
    }
  }
  
  public boolean a(int ☃, int ☃)
  {
    return true;
  }
  
  public void a(amv ☃, int ☃, int ☃)
  {
    agr.N = true;
    int ☃ = ☃ * 16;
    int ☃ = ☃ * 16;
    cj ☃ = new cj(☃, 0, ☃);
    ady ☃ = m.b(☃.a(16, 0, 16));
    
    h.setSeed(m.J());
    long ☃ = h.nextLong() / 2L * 2L + 1L;
    long ☃ = h.nextLong() / 2L * 2L + 1L;
    h.setSeed(☃ * ☃ + ☃ * ☃ ^ m.J());
    
    boolean ☃ = false;
    
    adg ☃ = new adg(☃, ☃);
    if ((r.w) && (n)) {
      x.a(m, h, ☃);
    }
    if ((r.v) && (n)) {
      ☃ = w.a(m, h, ☃);
    }
    if ((r.u) && (n)) {
      v.a(m, h, ☃);
    }
    if ((r.x) && (n)) {
      y.a(m, h, ☃);
    }
    if ((r.y) && (n)) {
      A.a(m, h, ☃);
    }
    if ((☃ != ady.r) && (☃ != ady.G) && (r.A) && 
      (!☃) && (h.nextInt(r.B) == 0))
    {
      int ☃ = h.nextInt(16) + 8;
      int ☃ = h.nextInt(256);
      int ☃ = h.nextInt(16) + 8;
      new apc(afi.j).b(m, h, ☃.a(☃, ☃, ☃));
    }
    if ((!☃) && (h.nextInt(r.D / 10) == 0) && (r.C))
    {
      int ☃ = h.nextInt(16) + 8;
      int ☃ = h.nextInt(h.nextInt(248) + 8);
      int ☃ = h.nextInt(16) + 8;
      if ((☃ < m.F()) || (h.nextInt(r.D / 8) == 0)) {
        new apc(afi.l).b(m, h, ☃.a(☃, ☃, ☃));
      }
    }
    if (r.s) {
      for (int ☃ = 0; ☃ < r.t; ☃++)
      {
        int ☃ = h.nextInt(16) + 8;
        int ☃ = h.nextInt(256);
        int ☃ = h.nextInt(16) + 8;
        new api().b(m, h, ☃.a(☃, ☃, ☃));
      }
    }
    ☃.a(m, h, new cj(☃, 0, ☃));
    
    adt.a(m, ☃, ☃ + 8, ☃ + 8, 16, 16, h);
    
    ☃ = ☃.a(8, 0, 8);
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        cj ☃ = m.q(☃.a(☃, 0, ☃));
        cj ☃ = ☃.b();
        if (m.v(☃)) {
          m.a(☃, afi.aI.Q(), 2);
        }
        if (m.f(☃, true)) {
          m.a(☃, afi.aH.Q(), 2);
        }
      }
    }
    agr.N = false;
  }
  
  public boolean a(amv ☃, amy ☃, int ☃, int ☃)
  {
    boolean ☃ = false;
    if ((r.y) && (n)) {
      if (☃.w() < 3600L) {
        ☃ |= A.a(m, h, new adg(☃, ☃));
      }
    }
    return ☃;
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
    return "RandomLevelSource";
  }
  
  public List<ady.c> a(pt ☃, cj ☃)
  {
    ady ☃ = m.b(☃);
    if (n)
    {
      if ((☃ == pt.a) && (y.a(☃))) {
        return y.b();
      }
      if ((☃ == pt.a) && (r.y) && (A.a(m, ☃))) {
        return A.b();
      }
    }
    return ☃.a(☃);
  }
  
  public cj a(adm ☃, String ☃, cj ☃)
  {
    if (("Stronghold".equals(☃)) && (v != null)) {
      return v.b(☃, ☃);
    }
    return null;
  }
  
  public int g()
  {
    return 0;
  }
  
  public void a(amy ☃, int ☃, int ☃)
  {
    if ((r.w) && (n)) {
      x.a(this, m, ☃, ☃, null);
    }
    if ((r.v) && (n)) {
      w.a(this, m, ☃, ☃, null);
    }
    if ((r.u) && (n)) {
      v.a(this, m, ☃, ☃, null);
    }
    if ((r.x) && (n)) {
      y.a(this, m, ☃, ☃, null);
    }
    if ((r.y) && (n)) {
      A.a(this, m, ☃, ☃, null);
    }
  }
  
  public amy a(cj ☃)
  {
    return d(☃.n() >> 4, ☃.p() >> 4);
  }
}
