public class ayz
  extends ayl
{
  private static final jy u = new jy("textures/gui/container/furnace.png");
  private final wm v;
  private og w;
  
  public ayz(wm ☃, og ☃)
  {
    super(new xu(☃, ☃));
    v = ☃;
    w = ☃;
  }
  
  protected void b(int ☃, int ☃)
  {
    String ☃ = w.f_().c();
    q.a(☃, f / 2 - q.a(☃) / 2, 6, 4210752);
    q.a(v.f_().c(), 8, g - 96 + 2, 4210752);
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    j.P().a(u);
    int ☃ = (l - f) / 2;
    int ☃ = (m - g) / 2;
    b(☃, ☃, 0, 0, f, g);
    if (alh.a(w))
    {
      int ☃ = i(13);
      b(☃ + 56, ☃ + 36 + 12 - ☃, 176, 12 - ☃, 14, ☃ + 1);
    }
    int ☃ = h(24);
    b(☃ + 79, ☃ + 34, 176, 14, ☃ + 1, 16);
  }
  
  private int h(int ☃)
  {
    int ☃ = w.a_(2);
    int ☃ = w.a_(3);
    if ((☃ == 0) || (☃ == 0)) {
      return 0;
    }
    return ☃ * ☃ / ☃;
  }
  
  private int i(int ☃)
  {
    int ☃ = w.a_(1);
    if (☃ == 0) {
      ☃ = 200;
    }
    return w.a_(0) * ☃ / ☃;
  }
}
