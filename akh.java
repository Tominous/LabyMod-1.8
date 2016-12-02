public class akh
  extends afh
{
  public static final aml a = aml.a("facing", cq.c.a);
  public static final amk b = amk.a("open");
  public static final amm<akh.a> N = amm.a("half", akh.a.class);
  
  protected akh(arm ☃)
  {
    super(☃);
    j(this.M.b().a(a, cq.c).a(b, Boolean.valueOf(false)).a(N, akh.a.b));
    float ☃ = 0.5F;
    float ☃ = 1.0F;
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    a(yz.d);
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
    return !((Boolean)☃.p(☃).b(b)).booleanValue();
  }
  
  public aug b(adm ☃, cj ☃)
  {
    a(☃, ☃);
    return super.b(☃, ☃);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    a(☃, ☃);
    return super.a(☃, ☃, ☃);
  }
  
  public void a(adq ☃, cj ☃)
  {
    d(☃.p(☃));
  }
  
  public void j()
  {
    float ☃ = 0.1875F;
    a(0.0F, 0.40625F, 0.0F, 1.0F, 0.59375F, 1.0F);
  }
  
  public void d(alz ☃)
  {
    if (☃.c() != this) {
      return;
    }
    boolean ☃ = ☃.b(N) == akh.a.a;
    Boolean ☃ = (Boolean)☃.b(b);
    cq ☃ = (cq)☃.b(a);
    
    float ☃ = 0.1875F;
    if (☃) {
      a(0.0F, 0.8125F, 0.0F, 1.0F, 1.0F, 1.0F);
    } else {
      a(0.0F, 0.0F, 0.0F, 1.0F, 0.1875F, 1.0F);
    }
    if (☃.booleanValue())
    {
      if (☃ == cq.c) {
        a(0.0F, 0.0F, 0.8125F, 1.0F, 1.0F, 1.0F);
      }
      if (☃ == cq.d) {
        a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.1875F);
      }
      if (☃ == cq.e) {
        a(0.8125F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }
      if (☃ == cq.f) {
        a(0.0F, 0.0F, 0.0F, 0.1875F, 1.0F, 1.0F);
      }
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (this.J == arm.f) {
      return true;
    }
    ☃ = ☃.a(b);
    ☃.a(☃, ☃, 2);
    
    ☃.a(☃, ((Boolean)☃.b(b)).booleanValue() ? 1003 : 1006, ☃, 0);
    return true;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (☃.D) {
      return;
    }
    cj ☃ = ☃.a(((cq)☃.b(a)).d());
    if (!c(☃.p(☃).c()))
    {
      ☃.g(☃);
      b(☃, ☃, ☃, 0);
      return;
    }
    boolean ☃ = ☃.z(☃);
    if ((☃) || (☃.i()))
    {
      boolean ☃ = ((Boolean)☃.b(b)).booleanValue();
      if (☃ != ☃)
      {
        ☃.a(☃, ☃.a(b, Boolean.valueOf(☃)), 2);
        ☃.a(null, ☃ ? 1003 : 1006, ☃, 0);
      }
    }
  }
  
  public auh a(adm ☃, cj ☃, aui ☃, aui ☃)
  {
    a(☃, ☃);
    return super.a(☃, ☃, ☃, ☃);
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    alz ☃ = Q();
    if (☃.k().c())
    {
      ☃ = ☃.a(a, ☃).a(b, Boolean.valueOf(false));
      ☃ = ☃.a(N, ☃ > 0.5F ? akh.a.a : akh.a.b);
    }
    return ☃;
  }
  
  public boolean b(adm ☃, cj ☃, cq ☃)
  {
    return (!☃.k().b()) && (c(☃.p(☃.a(☃.d())).c()));
  }
  
  protected static cq b(int ☃)
  {
    switch (☃ & 0x3)
    {
    case 0: 
      return cq.c;
    case 1: 
      return cq.d;
    case 2: 
      return cq.e;
    }
    return cq.f;
  }
  
  protected static int a(cq ☃)
  {
    switch (akh.1.a[☃.ordinal()])
    {
    case 1: 
      return 0;
    case 2: 
      return 1;
    case 3: 
      return 2;
    }
    return 3;
  }
  
  private static boolean c(afh ☃)
  {
    return ((☃.J.k()) && (☃.d())) || (☃ == afi.aX) || ((☃ instanceof ahh)) || ((☃ instanceof aju));
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, b(☃)).a(b, Boolean.valueOf((☃ & 0x4) != 0)).a(N, (☃ & 0x8) == 0 ? akh.a.b : akh.a.a);
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= a((cq)☃.b(a));
    if (((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x4;
    }
    if (☃.b(N) == akh.a.a) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b, N });
  }
  
  public static enum a
    implements nw
  {
    private final String c;
    
    private a(String ☃)
    {
      this.c = ☃;
    }
    
    public String toString()
    {
      return this.c;
    }
    
    public String l()
    {
      return this.c;
    }
  }
}
