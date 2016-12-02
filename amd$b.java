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
