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
    i.a(0, new ra(this));
    i.a(1, new rv(this, 1.25D));
    i.a(2, bm = new qw(this, 0.3F));
    i.a(3, new qv(this, 1.0D));
    i.a(4, new sh(this, 1.2D, zy.bY, false));
    i.a(4, new sh(this, 1.2D, zy.bR, false));
    i.a(5, new rc(this, 1.1D));
    i.a(6, new rz(this, 1.0D));
    i.a(7, new ri(this, wn.class, 6.0F));
    i.a(8, new ry(this));
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(10.0D);
    a(vy.d).a(0.25D);
  }
  
  public boolean bW()
  {
    zx ☃ = ((wn)l).bA();
    
    return (☃ != null) && (☃.b() == zy.bY);
  }
  
  protected void h()
  {
    super.h();
    ac.a(16, Byte.valueOf((byte)0));
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
      if ((cl()) && (!o.D) && ((l == null) || (l == ☃)))
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
    int ☃ = V.nextInt(3) + 1 + V.nextInt(1 + ☃);
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
    return (ac.a(16) & 0x1) != 0;
  }
  
  public void l(boolean ☃)
  {
    if (☃) {
      ac.b(16, Byte.valueOf((byte)1));
    } else {
      ac.b(16, Byte.valueOf((byte)0));
    }
  }
  
  public void a(uv ☃)
  {
    if ((o.D) || (I)) {
      return;
    }
    vw ☃ = new vw(o);
    ☃.c(0, new zx(zy.B));
    ☃.b(s, t, u, y, z);
    ☃.k(ce());
    if (l_())
    {
      ☃.a(aM());
      ☃.g(aN());
    }
    o.d(☃);
    J();
  }
  
  public void e(float ☃, float ☃)
  {
    super.e(☃, ☃);
    if ((☃ > 5.0F) && ((l instanceof wn))) {
      ((wn)l).b(mr.u);
    }
  }
  
  public tt b(ph ☃)
  {
    return new tt(o);
  }
  
  public boolean d(zx ☃)
  {
    return (☃ != null) && (☃.b() == zy.bR);
  }
  
  public qw cm()
  {
    return bm;
  }
}
