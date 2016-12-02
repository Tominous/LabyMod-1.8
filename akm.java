public class akm
  extends ajl
{
  public static final aml a = aml.a("facing", cq.c.a);
  
  public akm()
  {
    j(M.b().a(a, cq.c));
  }
  
  public void a(adq ☃, cj ☃)
  {
    cq ☃ = (cq)☃.p(☃).b(a);
    
    float ☃ = 0.28125F;
    float ☃ = 0.78125F;
    float ☃ = 0.0F;
    float ☃ = 1.0F;
    
    float ☃ = 0.125F;
    
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    switch (akm.1.a[☃.ordinal()])
    {
    case 1: 
      a(☃, ☃, 1.0F - ☃, ☃, ☃, 1.0F);
      break;
    case 2: 
      a(☃, ☃, 0.0F, ☃, ☃, ☃);
      break;
    case 3: 
      a(1.0F - ☃, ☃, ☃, 1.0F, ☃, ☃);
      break;
    case 4: 
      a(0.0F, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    cq ☃ = (cq)☃.b(a);
    if (!☃.p(☃.a(☃.d())).c().t().a())
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
    }
    super.a(☃, ☃, ☃, ☃);
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
