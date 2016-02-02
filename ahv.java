import java.util.Random;

public abstract class ahv
  extends afh
{
  public static final amn b = amn.a("level", 0, 15);
  
  protected ahv(arm ☃)
  {
    super(☃);
    j(this.M.b().a(b, Integer.valueOf(0)));
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    a(true);
  }
  
  public boolean b(adq ☃, cj ☃)
  {
    return this.J != arm.i;
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    if (this.J == arm.h) {
      return aea.c(☃, ☃);
    }
    return 16777215;
  }
  
  public static float b(int ☃)
  {
    if (☃ >= 8) {
      ☃ = 0;
    }
    return (☃ + 1) / 9.0F;
  }
  
  protected int e(adq ☃, cj ☃)
  {
    if (☃.p(☃).c().t() == this.J) {
      return ((Integer)☃.p(☃).b(b)).intValue();
    }
    return -1;
  }
  
  protected int f(adq ☃, cj ☃)
  {
    int ☃ = e(☃, ☃);
    
    return ☃ >= 8 ? 0 : ☃;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean a(alz ☃, boolean ☃)
  {
    return (☃) && (((Integer)☃.b(b)).intValue() == 0);
  }
  
  public boolean b(adq ☃, cj ☃, cq ☃)
  {
    arm ☃ = ☃.p(☃).c().t();
    if (☃ == this.J) {
      return false;
    }
    if (☃ == cq.b) {
      return true;
    }
    if (☃ == arm.w) {
      return false;
    }
    return super.b(☃, ☃, ☃);
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    if (☃.p(☃).c().t() == this.J) {
      return false;
    }
    if (☃ == cq.b) {
      return true;
    }
    return super.a(☃, ☃, ☃);
  }
  
  public boolean g(adq ☃, cj ☃)
  {
    for (int ☃ = -1; ☃ <= 1; ☃++) {
      for (int ☃ = -1; ☃ <= 1; ☃++)
      {
        alz ☃ = ☃.p(☃.a(☃, 0, ☃));
        afh ☃ = ☃.c();
        arm ☃ = ☃.t();
        if ((☃ != this.J) && (!☃.o())) {
          return true;
        }
      }
    }
    return false;
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
  }
  
  public int b()
  {
    return 1;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return null;
  }
  
  public int a(Random ☃)
  {
    return 0;
  }
  
  protected aui h(adq ☃, cj ☃)
  {
    aui ☃ = new aui(0.0D, 0.0D, 0.0D);
    int ☃ = f(☃, ☃);
    for (cq ☃ : cq.c.a)
    {
      cj ☃ = ☃.a(☃);
      
      int ☃ = f(☃, ☃);
      if (☃ < 0)
      {
        if (!☃.p(☃).c().t().c())
        {
          ☃ = f(☃, ☃.b());
          if (☃ >= 0)
          {
            int ☃ = ☃ - (☃ - 8);
            ☃ = ☃.b((☃.n() - ☃.n()) * ☃, (☃.o() - ☃.o()) * ☃, (☃.p() - ☃.p()) * ☃);
          }
        }
      }
      else if (☃ >= 0)
      {
        int ☃ = ☃ - ☃;
        ☃ = ☃.b((☃.n() - ☃.n()) * ☃, (☃.o() - ☃.o()) * ☃, (☃.p() - ☃.p()) * ☃);
      }
    }
    if (((Integer)☃.p(☃).b(b)).intValue() >= 8) {
      for (cq ☃ : cq.c.a)
      {
        cj ☃ = ☃.a(☃);
        if ((b(☃, ☃, ☃)) || (b(☃, ☃.a(), ☃)))
        {
          ☃ = ☃.a().b(0.0D, -6.0D, 0.0D);
          break;
        }
      }
    }
    return ☃.a();
  }
  
  public aui a(adm ☃, cj ☃, pk ☃, aui ☃)
  {
    return ☃.e(h(☃, ☃));
  }
  
  public int a(adm ☃)
  {
    if (this.J == arm.h) {
      return 5;
    }
    if (this.J == arm.i) {
      return ☃.t.o() ? 10 : 30;
    }
    return 0;
  }
  
  public int c(adq ☃, cj ☃)
  {
    int ☃ = ☃.b(☃, 0);
    int ☃ = ☃.b(☃.a(), 0);
    
    int ☃ = ☃ & 0xFF;
    int ☃ = ☃ & 0xFF;
    int ☃ = ☃ >> 16 & 0xFF;
    int ☃ = ☃ >> 16 & 0xFF;
    
    return (☃ > ☃ ? ☃ : ☃) | (☃ > ☃ ? ☃ : ☃) << 16;
  }
  
  public adf m()
  {
    return this.J == arm.h ? adf.d : adf.a;
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    double ☃ = ☃.n();
    double ☃ = ☃.o();
    double ☃ = ☃.p();
    if (this.J == arm.h)
    {
      int ☃ = ((Integer)☃.b(b)).intValue();
      if ((☃ > 0) && (☃ < 8))
      {
        if (☃.nextInt(64) == 0) {
          ☃.a(☃ + 0.5D, ☃ + 0.5D, ☃ + 0.5D, "liquid.water", ☃.nextFloat() * 0.25F + 0.75F, ☃.nextFloat() * 1.0F + 0.5F, false);
        }
      }
      else if (☃.nextInt(10) == 0) {
        ☃.a(cy.h, ☃ + ☃.nextFloat(), ☃ + ☃.nextFloat(), ☃ + ☃.nextFloat(), 0.0D, 0.0D, 0.0D, new int[0]);
      }
    }
    if ((this.J == arm.i) && 
      (☃.p(☃.a()).c().t() == arm.a) && (!☃.p(☃.a()).c().c()))
    {
      if (☃.nextInt(100) == 0)
      {
        double ☃ = ☃ + ☃.nextFloat();
        double ☃ = ☃ + this.F;
        double ☃ = ☃ + ☃.nextFloat();
        ☃.a(cy.B, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
        ☃.a(☃, ☃, ☃, "liquid.lavapop", 0.2F + ☃.nextFloat() * 0.2F, 0.9F + ☃.nextFloat() * 0.15F, false);
      }
      if (☃.nextInt(200) == 0) {
        ☃.a(☃, ☃, ☃, "liquid.lava", 0.2F + ☃.nextFloat() * 0.2F, 0.9F + ☃.nextFloat() * 0.15F, false);
      }
    }
    if ((☃.nextInt(10) == 0) && (adm.a(☃, ☃.b())))
    {
      arm ☃ = ☃.p(☃.c(2)).c().t();
      if ((!☃.c()) && (!☃.d()))
      {
        double ☃ = ☃ + ☃.nextFloat();
        double ☃ = ☃ - 1.05D;
        double ☃ = ☃ + ☃.nextFloat();
        if (this.J == arm.h) {
          ☃.a(cy.s, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
        } else {
          ☃.a(cy.t, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
        }
      }
    }
  }
  
  public static double a(adq ☃, cj ☃, arm ☃)
  {
    aui ☃ = a(☃).h(☃, ☃);
    if ((☃.a == 0.0D) && (☃.c == 0.0D)) {
      return -1000.0D;
    }
    return ns.b(☃.c, ☃.a) - 1.5707963267948966D;
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    e(☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    e(☃, ☃, ☃);
  }
  
  public boolean e(adm ☃, cj ☃, alz ☃)
  {
    if (this.J == arm.i)
    {
      boolean ☃ = false;
      for (cq ☃ : cq.values()) {
        if ((☃ != cq.a) && (☃.p(☃.a(☃)).c().t() == arm.h))
        {
          ☃ = true;
          break;
        }
      }
      if (☃)
      {
        Integer ☃ = (Integer)☃.b(b);
        if (☃.intValue() == 0)
        {
          ☃.a(☃, afi.Z.Q());
          e(☃, ☃);
          return true;
        }
        if (☃.intValue() <= 4)
        {
          ☃.a(☃, afi.e.Q());
          e(☃, ☃);
          return true;
        }
      }
    }
    return false;
  }
  
  protected void e(adm ☃, cj ☃)
  {
    double ☃ = ☃.n();
    double ☃ = ☃.o();
    double ☃ = ☃.p();
    
    ☃.a(☃ + 0.5D, ☃ + 0.5D, ☃ + 0.5D, "random.fizz", 0.5F, 2.6F + (☃.s.nextFloat() - ☃.s.nextFloat()) * 0.8F);
    for (int ☃ = 0; ☃ < 8; ☃++) {
      ☃.a(cy.m, ☃ + Math.random(), ☃ + 1.2D, ☃ + Math.random(), 0.0D, 0.0D, 0.0D, new int[0]);
    }
  }
  
  public alz a(int ☃)
  {
    return Q().a(b, Integer.valueOf(☃));
  }
  
  public int c(alz ☃)
  {
    return ((Integer)☃.b(b)).intValue();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { b });
  }
  
  public static agl a(arm ☃)
  {
    if (☃ == arm.h) {
      return afi.i;
    }
    if (☃ == arm.i) {
      return afi.k;
    }
    throw new IllegalArgumentException("Invalid material");
  }
  
  public static ajw b(arm ☃)
  {
    if (☃ == arm.h) {
      return afi.j;
    }
    if (☃ == arm.i) {
      return afi.l;
    }
    throw new IllegalArgumentException("Invalid material");
  }
}
