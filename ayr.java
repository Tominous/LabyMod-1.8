public class ayr
  extends ayl
{
  private static final jy u = new jy("textures/gui/container/generic_54.png");
  private og v;
  private og w;
  private int x;
  
  public ayr(og ☃, og ☃)
  {
    super(new xo(☃, ☃, Ah));
    v = ☃;
    w = ☃;
    p = false;
    
    int ☃ = 222;
    int ☃ = ☃ - 108;
    x = (☃.o_() / 9);
    
    g = (☃ + x * 18);
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
    b(☃, ☃, 0, 0, f, x * 18 + 17);
    b(☃, ☃ + x * 18 + 17, 0, 126, f, 96);
  }
}
