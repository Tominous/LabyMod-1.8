import java.util.Random;

public class akk
  extends afh
{
  public static final amk a = amk.a("up");
  public static final amk b = amk.a("north");
  public static final amk N = amk.a("east");
  public static final amk O = amk.a("south");
  public static final amk P = amk.a("west");
  public static final amk[] Q = { a, b, O, P, N };
  
  public akk()
  {
    super(arm.l);
    j(this.M.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)).a(P, Boolean.valueOf(false)));
    a(true);
    a(yz.c);
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    return ☃.a(a, Boolean.valueOf(☃.p(☃.a()).c().u()));
  }
  
  public void j()
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean a(adm ☃, cj ☃)
  {
    return true;
  }
  
  public void a(adq ☃, cj ☃)
  {
    float ☃ = 0.0625F;
    
    float ☃ = 1.0F;
    float ☃ = 1.0F;
    float ☃ = 1.0F;
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    boolean ☃ = false;
    if (((Boolean)☃.p(☃).b(P)).booleanValue())
    {
      ☃ = Math.max(☃, 0.0625F);
      ☃ = 0.0F;
      ☃ = 0.0F;
      ☃ = 1.0F;
      ☃ = 0.0F;
      ☃ = 1.0F;
      ☃ = true;
    }
    if (((Boolean)☃.p(☃).b(N)).booleanValue())
    {
      ☃ = Math.min(☃, 0.9375F);
      ☃ = 1.0F;
      ☃ = 0.0F;
      ☃ = 1.0F;
      ☃ = 0.0F;
      ☃ = 1.0F;
      ☃ = true;
    }
    if (((Boolean)☃.p(☃).b(b)).booleanValue())
    {
      ☃ = Math.max(☃, 0.0625F);
      ☃ = 0.0F;
      ☃ = 0.0F;
      ☃ = 1.0F;
      ☃ = 0.0F;
      ☃ = 1.0F;
      ☃ = true;
    }
    if (((Boolean)☃.p(☃).b(O)).booleanValue())
    {
      ☃ = Math.min(☃, 0.9375F);
      ☃ = 1.0F;
      ☃ = 0.0F;
      ☃ = 1.0F;
      ☃ = 0.0F;
      ☃ = 1.0F;
      ☃ = true;
    }
    if ((!☃) && (c(☃.p(☃.a()).c())))
    {
      ☃ = Math.min(☃, 0.9375F);
      ☃ = 1.0F;
      ☃ = 0.0F;
      ☃ = 1.0F;
      ☃ = 0.0F;
      ☃ = 1.0F;
    }
    a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
  }
  
  public boolean b(adm ☃, cj ☃, cq ☃)
  {
    switch (akk.1.a[☃.ordinal()])
    {
    default: 
      return false;
    case 1: 
      return c(☃.p(☃.a()).c());
    }
    return c(☃.p(☃.a(☃.d())).c());
  }
  
  private boolean c(afh ☃)
  {
    return (☃.d()) && (☃.J.c());
  }
  
  private boolean e(adm ☃, cj ☃, alz ☃)
  {
    alz ☃ = ☃;
    for (cq ☃ : cq.c.a)
    {
      amk ☃ = a(☃);
      if ((((Boolean)☃.b(☃)).booleanValue()) && 
        (!c(☃.p(☃.a(☃)).c())))
      {
        alz ☃ = ☃.p(☃.a());
        if ((☃.c() != this) || (!((Boolean)☃.b(☃)).booleanValue())) {
          ☃ = ☃.a(☃, Boolean.valueOf(false));
        }
      }
    }
    if (d(☃) == 0) {
      return false;
    }
    if (☃ != ☃) {
      ☃.a(☃, ☃, 2);
    }
    return true;
  }
  
  public int H()
  {
    return adj.c();
  }
  
  public int h(alz ☃)
  {
    return adj.c();
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    return ☃.b(☃).c(☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if ((!☃.D) && (!e(☃, ☃, ☃)))
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (☃.D) {
      return;
    }
    if (☃.s.nextInt(4) != 0) {
      return;
    }
    int ☃ = 4;
    int ☃ = 5;
    boolean ☃ = false;
    for (int ☃ = -☃; ☃ <= ☃; ☃++) {
      for (int ☃ = -☃; ☃ <= ☃; ☃++) {
        for (int ☃ = -1; ☃ <= 1; ☃++) {
          if (☃.p(☃.a(☃, ☃, ☃)).c() == this)
          {
            ☃--;
            if (☃ <= 0)
            {
              ☃ = true;
              break label117;
            }
          }
        }
      }
    }
    label117:
    cq ☃ = cq.a(☃);
    cj ☃ = ☃.a();
    if ((☃ == cq.b) && (☃.o() < 255) && (☃.d(☃)))
    {
      if (☃) {
        return;
      }
      alz ☃ = ☃;
      for (cq ☃ : cq.c.a) {
        if ((☃.nextBoolean()) || (!c(☃.p(☃.a(☃)).c()))) {
          ☃ = ☃.a(a(☃), Boolean.valueOf(false));
        }
      }
      if ((((Boolean)☃.b(b)).booleanValue()) || (((Boolean)☃.b(N)).booleanValue()) || (((Boolean)☃.b(O)).booleanValue()) || (((Boolean)☃.b(P)).booleanValue())) {
        ☃.a(☃, ☃, 2);
      }
      return;
    }
    if ((☃.k().c()) && (!((Boolean)☃.b(a(☃))).booleanValue()))
    {
      if (☃) {
        return;
      }
      cj ☃ = ☃.a(☃);
      
      afh ☃ = ☃.p(☃).c();
      if (☃.J == arm.a)
      {
        cq ☃ = ☃.e();
        cq ☃ = ☃.f();
        
        boolean ☃ = ((Boolean)☃.b(a(☃))).booleanValue();
        boolean ☃ = ((Boolean)☃.b(a(☃))).booleanValue();
        
        cj ☃ = ☃.a(☃);
        cj ☃ = ☃.a(☃);
        if ((☃) && (c(☃.p(☃).c()))) {
          ☃.a(☃, Q().a(a(☃), Boolean.valueOf(true)), 2);
        } else if ((☃) && (c(☃.p(☃).c()))) {
          ☃.a(☃, Q().a(a(☃), Boolean.valueOf(true)), 2);
        } else if ((☃) && (☃.d(☃)) && (c(☃.p(☃.a(☃)).c()))) {
          ☃.a(☃, Q().a(a(☃.d()), Boolean.valueOf(true)), 2);
        } else if ((☃) && (☃.d(☃)) && (c(☃.p(☃.a(☃)).c()))) {
          ☃.a(☃, Q().a(a(☃.d()), Boolean.valueOf(true)), 2);
        } else if (c(☃.p(☃.a()).c())) {
          ☃.a(☃, Q(), 2);
        }
      }
      else if ((☃.J.k()) && (☃.d()))
      {
        ☃.a(☃, ☃.a(a(☃), Boolean.valueOf(true)), 2);
      }
      return;
    }
    if (☃.o() > 1)
    {
      cj ☃ = ☃.b();
      alz ☃ = ☃.p(☃);
      afh ☃ = ☃.c();
      if (☃.J == arm.a)
      {
        alz ☃ = ☃;
        for (cq ☃ : cq.c.a) {
          if (☃.nextBoolean()) {
            ☃ = ☃.a(a(☃), Boolean.valueOf(false));
          }
        }
        if ((((Boolean)☃.b(b)).booleanValue()) || (((Boolean)☃.b(N)).booleanValue()) || (((Boolean)☃.b(O)).booleanValue()) || (((Boolean)☃.b(P)).booleanValue())) {
          ☃.a(☃, ☃, 2);
        }
      }
      else if (☃ == this)
      {
        alz ☃ = ☃;
        for (cq ☃ : cq.c.a)
        {
          amk ☃ = a(☃);
          if ((☃.nextBoolean()) && (((Boolean)☃.b(☃)).booleanValue())) {
            ☃ = ☃.a(☃, Boolean.valueOf(true));
          }
        }
        if ((((Boolean)☃.b(b)).booleanValue()) || (((Boolean)☃.b(N)).booleanValue()) || (((Boolean)☃.b(O)).booleanValue()) || (((Boolean)☃.b(P)).booleanValue())) {
          ☃.a(☃, ☃, 2);
        }
      }
    }
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    alz ☃ = Q().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)).a(P, Boolean.valueOf(false));
    if (☃.k().c()) {
      return ☃.a(a(☃.d()), Boolean.valueOf(true));
    }
    return ☃;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return null;
  }
  
  public int a(Random ☃)
  {
    return 0;
  }
  
  public void a(adm ☃, wn ☃, cj ☃, alz ☃, akw ☃)
  {
    if ((!☃.D) && (☃.bZ() != null) && (☃.bZ().b() == zy.be))
    {
      ☃.b(na.ab[afh.a(this)]);
      
      a(☃, ☃, new zx(afi.bn, 1, 0));
    }
    else
    {
      super.a(☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public alz a(int ☃)
  {
    return Q().a(O, Boolean.valueOf((☃ & 0x1) > 0)).a(P, Boolean.valueOf((☃ & 0x2) > 0)).a(b, Boolean.valueOf((☃ & 0x4) > 0)).a(N, Boolean.valueOf((☃ & 0x8) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    if (((Boolean)☃.b(O)).booleanValue()) {
      ☃ |= 0x1;
    }
    if (((Boolean)☃.b(P)).booleanValue()) {
      ☃ |= 0x2;
    }
    if (((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x4;
    }
    if (((Boolean)☃.b(N)).booleanValue()) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b, N, O, P });
  }
  
  public static amk a(cq ☃)
  {
    switch (akk.1.a[☃.ordinal()])
    {
    case 1: 
      return a;
    case 2: 
      return b;
    case 3: 
      return O;
    case 5: 
      return P;
    case 4: 
      return N;
    }
    throw new IllegalArgumentException(☃ + " is an invalid choice");
  }
  
  public static int d(alz ☃)
  {
    int ☃ = 0;
    for (amk ☃ : Q) {
      if (((Boolean)☃.b(☃)).booleanValue()) {
        ☃++;
      }
    }
    return ☃;
  }
}
