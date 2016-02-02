public class agu
  extends age
{
  public static final amk a = amk.a("open");
  public static final amk b = amk.a("powered");
  public static final amk N = amk.a("in_wall");
  
  public agu(aio.a ☃)
  {
    super(arm.d, ☃.c());
    
    j(this.M.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)));
    a(yz.d);
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    cq.a ☃ = ((cq)☃.b(O)).k();
    if (((☃ == cq.a.c) && ((☃.p(☃.e()).c() == afi.bZ) || (☃.p(☃.f()).c() == afi.bZ))) || ((☃ == cq.a.a) && ((☃.p(☃.c()).c() == afi.bZ) || (☃.p(☃.d()).c() == afi.bZ)))) {
      ☃ = ☃.a(N, Boolean.valueOf(true));
    }
    return ☃;
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    if (☃.p(☃.b()).c().t().a()) {
      return super.d(☃, ☃);
    }
    return false;
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    if (((Boolean)☃.b(a)).booleanValue()) {
      return null;
    }
    cq.a ☃ = ((cq)☃.b(O)).k();
    if (☃ == cq.a.c) {
      return new aug(☃.n(), ☃.o(), ☃.p() + 0.375F, ☃.n() + 1, ☃.o() + 1.5F, ☃.p() + 0.625F);
    }
    return new aug(☃.n() + 0.375F, ☃.o(), ☃.p(), ☃.n() + 0.625F, ☃.o() + 1.5F, ☃.p() + 1);
  }
  
  public void a(adq ☃, cj ☃)
  {
    cq.a ☃ = ((cq)☃.p(☃).b(O)).k();
    if (☃ == cq.a.c) {
      a(0.0F, 0.0F, 0.375F, 1.0F, 1.0F, 0.625F);
    } else {
      a(0.375F, 0.0F, 0.0F, 0.625F, 1.0F, 1.0F);
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
  
  public boolean b(adq ☃, cj ☃)
  {
    return ((Boolean)☃.p(☃).b(a)).booleanValue();
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q().a(O, ☃.aP()).a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false));
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (((Boolean)☃.b(a)).booleanValue())
    {
      ☃ = ☃.a(a, Boolean.valueOf(false));
      ☃.a(☃, ☃, 2);
    }
    else
    {
      cq ☃ = cq.a(☃.y);
      if (☃.b(O) == ☃.d()) {
        ☃ = ☃.a(O, ☃);
      }
      ☃ = ☃.a(a, Boolean.valueOf(true));
      ☃.a(☃, ☃, 2);
    }
    ☃.a(☃, ((Boolean)☃.b(a)).booleanValue() ? 1003 : 1006, ☃, 0);
    return true;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (☃.D) {
      return;
    }
    boolean ☃ = ☃.z(☃);
    if ((☃) || (☃.i())) {
      if ((☃) && (!((Boolean)☃.b(a)).booleanValue()) && (!((Boolean)☃.b(b)).booleanValue()))
      {
        ☃.a(☃, ☃.a(a, Boolean.valueOf(true)).a(b, Boolean.valueOf(true)), 2);
        ☃.a(null, 1003, ☃, 0);
      }
      else if ((!☃) && (((Boolean)☃.b(a)).booleanValue()) && (((Boolean)☃.b(b)).booleanValue()))
      {
        ☃.a(☃, ☃.a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
        ☃.a(null, 1006, ☃, 0);
      }
      else if (☃ != ((Boolean)☃.b(b)).booleanValue())
      {
        ☃.a(☃, ☃.a(b, Boolean.valueOf(☃)), 2);
      }
    }
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    return true;
  }
  
  public alz a(int ☃)
  {
    return Q().a(O, cq.b(☃)).a(a, Boolean.valueOf((☃ & 0x4) != 0)).a(b, Boolean.valueOf((☃ & 0x8) != 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(O)).b();
    if (((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x8;
    }
    if (((Boolean)☃.b(a)).booleanValue()) {
      ☃ |= 0x4;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { O, a, b, N });
  }
}
