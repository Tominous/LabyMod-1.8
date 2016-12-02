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
    f = ☃;
    return super.a(☃);
  }
  
  public asx a(pk ☃)
  {
    f = new cj(☃);
    return super.a(☃);
  }
  
  public boolean a(pk ☃, double ☃)
  {
    asx ☃ = a(☃);
    if (☃ != null) {
      return a(☃, ☃);
    }
    f = new cj(☃);
    e = ☃;
    return true;
  }
  
  public void k()
  {
    if (m())
    {
      if (f != null)
      {
        double ☃ = b.J * b.J;
        if ((b.c(f) < ☃) || ((b.t > f.o()) && (b.c(new cj(f.n(), ns.c(b.t), f.p())) < ☃))) {
          f = null;
        } else {
          b.q().a(f.n(), f.o(), f.p(), e);
        }
      }
      return;
    }
    super.k();
  }
}
