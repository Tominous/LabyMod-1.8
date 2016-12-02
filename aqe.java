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
      this.a = ☃[0];
      this.b = ☃[1];
      this.c = ☃[2];
      this.d = ☃[3];
      this.e = ☃[4];
      this.f = ☃[5];
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
    this.a = ☃.a;
    this.b = ☃.b;
    this.c = ☃.c;
    this.d = ☃.d;
    this.e = ☃.e;
    this.f = ☃.f;
  }
  
  public aqe(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
    this.f = ☃;
  }
  
  public aqe(df ☃, df ☃)
  {
    this.a = Math.min(☃.n(), ☃.n());
    this.b = Math.min(☃.o(), ☃.o());
    this.c = Math.min(☃.p(), ☃.p());
    this.d = Math.max(☃.n(), ☃.n());
    this.e = Math.max(☃.o(), ☃.o());
    this.f = Math.max(☃.p(), ☃.p());
  }
  
  public aqe(int ☃, int ☃, int ☃, int ☃)
  {
    this.a = ☃;
    this.c = ☃;
    this.d = ☃;
    this.f = ☃;
    
    this.b = 1;
    this.e = 512;
  }
  
  public boolean a(aqe ☃)
  {
    return (this.d >= ☃.a) && (this.a <= ☃.d) && (this.f >= ☃.c) && (this.c <= ☃.f) && (this.e >= ☃.b) && (this.b <= ☃.e);
  }
  
  public boolean a(int ☃, int ☃, int ☃, int ☃)
  {
    return (this.d >= ☃) && (this.a <= ☃) && (this.f >= ☃) && (this.c <= ☃);
  }
  
  public void b(aqe ☃)
  {
    this.a = Math.min(this.a, ☃.a);
    this.b = Math.min(this.b, ☃.b);
    this.c = Math.min(this.c, ☃.c);
    this.d = Math.max(this.d, ☃.d);
    this.e = Math.max(this.e, ☃.e);
    this.f = Math.max(this.f, ☃.f);
  }
  
  public void a(int ☃, int ☃, int ☃)
  {
    this.a += ☃;
    this.b += ☃;
    this.c += ☃;
    this.d += ☃;
    this.e += ☃;
    this.f += ☃;
  }
  
  public boolean b(df ☃)
  {
    return (☃.n() >= this.a) && (☃.n() <= this.d) && (☃.p() >= this.c) && (☃.p() <= this.f) && (☃.o() >= this.b) && (☃.o() <= this.e);
  }
  
  public df b()
  {
    return new df(this.d - this.a, this.e - this.b, this.f - this.c);
  }
  
  public int c()
  {
    return this.d - this.a + 1;
  }
  
  public int d()
  {
    return this.e - this.b + 1;
  }
  
  public int e()
  {
    return this.f - this.c + 1;
  }
  
  public df f()
  {
    return new cj(this.a + (this.d - this.a + 1) / 2, this.b + (this.e - this.b + 1) / 2, this.c + (this.f - this.c + 1) / 2);
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("x0", this.a).add("y0", this.b).add("z0", this.c).add("x1", this.d).add("y1", this.e).add("z1", this.f).toString();
  }
  
  public ds g()
  {
    return new ds(new int[] { this.a, this.b, this.c, this.d, this.e, this.f });
  }
}
