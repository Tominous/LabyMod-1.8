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
    this.a = ☃;
    
    this.b = ☃.length;
    if (this.b > 0)
    {
      this.c = ☃[0].length;
      if (this.c > 0) {
        this.d = ☃[0][0].length;
      } else {
        this.d = 0;
      }
    }
    else
    {
      this.c = 0;
      this.d = 0;
    }
  }
  
  public int b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  private amd.b a(cj ☃, cq ☃, cq ☃, LoadingCache<cj, amc> ☃)
  {
    for (int ☃ = 0; ☃ < this.d; ☃++) {
      for (int ☃ = 0; ☃ < this.c; ☃++) {
        for (int ☃ = 0; ☃ < this.b; ☃++) {
          if (!this.a[☃][☃][☃].apply(☃.getUnchecked(a(☃, ☃, ☃, ☃, ☃, ☃)))) {
            return null;
          }
        }
      }
    }
    return new amd.b(☃, ☃, ☃, ☃, this.d, this.c, this.b);
  }
  
  public amd.b a(adm ☃, cj ☃)
  {
    LoadingCache<cj, amc> ☃ = a(☃, false);
    
    int ☃ = Math.max(Math.max(this.d, this.c), this.b);
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
      this.a = ☃;
      this.b = ☃;
    }
    
    public amc a(cj ☃)
      throws Exception
    {
      return new amc(this.a, ☃, this.b);
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
      this.a = ☃;
      this.b = ☃;
      this.c = ☃;
      this.d = ☃;
      this.e = ☃;
      this.f = ☃;
      this.g = ☃;
    }
    
    public cj a()
    {
      return this.a;
    }
    
    public cq b()
    {
      return this.b;
    }
    
    public cq c()
    {
      return this.c;
    }
    
    public int d()
    {
      return this.e;
    }
    
    public int e()
    {
      return this.f;
    }
    
    public amc a(int ☃, int ☃, int ☃)
    {
      return (amc)this.d.getUnchecked(amd.a(this.a, b(), c(), ☃, ☃, ☃));
    }
    
    public String toString()
    {
      return Objects.toStringHelper(this).add("up", this.c).add("forwards", this.b).add("frontTopLeft", this.a).toString();
    }
  }
}
