import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ur
  extends pk
{
  private static final List<us> d = Arrays.asList(new us[] { new us(new zx(zy.T), 10).a(0.9F), new us(new zx(zy.aF), 10), new us(new zx(zy.aX), 10), new us(new zx(zy.bz), 10), new us(new zx(zy.F), 5), new us(new zx(zy.aR), 2).a(0.9F), new us(new zx(zy.z), 10), new us(new zx(zy.y), 5), new us(new zx(zy.aW, 10, zd.p.b()), 1), new us(new zx(afi.bR), 10), new us(new zx(zy.bt), 10) });
  private static final List<us> e = Arrays.asList(new us[] { new us(new zx(afi.bx), 1), new us(new zx(zy.co), 1), new us(new zx(zy.aA), 1), new us(new zx(zy.f), 1).a(0.25F).a(), new us(new zx(zy.aR), 1).a(0.25F).a(), new us(new zx(zy.aL), 1).a() });
  private static final List<us> f = Arrays.asList(new us[] { new us(new zx(zy.aU, 1, zp.a.a.a()), 60), new us(new zx(zy.aU, 1, zp.a.b.a()), 25), new us(new zx(zy.aU, 1, zp.a.c.a()), 2), new us(new zx(zy.aU, 1, zp.a.d.a()), 13) });
  
  public static List<us> j()
  {
    return f;
  }
  
  private int g = -1;
  private int h = -1;
  private int i = -1;
  private afh ar;
  private boolean as;
  public int a;
  public wn b;
  private int at;
  private int au;
  private int av;
  private int aw;
  private int ax;
  private float ay;
  public pk c;
  private int az;
  private double aA;
  private double aB;
  private double aC;
  private double aD;
  private double aE;
  private double aF;
  private double aG;
  private double aH;
  
  public ur(adm ☃)
  {
    super(☃);
    a(0.25F, 0.25F);
    ah = true;
  }
  
  public ur(adm ☃, double ☃, double ☃, double ☃, wn ☃)
  {
    this(☃);
    b(☃, ☃, ☃);
    ah = true;
    b = ☃;
    bG = this;
  }
  
  public ur(adm ☃, wn ☃)
  {
    super(☃);
    ah = true;
    b = ☃;
    b.bG = this;
    
    a(0.25F, 0.25F);
    
    b(s, t + ☃.aS(), u, y, z);
    
    s -= ns.b(y / 180.0F * 3.1415927F) * 0.16F;
    t -= 0.10000000149011612D;
    u -= ns.a(y / 180.0F * 3.1415927F) * 0.16F;
    b(s, t, u);
    
    float ☃ = 0.4F;
    v = (-ns.a(y / 180.0F * 3.1415927F) * ns.b(z / 180.0F * 3.1415927F) * ☃);
    x = (ns.b(y / 180.0F * 3.1415927F) * ns.b(z / 180.0F * 3.1415927F) * ☃);
    w = (-ns.a(z / 180.0F * 3.1415927F) * ☃);
    
    c(v, w, x, 1.5F, 1.0F);
  }
  
  protected void h() {}
  
  public boolean a(double ☃)
  {
    double ☃ = aR().a() * 4.0D;
    if (Double.isNaN(☃)) {
      ☃ = 4.0D;
    }
    ☃ *= 64.0D;
    return ☃ < ☃ * ☃;
  }
  
  public void c(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
    
    ☃ /= ☃;
    ☃ /= ☃;
    ☃ /= ☃;
    
    ☃ += V.nextGaussian() * 0.007499999832361937D * ☃;
    ☃ += V.nextGaussian() * 0.007499999832361937D * ☃;
    ☃ += V.nextGaussian() * 0.007499999832361937D * ☃;
    
    ☃ *= ☃;
    ☃ *= ☃;
    ☃ *= ☃;
    
    v = ☃;
    w = ☃;
    x = ☃;
    
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    
    A = (y = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
    B = (z = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
    at = 0;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    aA = ☃;
    aB = ☃;
    aC = ☃;
    aD = ☃;
    aE = ☃;
    
    az = ☃;
    
    v = aF;
    w = aG;
    x = aH;
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    aF = (v = ☃);
    aG = (w = ☃);
    aH = (x = ☃);
  }
  
  public void t_()
  {
    super.t_();
    if (az > 0)
    {
      double ☃ = s + (aA - s) / az;
      double ☃ = t + (aB - t) / az;
      double ☃ = u + (aC - u) / az;
      
      double ☃ = ns.g(aD - y);
      
      y = ((float)(y + ☃ / az));
      z = ((float)(z + (aE - z) / az));
      
      az -= 1;
      b(☃, ☃, ☃);
      b(y, z);
      return;
    }
    if (!o.D)
    {
      zx ☃ = b.bZ();
      if ((b.I) || (!b.ai()) || (☃ == null) || (☃.b() != zy.aR) || (h(b) > 1024.0D))
      {
        J();
        b.bG = null;
        return;
      }
      if (c != null) {
        if (c.I)
        {
          c = null;
        }
        else
        {
          s = c.s;
          t = (c.aR().b + c.K * 0.8D);
          u = c.u;
          return;
        }
      }
    }
    if (a > 0) {
      a -= 1;
    }
    if (as)
    {
      if (o.p(new cj(g, h, i)).c() == ar)
      {
        at += 1;
        if (at == 1200) {
          J();
        }
        return;
      }
      as = false;
      
      v *= V.nextFloat() * 0.2F;
      w *= V.nextFloat() * 0.2F;
      x *= V.nextFloat() * 0.2F;
      at = 0;
      au = 0;
    }
    else
    {
      au += 1;
    }
    aui ☃ = new aui(s, t, u);
    aui ☃ = new aui(s + v, t + w, u + x);
    auh ☃ = o.a(☃, ☃);
    
    ☃ = new aui(s, t, u);
    ☃ = new aui(s + v, t + w, u + x);
    if (☃ != null) {
      ☃ = new aui(c.a, c.b, c.c);
    }
    pk ☃ = null;
    List<pk> ☃ = o.b(this, aR().a(v, w, x).b(1.0D, 1.0D, 1.0D));
    double ☃ = 0.0D;
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      pk ☃ = (pk)☃.get(☃);
      if ((☃.ad()) && ((☃ != b) || (au >= 5)))
      {
        float ☃ = 0.3F;
        aug ☃ = ☃.aR().b(☃, ☃, ☃);
        auh ☃ = ☃.a(☃, ☃);
        if (☃ != null)
        {
          double ☃ = ☃.g(c);
          if ((☃ < ☃) || (☃ == 0.0D))
          {
            ☃ = ☃;
            ☃ = ☃;
          }
        }
      }
    }
    if (☃ != null) {
      ☃ = new auh(☃);
    }
    if (☃ != null) {
      if (d != null)
      {
        if (d.a(ow.a(this, b), 0.0F)) {
          c = d;
        }
      }
      else {
        as = true;
      }
    }
    if (as) {
      return;
    }
    d(v, w, x);
    
    float ☃ = ns.a(v * v + x * x);
    y = ((float)(ns.b(v, x) * 180.0D / 3.1415927410125732D));
    z = ((float)(ns.b(w, ☃) * 180.0D / 3.1415927410125732D));
    while (z - B < -180.0F) {
      B -= 360.0F;
    }
    while (z - B >= 180.0F) {
      B += 360.0F;
    }
    while (y - A < -180.0F) {
      A -= 360.0F;
    }
    while (y - A >= 180.0F) {
      A += 360.0F;
    }
    z = (B + (z - B) * 0.2F);
    y = (A + (y - A) * 0.2F);
    
    float ☃ = 0.92F;
    if ((C) || (D)) {
      ☃ = 0.5F;
    }
    int ☃ = 5;
    double ☃ = 0.0D;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      aug ☃ = aR();
      double ☃ = e - b;
      double ☃ = b + ☃ * ☃ / ☃;
      double ☃ = b + ☃ * (☃ + 1) / ☃;
      aug ☃ = new aug(a, ☃, c, d, ☃, f);
      if (o.b(☃, arm.h)) {
        ☃ += 1.0D / ☃;
      }
    }
    if ((!o.D) && (☃ > 0.0D))
    {
      le ☃ = (le)o;
      
      int ☃ = 1;
      cj ☃ = new cj(this).a();
      if ((V.nextFloat() < 0.25F) && (o.C(☃))) {
        ☃ = 2;
      }
      if ((V.nextFloat() < 0.5F) && (!o.i(☃))) {
        ☃--;
      }
      if (av > 0)
      {
        av -= 1;
        if (av <= 0)
        {
          aw = 0;
          ax = 0;
        }
      }
      else if (ax > 0)
      {
        ax -= ☃;
        if (ax <= 0)
        {
          w -= 0.20000000298023224D;
          a("random.splash", 0.25F, 1.0F + (V.nextFloat() - V.nextFloat()) * 0.4F);
          float ☃ = ns.c(aRb);
          ☃.a(cy.e, s, ☃ + 1.0F, u, (int)(1.0F + J * 20.0F), J, 0.0D, J, 0.20000000298023224D, new int[0]);
          ☃.a(cy.g, s, ☃ + 1.0F, u, (int)(1.0F + J * 20.0F), J, 0.0D, J, 0.20000000298023224D, new int[0]);
          
          av = ns.a(V, 10, 30);
        }
        else
        {
          ay = ((float)(ay + V.nextGaussian() * 4.0D));
          
          float ☃ = ay * 0.017453292F;
          float ☃ = ns.a(☃);
          float ☃ = ns.b(☃);
          double ☃ = s + ☃ * ax * 0.1F;
          double ☃ = ns.c(aRb) + 1.0F;
          double ☃ = u + ☃ * ax * 0.1F;
          
          afh ☃ = ☃.p(new cj((int)☃, (int)☃ - 1, (int)☃)).c();
          if ((☃ == afi.j) || (☃ == afi.i))
          {
            if (V.nextFloat() < 0.15F) {
              ☃.a(cy.e, ☃, ☃ - 0.10000000149011612D, ☃, 1, ☃, 0.1D, ☃, 0.0D, new int[0]);
            }
            float ☃ = ☃ * 0.04F;
            float ☃ = ☃ * 0.04F;
            
            ☃.a(cy.g, ☃, ☃, ☃, 0, ☃, 0.01D, -☃, 1.0D, new int[0]);
            ☃.a(cy.g, ☃, ☃, ☃, 0, -☃, 0.01D, ☃, 1.0D, new int[0]);
          }
        }
      }
      else if (aw > 0)
      {
        aw -= ☃;
        
        float ☃ = 0.15F;
        if (aw < 20) {
          ☃ = (float)(☃ + (20 - aw) * 0.05D);
        } else if (aw < 40) {
          ☃ = (float)(☃ + (40 - aw) * 0.02D);
        } else if (aw < 60) {
          ☃ = (float)(☃ + (60 - aw) * 0.01D);
        }
        if (V.nextFloat() < ☃)
        {
          float ☃ = ns.a(V, 0.0F, 360.0F) * 0.017453292F;
          float ☃ = ns.a(V, 25.0F, 60.0F);
          double ☃ = s + ns.a(☃) * ☃ * 0.1F;
          double ☃ = ns.c(aRb) + 1.0F;
          double ☃ = u + ns.b(☃) * ☃ * 0.1F;
          afh ☃ = ☃.p(new cj((int)☃, (int)☃ - 1, (int)☃)).c();
          if ((☃ == afi.j) || (☃ == afi.i)) {
            ☃.a(cy.f, ☃, ☃, ☃, 2 + V.nextInt(2), 0.10000000149011612D, 0.0D, 0.10000000149011612D, 0.0D, new int[0]);
          }
        }
        if (aw <= 0)
        {
          ay = ns.a(V, 0.0F, 360.0F);
          ax = ns.a(V, 20, 80);
        }
      }
      else
      {
        aw = ns.a(V, 100, 900);
        aw -= ack.h(b) * 20 * 5;
      }
      if (av > 0) {
        w -= V.nextFloat() * V.nextFloat() * V.nextFloat() * 0.2D;
      }
    }
    double ☃ = ☃ * 2.0D - 1.0D;
    w += 0.03999999910593033D * ☃;
    if (☃ > 0.0D)
    {
      ☃ = (float)(☃ * 0.9D);
      w *= 0.8D;
    }
    v *= ☃;
    w *= ☃;
    x *= ☃;
    
    b(s, t, u);
  }
  
  public void b(dn ☃)
  {
    ☃.a("xTile", (short)g);
    ☃.a("yTile", (short)h);
    ☃.a("zTile", (short)i);
    jy ☃ = (jy)afh.c.c(ar);
    ☃.a("inTile", ☃ == null ? "" : ☃.toString());
    ☃.a("shake", (byte)a);
    ☃.a("inGround", (byte)(as ? 1 : 0));
  }
  
  public void a(dn ☃)
  {
    g = ☃.e("xTile");
    h = ☃.e("yTile");
    i = ☃.e("zTile");
    if (☃.b("inTile", 8)) {
      ar = afh.b(☃.j("inTile"));
    } else {
      ar = afh.c(☃.d("inTile") & 0xFF);
    }
    a = (☃.d("shake") & 0xFF);
    as = (☃.d("inGround") == 1);
  }
  
  public int l()
  {
    if (o.D) {
      return 0;
    }
    int ☃ = 0;
    if (c != null)
    {
      double ☃ = b.s - s;
      double ☃ = b.t - t;
      double ☃ = b.u - u;
      
      double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
      double ☃ = 0.1D;
      c.v += ☃ * ☃;
      c.w += ☃ * ☃ + ns.a(☃) * 0.08D;
      c.x += ☃ * ☃;
      ☃ = 3;
    }
    else if (av > 0)
    {
      uz ☃ = new uz(o, s, t, u, m());
      double ☃ = b.s - s;
      double ☃ = b.t - t;
      double ☃ = b.u - u;
      
      double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
      double ☃ = 0.1D;
      v = (☃ * ☃);
      w = (☃ * ☃ + ns.a(☃) * 0.08D);
      x = (☃ * ☃);
      o.d(☃);
      b.o.d(new pp(b.o, b.s, b.t + 0.5D, b.u + 0.5D, V.nextInt(6) + 1));
      ☃ = 1;
    }
    if (as) {
      ☃ = 2;
    }
    J();
    b.bG = null;
    return ☃;
  }
  
  private zx m()
  {
    float ☃ = o.s.nextFloat();
    int ☃ = ack.g(b);
    int ☃ = ack.h(b);
    float ☃ = 0.1F - ☃ * 0.025F - ☃ * 0.01F;
    float ☃ = 0.05F + ☃ * 0.01F - ☃ * 0.01F;
    
    ☃ = ns.a(☃, 0.0F, 1.0F);
    ☃ = ns.a(☃, 0.0F, 1.0F);
    if (☃ < ☃)
    {
      b.b(na.D);
      return ((us)oa.a(V, d)).a(V);
    }
    ☃ -= ☃;
    if (☃ < ☃)
    {
      b.b(na.E);
      return ((us)oa.a(V, e)).a(V);
    }
    ☃ -= ☃;
    
    b.b(na.C);
    return ((us)oa.a(V, f)).a(V);
  }
  
  public void J()
  {
    super.J();
    if (b != null) {
      b.bG = null;
    }
  }
}
