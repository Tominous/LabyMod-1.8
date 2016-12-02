import java.util.List;
import java.util.Random;

public class vr
  extends pq
  implements vq
{
  private int a = 1;
  
  public vr(adm ☃)
  {
    super(☃);
    a(4.0F, 4.0F);
    ab = true;
    b_ = 5;
    
    f = new vr.b(this);
    
    i.a(5, new vr.d(this));
    
    i.a(7, new vr.a(this));
    i.a(7, new vr.c(this));
    
    bi.a(1, new so(this));
  }
  
  public boolean n()
  {
    return ac.a(16) != 0;
  }
  
  public void a(boolean ☃)
  {
    ac.b(16, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
  
  public int cf()
  {
    return a;
  }
  
  public void t_()
  {
    super.t_();
    if ((!o.D) && (o.aa() == oj.a)) {
      J();
    }
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if (("fireball".equals(☃.p())) && 
      ((☃.j() instanceof wn)))
    {
      super.a(☃, 1000.0F);
      ((wn)☃.j()).b(mr.z);
      return true;
    }
    return super.a(☃, ☃);
  }
  
  protected void h()
  {
    super.h();
    
    ac.a(16, Byte.valueOf((byte)0));
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(10.0D);
    a(vy.b).a(100.0D);
  }
  
  protected String z()
  {
    return "mob.ghast.moan";
  }
  
  protected String bo()
  {
    return "mob.ghast.scream";
  }
  
  protected String bp()
  {
    return "mob.ghast.death";
  }
  
  protected zw A()
  {
    return zy.H;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    int ☃ = V.nextInt(2) + V.nextInt(1 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.bw, 1);
    }
    ☃ = V.nextInt(3) + V.nextInt(1 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.H, 1);
    }
  }
  
  protected float bB()
  {
    return 10.0F;
  }
  
  public boolean bR()
  {
    return (V.nextInt(20) == 0) && (super.bR()) && (o.aa() != oj.a);
  }
  
  public int bV()
  {
    return 1;
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("ExplosionPower", a);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("ExplosionPower", 99)) {
      a = ☃.f("ExplosionPower");
    }
  }
  
  static class b
    extends qq
  {
    private vr g;
    private int h;
    
    public b(vr ☃)
    {
      super();
      g = ☃;
    }
    
    public void c()
    {
      if (!f) {
        return;
      }
      double ☃ = b - g.s;
      double ☃ = c - g.t;
      double ☃ = d - g.u;
      
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if (h-- <= 0)
      {
        h += g.bc().nextInt(5) + 2;
        
        ☃ = ns.a(☃);
        if (b(b, c, d, ☃))
        {
          g.v += ☃ / ☃ * 0.1D;
          g.w += ☃ / ☃ * 0.1D;
          g.x += ☃ / ☃ * 0.1D;
        }
        else
        {
          f = false;
        }
      }
    }
    
    private boolean b(double ☃, double ☃, double ☃, double ☃)
    {
      double ☃ = (☃ - g.s) / ☃;
      double ☃ = (☃ - g.t) / ☃;
      double ☃ = (☃ - g.u) / ☃;
      
      aug ☃ = g.aR();
      for (int ☃ = 1; ☃ < ☃; ☃++)
      {
        ☃ = ☃.c(☃, ☃, ☃);
        if (!g.o.a(g, ☃).isEmpty()) {
          return false;
        }
      }
      return true;
    }
  }
  
  static class d
    extends rd
  {
    private vr a;
    
    public d(vr ☃)
    {
      a = ☃;
      
      a(1);
    }
    
    public boolean a()
    {
      qq ☃ = a.q();
      if (!☃.a()) {
        return true;
      }
      double ☃ = ☃.d() - a.s;
      double ☃ = ☃.e() - a.t;
      double ☃ = ☃.f() - a.u;
      
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if ((☃ < 1.0D) || (☃ > 3600.0D)) {
        return true;
      }
      return false;
    }
    
    public boolean b()
    {
      return false;
    }
    
    public void c()
    {
      Random ☃ = a.bc();
      double ☃ = a.s + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
      double ☃ = a.t + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
      double ☃ = a.u + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
      a.q().a(☃, ☃, ☃, 1.0D);
    }
  }
  
  static class a
    extends rd
  {
    private vr a;
    
    public a(vr ☃)
    {
      a = ☃;
      
      a(2);
    }
    
    public boolean a()
    {
      return true;
    }
    
    public void e()
    {
      if (a.u() == null)
      {
        a.aI = (a.y = -(float)ns.b(a.v, a.x) * 180.0F / 3.1415927F);
      }
      else
      {
        pr ☃ = a.u();
        
        double ☃ = 64.0D;
        if (☃.h(a) < ☃ * ☃)
        {
          double ☃ = s - a.s;
          double ☃ = u - a.u;
          a.aI = (a.y = -(float)ns.b(☃, ☃) * 180.0F / 3.1415927F);
        }
      }
    }
  }
  
  static class c
    extends rd
  {
    private vr b;
    public int a;
    
    public c(vr ☃)
    {
      b = ☃;
    }
    
    public boolean a()
    {
      return b.u() != null;
    }
    
    public void c()
    {
      a = 0;
    }
    
    public void d()
    {
      b.a(false);
    }
    
    public void e()
    {
      pr ☃ = b.u();
      
      double ☃ = 64.0D;
      if ((☃.h(b) < ☃ * ☃) && (b.t(☃)))
      {
        adm ☃ = b.o;
        
        a += 1;
        if (a == 10) {
          ☃.a(null, 1007, new cj(b), 0);
        }
        if (a == 20)
        {
          double ☃ = 4.0D;
          aui ☃ = b.d(1.0F);
          
          double ☃ = s - (b.s + a * ☃);
          double ☃ = aRb + K / 2.0F - (0.5D + b.t + b.K / 2.0F);
          double ☃ = u - (b.u + c * ☃);
          
          ☃.a(null, 1008, new cj(b), 0);
          wu ☃ = new wu(☃, b, ☃, ☃, ☃);
          e = b.cf();
          s = (b.s + a * ☃);
          t = (b.t + b.K / 2.0F + 0.5D);
          u = (b.u + c * ☃);
          ☃.d(☃);
          a = -40;
        }
      }
      else if (a > 0)
      {
        a -= 1;
      }
      b.a(a > 10);
    }
  }
  
  public float aS()
  {
    return 2.6F;
  }
}
