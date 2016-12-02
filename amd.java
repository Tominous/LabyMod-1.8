import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;
import com.google.common.base.Predicate;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class amd
{
  private final Predicate<amc>[][][] a;
  private final int b;
  private final int c;
  private final int d;
  
  public amd(Predicate<amc>[][][] ☃)
  {
    a = ☃;
    
    b = ☃.length;
    if (b > 0)
    {
      c = ☃[0].length;
      if (c > 0) {
        d = ☃[0][0].length;
      } else {
        d = 0;
      }
    }
    else
    {
      c = 0;
      d = 0;
    }
  }
  
  public int b()
  {
    return c;
  }
  
  public int c()
  {
    return d;
  }
  
  private amd.b a(cj ☃, cq ☃, cq ☃, LoadingCache<cj, amc> ☃)
  {
    for (int ☃ = 0; ☃ < d; ☃++) {
      for (int ☃ = 0; ☃ < c; ☃++) {
        for (int ☃ = 0; ☃ < b; ☃++) {
          if (!a[☃][☃][☃].apply(☃.getUnchecked(a(☃, ☃, ☃, ☃, ☃, ☃)))) {
            return null;
          }
        }
      }
    }
    return new amd.b(☃, ☃, ☃, ☃, d, c, b);
  }
  
  public amd.b a(adm ☃, cj ☃)
  {
    LoadingCache<cj, amc> ☃ = a(☃, false);
    
    int ☃ = Math.max(Math.max(d, c), b);
    for (cj ☃ : cj.a(☃, ☃.a(☃ - 1, ☃ - 1, ☃ - 1))) {
      for (cq ☃ : cq.values()) {
        for (cq ☃ : cq.values()) {
          if ((☃ != ☃) && (☃ != ☃.d()))
          {
            amd.b ☃ = a(☃, ☃, ☃, ☃);
            if (☃ != null) {
              return ☃;
            }
          }
        }
      }
    }
    return null;
  }
  
  public static LoadingCache<cj, amc> a(adm ☃, boolean ☃)
  {
    return CacheBuilder.newBuilder().build(new amd.a(☃, ☃));
  }
  
  protected static cj a(cj ☃, cq ☃, cq ☃, int ☃, int ☃, int ☃)
  {
    if ((☃ == ☃) || (☃ == ☃.d())) {
      throw new IllegalArgumentException("Invalid forwards & up combination");
    }
    df ☃ = new df(☃.g(), ☃.h(), ☃.i());
    df ☃ = new df(☃.g(), ☃.h(), ☃.i());
    df ☃ = ☃.d(☃);
    
    return ☃.a(☃.n() * -☃ + ☃.n() * ☃ + ☃.n() * ☃, ☃.o() * -☃ + ☃.o() * ☃ + ☃.o() * ☃, ☃.p() * -☃ + ☃.p() * ☃ + ☃.p() * ☃);
  }
  
  static class a
    extends CacheLoader<cj, amc>
  {
    private final adm a;
    private final boolean b;
    
    public a(adm ☃, boolean ☃)
    {
      a = ☃;
      b = ☃;
    }
    
    public amc a(cj ☃)
      throws Exception
    {
      return new amc(a, ☃, b);
    }
  }
  
  public static class b
  {
    private final cj a;
    private final cq b;
    private final cq c;
    private final LoadingCache<cj, amc> d;
    private final int e;
    private final int f;
    private final int g;
    
    public b(cj ☃, cq ☃, cq ☃, LoadingCache<cj, amc> ☃, int ☃, int ☃, int ☃)
    {
      a = ☃;
      b = ☃;
      c = ☃;
      d = ☃;
      e = ☃;
      f = ☃;
      g = ☃;
    }
    
    public cj a()
    {
      return a;
    }
    
    public cq b()
    {
      return b;
    }
    
    public cq c()
    {
      return c;
    }
    
    public int d()
    {
      return e;
    }
    
    public int e()
    {
      return f;
    }
    
    public amc a(int ☃, int ☃, int ☃)
    {
      return (amc)d.getUnchecked(amd.a(a, b(), c(), ☃, ☃, ☃));
    }
    
    public String toString()
    {
      return Objects.toStringHelper(this).add("up", c).add("forwards", b).add("frontTopLeft", a).toString();
    }
  }
}
