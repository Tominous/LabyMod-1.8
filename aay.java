import com.google.common.collect.Multimap;

public class aay
  extends zw
{
  private float a;
  private final zw.a b;
  
  public aay(zw.a ☃)
  {
    this.b = ☃;
    this.h = 1;
    d(☃.a());
    a(yz.j);
    
    this.a = (4.0F + ☃.c());
  }
  
  public float g()
  {
    return this.b.c();
  }
  
  public float a(zx ☃, afh ☃)
  {
    if (☃ == afi.G) {
      return 15.0F;
    }
    arm ☃ = ☃.t();
    if ((☃ == arm.k) || (☃ == arm.l) || (☃ == arm.v) || (☃ == arm.j) || (☃ == arm.C)) {
      return 1.5F;
    }
    return 1.0F;
  }
  
  public boolean a(zx ☃, pr ☃, pr ☃)
  {
    ☃.a(1, ☃);
    return true;
  }
  
  public boolean a(zx ☃, adm ☃, afh ☃, cj ☃, pr ☃)
  {
    if (☃.g(☃, ☃) != 0.0D) {
      ☃.a(2, ☃);
    }
    return true;
  }
  
  public boolean w_()
  {
    return true;
  }
  
  public aba e(zx ☃)
  {
    return aba.d;
  }
  
  public int d(zx ☃)
  {
    return 72000;
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    ☃.a(☃, d(☃));
    return ☃;
  }
  
  public boolean b(afh ☃)
  {
    return ☃ == afi.G;
  }
  
  public int b()
  {
    return this.b.e();
  }
  
  public String h()
  {
    return this.b.toString();
  }
  
  public boolean a(zx ☃, zx ☃)
  {
    if (this.b.f() == ☃.b()) {
      return true;
    }
    return super.a(☃, ☃);
  }
  
  public Multimap<String, qd> i()
  {
    Multimap<String, qd> ☃ = super.i();
    
    ☃.put(vy.e.a(), new qd(f, "Weapon modifier", this.a, 0));
    
    return ☃;
  }
}
