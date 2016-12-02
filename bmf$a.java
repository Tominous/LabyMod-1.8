public class bmf$a
  implements Comparable<a>
{
  private final bmi a;
  private final int b;
  private final int c;
  private final int d;
  private boolean e;
  private float f = 1.0F;
  
  public bmf$a(bmi ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃.c();
    this.c = ☃.d();
    this.d = ☃;
    
    this.e = (bmf.a(this.c, ☃) > bmf.a(this.b, ☃));
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
  
  public void a(int ☃)
  {
    if ((this.b <= ☃) || (this.c <= ☃)) {
      return;
    }
    this.f = (☃ / Math.min(this.b, this.c));
  }
  
  public String toString()
  {
    return "Holder{width=" + this.b + ", height=" + this.c + '}';
  }
  
  public int a(a ☃)
  {
    int ☃;
    int ☃;
    if (c() == ☃.c())
    {
      if (b() == ☃.b())
      {
        if (this.a.i() == null) {
          return ☃.a.i() == null ? 0 : -1;
        }
        return this.a.i().compareTo(☃.a.i());
      }
      ☃ = b() < ☃.b() ? 1 : -1;
    }
    else
    {
      ☃ = c() < ☃.c() ? 1 : -1;
    }
    return ☃;
  }
}
