import java.util.Random;

public class vz
  extends vv
{
  private vz.b a;
  
  public vz(adm ☃)
  {
    super(☃);
    a(0.4F, 0.3F);
    
    this.i.a(1, new ra(this));
    
    this.i.a(3, this.a = new vz.b(this));
    
    this.i.a(4, new rl(this, wn.class, 1.0D, false));
    this.i.a(5, new vz.a(this));
    
    this.bi.a(1, new sm(this, true, new Class[0]));
    this.bi.a(2, new sp(this, wn.class, true));
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
      this.a.f();
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
    this.aI = this.y;
    
    super.t_();
  }
  
  public float a(cj ☃)
  {
    if (this.o.p(☃.b()).c() == afi.b) {
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
      wn ☃ = this.o.a(this, 5.0D);
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
      this.a = ☃;
    }
    
    public void f()
    {
      if (this.b == 0) {
        this.b = 20;
      }
    }
    
    public boolean a()
    {
      return this.b > 0;
    }
    
    public void e()
    {
      this.b -= 1;
      if (this.b <= 0)
      {
        adm ☃ = this.a.o;
        Random ☃ = this.a.bc();
        
        cj ☃ = new cj(this.a);
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
      this.a = ☃;
      
      a(1);
    }
    
    public boolean a()
    {
      if (this.a.u() != null) {
        return false;
      }
      if (!this.a.s().m()) {
        return false;
      }
      Random ☃ = this.a.bc();
      if (☃.nextInt(10) == 0)
      {
        this.b = cq.a(☃);
        
        cj ☃ = new cj(this.a.s, this.a.t + 0.5D, this.a.u).a(this.b);
        alz ☃ = this.a.o.p(☃);
        if (ahz.d(☃))
        {
          this.c = true;
          return true;
        }
      }
      this.c = false;
      return super.a();
    }
    
    public boolean b()
    {
      if (this.c) {
        return false;
      }
      return super.b();
    }
    
    public void c()
    {
      if (!this.c)
      {
        super.c();
        return;
      }
      adm ☃ = this.a.o;
      cj ☃ = new cj(this.a.s, this.a.t + 0.5D, this.a.u).a(this.b);
      alz ☃ = ☃.p(☃);
      if (ahz.d(☃))
      {
        ☃.a(☃, afi.be.Q().a(ahz.a, ahz.a.a(☃)), 3);
        this.a.y();
        this.a.J();
      }
    }
  }
}
