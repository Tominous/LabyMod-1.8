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
    a = ☃;
    
    a(☃);
  }
  
  public String a()
  {
    return f.toString();
  }
  
  public void a(String ☃)
  {
    f = apz.a(☃);
  }
  
  public void b()
  {
    n.clear();
    
    g = bnq.a("createWorld.customize.flat.title", new Object[0]);
    h = bnq.a("createWorld.customize.flat.tile", new Object[0]);
    i = bnq.a("createWorld.customize.flat.height", new Object[0]);
    
    r = new axa.a();
    
    n.add(s = new avs(2, l / 2 - 154, m - 52, 100, 20, bnq.a("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)"));
    n.add(t = new avs(3, l / 2 - 50, m - 52, 100, 20, bnq.a("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)"));
    n.add(u = new avs(4, l / 2 - 155, m - 52, 150, 20, bnq.a("createWorld.customize.flat.removeLayer", new Object[0])));
    
    n.add(new avs(0, l / 2 - 155, m - 28, 150, 20, bnq.a("gui.done", new Object[0])));
    n.add(new avs(5, l / 2 + 5, m - 52, 150, 20, bnq.a("createWorld.customize.presets", new Object[0])));
    n.add(new avs(1, l / 2 + 5, m - 28, 150, 20, bnq.a("gui.cancel", new Object[0])));
    
    s.m = (t.m = 0);
    
    f.d();
    f();
  }
  
  public void k()
  {
    super.k();
    r.p();
  }
  
  protected void a(avs ☃)
  {
    int ☃ = f.c().size() - r.u - 1;
    if (k == 1)
    {
      j.a(a);
    }
    else if (k == 0)
    {
      a.a = a();
      j.a(a);
    }
    else if (k == 5)
    {
      j.a(new axq(this));
    }
    else if ((k == 4) && (g()))
    {
      f.c().remove(☃);
      r.u = Math.min(r.u, f.c().size() - 1);
    }
    f.d();
    f();
  }
  
  public void f()
  {
    boolean ☃ = g();
    u.l = ☃;
    t.l = ☃;
    
    t.l = false;
    s.l = false;
  }
  
  private boolean g()
  {
    return (r.u > -1) && (r.u < f.c().size());
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    r.a(☃, ☃, ☃);
    a(q, g, l / 2, 8, 16777215);
    
    int ☃ = l / 2 - 92 - 16;
    c(q, h, ☃, 32, 16777215);
    c(q, i, ☃ + 2 + 213 - q.a(i), 32, 16777215);
    
    super.a(☃, ☃, ☃);
  }
  
  class a
    extends awi
  {
    public int u = -1;
    
    public a()
    {
      super(l, m, 43, m - 60, 24);
    }
    
    private void a(int ☃, int ☃, zx ☃)
    {
      e(☃ + 1, ☃ + 1);
      
      bfl.B();
      if ((☃ != null) && (☃.b() != null))
      {
        avc.c();
        k.a(☃, ☃ + 2, ☃ + 2);
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
      u = ☃;
      f();
    }
    
    protected boolean a(int ☃)
    {
      return ☃ == u;
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
      q.a(☃, ☃ + 18 + 5, ☃ + 3, 16777215);
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
      q.a(☃, ☃ + 2 + 213 - q.a(☃), ☃ + 3, 16777215);
    }
    
    protected int d()
    {
      return b - 70;
    }
  }
}
