public class beo
  extends beb
{
  private alz a;
  private cj az;
  
  protected beo(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, alz ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    this.a = ☃;
    a(ave.A().ae().a().a(☃));
    this.i = ☃.c().I;
    this.ar = (this.as = this.at = 0.6F);
    this.h /= 2.0F;
  }
  
  public beo a(cj ☃)
  {
    this.az = ☃;
    if (this.a.c() == afi.c) {
      return this;
    }
    int ☃ = this.a.c().d(this.o, ☃);
    this.ar *= (☃ >> 16 & 0xFF) / 255.0F;
    this.as *= (☃ >> 8 & 0xFF) / 255.0F;
    this.at *= (☃ & 0xFF) / 255.0F;
    return this;
  }
  
  public beo l()
  {
    this.az = new cj(this.s, this.t, this.u);
    afh ☃ = this.a.c();
    if (☃ == afi.c) {
      return this;
    }
    int ☃ = ☃.h(this.a);
    this.ar *= (☃ >> 16 & 0xFF) / 255.0F;
    this.as *= (☃ >> 8 & 0xFF) / 255.0F;
    this.at *= (☃ & 0xFF) / 255.0F;
    return this;
  }
  
  public int a()
  {
    return 1;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (this.b + this.d / 4.0F) / 16.0F;
    float ☃ = ☃ + 0.015609375F;
    float ☃ = (this.c + this.e / 4.0F) / 16.0F;
    float ☃ = ☃ + 0.015609375F;
    float ☃ = 0.1F * this.h;
    if (this.av != null)
    {
      ☃ = this.av.a(this.d / 4.0F * 16.0F);
      ☃ = this.av.a((this.d + 1.0F) / 4.0F * 16.0F);
      ☃ = this.av.b(this.e / 4.0F * 16.0F);
      ☃ = this.av.b((this.e + 1.0F) / 4.0F * 16.0F);
    }
    float ☃ = (float)(this.p + (this.s - this.p) * ☃ - aw);
    float ☃ = (float)(this.q + (this.t - this.q) * ☃ - ax);
    float ☃ = (float)(this.r + (this.u - this.r) * ☃ - ay);
    
    int ☃ = b(☃);
    int ☃ = ☃ >> 16 & 0xFFFF;
    int ☃ = ☃ & 0xFFFF;
    
    ☃.b(☃ - ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ - ☃ * ☃ - ☃ * ☃).a(☃, ☃).a(this.ar, this.as, this.at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ - ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ - ☃ * ☃ + ☃ * ☃).a(☃, ☃).a(this.ar, this.as, this.at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ + ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ + ☃ * ☃ + ☃ * ☃).a(☃, ☃).a(this.ar, this.as, this.at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ + ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ + ☃ * ☃ - ☃ * ☃).a(☃, ☃).a(this.ar, this.as, this.at, 1.0F).a(☃, ☃).d();
  }
  
  public int b(float ☃)
  {
    int ☃ = super.b(☃);
    int ☃ = 0;
    if (this.o.e(this.az)) {
      ☃ = this.o.b(this.az, 0);
    }
    return ☃ == 0 ? ☃ : ☃;
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new beo(☃, ☃, ☃, ☃, ☃, ☃, ☃, afh.d(☃[0])).l();
    }
  }
}
