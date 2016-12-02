class nq$a
{
  final long a;
  Object b;
  a c;
  final int d;
  private static final String __OBFID = "CL_00001493";
  
  nq$a(int p_i1553_1_, long p_i1553_2_, Object p_i1553_4_, a p_i1553_5_)
  {
    b = p_i1553_4_;
    c = p_i1553_5_;
    a = p_i1553_2_;
    d = p_i1553_1_;
  }
  
  public final long a()
  {
    return a;
  }
  
  public final Object b()
  {
    return b;
  }
  
  public final boolean equals(Object p_equals_1_)
  {
    if (!(p_equals_1_ instanceof a)) {
      return false;
    }
    a var2 = (a)p_equals_1_;
    Long var3 = Long.valueOf(a());
    Long var4 = Long.valueOf(var2.a());
    if ((var3 == var4) || ((var3 != null) && (var3.equals(var4))))
    {
      Object var5 = b();
      Object var6 = var2.b();
      if ((var5 == var6) || ((var5 != null) && (var5.equals(var6)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return nq.f(a);
  }
  
  public final String toString()
  {
    return a() + "=" + b();
  }
}
