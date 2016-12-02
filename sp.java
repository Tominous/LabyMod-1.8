import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class sp<T extends pr>
  extends st
{
  protected final Class<T> a;
  private final int g;
  protected final sp.a b;
  protected Predicate<? super T> c;
  protected pr d;
  
  public sp(py ☃, Class<T> ☃, boolean ☃)
  {
    this(☃, ☃, ☃, false);
  }
  
  public sp(py ☃, Class<T> ☃, boolean ☃, boolean ☃)
  {
    this(☃, ☃, 10, ☃, ☃, null);
  }
  
  public sp(py ☃, Class<T> ☃, int ☃, boolean ☃, boolean ☃, final Predicate<? super T> ☃)
  {
    super(☃, ☃, ☃);
    this.a = ☃;
    this.g = ☃;
    this.b = new sp.a(☃);
    a(1);
    
    this.c = new Predicate()
    {
      public boolean a(T ☃)
      {
        if ((☃ != null) && (!☃.apply(☃))) {
          return false;
        }
        if ((☃ instanceof wn))
        {
          double ☃ = sp.this.f();
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
          if (☃.g(sp.this.e) > ☃) {
            return false;
          }
        }
        return sp.this.a(☃, false);
      }
    };
  }
  
  public boolean a()
  {
    if ((this.g > 0) && (this.e.bc().nextInt(this.g) != 0)) {
      return false;
    }
    double ☃ = f();
    List<T> ☃ = this.e.o.a(this.a, this.e.aR().b(☃, 4.0D, ☃), Predicates.and(this.c, po.d));
    Collections.sort(☃, this.b);
    if (☃.isEmpty()) {
      return false;
    }
    this.d = ((pr)☃.get(0));
    return true;
  }
  
  public void c()
  {
    this.e.d(this.d);
    super.c();
  }
  
  public static class a
    implements Comparator<pk>
  {
    private final pk a;
    
    public a(pk ☃)
    {
      this.a = ☃;
    }
    
    public int a(pk ☃, pk ☃)
    {
      double ☃ = this.a.h(☃);
      double ☃ = this.a.h(☃);
      if (☃ < ☃) {
        return -1;
      }
      if (☃ > ☃) {
        return 1;
      }
      return 0;
    }
  }
}
