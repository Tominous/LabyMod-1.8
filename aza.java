public class aza
  extends ayl
{
  private static final jy u = new jy("textures/gui/container/hopper.png");
  private og v;
  private og w;
  
  public aza(wm ☃, og ☃)
  {
    super(new xw(☃, ☃, Ah));
    v = ☃;
    w = ☃;
    p = false;
    
    g = 133;
  }
  
  protected void b(int ☃, int ☃)
  {
    q.a(w.f_().c(), 8, 6, 4210752);
    q.a(v.f_().c(), 8, g - 96 + 2, 4210752);
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    j.P().a(u);
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    b(☃, ☃, 0, 0, f, g);
  }
}
