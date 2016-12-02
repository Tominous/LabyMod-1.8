import com.google.common.base.Predicate;
import java.util.List;

public class aig
  extends ahw
{
  public static final amm<aio.a> b = amm.a("variant", aio.a.class, new Predicate()
  {
    public boolean a(aio.a ☃)
    {
      return ☃.a() >= 4;
    }
  });
  
  public aig()
  {
    j(this.M.b().a(b, aio.a.e).a(a, ahw.a.b));
  }
  
  public arn g(alz ☃)
  {
    aio.a ☃ = (aio.a)☃.b(b);
    switch (aig.2.b[((ahw.a)☃.b(a)).ordinal()])
    {
    case 1: 
    case 2: 
    case 3: 
    default: 
      switch (aig.2.a[☃.ordinal()])
      {
      case 1: 
      default: 
        return arn.m;
      }
      return aio.a.f.c();
    }
    return ☃.c();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    ☃.add(new zx(☃, 1, aio.a.e.a() - 4));
    ☃.add(new zx(☃, 1, aio.a.f.a() - 4));
  }
  
  public alz a(int ☃)
  {
    alz ☃ = Q().a(b, aio.a.a((☃ & 0x3) + 4));
    switch (☃ & 0xC)
    {
    case 0: 
      ☃ = ☃.a(a, ahw.a.b);
      break;
    case 4: 
      ☃ = ☃.a(a, ahw.a.a);
      break;
    case 8: 
      ☃ = ☃.a(a, ahw.a.c);
      break;
    default: 
      ☃ = ☃.a(a, ahw.a.d);
    }
    return ☃;
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((aio.a)☃.b(b)).a() - 4;
    switch (aig.2.b[((ahw.a)☃.b(a)).ordinal()])
    {
    case 1: 
      ☃ |= 0x4;
      break;
    case 2: 
      ☃ |= 0x8;
      break;
    case 3: 
      ☃ |= 0xC;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { b, a });
  }
  
  protected zx i(alz ☃)
  {
    return new zx(zw.a(this), 1, ((aio.a)☃.b(b)).a() - 4);
  }
  
  public int a(alz ☃)
  {
    return ((aio.a)☃.b(b)).a() - 4;
  }
}
