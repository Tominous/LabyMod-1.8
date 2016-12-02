public class aza
  extends ayl
{
  private static final jy u = new jy("textures/gui/container/hopper.png");
  private og v;
  private og w;
  
  public aza(wm ☃, og ☃)
  {
    super(new xw(☃, ☃, ave.A().h));
    this.v = ☃;
    this.w = ☃;
    this.p = false;
    
    this.g = 133;
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
  }
}
