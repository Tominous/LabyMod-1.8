import com.google.common.collect.Lists;
import java.util.List;

public class rn
  extends rd
{
  private py a;
  private double b;
  private asx c;
  private te d;
  private boolean e;
  private List<te> f = Lists.newArrayList();
  
  public rn(py ☃, double ☃, boolean ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.e = ☃;
    a(1);
    if (!(☃.s() instanceof sv)) {
      throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
    }
  }
  
  public boolean a()
  {
    f();
    if ((this.e) && (this.a.o.w())) {
      return false;
    }
    tf ☃ = this.a.o.ae().a(new cj(this.a), 0);
    if (☃ == null) {
      return false;
    }
    this.d = a(☃);
    if (this.d == null) {
      return false;
    }
    sv ☃ = (sv)this.a.s();
    boolean ☃ = ☃.g();
    ☃.b(false);
    this.c = ☃.a(this.d.d());
    ☃.b(☃);
    if (this.c != null) {
      return true;
    }
    aui ☃ = tc.a(this.a, 10, 7, new aui(this.d.d().n(), this.d.d().o(), this.d.d().p()));
    if (☃ == null) {
      return false;
    }
    ☃.b(false);
    this.c = this.a.s().a(☃.a, ☃.b, ☃.c);
    ☃.b(☃);
    return this.c != null;
  }
  
  public boolean b()
  {
    if (this.a.s().m()) {
      return false;
    }
    float ☃ = this.a.J + 4.0F;
    return this.a.b(this.d.d()) > ☃ * ☃;
  }
  
  public void c()
  {
    this.a.s().a(this.c, this.b);
  }
  
  public void d()
  {
    if ((this.a.s().m()) || (this.a.b(this.d.d()) < 16.0D)) {
      this.f.add(this.d);
    }
  }
  
  private te a(tf ☃)
  {
    te ☃ = null;
    int ☃ = Integer.MAX_VALUE;
    List<te> ☃ = ☃.f();
    for (te ☃ : ☃)
    {
      int ☃ = ☃.b(ns.c(this.a.s), ns.c(this.a.t), ns.c(this.a.u));
      if (☃ < ☃) {
        if (!a(☃))
        {
          ☃ = ☃;
          ☃ = ☃;
        }
      }
    }
    return ☃;
  }
  
  private boolean a(te ☃)
  {
    for (te ☃ : this.f) {
      if (☃.d().equals(☃.d())) {
        return true;
      }
    }
    return false;
  }
  
  private void f()
  {
    if (this.f.size() > 15) {
      this.f.remove(0);
    }
  }
}
