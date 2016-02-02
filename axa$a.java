import java.util.List;

class axa$a
  extends awi
{
  public int u = -1;
  
  public axa$a(axa paramaxa)
  {
    super(paramaxa.j, paramaxa.l, paramaxa.m, 43, paramaxa.m - 60, 24);
  }
  
  private void a(int ☃, int ☃, zx ☃)
  {
    e(☃ + 1, ☃ + 1);
    
    bfl.B();
    if ((☃ != null) && (☃.b() != null))
    {
      avc.c();
      this.v.k.a(☃, ☃ + 2, ☃ + 2);
      avc.a();
    }
    bfl.C();
  }
  
  private void e(int ☃, int ☃)
  {
    d(☃, ☃, 0, 0);
  }
  
  private void d(int ☃, int ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.a.P().a(avp.c);
    
    float ☃ = 0.0078125F;
    float ☃ = 0.0078125F;
    int ☃ = 18;
    int ☃ = 18;
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    ☃.a(7, bms.g);
    ☃.b(☃ + 0, ☃ + 18, axa.a(this.v)).a((☃ + 0) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
    ☃.b(☃ + 18, ☃ + 18, axa.b(this.v)).a((☃ + 18) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
    ☃.b(☃ + 18, ☃ + 0, axa.c(this.v)).a((☃ + 18) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
    ☃.b(☃ + 0, ☃ + 0, axa.d(this.v)).a((☃ + 0) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
    ☃.b();
  }
  
  protected int b()
  {
    return axa.e(this.v).c().size();
  }
  
  protected void a(int ☃, boolean ☃, int ☃, int ☃)
  {
    this.u = ☃;
    this.v.f();
  }
  
  protected boolean a(int ☃)
  {
    return ☃ == this.u;
  }
  
  protected void a() {}
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    aqa ☃ = (aqa)axa.e(this.v).c().get(axa.e(this.v).c().size() - ☃ - 1);
    
    alz ☃ = ☃.c();
    afh ☃ = ☃.c();
    zw ☃ = zw.a(☃);
    zx ☃ = (☃ == afi.a) || (☃ == null) ? null : new zx(☃, 1, ☃.c(☃));
    String ☃ = ☃ == null ? "Air" : ☃.a(☃);
    if (☃ == null)
    {
      if ((☃ == afi.j) || (☃ == afi.i)) {
        ☃ = zy.ax;
      } else if ((☃ == afi.l) || (☃ == afi.k)) {
        ☃ = zy.ay;
      }
      if (☃ != null)
      {
        ☃ = new zx(☃, 1, ☃.c(☃));
        ☃ = ☃.f();
      }
    }
    a(☃, ☃, ☃);
    this.v.q.a(☃, ☃ + 18 + 5, ☃ + 3, 16777215);
    String ☃;
    String ☃;
    if (☃ == 0)
    {
      ☃ = bnq.a("createWorld.customize.flat.layer.top", new Object[] { Integer.valueOf(☃.b()) });
    }
    else
    {
      String ☃;
      if (☃ == axa.e(this.v).c().size() - 1) {
        ☃ = bnq.a("createWorld.customize.flat.layer.bottom", new Object[] { Integer.valueOf(☃.b()) });
      } else {
        ☃ = bnq.a("createWorld.customize.flat.layer", new Object[] { Integer.valueOf(☃.b()) });
      }
    }
    this.v.q.a(☃, ☃ + 2 + 213 - this.v.q.a(☃), ☃ + 3, 16777215);
  }
  
  protected int d()
  {
    return this.b - 70;
  }
}
