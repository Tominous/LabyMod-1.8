import java.util.Random;

public class vp
  extends vv
{
  private int a = 0;
  private boolean b = false;
  
  public vp(adm ☃)
  {
    super(☃);
    b_ = 3;
    
    a(0.4F, 0.3F);
    
    i.a(1, new ra(this));
    i.a(2, new rl(this, wn.class, 1.0D, false));
    i.a(3, new rz(this, 1.0D));
    i.a(7, new ri(this, wn.class, 8.0F));
    i.a(8, new ry(this));
    
    bi.a(1, new sm(this, true, new Class[0]));
    bi.a(2, new sp(this, wn.class, true));
  }
  
  public float aS()
  {
    return 0.1F;
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(8.0D);
    a(vy.d).a(0.25D);
    a(vy.e).a(2.0D);
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  protected String z()
  {
    return "mob.silverfish.say";
  }
  
  protected String bo()
  {
    return "mob.silverfish.hit";
  }
  
  protected String bp()
  {
    return "mob.silverfish.kill";
  }
  
  protected void a(cj ☃, afh ☃)
  {
    a("mob.silverfish.step", 0.15F, 1.0F);
  }
  
  protected zw A()
  {
    return null;
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    a = ☃.f("Lifetime");
    b = ☃.n("PlayerSpawned");
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("Lifetime", a);
    ☃.a("PlayerSpawned", b);
  }
  
  public void t_()
  {
    aI = y;
    
    super.t_();
  }
  
  public boolean n()
  {
    return b;
  }
  
  public void a(boolean ☃)
  {
    b = ☃;
  }
  
  public void m()
  {
    super.m();
    if (o.D)
    {
      for (int ☃ = 0; ☃ < 2; ☃++) {
        o.a(cy.y, s + (V.nextDouble() - 0.5D) * J, t + V.nextDouble() * K, u + (V.nextDouble() - 0.5D) * J, (V.nextDouble() - 0.5D) * 2.0D, -V.nextDouble(), (V.nextDouble() - 0.5D) * 2.0D, new int[0]);
      }
    }
    else
    {
      if (!bZ()) {
        a += 1;
      }
      if (a >= 2400) {
        J();
      }
    }
  }
  
  protected boolean n_()
  {
    return true;
  }
  
  public boolean bR()
  {
    if (super.bR())
    {
      wn ☃ = o.a(this, 5.0D);
      return ☃ == null;
    }
    return false;
  }
  
  public pw bz()
  {
    return pw.c;
  }
}
