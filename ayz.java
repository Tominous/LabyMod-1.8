public class ayz
  extends ayl
{
  private static final jy u = new jy("textures/gui/container/furnace.png");
  private final wm v;
  private og w;
  
  public ayz(wm ☃, og ☃)
  {
    super(new xu(☃, ☃));
    this.v = ☃;
    this.w = ☃;
  }
  
  protected void b(int ☃, int ☃)
  {
    String ☃ = this.w.f_().c();
    this.q.a(☃, this.f / 2 - this.q.a(☃) / 2, 6, 4210752);
    this.q.a(this.v.f_().c(), 8, this.g - 96 + 2, 4210752);
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(u);
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    b(☃, ☃, 0, 0, this.f, this.g);
    if (alh.a(this.w))
    {
      int ☃ = i(13);
      b(☃ + 56, ☃ + 36 + 12 - ☃, 176, 12 - ☃, 14, ☃ + 1);
    }
    int ☃ = h(24);
    b(☃ + 79, ☃ + 34, 176, 14, ☃ + 1, 16);
  }
  
  private int h(int ☃)
  {
    int ☃ = this.w.a_(2);
    int ☃ = this.w.a_(3);
    if ((☃ == 0) || (☃ == 0)) {
      return 0;
    }
    return ☃ * ☃ / ☃;
  }
  
  private int i(int ☃)
  {
    int ☃ = this.w.a_(1);
    if (☃ == 0) {
      ☃ = 200;
    }
    return this.w.a_(0) * ☃ / ☃;
  }
}
