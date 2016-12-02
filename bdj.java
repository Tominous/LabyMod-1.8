public class bdj
  extends beb
{
  protected bdj(adm ☃, double ☃, double ☃, double ☃, zw ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    a(ave.A().ag().a().a(☃));
    ar = (as = at = 1.0F);
    v = (w = x = 0.0D);
    i = 0.0F;
    g = 80;
  }
  
  public int a()
  {
    return 1;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = av.e();
    float ☃ = av.f();
    float ☃ = av.g();
    float ☃ = av.h();
    float ☃ = 0.5F;
    
    float ☃ = (float)(p + (s - p) * ☃ - aw);
    float ☃ = (float)(q + (t - q) * ☃ - ax);
    float ☃ = (float)(r + (u - r) * ☃ - ay);
    
    int ☃ = b(☃);
    int ☃ = ☃ >> 16 & 0xFFFF;
    int ☃ = ☃ & 0xFFFF;
    
    ☃.b(☃ - ☃ * 0.5F - ☃ * 0.5F, ☃ - ☃ * 0.5F, ☃ - ☃ * 0.5F - ☃ * 0.5F).a(☃, ☃).a(ar, as, at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ - ☃ * 0.5F + ☃ * 0.5F, ☃ + ☃ * 0.5F, ☃ - ☃ * 0.5F + ☃ * 0.5F).a(☃, ☃).a(ar, as, at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ + ☃ * 0.5F + ☃ * 0.5F, ☃ + ☃ * 0.5F, ☃ + ☃ * 0.5F + ☃ * 0.5F).a(☃, ☃).a(ar, as, at, 1.0F).a(☃, ☃).d();
    ☃.b(☃ + ☃ * 0.5F - ☃ * 0.5F, ☃ - ☃ * 0.5F, ☃ + ☃ * 0.5F - ☃ * 0.5F).a(☃, ☃).a(ar, as, at, 1.0F).a(☃, ☃).d();
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bdj(☃, ☃, ☃, ☃, zw.a(afi.cv));
    }
  }
}
