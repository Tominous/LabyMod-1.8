import java.util.List;
import java.util.Random;

public class ajj
  extends afm
  implements afj
{
  public static final amm<aio.a> a = amm.a("type", aio.a.class);
  public static final amn b = amn.a("stage", 0, 1);
  
  protected ajj()
  {
    j(M.b().a(a, aio.a.a).a(b, Integer.valueOf(0)));
    float ☃ = 0.4F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, ☃ * 2.0F, 0.5F + ☃);
    a(yz.c);
  }
  
  public String f()
  {
    return di.a(a() + "." + aio.a.a.d() + ".name");
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (D) {
      return;
    }
    super.b(☃, ☃, ☃, ☃);
    if ((☃.l(☃.a()) >= 9) && 
      (☃.nextInt(7) == 0)) {
      d(☃, ☃, ☃, ☃);
    }
  }
  
  public void d(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (((Integer)☃.b(b)).intValue() == 0) {
      ☃.a(☃, ☃.a(b), 4);
    } else {
      e(☃, ☃, ☃, ☃);
    }
  }
  
  public void e(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    aot ☃ = ☃.nextInt(10) == 0 ? new aoi(true) : new apv(true);
    
    int ☃ = 0;
    int ☃ = 0;
    boolean ☃ = false;
    switch (ajj.1.a[((aio.a)☃.b(a)).ordinal()])
    {
    case 1: 
      for (☃ = 0; ☃ >= -1; ☃--) {
        for (☃ = 0; ☃ >= -1; ☃--) {
          if (a(☃, ☃, ☃, ☃, aio.a.b))
          {
            ☃ = new apf(false, ☃.nextBoolean());
            ☃ = true;
            break label163;
          }
        }
      }
      if (!☃)
      {
        ☃ = ☃ = 0;
        ☃ = new aps(true);
      }
      break;
    case 2: 
      ☃ = new aoj(true, false);
      break;
    case 3: 
      alz ☃ = afi.r.Q().a(ail.b, aio.a.d);
      alz ☃ = afi.t.Q().a(aik.Q, aio.a.d).a(ahs.b, Boolean.valueOf(false));
      for (☃ = 0; ☃ >= -1; ☃--) {
        for (☃ = 0; ☃ >= -1; ☃--) {
          if (a(☃, ☃, ☃, ☃, aio.a.d))
          {
            ☃ = new ape(true, 10, 20, ☃, ☃);
            ☃ = true;
            break label321;
          }
        }
      }
      if (!☃)
      {
        ☃ = ☃ = 0;
        ☃ = new apv(true, 4 + ☃.nextInt(7), ☃, ☃, false);
      }
      break;
    case 4: 
      ☃ = new app(true);
      
      break;
    case 5: 
      label163:
      label321:
      for (☃ = 0; ☃ >= -1; ☃--) {
        for (☃ = 0; ☃ >= -1; ☃--) {
          if (a(☃, ☃, ☃, ☃, aio.a.f))
          {
            ☃ = new apn(true);
            ☃ = true;
            break label434;
          }
        }
      }
      label434:
      if (!☃) {
        return;
      }
      break;
    }
    alz ☃ = afi.a.Q();
    if (☃)
    {
      ☃.a(☃.a(☃, 0, ☃), ☃, 4);
      ☃.a(☃.a(☃ + 1, 0, ☃), ☃, 4);
      ☃.a(☃.a(☃, 0, ☃ + 1), ☃, 4);
      ☃.a(☃.a(☃ + 1, 0, ☃ + 1), ☃, 4);
    }
    else
    {
      ☃.a(☃, ☃, 4);
    }
    if (!☃.b(☃, ☃, ☃.a(☃, 0, ☃))) {
      if (☃)
      {
        ☃.a(☃.a(☃, 0, ☃), ☃, 4);
        ☃.a(☃.a(☃ + 1, 0, ☃), ☃, 4);
        ☃.a(☃.a(☃, 0, ☃ + 1), ☃, 4);
        ☃.a(☃.a(☃ + 1, 0, ☃ + 1), ☃, 4);
      }
      else
      {
        ☃.a(☃, ☃, 4);
      }
    }
  }
  
  private boolean a(adm ☃, cj ☃, int ☃, int ☃, aio.a ☃)
  {
    return (a(☃, ☃.a(☃, 0, ☃), ☃)) && (a(☃, ☃.a(☃ + 1, 0, ☃), ☃)) && (a(☃, ☃.a(☃, 0, ☃ + 1), ☃)) && (a(☃, ☃.a(☃ + 1, 0, ☃ + 1), ☃));
  }
  
  public boolean a(adm ☃, cj ☃, aio.a ☃)
  {
    alz ☃ = ☃.p(☃);
    return (☃.c() == this) && (☃.b(a) == ☃);
  }
  
  public int a(alz ☃)
  {
    return ((aio.a)☃.b(a)).a();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (aio.a ☃ : ) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, boolean ☃)
  {
    return true;
  }
  
  public boolean a(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    return s.nextFloat() < 0.45D;
  }
  
  public void b(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    d(☃, ☃, ☃, ☃);
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, aio.a.a(☃ & 0x7)).a(b, Integer.valueOf((☃ & 0x8) >> 3));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((aio.a)☃.b(a)).a();
    ☃ |= ((Integer)☃.b(b)).intValue() << 3;
    
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b });
  }
}
