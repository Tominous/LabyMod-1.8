import java.util.Random;

public class afm
  extends afh
{
  protected afm()
  {
    this(arm.k);
  }
  
  protected afm(arm ☃)
  {
    this(☃, ☃.r());
  }
  
  protected afm(arm ☃, arn ☃)
  {
    super(☃, ☃);
    a(true);
    float ☃ = 0.2F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, ☃ * 3.0F, 0.5F + ☃);
    a(yz.c);
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return (super.d(☃, ☃)) && (c(☃.p(☃.b()).c()));
  }
  
  protected boolean c(afh ☃)
  {
    return (☃ == afi.c) || (☃ == afi.d) || (☃ == afi.ak);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    super.a(☃, ☃, ☃, ☃);
    e(☃, ☃, ☃);
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    e(☃, ☃, ☃);
  }
  
  protected void e(adm ☃, cj ☃, alz ☃)
  {
    if (!f(☃, ☃, ☃))
    {
      b(☃, ☃, ☃, 0);
      ☃.a(☃, afi.a.Q(), 3);
    }
  }
  
  public boolean f(adm ☃, cj ☃, alz ☃)
  {
    return c(☃.p(☃.b()).c());
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public adf m()
  {
    return adf.c;
  }
}
