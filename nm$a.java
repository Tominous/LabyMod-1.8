class nm$a<V>
{
  final int a;
  V b;
  a<V> c;
  final int d;
  
  nm$a(int ☃, int ☃, V ☃, a<V> ☃)
  {
    b = ☃;
    c = ☃;
    a = ☃;
    d = ☃;
  }
  
  public final int a()
  {
    return a;
  }
  
  public final V b()
  {
    return (V)b;
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
    return nm.f(a);
  }
  
  public final String toString()
  {
    return a() + "=" + b();
  }
}
