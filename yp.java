public class yp
  extends zw
{
  private afh a;
  
  public yp(afh ☃)
  {
    a = ☃;
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if ((☃ == afi.aH) && (((Integer)☃.b(ajp.a)).intValue() < 1)) {
      ☃ = cq.b;
    } else if (!☃.a(☃, ☃)) {
      ☃ = ☃.a(☃);
    }
    if (!☃.a(☃, ☃, ☃)) {
      return false;
    }
    if (b == 0) {
      return false;
    }
    if (☃.a(a, ☃, false, ☃, null, ☃))
    {
      alz ☃ = a.a(☃, ☃, ☃, ☃, ☃, ☃, 0, ☃);
      if (☃.a(☃, ☃, 3))
      {
        ☃ = ☃.p(☃);
        if (☃.c() == a)
        {
          yo.a(☃, ☃, ☃, ☃);
          ☃.c().a(☃, ☃, ☃, ☃, ☃);
        }
        ☃.a(☃.n() + 0.5F, ☃.o() + 0.5F, ☃.p() + 0.5F, a.H.b(), (a.H.d() + 1.0F) / 2.0F, a.H.e() * 0.8F);
        b -= 1;
        return true;
      }
    }
    return false;
  }
}
