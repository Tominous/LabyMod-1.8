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
    this.m = ☃;
    this.n = ☃;
    this.o = ☃.P().u();
    
    this.h = new Random(☃);
    this.i = new arc(this.h, 16);
    this.j = new arc(this.h, 16);
    this.k = new arc(this.h, 8);
    this.l = new ard(this.h, 4);
    
    this.a = new arc(this.h, 10);
    this.b = new arc(this.h, 16);
    
    this.c = new arc(this.h, 8);
    
    this.p = new double['̹'];
    
    this.q = new float[25];
    for (int ☃ = -2; ☃ <= 2; ☃++) {
      for (int ☃ = -2; ☃ <= 2; ☃++)
      {
        float ☃ = 10.0F / ns.c(☃ * ☃ + ☃ * ☃ + 0.2F);
        this.q[(☃ + 2 + (☃ + 2) * 5)] = ☃;
      }
    }
    if (☃ != null)
    {
      this.r = ant.a.a(☃).b();
      this.s = (this.r.E ? afi.l : afi.j);
      ☃.b(this.r.q);
    }
  }
  
  public void a(int ☃, int ☃, ans ☃)
  {
    this.B = this.m.v().a(this.B, ☃ * 4 - 2, ☃ * 4 - 2, 10, 10);
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
          double ☃ = this.p[(☃ + ☃)];
          double ☃ = this.p[(☃ + ☃)];
          double ☃ = this.p[(☃ + ☃)];
          double ☃ = this.p[(☃ + ☃)];
          
          double ☃ = (this.p[(☃ + ☃ + 1)] - ☃) * ☃;
          double ☃ = (this.p[(☃ + ☃ + 1)] - ☃) * ☃;
          double ☃ = (this.p[(☃ + ☃ + 1)] - ☃) * ☃;
          double ☃ = (this.p[(☃ + ☃ + 1)] - ☃) * ☃;
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
                } else if (☃ * 8 + ☃ < this.r.q) {
                  ☃.a(☃ * 4 + ☃, ☃ * 8 + ☃, ☃ * 4 + ☃, this.s.Q());
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
    this.t = this.l.a(this.t, ☃ * 16, ☃ * 16, 16, 16, ☃ * 2.0D, ☃ * 2.0D, 1.0D);
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        ady ☃ = ☃[(☃ + ☃ * 16)];
        ☃.a(this.m, this.h, ☃, ☃ * 16 + ☃, ☃ * 16 + ☃, this.t[(☃ + ☃ * 16)]);
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
    this.h.setSeed(☃ * 341873128712L + ☃ * 132897987541L);
    
    ans ☃ = new ans();
    
    a(☃, ☃, ☃);
    this.B = this.m.v().b(this.B, ☃ * 16, ☃ * 16, 16, 16);
    a(☃, ☃, ☃, this.B);
    if (this.r.r) {
      this.u.a(this, this.m, ☃, ☃, ☃);
    }
    if (this.r.z) {
      this.z.a(this, this.m, ☃, ☃, ☃);
    }
    if ((this.r.w) && (this.n)) {
      this.x.a(this, this.m, ☃, ☃, ☃);
    }
    if ((this.r.v) && (this.n)) {
      this.w.a(this, this.m, ☃, ☃, ☃);
    }
    if ((this.r.u) && (this.n)) {
      this.v.a(this, this.m, ☃, ☃, ☃);
    }
    if ((this.r.x) && (this.n)) {
      this.y.a(this, this.m, ☃, ☃, ☃);
    }
    if ((this.r.y) && (this.n)) {
      this.A.a(this, this.m, ☃, ☃, ☃);
    }
    amy ☃ = new amy(this.m, ☃, ☃, ☃);
    byte[] ☃ = ☃.k();
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      ☃[☃] = ((byte)this.B[☃].az);
    }
    ☃.b();
    
    return ☃;
  }
  
  private void a(int ☃, int ☃, int ☃)
  {
    this.g = this.b.a(this.g, ☃, ☃, 5, 5, this.r.e, this.r.f, this.r.g);
    
    float ☃ = this.r.a;
    float ☃ = this.r.b;
    this.d = this.k.a(this.d, ☃, ☃, ☃, 5, 33, 5, ☃ / this.r.h, ☃ / this.r.i, ☃ / this.r.j);
    this.e = this.i.a(this.e, ☃, ☃, ☃, 5, 33, 5, ☃, ☃, ☃);
    this.f = this.j.a(this.f, ☃, ☃, ☃, 5, 33, 5, ☃, ☃, ☃);
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
        
        ady ☃ = this.B[(☃ + 2 + (☃ + 2) * 10)];
        for (int ☃ = -☃; ☃ <= ☃; ☃++) {
          for (int ☃ = -☃; ☃ <= ☃; ☃++)
          {
            ady ☃ = this.B[(☃ + ☃ + 2 + (☃ + ☃ + 2) * 10)];
            float ☃ = this.r.n + ☃.an * this.r.m;
            float ☃ = this.r.p + ☃.ao * this.r.o;
            if ((this.o == adr.e) && (☃ > 0.0F))
            {
              ☃ = 1.0F + ☃ * 2.0F;
              ☃ = 1.0F + ☃ * 4.0F;
            }
            float ☃ = this.q[(☃ + 2 + (☃ + 2) * 5)] / (☃ + 2.0F);
            if (☃.an > ☃.an) {
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
        
        double ☃ = this.g[☃] / 8000.0D;
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
        ☃ = ☃ * this.r.k / 8.0D;
        
        double ☃ = this.r.k + ☃ * 4.0D;
        for (int ☃ = 0; ☃ < 33; ☃++)
        {
          double ☃ = (☃ - ☃) * this.r.l * 128.0D / 256.0D / ☃;
          if (☃ < 0.0D) {
            ☃ *= 4.0D;
          }
          double ☃ = this.e[☃] / this.r.d;
          double ☃ = this.f[☃] / this.r.c;
          
          double ☃ = (this.d[☃] / 10.0D + 1.0D) / 2.0D;
          double ☃ = ns.b(☃, ☃, ☃) - ☃;
          if (☃ > 29)
          {
            double ☃ = (☃ - 29) / 3.0F;
            ☃ = ☃ * (1.0D - ☃) + -10.0D * ☃;
          }
          this.p[☃] = ☃;
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
    ady ☃ = this.m.b(☃.a(16, 0, 16));
    
    this.h.setSeed(this.m.J());
    long ☃ = this.h.nextLong() / 2L * 2L + 1L;
    long ☃ = this.h.nextLong() / 2L * 2L + 1L;
    this.h.setSeed(☃ * ☃ + ☃ * ☃ ^ this.m.J());
    
    boolean ☃ = false;
    
    adg ☃ = new adg(☃, ☃);
    if ((this.r.w) && (this.n)) {
      this.x.a(this.m, this.h, ☃);
    }
    if ((this.r.v) && (this.n)) {
      ☃ = this.w.a(this.m, this.h, ☃);
    }
    if ((this.r.u) && (this.n)) {
      this.v.a(this.m, this.h, ☃);
    }
    if ((this.r.x) && (this.n)) {
      this.y.a(this.m, this.h, ☃);
    }
    if ((this.r.y) && (this.n)) {
      this.A.a(this.m, this.h, ☃);
    }
    if ((☃ != ady.r) && (☃ != ady.G) && (this.r.A) && 
      (!☃) && (this.h.nextInt(this.r.B) == 0))
    {
      int ☃ = this.h.nextInt(16) + 8;
      int ☃ = this.h.nextInt(256);
      int ☃ = this.h.nextInt(16) + 8;
      new apc(afi.j).b(this.m, this.h, ☃.a(☃, ☃, ☃));
    }
    if ((!☃) && (this.h.nextInt(this.r.D / 10) == 0) && (this.r.C))
    {
      int ☃ = this.h.nextInt(16) + 8;
      int ☃ = this.h.nextInt(this.h.nextInt(248) + 8);
      int ☃ = this.h.nextInt(16) + 8;
      if ((☃ < this.m.F()) || (this.h.nextInt(this.r.D / 8) == 0)) {
        new apc(afi.l).b(this.m, this.h, ☃.a(☃, ☃, ☃));
      }
    }
    if (this.r.s) {
      for (int ☃ = 0; ☃ < this.r.t; ☃++)
      {
        int ☃ = this.h.nextInt(16) + 8;
        int ☃ = this.h.nextInt(256);
        int ☃ = this.h.nextInt(16) + 8;
        new api().b(this.m, this.h, ☃.a(☃, ☃, ☃));
      }
    }
    ☃.a(this.m, this.h, new cj(☃, 0, ☃));
    
    adt.a(this.m, ☃, ☃ + 8, ☃ + 8, 16, 16, this.h);
    
    ☃ = ☃.a(8, 0, 8);
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        cj ☃ = this.m.q(☃.a(☃, 0, ☃));
        cj ☃ = ☃.b();
        if (this.m.v(☃)) {
          this.m.a(☃, afi.aI.Q(), 2);
        }
        if (this.m.f(☃, true)) {
          this.m.a(☃, afi.aH.Q(), 2);
        }
      }
    }
    agr.N = false;
  }
  
  public boolean a(amv ☃, amy ☃, int ☃, int ☃)
  {
    boolean ☃ = false;
    if ((this.r.y) && (this.n)) {
      if (☃.w() < 3600L) {
        ☃ |= this.A.a(this.m, this.h, new adg(☃, ☃));
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
    ady ☃ = this.m.b(☃);
    if (this.n)
    {
      if ((☃ == pt.a) && (this.y.a(☃))) {
        return this.y.b();
      }
      if ((☃ == pt.a) && (this.r.y) && (this.A.a(this.m, ☃))) {
        return this.A.b();
      }
    }
    return ☃.a(☃);
  }
  
  public cj a(adm ☃, String ☃, cj ☃)
  {
    if (("Stronghold".equals(☃)) && (this.v != null)) {
      return this.v.b(☃, ☃);
    }
    return null;
  }
  
  public int g()
  {
    return 0;
  }
  
  public void a(amy ☃, int ☃, int ☃)
  {
    if ((this.r.w) && (this.n)) {
      this.x.a(this, this.m, ☃, ☃, null);
    }
    if ((this.r.v) && (this.n)) {
      this.w.a(this, this.m, ☃, ☃, null);
    }
    if ((this.r.u) && (this.n)) {
      this.v.a(this, this.m, ☃, ☃, null);
    }
    if ((this.r.x) && (this.n)) {
      this.y.a(this, this.m, ☃, ☃, null);
    }
    if ((this.r.y) && (this.n)) {
      this.A.a(this, this.m, ☃, ☃, null);
    }
  }
  
  public amy a(cj ☃)
  {
    return d(☃.n() >> 4, ☃.p() >> 4);
  }
}
