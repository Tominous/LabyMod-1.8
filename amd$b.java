import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;
import com.google.common.cache.LoadingCache;

public class amd$b
{
  private final cj a;
  private final cq b;
  private final cq c;
  private final LoadingCache<cj, amc> d;
  private final int e;
  private final int f;
  private final int g;
  
  public amd$b(cj ☃, cq ☃, cq ☃, LoadingCache<cj, amc> ☃, int ☃, int ☃, int ☃)
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
