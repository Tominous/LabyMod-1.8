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
    super(new xx(☃, ☃, ☃, ave.A().h));
    this.v = ☃;
    this.w = ☃;
    this.x = ☃;
    this.p = false;
  }
  
  protected void b(int ☃, int ☃)
  {
    this.q.a(this.w.f_().c(), 8, 6, 4210752);
    this.q.a(this.v.f_().c(), 8, this.g - 96 + 2, 4210752);
  }
  
  protected void a(float ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.j.P().a(u);
    int ☃ = (this.l - this.f) / 2;
    int ☃ = (this.m - this.g) / 2;
    b(☃, ☃, 0, 0, this.f, this.g);
    if (this.x.cw()) {
      b(☃ + 79, ☃ + 17, 0, this.g, 90, 54);
    }
    if (this.x.cO()) {
      b(☃ + 7, ☃ + 35, 0, this.g + 54, 18, 18);
    }
    azc.a(☃ + 51, ☃ + 60, 17, ☃ + 51 - this.y, ☃ + 75 - 50 - this.z, this.x);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    this.y = ☃;
    this.z = ☃;
    
    super.a(☃, ☃, ☃);
  }
}
