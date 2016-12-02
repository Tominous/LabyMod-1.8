public class azb
  extends ayl
{
  private static final jy u = new jy("textures/gui/container/horse.png");
  private og v;
  private og w;
  private tp x;
  private float y;
  private float z;
  
  public azb(og ☃, og ☃, tp ☃)
  {
    super(new xx(☃, ☃, ☃, Ah));
    v = ☃;
    w = ☃;
    x = ☃;
    p = false;
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
    if (x.cw()) {
      b(☃ + 79, ☃ + 17, 0, g, 90, 54);
    }
    if (x.cO()) {
      b(☃ + 7, ☃ + 35, 0, g + 54, 18, 18);
    }
    azc.a(☃ + 51, ☃ + 60, 17, ☃ + 51 - y, ☃ + 75 - 50 - z, x);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    y = ☃;
    z = ☃;
    
    super.a(☃, ☃, ☃);
  }
}
