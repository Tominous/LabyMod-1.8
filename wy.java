import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class wy
  extends pk
  implements wv
{
  private int c = -1;
  private int d = -1;
  private int e = -1;
  private afh f;
  protected boolean a;
  public int b;
  private pr g;
  private String h;
  private int i;
  private int ar;
  
  public wy(adm ☃)
  {
    super(☃);
    a(0.25F, 0.25F);
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
  
  public wy(adm ☃, pr ☃)
  {
    super(☃);
    g = ☃;
    
    a(0.25F, 0.25F);
    
    b(s, t + ☃.aS(), u, y, z);
    
    s -= ns.b(y / 180.0F * 3.1415927F) * 0.16F;
    t -= 0.10000000149011612D;
    u -= ns.a(y / 180.0F * 3.1415927F) * 0.16F;
    b(s, t, u);
    
    float ☃ = 0.4F;
    v = (-ns.a(y / 180.0F * 3.1415927F) * ns.b(z / 180.0F * 3.1415927F) * ☃);
    x = (ns.b(y / 180.0F * 3.1415927F) * ns.b(z / 180.0F * 3.1415927F) * ☃);
    w = (-ns.a((z + l()) / 180.0F * 3.1415927F) * ☃);
    
    c(v, w, x, j(), 1.0F);
  }
  
  public wy(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    i = 0;
    
    a(0.25F, 0.25F);
    
    b(☃, ☃, ☃);
  }
  
  protected float j()
  {
    return 1.5F;
  }
  
  protected float l()
  {
    return 0.0F;
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
    i = 0;
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
    }
  }
  
  public void t_()
  {
    P = s;
    Q = t;
    R = u;
    super.t_();
    if (b > 0) {
      b -= 1;
    }
    if (a)
    {
      if (o.p(new cj(c, d, e)).c() == f)
      {
        i += 1;
        if (i == 1200) {
          J();
        }
        return;
      }
      a = false;
      
      v *= V.nextFloat() * 0.2F;
      w *= V.nextFloat() * 0.2F;
      x *= V.nextFloat() * 0.2F;
      i = 0;
      ar = 0;
    }
    else
    {
      ar += 1;
    }
    aui ☃ = new aui(s, t, u);
    aui ☃ = new aui(s + v, t + w, u + x);
    auh ☃ = o.a(☃, ☃);
    
    ☃ = new aui(s, t, u);
    ☃ = new aui(s + v, t + w, u + x);
    if (☃ != null) {
      ☃ = new aui(c.a, c.b, c.c);
    }
    if (!o.D)
    {
      pk ☃ = null;
      List<pk> ☃ = o.b(this, aR().a(v, w, x).b(1.0D, 1.0D, 1.0D));
      double ☃ = 0.0D;
      pr ☃ = n();
      for (int ☃ = 0; ☃ < ☃.size(); ☃++)
      {
        pk ☃ = (pk)☃.get(☃);
        if ((☃.ad()) && ((☃ != ☃) || (ar >= 5)))
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
    }
    if (☃ != null) {
      if ((a == auh.a.b) && (o.p(☃.a()).c() == afi.aY)) {
        d(☃.a());
      } else {
        a(☃);
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
    float ☃ = m();
    if (V())
    {
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        float ☃ = 0.25F;
        o.a(cy.e, s - v * ☃, t - w * ☃, u - x * ☃, v, w, x, new int[0]);
      }
      ☃ = 0.8F;
    }
    v *= ☃;
    w *= ☃;
    x *= ☃;
    w -= ☃;
    
    b(s, t, u);
  }
  
  protected float m()
  {
    return 0.03F;
  }
  
  protected abstract void a(auh paramauh);
  
  public void b(dn ☃)
  {
    ☃.a("xTile", (short)c);
    ☃.a("yTile", (short)d);
    ☃.a("zTile", (short)e);
    jy ☃ = (jy)afh.c.c(f);
    ☃.a("inTile", ☃ == null ? "" : ☃.toString());
    ☃.a("shake", (byte)b);
    ☃.a("inGround", (byte)(a ? 1 : 0));
    if (((h == null) || (h.length() == 0)) && ((g instanceof wn))) {
      h = g.e_();
    }
    ☃.a("ownerName", h == null ? "" : h);
  }
  
  public void a(dn ☃)
  {
    c = ☃.e("xTile");
    d = ☃.e("yTile");
    e = ☃.e("zTile");
    if (☃.b("inTile", 8)) {
      f = afh.b(☃.j("inTile"));
    } else {
      f = afh.c(☃.d("inTile") & 0xFF);
    }
    b = (☃.d("shake") & 0xFF);
    a = (☃.d("inGround") == 1);
    g = null;
    h = ☃.j("ownerName");
    if ((h != null) && (h.length() == 0)) {
      h = null;
    }
    g = n();
  }
  
  public pr n()
  {
    if ((g == null) && (h != null) && (h.length() > 0))
    {
      g = o.a(h);
      if ((g == null) && ((o instanceof le))) {
        try
        {
          pk ☃ = ((le)o).a(UUID.fromString(h));
          if ((☃ instanceof pr)) {
            g = ((pr)☃);
          }
        }
        catch (Throwable ☃)
        {
          g = null;
        }
      }
    }
    return g;
  }
}
