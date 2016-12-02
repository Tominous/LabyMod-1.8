import java.util.Random;

public class wc
  extends vv
{
  public wc(adm ☃)
  {
    super(☃);
    a(1.4F, 0.9F);
    
    i.a(1, new ra(this));
    
    i.a(3, new rh(this, 0.4F));
    i.a(4, new wc.a(this, wn.class));
    i.a(4, new wc.a(this, ty.class));
    
    i.a(5, new rz(this, 0.8D));
    i.a(6, new ri(this, wn.class, 8.0F));
    i.a(6, new ry(this));
    
    bi.a(1, new sm(this, false, new Class[0]));
    bi.a(2, new wc.c(this, wn.class));
    bi.a(3, new wc.c(this, ty.class));
  }
  
  public double an()
  {
    return K * 0.5F;
  }
  
  protected sw b(adm ☃)
  {
    return new sx(this, ☃);
  }
  
  protected void h()
  {
    super.h();
    
    ac.a(16, new Byte((byte)0));
  }
  
  public void t_()
  {
    super.t_();
    if (!o.D) {
      a(D);
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
    if ((☃) && ((V.nextInt(3) == 0) || (V.nextInt(1 + ☃) > 0))) {
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
    if (☃.a() == uH) {
      return false;
    }
    return super.d(☃);
  }
  
  public boolean n()
  {
    return (ac.a(16) & 0x1) != 0;
  }
  
  public void a(boolean ☃)
  {
    byte ☃ = ac.a(16);
    if (☃) {
      ☃ = (byte)(☃ | 0x1);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFFE);
    }
    ac.b(16, Byte.valueOf(☃));
  }
  
  public pu a(ok ☃, pu ☃)
  {
    ☃ = super.a(☃, ☃);
    if (o.s.nextInt(100) == 0)
    {
      wa ☃ = new wa(o);
      ☃.b(s, t, u, y, 0.0F);
      ☃.a(☃, null);
      o.d(☃);
      ☃.a(this);
    }
    if (☃ == null)
    {
      ☃ = new wc.b();
      if ((o.aa() == oj.d) && (o.s.nextFloat() < 0.1F * ☃.c())) {
        ((wc.b)☃).a(o.s);
      }
    }
    if ((☃ instanceof wc.b))
    {
      int ☃ = a;
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
        a = cH;
      } else if (☃ <= 2) {
        a = gH;
      } else if (☃ <= 3) {
        a = lH;
      } else if (☃ <= 4) {
        a = pH;
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
      float ☃ = b.c(1.0F);
      if ((☃ >= 0.5F) && (b.bc().nextInt(100) == 0))
      {
        b.d(null);
        return false;
      }
      return super.b();
    }
    
    protected double a(pr ☃)
    {
      return 4.0F + J;
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
      float ☃ = e.c(1.0F);
      if (☃ >= 0.5F) {
        return false;
      }
      return super.a();
    }
  }
}
