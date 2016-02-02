import com.google.common.collect.Multimap;
import java.util.Set;

public class za
  extends zw
{
  private Set<afh> c;
  protected float a = 4.0F;
  private float d;
  protected zw.a b;
  
  protected za(float ☃, zw.a ☃, Set<afh> ☃)
  {
    this.b = ☃;
    this.c = ☃;
    this.h = 1;
    d(☃.a());
    this.a = ☃.b();
    this.d = (☃ + ☃.c());
    a(yz.i);
  }
  
  public float a(zx ☃, afh ☃)
  {
    return this.c.contains(☃) ? this.a : 1.0F;
  }
  
  public boolean a(zx ☃, pr ☃, pr ☃)
  {
    ☃.a(2, ☃);
    return true;
  }
  
  public boolean a(zx ☃, adm ☃, afh ☃, cj ☃, pr ☃)
  {
    if (☃.g(☃, ☃) != 0.0D) {
      ☃.a(1, ☃);
    }
    return true;
  }
  
  public boolean w_()
  {
    return true;
  }
  
  public zw.a g()
  {
    return this.b;
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
    
    ☃.put(vy.e.a(), new qd(f, "Tool modifier", this.d, 0));
    
    return ☃;
  }
}
