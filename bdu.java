import java.util.Random;

public class bdu
  extends beb
{
  private static final jy a = new jy("textures/entity/explosion.png");
  private static final bmu az = new bmu().a(bms.m).a(bms.o).a(bms.n).a(bms.p).a(bms.q).a(bms.r);
  private int aA;
  private int aB;
  private bmj aC;
  private float aD;
  
  protected bdu(bmj ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    aC = ☃;
    aB = (6 + V.nextInt(4));
    ar = (as = at = V.nextFloat() * 0.6F + 0.4F);
    aD = (1.0F - (float)☃ * 0.5F);
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    int ☃ = (int)((aA + ☃) * 15.0F / aB);
    if (☃ > 15) {
      return;
    }
    aC.a(a);
    
    float ☃ = ☃ % 4 / 4.0F;
    float ☃ = ☃ + 0.24975F;
    float ☃ = ☃ / 4 / 4.0F;
    float ☃ = ☃ + 0.24975F;
    
    float ☃ = 2.0F * aD;
    
    float ☃ = (float)(p + (s - p) * ☃ - aw);
    float ☃ = (float)(q + (t - q) * ☃ - ax);
    float ☃ = (float)(r + (u - r) * ☃ - ay);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.f();
    avc.a();
    
    ☃.a(7, az);
    ☃.b(☃ - ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ - ☃ * ☃ - ☃ * ☃).a(☃, ☃).a(ar, as, at, 1.0F).a(0, 240).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(☃ - ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ - ☃ * ☃ + ☃ * ☃).a(☃, ☃).a(ar, as, at, 1.0F).a(0, 240).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(☃ + ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ + ☃ * ☃ + ☃ * ☃).a(☃, ☃).a(ar, as, at, 1.0F).a(0, 240).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(☃ + ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ + ☃ * ☃ - ☃ * ☃).a(☃, ☃).a(ar, as, at, 1.0F).a(0, 240).c(0.0F, 1.0F, 0.0F).d();
    bfx.a().b();
    
    bfl.e();
  }
  
  public int b(float ☃)
  {
    return 61680;
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    aA += 1;
    if (aA == aB) {
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
      return new bdu(ave.A().P(), ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
}
