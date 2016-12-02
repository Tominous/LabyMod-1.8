public class ox
  extends ow
{
  protected pk q;
  private boolean r = false;
  
  public ox(String ☃, pk ☃)
  {
    super(☃);
    q = ☃;
  }
  
  public ox v()
  {
    r = true;
    return this;
  }
  
  public boolean w()
  {
    return r;
  }
  
  public pk j()
  {
    return q;
  }
  
  public eu b(pr ☃)
  {
    zx ☃ = (q instanceof pr) ? ((pr)q).bA() : null;
    String ☃ = "death.attack." + p;
    String ☃ = ☃ + ".item";
    if ((☃ != null) && (☃.s()) && (di.c(☃))) {
      return new fb(☃, new Object[] { ☃.f_(), q.f_(), ☃.C() });
    }
    return new fb(☃, new Object[] { ☃.f_(), q.f_() });
  }
  
  public boolean r()
  {
    return (q != null) && ((q instanceof pr)) && (!(q instanceof wn));
  }
}
