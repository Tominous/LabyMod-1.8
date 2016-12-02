import java.util.Random;

public class to
  extends tm
{
  public to(adm ☃)
  {
    super(☃);
    a(0.9F, 1.3F);
    
    ((sv)s()).a(true);
    i.a(0, new ra(this));
    i.a(1, new rv(this, 2.0D));
    i.a(2, new qv(this, 1.0D));
    i.a(3, new sh(this, 1.25D, zy.O, false));
    i.a(4, new rc(this, 1.25D));
    i.a(5, new rz(this, 1.0D));
    i.a(6, new ri(this, wn.class, 6.0F));
    i.a(7, new ry(this));
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(10.0D);
    a(vy.d).a(0.20000000298023224D);
  }
  
  protected String z()
  {
    return "mob.cow.say";
  }
  
  protected String bo()
  {
    return "mob.cow.hurt";
  }
  
  protected String bp()
  {
    return "mob.cow.hurt";
  }
  
  protected void a(cj ☃, afh ☃)
  {
    a("mob.cow.step", 0.15F, 1.0F);
  }
  
  protected float bB()
  {
    return 0.4F;
  }
  
  protected zw A()
  {
    return zy.aF;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    int ☃ = V.nextInt(3) + V.nextInt(1 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.aF, 1);
    }
    ☃ = V.nextInt(3) + 1 + V.nextInt(1 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      if (at()) {
        a(zy.bj, 1);
      } else {
        a(zy.bi, 1);
      }
    }
  }
  
  public boolean a(wn ☃)
  {
    zx ☃ = bi.h();
    if ((☃ != null) && (☃.b() == zy.aw) && (!bA.d) && (!j_()))
    {
      if (b-- == 1) {
        bi.a(bi.c, new zx(zy.aG));
      } else if (!bi.a(new zx(zy.aG))) {
        ☃.a(new zx(zy.aG, 1, 0), false);
      }
      return true;
    }
    return super.a(☃);
  }
  
  public to b(ph ☃)
  {
    return new to(o);
  }
  
  public float aS()
  {
    return K;
  }
}
