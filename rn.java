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
    a = ☃;
    b = ☃;
    e = ☃;
    a(1);
    if (!(☃.s() instanceof sv)) {
      throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
    }
  }
  
  public boolean a()
  {
    f();
    if ((e) && (a.o.w())) {
      return false;
    }
    tf ☃ = a.o.ae().a(new cj(a), 0);
    if (☃ == null) {
      return false;
    }
    d = a(☃);
    if (d == null) {
      return false;
    }
    sv ☃ = (sv)a.s();
    boolean ☃ = ☃.g();
    ☃.b(false);
    c = ☃.a(d.d());
    ☃.b(☃);
    if (c != null) {
      return true;
    }
    aui ☃ = tc.a(a, 10, 7, new aui(d.d().n(), d.d().o(), d.d().p()));
    if (☃ == null) {
      return false;
    }
    ☃.b(false);
    c = a.s().a(a, b, c);
    ☃.b(☃);
    return c != null;
  }
  
  public boolean b()
  {
    if (a.s().m()) {
      return false;
    }
    float ☃ = a.J + 4.0F;
    return a.b(d.d()) > ☃ * ☃;
  }
  
  public void c()
  {
    a.s().a(c, b);
  }
  
  public void d()
  {
    if ((a.s().m()) || (a.b(d.d()) < 16.0D)) {
      f.add(d);
    }
  }
  
  private te a(tf ☃)
  {
    te ☃ = null;
    int ☃ = Integer.MAX_VALUE;
    List<te> ☃ = ☃.f();
    for (te ☃ : ☃)
    {
      int ☃ = ☃.b(ns.c(a.s), ns.c(a.t), ns.c(a.u));
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
    for (te ☃ : f) {
      if (☃.d().equals(☃.d())) {
        return true;
      }
    }
    return false;
  }
  
  private void f()
  {
    if (f.size() > 15) {
      f.remove(0);
    }
  }
}
