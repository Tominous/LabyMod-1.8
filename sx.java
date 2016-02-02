public class sx
  extends sv
{
  private cj f;
  
  public sx(ps ☃, adm ☃)
  {
    super(☃, ☃);
  }
  
  public asx a(cj ☃)
  {
    this.f = ☃;
    return super.a(☃);
  }
  
  public asx a(pk ☃)
  {
    this.f = new cj(☃);
    return super.a(☃);
  }
  
  public boolean a(pk ☃, double ☃)
  {
    asx ☃ = a(☃);
    if (☃ != null) {
      return a(☃, ☃);
    }
    this.f = new cj(☃);
    this.e = ☃;
    return true;
  }
  
  public void k()
  {
    if (m())
    {
      if (this.f != null)
      {
        double ☃ = this.b.J * this.b.J;
        if ((this.b.c(this.f) < ☃) || ((this.b.t > this.f.o()) && (this.b.c(new cj(this.f.n(), ns.c(this.b.t), this.f.p())) < ☃))) {
          this.f = null;
        } else {
          this.b.q().a(this.f.n(), this.f.o(), this.f.p(), this.e);
        }
      }
      return;
    }
    super.k();
  }
}
