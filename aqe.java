import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;

public class aqe
{
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  
  public aqe() {}
  
  public aqe(int[] ☃)
  {
    if (☃.length == 6)
    {
      a = ☃[0];
      b = ☃[1];
      c = ☃[2];
      d = ☃[3];
      e = ☃[4];
      f = ☃[5];
    }
  }
  
  public static aqe a()
  {
    return new aqe(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
  }
  
  public static aqe a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, cq ☃)
  {
    switch (aqe.1.a[☃.ordinal()])
    {
    default: 
      return new aqe(☃ + ☃, ☃ + ☃, ☃ + ☃, ☃ + ☃ - 1 + ☃, ☃ + ☃ - 1 + ☃, ☃ + ☃ - 1 + ☃);
    case 1: 
      return new aqe(☃ + ☃, ☃ + ☃, ☃ - ☃ + 1 + ☃, ☃ + ☃ - 1 + ☃, ☃ + ☃ - 1 + ☃, ☃ + ☃);
    case 2: 
      return new aqe(☃ + ☃, ☃ + ☃, ☃ + ☃, ☃ + ☃ - 1 + ☃, ☃ + ☃ - 1 + ☃, ☃ + ☃ - 1 + ☃);
    case 3: 
      return new aqe(☃ - ☃ + 1 + ☃, ☃ + ☃, ☃ + ☃, ☃ + ☃, ☃ + ☃ - 1 + ☃, ☃ + ☃ - 1 + ☃);
    }
    return new aqe(☃ + ☃, ☃ + ☃, ☃ + ☃, ☃ + ☃ - 1 + ☃, ☃ + ☃ - 1 + ☃, ☃ + ☃ - 1 + ☃);
  }
  
  public static aqe a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    return new aqe(Math.min(☃, ☃), Math.min(☃, ☃), Math.min(☃, ☃), Math.max(☃, ☃), Math.max(☃, ☃), Math.max(☃, ☃));
  }
  
  public aqe(aqe ☃)
  {
    a = a;
    b = b;
    c = c;
    d = d;
    e = e;
    f = f;
  }
  
  public aqe(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
    f = ☃;
  }
  
  public aqe(df ☃, df ☃)
  {
    a = Math.min(☃.n(), ☃.n());
    b = Math.min(☃.o(), ☃.o());
    c = Math.min(☃.p(), ☃.p());
    d = Math.max(☃.n(), ☃.n());
    e = Math.max(☃.o(), ☃.o());
    f = Math.max(☃.p(), ☃.p());
  }
  
  public aqe(int ☃, int ☃, int ☃, int ☃)
  {
    a = ☃;
    c = ☃;
    d = ☃;
    f = ☃;
    
    b = 1;
    e = 512;
  }
  
  public boolean a(aqe ☃)
  {
    return (d >= a) && (a <= d) && (f >= c) && (c <= f) && (e >= b) && (b <= e);
  }
  
  public boolean a(int ☃, int ☃, int ☃, int ☃)
  {
    return (d >= ☃) && (a <= ☃) && (f >= ☃) && (c <= ☃);
  }
  
  public void b(aqe ☃)
  {
    a = Math.min(a, a);
    b = Math.min(b, b);
    c = Math.min(c, c);
    d = Math.max(d, d);
    e = Math.max(e, e);
    f = Math.max(f, f);
  }
  
  public void a(int ☃, int ☃, int ☃)
  {
    a += ☃;
    b += ☃;
    c += ☃;
    d += ☃;
    e += ☃;
    f += ☃;
  }
  
  public boolean b(df ☃)
  {
    return (☃.n() >= a) && (☃.n() <= d) && (☃.p() >= c) && (☃.p() <= f) && (☃.o() >= b) && (☃.o() <= e);
  }
  
  public df b()
  {
    return new df(d - a, e - b, f - c);
  }
  
  public int c()
  {
    return d - a + 1;
  }
  
  public int d()
  {
    return e - b + 1;
  }
  
  public int e()
  {
    return f - c + 1;
  }
  
  public df f()
  {
    return new cj(a + (d - a + 1) / 2, b + (e - b + 1) / 2, c + (f - c + 1) / 2);
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("x0", a).add("y0", b).add("z0", c).add("x1", d).add("y1", e).add("z1", f).toString();
  }
  
  public ds g()
  {
    return new ds(new int[] { a, b, c, d, e, f });
  }
}
