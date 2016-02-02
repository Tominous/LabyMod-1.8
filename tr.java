public class tr
  extends to
{
  public tr(adm ☃)
  {
    super(☃);
    a(0.9F, 1.3F);
    this.bn = afi.bw;
  }
  
  public boolean a(wn ☃)
  {
    zx ☃ = ☃.bi.h();
    if ((☃ != null) && (☃.b() == zy.z) && (l() >= 0))
    {
      if (☃.b == 1)
      {
        ☃.bi.a(☃.bi.c, new zx(zy.A));
        return true;
      }
      if ((☃.bi.a(new zx(zy.A))) && (!☃.bA.d))
      {
        ☃.bi.a(☃.bi.c, 1);
        return true;
      }
    }
    if ((☃ != null) && (☃.b() == zy.be) && (l() >= 0))
    {
      J();
      this.o.a(cy.b, this.s, this.t + this.K / 2.0F, this.u, 0.0D, 0.0D, 0.0D, new int[0]);
      if (!this.o.D)
      {
        to ☃ = new to(this.o);
        ☃.b(this.s, this.t, this.u, this.y, this.z);
        ☃.i(bn());
        ☃.aI = this.aI;
        if (l_()) {
          ☃.a(aM());
        }
        this.o.d(☃);
        for (int ☃ = 0; ☃ < 5; ☃++) {
          this.o.d(new uz(this.o, this.s, this.t + this.K, this.u, new zx(afi.Q)));
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
    return new tr(this.o);
  }
}
