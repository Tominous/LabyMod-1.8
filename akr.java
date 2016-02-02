import java.util.List;
import java.util.Random;

public abstract class akr
  extends ahh
{
  public static final amm<aio.a> b = amm.a("variant", aio.a.class);
  
  public akr()
  {
    super(arm.d);
    alz ☃ = this.M.b();
    if (!l()) {
      ☃ = ☃.a(a, ahh.a.b);
    }
    j(☃.a(b, aio.a.a));
    a(yz.b);
  }
  
  public arn g(alz ☃)
  {
    return ((aio.a)☃.b(b)).c();
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zw.a(afi.bM);
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zw.a(afi.bM);
  }
  
  public String b(int ☃)
  {
    return super.a() + "." + aio.a.a(☃).d();
  }
  
  public amo<?> n()
  {
    return b;
  }
  
  public Object a(zx ☃)
  {
    return aio.a.a(☃.i() & 0x7);
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    if (☃ == zw.a(afi.bL)) {
      return;
    }
    for (aio.a ☃ : aio.a.values()) {
      ☃.add(new zx(☃, 1, ☃.a()));
    }
  }
  
  public alz a(int ☃)
  {
    alz ☃ = Q().a(b, aio.a.a(☃ & 0x7));
    if (!l()) {
      ☃ = ☃.a(a, (☃ & 0x8) == 0 ? ahh.a.b : ahh.a.a);
    }
    return ☃;
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((aio.a)☃.b(b)).a();
    if ((!l()) && (☃.b(a) == ahh.a.a)) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    if (l()) {
      return new ama(this, new amo[] { b });
    }
    return new ama(this, new amo[] { a, b });
  }
  
  public int a(alz ☃)
  {
    return ((aio.a)☃.b(b)).a();
  }
}
