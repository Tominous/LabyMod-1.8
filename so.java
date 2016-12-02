import com.google.common.base.Predicate;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class so
  extends rd
{
  private static final Logger a = ;
  private ps b;
  private final Predicate<pk> c;
  private final sp.a d;
  private pr e;
  
  public so(ps ☃)
  {
    b = ☃;
    if ((☃ instanceof py)) {
      a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
    }
    c = new Predicate()
    {
      public boolean a(pk ☃)
      {
        if (!(☃ instanceof wn)) {
          return false;
        }
        if (bA.a) {
          return false;
        }
        double ☃ = f();
        if (☃.av()) {
          ☃ *= 0.800000011920929D;
        }
        if (☃.ax())
        {
          float ☃ = ((wn)☃).bY();
          if (☃ < 0.1F) {
            ☃ = 0.1F;
          }
          ☃ *= 0.7F * ☃;
        }
        if (☃.g(so.a(so.this)) > ☃) {
          return false;
        }
        return st.a(so.a(so.this), (pr)☃, false, true);
      }
    };
    d = new sp.a(☃);
  }
  
  public boolean a()
  {
    double ☃ = f();
    List<wn> ☃ = b.o.a(wn.class, b.aR().b(☃, 4.0D, ☃), c);
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
    if (((☃ instanceof wn)) && (bA.a)) {
      return false;
    }
    auq ☃ = b.bO();
    auq ☃ = ☃.bO();
    if ((☃ != null) && (☃ == ☃)) {
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
