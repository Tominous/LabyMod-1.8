import java.util.Random;

public class ajp
  extends afh
{
  public static final amn a = amn.a("layers", 1, 8);
  
  protected ajp()
  {
    super(arm.y);
    j(M.b().a(a, Integer.valueOf(1)));
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    a(true);
    a(yz.c);
    j();
  }
  
  public boolean b(adq ☃, cj ☃)
  {
    return ((Integer)☃.p(☃).b(a)).intValue() < 5;
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    int ☃ = ((Integer)☃.b(a)).intValue() - 1;
    float ☃ = 0.125F;
    return new aug(☃.n() + B, ☃.o() + C, ☃.p() + D, ☃.n() + E, ☃.o() + ☃ * ☃, ☃.p() + G);
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public void j()
  {
    b(0);
  }
  
  public void a(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    b(((Integer)☃.b(a)).intValue());
  }
  
  protected void b(int ☃)
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, ☃ / 8.0F, 1.0F);
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃.b());
    afh ☃ = ☃.c();
    if ((☃ == afi.aI) || (☃ == afi.cB)) {
      return false;
    }
    if (☃.t() == arm.j) {
      return true;
    }
    if ((☃ == this) && (((Integer)☃.b(a)).intValue() >= 7)) {
      return true;
    }
    return (☃.c()) && (J.c());
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    e(☃, ☃, ☃);
  }
  
  private boolean e(adm ☃, cj ☃, alz ☃)
  {
    if (!d(☃, ☃))
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
      return false;
    }
    return true;
  }
  
  public void a(adm ☃, wn ☃, cj ☃, alz ☃, akw ☃)
  {
    a(☃, ☃, new zx(zy.aD, ((Integer)☃.b(a)).intValue() + 1, 0));
    ☃.g(☃);
    
    ☃.b(na.ab[afh.a(this)]);
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.aD;
  }
  
  public int a(Random ☃)
  {
    return 0;
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (☃.b(ads.b, ☃) > 11)
    {
      b(☃, ☃, ☃.p(☃), 0);
      ☃.g(☃);
    }
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    if (☃ == cq.b) {
      return true;
    }
    return super.a(☃, ☃, ☃);
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Integer.valueOf((☃ & 0x7) + 1));
  }
  
  public boolean a(adm ☃, cj ☃)
  {
    return ((Integer)☃.p(☃).b(a)).intValue() == 1;
  }
  
  public int c(alz ☃)
  {
    return ((Integer)☃.b(a)).intValue() - 1;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
