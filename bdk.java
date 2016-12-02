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
    v *= 0.10000000149011612D;
    w *= 0.10000000149011612D;
    x *= 0.10000000149011612D;
    v += ☃;
    w += ☃;
    x += ☃;
  }
  
  protected bdk(adm ☃, double ☃, double ☃, double ☃, zw ☃, int ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    a(ave.A().ag().a().a(☃, ☃));
    ar = (as = at = 1.0F);
    i = aJI;
    h /= 2.0F;
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
