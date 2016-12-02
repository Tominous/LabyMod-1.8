public class zv
  extends zw
{
  protected zw.a a;
  
  public zv(zw.a ☃)
  {
    a = ☃;
    h = 1;
    d(☃.a());
    a(yz.i);
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (!☃.a(☃.a(☃), ☃, ☃)) {
      return false;
    }
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if ((☃ != cq.a) && (☃.p(☃.a()).c().t() == arm.a))
    {
      if (☃ == afi.c) {
        return a(☃, ☃, ☃, ☃, afi.ak.Q());
      }
      if (☃ == afi.d) {
        switch (zv.1.a[((agf.a)☃.b(agf.a)).ordinal()])
        {
        case 1: 
          return a(☃, ☃, ☃, ☃, afi.ak.Q());
        case 2: 
          return a(☃, ☃, ☃, ☃, afi.d.Q().a(agf.a, agf.a.a));
        }
      }
    }
    return false;
  }
  
  protected boolean a(zx ☃, wn ☃, adm ☃, cj ☃, alz ☃)
  {
    ☃.a(☃.n() + 0.5F, ☃.o() + 0.5F, ☃.p() + 0.5F, cH.c(), (cH.d() + 1.0F) / 2.0F, cH.e() * 0.8F);
    if (D) {
      return true;
    }
    ☃.a(☃, ☃);
    ☃.a(1, ☃);
    
    return true;
  }
  
  public boolean w_()
  {
    return true;
  }
  
  public String g()
  {
    return a.toString();
  }
}
