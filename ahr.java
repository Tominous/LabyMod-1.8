public class ahr
  extends afh
{
  public static final aml a = aml.a("facing", cq.c.a);
  
  protected ahr()
  {
    super(arm.q);
    j(M.b().a(a, cq.c));
    a(yz.c);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    a(☃, ☃);
    return super.a(☃, ☃, ☃);
  }
  
  public aug b(adm ☃, cj ☃)
  {
    a(☃, ☃);
    return super.b(☃, ☃);
  }
  
  public void a(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    if (☃.c() != this) {
      return;
    }
    float ☃ = 0.125F;
    switch (ahr.1.a[((cq)☃.b(a)).ordinal()])
    {
    case 1: 
      a(0.0F, 0.0F, 1.0F - ☃, 1.0F, 1.0F, 1.0F);
      break;
    case 2: 
      a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, ☃);
      break;
    case 3: 
      a(1.0F - ☃, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      break;
    case 4: 
    default: 
      a(0.0F, 0.0F, 0.0F, ☃, 1.0F, 1.0F);
    }
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    if (☃.p(☃.e()).c().v()) {
      return true;
    }
    if (☃.p(☃.f()).c().v()) {
      return true;
    }
    if (☃.p(☃.c()).c().v()) {
      return true;
    }
    if (☃.p(☃.d()).c().v()) {
      return true;
    }
    return false;
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    if ((☃.k().c()) && (a(☃, ☃, ☃))) {
      return Q().a(a, ☃);
    }
    for (cq ☃ : cq.c.a) {
      if (a(☃, ☃, ☃)) {
        return Q().a(a, ☃);
      }
    }
    return Q();
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    cq ☃ = (cq)☃.b(a);
    if (!a(☃, ☃, ☃))
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
    }
    super.a(☃, ☃, ☃, ☃);
  }
  
  protected boolean a(adm ☃, cj ☃, cq ☃)
  {
    return ☃.p(☃.a(☃.d())).c().v();
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public alz a(int ☃)
  {
    cq ☃ = cq.a(☃);
    if (☃.k() == cq.a.b) {
      ☃ = cq.c;
    }
    return Q().a(a, ☃);
  }
  
  public int c(alz ☃)
  {
    return ((cq)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
