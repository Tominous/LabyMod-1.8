import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;

public class qs<T extends pk>
  extends rd
{
  private final Predicate<pk> c = new Predicate()
  {
    public boolean a(pk ☃)
    {
      return (☃.ai()) && (a.t().a(☃));
    }
  };
  protected py a;
  private double d;
  private double e;
  protected T b;
  private float f;
  private asx g;
  private sw h;
  private Class<T> i;
  private Predicate<? super T> j;
  
  public qs(py ☃, Class<T> ☃, float ☃, double ☃, double ☃)
  {
    this(☃, ☃, Predicates.alwaysTrue(), ☃, ☃, ☃);
  }
  
  public qs(py ☃, Class<T> ☃, Predicate<? super T> ☃, float ☃, double ☃, double ☃)
  {
    a = ☃;
    i = ☃;
    j = ☃;
    f = ☃;
    d = ☃;
    e = ☃;
    h = ☃.s();
    a(1);
  }
  
  public boolean a()
  {
    List<T> ☃ = a.o.a(i, a.aR().b(f, 3.0D, f), Predicates.and(new Predicate[] { po.d, c, j }));
    if (☃.isEmpty()) {
      return false;
    }
    b = ((pk)☃.get(0));
    
    aui ☃ = tc.b(a, 16, 7, new aui(b.s, b.t, b.u));
    if (☃ == null) {
      return false;
    }
    if (b.e(a, b, c) < b.h(a)) {
      return false;
    }
    g = h.a(a, b, c);
    if (g == null) {
      return false;
    }
    if (!g.b(☃)) {
      return false;
    }
    return true;
  }
  
  public boolean b()
  {
    return !h.m();
  }
  
  public void c()
  {
    h.a(g, d);
  }
  
  public void d()
  {
    b = null;
  }
  
  public void e()
  {
    if (a.h(b) < 49.0D) {
      a.s().a(e);
    } else {
      a.s().a(d);
    }
  }
}
