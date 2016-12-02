public class ox
  extends ow
{
  protected pk q;
  private boolean r = false;
  
  public ox(String ☃, pk ☃)
  {
    super(☃);
    this.q = ☃;
  }
  
  public ox v()
  {
    this.r = true;
    return this;
  }
  
  public boolean w()
  {
    return this.r;
  }
  
  public pk j()
  {
    return this.q;
  }
  
  public eu b(pr ☃)
  {
    zx ☃ = (this.q instanceof pr) ? ((pr)this.q).bA() : null;
    String ☃ = "death.attack." + this.p;
    String ☃ = ☃ + ".item";
    if ((☃ != null) && (☃.s()) && (di.c(☃))) {
      return new fb(☃, new Object[] { ☃.f_(), this.q.f_(), ☃.C() });
    }
    return new fb(☃, new Object[] { ☃.f_(), this.q.f_() });
  }
  
  public boolean r()
  {
    return (this.q != null) && ((this.q instanceof pr)) && (!(this.q instanceof wn));
  }
}
