public abstract class qx
  extends rd
{
  protected ps a;
  protected cj b = cj.a;
  protected agh c;
  boolean d;
  float e;
  float f;
  
  public qx(ps ☃)
  {
    a = ☃;
    if (!(☃.s() instanceof sv)) {
      throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
    }
  }
  
  public boolean a()
  {
    if (!a.D) {
      return false;
    }
    sv ☃ = (sv)a.s();
    asx ☃ = ☃.j();
    if ((☃ == null) || (☃.b()) || (!☃.g())) {
      return false;
    }
    for (int ☃ = 0; ☃ < Math.min(☃.e() + 2, ☃.d()); ☃++)
    {
      asv ☃ = ☃.a(☃);
      b = new cj(a, b + 1, c);
      if (a.e(b.n(), a.t, b.p()) <= 2.25D)
      {
        c = a(b);
        if (c != null) {
          return true;
        }
      }
    }
    b = new cj(a).a();
    c = a(b);
    return c != null;
  }
  
  public boolean b()
  {
    return !d;
  }
  
  public void c()
  {
    d = false;
    e = ((float)(b.n() + 0.5F - a.s));
    f = ((float)(b.p() + 0.5F - a.u));
  }
  
  public void e()
  {
    float ☃ = (float)(b.n() + 0.5F - a.s);
    float ☃ = (float)(b.p() + 0.5F - a.u);
    float ☃ = e * ☃ + f * ☃;
    if (☃ < 0.0F) {
      d = true;
    }
  }
  
  private agh a(cj ☃)
  {
    afh ☃ = a.o.p(☃).c();
    if (((☃ instanceof agh)) && (☃.t() == arm.d)) {
      return (agh)☃;
    }
    return null;
  }
}
