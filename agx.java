import java.util.Random;

public class agx
  extends afc
{
  public static final amn a = amn.a("legacy_data", 0, 15);
  public static final amm<agx.a> b = amm.a("contents", agx.a.class);
  
  public agx()
  {
    super(arm.q);
    j(M.b().a(b, agx.a.a).a(a, Integer.valueOf(0)));
    j();
  }
  
  public String f()
  {
    return di.a("item.flowerPot.name");
  }
  
  public void j()
  {
    float ☃ = 0.375F;
    float ☃ = ☃ / 2.0F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, ☃, 0.5F + ☃);
  }
  
  public boolean c()
  {
    return false;
  }
  
  public int b()
  {
    return 3;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alg))
    {
      zw ☃ = ((alg)☃).b();
      if ((☃ instanceof yo)) {
        return afh.a(☃).a(☃, ☃, ☃);
      }
    }
    return 16777215;
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    zx ☃ = bi.h();
    if ((☃ == null) || (!(☃.b() instanceof yo))) {
      return false;
    }
    alg ☃ = f(☃, ☃);
    if (☃ == null) {
      return false;
    }
    if (☃.b() != null) {
      return false;
    }
    afh ☃ = afh.a(☃.b());
    if (!a(☃, ☃.i())) {
      return false;
    }
    ☃.a(☃.b(), ☃.i());
    ☃.p_();
    ☃.h(☃);
    ☃.b(na.T);
    if (!bA.d) {
      if (--b <= 0) {
        bi.a(bi.c, null);
      }
    }
    return true;
  }
  
  private boolean a(afh ☃, int ☃)
  {
    if ((☃ == afi.N) || (☃ == afi.O) || (☃ == afi.aK) || (☃ == afi.P) || (☃ == afi.Q) || (☃ == afi.g) || (☃ == afi.I)) {
      return true;
    }
    if ((☃ == afi.H) && (☃ == akc.a.c.a())) {
      return true;
    }
    return false;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    alg ☃ = f(☃, ☃);
    if ((☃ != null) && (☃.b() != null)) {
      return ☃.b();
    }
    return zy.bQ;
  }
  
  public int j(adm ☃, cj ☃)
  {
    alg ☃ = f(☃, ☃);
    if ((☃ != null) && (☃.b() != null)) {
      return ☃.c();
    }
    return 0;
  }
  
  public boolean M()
  {
    return true;
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return (super.d(☃, ☃)) && (adm.a(☃, ☃.b()));
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (!adm.a(☃, ☃.b()))
    {
      b(☃, ☃, ☃, 0);
      
      ☃.g(☃);
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    alg ☃ = f(☃, ☃);
    if ((☃ != null) && (☃.b() != null)) {
      a(☃, ☃, new zx(☃.b(), 1, ☃.c()));
    }
    super.b(☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, wn ☃)
  {
    super.a(☃, ☃, ☃, ☃);
    if (bA.d)
    {
      alg ☃ = f(☃, ☃);
      if (☃ != null) {
        ☃.a(null, 0);
      }
    }
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.bQ;
  }
  
  private alg f(adm ☃, cj ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alg)) {
      return (alg)☃;
    }
    return null;
  }
  
  public akw a(adm ☃, int ☃)
  {
    afh ☃ = null;
    int ☃ = 0;
    switch (☃)
    {
    default: 
      break;
    case 1: 
      ☃ = afi.O;
      ☃ = agw.a.b.b();
      break;
    case 2: 
      ☃ = afi.N;
      break;
    case 3: 
      ☃ = afi.g;
      ☃ = aio.a.a.a();
      break;
    case 4: 
      ☃ = afi.g;
      ☃ = aio.a.b.a();
      break;
    case 5: 
      ☃ = afi.g;
      ☃ = aio.a.c.a();
      break;
    case 6: 
      ☃ = afi.g;
      ☃ = aio.a.d.a();
      break;
    case 12: 
      ☃ = afi.g;
      ☃ = aio.a.e.a();
      break;
    case 13: 
      ☃ = afi.g;
      ☃ = aio.a.f.a();
      break;
    case 7: 
      ☃ = afi.Q;
      break;
    case 8: 
      ☃ = afi.P;
      break;
    case 9: 
      ☃ = afi.aK;
      break;
    case 10: 
      ☃ = afi.I;
      break;
    case 11: 
      ☃ = afi.H;
      ☃ = akc.a.c.a();
    }
    return new alg(zw.a(☃), ☃);
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { b, a });
  }
  
  public int c(alz ☃)
  {
    return ((Integer)☃.b(a)).intValue();
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    agx.a ☃ = agx.a.a;
    
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alg))
    {
      alg ☃ = (alg)☃;
      zw ☃ = ☃.b();
      if ((☃ instanceof yo))
      {
        int ☃ = ☃.c();
        afh ☃ = afh.a(☃);
        if (☃ == afi.g) {
          switch (agx.1.a[aio.a.a(☃).ordinal()])
          {
          case 1: 
            ☃ = agx.a.l;
            break;
          case 2: 
            ☃ = agx.a.m;
            break;
          case 3: 
            ☃ = agx.a.n;
            break;
          case 4: 
            ☃ = agx.a.o;
            break;
          case 5: 
            ☃ = agx.a.p;
            break;
          case 6: 
            ☃ = agx.a.q;
            break;
          default: 
            ☃ = agx.a.a;break;
          }
        } else if (☃ == afi.H) {
          switch (☃)
          {
          case 0: 
            ☃ = agx.a.t;
            break;
          case 2: 
            ☃ = agx.a.u;
            break;
          default: 
            ☃ = agx.a.a;break;
          }
        } else if (☃ == afi.N) {
          ☃ = agx.a.k;
        } else if (☃ == afi.O) {
          switch (agx.1.b[agw.a.a(agw.b.b, ☃).ordinal()])
          {
          case 1: 
            ☃ = agx.a.b;
            break;
          case 2: 
            ☃ = agx.a.c;
            break;
          case 3: 
            ☃ = agx.a.d;
            break;
          case 4: 
            ☃ = agx.a.e;
            break;
          case 5: 
            ☃ = agx.a.f;
            break;
          case 6: 
            ☃ = agx.a.g;
            break;
          case 7: 
            ☃ = agx.a.h;
            break;
          case 8: 
            ☃ = agx.a.i;
            break;
          case 9: 
            ☃ = agx.a.j;
            break;
          default: 
            ☃ = agx.a.a;break;
          }
        } else if (☃ == afi.Q) {
          ☃ = agx.a.r;
        } else if (☃ == afi.P) {
          ☃ = agx.a.s;
        } else if (☃ == afi.I) {
          ☃ = agx.a.t;
        } else if (☃ == afi.aK) {
          ☃ = agx.a.v;
        }
      }
    }
    return ☃.a(b, ☃);
  }
  
  public static enum a
    implements nw
  {
    private final String w;
    
    private a(String ☃)
    {
      w = ☃;
    }
    
    public String toString()
    {
      return w;
    }
    
    public String l()
    {
      return w;
    }
  }
  
  public adf m()
  {
    return adf.c;
  }
}
