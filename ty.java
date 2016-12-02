import com.google.common.base.Predicate;
import java.util.Random;

public class ty
  extends tq
{
  private int b;
  tf a;
  private int c;
  private int bm;
  
  public ty(adm ☃)
  {
    super(☃);
    a(1.4F, 2.9F);
    
    ((sv)s()).a(true);
    
    this.i.a(1, new rl(this, 1.0D, true));
    this.i.a(2, new rq(this, 0.9D, 32.0F));
    this.i.a(3, new rn(this, 0.6D, true));
    this.i.a(4, new rp(this, 1.0D));
    this.i.a(5, new rt(this));
    this.i.a(6, new rz(this, 0.6D));
    this.i.a(7, new ri(this, wn.class, 6.0F));
    this.i.a(8, new ry(this));
    
    this.bi.a(1, new sl(this));
    this.bi.a(2, new sm(this, false, new Class[0]));
    this.bi.a(3, new ty.a(this, ps.class, 10, false, true, vq.e));
  }
  
  protected void h()
  {
    super.h();
    this.ac.a(16, Byte.valueOf((byte)0));
  }
  
  protected void E()
  {
    if (--this.b <= 0)
    {
      this.b = (70 + this.V.nextInt(50));
      this.a = this.o.ae().a(new cj(this), 32);
      if (this.a == null)
      {
        cj();
      }
      else
      {
        cj ☃ = this.a.a();
        a(☃, (int)(this.a.b() * 0.6F));
      }
    }
    super.E();
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(100.0D);
    a(vy.d).a(0.25D);
  }
  
  protected int j(int ☃)
  {
    return ☃;
  }
  
  protected void s(pk ☃)
  {
    if (((☃ instanceof vq)) && (!(☃ instanceof vn)) && 
      (bc().nextInt(20) == 0)) {
      d((pr)☃);
    }
    super.s(☃);
  }
  
  public void m()
  {
    super.m();
    if (this.c > 0) {
      this.c -= 1;
    }
    if (this.bm > 0) {
      this.bm -= 1;
    }
    if ((this.v * this.v + this.x * this.x > 2.500000277905201E-7D) && (this.V.nextInt(5) == 0))
    {
      int ☃ = ns.c(this.s);
      int ☃ = ns.c(this.t - 0.20000000298023224D);
      int ☃ = ns.c(this.u);
      alz ☃ = this.o.p(new cj(☃, ☃, ☃));
      afh ☃ = ☃.c();
      if (☃.t() != arm.a) {
        this.o.a(cy.L, this.s + (this.V.nextFloat() - 0.5D) * this.J, aR().b + 0.1D, this.u + (this.V.nextFloat() - 0.5D) * this.J, 4.0D * (this.V.nextFloat() - 0.5D), 0.5D, (this.V.nextFloat() - 0.5D) * 4.0D, new int[] { afh.f(☃) });
      }
    }
  }
  
  public boolean a(Class<? extends pr> ☃)
  {
    if ((cn()) && (wn.class.isAssignableFrom(☃))) {
      return false;
    }
    if (☃ == vn.class) {
      return false;
    }
    return super.a(☃);
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("PlayerCreated", cn());
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    l(☃.n("PlayerCreated"));
  }
  
  public boolean r(pk ☃)
  {
    this.c = 10;
    this.o.a(this, (byte)4);
    boolean ☃ = ☃.a(ow.a(this), 7 + this.V.nextInt(15));
    if (☃)
    {
      ☃.w += 0.4000000059604645D;
      a(this, ☃);
    }
    a("mob.irongolem.throw", 1.0F, 1.0F);
    return ☃;
  }
  
  public void a(byte ☃)
  {
    if (☃ == 4)
    {
      this.c = 10;
      a("mob.irongolem.throw", 1.0F, 1.0F);
    }
    else if (☃ == 11)
    {
      this.bm = 400;
    }
    else
    {
      super.a(☃);
    }
  }
  
  public tf n()
  {
    return this.a;
  }
  
  public int cl()
  {
    return this.c;
  }
  
  public void a(boolean ☃)
  {
    this.bm = (☃ ? 400 : 0);
    this.o.a(this, (byte)11);
  }
  
  protected String bo()
  {
    return "mob.irongolem.hit";
  }
  
  protected String bp()
  {
    return "mob.irongolem.death";
  }
  
  protected void a(cj ☃, afh ☃)
  {
    a("mob.irongolem.walk", 1.0F, 1.0F);
  }
  
  protected void b(boolean ☃, int ☃)
  {
    int ☃ = this.V.nextInt(3);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zw.a(afi.O), 1, agw.a.b.b());
    }
    int ☃ = 3 + this.V.nextInt(3);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.j, 1);
    }
  }
  
  public int cm()
  {
    return this.bm;
  }
  
  public boolean cn()
  {
    return (this.ac.a(16) & 0x1) != 0;
  }
  
  public void l(boolean ☃)
  {
    byte ☃ = this.ac.a(16);
    if (☃) {
      this.ac.b(16, Byte.valueOf((byte)(☃ | 0x1)));
    } else {
      this.ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFFE)));
    }
  }
  
  public void a(ow ☃)
  {
    if ((!cn()) && (this.aN != null) && (this.a != null)) {
      this.a.a(this.aN.e_(), -5);
    }
    super.a(☃);
  }
  
  static class a<T extends pr>
    extends sp<T>
  {
    public a(final py ☃, Class<T> ☃, int ☃, boolean ☃, boolean ☃, final Predicate<? super T> ☃)
    {
      super(☃, ☃, ☃, ☃, ☃);
      this.c = new Predicate()
      {
        public boolean a(T ☃)
        {
          if ((☃ != null) && (!☃.apply(☃))) {
            return false;
          }
          if ((☃ instanceof vn)) {
            return false;
          }
          if ((☃ instanceof wn))
          {
            double ☃ = ty.a.a(ty.a.this);
            if (☃.av()) {
              ☃ *= 0.800000011920929D;
            }
            if (☃.ax())
            {
              float ☃ = ((wn)☃).bY();
              if (☃ < 0.1F) {
                ☃ = 0.1F;
              }
              ☃ *= 0.7F * ☃;
            }
            if (☃.g(☃) > ☃) {
              return false;
            }
          }
          return ty.a.a(ty.a.this, ☃, false);
        }
      };
    }
  }
}
