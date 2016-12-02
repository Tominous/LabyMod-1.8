import com.google.common.base.Predicate;

public class ais
  extends afe
{
  public static final amm<afe.b> b = amm.a("shape", afe.b.class, new Predicate()
  {
    public boolean a(afe.b ☃)
    {
      return (☃ != afe.b.j) && (☃ != afe.b.i) && (☃ != afe.b.g) && (☃ != afe.b.h);
    }
  });
  public static final amk N = amk.a("powered");
  
  protected ais()
  {
    super(true);
    j(M.b().a(b, afe.b.a).a(N, Boolean.valueOf(false)));
  }
  
  protected boolean a(adm ☃, cj ☃, alz ☃, boolean ☃, int ☃)
  {
    if (☃ >= 8) {
      return false;
    }
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    
    boolean ☃ = true;
    afe.b ☃ = (afe.b)☃.b(b);
    switch (ais.2.a[☃.ordinal()])
    {
    case 1: 
      if (☃) {
        ☃++;
      } else {
        ☃--;
      }
      break;
    case 2: 
      if (☃) {
        ☃--;
      } else {
        ☃++;
      }
      break;
    case 3: 
      if (☃)
      {
        ☃--;
      }
      else
      {
        ☃++;
        ☃++;
        ☃ = false;
      }
      ☃ = afe.b.b;
      break;
    case 4: 
      if (☃)
      {
        ☃--;
        ☃++;
        ☃ = false;
      }
      else
      {
        ☃++;
      }
      ☃ = afe.b.b;
      break;
    case 5: 
      if (☃)
      {
        ☃++;
      }
      else
      {
        ☃--;
        ☃++;
        ☃ = false;
      }
      ☃ = afe.b.a;
      break;
    case 6: 
      if (☃)
      {
        ☃++;
        ☃++;
        ☃ = false;
      }
      else
      {
        ☃--;
      }
      ☃ = afe.b.a;
    }
    if (a(☃, new cj(☃, ☃, ☃), ☃, ☃, ☃)) {
      return true;
    }
    if ((☃) && (a(☃, new cj(☃, ☃ - 1, ☃), ☃, ☃, ☃))) {
      return true;
    }
    return false;
  }
  
  protected boolean a(adm ☃, cj ☃, boolean ☃, int ☃, afe.b ☃)
  {
    alz ☃ = ☃.p(☃);
    if (☃.c() != this) {
      return false;
    }
    afe.b ☃ = (afe.b)☃.b(b);
    if ((☃ == afe.b.b) && ((☃ == afe.b.a) || (☃ == afe.b.e) || (☃ == afe.b.f))) {
      return false;
    }
    if ((☃ == afe.b.a) && ((☃ == afe.b.b) || (☃ == afe.b.c) || (☃ == afe.b.d))) {
      return false;
    }
    if (((Boolean)☃.b(N)).booleanValue())
    {
      if (☃.z(☃)) {
        return true;
      }
      return a(☃, ☃, ☃, ☃, ☃ + 1);
    }
    return false;
  }
  
  protected void b(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    boolean ☃ = ((Boolean)☃.b(N)).booleanValue();
    boolean ☃ = (☃.z(☃)) || (a(☃, ☃, ☃, true, 0)) || (a(☃, ☃, ☃, false, 0));
    if (☃ != ☃)
    {
      ☃.a(☃, ☃.a(N, Boolean.valueOf(☃)), 3);
      
      ☃.c(☃.b(), this);
      if (((afe.b)☃.b(b)).c()) {
        ☃.c(☃.a(), this);
      }
    }
  }
  
  public amo<afe.b> n()
  {
    return b;
  }
  
  public alz a(int ☃)
  {
    return Q().a(b, afe.b.a(☃ & 0x7)).a(N, Boolean.valueOf((☃ & 0x8) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((afe.b)☃.b(b)).a();
    if (((Boolean)☃.b(N)).booleanValue()) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { b, N });
  }
}
