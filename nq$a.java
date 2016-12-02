class nq$a<V>
{
  final long a;
  V b;
  a<V> c;
  final int d;
  
  nq$a(int ☃, long ☃, V ☃, a<V> ☃)
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
