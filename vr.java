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
    this.ab = true;
    this.b_ = 5;
    
    this.f = new vr.b(this);
    
    this.i.a(5, new vr.d(this));
    
    this.i.a(7, new vr.a(this));
    this.i.a(7, new vr.c(this));
    
    this.bi.a(1, new so(this));
  }
  
  public boolean n()
  {
    return this.ac.a(16) != 0;
  }
  
  public void a(boolean ☃)
  {
    this.ac.b(16, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
  
  public int cf()
  {
    return this.a;
  }
  
  public void t_()
  {
    super.t_();
    if ((!this.o.D) && (this.o.aa() == oj.a)) {
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
    
    this.ac.a(16, Byte.valueOf((byte)0));
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
    int ☃ = this.V.nextInt(2) + this.V.nextInt(1 + ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(zy.bw, 1);
    }
    ☃ = this.V.nextInt(3) + this.V.nextInt(1 + ☃);
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
    return (this.V.nextInt(20) == 0) && (super.bR()) && (this.o.aa() != oj.a);
  }
  
  public int bV()
  {
    return 1;
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("ExplosionPower", this.a);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("ExplosionPower", 99)) {
      this.a = ☃.f("ExplosionPower");
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
      this.g = ☃;
    }
    
    public void c()
    {
      if (!this.f) {
        return;
      }
      double ☃ = this.b - this.g.s;
      double ☃ = this.c - this.g.t;
      double ☃ = this.d - this.g.u;
      
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if (this.h-- <= 0)
      {
        this.h += this.g.bc().nextInt(5) + 2;
        
        ☃ = ns.a(☃);
        if (b(this.b, this.c, this.d, ☃))
        {
          this.g.v += ☃ / ☃ * 0.1D;
          this.g.w += ☃ / ☃ * 0.1D;
          this.g.x += ☃ / ☃ * 0.1D;
        }
        else
        {
          this.f = false;
        }
      }
    }
    
    private boolean b(double ☃, double ☃, double ☃, double ☃)
    {
      double ☃ = (☃ - this.g.s) / ☃;
      double ☃ = (☃ - this.g.t) / ☃;
      double ☃ = (☃ - this.g.u) / ☃;
      
      aug ☃ = this.g.aR();
      for (int ☃ = 1; ☃ < ☃; ☃++)
      {
        ☃ = ☃.c(☃, ☃, ☃);
        if (!this.g.o.a(this.g, ☃).isEmpty()) {
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
      this.a = ☃;
      
      a(1);
    }
    
    public boolean a()
    {
      qq ☃ = this.a.q();
      if (!☃.a()) {
        return true;
      }
      double ☃ = ☃.d() - this.a.s;
      double ☃ = ☃.e() - this.a.t;
      double ☃ = ☃.f() - this.a.u;
      
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
      Random ☃ = this.a.bc();
      double ☃ = this.a.s + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
      double ☃ = this.a.t + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
      double ☃ = this.a.u + (☃.nextFloat() * 2.0F - 1.0F) * 16.0F;
      this.a.q().a(☃, ☃, ☃, 1.0D);
    }
  }
  
  static class a
    extends rd
  {
    private vr a;
    
    public a(vr ☃)
    {
      this.a = ☃;
      
      a(2);
    }
    
    public boolean a()
    {
      return true;
    }
    
    public void e()
    {
      if (this.a.u() == null)
      {
        this.a.aI = (this.a.y = -(float)ns.b(this.a.v, this.a.x) * 180.0F / 3.1415927F);
      }
      else
      {
        pr ☃ = this.a.u();
        
        double ☃ = 64.0D;
        if (☃.h(this.a) < ☃ * ☃)
        {
          double ☃ = ☃.s - this.a.s;
          double ☃ = ☃.u - this.a.u;
          this.a.aI = (this.a.y = -(float)ns.b(☃, ☃) * 180.0F / 3.1415927F);
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
      this.b = ☃;
    }
    
    public boolean a()
    {
      return this.b.u() != null;
    }
    
    public void c()
    {
      this.a = 0;
    }
    
    public void d()
    {
      this.b.a(false);
    }
    
    public void e()
    {
      pr ☃ = this.b.u();
      
      double ☃ = 64.0D;
      if ((☃.h(this.b) < ☃ * ☃) && (this.b.t(☃)))
      {
        adm ☃ = this.b.o;
        
        this.a += 1;
        if (this.a == 10) {
          ☃.a(null, 1007, new cj(this.b), 0);
        }
        if (this.a == 20)
        {
          double ☃ = 4.0D;
          aui ☃ = this.b.d(1.0F);
          
          double ☃ = ☃.s - (this.b.s + ☃.a * ☃);
          double ☃ = ☃.aR().b + ☃.K / 2.0F - (0.5D + this.b.t + this.b.K / 2.0F);
          double ☃ = ☃.u - (this.b.u + ☃.c * ☃);
          
          ☃.a(null, 1008, new cj(this.b), 0);
          wu ☃ = new wu(☃, this.b, ☃, ☃, ☃);
          ☃.e = this.b.cf();
          ☃.s = (this.b.s + ☃.a * ☃);
          ☃.t = (this.b.t + this.b.K / 2.0F + 0.5D);
          ☃.u = (this.b.u + ☃.c * ☃);
          ☃.d(☃);
          this.a = -40;
        }
      }
      else if (this.a > 0)
      {
        this.a -= 1;
      }
      this.b.a(this.a > 10);
    }
  }
  
  public float aS()
  {
    return 2.6F;
  }
}
