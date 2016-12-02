import java.util.List;

public class vf
  extends vd
  implements ali
{
  private boolean a = true;
  private int b = -1;
  private cj c = cj.a;
  
  public vf(adm ☃)
  {
    super(☃);
  }
  
  public vf(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃);
  }
  
  public va.a s()
  {
    return va.a.f;
  }
  
  public alz u()
  {
    return afi.cp.Q();
  }
  
  public int w()
  {
    return 1;
  }
  
  public int o_()
  {
    return 5;
  }
  
  public boolean e(wn ☃)
  {
    if (!this.o.D) {
      ☃.a(this);
    }
    return true;
  }
  
  public void a(int ☃, int ☃, int ☃, boolean ☃)
  {
    boolean ☃ = !☃;
    if (☃ != y()) {
      i(☃);
    }
  }
  
  public boolean y()
  {
    return this.a;
  }
  
  public void i(boolean ☃)
  {
    this.a = ☃;
  }
  
  public adm z()
  {
    return this.o;
  }
  
  public double A()
  {
    return this.s;
  }
  
  public double B()
  {
    return this.t + 0.5D;
  }
  
  public double C()
  {
    return this.u;
  }
  
  public void t_()
  {
    super.t_();
    if ((!this.o.D) && (ai()) && (y()))
    {
      cj ☃ = new cj(this);
      if (☃.equals(this.c)) {
        this.b -= 1;
      } else {
        m(0);
      }
      if (!E())
      {
        m(0);
        if (D())
        {
          m(4);
          p_();
        }
      }
    }
  }
  
  public boolean D()
  {
    if (alj.a(this)) {
      return true;
    }
    List<uz> ☃ = this.o.a(uz.class, aR().b(0.25D, 0.0D, 0.25D), po.a);
    if (☃.size() > 0) {
      alj.a(this, (uz)☃.get(0));
    }
    return false;
  }
  
  public void a(ow ☃)
  {
    super.a(☃);
    if (this.o.Q().b("doEntityDrops")) {
      a(zw.a(afi.cp), 1, 0.0F);
    }
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    ☃.a("TransferCooldown", this.b);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    this.b = ☃.f("TransferCooldown");
  }
  
  public void m(int ☃)
  {
    this.b = ☃;
  }
  
  public boolean E()
  {
    return this.b > 0;
  }
  
  public String k()
  {
    return "minecraft:hopper";
  }
  
  public xi a(wm ☃, wn ☃)
  {
    return new xw(☃, this, ☃);
  }
}
