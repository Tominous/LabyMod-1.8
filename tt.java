import java.util.Random;

public class tt
  extends tm
{
  private final qw bm;
  
  public tt(adm ☃)
  {
    super(☃);
    a(0.9F, 0.9F);
    
    ((sv)s()).a(true);
    this.i.a(0, new ra(this));
    this.i.a(1, new rv(this, 1.25D));
    this.i.a(2, this.bm = new qw(this, 0.3F));
    this.i.a(3, new qv(this, 1.0D));
    this.i.a(4, new sh(this, 1.2D, zy.bY, false));
    this.i.a(4, new sh(this, 1.2D, zy.bR, false));
    this.i.a(5, new rc(this, 1.1D));
    this.i.a(6, new rz(this, 1.0D));
    this.i.a(7, new ri(this, wn.class, 6.0F));
    this.i.a(8, new ry(this));
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(10.0D);
    a(vy.d).a(0.25D);
  }
  
  public boolean bW()
  {
    zx ☃ = ((wn)this.l).bA();
    
    return (☃ != null) && (☃.b() == zy.bY);
  }
  
  protected void h()
  {
    super.h();
    this.ac.a(16, Byte.valueOf((byte)0));
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("Saddle", cl());
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    l(☃.n("Saddle"));
  }
  
  protected String z()
  {
    return "mob.pig.say";
  }
  
  protected String bo()
  {
    return "mob.pig.say";
  }
  
  protected String bp()
  {
    return "mob.pig.death";
  }
  
  protected void a(cj ☃, afh ☃)
  {
    a("mob.pig.step", 0.15F, 1.0F);
  }
  
  public boolean a(wn ☃)
  {
    if (!super.a(☃))
    {
      if ((cl()) && (!this.o.D) && ((this.l == null) || (this.l == ☃)))
      {
        ☃.a(this);
        return true;
      }
      return false;
    }
    return true;
  }
  
  protected zw A()
  {
    if (at()) {
      return zy.am;
    }
    return zy.al;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    int ☃ = this.V.nextInt(3) + 1 + this.V.nextInt(1 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      if (at()) {
        a(zy.am, 1);
      } else {
        a(zy.al, 1);
      }
    }
    if (cl()) {
      a(zy.aA, 1);
    }
  }
  
  public boolean cl()
  {
    return (this.ac.a(16) & 0x1) != 0;
  }
  
  public void l(boolean ☃)
  {
    if (☃) {
      this.ac.b(16, Byte.valueOf((byte)1));
    } else {
      this.ac.b(16, Byte.valueOf((byte)0));
    }
  }
  
  public void a(uv ☃)
  {
    if ((this.o.D) || (this.I)) {
      return;
    }
    vw ☃ = new vw(this.o);
    ☃.c(0, new zx(zy.B));
    ☃.b(this.s, this.t, this.u, this.y, this.z);
    ☃.k(ce());
    if (l_())
    {
      ☃.a(aM());
      ☃.g(aN());
    }
    this.o.d(☃);
    J();
  }
  
  public void e(float ☃, float ☃)
  {
    super.e(☃, ☃);
    if ((☃ > 5.0F) && ((this.l instanceof wn))) {
      ((wn)this.l).b(mr.u);
    }
  }
  
  public tt b(ph ☃)
  {
    return new tt(this.o);
  }
  
  public boolean d(zx ☃)
  {
    return (☃ != null) && (☃.b() == zy.bR);
  }
  
  public qw cm()
  {
    return this.bm;
  }
}
