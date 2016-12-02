import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;

public class aif
  extends ahs
{
  public static final amm<aio.a> Q = amm.a("variant", aio.a.class, new Predicate()
  {
    public boolean a(aio.a ☃)
    {
      return ☃.a() >= 4;
    }
  });
  
  public aif()
  {
    j(this.M.b().a(Q, aio.a.e).a(b, Boolean.valueOf(true)).a(a, Boolean.valueOf(true)));
  }
  
  protected void a(adm ☃, cj ☃, alz ☃, int ☃)
  {
    if ((☃.b(Q) == aio.a.f) && (☃.s.nextInt(☃) == 0)) {
      a(☃, ☃, new zx(zy.e, 1, 0));
    }
  }
  
  public int a(alz ☃)
  {
    return ((aio.a)☃.b(Q)).a();
  }
  
  public int j(adm ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    return ☃.c().c(☃) & 0x3;
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    ☃.add(new zx(☃, 1, 0));
    ☃.add(new zx(☃, 1, 1));
  }
  
  protected zx i(alz ☃)
  {
    return new zx(zw.a(this), 1, ((aio.a)☃.b(Q)).a() - 4);
  }
  
  public alz a(int ☃)
  {
    return Q().a(Q, b(☃)).a(a, Boolean.valueOf((☃ & 0x4) == 0)).a(b, Boolean.valueOf((☃ & 0x8) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((aio.a)☃.b(Q)).a() - 4;
    if (!((Boolean)☃.b(a)).booleanValue()) {
      ☃ |= 0x4;
    }
    if (((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  public aio.a b(int ☃)
  {
    return aio.a.a((☃ & 0x3) + 4);
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { Q, b, a });
  }
  
  public void a(adm ☃, wn ☃, cj ☃, alz ☃, akw ☃)
  {
    if ((!☃.D) && (☃.bZ() != null) && (☃.bZ().b() == zy.be))
    {
      ☃.b(na.ab[afh.a(this)]);
      
      a(☃, ☃, new zx(zw.a(this), 1, ((aio.a)☃.b(Q)).a() - 4));
      return;
    }
    super.a(☃, ☃, ☃, ☃, ☃);
  }
}
