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
    if (!o.D) {
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
    return a;
  }
  
  public void i(boolean ☃)
  {
    a = ☃;
  }
  
  public adm z()
  {
    return o;
  }
  
  public double A()
  {
    return s;
  }
  
  public double B()
  {
    return t + 0.5D;
  }
  
  public double C()
  {
    return u;
  }
  
  public void t_()
  {
    super.t_();
    if ((!o.D) && (ai()) && (y()))
    {
      cj ☃ = new cj(this);
      if (☃.equals(c)) {
        b -= 1;
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
    List<uz> ☃ = o.a(uz.class, aR().b(0.25D, 0.0D, 0.25D), po.a);
    if (☃.size() > 0) {
      alj.a(this, (uz)☃.get(0));
    }
    return false;
  }
  
  public void a(ow ☃)
  {
    super.a(☃);
    if (o.Q().b("doEntityDrops")) {
      a(zw.a(afi.cp), 1, 0.0F);
    }
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    ☃.a("TransferCooldown", b);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    b = ☃.f("TransferCooldown");
  }
  
  public void m(int ☃)
  {
    b = ☃;
  }
  
  public boolean E()
  {
    return b > 0;
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
