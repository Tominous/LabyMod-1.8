import java.util.Random;

public class aid
  extends afm
{
  public static final amn a = amn.a("age", 0, 3);
  
  protected aid()
  {
    super(arm.k, arn.D);
    j(this.M.b().a(a, Integer.valueOf(0)));
    a(true);
    float ☃ = 0.5F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 0.25F, 0.5F + ☃);
    a(null);
  }
  
  protected boolean c(afh ☃)
  {
    return ☃ == afi.aW;
  }
  
  public boolean f(adm ☃, cj ☃, alz ☃)
  {
    return c(☃.p(☃.b()).c());
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    int ☃ = ((Integer)☃.b(a)).intValue();
    if ((☃ < 3) && (☃.nextInt(10) == 0))
    {
      ☃ = ☃.a(a, Integer.valueOf(☃ + 1));
      ☃.a(☃, ☃, 2);
    }
    super.b(☃, ☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    if (☃.D) {
      return;
    }
    int ☃ = 1;
    if (((Integer)☃.b(a)).intValue() >= 3)
    {
      ☃ = 2 + ☃.s.nextInt(3);
      if (☃ > 0) {
        ☃ += ☃.s.nextInt(☃ + 1);
      }
    }
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(☃, ☃, new zx(zy.by));
    }
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return null;
  }
  
  public int a(Random ☃)
  {
    return 0;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.by;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Integer.valueOf(☃));
  }
  
  public int c(alz ☃)
  {
    return ((Integer)☃.b(a)).intValue();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
