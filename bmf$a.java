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
    a = p_i45094_1_;
    b = p_i45094_1_.c();
    c = p_i45094_1_.d();
    d = p_i45094_2_;
    e = (bmf.a(c, p_i45094_2_) > bmf.a(b, p_i45094_2_));
  }
  
  public bmi a()
  {
    return a;
  }
  
  public int b()
  {
    return e ? bmf.a((int)(c * f), d) : bmf.a((int)(b * f), d);
  }
  
  public int c()
  {
    return e ? bmf.a((int)(b * f), d) : bmf.a((int)(c * f), d);
  }
  
  public void d()
  {
    e = (!e);
  }
  
  public boolean e()
  {
    return e;
  }
  
  public void a(int p_94196_1_)
  {
    if ((b > p_94196_1_) && (c > p_94196_1_)) {
      f = (p_94196_1_ / Math.min(b, c));
    }
  }
  
  public String toString()
  {
    return "Holder{width=" + b + ", height=" + c + ", name=" + a.i() + '}';
  }
  
  public int a(a p_compareTo_1_)
  {
    int var2;
    int var2;
    if (c() == p_compareTo_1_.c())
    {
      if (b() == p_compareTo_1_.b())
      {
        if (a.i() == null) {
          return a.i() == null ? 0 : -1;
        }
        return a.i().compareTo(a.i());
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
