public class zu
  extends zw
{
  private final Class<? extends un> a;
  
  public zu(Class<? extends un> ☃)
  {
    a = ☃;
    a(yz.c);
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃ == cq.a) {
      return false;
    }
    if (☃ == cq.b) {
      return false;
    }
    cj ☃ = ☃.a(☃);
    if (!☃.a(☃, ☃, ☃)) {
      return false;
    }
    un ☃ = a(☃, ☃, ☃);
    if ((☃ != null) && (☃.j()))
    {
      if (!D) {
        ☃.d(☃);
      }
      b -= 1;
    }
    return true;
  }
  
  private un a(adm ☃, cj ☃, cq ☃)
  {
    if (a == uq.class) {
      return new uq(☃, ☃, ☃);
    }
    if (a == uo.class) {
      return new uo(☃, ☃, ☃);
    }
    return null;
  }
}
