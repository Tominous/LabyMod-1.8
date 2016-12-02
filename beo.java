public class beo
  extends beb
{
  private alz a;
  private cj az;
  
  protected beo(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, alz ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    a = ☃;
    a(ave.A().ae().a().a(☃));
    i = cI;
    ar = (as = at = 0.6F);
    h /= 2.0F;
  }
  
  public beo a(cj ☃)
  {
    az = ☃;
    if (a.c() == afi.c) {
      return this;
    }
    int ☃ = a.c().d(o, ☃);
    ar *= (☃ >> 16 & 0xFF) / 255.0F;
    as *= (☃ >> 8 & 0xFF) / 255.0F;
    at *= (☃ & 0xFF) / 255.0F;
    return this;
  }
  
  public beo l()
  {
    az = new cj(s, t, u);
    afh ☃ = a.c();
    if (☃ == afi.c) {
      return this;
    }
    int ☃ = ☃.h(a);
    ar *= (☃ >> 16 & 0xFF) / 255.0F;
    as *= (☃ >> 8 & 0xFF) / 255.0F;
    at *= (☃ & 0xFF) / 255.0F;
    return this;
  }
  
  public int a()
  {
    return 1;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (b + d / 4.0F) / 16.0F;
    float ☃ = ☃ + 0.015609375F;
    float ☃ = (c + e / 4.0F) / 16.0F;
    float ☃ = ☃ + 0.015609375F;
    float ☃ = 0.1F * h;
    if (av != null)
    {
      ☃ = av.a(d / 4.0F * 16.0F);
      ☃ = av.a((d + 1.0F) / 4.0F * 16.0F);
      ☃ = av.b(e / 4.0F * 16.0F);
      ☃ = av.b((e + 1.0F) / 4.0F * 16.0F);
    }
    float ☃ = (float)(p + (s - p) * ☃ - aw);
    float ☃ = (float)(q + (t - q) * ☃ - ax);
    float ☃ = (float)(r + (u - r) * ☃ - ay);
    
    int ☃ = b(☃);
    int ☃ = ☃ >> 16 & 0xFFFF;
    int ☃ = ☃ & 0xFFFF;
    
    ☃.b(☃ - ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ - ☃ * ☃ - ☃ * ☃).a(☃, ☃).a(ar, as, at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ - ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ - ☃ * ☃ + ☃ * ☃).a(☃, ☃).a(ar, as, at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ + ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ + ☃ * ☃ + ☃ * ☃).a(☃, ☃).a(ar, as, at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ + ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ + ☃ * ☃ - ☃ * ☃).a(☃, ☃).a(ar, as, at, 1.0F).a(☃, ☃).d();
  }
  
  public int b(float ☃)
  {
    int ☃ = super.b(☃);
    int ☃ = 0;
    if (o.e(az)) {
      ☃ = o.b(az, 0);
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
