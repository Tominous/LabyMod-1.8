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
    b = ☃;
    f = ☃;
    if ((☃ instanceof py)) {
      a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
    }
    c = new Predicate()
    {
      public boolean a(pr ☃)
      {
        double ☃ = f();
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
    d = new sp.a(☃);
  }
  
  public boolean a()
  {
    double ☃ = f();
    List<pr> ☃ = b.o.a(f, b.aR().b(☃, 4.0D, ☃), c);
    Collections.sort(☃, d);
    if (☃.isEmpty()) {
      return false;
    }
    e = ((pr)☃.get(0));
    return true;
  }
  
  public boolean b()
  {
    pr ☃ = b.u();
    if (☃ == null) {
      return false;
    }
    if (!☃.ai()) {
      return false;
    }
    double ☃ = f();
    if (b.h(☃) > ☃ * ☃) {
      return false;
    }
    if (((☃ instanceof lf)) && 
      (c.d())) {
      return false;
    }
    return true;
  }
  
  public void c()
  {
    b.d(e);
    super.c();
  }
  
  public void d()
  {
    b.d(null);
    super.c();
  }
  
  protected double f()
  {
    qc ☃ = b.a(vy.b);
    return ☃ == null ? 16.0D : ☃.e();
  }
}
