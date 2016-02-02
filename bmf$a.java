public class bmf$a
  implements Comparable
{
  private final bmi a;
  private final int b;
  private final int c;
  private final int d;
  private boolean e;
  private float f = 1.0F;
  private static final String __OBFID = "CL_00001055";
  
  public bmf$a(bmi p_i45094_1_, int p_i45094_2_)
  {
    this.a = p_i45094_1_;
    this.b = p_i45094_1_.c();
    this.c = p_i45094_1_.d();
    this.d = p_i45094_2_;
    this.e = (bmf.a(this.c, p_i45094_2_) > bmf.a(this.b, p_i45094_2_));
  }
  
  public bmi a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.e ? bmf.a((int)(this.c * this.f), this.d) : bmf.a((int)(this.b * this.f), this.d);
  }
  
  public int c()
  {
    return this.e ? bmf.a((int)(this.b * this.f), this.d) : bmf.a((int)(this.c * this.f), this.d);
  }
  
  public void d()
  {
    this.e = (!this.e);
  }
  
  public boolean e()
  {
    return this.e;
  }
  
  public void a(int p_94196_1_)
  {
    if ((this.b > p_94196_1_) && (this.c > p_94196_1_)) {
      this.f = (p_94196_1_ / Math.min(this.b, this.c));
    }
  }
  
  public String toString()
  {
    return "Holder{width=" + this.b + ", height=" + this.c + ", name=" + this.a.i() + '}';
  }
  
  public int a(a p_compareTo_1_)
  {
    int var2;
    int var2;
    if (c() == p_compareTo_1_.c())
    {
      if (b() == p_compareTo_1_.b())
      {
        if (this.a.i() == null) {
          return p_compareTo_1_.a.i() == null ? 0 : -1;
        }
        return this.a.i().compareTo(p_compareTo_1_.a.i());
      }
      var2 = b() < p_compareTo_1_.b() ? 1 : -1;
    }
    else
    {
      var2 = c() < p_compareTo_1_.c() ? 1 : -1;
    }
    return var2;
  }
  
  public int compareTo(Object p_compareTo_1_)
  {
    return a((a)p_compareTo_1_);
  }
}
