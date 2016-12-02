public class ayv
  extends ayl
{
  private static final jy v = new jy("textures/gui/container/dispenser.png");
  private final wm w;
  public og u;
  
  public ayv(wm ☃, og ☃)
  {
    super(new xr(☃, ☃));
    this.w = ☃;
    this.u = ☃;
  }
  
  protected void b(int ☃, int ☃)
  {
    String ☃ = this.u.f_().c();
    this.q.a(☃, this.f / 2 - this.q.a(☃) / 2, 6, 4210752);
    this.q.a(this.w.f_().c(), 8, this.g - 96 + 2, 4210752);
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(v);
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    b(☃, ☃, 0, 0, this.f, this.g);
  }
}
