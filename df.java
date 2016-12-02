import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;

public class df
  implements Comparable<df>
{
  public static final df b = new df(0, 0, 0);
  private final int a;
  private final int c;
  private final int d;
  
  public df(int ☃, int ☃, int ☃)
  {
    this.a = ☃;
    this.c = ☃;
    this.d = ☃;
  }
  
  public df(double ☃, double ☃, double ☃)
  {
    this(ns.c(☃), ns.c(☃), ns.c(☃));
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if (!(☃ instanceof df)) {
      return false;
    }
    df ☃ = (df)☃;
    if (n() != ☃.n()) {
      return false;
    }
    if (o() != ☃.o()) {
      return false;
    }
    if (p() != ☃.p()) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    return (o() + p() * 31) * 31 + n();
  }
  
  public int g(df ☃)
  {
    if (o() == ☃.o())
    {
      if (p() == ☃.p()) {
        return n() - ☃.n();
      }
      return p() - ☃.p();
    }
    return o() - ☃.o();
  }
  
  public int n()
  {
    return this.a;
  }
  
  public int o()
  {
    return this.c;
  }
  
  public int p()
  {
    return this.d;
  }
  
  public df d(df ☃)
  {
    return new df(o() * ☃.p() - p() * ☃.o(), p() * ☃.n() - n() * ☃.p(), n() * ☃.o() - o() * ☃.n());
  }
  
  public double c(double ☃, double ☃, double ☃)
  {
    double ☃ = n() - ☃;
    double ☃ = o() - ☃;
    double ☃ = p() - ☃;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public double d(double ☃, double ☃, double ☃)
  {
    double ☃ = n() + 0.5D - ☃;
    double ☃ = o() + 0.5D - ☃;
    double ☃ = p() + 0.5D - ☃;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public double i(df ☃)
  {
    return c(☃.n(), ☃.o(), ☃.p());
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("x", n()).add("y", o()).add("z", p()).toString();
  }
}
