import java.util.List;
import java.util.Random;

public abstract class ws
  extends pk
{
  private int e = -1;
  private int f = -1;
  private int g = -1;
  private afh h;
  private boolean i;
  public pr a;
  private int ar;
  private int as;
  public double b;
  public double c;
  public double d;
  
  public ws(adm ☃)
  {
    super(☃);
    a(1.0F, 1.0F);
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
  
  public ws(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    a(1.0F, 1.0F);
    
    b(☃, ☃, ☃, y, z);
    b(☃, ☃, ☃);
    
    double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
    b = (☃ / ☃ * 0.1D);
    c = (☃ / ☃ * 0.1D);
    d = (☃ / ☃ * 0.1D);
  }
  
  public ws(adm ☃, pr ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    a = ☃;
    
    a(1.0F, 1.0F);
    
    b(s, t, u, y, z);
    b(s, t, u);
    
    v = (w = x = 0.0D);
    
    ☃ += V.nextGaussian() * 0.4D;
    ☃ += V.nextGaussian() * 0.4D;
    ☃ += V.nextGaussian() * 0.4D;
    double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
    b = (☃ / ☃ * 0.1D);
    c = (☃ / ☃ * 0.1D);
    d = (☃ / ☃ * 0.1D);
  }
  
  public void t_()
  {
    if ((!o.D) && (((a != null) && (a.I)) || (!o.e(new cj(this)))))
    {
      J();
      return;
    }
    super.t_();
    e(1);
    if (i)
    {
      if (o.p(new cj(e, f, g)).c() == h)
      {
        ar += 1;
        if (ar == 600) {
          J();
        }
        return;
      }
      i = false;
      
      v *= V.nextFloat() * 0.2F;
      w *= V.nextFloat() * 0.2F;
      x *= V.nextFloat() * 0.2F;
      ar = 0;
      as = 0;
    }
    else
    {
      as += 1;
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
      if ((☃.ad()) && ((!☃.k(a)) || (as >= 25)))
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
      a(☃);
    }
    s += v;
    t += w;
    u += x;
    
    float ☃ = ns.a(v * v + x * x);
    y = ((float)(ns.b(x, v) * 180.0D / 3.1415927410125732D) + 90.0F);
    z = ((float)(ns.b(☃, w) * 180.0D / 3.1415927410125732D) - 90.0F);
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
    
    float ☃ = j();
    if (V())
    {
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        float ☃ = 0.25F;
        o.a(cy.e, s - v * ☃, t - w * ☃, u - x * ☃, v, w, x, new int[0]);
      }
      ☃ = 0.8F;
    }
    v += b;
    w += c;
    x += d;
    v *= ☃;
    w *= ☃;
    x *= ☃;
    
    o.a(cy.l, s, t + 0.5D, u, 0.0D, 0.0D, 0.0D, new int[0]);
    
    b(s, t, u);
  }
  
  protected float j()
  {
    return 0.95F;
  }
  
  protected abstract void a(auh paramauh);
  
  public void b(dn ☃)
  {
    ☃.a("xTile", (short)e);
    ☃.a("yTile", (short)f);
    ☃.a("zTile", (short)g);
    jy ☃ = (jy)afh.c.c(h);
    ☃.a("inTile", ☃ == null ? "" : ☃.toString());
    ☃.a("inGround", (byte)(i ? 1 : 0));
    ☃.a("direction", a(new double[] { v, w, x }));
  }
  
  public void a(dn ☃)
  {
    e = ☃.e("xTile");
    f = ☃.e("yTile");
    g = ☃.e("zTile");
    if (☃.b("inTile", 8)) {
      h = afh.b(☃.j("inTile"));
    } else {
      h = afh.c(☃.d("inTile") & 0xFF);
    }
    i = (☃.d("inGround") == 1);
    if (☃.b("direction", 9))
    {
      du ☃ = ☃.c("direction", 6);
      v = ☃.d(0);
      w = ☃.d(1);
      x = ☃.d(2);
    }
    else
    {
      J();
    }
  }
  
  public boolean ad()
  {
    return true;
  }
  
  public float ao()
  {
    return 1.0F;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    ac();
    if (☃.j() != null)
    {
      aui ☃ = ☃.j().ap();
      if (☃ != null)
      {
        v = a;
        w = b;
        x = c;
        b = (v * 0.1D);
        c = (w * 0.1D);
        d = (x * 0.1D);
      }
      if ((☃.j() instanceof pr)) {
        a = ((pr)☃.j());
      }
      return true;
    }
    return false;
  }
  
  public float c(float ☃)
  {
    return 1.0F;
  }
  
  public int b(float ☃)
  {
    return 15728880;
  }
}
