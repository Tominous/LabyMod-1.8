public class bdz
  extends beb
{
  private pr a;
  
  protected bdz(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    this.ar = (this.as = this.at = 1.0F);
    this.v = (this.w = this.x = 0.0D);
    this.i = 0.0F;
    this.g = 30;
  }
  
  public int a()
  {
    return 3;
  }
  
  public void t_()
  {
    super.t_();
    if (this.a == null)
    {
      vt ☃ = new vt(this.o);
      ☃.co();
      this.a = ☃;
    }
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    if (this.a == null) {
      return;
    }
    biu ☃ = ave.A().af();
    
    ☃.a(beb.aw, beb.ax, beb.ay);
    
    float ☃ = 0.42553192F;
    float ☃ = (this.f + ☃) / this.g;
    
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
    bfl.b(180.0F - ☃.y, 0.0F, 1.0F, 0.0F);
    bfl.b(60.0F - 150.0F * ☃ - ☃.z, 1.0F, 0.0F, 0.0F);
    bfl.b(0.0F, -0.4F, -1.5F);
    bfl.a(☃, ☃, ☃);
    this.a.y = (this.a.A = 0.0F);
    this.a.aK = (this.a.aL = 0.0F);
    ☃.a(this.a, 0.0D, 0.0D, 0.0D, 0.0F, ☃);
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
