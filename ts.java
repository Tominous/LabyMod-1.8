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
    this.i.a(1, new ra(this));
    this.i.a(2, this.bm);
    this.i.a(3, this.bp = new sh(this, 0.6D, zy.aU, true));
    this.i.a(5, new rb(this, 1.0D, 10.0F, 5.0F));
    this.i.a(6, new rs(this, 0.8D));
    this.i.a(7, new rh(this, 0.3F));
    this.i.a(8, new rr(this));
    this.i.a(9, new qv(this, 0.8D));
    this.i.a(10, new rz(this, 0.8D));
    this.i.a(11, new ri(this, wn.class, 10.0F));
    
    this.bi.a(1, new sq(this, tn.class, false, null));
  }
  
  protected void h()
  {
    super.h();
    
    this.ac.a(18, Byte.valueOf((byte)0));
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
    return (!cl()) && (this.W > 2400);
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
      if (this.V.nextInt(4) == 0) {
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
    this.bm.a(false);
    return super.a(☃, ☃);
  }
  
  protected void b(boolean ☃, int ☃) {}
  
  public boolean a(wn ☃)
  {
    zx ☃ = ☃.bi.h();
    if (cl())
    {
      if ((e(☃)) && 
        (!this.o.D) && (!d(☃))) {
        this.bm.a(!cn());
      }
    }
    else if ((this.bp.f()) && (☃ != null) && (☃.b() == zy.aU) && (☃.h(this) < 9.0D))
    {
      if (!☃.bA.d) {
        ☃.b -= 1;
      }
      if (☃.b <= 0) {
        ☃.bi.a(☃.bi.c, null);
      }
      if (!this.o.D) {
        if (this.V.nextInt(3) == 0)
        {
          m(true);
          r(1 + this.o.s.nextInt(3));
          b(☃.aK().toString());
          l(true);
          this.bm.a(true);
          this.o.a(this, (byte)7);
        }
        else
        {
          l(false);
          this.o.a(this, (byte)6);
        }
      }
      return true;
    }
    return super.a(☃);
  }
  
  public ts b(ph ☃)
  {
    ts ☃ = new ts(this.o);
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
    return this.ac.a(18);
  }
  
  public void r(int ☃)
  {
    this.ac.b(18, Byte.valueOf((byte)☃));
  }
  
  public boolean bR()
  {
    if (this.o.s.nextInt(3) == 0) {
      return false;
    }
    return true;
  }
  
  public boolean bS()
  {
    if ((this.o.a(aR(), this)) && (this.o.a(this, aR()).isEmpty()) && (!this.o.d(aR())))
    {
      cj ☃ = new cj(this.s, aR().b, this.u);
      if (☃.o() < this.o.F()) {
        return false;
      }
      afh ☃ = this.o.p(☃.b()).c();
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
    if (this.bo == null) {
      this.bo = new qs(this, wn.class, 16.0F, 0.8D, 1.33D);
    }
    this.i.a(this.bo);
    if (!cl()) {
      this.i.a(4, this.bo);
    }
  }
  
  public pu a(ok ☃, pu ☃)
  {
    ☃ = super.a(☃, ☃);
    if (this.o.s.nextInt(7) == 0) {
      for (int ☃ = 0; ☃ < 2; ☃++)
      {
        ts ☃ = new ts(this.o);
        ☃.b(this.s, this.t, this.u, this.y, 0.0F);
        ☃.b(41536);
        this.o.d(☃);
      }
    }
    return ☃;
  }
}
