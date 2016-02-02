public class nm<V>
{
  private transient nm.a<V>[] a;
  private transient int b;
  private int c;
  private final float d;
  
  public nm()
  {
    this.d = 0.75F;
    this.c = 12;
    this.a = new nm.a[16];
  }
  
  private static int g(int ☃)
  {
    ☃ ^= ☃ >>> 20 ^ ☃ >>> 12;
    return ☃ ^ ☃ >>> 7 ^ ☃ >>> 4;
  }
  
  private static int a(int ☃, int ☃)
  {
    return ☃ & ☃ - 1;
  }
  
  public V a(int ☃)
  {
    int ☃ = g(☃);
    for (nm.a<V> ☃ = this.a[a(☃, this.a.length)]; ☃ != null; ☃ = ☃.c) {
      if (☃.a == ☃) {
        return (V)☃.b;
      }
    }
    return null;
  }
  
  public boolean b(int ☃)
  {
    return c(☃) != null;
  }
  
  final nm.a<V> c(int ☃)
  {
    int ☃ = g(☃);
    for (nm.a<V> ☃ = this.a[a(☃, this.a.length)]; ☃ != null; ☃ = ☃.c) {
      if (☃.a == ☃) {
        return ☃;
      }
    }
    return null;
  }
  
  public void a(int ☃, V ☃)
  {
    int ☃ = g(☃);
    int ☃ = a(☃, this.a.length);
    for (nm.a<V> ☃ = this.a[☃]; ☃ != null; ☃ = ☃.c) {
      if (☃.a == ☃)
      {
        ☃.b = ☃;
        return;
      }
    }
    a(☃, ☃, ☃, ☃);
  }
  
  private void h(int ☃)
  {
    nm.a<V>[] ☃ = this.a;
    int ☃ = ☃.length;
    if (☃ == 1073741824)
    {
      this.c = Integer.MAX_VALUE;
      return;
    }
    nm.a<V>[] ☃ = new nm.a[☃];
    a(☃);
    this.a = ☃;
    this.c = ((int)(☃ * this.d));
  }
  
  private void a(nm.a<V>[] ☃)
  {
    nm.a<V>[] ☃ = this.a;
    int ☃ = ☃.length;
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      nm.a<V> ☃ = ☃[☃];
      if (☃ != null)
      {
        ☃[☃] = null;
        do
        {
          nm.a<V> ☃ = ☃.c;
          int ☃ = a(☃.d, ☃);
          ☃.c = ☃[☃];
          ☃[☃] = ☃;
          ☃ = ☃;
        } while (☃ != null);
      }
    }
  }
  
  public V d(int ☃)
  {
    nm.a<V> ☃ = e(☃);
    return ☃ == null ? null : ☃.b;
  }
  
  final nm.a<V> e(int ☃)
  {
    int ☃ = g(☃);
    int ☃ = a(☃, this.a.length);
    nm.a<V> ☃ = this.a[☃];
    nm.a<V> ☃ = ☃;
    while (☃ != null)
    {
      nm.a<V> ☃ = ☃.c;
      if (☃.a == ☃)
      {
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
  
  public void c()
  {
    nm.a<V>[] ☃ = this.a;
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      ☃[☃] = null;
    }
    this.b = 0;
  }
  
  static class a<V>
  {
    final int a;
    V b;
    a<V> c;
    final int d;
    
    a(int ☃, int ☃, V ☃, a<V> ☃)
    {
      this.b = ☃;
      this.c = ☃;
      this.a = ☃;
      this.d = ☃;
    }
    
    public final int a()
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
      Object ☃ = Integer.valueOf(a());
      Object ☃ = Integer.valueOf(☃.a());
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
      return nm.f(this.a);
    }
    
    public final String toString()
    {
      return a() + "=" + b();
    }
  }
  
  private void a(int ☃, int ☃, V ☃, int ☃)
  {
    nm.a<V> ☃ = this.a[☃];
    this.a[☃] = new nm.a(☃, ☃, ☃, ☃);
    if (this.b++ >= this.c) {
      h(2 * this.a.length);
    }
  }
}
