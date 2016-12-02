import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class uy
  extends pk
{
  private alz d;
  public int a;
  public boolean b = true;
  private boolean e;
  private boolean f;
  private int g = 40;
  private float h = 2.0F;
  public dn c;
  
  public uy(adm ☃)
  {
    super(☃);
  }
  
  public uy(adm ☃, double ☃, double ☃, double ☃, alz ☃)
  {
    super(☃);
    d = ☃;
    k = true;
    a(0.98F, 0.98F);
    b(☃, ☃, ☃);
    
    v = 0.0D;
    w = 0.0D;
    x = 0.0D;
    
    p = ☃;
    q = ☃;
    r = ☃;
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  protected void h() {}
  
  public boolean ad()
  {
    return !I;
  }
  
  public void t_()
  {
    afh ☃ = d.c();
    if (☃.t() == arm.a)
    {
      J();
      return;
    }
    p = s;
    q = t;
    r = u;
    if (a++ == 0)
    {
      cj ☃ = new cj(this);
      if (o.p(☃).c() == ☃)
      {
        o.g(☃);
      }
      else if (!o.D)
      {
        J();
        return;
      }
    }
    w -= 0.03999999910593033D;
    d(v, w, x);
    v *= 0.9800000190734863D;
    w *= 0.9800000190734863D;
    x *= 0.9800000190734863D;
    if (!o.D)
    {
      cj ☃ = new cj(this);
      if (C)
      {
        v *= 0.699999988079071D;
        x *= 0.699999988079071D;
        w *= -0.5D;
        if (o.p(☃).c() != afi.M)
        {
          J();
          if (!e) {
            if ((o.a(☃, ☃, true, cq.b, null, null)) && (!agr.e(o, ☃.b())) && (o.a(☃, d, 3)))
            {
              if ((☃ instanceof agr)) {
                ((agr)☃).a_(o, ☃);
              }
              if ((c != null) && ((☃ instanceof agq)))
              {
                akw ☃ = o.s(☃);
                if (☃ != null)
                {
                  dn ☃ = new dn();
                  ☃.b(☃);
                  for (String ☃ : c.c())
                  {
                    eb ☃ = c.a(☃);
                    if ((!☃.equals("x")) && (!☃.equals("y")) && (!☃.equals("z"))) {
                      ☃.a(☃, ☃.b());
                    }
                  }
                  ☃.a(☃);
                  ☃.p_();
                }
              }
            }
            else if ((b) && (o.Q().b("doEntityDrops")))
            {
              a(new zx(☃, 1, ☃.a(d)), 0.0F);
            }
          }
        }
      }
      else if (((a > 100) && (!o.D) && ((☃.o() < 1) || (☃.o() > 256))) || (a > 600))
      {
        if ((b) && (o.Q().b("doEntityDrops"))) {
          a(new zx(☃, 1, ☃.a(d)), 0.0F);
        }
        J();
      }
    }
  }
  
  public void e(float ☃, float ☃)
  {
    afh ☃ = d.c();
    if (f)
    {
      int ☃ = ns.f(☃ - 1.0F);
      if (☃ > 0)
      {
        List<pk> ☃ = Lists.newArrayList(o.b(this, aR()));
        boolean ☃ = ☃ == afi.cf;
        ow ☃ = ☃ ? ow.n : ow.o;
        for (pk ☃ : ☃) {
          ☃.a(☃, Math.min(ns.d(☃ * h), g));
        }
        if ((☃) && (V.nextFloat() < 0.05000000074505806D + ☃ * 0.05D))
        {
          int ☃ = ((Integer)d.b(aez.b)).intValue();
          
          ☃++;
          if (☃ > 2) {
            e = true;
          } else {
            d = d.a(aez.b, Integer.valueOf(☃));
          }
        }
      }
    }
  }
  
  protected void b(dn ☃)
  {
    afh ☃ = d != null ? d.c() : afi.a;
    jy ☃ = (jy)afh.c.c(☃);
    ☃.a("Block", ☃ == null ? "" : ☃.toString());
    ☃.a("Data", (byte)☃.c(d));
    ☃.a("Time", (byte)a);
    ☃.a("DropItem", b);
    ☃.a("HurtEntities", f);
    ☃.a("FallHurtAmount", h);
    ☃.a("FallHurtMax", g);
    if (c != null) {
      ☃.a("TileEntityData", c);
    }
  }
  
  protected void a(dn ☃)
  {
    int ☃ = ☃.d("Data") & 0xFF;
    if (☃.b("Block", 8)) {
      d = afh.b(☃.j("Block")).a(☃);
    } else if (☃.b("TileID", 99)) {
      d = afh.c(☃.f("TileID")).a(☃);
    } else {
      d = afh.c(☃.d("Tile") & 0xFF).a(☃);
    }
    a = (☃.d("Time") & 0xFF);
    
    afh ☃ = d.c();
    if (☃.b("HurtEntities", 99))
    {
      f = ☃.n("HurtEntities");
      h = ☃.h("FallHurtAmount");
      g = ☃.f("FallHurtMax");
    }
    else if (☃ == afi.cf)
    {
      f = true;
    }
    if (☃.b("DropItem", 99)) {
      b = ☃.n("DropItem");
    }
    if (☃.b("TileEntityData", 10)) {
      c = ☃.m("TileEntityData");
    }
    if ((☃ == null) || (☃.t() == arm.a)) {
      d = afi.m.Q();
    }
  }
  
  public adm j()
  {
    return o;
  }
  
  public void a(boolean ☃)
  {
    f = ☃;
  }
  
  public boolean aJ()
  {
    return false;
  }
  
  public void a(c ☃)
  {
    super.a(☃);
    if (d != null)
    {
      afh ☃ = d.c();
      ☃.a("Immitating block ID", Integer.valueOf(afh.a(☃)));
      ☃.a("Immitating block data", Integer.valueOf(☃.c(d)));
    }
  }
  
  public alz l()
  {
    return d;
  }
}
