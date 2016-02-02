import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class sn
  extends rd
{
  private static final Logger a = ;
  private ps b;
  private final Predicate<pr> c;
  private final sp.a d;
  private pr e;
  private Class<? extends pr> f;
  
  public sn(ps ☃, Class<? extends pr> ☃)
  {
    this.b = ☃;
    this.f = ☃;
    if ((☃ instanceof py)) {
      a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
    }
    this.c = new Predicate()
    {
      public boolean a(pr ☃)
      {
        double ☃ = sn.this.f();
        if (☃.av()) {
          ☃ *= 0.800000011920929D;
        }
        if (☃.ax()) {
          return false;
        }
        if (☃.g(sn.a(sn.this)) > ☃) {
          return false;
        }
        return st.a(sn.a(sn.this), ☃, false, true);
      }
    };
    this.d = new sp.a(☃);
  }
  
  public boolean a()
  {
    double ☃ = f();
    List<pr> ☃ = this.b.o.a(this.f, this.b.aR().b(☃, 4.0D, ☃), this.c);
    Collections.sort(☃, this.d);
    if (☃.isEmpty()) {
      return false;
    }
    this.e = ((pr)☃.get(0));
    return true;
  }
  
  public boolean b()
  {
    pr ☃ = this.b.u();
    if (☃ == null) {
      return false;
    }
    if (!☃.ai()) {
      return false;
    }
    double ☃ = f();
    if (this.b.h(☃) > ☃ * ☃) {
      return false;
    }
    if (((☃ instanceof lf)) && 
      (((lf)☃).c.d())) {
      return false;
    }
    return true;
  }
  
  public void c()
  {
    this.b.d(this.e);
    super.c();
  }
  
  public void d()
  {
    this.b.d(null);
    super.c();
  }
  
  protected double f()
  {
    qc ☃ = this.b.a(vy.b);
    return ☃ == null ? 16.0D : ☃.e();
  }
}
