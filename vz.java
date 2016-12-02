import java.util.Random;

public class vz
  extends vv
{
  private vz.b a;
  
  public vz(adm ☃)
  {
    super(☃);
    a(0.4F, 0.3F);
    
    i.a(1, new ra(this));
    
    i.a(3, a = new vz.b(this));
    
    i.a(4, new rl(this, wn.class, 1.0D, false));
    i.a(5, new vz.a(this));
    
    bi.a(1, new sm(this, true, new Class[0]));
    bi.a(2, new sp(this, wn.class, true));
  }
  
  public double am()
  {
    return 0.2D;
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
    a(vy.e).a(1.0D);
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
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if (((☃ instanceof ox)) || (☃ == ow.l)) {
      a.f();
    }
    return super.a(☃, ☃);
  }
  
  protected void a(cj ☃, afh ☃)
  {
    a("mob.silverfish.step", 0.15F, 1.0F);
  }
  
  protected zw A()
  {
    return null;
  }
  
  public void t_()
  {
    aI = y;
    
    super.t_();
  }
  
  public float a(cj ☃)
  {
    if (o.p(☃.b()).c() == afi.b) {
      return 10.0F;
    }
    return super.a(☃);
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
  
  static class b
    extends rd
  {
    private vz a;
    private int b;
    
    public b(vz ☃)
    {
      a = ☃;
    }
    
    public void f()
    {
      if (b == 0) {
        b = 20;
      }
    }
    
    public boolean a()
    {
      return b > 0;
    }
    
    public void e()
    {
      b -= 1;
      if (b <= 0)
      {
        adm ☃ = a.o;
        Random ☃ = a.bc();
        
        cj ☃ = new cj(a);
        for (int ☃ = 0; (☃ <= 5) && (☃ >= -5); ☃ = ☃ <= 0 ? 1 - ☃ : 0 - ☃) {
          for (int ☃ = 0; (☃ <= 10) && (☃ >= -10); ☃ = ☃ <= 0 ? 1 - ☃ : 0 - ☃) {
            for (int ☃ = 0; (☃ <= 10) && (☃ >= -10); ☃ = ☃ <= 0 ? 1 - ☃ : 0 - ☃)
            {
              cj ☃ = ☃.a(☃, ☃, ☃);
              alz ☃ = ☃.p(☃);
              if (☃.c() == afi.be)
              {
                if (☃.Q().b("mobGriefing")) {
                  ☃.b(☃, true);
                } else {
                  ☃.a(☃, ((ahz.a)☃.b(ahz.a)).d(), 3);
                }
                if (☃.nextBoolean()) {
                  return;
                }
              }
            }
          }
        }
      }
    }
  }
  
  static class a
    extends rz
  {
    private final vz a;
    private cq b;
    private boolean c;
    
    public a(vz ☃)
    {
      super(1.0D, 10);
      a = ☃;
      
      a(1);
    }
    
    public boolean a()
    {
      if (a.u() != null) {
        return false;
      }
      if (!a.s().m()) {
        return false;
      }
      Random ☃ = a.bc();
      if (☃.nextInt(10) == 0)
      {
        b = cq.a(☃);
        
        cj ☃ = new cj(a.s, a.t + 0.5D, a.u).a(b);
        alz ☃ = a.o.p(☃);
        if (ahz.d(☃))
        {
          c = true;
          return true;
        }
      }
      c = false;
      return super.a();
    }
    
    public boolean b()
    {
      if (c) {
        return false;
      }
      return super.b();
    }
    
    public void c()
    {
      if (!c)
      {
        super.c();
        return;
      }
      adm ☃ = a.o;
      cj ☃ = new cj(a.s, a.t + 0.5D, a.u).a(b);
      alz ☃ = ☃.p(☃);
      if (ahz.d(☃))
      {
        ☃.a(☃, afi.be.Q().a(ahz.a, ahz.a.a(☃)), 3);
        a.y();
        a.J();
      }
    }
  }
}
