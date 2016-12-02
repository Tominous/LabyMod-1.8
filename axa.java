import java.util.List;

public class axa
  extends axu
{
  private final axb a;
  private apz f = apz.e();
  private String g;
  private String h;
  private String i;
  private axa.a r;
  private avs s;
  private avs t;
  private avs u;
  
  public axa(axb ☃, String ☃)
  {
    this.a = ☃;
    
    a(☃);
  }
  
  public String a()
  {
    return this.f.toString();
  }
  
  public void a(String ☃)
  {
    this.f = apz.a(☃);
  }
  
  public void b()
  {
    this.n.clear();
    
    this.g = bnq.a("createWorld.customize.flat.title", new Object[0]);
    this.h = bnq.a("createWorld.customize.flat.tile", new Object[0]);
    this.i = bnq.a("createWorld.customize.flat.height", new Object[0]);
    
    this.r = new axa.a();
    
    this.n.add(this.s = new avs(2, this.l / 2 - 154, this.m - 52, 100, 20, bnq.a("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)"));
    this.n.add(this.t = new avs(3, this.l / 2 - 50, this.m - 52, 100, 20, bnq.a("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)"));
    this.n.add(this.u = new avs(4, this.l / 2 - 155, this.m - 52, 150, 20, bnq.a("createWorld.customize.flat.removeLayer", new Object[0])));
    
    this.n.add(new avs(0, this.l / 2 - 155, this.m - 28, 150, 20, bnq.a("gui.done", new Object[0])));
    this.n.add(new avs(5, this.l / 2 + 5, this.m - 52, 150, 20, bnq.a("createWorld.customize.presets", new Object[0])));
    this.n.add(new avs(1, this.l / 2 + 5, this.m - 28, 150, 20, bnq.a("gui.cancel", new Object[0])));
    
    this.s.m = (this.t.m = 0);
    
    this.f.d();
    f();
  }
  
  public void k()
  {
    super.k();
    this.r.p();
  }
  
  protected void a(avs ☃)
  {
    int ☃ = this.f.c().size() - this.r.u - 1;
    if (☃.k == 1)
    {
      this.j.a(this.a);
    }
    else if (☃.k == 0)
    {
      this.a.a = a();
      this.j.a(this.a);
    }
    else if (☃.k == 5)
    {
      this.j.a(new axq(this));
    }
    else if ((☃.k == 4) && (g()))
    {
      this.f.c().remove(☃);
      this.r.u = Math.min(this.r.u, this.f.c().size() - 1);
    }
    this.f.d();
    f();
  }
  
  public void f()
  {
    boolean ☃ = g();
    this.u.l = ☃;
    this.t.l = ☃;
    
    this.t.l = false;
    this.s.l = false;
  }
  
  private boolean g()
  {
    return (this.r.u > -1) && (this.r.u < this.f.c().size());
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    this.r.a(☃, ☃, ☃);
    a(this.q, this.g, this.l / 2, 8, 16777215);
    
    int ☃ = this.l / 2 - 92 - 16;
    c(this.q, this.h, ☃, 32, 16777215);
    c(this.q, this.i, ☃ + 2 + 213 - this.q.a(this.i), 32, 16777215);
    
    super.a(☃, ☃, ☃);
  }
  
  class a
    extends awi
  {
    public int u = -1;
    
    public a()
    {
      super(axa.this.l, axa.this.m, 43, axa.this.m - 60, 24);
    }
    
    private void a(int ☃, int ☃, zx ☃)
    {
      e(☃ + 1, ☃ + 1);
      
      bfl.B();
      if ((☃ != null) && (☃.b() != null))
      {
        avc.c();
        axa.this.k.a(☃, ☃ + 2, ☃ + 2);
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
      ☃.b(☃ + 0, ☃ + 18, axa.a(axa.this)).a((☃ + 0) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
      ☃.b(☃ + 18, ☃ + 18, axa.b(axa.this)).a((☃ + 18) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
      ☃.b(☃ + 18, ☃ + 0, axa.c(axa.this)).a((☃ + 18) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
      ☃.b(☃ + 0, ☃ + 0, axa.d(axa.this)).a((☃ + 0) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
      ☃.b();
    }
    
    protected int b()
    {
      return axa.e(axa.this).c().size();
    }
    
    protected void a(int ☃, boolean ☃, int ☃, int ☃)
    {
      this.u = ☃;
      axa.this.f();
    }
    
    protected boolean a(int ☃)
    {
      return ☃ == this.u;
    }
    
    protected void a() {}
    
    protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      aqa ☃ = (aqa)axa.e(axa.this).c().get(axa.e(axa.this).c().size() - ☃ - 1);
      
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
      axa.this.q.a(☃, ☃ + 18 + 5, ☃ + 3, 16777215);
      String ☃;
      String ☃;
      if (☃ == 0)
      {
        ☃ = bnq.a("createWorld.customize.flat.layer.top", new Object[] { Integer.valueOf(☃.b()) });
      }
      else
      {
        String ☃;
        if (☃ == axa.e(axa.this).c().size() - 1) {
          ☃ = bnq.a("createWorld.customize.flat.layer.bottom", new Object[] { Integer.valueOf(☃.b()) });
        } else {
          ☃ = bnq.a("createWorld.customize.flat.layer", new Object[] { Integer.valueOf(☃.b()) });
        }
      }
      axa.this.q.a(☃, ☃ + 2 + 213 - axa.this.q.a(☃), ☃ + 3, 16777215);
    }
    
    protected int d()
    {
      return this.b - 70;
    }
  }
}
