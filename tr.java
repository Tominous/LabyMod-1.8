public class tr
  extends to
{
  public tr(adm ☃)
  {
    super(☃);
    a(0.9F, 1.3F);
    bn = afi.bw;
  }
  
  public boolean a(wn ☃)
  {
    zx ☃ = bi.h();
    if ((☃ != null) && (☃.b() == zy.z) && (l() >= 0))
    {
      if (b == 1)
      {
        bi.a(bi.c, new zx(zy.A));
        return true;
      }
      if ((bi.a(new zx(zy.A))) && (!bA.d))
      {
        bi.a(bi.c, 1);
        return true;
      }
    }
    if ((☃ != null) && (☃.b() == zy.be) && (l() >= 0))
    {
      J();
      o.a(cy.b, s, t + K / 2.0F, u, 0.0D, 0.0D, 0.0D, new int[0]);
      if (!o.D)
      {
        to ☃ = new to(o);
        ☃.b(s, t, u, y, z);
        ☃.i(bn());
        aI = aI;
        if (l_()) {
          ☃.a(aM());
        }
        o.d(☃);
        for (int ☃ = 0; ☃ < 5; ☃++) {
          o.d(new uz(o, s, t + K, u, new zx(afi.Q)));
        }
        ☃.a(1, ☃);
        a("mob.sheep.shear", 1.0F, 1.0F);
      }
      return true;
    }
    return super.a(☃);
  }
  
  public tr c(ph ☃)
  {
    return new tr(o);
  }
}
