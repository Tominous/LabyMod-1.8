import java.util.List;

class axa$a
  extends awi
{
  public int u = -1;
  
  public axa$a(axa paramaxa)
  {
    super(j, l, m, 43, m - 60, 24);
  }
  
  private void a(int ☃, int ☃, zx ☃)
  {
    e(☃ + 1, ☃ + 1);
    
    bfl.B();
    if ((☃ != null) && (☃.b() != null))
    {
      avc.c();
      v.k.a(☃, ☃ + 2, ☃ + 2);
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
    a.P().a(avp.c);
    
    float ☃ = 0.0078125F;
    float ☃ = 0.0078125F;
    int ☃ = 18;
    int ☃ = 18;
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    ☃.a(7, bms.g);
    ☃.b(☃ + 0, ☃ + 18, axa.a(v)).a((☃ + 0) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
    ☃.b(☃ + 18, ☃ + 18, axa.b(v)).a((☃ + 18) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
    ☃.b(☃ + 18, ☃ + 0, axa.c(v)).a((☃ + 18) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
    ☃.b(☃ + 0, ☃ + 0, axa.d(v)).a((☃ + 0) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
    ☃.b();
  }
  
  protected int b()
  {
    return axa.e(v).c().size();
  }
  
  protected void a(int ☃, boolean ☃, int ☃, int ☃)
  {
    u = ☃;
    v.f();
  }
  
  protected boolean a(int ☃)
  {
    return ☃ == u;
  }
  
  protected void a() {}
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    aqa ☃ = (aqa)axa.e(v).c().get(axa.e(v).c().size() - ☃ - 1);
    
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
    v.q.a(☃, ☃ + 18 + 5, ☃ + 3, 16777215);
    String ☃;
    String ☃;
    if (☃ == 0)
    {
      ☃ = bnq.a("createWorld.customize.flat.layer.top", new Object[] { Integer.valueOf(☃.b()) });
    }
    else
    {
      String ☃;
      if (☃ == axa.e(v).c().size() - 1) {
        ☃ = bnq.a("createWorld.customize.flat.layer.bottom", new Object[] { Integer.valueOf(☃.b()) });
      } else {
        ☃ = bnq.a("createWorld.customize.flat.layer", new Object[] { Integer.valueOf(☃.b()) });
      }
    }
    v.q.a(☃, ☃ + 2 + 213 - v.q.a(☃), ☃ + 3, 16777215);
  }
  
  protected int d()
  {
    return b - 70;
  }
}
