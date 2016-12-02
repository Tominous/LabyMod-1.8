public class aad
  extends zw
{
  private static final cr a = new cn()
  {
    private final cn b = new cn();
    
    public zx b(ck ☃, zx ☃)
    {
      cq ☃ = agg.b(☃.f());
      adm ☃ = ☃.i();
      
      double ☃ = ☃.a() + ☃.g() * 1.125D;
      double ☃ = Math.floor(☃.b()) + ☃.h();
      double ☃ = ☃.c() + ☃.i() * 1.125D;
      
      cj ☃ = ☃.d().a(☃);
      alz ☃ = ☃.p(☃);
      afe.b ☃ = (☃.c() instanceof afe) ? (afe.b)☃.b(((afe)☃.c()).n()) : afe.b.a;
      double ☃;
      if (afe.d(☃))
      {
        double ☃;
        if (☃.c()) {
          ☃ = 0.6D;
        } else {
          ☃ = 0.1D;
        }
      }
      else
      {
        double ☃;
        if ((☃.c().t() == arm.a) && (afe.d(☃.p(☃.b()))))
        {
          alz ☃ = ☃.p(☃.b());
          afe.b ☃ = (☃.c() instanceof afe) ? (afe.b)☃.b(((afe)☃.c()).n()) : afe.b.a;
          double ☃;
          if ((☃ == cq.a) || (!☃.c())) {
            ☃ = -0.9D;
          } else {
            ☃ = -0.4D;
          }
        }
        else
        {
          return this.b.a(☃, ☃);
        }
      }
      double ☃;
      va ☃ = va.a(☃, ☃, ☃ + ☃, ☃, aad.a((aad)☃.b()));
      if (☃.s()) {
        ☃.a(☃.q());
      }
      ☃.d(☃);
      
      ☃.a(1);
      return ☃;
    }
    
    protected void a(ck ☃)
    {
      ☃.i().b(1000, ☃.d(), 0);
    }
  };
  private final va.a b;
  
  public aad(va.a ☃)
  {
    this.h = 1;
    this.b = ☃;
    a(yz.e);
    agg.N.a(this, a);
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    alz ☃ = ☃.p(☃);
    if (afe.d(☃))
    {
      if (!☃.D)
      {
        afe.b ☃ = (☃.c() instanceof afe) ? (afe.b)☃.b(((afe)☃.c()).n()) : afe.b.a;
        double ☃ = 0.0D;
        if (☃.c()) {
          ☃ = 0.5D;
        }
        va ☃ = va.a(☃, ☃.n() + 0.5D, ☃.o() + 0.0625D + ☃, ☃.p() + 0.5D, this.b);
        if (☃.s()) {
          ☃.a(☃.q());
        }
        ☃.d(☃);
      }
      ☃.b -= 1;
      return true;
    }
    return false;
  }
}
