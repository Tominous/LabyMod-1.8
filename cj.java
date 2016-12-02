import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

public class cj
  extends df
{
  public static final cj a = new cj(0, 0, 0);
  private static final int c = 1 + ns.c(ns.b(30000000));
  private static final int d = c;
  private static final int e = 64 - c - d;
  private static final int f = 0 + d;
  private static final int g = f + e;
  private static final long h = (1L << c) - 1L;
  private static final long i = (1L << e) - 1L;
  private static final long j = (1L << d) - 1L;
  
  public cj(int ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃);
  }
  
  public cj(double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃);
  }
  
  public cj(pk ☃)
  {
    this(☃.s, ☃.t, ☃.u);
  }
  
  public cj(aui ☃)
  {
    this(☃.a, ☃.b, ☃.c);
  }
  
  public cj(df ☃)
  {
    this(☃.n(), ☃.o(), ☃.p());
  }
  
  public cj a(double ☃, double ☃, double ☃)
  {
    if ((☃ == 0.0D) && (☃ == 0.0D) && (☃ == 0.0D)) {
      return this;
    }
    return new cj(n() + ☃, o() + ☃, p() + ☃);
  }
  
  public cj a(int ☃, int ☃, int ☃)
  {
    if ((☃ == 0) && (☃ == 0) && (☃ == 0)) {
      return this;
    }
    return new cj(n() + ☃, o() + ☃, p() + ☃);
  }
  
  public cj a(df ☃)
  {
    if ((☃.n() == 0) && (☃.o() == 0) && (☃.p() == 0)) {
      return this;
    }
    return new cj(n() + ☃.n(), o() + ☃.o(), p() + ☃.p());
  }
  
  public cj b(df ☃)
  {
    if ((☃.n() == 0) && (☃.o() == 0) && (☃.p() == 0)) {
      return this;
    }
    return new cj(n() - ☃.n(), o() - ☃.o(), p() - ☃.p());
  }
  
  public cj a()
  {
    return b(1);
  }
  
  public cj b(int ☃)
  {
    return a(cq.b, ☃);
  }
  
  public cj b()
  {
    return c(1);
  }
  
  public cj c(int ☃)
  {
    return a(cq.a, ☃);
  }
  
  public cj c()
  {
    return d(1);
  }
  
  public cj d(int ☃)
  {
    return a(cq.c, ☃);
  }
  
  public cj d()
  {
    return e(1);
  }
  
  public cj e(int ☃)
  {
    return a(cq.d, ☃);
  }
  
  public cj e()
  {
    return f(1);
  }
  
  public cj f(int ☃)
  {
    return a(cq.e, ☃);
  }
  
  public cj f()
  {
    return g(1);
  }
  
  public cj g(int ☃)
  {
    return a(cq.f, ☃);
  }
  
  public cj a(cq ☃)
  {
    return a(☃, 1);
  }
  
  public cj a(cq ☃, int ☃)
  {
    if (☃ == 0) {
      return this;
    }
    return new cj(n() + ☃.g() * ☃, o() + ☃.h() * ☃, p() + ☃.i() * ☃);
  }
  
  public cj c(df ☃)
  {
    return new cj(o() * ☃.p() - p() * ☃.o(), p() * ☃.n() - n() * ☃.p(), n() * ☃.o() - o() * ☃.n());
  }
  
  public long g()
  {
    return (n() & h) << g | (o() & i) << f | (p() & j) << 0;
  }
  
  public static cj a(long ☃)
  {
    int ☃ = (int)(☃ << 64 - g - c >> 64 - c);
    int ☃ = (int)(☃ << 64 - f - e >> 64 - e);
    int ☃ = (int)(☃ << 64 - d >> 64 - d);
    
    return new cj(☃, ☃, ☃);
  }
  
  public static Iterable<cj> a(cj ☃, cj ☃)
  {
    cj ☃ = new cj(Math.min(☃.n(), ☃.n()), Math.min(☃.o(), ☃.o()), Math.min(☃.p(), ☃.p()));
    final cj ☃ = new cj(Math.max(☃.n(), ☃.n()), Math.max(☃.o(), ☃.o()), Math.max(☃.p(), ☃.p()));
    
    new Iterable()
    {
      public Iterator<cj> iterator()
      {
        new AbstractIterator()
        {
          private cj b = null;
          
          protected cj a()
          {
            if (this.b == null)
            {
              this.b = cj.1.this.a;
              return this.b;
            }
            if (this.b.equals(cj.1.this.b)) {
              return (cj)endOfData();
            }
            int ☃ = this.b.n();
            int ☃ = this.b.o();
            int ☃ = this.b.p();
            if (☃ < cj.1.this.b.n())
            {
              ☃++;
            }
            else if (☃ < cj.1.this.b.o())
            {
              ☃ = cj.1.this.a.n();
              ☃++;
            }
            else if (☃ < cj.1.this.b.p())
            {
              ☃ = cj.1.this.a.n();
              ☃ = cj.1.this.a.o();
              ☃++;
            }
            this.b = new cj(☃, ☃, ☃);
            return this.b;
          }
        };
      }
    };
  }
  
  public static final class a
    extends cj
  {
    private int c;
    private int d;
    private int e;
    
    public a()
    {
      this(0, 0, 0);
    }
    
    public a(int ☃, int ☃, int ☃)
    {
      super(0, 0);
      this.c = ☃;
      this.d = ☃;
      this.e = ☃;
    }
    
    public int n()
    {
      return this.c;
    }
    
    public int o()
    {
      return this.d;
    }
    
    public int p()
    {
      return this.e;
    }
    
    public a c(int ☃, int ☃, int ☃)
    {
      this.c = ☃;
      this.d = ☃;
      this.e = ☃;
      return this;
    }
  }
  
  public static Iterable<cj.a> b(cj ☃, cj ☃)
  {
    cj ☃ = new cj(Math.min(☃.n(), ☃.n()), Math.min(☃.o(), ☃.o()), Math.min(☃.p(), ☃.p()));
    final cj ☃ = new cj(Math.max(☃.n(), ☃.n()), Math.max(☃.o(), ☃.o()), Math.max(☃.p(), ☃.p()));
    
    new Iterable()
    {
      public Iterator<cj.a> iterator()
      {
        new AbstractIterator()
        {
          private cj.a b = null;
          
          protected cj.a a()
          {
            if (this.b == null)
            {
              this.b = new cj.a(cj.2.this.a.n(), cj.2.this.a.o(), cj.2.this.a.p());
              return this.b;
            }
            if (this.b.equals(cj.2.this.b)) {
              return (cj.a)endOfData();
            }
            int ☃ = this.b.n();
            int ☃ = this.b.o();
            int ☃ = this.b.p();
            if (☃ < cj.2.this.b.n())
            {
              ☃++;
            }
            else if (☃ < cj.2.this.b.o())
            {
              ☃ = cj.2.this.a.n();
              ☃++;
            }
            else if (☃ < cj.2.this.b.p())
            {
              ☃ = cj.2.this.a.n();
              ☃ = cj.2.this.a.o();
              ☃++;
            }
            cj.a.a(this.b, ☃);
            cj.a.b(this.b, ☃);
            cj.a.c(this.b, ☃);
            return this.b;
          }
        };
      }
    };
  }
}
