public class nq
{
  private transient nq.a[] a = new nq.a['က'];
  private transient int b;
  private int c;
  private int d = 3072;
  private final float e = 0.75F;
  private volatile transient int f;
  private static final String __OBFID = "CL_00001492";
  
  public nq()
  {
    this.c = (this.a.length - 1);
  }
  
  private static int g(long originalKey)
  {
    return (int)(originalKey ^ originalKey >>> 27);
  }
  
  private static int a(int integer)
  {
    integer ^= integer >>> 20 ^ integer >>> 12;
    return integer ^ integer >>> 7 ^ integer >>> 4;
  }
  
  private static int a(int p_76158_0_, int p_76158_1_)
  {
    return p_76158_0_ & p_76158_1_;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public Object a(long p_76164_1_)
  {
    int var3 = g(p_76164_1_);
    for (nq.a var4 = this.a[a(var3, this.c)]; var4 != null; var4 = var4.c) {
      if (var4.a == p_76164_1_) {
        return var4.b;
      }
    }
    return null;
  }
  
  public boolean b(long p_76161_1_)
  {
    return c(p_76161_1_) != null;
  }
  
  final nq.a c(long p_76160_1_)
  {
    int var3 = g(p_76160_1_);
    for (nq.a var4 = this.a[a(var3, this.c)]; var4 != null; var4 = var4.c) {
      if (var4.a == p_76160_1_) {
        return var4;
      }
    }
    return null;
  }
  
  public void a(long p_76163_1_, Object p_76163_3_)
  {
    int var4 = g(p_76163_1_);
    int var5 = a(var4, this.c);
    for (nq.a var6 = this.a[var5]; var6 != null; var6 = var6.c) {
      if (var6.a == p_76163_1_)
      {
        var6.b = p_76163_3_;
        return;
      }
    }
    this.f += 1;
    a(var4, p_76163_1_, p_76163_3_, var5);
  }
  
  private void b(int p_76153_1_)
  {
    nq.a[] var2 = this.a;
    int var3 = var2.length;
    if (var3 == 1073741824)
    {
      this.d = Integer.MAX_VALUE;
    }
    else
    {
      nq.a[] var4 = new nq.a[p_76153_1_];
      a(var4);
      this.a = var4;
      this.c = (this.a.length - 1);
      getClass();this.d = ((int)(p_76153_1_ * 0.75F));
    }
  }
  
  private void a(nq.a[] p_76154_1_)
  {
    nq.a[] var2 = this.a;
    int var3 = p_76154_1_.length;
    for (int var4 = 0; var4 < var2.length; var4++)
    {
      nq.a var5 = var2[var4];
      if (var5 != null)
      {
        var2[var4] = null;
        nq.a var6;
        do
        {
          var6 = var5.c;
          int var7 = a(var5.d, var3 - 1);
          var5.c = p_76154_1_[var7];
          p_76154_1_[var7] = var5;
          var5 = var6;
        } while (var6 != null);
      }
    }
  }
  
  public Object d(long p_76159_1_)
  {
    nq.a var3 = e(p_76159_1_);
    return var3 == null ? null : var3.b;
  }
  
  final nq.a e(long p_76152_1_)
  {
    int var3 = g(p_76152_1_);
    int var4 = a(var3, this.c);
    nq.a var5 = this.a[var4];
    nq.a var7;
    for (nq.a var6 = var5; var6 != null; var6 = var7)
    {
      var7 = var6.c;
      if (var6.a == p_76152_1_)
      {
        this.f += 1;
        this.b -= 1;
        if (var5 == var6) {
          this.a[var4] = var7;
        } else {
          var5.c = var7;
        }
        return var6;
      }
      var5 = var6;
    }
    return var6;
  }
  
  private void a(int p_76156_1_, long p_76156_2_, Object p_76156_4_, int p_76156_5_)
  {
    nq.a var6 = this.a[p_76156_5_];
    this.a[p_76156_5_] = new nq.a(p_76156_1_, p_76156_2_, p_76156_4_, var6);
    if (this.b++ >= this.d) {
      b(2 * this.a.length);
    }
  }
  
  static class a
  {
    final long a;
    Object b;
    a c;
    final int d;
    private static final String __OBFID = "CL_00001493";
    
    a(int p_i1553_1_, long p_i1553_2_, Object p_i1553_4_, a p_i1553_5_)
    {
      this.b = p_i1553_4_;
      this.c = p_i1553_5_;
      this.a = p_i1553_2_;
      this.d = p_i1553_1_;
    }
    
    public final long a()
    {
      return this.a;
    }
    
    public final Object b()
    {
      return this.b;
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
      return nq.f(this.a);
    }
    
    public final String toString()
    {
      return a() + "=" + b();
    }
  }
  
  public double getKeyDistribution()
  {
    int countValid = 0;
    for (int i = 0; i < this.a.length; i++) {
      if (this.a[i] != null) {
        countValid++;
      }
    }
    return 1.0D * countValid / this.b;
  }
}