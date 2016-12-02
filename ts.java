import java.util.List;
import java.util.Random;
import java.util.UUID;

public class ts
  extends qa
{
  private qs<wn> bo;
  private sh bp;
  
  public ts(adm ☃)
  {
    super(☃);
    a(0.6F, 0.7F);
    
    ((sv)s()).a(true);
    i.a(1, new ra(this));
    i.a(2, bm);
    i.a(3, bp = new sh(this, 0.6D, zy.aU, true));
    i.a(5, new rb(this, 1.0D, 10.0F, 5.0F));
    i.a(6, new rs(this, 0.8D));
    i.a(7, new rh(this, 0.3F));
    i.a(8, new rr(this));
    i.a(9, new qv(this, 0.8D));
    i.a(10, new rz(this, 0.8D));
    i.a(11, new ri(this, wn.class, 10.0F));
    
    bi.a(1, new sq(this, tn.class, false, null));
  }
  
  protected void h()
  {
    super.h();
    
    ac.a(18, Byte.valueOf((byte)0));
  }
  
  public void E()
  {
    if (q().a())
    {
      double ☃ = q().b();
      if (☃ == 0.6D)
      {
        c(true);
        d(false);
      }
      else if (☃ == 1.33D)
      {
        c(false);
        d(true);
      }
      else
      {
        c(false);
        d(false);
      }
    }
    else
    {
      c(false);
      d(false);
    }
  }
  
  protected boolean C()
  {
    return (!cl()) && (W > 2400);
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(10.0D);
    a(vy.d).a(0.30000001192092896D);
  }
  
  public void e(float ☃, float ☃) {}
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("CatType", ct());
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    r(☃.f("CatType"));
  }
  
  protected String z()
  {
    if (cl())
    {
      if (cr()) {
        return "mob.cat.purr";
      }
      if (V.nextInt(4) == 0) {
        return "mob.cat.purreow";
      }
      return "mob.cat.meow";
    }
    return "";
  }
  
  protected String bo()
  {
    return "mob.cat.hitt";
  }
  
  protected String bp()
  {
    return "mob.cat.hitt";
  }
  
  protected float bB()
  {
    return 0.4F;
  }
  
  protected zw A()
  {
    return zy.aF;
  }
  
  public boolean r(pk ☃)
  {
    return ☃.a(ow.a(this), 3.0F);
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    bm.a(false);
    return super.a(☃, ☃);
  }
  
  protected void b(boolean ☃, int ☃) {}
  
  public boolean a(wn ☃)
  {
    zx ☃ = bi.h();
    if (cl())
    {
      if ((e(☃)) && 
        (!o.D) && (!d(☃))) {
        bm.a(!cn());
      }
    }
    else if ((bp.f()) && (☃ != null) && (☃.b() == zy.aU) && (☃.h(this) < 9.0D))
    {
      if (!bA.d) {
        b -= 1;
      }
      if (b <= 0) {
        bi.a(bi.c, null);
      }
      if (!o.D) {
        if (V.nextInt(3) == 0)
        {
          m(true);
          r(1 + o.s.nextInt(3));
          b(☃.aK().toString());
          l(true);
          bm.a(true);
          o.a(this, (byte)7);
        }
        else
        {
          l(false);
          o.a(this, (byte)6);
        }
      }
      return true;
    }
    return super.a(☃);
  }
  
  public ts b(ph ☃)
  {
    ts ☃ = new ts(o);
    if (cl())
    {
      ☃.b(b());
      ☃.m(true);
      ☃.r(ct());
    }
    return ☃;
  }
  
  public boolean d(zx ☃)
  {
    return (☃ != null) && (☃.b() == zy.aU);
  }
  
  public boolean a(tm ☃)
  {
    if (☃ == this) {
      return false;
    }
    if (!cl()) {
      return false;
    }
    if (!(☃ instanceof ts)) {
      return false;
    }
    ts ☃ = (ts)☃;
    if (!☃.cl()) {
      return false;
    }
    return (cr()) && (☃.cr());
  }
  
  public int ct()
  {
    return ac.a(18);
  }
  
  public void r(int ☃)
  {
    ac.b(18, Byte.valueOf((byte)☃));
  }
  
  public boolean bR()
  {
    if (o.s.nextInt(3) == 0) {
      return false;
    }
    return true;
  }
  
  public boolean bS()
  {
    if ((o.a(aR(), this)) && (o.a(this, aR()).isEmpty()) && (!o.d(aR())))
    {
      cj ☃ = new cj(s, aRb, u);
      if (☃.o() < o.F()) {
        return false;
      }
      afh ☃ = o.p(☃.b()).c();
      if ((☃ == afi.c) || (☃.t() == arm.j)) {
        return true;
      }
    }
    return false;
  }
  
  public String e_()
  {
    if (l_()) {
      return aM();
    }
    if (cl()) {
      return di.a("entity.Cat.name");
    }
    return super.e_();
  }
  
  public void m(boolean ☃)
  {
    super.m(☃);
  }
  
  protected void cm()
  {
    if (bo == null) {
      bo = new qs(this, wn.class, 16.0F, 0.8D, 1.33D);
    }
    i.a(bo);
    if (!cl()) {
      i.a(4, bo);
    }
  }
  
  public pu a(ok ☃, pu ☃)
  {
    ☃ = super.a(☃, ☃);
    if (o.s.nextInt(7) == 0) {
      for (int ☃ = 0; ☃ < 2; ☃++)
      {
        ts ☃ = new ts(o);
        ☃.b(s, t, u, y, 0.0F);
        ☃.b(41536);
        o.d(☃);
      }
    }
    return ☃;
  }
}
