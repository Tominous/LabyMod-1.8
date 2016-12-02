import java.util.Random;
import org.apache.commons.lang3.StringUtils;

public abstract class st
  extends rd
{
  protected final py e;
  protected boolean f;
  private boolean a;
  private int b;
  private int c;
  private int d;
  
  public st(py ☃, boolean ☃)
  {
    this(☃, ☃, false);
  }
  
  public st(py ☃, boolean ☃, boolean ☃)
  {
    e = ☃;
    f = ☃;
    a = ☃;
  }
  
  public boolean b()
  {
    pr ☃ = e.u();
    if (☃ == null) {
      return false;
    }
    if (!☃.ai()) {
      return false;
    }
    auq ☃ = e.bO();
    auq ☃ = ☃.bO();
    if ((☃ != null) && (☃ == ☃)) {
      return false;
    }
    double ☃ = f();
    if (e.h(☃) > ☃ * ☃) {
      return false;
    }
    if (f) {
      if (e.t().a(☃)) {
        d = 0;
      } else if (++d > 60) {
        return false;
      }
    }
    if (((☃ instanceof wn)) && 
      (bA.a)) {
      return false;
    }
    return true;
  }
  
  protected double f()
  {
    qc ☃ = e.a(vy.b);
    return ☃ == null ? 16.0D : ☃.e();
  }
  
  public void c()
  {
    b = 0;
    c = 0;
    d = 0;
  }
  
  public void d()
  {
    e.d(null);
  }
  
  public static boolean a(ps ☃, pr ☃, boolean ☃, boolean ☃)
  {
    if (☃ == null) {
      return false;
    }
    if (☃ == ☃) {
      return false;
    }
    if (!☃.ai()) {
      return false;
    }
    if (!☃.a(☃.getClass())) {
      return false;
    }
    auq ☃ = ☃.bO();
    auq ☃ = ☃.bO();
    if ((☃ != null) && (☃ == ☃)) {
      return false;
    }
    if (((☃ instanceof px)) && (StringUtils.isNotEmpty(((px)☃).b())))
    {
      if (((☃ instanceof px)) && (((px)☃).b().equals(((px)☃).b()))) {
        return false;
      }
      if (☃ == ((px)☃).m_()) {
        return false;
      }
    }
    else if (((☃ instanceof wn)) && 
      (!☃) && (bA.a))
    {
      return false;
    }
    if ((☃) && (!☃.t().a(☃))) {
      return false;
    }
    return true;
  }
  
  protected boolean a(pr ☃, boolean ☃)
  {
    if (!a(e, ☃, ☃, f)) {
      return false;
    }
    if (!e.e(new cj(☃))) {
      return false;
    }
    if (a)
    {
      if (--c <= 0) {
        b = 0;
      }
      if (b == 0) {
        b = (a(☃) ? 1 : 2);
      }
      if (b == 2) {
        return false;
      }
    }
    return true;
  }
  
  private boolean a(pr ☃)
  {
    c = (10 + e.bc().nextInt(5));
    asx ☃ = e.s().a(☃);
    if (☃ == null) {
      return false;
    }
    asv ☃ = ☃.c();
    if (☃ == null) {
      return false;
    }
    int ☃ = a - ns.c(s);
    int ☃ = c - ns.c(u);
    return ☃ * ☃ + ☃ * ☃ <= 2.25D;
  }
}
