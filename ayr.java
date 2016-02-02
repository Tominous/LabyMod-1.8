public class ayr
  extends ayl
{
  private static final jy u = new jy("textures/gui/container/generic_54.png");
  private og v;
  private og w;
  private int x;
  
  public ayr(og ☃, og ☃)
  {
    super(new xo(☃, ☃, ave.A().h));
    this.v = ☃;
    this.w = ☃;
    this.p = false;
    
    int ☃ = 222;
    int ☃ = ☃ - 108;
    this.x = (☃.o_() / 9);
    
    this.g = (☃ + this.x * 18);
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
    b(☃, ☃, 0, 0, this.f, this.x * 18 + 17);
    b(☃, ☃ + this.x * 18 + 17, 0, 126, this.f, 96);
  }
}
