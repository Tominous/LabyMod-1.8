import java.util.Random;

public class wc
  extends vv
{
  public wc(adm ☃)
  {
    super(☃);
    a(1.4F, 0.9F);
    
    this.i.a(1, new ra(this));
    
    this.i.a(3, new rh(this, 0.4F));
    this.i.a(4, new wc.a(this, wn.class));
    this.i.a(4, new wc.a(this, ty.class));
    
    this.i.a(5, new rz(this, 0.8D));
    this.i.a(6, new ri(this, wn.class, 8.0F));
    this.i.a(6, new ry(this));
    
    this.bi.a(1, new sm(this, false, new Class[0]));
    this.bi.a(2, new wc.c(this, wn.class));
    this.bi.a(3, new wc.c(this, ty.class));
  }
  
  public double an()
  {
    return this.K * 0.5F;
  }
  
  protected sw b(adm ☃)
  {
    return new sx(this, ☃);
  }
  
  protected void h()
  {
    super.h();
    
    this.ac.a(16, new Byte((byte)0));
  }
  
  public void t_()
  {
    super.t_();
    if (!this.o.D) {
      a(this.D);
    }
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(16.0D);
    a(vy.d).a(0.30000001192092896D);
  }
  
  protected String z()
  {
    return "mob.spider.say";
  }
  
  protected String bo()
  {
    return "mob.spider.say";
  }
  
  protected String bp()
  {
    return "mob.spider.death";
  }
  
  protected void a(cj ☃, afh ☃)
  {
    a("mob.spider.step", 0.15F, 1.0F);
  }
  
  protected zw A()
  {
    return zy.F;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    super.b(☃, ☃);
    if ((☃) && ((this.V.nextInt(3) == 0) || (this.V.nextInt(1 + ☃) > 0))) {
      a(zy.bB, 1);
    }
  }
  
  public boolean k_()
  {
    return n();
  }
  
  public void aA() {}
  
  public pw bz()
  {
    return pw.c;
  }
  
  public boolean d(pf ☃)
  {
    if (☃.a() == pe.u.H) {
      return false;
    }
    return super.d(☃);
  }
  
  public boolean n()
  {
    return (this.ac.a(16) & 0x1) != 0;
  }
  
  public void a(boolean ☃)
  {
    byte ☃ = this.ac.a(16);
    if (☃) {
      ☃ = (byte)(☃ | 0x1);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFFE);
    }
    this.ac.b(16, Byte.valueOf(☃));
  }
  
  public pu a(ok ☃, pu ☃)
  {
    ☃ = super.a(☃, ☃);
    if (this.o.s.nextInt(100) == 0)
    {
      wa ☃ = new wa(this.o);
      ☃.b(this.s, this.t, this.u, this.y, 0.0F);
      ☃.a(☃, null);
      this.o.d(☃);
      ☃.a(this);
    }
    if (☃ == null)
    {
      ☃ = new wc.b();
      if ((this.o.aa() == oj.d) && (this.o.s.nextFloat() < 0.1F * ☃.c())) {
        ((wc.b)☃).a(this.o.s);
      }
    }
    if ((☃ instanceof wc.b))
    {
      int ☃ = ((wc.b)☃).a;
      if ((☃ > 0) && (pe.a[☃] != null)) {
        c(new pf(☃, Integer.MAX_VALUE));
      }
    }
    return ☃;
  }
  
  public float aS()
  {
    return 0.65F;
  }
  
  public static class b
    implements pu
  {
    public int a;
    
    public void a(Random ☃)
    {
      int ☃ = ☃.nextInt(5);
      if (☃ <= 1) {
        this.a = pe.c.H;
      } else if (☃ <= 2) {
        this.a = pe.g.H;
      } else if (☃ <= 3) {
        this.a = pe.l.H;
      } else if (☃ <= 4) {
        this.a = pe.p.H;
      }
    }
  }
  
  static class a
    extends rl
  {
    public a(wc ☃, Class<? extends pk> ☃)
    {
      super(☃, 1.0D, true);
    }
    
    public boolean b()
    {
      float ☃ = this.b.c(1.0F);
      if ((☃ >= 0.5F) && (this.b.bc().nextInt(100) == 0))
      {
        this.b.d(null);
        return false;
      }
      return super.b();
    }
    
    protected double a(pr ☃)
    {
      return 4.0F + ☃.J;
    }
  }
  
  static class c<T extends pr>
    extends sp
  {
    public c(wc ☃, Class<T> ☃)
    {
      super(☃, true);
    }
    
    public boolean a()
    {
      float ☃ = this.e.c(1.0F);
      if (☃ >= 0.5F) {
        return false;
      }
      return super.a();
    }
  }
}
