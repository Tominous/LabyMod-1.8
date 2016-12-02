import java.util.Random;

public abstract class afd
  extends afh
{
  protected afd(arm ☃)
  {
    this(☃, ☃.r());
  }
  
  protected afd(arm ☃, arn ☃)
  {
    super(☃, ☃);
    a(yz.d);
    a(true);
  }
  
  public void a(adq ☃, cj ☃)
  {
    d(☃.p(☃));
  }
  
  protected void d(alz ☃)
  {
    boolean ☃ = e(☃) > 0;
    float ☃ = 0.0625F;
    if (☃) {
      a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.03125F, 0.9375F);
    } else {
      a(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.0625F, 0.9375F);
    }
  }
  
  public int a(adm ☃)
  {
    return 20;
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
  
  public boolean b(adq ☃, cj ☃)
  {
    return true;
  }
  
  public boolean g()
  {
    return true;
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return m(☃, ☃.b());
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (!m(☃, ☃.b()))
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
    }
  }
  
  private boolean m(adm ☃, cj ☃)
  {
    return (adm.a(☃, ☃)) || ((☃.p(☃).c() instanceof agt));
  }
  
  public void a(adm ☃, cj ☃, alz ☃, Random ☃) {}
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (☃.D) {
      return;
    }
    int ☃ = e(☃);
    if (☃ > 0) {
      a(☃, ☃, ☃, ☃);
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pk ☃)
  {
    if (☃.D) {
      return;
    }
    int ☃ = e(☃);
    if (☃ == 0) {
      a(☃, ☃, ☃, ☃);
    }
  }
  
  protected void a(adm ☃, cj ☃, alz ☃, int ☃)
  {
    int ☃ = f(☃, ☃);
    boolean ☃ = ☃ > 0;
    boolean ☃ = ☃ > 0;
    if (☃ != ☃)
    {
      ☃ = a(☃, ☃);
      ☃.a(☃, ☃, 2);
      e(☃, ☃);
      ☃.b(☃, ☃);
    }
    if ((!☃) && (☃)) {
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.1D, ☃.p() + 0.5D, "random.click", 0.3F, 0.5F);
    } else if ((☃) && (!☃)) {
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.1D, ☃.p() + 0.5D, "random.click", 0.3F, 0.6F);
    }
    if (☃) {
      ☃.a(☃, this, a(☃));
    }
  }
  
  protected aug a(cj ☃)
  {
    float ☃ = 0.125F;
    return new aug(☃.n() + 0.125F, ☃.o(), ☃.p() + 0.125F, ☃.n() + 1 - 0.125F, ☃.o() + 0.25D, ☃.p() + 1 - 0.125F);
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    if (e(☃) > 0) {
      e(☃, ☃);
    }
    super.b(☃, ☃, ☃);
  }
  
  protected void e(adm ☃, cj ☃)
  {
    ☃.c(☃, this);
    ☃.c(☃.b(), this);
  }
  
  public int a(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    return e(☃);
  }
  
  public int b(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    if (☃ == cq.b) {
      return e(☃);
    }
    return 0;
  }
  
  public boolean i()
  {
    return true;
  }
  
  public void j()
  {
    float ☃ = 0.5F;
    float ☃ = 0.125F;
    float ☃ = 0.5F;
    a(0.0F, 0.375F, 0.0F, 1.0F, 0.625F, 1.0F);
  }
  
  public int k()
  {
    return 1;
  }
  
  protected abstract int f(adm paramadm, cj paramcj);
  
  protected abstract int e(alz paramalz);
  
  protected abstract alz a(alz paramalz, int paramInt);
}
