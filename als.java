import java.util.List;
import java.util.Random;

public class als
  extends afh
{
  public static final aml a = aml.a("facing");
  public static final amk b = amk.a("extended");
  private final boolean N;
  
  public als(boolean ☃)
  {
    super(arm.H);
    j(M.b().a(a, cq.c).a(b, Boolean.valueOf(false)));
    N = ☃;
    a(i);
    c(0.5F);
    a(yz.d);
  }
  
  public boolean c()
  {
    return false;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    ☃.a(☃, ☃.a(a, a(☃, ☃, ☃)), 2);
    if (!D) {
      e(☃, ☃, ☃);
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (!D) {
      e(☃, ☃, ☃);
    }
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    if ((!D) && (☃.s(☃) == null)) {
      e(☃, ☃, ☃);
    }
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q().a(a, a(☃, ☃, ☃)).a(b, Boolean.valueOf(false));
  }
  
  private void e(adm ☃, cj ☃, alz ☃)
  {
    cq ☃ = (cq)☃.b(a);
    
    boolean ☃ = a(☃, ☃, ☃);
    if ((☃) && (!((Boolean)☃.b(b)).booleanValue()))
    {
      if (new alw(☃, ☃, ☃, true).a()) {
        ☃.c(☃, this, 0, ☃.a());
      }
    }
    else if ((!☃) && (((Boolean)☃.b(b)).booleanValue()))
    {
      ☃.a(☃, ☃.a(b, Boolean.valueOf(false)), 2);
      ☃.c(☃, this, 1, ☃.a());
    }
  }
  
  private boolean a(adm ☃, cj ☃, cq ☃)
  {
    for (cq ☃ : ) {
      if ((☃ != ☃) && (☃.b(☃.a(☃), ☃))) {
        return true;
      }
    }
    if (☃.b(☃, cq.a)) {
      return true;
    }
    cj ☃ = ☃.a();
    for (cq ☃ : cq.values()) {
      if ((☃ != cq.a) && (☃.b(☃.a(☃), ☃))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, int ☃, int ☃)
  {
    cq ☃ = (cq)☃.b(a);
    if (!D)
    {
      boolean ☃ = a(☃, ☃, ☃);
      if ((☃) && (☃ == 1))
      {
        ☃.a(☃, ☃.a(b, Boolean.valueOf(true)), 2);
        return false;
      }
      if ((!☃) && (☃ == 0)) {
        return false;
      }
    }
    if (☃ == 0)
    {
      if (a(☃, ☃, ☃, true))
      {
        ☃.a(☃, ☃.a(b, Boolean.valueOf(true)), 2);
        ☃.a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, "tile.piston.out", 0.5F, s.nextFloat() * 0.25F + 0.6F);
      }
      else
      {
        return false;
      }
    }
    else if (☃ == 1)
    {
      akw ☃ = ☃.s(☃.a(☃));
      if ((☃ instanceof alu)) {
        ((alu)☃).h();
      }
      ☃.a(☃, afi.M.Q().a(alv.a, ☃).a(alv.b, N ? alt.a.b : alt.a.a), 3);
      ☃.a(☃, alv.a(a(☃), ☃, false, true));
      if (N)
      {
        cj ☃ = ☃.a(☃.g() * 2, ☃.h() * 2, ☃.i() * 2);
        afh ☃ = ☃.p(☃).c();
        boolean ☃ = false;
        if (☃ == afi.M)
        {
          akw ☃ = ☃.s(☃);
          if ((☃ instanceof alu))
          {
            alu ☃ = (alu)☃;
            if ((☃.e() == ☃) && (☃.d()))
            {
              ☃.h();
              ☃ = true;
            }
          }
        }
        if ((!☃) && (☃.t() != arm.a) && (a(☃, ☃, ☃, ☃.d(), false)) && ((☃.k() == 0) || (☃ == afi.J) || (☃ == afi.F))) {
          a(☃, ☃, ☃, false);
        }
      }
      else
      {
        ☃.g(☃.a(☃));
      }
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, "tile.piston.in", 0.5F, s.nextFloat() * 0.15F + 0.6F);
    }
    return true;
  }
  
  public void a(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    if ((☃.c() == this) && (((Boolean)☃.b(b)).booleanValue()))
    {
      float ☃ = 0.25F;
      cq ☃ = (cq)☃.b(a);
      if (☃ != null) {
        switch (als.1.a[☃.ordinal()])
        {
        case 1: 
          a(0.0F, 0.25F, 0.0F, 1.0F, 1.0F, 1.0F);
          break;
        case 2: 
          a(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
          break;
        case 3: 
          a(0.0F, 0.0F, 0.25F, 1.0F, 1.0F, 1.0F);
          break;
        case 4: 
          a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.75F);
          break;
        case 5: 
          a(0.25F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
          break;
        case 6: 
          a(0.0F, 0.0F, 0.0F, 0.75F, 1.0F, 1.0F);
        }
      }
    }
    else
    {
      a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }
  }
  
  public void j()
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, aug ☃, List<aug> ☃, pk ☃)
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    a(☃, ☃);
    return super.a(☃, ☃, ☃);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public static cq b(int ☃)
  {
    int ☃ = ☃ & 0x7;
    if (☃ > 5) {
      return null;
    }
    return cq.a(☃);
  }
  
  public static cq a(adm ☃, cj ☃, pr ☃)
  {
    if ((ns.e((float)s - ☃.n()) < 2.0F) && (ns.e((float)u - ☃.p()) < 2.0F))
    {
      double ☃ = t + ☃.aS();
      if (☃ - ☃.o() > 2.0D) {
        return cq.b;
      }
      if (☃.o() - ☃ > 0.0D) {
        return cq.a;
      }
    }
    return ☃.aP().d();
  }
  
  public static boolean a(afh ☃, adm ☃, cj ☃, cq ☃, boolean ☃)
  {
    if (☃ == afi.Z) {
      return false;
    }
    if (!☃.af().a(☃)) {
      return false;
    }
    if ((☃.o() < 0) || ((☃ == cq.a) && (☃.o() == 0))) {
      return false;
    }
    if ((☃.o() > ☃.U() - 1) || ((☃ == cq.b) && (☃.o() == ☃.U() - 1))) {
      return false;
    }
    if ((☃ == afi.J) || (☃ == afi.F))
    {
      if (((Boolean)☃.p(☃).b(b)).booleanValue()) {
        return false;
      }
    }
    else
    {
      if (☃.g(☃, ☃) == -1.0F) {
        return false;
      }
      if (☃.k() == 2) {
        return false;
      }
      if (☃.k() == 1)
      {
        if (!☃) {
          return false;
        }
        return true;
      }
    }
    if ((☃ instanceof agq)) {
      return false;
    }
    return true;
  }
  
  private boolean a(adm ☃, cj ☃, cq ☃, boolean ☃)
  {
    if (!☃) {
      ☃.g(☃.a(☃));
    }
    alw ☃ = new alw(☃, ☃, ☃, ☃);
    List<cj> ☃ = ☃.c();
    List<cj> ☃ = ☃.d();
    if (!☃.a()) {
      return false;
    }
    int ☃ = ☃.size() + ☃.size();
    afh[] ☃ = new afh[☃];
    cq ☃ = ☃ ? ☃ : ☃.d();
    for (int ☃ = ☃.size() - 1; ☃ >= 0; ☃--)
    {
      cj ☃ = (cj)☃.get(☃);
      afh ☃ = ☃.p(☃).c();
      
      ☃.b(☃, ☃, ☃.p(☃), 0);
      ☃.g(☃);
      
      ☃[(--☃)] = ☃;
    }
    for (int ☃ = ☃.size() - 1; ☃ >= 0; ☃--)
    {
      cj ☃ = (cj)☃.get(☃);
      alz ☃ = ☃.p(☃);
      afh ☃ = ☃.c();
      int ☃ = ☃.c(☃);
      
      ☃.g(☃);
      ☃ = ☃.a(☃);
      
      ☃.a(☃, afi.M.Q().a(a, ☃), 4);
      ☃.a(☃, alv.a(☃, ☃, ☃, false));
      
      ☃[(--☃)] = ☃;
    }
    cj ☃ = ☃.a(☃);
    if (☃)
    {
      alt.a ☃ = N ? alt.a.b : alt.a.a;
      alz ☃ = afi.K.Q().a(alt.a, ☃).a(alt.b, ☃);
      
      alz ☃ = afi.M.Q().a(alv.a, ☃).a(alv.b, N ? alt.a.b : alt.a.a);
      
      ☃.a(☃, ☃, 4);
      ☃.a(☃, alv.a(☃, ☃, true, false));
    }
    for (int ☃ = ☃.size() - 1; ☃ >= 0; ☃--) {
      ☃.c((cj)☃.get(☃), ☃[(☃++)]);
    }
    for (int ☃ = ☃.size() - 1; ☃ >= 0; ☃--) {
      ☃.c((cj)☃.get(☃), ☃[(☃++)]);
    }
    if (☃)
    {
      ☃.c(☃, afi.K);
      ☃.c(☃, this);
    }
    return true;
  }
  
  public alz b(alz ☃)
  {
    return Q().a(a, cq.b);
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, b(☃)).a(b, Boolean.valueOf((☃ & 0x8) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(a)).a();
    if (((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b });
  }
}
