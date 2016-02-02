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
    this.a = ☃;
    if (!(☃.s() instanceof sv)) {
      throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
    }
  }
  
  public boolean a()
  {
    if (!this.a.D) {
      return false;
    }
    sv ☃ = (sv)this.a.s();
    asx ☃ = ☃.j();
    if ((☃ == null) || (☃.b()) || (!☃.g())) {
      return false;
    }
    for (int ☃ = 0; ☃ < Math.min(☃.e() + 2, ☃.d()); ☃++)
    {
      asv ☃ = ☃.a(☃);
      this.b = new cj(☃.a, ☃.b + 1, ☃.c);
      if (this.a.e(this.b.n(), this.a.t, this.b.p()) <= 2.25D)
      {
        this.c = a(this.b);
        if (this.c != null) {
          return true;
        }
      }
    }
    this.b = new cj(this.a).a();
    this.c = a(this.b);
    return this.c != null;
  }
  
  public boolean b()
  {
    return !this.d;
  }
  
  public void c()
  {
    this.d = false;
    this.e = ((float)(this.b.n() + 0.5F - this.a.s));
    this.f = ((float)(this.b.p() + 0.5F - this.a.u));
  }
  
  public void e()
  {
    float ☃ = (float)(this.b.n() + 0.5F - this.a.s);
    float ☃ = (float)(this.b.p() + 0.5F - this.a.u);
    float ☃ = this.e * ☃ + this.f * ☃;
    if (☃ < 0.0F) {
      this.d = true;
    }
  }
  
  private agh a(cj ☃)
  {
    afh ☃ = this.a.o.p(☃).c();
    if (((☃ instanceof agh)) && (☃.t() == arm.d)) {
      return (agh)☃;
    }
    return null;
  }
}
