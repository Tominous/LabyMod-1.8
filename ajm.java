import com.google.common.base.Predicate;
import java.util.Random;

public class ajm
  extends afc
{
  public static final aml a = aml.a("facing");
  public static final amk b = amk.a("nodrop");
  private static final Predicate<amc> N = new Predicate()
  {
    public boolean a(amc ☃)
    {
      return (☃.a() != null) && (☃.a().c() == afi.ce) && ((☃.b() instanceof alo)) && (((alo)☃.b()).c() == 1);
    }
  };
  private amd O;
  private amd P;
  
  protected ajm()
  {
    super(arm.q);
    j(M.b().a(a, cq.c).a(b, Boolean.valueOf(false)));
    a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
  }
  
  public String f()
  {
    return di.a("tile.skull.skeleton.name");
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public void a(adq ☃, cj ☃)
  {
    switch (ajm.2.a[((cq)☃.p(☃).b(a)).ordinal()])
    {
    case 1: 
    default: 
      a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
      break;
    case 2: 
      a(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
      break;
    case 3: 
      a(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
      break;
    case 4: 
      a(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
      break;
    case 5: 
      a(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
    }
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    a(☃, ☃);
    return super.a(☃, ☃, ☃);
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q().a(a, ☃.aP()).a(b, Boolean.valueOf(false));
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new alo();
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.bX;
  }
  
  public int j(adm ☃, cj ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alo)) {
      return ((alo)☃).c();
    }
    return super.j(☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃) {}
  
  public void a(adm ☃, cj ☃, alz ☃, wn ☃)
  {
    if (bA.d)
    {
      ☃ = ☃.a(b, Boolean.valueOf(true));
      ☃.a(☃, ☃, 4);
    }
    super.a(☃, ☃, ☃, ☃);
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    if (D) {
      return;
    }
    if (!((Boolean)☃.b(b)).booleanValue())
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof alo))
      {
        alo ☃ = (alo)☃;
        zx ☃ = new zx(zy.bX, 1, j(☃, ☃));
        if ((☃.c() == 3) && (☃.b() != null))
        {
          ☃.d(new dn());
          
          dn ☃ = new dn();
          
          dy.a(☃, ☃.b());
          ☃.o().a("SkullOwner", ☃);
        }
        a(☃, ☃, ☃);
      }
    }
    super.b(☃, ☃, ☃);
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.bX;
  }
  
  public boolean b(adm ☃, cj ☃, zx ☃)
  {
    if ((☃.i() == 1) && (☃.o() >= 2) && (☃.aa() != oj.a) && (!D)) {
      return l().a(☃, ☃) != null;
    }
    return false;
  }
  
  public void a(adm ☃, cj ☃, alo ☃)
  {
    if ((☃.c() != 1) || (☃.o() < 2) || (☃.aa() == oj.a) || (D)) {
      return;
    }
    amd ☃ = n();
    amd.b ☃ = ☃.a(☃, ☃);
    if (☃ == null) {
      return;
    }
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      amc ☃ = ☃.a(☃, 0, 0);
      ☃.a(☃.d(), ☃.a().a(b, Boolean.valueOf(true)), 2);
    }
    for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
      for (int ☃ = 0; ☃ < ☃.b(); ☃++)
      {
        amc ☃ = ☃.a(☃, ☃, 0);
        ☃.a(☃.d(), afi.a.Q(), 2);
      }
    }
    cj ☃ = ☃.a(1, 0, 0).d();
    
    uk ☃ = new uk(☃);
    cj ☃ = ☃.a(1, 2, 0).d();
    ☃.b(☃.n() + 0.5D, ☃.o() + 0.55D, ☃.p() + 0.5D, ☃.b().k() == cq.a.a ? 0.0F : 90.0F, 0.0F);
    aI = (☃.b().k() == cq.a.a ? 0.0F : 90.0F);
    ☃.n();
    for (wn ☃ : ☃.a(wn.class, ☃.aR().b(50.0D, 50.0D, 50.0D))) {
      ☃.b(mr.I);
    }
    ☃.d(☃);
    for (int ☃ = 0; ☃ < 120; ☃++) {
      ☃.a(cy.F, ☃.n() + s.nextDouble(), ☃.o() - 2 + s.nextDouble() * 3.9D, ☃.p() + s.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
    }
    for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
      for (int ☃ = 0; ☃ < ☃.b(); ☃++)
      {
        amc ☃ = ☃.a(☃, ☃, 0);
        ☃.b(☃.d(), afi.a);
      }
    }
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, cq.a(☃ & 0x7)).a(b, Boolean.valueOf((☃ & 0x8) > 0));
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
  
  protected amd l()
  {
    if (O == null) {
      O = ame.a().a(new String[] { "   ", "###", "~#~" }).a('#', amc.a(amh.a(afi.aW))).a('~', amc.a(amh.a(afi.a))).b();
    }
    return O;
  }
  
  protected amd n()
  {
    if (P == null) {
      P = ame.a().a(new String[] { "^^^", "###", "~#~" }).a('#', amc.a(amh.a(afi.aW))).a('^', N).a('~', amc.a(amh.a(afi.a))).b();
    }
    return P;
  }
}
