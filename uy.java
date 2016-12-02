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
    this.d = ☃;
    this.k = true;
    a(0.98F, 0.98F);
    b(☃, ☃, ☃);
    
    this.v = 0.0D;
    this.w = 0.0D;
    this.x = 0.0D;
    
    this.p = ☃;
    this.q = ☃;
    this.r = ☃;
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  protected void h() {}
  
  public boolean ad()
  {
    return !this.I;
  }
  
  public void t_()
  {
    afh ☃ = this.d.c();
    if (☃.t() == arm.a)
    {
      J();
      return;
    }
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    if (this.a++ == 0)
    {
      cj ☃ = new cj(this);
      if (this.o.p(☃).c() == ☃)
      {
        this.o.g(☃);
      }
      else if (!this.o.D)
      {
        J();
        return;
      }
    }
    this.w -= 0.03999999910593033D;
    d(this.v, this.w, this.x);
    this.v *= 0.9800000190734863D;
    this.w *= 0.9800000190734863D;
    this.x *= 0.9800000190734863D;
    if (!this.o.D)
    {
      cj ☃ = new cj(this);
      if (this.C)
      {
        this.v *= 0.699999988079071D;
        this.x *= 0.699999988079071D;
        this.w *= -0.5D;
        if (this.o.p(☃).c() != afi.M)
        {
          J();
          if (!this.e) {
            if ((this.o.a(☃, ☃, true, cq.b, null, null)) && (!agr.e(this.o, ☃.b())) && (this.o.a(☃, this.d, 3)))
            {
              if ((☃ instanceof agr)) {
                ((agr)☃).a_(this.o, ☃);
              }
              if ((this.c != null) && ((☃ instanceof agq)))
              {
                akw ☃ = this.o.s(☃);
                if (☃ != null)
                {
                  dn ☃ = new dn();
                  ☃.b(☃);
                  for (String ☃ : this.c.c())
                  {
                    eb ☃ = this.c.a(☃);
                    if ((!☃.equals("x")) && (!☃.equals("y")) && (!☃.equals("z"))) {
                      ☃.a(☃, ☃.b());
                    }
                  }
                  ☃.a(☃);
                  ☃.p_();
                }
              }
            }
            else if ((this.b) && (this.o.Q().b("doEntityDrops")))
            {
              a(new zx(☃, 1, ☃.a(this.d)), 0.0F);
            }
          }
        }
      }
      else if (((this.a > 100) && (!this.o.D) && ((☃.o() < 1) || (☃.o() > 256))) || (this.a > 600))
      {
        if ((this.b) && (this.o.Q().b("doEntityDrops"))) {
          a(new zx(☃, 1, ☃.a(this.d)), 0.0F);
        }
        J();
      }
    }
  }
  
  public void e(float ☃, float ☃)
  {
    afh ☃ = this.d.c();
    if (this.f)
    {
      int ☃ = ns.f(☃ - 1.0F);
      if (☃ > 0)
      {
        List<pk> ☃ = Lists.newArrayList(this.o.b(this, aR()));
        boolean ☃ = ☃ == afi.cf;
        ow ☃ = ☃ ? ow.n : ow.o;
        for (pk ☃ : ☃) {
          ☃.a(☃, Math.min(ns.d(☃ * this.h), this.g));
        }
        if ((☃) && (this.V.nextFloat() < 0.05000000074505806D + ☃ * 0.05D))
        {
          int ☃ = ((Integer)this.d.b(aez.b)).intValue();
          
          ☃++;
          if (☃ > 2) {
            this.e = true;
          } else {
            this.d = this.d.a(aez.b, Integer.valueOf(☃));
          }
        }
      }
    }
  }
  
  protected void b(dn ☃)
  {
    afh ☃ = this.d != null ? this.d.c() : afi.a;
    jy ☃ = (jy)afh.c.c(☃);
    ☃.a("Block", ☃ == null ? "" : ☃.toString());
    ☃.a("Data", (byte)☃.c(this.d));
    ☃.a("Time", (byte)this.a);
    ☃.a("DropItem", this.b);
    ☃.a("HurtEntities", this.f);
    ☃.a("FallHurtAmount", this.h);
    ☃.a("FallHurtMax", this.g);
    if (this.c != null) {
      ☃.a("TileEntityData", this.c);
    }
  }
  
  protected void a(dn ☃)
  {
    int ☃ = ☃.d("Data") & 0xFF;
    if (☃.b("Block", 8)) {
      this.d = afh.b(☃.j("Block")).a(☃);
    } else if (☃.b("TileID", 99)) {
      this.d = afh.c(☃.f("TileID")).a(☃);
    } else {
      this.d = afh.c(☃.d("Tile") & 0xFF).a(☃);
    }
    this.a = (☃.d("Time") & 0xFF);
    
    afh ☃ = this.d.c();
    if (☃.b("HurtEntities", 99))
    {
      this.f = ☃.n("HurtEntities");
      this.h = ☃.h("FallHurtAmount");
      this.g = ☃.f("FallHurtMax");
    }
    else if (☃ == afi.cf)
    {
      this.f = true;
    }
    if (☃.b("DropItem", 99)) {
      this.b = ☃.n("DropItem");
    }
    if (☃.b("TileEntityData", 10)) {
      this.c = ☃.m("TileEntityData");
    }
    if ((☃ == null) || (☃.t() == arm.a)) {
      this.d = afi.m.Q();
    }
  }
  
  public adm j()
  {
    return this.o;
  }
  
  public void a(boolean ☃)
  {
    this.f = ☃;
  }
  
  public boolean aJ()
  {
    return false;
  }
  
  public void a(c ☃)
  {
    super.a(☃);
    if (this.d != null)
    {
      afh ☃ = this.d.c();
      ☃.a("Immitating block ID", Integer.valueOf(afh.a(☃)));
      ☃.a("Immitating block data", Integer.valueOf(☃.c(this.d)));
    }
  }
  
  public alz l()
  {
    return this.d;
  }
}
