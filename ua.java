import com.google.common.base.Predicate;
import java.util.Random;
import java.util.UUID;

public class ua
  extends qa
{
  private float bo;
  private float bp;
  private boolean bq;
  private boolean br;
  private float bs;
  private float bt;
  
  public ua(adm ☃)
  {
    super(☃);
    a(0.6F, 0.8F);
    
    ((sv)s()).a(true);
    i.a(1, new ra(this));
    i.a(2, bm);
    i.a(3, new rh(this, 0.4F));
    i.a(4, new rl(this, 1.0D, true));
    i.a(5, new rb(this, 1.0D, 10.0F, 2.0F));
    i.a(6, new qv(this, 1.0D));
    i.a(7, new rz(this, 1.0D));
    i.a(8, new qt(this, 8.0F));
    i.a(9, new ri(this, wn.class, 8.0F));
    i.a(9, new ry(this));
    
    bi.a(1, new sr(this));
    bi.a(2, new ss(this));
    bi.a(3, new sm(this, true, new Class[0]));
    bi.a(4, new sq(this, tm.class, false, new Predicate()
    {
      public boolean a(pk ☃)
      {
        return ((☃ instanceof tv)) || ((☃ instanceof tu));
      }
    }));
    bi.a(5, new sp(this, wa.class, false));
    
    m(false);
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.d).a(0.30000001192092896D);
    if (cl()) {
      a(vy.a).a(20.0D);
    } else {
      a(vy.a).a(8.0D);
    }
    by().b(vy.e);
    a(vy.e).a(2.0D);
  }
  
  public void d(pr ☃)
  {
    super.d(☃);
    if (☃ == null) {
      o(false);
    } else if (!cl()) {
      o(true);
    }
  }
  
  protected void E()
  {
    ac.b(18, Float.valueOf(bn()));
  }
  
  protected void h()
  {
    super.h();
    ac.a(18, new Float(bn()));
    ac.a(19, new Byte((byte)0));
    ac.a(20, new Byte((byte)zd.o.a()));
  }
  
  protected void a(cj ☃, afh ☃)
  {
    a("mob.wolf.step", 0.15F, 1.0F);
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("Angry", cv());
    ☃.a("CollarColor", (byte)cw().b());
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    o(☃.n("Angry"));
    if (☃.b("CollarColor", 99)) {
      a(zd.a(☃.d("CollarColor")));
    }
  }
  
  protected String z()
  {
    if (cv()) {
      return "mob.wolf.growl";
    }
    if (V.nextInt(3) == 0)
    {
      if ((cl()) && (ac.d(18) < 10.0F)) {
        return "mob.wolf.whine";
      }
      return "mob.wolf.panting";
    }
    return "mob.wolf.bark";
  }
  
  protected String bo()
  {
    return "mob.wolf.hurt";
  }
  
  protected String bp()
  {
    return "mob.wolf.death";
  }
  
  protected float bB()
  {
    return 0.4F;
  }
  
  protected zw A()
  {
    return zw.b(-1);
  }
  
  public void m()
  {
    super.m();
    if ((!o.D) && (bq) && (!br) && (!cf()) && (C))
    {
      br = true;
      bs = 0.0F;
      bt = 0.0F;
      o.a(this, (byte)8);
    }
    if ((!o.D) && (u() == null) && (cv())) {
      o(false);
    }
  }
  
  public void t_()
  {
    super.t_();
    
    bp = bo;
    if (cx()) {
      bo += (1.0F - bo) * 0.4F;
    } else {
      bo += (0.0F - bo) * 0.4F;
    }
    if (U())
    {
      bq = true;
      br = false;
      bs = 0.0F;
      bt = 0.0F;
    }
    else if (((bq) || (br)) && 
      (br))
    {
      if (bs == 0.0F) {
        a("mob.wolf.shake", bB(), (V.nextFloat() - V.nextFloat()) * 0.2F + 1.0F);
      }
      bt = bs;
      bs += 0.05F;
      if (bt >= 2.0F)
      {
        bq = false;
        br = false;
        bt = 0.0F;
        bs = 0.0F;
      }
      if (bs > 0.4F)
      {
        float ☃ = (float)aRb;
        int ☃ = (int)(ns.a((bs - 0.4F) * 3.1415927F) * 7.0F);
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          float ☃ = (V.nextFloat() * 2.0F - 1.0F) * J * 0.5F;
          float ☃ = (V.nextFloat() * 2.0F - 1.0F) * J * 0.5F;
          o.a(cy.f, s + ☃, ☃ + 0.8F, u + ☃, v, w, x, new int[0]);
        }
      }
    }
  }
  
  public boolean ct()
  {
    return bq;
  }
  
  public float p(float ☃)
  {
    return 0.75F + (bt + (bs - bt) * ☃) / 2.0F * 0.25F;
  }
  
  public float i(float ☃, float ☃)
  {
    float ☃ = (bt + (bs - bt) * ☃ + ☃) / 1.8F;
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    } else if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    return ns.a(☃ * 3.1415927F) * ns.a(☃ * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
  }
  
  public float q(float ☃)
  {
    return (bp + (bo - bp) * ☃) * 0.15F * 3.1415927F;
  }
  
  public float aS()
  {
    return K * 0.8F;
  }
  
  public int bQ()
  {
    if (cn()) {
      return 20;
    }
    return super.bQ();
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    pk ☃ = ☃.j();
    bm.a(false);
    if ((☃ != null) && (!(☃ instanceof wn)) && (!(☃ instanceof wq))) {
      ☃ = (☃ + 1.0F) / 2.0F;
    }
    return super.a(☃, ☃);
  }
  
  public boolean r(pk ☃)
  {
    boolean ☃ = ☃.a(ow.a(this), (int)a(vy.e).e());
    if (☃) {
      a(this, ☃);
    }
    return ☃;
  }
  
  public void m(boolean ☃)
  {
    super.m(☃);
    if (☃) {
      a(vy.a).a(20.0D);
    } else {
      a(vy.a).a(8.0D);
    }
    a(vy.e).a(4.0D);
  }
  
  public boolean a(wn ☃)
  {
    zx ☃ = bi.h();
    if (cl())
    {
      if (☃ != null) {
        if ((☃.b() instanceof zs))
        {
          zs ☃ = (zs)☃.b();
          if ((☃.g()) && (ac.d(18) < 20.0F))
          {
            if (!bA.d) {
              b -= 1;
            }
            h(☃.h(☃));
            if (b <= 0) {
              bi.a(bi.c, null);
            }
            return true;
          }
        }
        else if (☃.b() == zy.aW)
        {
          zd ☃ = zd.a(☃.i());
          if (☃ != cw())
          {
            a(☃);
            if (!bA.d) {
              if (--b <= 0) {
                bi.a(bi.c, null);
              }
            }
            return true;
          }
        }
      }
      if ((e(☃)) && 
        (!o.D) && (!d(☃)))
      {
        bm.a(!cn());
        aY = false;
        h.n();
        d(null);
      }
    }
    else if ((☃ != null) && (☃.b() == zy.aX) && (!cv()))
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
          h.n();
          d(null);
          bm.a(true);
          i(20.0F);
          b(☃.aK().toString());
          l(true);
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
  
  public void a(byte ☃)
  {
    if (☃ == 8)
    {
      br = true;
      bs = 0.0F;
      bt = 0.0F;
    }
    else
    {
      super.a(☃);
    }
  }
  
  public float cu()
  {
    if (cv()) {
      return 1.5393804F;
    }
    if (cl()) {
      return (0.55F - (20.0F - ac.d(18)) * 0.02F) * 3.1415927F;
    }
    return 0.62831855F;
  }
  
  public boolean d(zx ☃)
  {
    if (☃ == null) {
      return false;
    }
    if (!(☃.b() instanceof zs)) {
      return false;
    }
    return ((zs)☃.b()).g();
  }
  
  public int bV()
  {
    return 8;
  }
  
  public boolean cv()
  {
    return (ac.a(16) & 0x2) != 0;
  }
  
  public void o(boolean ☃)
  {
    byte ☃ = ac.a(16);
    if (☃) {
      ac.b(16, Byte.valueOf((byte)(☃ | 0x2)));
    } else {
      ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFFD)));
    }
  }
  
  public zd cw()
  {
    return zd.a(ac.a(20) & 0xF);
  }
  
  public void a(zd ☃)
  {
    ac.b(20, Byte.valueOf((byte)(☃.b() & 0xF)));
  }
  
  public ua b(ph ☃)
  {
    ua ☃ = new ua(o);
    String ☃ = b();
    if ((☃ != null) && (☃.trim().length() > 0))
    {
      ☃.b(☃);
      ☃.m(true);
    }
    return ☃;
  }
  
  public void p(boolean ☃)
  {
    if (☃) {
      ac.b(19, Byte.valueOf((byte)1));
    } else {
      ac.b(19, Byte.valueOf((byte)0));
    }
  }
  
  public boolean a(tm ☃)
  {
    if (☃ == this) {
      return false;
    }
    if (!cl()) {
      return false;
    }
    if (!(☃ instanceof ua)) {
      return false;
    }
    ua ☃ = (ua)☃;
    if (!☃.cl()) {
      return false;
    }
    if (☃.cn()) {
      return false;
    }
    return (cr()) && (☃.cr());
  }
  
  public boolean cx()
  {
    return ac.a(19) == 1;
  }
  
  protected boolean C()
  {
    return (!cl()) && (W > 2400);
  }
  
  public boolean a(pr ☃, pr ☃)
  {
    if (((☃ instanceof vn)) || ((☃ instanceof vr))) {
      return false;
    }
    if ((☃ instanceof ua))
    {
      ua ☃ = (ua)☃;
      if ((☃.cl()) && (☃.co() == ☃)) {
        return false;
      }
    }
    if (((☃ instanceof wn)) && ((☃ instanceof wn)) && (!((wn)☃).a((wn)☃))) {
      return false;
    }
    if (((☃ instanceof tp)) && (((tp)☃).co())) {
      return false;
    }
    return true;
  }
  
  public boolean cb()
  {
    return (!cv()) && (super.cb());
  }
}
