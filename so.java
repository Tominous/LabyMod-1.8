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
    this.b = ☃;
    if ((☃ instanceof py)) {
      a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
    }
    this.c = new Predicate()
    {
      public boolean a(pk ☃)
      {
        if (!(☃ instanceof wn)) {
          return false;
        }
        if (((wn)☃).bA.a) {
          return false;
        }
        double ☃ = so.this.f();
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
    this.d = new sp.a(☃);
  }
  
  public boolean a()
  {
    double ☃ = f();
    List<wn> ☃ = this.b.o.a(wn.class, this.b.aR().b(☃, 4.0D, ☃), this.c);
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
    if (((☃ instanceof wn)) && (((wn)☃).bA.a)) {
      return false;
    }
    auq ☃ = this.b.bO();
    auq ☃ = ☃.bO();
    if ((☃ != null) && (☃ == ☃)) {
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
