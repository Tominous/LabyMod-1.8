import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;

public class aik
  extends ahs
{
  public static final amm<aio.a> Q = amm.a("variant", aio.a.class, new Predicate()
  {
    public boolean a(aio.a ☃)
    {
      return ☃.a() < 4;
    }
  });
  
  public aik()
  {
    j(this.M.b().a(Q, aio.a.a).a(b, Boolean.valueOf(true)).a(a, Boolean.valueOf(true)));
  }
  
  public int h(alz ☃)
  {
    if (☃.c() != this) {
      return super.h(☃);
    }
    aio.a ☃ = (aio.a)☃.b(Q);
    if (☃ == aio.a.b) {
      return adj.a();
    }
    if (☃ == aio.a.c) {
      return adj.b();
    }
    return super.h(☃);
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    alz ☃ = ☃.p(☃);
    if (☃.c() == this)
    {
      aio.a ☃ = (aio.a)☃.b(Q);
      if (☃ == aio.a.b) {
        return adj.a();
      }
      if (☃ == aio.a.c) {
        return adj.b();
      }
    }
    return super.a(☃, ☃, ☃);
  }
  
  protected void a(adm ☃, cj ☃, alz ☃, int ☃)
  {
    if ((☃.b(Q) == aio.a.a) && (☃.s.nextInt(☃) == 0)) {
      a(☃, ☃, new zx(zy.e, 1, 0));
    }
  }
  
  protected int d(alz ☃)
  {
    if (☃.b(Q) == aio.a.d) {
      return 40;
    }
    return super.d(☃);
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    ☃.add(new zx(☃, 1, aio.a.a.a()));
    ☃.add(new zx(☃, 1, aio.a.b.a()));
    ☃.add(new zx(☃, 1, aio.a.c.a()));
    ☃.add(new zx(☃, 1, aio.a.d.a()));
  }
  
  protected zx i(alz ☃)
  {
    return new zx(zw.a(this), 1, ((aio.a)☃.b(Q)).a());
  }
  
  public alz a(int ☃)
  {
    return Q().a(Q, b(☃)).a(a, Boolean.valueOf((☃ & 0x4) == 0)).a(b, Boolean.valueOf((☃ & 0x8) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((aio.a)☃.b(Q)).a();
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
    return aio.a.a((☃ & 0x3) % 4);
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { Q, b, a });
  }
  
  public int a(alz ☃)
  {
    return ((aio.a)☃.b(Q)).a();
  }
  
  public void a(adm ☃, wn ☃, cj ☃, alz ☃, akw ☃)
  {
    if ((!☃.D) && (☃.bZ() != null) && (☃.bZ().b() == zy.be))
    {
      ☃.b(na.ab[afh.a(this)]);
      
      a(☃, ☃, new zx(zw.a(this), 1, ((aio.a)☃.b(Q)).a()));
      return;
    }
    super.a(☃, ☃, ☃, ☃, ☃);
  }
}
