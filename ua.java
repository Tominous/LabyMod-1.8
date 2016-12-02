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
    this.i.a(1, new ra(this));
    this.i.a(2, this.bm);
    this.i.a(3, new rh(this, 0.4F));
    this.i.a(4, new rl(this, 1.0D, true));
    this.i.a(5, new rb(this, 1.0D, 10.0F, 2.0F));
    this.i.a(6, new qv(this, 1.0D));
    this.i.a(7, new rz(this, 1.0D));
    this.i.a(8, new qt(this, 8.0F));
    this.i.a(9, new ri(this, wn.class, 8.0F));
    this.i.a(9, new ry(this));
    
    this.bi.a(1, new sr(this));
    this.bi.a(2, new ss(this));
    this.bi.a(3, new sm(this, true, new Class[0]));
    this.bi.a(4, new sq(this, tm.class, false, new Predicate()
    {
      public boolean a(pk ☃)
      {
        return ((☃ instanceof tv)) || ((☃ instanceof tu));
      }
    }));
    this.bi.a(5, new sp(this, wa.class, false));
    
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
    this.ac.b(18, Float.valueOf(bn()));
  }
  
  protected void h()
  {
    super.h();
    this.ac.a(18, new Float(bn()));
    this.ac.a(19, new Byte((byte)0));
    this.ac.a(20, new Byte((byte)zd.o.a()));
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
    if (this.V.nextInt(3) == 0)
    {
      if ((cl()) && (this.ac.d(18) < 10.0F)) {
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
    if ((!this.o.D) && (this.bq) && (!this.br) && (!cf()) && (this.C))
    {
      this.br = true;
      this.bs = 0.0F;
      this.bt = 0.0F;
      this.o.a(this, (byte)8);
    }
    if ((!this.o.D) && (u() == null) && (cv())) {
      o(false);
    }
  }
  
  public void t_()
  {
    super.t_();
    
    this.bp = this.bo;
    if (cx()) {
      this.bo += (1.0F - this.bo) * 0.4F;
    } else {
      this.bo += (0.0F - this.bo) * 0.4F;
    }
    if (U())
    {
      this.bq = true;
      this.br = false;
      this.bs = 0.0F;
      this.bt = 0.0F;
    }
    else if (((this.bq) || (this.br)) && 
      (this.br))
    {
      if (this.bs == 0.0F) {
        a("mob.wolf.shake", bB(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
      }
      this.bt = this.bs;
      this.bs += 0.05F;
      if (this.bt >= 2.0F)
      {
        this.bq = false;
        this.br = false;
        this.bt = 0.0F;
        this.bs = 0.0F;
      }
      if (this.bs > 0.4F)
      {
        float ☃ = (float)aR().b;
        int ☃ = (int)(ns.a((this.bs - 0.4F) * 3.1415927F) * 7.0F);
        for (int ☃ = 0; ☃ < ☃; ☃++)
        {
          float ☃ = (this.V.nextFloat() * 2.0F - 1.0F) * this.J * 0.5F;
          float ☃ = (this.V.nextFloat() * 2.0F - 1.0F) * this.J * 0.5F;
          this.o.a(cy.f, this.s + ☃, ☃ + 0.8F, this.u + ☃, this.v, this.w, this.x, new int[0]);
        }
      }
    }
  }
  
  public boolean ct()
  {
    return this.bq;
  }
  
  public float p(float ☃)
  {
    return 0.75F + (this.bt + (this.bs - this.bt) * ☃) / 2.0F * 0.25F;
  }
  
  public float i(float ☃, float ☃)
  {
    float ☃ = (this.bt + (this.bs - this.bt) * ☃ + ☃) / 1.8F;
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    } else if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    return ns.a(☃ * 3.1415927F) * ns.a(☃ * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
  }
  
  public float q(float ☃)
  {
    return (this.bp + (this.bo - this.bp) * ☃) * 0.15F * 3.1415927F;
  }
  
  public float aS()
  {
    return this.K * 0.8F;
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
    this.bm.a(false);
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
    zx ☃ = ☃.bi.h();
    if (cl())
    {
      if (☃ != null) {
        if ((☃.b() instanceof zs))
        {
          zs ☃ = (zs)☃.b();
          if ((☃.g()) && (this.ac.d(18) < 20.0F))
          {
            if (!☃.bA.d) {
              ☃.b -= 1;
            }
            h(☃.h(☃));
            if (☃.b <= 0) {
              ☃.bi.a(☃.bi.c, null);
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
            if (!☃.bA.d) {
              if (--☃.b <= 0) {
                ☃.bi.a(☃.bi.c, null);
              }
            }
            return true;
          }
        }
      }
      if ((e(☃)) && 
        (!this.o.D) && (!d(☃)))
      {
        this.bm.a(!cn());
        this.aY = false;
        this.h.n();
        d(null);
      }
    }
    else if ((☃ != null) && (☃.b() == zy.aX) && (!cv()))
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
          this.h.n();
          d(null);
          this.bm.a(true);
          i(20.0F);
          b(☃.aK().toString());
          l(true);
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
  
  public void a(byte ☃)
  {
    if (☃ == 8)
    {
      this.br = true;
      this.bs = 0.0F;
      this.bt = 0.0F;
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
      return (0.55F - (20.0F - this.ac.d(18)) * 0.02F) * 3.1415927F;
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
    return (this.ac.a(16) & 0x2) != 0;
  }
  
  public void o(boolean ☃)
  {
    byte ☃ = this.ac.a(16);
    if (☃) {
      this.ac.b(16, Byte.valueOf((byte)(☃ | 0x2)));
    } else {
      this.ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFFD)));
    }
  }
  
  public zd cw()
  {
    return zd.a(this.ac.a(20) & 0xF);
  }
  
  public void a(zd ☃)
  {
    this.ac.b(20, Byte.valueOf((byte)(☃.b() & 0xF)));
  }
  
  public ua b(ph ☃)
  {
    ua ☃ = new ua(this.o);
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
      this.ac.b(19, Byte.valueOf((byte)1));
    } else {
      this.ac.b(19, Byte.valueOf((byte)0));
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
    return this.ac.a(19) == 1;
  }
  
  protected boolean C()
  {
    return (!cl()) && (this.W > 2400);
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
