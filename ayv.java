public class ayv
  extends ayl
{
  private static final jy v = new jy("textures/gui/container/dispenser.png");
  private final wm w;
  public og u;
  
  public ayv(wm ☃, og ☃)
  {
    super(new xr(☃, ☃));
    w = ☃;
    u = ☃;
  }
  
  protected void b(int ☃, int ☃)
  {
    String ☃ = u.f_().c();
    q.a(☃, f / 2 - q.a(☃) / 2, 6, 4210752);
    q.a(w.f_().c(), 8, g - 96 + 2, 4210752);
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    j.P().a(v);
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    b(☃, ☃, 0, 0, f, g);
  }
}
