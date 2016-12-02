public class nq<V>
{
  private transient nq.a<V>[] a;
  private transient int b;
  private int c;
  private int d;
  private final float e;
  private volatile transient int f;
  
  public nq()
  {
    this.e = 0.75F;
    this.d = 3072;
    this.a = new nq.a['က'];
    this.c = (this.a.length - 1);
  }
  
  private static int g(long ☃)
  {
    return a((int)(☃ ^ ☃ >>> 32));
  }
  
  private static int a(int ☃)
  {
    ☃ ^= ☃ >>> 20 ^ ☃ >>> 12;
    return ☃ ^ ☃ >>> 7 ^ ☃ >>> 4;
  }
  
  private static int a(int ☃, int ☃)
  {
    return ☃ & ☃;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public V a(long ☃)
  {
    int ☃ = g(☃);
    for (nq.a<V> ☃ = this.a[a(☃, this.c)]; ☃ != null; ☃ = ☃.c) {
      if (☃.a == ☃) {
        return (V)☃.b;
      }
    }
    return null;
  }
  
  public boolean b(long ☃)
  {
    return c(☃) != null;
  }
  
  final nq.a<V> c(long ☃)
  {
    int ☃ = g(☃);
    for (nq.a<V> ☃ = this.a[a(☃, this.c)]; ☃ != null; ☃ = ☃.c) {
      if (☃.a == ☃) {
        return ☃;
      }
    }
    return null;
  }
  
  public void a(long ☃, V ☃)
  {
    int ☃ = g(☃);
    int ☃ = a(☃, this.c);
    for (nq.a<V> ☃ = this.a[☃]; ☃ != null; ☃ = ☃.c) {
      if (☃.a == ☃)
      {
        ☃.b = ☃;
        return;
      }
    }
    this.f += 1;
    a(☃, ☃, ☃, ☃);
  }
  
  private void b(int ☃)
  {
    nq.a<V>[] ☃ = this.a;
    int ☃ = ☃.length;
    if (☃ == 1073741824)
    {
      this.d = Integer.MAX_VALUE;
      return;
    }
    nq.a<V>[] ☃ = new nq.a[☃];
    a(☃);
    this.a = ☃;
    this.c = (this.a.length - 1);
    this.d = ((int)(☃ * this.e));
  }
  
  private void a(nq.a<V>[] ☃)
  {
    nq.a<V>[] ☃ = this.a;
    int ☃ = ☃.length;
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      nq.a<V> ☃ = ☃[☃];
      if (☃ != null)
      {
        ☃[☃] = null;
        do
        {
          nq.a<V> ☃ = ☃.c;
          int ☃ = a(☃.d, ☃ - 1);
          ☃.c = ☃[☃];
          ☃[☃] = ☃;
          ☃ = ☃;
        } while (☃ != null);
      }
    }
  }
  
  public V d(long ☃)
  {
    nq.a<V> ☃ = e(☃);
    return ☃ == null ? null : ☃.b;
  }
  
  final nq.a<V> e(long ☃)
  {
    int ☃ = g(☃);
    int ☃ = a(☃, this.c);
    nq.a<V> ☃ = this.a[☃];
    nq.a<V> ☃ = ☃;
    while (☃ != null)
    {
      nq.a<V> ☃ = ☃.c;
      if (☃.a == ☃)
      {
        this.f += 1;
        this.b -= 1;
        if (☃ == ☃) {
          this.a[☃] = ☃;
        } else {
          ☃.c = ☃;
        }
        return ☃;
      }
      ☃ = ☃;
      ☃ = ☃;
    }
    return ☃;
  }
  
  static class a<V>
  {
    final long a;
    V b;
    a<V> c;
    final int d;
    
    a(int ☃, long ☃, V ☃, a<V> ☃)
    {
      this.b = ☃;
      this.c = ☃;
      this.a = ☃;
      this.d = ☃;
    }
    
    public final long a()
    {
      return this.a;
    }
    
    public final V b()
    {
      return (V)this.b;
    }
    
    public final boolean equals(Object ☃)
    {
      if (!(☃ instanceof a)) {
        return false;
      }
      a<V> ☃ = (a)☃;
      Object ☃ = Long.valueOf(a());
      Object ☃ = Long.valueOf(☃.a());
      if ((☃ == ☃) || ((☃ != null) && (☃.equals(☃))))
      {
        Object ☃ = b();
        Object ☃ = ☃.b();
        if ((☃ == ☃) || ((☃ != null) && (☃.equals(☃)))) {
          return true;
        }
      }
      return false;
    }
    
    public final int hashCode()
    {
      return nq.f(this.a);
    }
    
    public final String toString()
    {
      return a() + "=" + b();
    }
  }
  
  private void a(int ☃, long ☃, V ☃, int ☃)
  {
    nq.a<V> ☃ = this.a[☃];
    this.a[☃] = new nq.a(☃, ☃, ☃, ☃);
    if (this.b++ >= this.d) {
      b(2 * this.a.length);
    }
  }
}
