public class sf
  extends rd
{
  vn a;
  pr b;
  
  public sf(vn ☃)
  {
    this.a = ☃;
    a(1);
  }
  
  public boolean a()
  {
    pr ☃ = this.a.u();
    return (this.a.cm() > 0) || ((☃ != null) && (this.a.h(☃) < 9.0D));
  }
  
  public void c()
  {
    this.a.s().n();
    this.b = this.a.u();
  }
  
  public void d()
  {
    this.b = null;
  }
  
  public void e()
  {
    if (this.b == null)
    {
      this.a.a(-1);
      return;
    }
    if (this.a.h(this.b) > 49.0D)
    {
      this.a.a(-1);
      return;
    }
    if (!this.a.t().a(this.b))
    {
      this.a.a(-1);
      return;
    }
    this.a.a(1);
  }
}
