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
      return (☃.ai()) && (qs.this.a.t().a(☃));
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
    this.a = ☃;
    this.i = ☃;
    this.j = ☃;
    this.f = ☃;
    this.d = ☃;
    this.e = ☃;
    this.h = ☃.s();
    a(1);
  }
  
  public boolean a()
  {
    List<T> ☃ = this.a.o.a(this.i, this.a.aR().b(this.f, 3.0D, this.f), Predicates.and(new Predicate[] { po.d, this.c, this.j }));
    if (☃.isEmpty()) {
      return false;
    }
    this.b = ((pk)☃.get(0));
    
    aui ☃ = tc.b(this.a, 16, 7, new aui(this.b.s, this.b.t, this.b.u));
    if (☃ == null) {
      return false;
    }
    if (this.b.e(☃.a, ☃.b, ☃.c) < this.b.h(this.a)) {
      return false;
    }
    this.g = this.h.a(☃.a, ☃.b, ☃.c);
    if (this.g == null) {
      return false;
    }
    if (!this.g.b(☃)) {
      return false;
    }
    return true;
  }
  
  public boolean b()
  {
    return !this.h.m();
  }
  
  public void c()
  {
    this.h.a(this.g, this.d);
  }
  
  public void d()
  {
    this.b = null;
  }
  
  public void e()
  {
    if (this.a.h(this.b) < 49.0D) {
      this.a.s().a(this.e);
    } else {
      this.a.s().a(this.d);
    }
  }
}
