public class abq
  extends abv
{
  public abq()
  {
    super(3, 3, new zx[] { new zx(zy.aK), new zx(zy.aK), new zx(zy.aK), new zx(zy.aK), new zx(zy.bd, 0, 32767), new zx(zy.aK), new zx(zy.aK), new zx(zy.aK), new zx(zy.aK) }, new zx(zy.bV, 0, 0));
  }
  
  public boolean a(xp ☃, adm ☃)
  {
    if (!super.a(☃, ☃)) {
      return false;
    }
    zx ☃ = null;
    for (int ☃ = 0; (☃ < ☃.o_()) && (☃ == null); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if ((☃ != null) && (☃.b() == zy.bd)) {
        ☃ = ☃;
      }
    }
    if (☃ == null) {
      return false;
    }
    atg ☃ = zy.bd.a(☃, ☃);
    if (☃ == null) {
      return false;
    }
    return ☃.e < 4;
  }
  
  public zx a(xp ☃)
  {
    zx ☃ = null;
    for (int ☃ = 0; (☃ < ☃.o_()) && (☃ == null); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if ((☃ != null) && (☃.b() == zy.bd)) {
        ☃ = ☃;
      }
    }
    ☃ = ☃.k();
    ☃.b = 1;
    if (☃.o() == null) {
      ☃.d(new dn());
    }
    ☃.o().a("map_is_scaling", true);
    
    return ☃;
  }
}
