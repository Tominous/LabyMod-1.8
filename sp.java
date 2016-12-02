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
    a = ☃;
    g = ☃;
    b = new sp.a(☃);
    a(1);
    
    c = new Predicate()
    {
      public boolean a(T ☃)
      {
        if ((☃ != null) && (!☃.apply(☃))) {
          return false;
        }
        if ((☃ instanceof wn))
        {
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
          if (☃.g(e) > ☃) {
            return false;
          }
        }
        return a(☃, false);
      }
    };
  }
  
  public boolean a()
  {
    if ((g > 0) && (e.bc().nextInt(g) != 0)) {
      return false;
    }
    double ☃ = f();
    List<T> ☃ = e.o.a(a, e.aR().b(☃, 4.0D, ☃), Predicates.and(c, po.d));
    Collections.sort(☃, b);
    if (☃.isEmpty()) {
      return false;
    }
    d = ((pr)☃.get(0));
    return true;
  }
  
  public void c()
  {
    e.d(d);
    super.c();
  }
  
  public static class a
    implements Comparator<pk>
  {
    private final pk a;
    
    public a(pk ☃)
    {
      a = ☃;
    }
    
    public int a(pk ☃, pk ☃)
    {
      double ☃ = a.h(☃);
      double ☃ = a.h(☃);
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
