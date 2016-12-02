public class bds
  extends beb
{
  private static final jy a = new jy("textures/particle/footprint.png");
  private int az;
  private int aA;
  private bmj aB;
  
  protected bds(bmj ☃, adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    aB = ☃;
    v = (w = x = 0.0D);
    aA = 200;
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (az + ☃) / aA;
    ☃ *= ☃;
    
    float ☃ = 2.0F - ☃ * 2.0F;
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    ☃ *= 0.2F;
    
    bfl.f();
    float ☃ = 0.125F;
    
    float ☃ = (float)(s - aw);
    float ☃ = (float)(t - ax);
    float ☃ = (float)(u - ay);
    
    float ☃ = o.o(new cj(this));
    
    aB.a(a);
    bfl.l();
    bfl.b(770, 771);
    
    ☃.a(7, bms.i);
    ☃.b(☃ - 0.125F, ☃, ☃ + 0.125F).a(0.0D, 1.0D).a(☃, ☃, ☃, ☃).d();
    ☃.b(☃ + 0.125F, ☃, ☃ + 0.125F).a(1.0D, 1.0D).a(☃, ☃, ☃, ☃).d();
    ☃.b(☃ + 0.125F, ☃, ☃ - 0.125F).a(1.0D, 0.0D).a(☃, ☃, ☃, ☃).d();
    ☃.b(☃ - 0.125F, ☃, ☃ - 0.125F).a(0.0D, 0.0D).a(☃, ☃, ☃, ☃).d();
    bfx.a().b();
    
    bfl.k();
    bfl.e();
  }
  
  public void t_()
  {
    az += 1;
    if (az == aA) {
      J();
    }
  }
  
  public int a()
  {
    return 3;
  }
  
  public static class a
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      return new bds(ave.A().P(), ☃, ☃, ☃, ☃);
    }
  }
}
