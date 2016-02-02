public class bdk
  extends beb
{
  protected bdk(adm ☃, double ☃, double ☃, double ☃, zw ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, 0);
  }
  
  protected bdk(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, zw ☃, int ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, ☃);
    this.v *= 0.10000000149011612D;
    this.w *= 0.10000000149011612D;
    this.x *= 0.10000000149011612D;
    this.v += ☃;
    this.w += ☃;
    this.x += ☃;
  }
  
  protected bdk(adm ☃, double ☃, double ☃, double ☃, zw ☃, int ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    a(ave.A().ag().a().a(☃, ☃));
    this.ar = (this.as = this.at = 1.0F);
    this.i = afi.aJ.I;
    this.h /= 2.0F;
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
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      int ☃ = ☃.length > 1 ? ☃[1] : 0;
      return new bdk(☃, ☃, ☃, ☃, ☃, ☃, ☃, zw.b(☃[0]), ☃);
    }
  }
  
  public static class b
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdk(☃, ☃, ☃, ☃, zy.aM);
    }
  }
  
  public static class c
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdk(☃, ☃, ☃, ☃, zy.aD);
    }
  }
}
