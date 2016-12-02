import java.util.List;
import java.util.Random;

public class wq
  extends pk
  implements wv
{
  private int d = -1;
  private int e = -1;
  private int f = -1;
  private afh g;
  private int h;
  private boolean i;
  public int a;
  public int b;
  public pk c;
  private int ar;
  private int as;
  private double at = 2.0D;
  private int au;
  
  public wq(adm ☃)
  {
    super(☃);
    j = 10.0D;
    a(0.5F, 0.5F);
  }
  
  public wq(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    j = 10.0D;
    
    a(0.5F, 0.5F);
    
    b(☃, ☃, ☃);
  }
  
  public wq(adm ☃, pr ☃, pr ☃, float ☃, float ☃)
  {
    super(☃);
    j = 10.0D;
    c = ☃;
    if ((☃ instanceof wn)) {
      a = 1;
    }
    t = (t + ☃.aS() - 0.10000000149011612D);
    
    double ☃ = s - s;
    double ☃ = aRb + K / 3.0F - t;
    double ☃ = u - u;
    double ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    if (☃ < 1.0E-7D) {
      return;
    }
    float ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D) - 90.0F;
    float ☃ = (float)-(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D);
    
    double ☃ = ☃ / ☃;
    double ☃ = ☃ / ☃;
    b(s + ☃, t, u + ☃, ☃, ☃);
    
    float ☃ = (float)(☃ * 0.20000000298023224D);
    c(☃, ☃ + ☃, ☃, ☃, ☃);
  }
  
  public wq(adm ☃, pr ☃, float ☃)
  {
    super(☃);
    j = 10.0D;
    c = ☃;
    if ((☃ instanceof wn)) {
      a = 1;
    }
    a(0.5F, 0.5F);
    
    b(s, t + ☃.aS(), u, y, z);
    
    s -= ns.b(y / 180.0F * 3.1415927F) * 0.16F;
    t -= 0.10000000149011612D;
    u -= ns.a(y / 180.0F * 3.1415927F) * 0.16F;
    b(s, t, u);
    
    v = (-ns.a(y / 180.0F * 3.1415927F) * ns.b(z / 180.0F * 3.1415927F));
    x = (ns.b(y / 180.0F * 3.1415927F) * ns.b(z / 180.0F * 3.1415927F));
    w = (-ns.a(z / 180.0F * 3.1415927F));
    
    c(v, w, x, ☃ * 1.5F, 1.0F);
  }
  
  protected void h()
  {
    ac.a(16, Byte.valueOf((byte)0));
  }
  
  public void c(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
    
    ☃ /= ☃;
    ☃ /= ☃;
    ☃ /= ☃;
    
    ☃ += V.nextGaussian() * (V.nextBoolean() ? -1 : 1) * 0.007499999832361937D * ☃;
    ☃ += V.nextGaussian() * (V.nextBoolean() ? -1 : 1) * 0.007499999832361937D * ☃;
    ☃ += V.nextGaussian() * (V.nextBoolean() ? -1 : 1) * 0.007499999832361937D * ☃;
    
    ☃ *= ☃;
    ☃ *= ☃;
    ☃ *= ☃;
    
    v = ☃;
    w = ☃;
    x = ☃;
    
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    
    A = (y = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
    B = (z = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
    ar = 0;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    b(☃, ☃, ☃);
    b(☃, ☃);
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    v = ☃;
    w = ☃;
    x = ☃;
    if ((B == 0.0F) && (A == 0.0F))
    {
      float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
      A = (y = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
      B = (z = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
      B = z;
      A = y;
      b(s, t, u, y, z);
      ar = 0;
    }
  }
  
  public void t_()
  {
    super.t_();
    if ((B == 0.0F) && (A == 0.0F))
    {
      float ☃ = ns.a(v * v + x * x);
      A = (y = (float)(ns.b(v, x) * 180.0D / 3.1415927410125732D));
      B = (z = (float)(ns.b(w, ☃) * 180.0D / 3.1415927410125732D));
    }
    cj ☃ = new cj(d, e, f);
    alz ☃ = o.p(☃);
    afh ☃ = ☃.c();
    if (☃.t() != arm.a)
    {
      ☃.a(o, ☃);
      aug ☃ = ☃.a(o, ☃, ☃);
      if ((☃ != null) && (☃.a(new aui(s, t, u)))) {
        i = true;
      }
    }
    if (b > 0) {
      b -= 1;
    }
    if (i)
    {
      int ☃ = ☃.c(☃);
      if ((☃ != g) || (☃ != h))
      {
        i = false;
        
        v *= V.nextFloat() * 0.2F;
        w *= V.nextFloat() * 0.2F;
        x *= V.nextFloat() * 0.2F;
        ar = 0;
        as = 0;
      }
      else
      {
        ar += 1;
        if (ar >= 1200) {
          J();
        }
      }
      return;
    }
    as += 1;
    
    aui ☃ = new aui(s, t, u);
    aui ☃ = new aui(s + v, t + w, u + x);
    auh ☃ = o.a(☃, ☃, false, true, false);
    
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
      if ((☃.ad()) && ((☃ != c) || (as >= 5)))
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
    if ((☃ != null) && (d != null) && ((d instanceof wn)))
    {
      wn ☃ = (wn)d;
      if ((bA.a) || (((c instanceof wn)) && (!((wn)c).a(☃)))) {
        ☃ = null;
      }
    }
    if (☃ != null) {
      if (d != null)
      {
        float ☃ = ns.a(v * v + w * w + x * x);
        int ☃ = ns.f(☃ * at);
        if (l()) {
          ☃ += V.nextInt(☃ / 2 + 2);
        }
        ow ☃;
        ow ☃;
        if (c == null) {
          ☃ = ow.a(this, this);
        } else {
          ☃ = ow.a(this, c);
        }
        if ((at()) && (!(d instanceof vo))) {
          d.e(5);
        }
        if (d.a(☃, ☃))
        {
          if ((d instanceof pr))
          {
            pr ☃ = (pr)d;
            if (!o.D) {
              ☃.o(☃.bv() + 1);
            }
            if (au > 0)
            {
              float ☃ = ns.a(v * v + x * x);
              if (☃ > 0.0F) {
                d.g(v * au * 0.6000000238418579D / ☃, 0.1D, x * au * 0.6000000238418579D / ☃);
              }
            }
            if ((c instanceof pr))
            {
              ack.a(☃, c);
              ack.b((pr)c, ☃);
            }
            if ((c != null) && (d != c) && ((d instanceof wn)) && ((c instanceof lf))) {
              c).a.a(new gm(6, 0.0F));
            }
          }
          a("random.bowhit", 1.0F, 1.2F / (V.nextFloat() * 0.2F + 0.9F));
          if (!(d instanceof vo)) {
            J();
          }
        }
        else
        {
          v *= -0.10000000149011612D;
          w *= -0.10000000149011612D;
          x *= -0.10000000149011612D;
          y += 180.0F;
          A += 180.0F;
          as = 0;
        }
      }
      else
      {
        cj ☃ = ☃.a();
        d = ☃.n();
        e = ☃.o();
        f = ☃.p();
        alz ☃ = o.p(☃);
        g = ☃.c();
        h = g.c(☃);
        v = ((float)(c.a - s));
        w = ((float)(c.b - t));
        x = ((float)(c.c - u));
        float ☃ = ns.a(v * v + w * w + x * x);
        s -= v / ☃ * 0.05000000074505806D;
        t -= w / ☃ * 0.05000000074505806D;
        u -= x / ☃ * 0.05000000074505806D;
        
        a("random.bowhit", 1.0F, 1.2F / (V.nextFloat() * 0.2F + 0.9F));
        i = true;
        b = 7;
        a(false);
        if (g.t() != arm.a) {
          g.a(o, ☃, ☃, this);
        }
      }
    }
    if (l()) {
      for (int ☃ = 0; ☃ < 4; ☃++) {
        o.a(cy.j, s + v * ☃ / 4.0D, t + w * ☃ / 4.0D, u + x * ☃ / 4.0D, -v, -w + 0.2D, -x, new int[0]);
      }
    }
    s += v;
    t += w;
    u += x;
    
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
    
    float ☃ = 0.99F;
    float ☃ = 0.05F;
    if (V())
    {
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        float ☃ = 0.25F;
        o.a(cy.e, s - v * ☃, t - w * ☃, u - x * ☃, v, w, x, new int[0]);
      }
      ☃ = 0.6F;
    }
    if (U()) {
      N();
    }
    v *= ☃;
    w *= ☃;
    x *= ☃;
    w -= ☃;
    
    b(s, t, u);
    
    Q();
  }
  
  public void b(dn ☃)
  {
    ☃.a("xTile", (short)d);
    ☃.a("yTile", (short)e);
    ☃.a("zTile", (short)f);
    ☃.a("life", (short)ar);
    jy ☃ = (jy)afh.c.c(g);
    ☃.a("inTile", ☃ == null ? "" : ☃.toString());
    ☃.a("inData", (byte)h);
    ☃.a("shake", (byte)b);
    ☃.a("inGround", (byte)(i ? 1 : 0));
    ☃.a("pickup", (byte)a);
    ☃.a("damage", at);
  }
  
  public void a(dn ☃)
  {
    d = ☃.e("xTile");
    e = ☃.e("yTile");
    f = ☃.e("zTile");
    ar = ☃.e("life");
    if (☃.b("inTile", 8)) {
      g = afh.b(☃.j("inTile"));
    } else {
      g = afh.c(☃.d("inTile") & 0xFF);
    }
    h = (☃.d("inData") & 0xFF);
    b = (☃.d("shake") & 0xFF);
    i = (☃.d("inGround") == 1);
    if (☃.b("damage", 99)) {
      at = ☃.i("damage");
    }
    if (☃.b("pickup", 99)) {
      a = ☃.d("pickup");
    } else if (☃.b("player", 99)) {
      a = (☃.n("player") ? 1 : 0);
    }
  }
  
  public void d(wn ☃)
  {
    if ((o.D) || (!i) || (b > 0)) {
      return;
    }
    boolean ☃ = (a == 1) || ((a == 2) && (bA.d));
    if ((a == 1) && 
      (!bi.a(new zx(zy.g, 1)))) {
      ☃ = false;
    }
    if (☃)
    {
      a("random.pop", 0.2F, ((V.nextFloat() - V.nextFloat()) * 0.7F + 1.0F) * 2.0F);
      ☃.a(this, 1);
      J();
    }
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  public void b(double ☃)
  {
    at = ☃;
  }
  
  public double j()
  {
    return at;
  }
  
  public void a(int ☃)
  {
    au = ☃;
  }
  
  public boolean aD()
  {
    return false;
  }
  
  public float aS()
  {
    return 0.0F;
  }
  
  public void a(boolean ☃)
  {
    byte ☃ = ac.a(16);
    if (☃) {
      ac.b(16, Byte.valueOf((byte)(☃ | 0x1)));
    } else {
      ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFFE)));
    }
  }
  
  public boolean l()
  {
    byte ☃ = ac.a(16);
    return (☃ & 0x1) != 0;
  }
}
