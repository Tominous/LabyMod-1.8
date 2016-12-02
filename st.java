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
    this.e = ☃;
    this.f = ☃;
    this.a = ☃;
  }
  
  public boolean b()
  {
    pr ☃ = this.e.u();
    if (☃ == null) {
      return false;
    }
    if (!☃.ai()) {
      return false;
    }
    auq ☃ = this.e.bO();
    auq ☃ = ☃.bO();
    if ((☃ != null) && (☃ == ☃)) {
      return false;
    }
    double ☃ = f();
    if (this.e.h(☃) > ☃ * ☃) {
      return false;
    }
    if (this.f) {
      if (this.e.t().a(☃)) {
        this.d = 0;
      } else if (++this.d > 60) {
        return false;
      }
    }
    if (((☃ instanceof wn)) && 
      (((wn)☃).bA.a)) {
      return false;
    }
    return true;
  }
  
  protected double f()
  {
    qc ☃ = this.e.a(vy.b);
    return ☃ == null ? 16.0D : ☃.e();
  }
  
  public void c()
  {
    this.b = 0;
    this.c = 0;
    this.d = 0;
  }
  
  public void d()
  {
    this.e.d(null);
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
      (!☃) && (((wn)☃).bA.a))
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
    if (!a(this.e, ☃, ☃, this.f)) {
      return false;
    }
    if (!this.e.e(new cj(☃))) {
      return false;
    }
    if (this.a)
    {
      if (--this.c <= 0) {
        this.b = 0;
      }
      if (this.b == 0) {
        this.b = (a(☃) ? 1 : 2);
      }
      if (this.b == 2) {
        return false;
      }
    }
    return true;
  }
  
  private boolean a(pr ☃)
  {
    this.c = (10 + this.e.bc().nextInt(5));
    asx ☃ = this.e.s().a(☃);
    if (☃ == null) {
      return false;
    }
    asv ☃ = ☃.c();
    if (☃ == null) {
      return false;
    }
    int ☃ = ☃.a - ns.c(☃.s);
    int ☃ = ☃.c - ns.c(☃.u);
    return ☃ * ☃ + ☃ * ☃ <= 2.25D;
  }
}
