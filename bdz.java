public class bdz
  extends beb
{
  private pr a;
  
  protected bdz(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    ar = (as = at = 1.0F);
    v = (w = x = 0.0D);
    i = 0.0F;
    g = 30;
  }
  
  public int a()
  {
    return 3;
  }
  
  public void t_()
  {
    super.t_();
    if (a == null)
    {
      vt ☃ = new vt(o);
      ☃.co();
      a = ☃;
    }
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    if (a == null) {
      return;
    }
    biu ☃ = ave.A().af();
    
    ☃.a(beb.aw, beb.ax, beb.ay);
    
    float ☃ = 0.42553192F;
    float ☃ = (f + ☃) / g;
    
    bfl.a(true);
    bfl.l();
    bfl.j();
    bfl.b(770, 771);
    float ☃ = 240.0F;
    bqs.a(bqs.r, ☃, ☃);
    
    bfl.E();
    float ☃ = 0.05F + 0.5F * ns.a(☃ * 3.1415927F);
    bfl.c(1.0F, 1.0F, 1.0F, ☃);
    
    bfl.b(0.0F, 1.8F, 0.0F);
    bfl.b(180.0F - y, 0.0F, 1.0F, 0.0F);
    bfl.b(60.0F - 150.0F * ☃ - z, 1.0F, 0.0F, 0.0F);
    bfl.b(0.0F, -0.4F, -1.5F);
    bfl.a(☃, ☃, ☃);
    a.y = (a.A = 0.0F);
    a.aK = (a.aL = 0.0F);
    ☃.a(a, 0.0D, 0.0D, 0.0D, 0.0F, ☃);
    bfl.F();
    
    bfl.j();
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdz(☃, ☃, ☃, ☃);
    }
  }
}
