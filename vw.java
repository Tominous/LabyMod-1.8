import java.util.List;
import java.util.Random;
import java.util.UUID;

public class vw
  extends we
{
  private static final UUID b = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
  private static final qd c = new qd(b, "Attacking speed boost", 0.05D, 0).a(false);
  private int bm;
  private int bn;
  private UUID bo;
  
  public vw(adm ☃)
  {
    super(☃);
    ab = true;
  }
  
  public void b(pr ☃)
  {
    super.b(☃);
    if (☃ != null) {
      bo = ☃.aK();
    }
  }
  
  protected void n()
  {
    bi.a(1, new vw.b(this));
    bi.a(2, new vw.a(this));
  }
  
  protected void aX()
  {
    super.aX();
    
    a(a).a(0.0D);
    a(vy.d).a(0.23000000417232513D);
    a(vy.e).a(5.0D);
  }
  
  public void t_()
  {
    super.t_();
  }
  
  protected void E()
  {
    qc ☃ = a(vy.d);
    if (cm())
    {
      if ((!j_()) && (!☃.a(c))) {
        ☃.b(c);
      }
      bm -= 1;
    }
    else if (☃.a(c))
    {
      ☃.c(c);
    }
    if ((bn > 0) && 
      (--bn == 0)) {
      a("mob.zombiepig.zpigangry", bB() * 2.0F, ((V.nextFloat() - V.nextFloat()) * 0.2F + 1.0F) * 1.8F);
    }
    if ((bm > 0) && 
      (bo != null) && (bd() == null))
    {
      wn ☃ = o.b(bo);
      b(☃);
      aN = ☃;
      aO = be();
    }
    super.E();
  }
  
  public boolean bR()
  {
    return o.aa() != oj.a;
  }
  
  public boolean bS()
  {
    return (o.a(aR(), this)) && (o.a(this, aR()).isEmpty()) && (!o.d(aR()));
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("Anger", (short)bm);
    if (bo != null) {
      ☃.a("HurtBy", bo.toString());
    } else {
      ☃.a("HurtBy", "");
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    bm = ☃.e("Anger");
    String ☃ = ☃.j("HurtBy");
    if (☃.length() > 0)
    {
      bo = UUID.fromString(☃);
      
      wn ☃ = o.b(bo);
      b(☃);
      if (☃ != null)
      {
        aN = ☃;
        aO = be();
      }
    }
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    pk ☃ = ☃.j();
    if ((☃ instanceof wn)) {
      b(☃);
    }
    return super.a(☃, ☃);
  }
  
  private void b(pk ☃)
  {
    bm = (400 + V.nextInt(400));
    bn = V.nextInt(40);
    if ((☃ instanceof pr)) {
      b((pr)☃);
    }
  }
  
  public boolean cm()
  {
    return bm > 0;
  }
  
  protected String z()
  {
    return "mob.zombiepig.zpig";
  }
  
  protected String bo()
  {
    return "mob.zombiepig.zpighurt";
  }
  
  protected String bp()
  {
    return "mob.zombiepig.zpigdeath";
  }
  
  protected void b(boolean ☃, int ☃)
  {
    int ☃ = V.nextInt(2 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.bt, 1);
    }
    ☃ = V.nextInt(2 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.bx, 1);
    }
  }
  
  public boolean a(wn ☃)
  {
    return false;
  }
  
  protected void bq()
  {
    a(zy.k, 1);
  }
  
  protected void a(ok ☃)
  {
    c(0, new zx(zy.B));
  }
  
  public pu a(ok ☃, pu ☃)
  {
    super.a(☃, ☃);
    m(false);
    return ☃;
  }
  
  static class b
    extends sm
  {
    public b(vw ☃)
    {
      super(true, new Class[0]);
    }
    
    protected void a(py ☃, pr ☃)
    {
      super.a(☃, ☃);
      if ((☃ instanceof vw)) {
        vw.a((vw)☃, ☃);
      }
    }
  }
  
  static class a
    extends sp<wn>
  {
    public a(vw ☃)
    {
      super(wn.class, true);
    }
    
    public boolean a()
    {
      return (((vw)e).cm()) && (super.a());
    }
  }
}
