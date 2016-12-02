public class ayp
  extends ayl
{
  private static final jy u = new jy("textures/gui/container/brewing_stand.png");
  private final wm v;
  private og w;
  
  public ayp(wm ☃, og ☃)
  {
    super(new xm(☃, ☃));
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
    
    int ☃ = w.a_(0);
    if (☃ > 0)
    {
      int ☃ = (int)(28.0F * (1.0F - ☃ / 400.0F));
      if (☃ > 0) {
        b(☃ + 97, ☃ + 16, 176, 0, 9, ☃);
      }
      int ☃ = ☃ / 2 % 7;
      switch (☃)
      {
      case 6: 
        ☃ = 0;
        break;
      case 5: 
        ☃ = 6;
        break;
      case 4: 
        ☃ = 11;
        break;
      case 3: 
        ☃ = 16;
        break;
      case 2: 
        ☃ = 20;
        break;
      case 1: 
        ☃ = 24;
        break;
      case 0: 
        ☃ = 29;
      }
      if (☃ > 0) {
        b(☃ + 65, ☃ + 14 + 29 - ☃, 185, 29 - ☃, 12, ☃);
      }
    }
  }
}
