import java.util.List;

public class aks
  extends afh
{
  public static final amm<zd> a = amm.a("color", zd.class);
  
  protected aks()
  {
    super(arm.r);
    j(M.b().a(a, zd.a));
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
    a(true);
    a(yz.c);
    b(0);
  }
  
  public arn g(alz ☃)
  {
    return ((zd)☃.b(a)).e();
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
    b(0);
  }
  
  protected void b(int ☃)
  {
    int ☃ = 0;
    float ☃ = 1 * (1 + ☃) / 16.0F;
    a(0.0F, 0.0F, 0.0F, 1.0F, ☃, 1.0F);
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return (super.d(☃, ☃)) && (e(☃, ☃));
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    e(☃, ☃, ☃);
  }
  
  private boolean e(adm ☃, cj ☃, alz ☃)
  {
    if (!e(☃, ☃))
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
      return false;
    }
    return true;
  }
  
  private boolean e(adm ☃, cj ☃)
  {
    return !☃.d(☃.b());
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    if (☃ == cq.b) {
      return true;
    }
    return super.a(☃, ☃, ☃);
  }
  
  public int a(alz ☃)
  {
    return ((zd)☃.b(a)).a();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (int ☃ = 0; ☃ < 16; ☃++) {
      ☃.add(new zx(☃, 1, ☃));
    }
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, zd.b(☃));
  }
  
  public int c(alz ☃)
  {
    return ((zd)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
