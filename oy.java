public class oy
  extends ox
{
  private pk r;
  
  public oy(String ☃, pk ☃, pk ☃)
  {
    super(☃, ☃);
    this.r = ☃;
  }
  
  public pk i()
  {
    return this.q;
  }
  
  public pk j()
  {
    return this.r;
  }
  
  public eu b(pr ☃)
  {
    eu ☃ = this.r == null ? this.q.f_() : this.r.f_();
    zx ☃ = (this.r instanceof pr) ? ((pr)this.r).bA() : null;
    String ☃ = "death.attack." + this.p;
    String ☃ = ☃ + ".item";
    if ((☃ != null) && (☃.s()) && (di.c(☃))) {
      return new fb(☃, new Object[] { ☃.f_(), ☃, ☃.C() });
    }
    return new fb(☃, new Object[] { ☃.f_(), ☃ });
  }
}
