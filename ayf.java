import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.lwjgl.input.Mouse;

public class ayf
  extends axu
  implements ayg
{
  protected axu a;
  protected String f = "Select world";
  private ayf.b g;
  private ayf.c h;
  private ayf.a i;
  private ayf.d r;
  private nb s;
  private awi t;
  private boolean u = true;
  
  public ayf(axu ☃, nb ☃)
  {
    a = ☃;
    s = ☃;
  }
  
  public void b()
  {
    f = bnq.a("gui.stats", new Object[0]);
    
    u = true;
    j.u().a(new ig(ig.a.b));
  }
  
  public void k()
  {
    super.k();
    if (t != null) {
      t.p();
    }
  }
  
  public void f()
  {
    g = new ayf.b(j);
    g.d(1, 1);
    
    h = new ayf.c(j);
    h.d(1, 1);
    
    i = new ayf.a(j);
    i.d(1, 1);
    
    r = new ayf.d(j);
    r.d(1, 1);
  }
  
  public void g()
  {
    n.add(new avs(0, l / 2 + 4, m - 28, 150, 20, bnq.a("gui.done", new Object[0])));
    
    n.add(new avs(1, l / 2 - 160, m - 52, 80, 20, bnq.a("stat.generalButton", new Object[0])));
    avs ☃;
    n.add(☃ = new avs(2, l / 2 - 80, m - 52, 80, 20, bnq.a("stat.blocksButton", new Object[0])));
    avs ☃;
    n.add(☃ = new avs(3, l / 2, m - 52, 80, 20, bnq.a("stat.itemsButton", new Object[0])));
    avs ☃;
    n.add(☃ = new avs(4, l / 2 + 80, m - 52, 80, 20, bnq.a("stat.mobsButton", new Object[0])));
    if (i.b() == 0) {
      l = false;
    }
    if (h.b() == 0) {
      l = false;
    }
    if (r.b() == 0) {
      l = false;
    }
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    if (k == 0) {
      j.a(a);
    } else if (k == 1) {
      t = g;
    } else if (k == 3) {
      t = h;
    } else if (k == 2) {
      t = i;
    } else if (k == 4) {
      t = r;
    } else {
      t.a(☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    if (u)
    {
      c();
      a(q, bnq.a("multiplayer.downloadingStats", new Object[0]), l / 2, m / 2, 16777215);
      a(q, c_[((int)(ave.J() / 150L % c_.length))], l / 2, m / 2 + q.a * 2, 16777215);
    }
    else
    {
      t.a(☃, ☃, ☃);
      a(q, f, l / 2, 20, 16777215);
      super.a(☃, ☃, ☃);
    }
  }
  
  public void a()
  {
    if (u)
    {
      f();
      g();
      t = g;
      u = false;
    }
  }
  
  public boolean d()
  {
    return !u;
  }
  
  class b
    extends awi
  {
    public b(ave ☃)
    {
      super(l, m, 32, m - 64, 10);
      
      b(false);
    }
    
    protected int b()
    {
      return na.c.size();
    }
    
    protected void a(int ☃, boolean ☃, int ☃, int ☃) {}
    
    protected boolean a(int ☃)
    {
      return false;
    }
    
    protected int k()
    {
      return b() * 10;
    }
    
    protected void a()
    {
      c();
    }
    
    protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      mw ☃ = (mw)na.c.get(☃);
      c(ayf.a(ayf.this), ☃.e().c(), ☃ + 2, ☃ + 1, ☃ % 2 == 0 ? 16777215 : 9474192);
      String ☃ = ☃.a(ayf.b(ayf.this).a(☃));
      c(ayf.c(ayf.this), ☃, ☃ + 2 + 213 - ayf.d(ayf.this).a(☃), ☃ + 1, ☃ % 2 == 0 ? 16777215 : 9474192);
    }
  }
  
  private void a(int ☃, int ☃, zw ☃)
  {
    b(☃ + 1, ☃ + 1);
    
    bfl.B();
    
    avc.c();
    
    k.a(new zx(☃, 1, 0), ☃ + 2, ☃ + 2);
    avc.a();
    
    bfl.C();
  }
  
  private void b(int ☃, int ☃)
  {
    c(☃, ☃, 0, 0);
  }
  
  private void c(int ☃, int ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    j.P().a(c);
    
    float ☃ = 0.0078125F;
    float ☃ = 0.0078125F;
    int ☃ = 18;
    int ☃ = 18;
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    ☃.a(7, bms.g);
    ☃.b(☃ + 0, ☃ + 18, e).a((☃ + 0) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
    ☃.b(☃ + 18, ☃ + 18, e).a((☃ + 18) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
    ☃.b(☃ + 18, ☃ + 0, e).a((☃ + 18) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
    ☃.b(☃ + 0, ☃ + 0, e).a((☃ + 0) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
    ☃.b();
  }
  
  abstract class e
    extends awi
  {
    protected int v = -1;
    protected List<mu> w;
    protected Comparator<mu> x;
    protected int y = -1;
    protected int z;
    
    protected e(ave ☃)
    {
      super(l, m, 32, m - 64, 20);
      
      b(false);
      a(true, 20);
    }
    
    protected void a(int ☃, boolean ☃, int ☃, int ☃) {}
    
    protected boolean a(int ☃)
    {
      return false;
    }
    
    protected void a()
    {
      c();
    }
    
    protected void a(int ☃, int ☃, bfx ☃)
    {
      if (!Mouse.isButtonDown(0)) {
        v = -1;
      }
      if (v == 0) {
        ayf.a(ayf.this, ☃ + 115 - 18, ☃ + 1, 0, 0);
      } else {
        ayf.a(ayf.this, ☃ + 115 - 18, ☃ + 1, 0, 18);
      }
      if (v == 1) {
        ayf.a(ayf.this, ☃ + 165 - 18, ☃ + 1, 0, 0);
      } else {
        ayf.a(ayf.this, ☃ + 165 - 18, ☃ + 1, 0, 18);
      }
      if (v == 2) {
        ayf.a(ayf.this, ☃ + 215 - 18, ☃ + 1, 0, 0);
      } else {
        ayf.a(ayf.this, ☃ + 215 - 18, ☃ + 1, 0, 18);
      }
      if (y != -1)
      {
        int ☃ = 79;
        int ☃ = 18;
        if (y == 1) {
          ☃ = 129;
        } else if (y == 2) {
          ☃ = 179;
        }
        if (z == 1) {
          ☃ = 36;
        }
        ayf.a(ayf.this, ☃ + ☃, ☃ + 1, ☃, 0);
      }
    }
    
    protected void a(int ☃, int ☃)
    {
      v = -1;
      if ((☃ >= 79) && (☃ < 115)) {
        v = 0;
      } else if ((☃ >= 129) && (☃ < 165)) {
        v = 1;
      } else if ((☃ >= 179) && (☃ < 215)) {
        v = 2;
      }
      if (v >= 0)
      {
        d(v);
        a.W().a(bpf.a(new jy("gui.button.press"), 1.0F));
      }
    }
    
    protected final int b()
    {
      return w.size();
    }
    
    protected final mu c(int ☃)
    {
      return (mu)w.get(☃);
    }
    
    protected abstract String b(int paramInt);
    
    protected void a(mw ☃, int ☃, int ☃, boolean ☃)
    {
      if (☃ != null)
      {
        String ☃ = ☃.a(ayf.b(ayf.this).a(☃));
        c(ayf.e(ayf.this), ☃, ☃ - ayf.f(ayf.this).a(☃), ☃ + 5, ☃ ? 16777215 : 9474192);
      }
      else
      {
        String ☃ = "-";
        c(ayf.g(ayf.this), ☃, ☃ - ayf.h(ayf.this).a(☃), ☃ + 5, ☃ ? 16777215 : 9474192);
      }
    }
    
    protected void b(int ☃, int ☃)
    {
      if ((☃ < d) || (☃ > e)) {
        return;
      }
      int ☃ = c(☃, ☃);
      int ☃ = b / 2 - 92 - 16;
      if (☃ >= 0)
      {
        if ((☃ < ☃ + 40) || (☃ > ☃ + 40 + 20)) {
          return;
        }
        mu ☃ = c(☃);
        a(☃, ☃, ☃);
      }
      else
      {
        String ☃ = "";
        if ((☃ >= ☃ + 115 - 18) && (☃ <= ☃ + 115)) {
          ☃ = b(0);
        } else if ((☃ >= ☃ + 165 - 18) && (☃ <= ☃ + 165)) {
          ☃ = b(1);
        } else if ((☃ >= ☃ + 215 - 18) && (☃ <= ☃ + 215)) {
          ☃ = b(2);
        } else {
          return;
        }
        ☃ = ("" + bnq.a(☃, new Object[0])).trim();
        if (☃.length() > 0)
        {
          int ☃ = ☃ + 12;
          int ☃ = ☃ - 12;
          int ☃ = ayf.i(ayf.this).a(☃);
          ayf.a(ayf.this, ☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + 8 + 3, -1073741824, -1073741824);
          
          ayf.j(ayf.this).a(☃, ☃, ☃, -1);
        }
      }
    }
    
    protected void a(mu ☃, int ☃, int ☃)
    {
      if (☃ == null) {
        return;
      }
      zw ☃ = ☃.a();
      zx ☃ = new zx(☃);
      String ☃ = ☃.a();
      
      String ☃ = ("" + bnq.a(new StringBuilder().append(☃).append(".name").toString(), new Object[0])).trim();
      if (☃.length() > 0)
      {
        int ☃ = ☃ + 12;
        int ☃ = ☃ - 12;
        int ☃ = ayf.k(ayf.this).a(☃);
        ayf.b(ayf.this, ☃ - 3, ☃ - 3, ☃ + ☃ + 3, ☃ + 8 + 3, -1073741824, -1073741824);
        
        ayf.l(ayf.this).a(☃, ☃, ☃, -1);
      }
    }
    
    protected void d(int ☃)
    {
      if (☃ != y)
      {
        y = ☃;
        z = -1;
      }
      else if (z == -1)
      {
        z = 1;
      }
      else
      {
        y = -1;
        z = 0;
      }
      Collections.sort(w, x);
    }
  }
  
  class c
    extends ayf.e
  {
    public c(ave ☃)
    {
      super(☃);
      
      w = Lists.newArrayList();
      for (mu ☃ : na.d)
      {
        boolean ☃ = false;
        int ☃ = zw.b(☃.a());
        if (ayf.b(ayf.this).a(☃) > 0) {
          ☃ = true;
        } else if ((na.ae[☃] != null) && (ayf.b(ayf.this).a(na.ae[☃]) > 0)) {
          ☃ = true;
        } else if ((na.ac[☃] != null) && (ayf.b(ayf.this).a(na.ac[☃]) > 0)) {
          ☃ = true;
        }
        if (☃) {
          w.add(☃);
        }
      }
      x = new Comparator()
      {
        public int a(mu ☃, mu ☃)
        {
          int ☃ = zw.b(☃.a());
          int ☃ = zw.b(☃.a());
          
          mw ☃ = null;
          mw ☃ = null;
          if (y == 0)
          {
            ☃ = na.ae[☃];
            ☃ = na.ae[☃];
          }
          else if (y == 1)
          {
            ☃ = na.ac[☃];
            ☃ = na.ac[☃];
          }
          else if (y == 2)
          {
            ☃ = na.ad[☃];
            ☃ = na.ad[☃];
          }
          if ((☃ != null) || (☃ != null))
          {
            if (☃ == null) {
              return 1;
            }
            if (☃ == null) {
              return -1;
            }
            int ☃ = ayf.b(ayf.this).a(☃);
            int ☃ = ayf.b(ayf.this).a(☃);
            if (☃ != ☃) {
              return (☃ - ☃) * z;
            }
          }
          return ☃ - ☃;
        }
      };
    }
    
    protected void a(int ☃, int ☃, bfx ☃)
    {
      super.a(☃, ☃, ☃);
      if (v == 0) {
        ayf.a(ayf.this, ☃ + 115 - 18 + 1, ☃ + 1 + 1, 72, 18);
      } else {
        ayf.a(ayf.this, ☃ + 115 - 18, ☃ + 1, 72, 18);
      }
      if (v == 1) {
        ayf.a(ayf.this, ☃ + 165 - 18 + 1, ☃ + 1 + 1, 18, 18);
      } else {
        ayf.a(ayf.this, ☃ + 165 - 18, ☃ + 1, 18, 18);
      }
      if (v == 2) {
        ayf.a(ayf.this, ☃ + 215 - 18 + 1, ☃ + 1 + 1, 36, 18);
      } else {
        ayf.a(ayf.this, ☃ + 215 - 18, ☃ + 1, 36, 18);
      }
    }
    
    protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      mu ☃ = c(☃);
      
      zw ☃ = ☃.a();
      ayf.a(ayf.this, ☃ + 40, ☃, ☃);
      
      int ☃ = zw.b(☃);
      a(na.ae[☃], ☃ + 115, ☃, ☃ % 2 == 0);
      a(na.ac[☃], ☃ + 165, ☃, ☃ % 2 == 0);
      a(☃, ☃ + 215, ☃, ☃ % 2 == 0);
    }
    
    protected String b(int ☃)
    {
      if (☃ == 1) {
        return "stat.crafted";
      }
      if (☃ == 2) {
        return "stat.used";
      }
      return "stat.depleted";
    }
  }
  
  class a
    extends ayf.e
  {
    public a(ave ☃)
    {
      super(☃);
      
      w = Lists.newArrayList();
      for (mu ☃ : na.e)
      {
        boolean ☃ = false;
        int ☃ = zw.b(☃.a());
        if (ayf.b(ayf.this).a(☃) > 0) {
          ☃ = true;
        } else if ((na.ad[☃] != null) && (ayf.b(ayf.this).a(na.ad[☃]) > 0)) {
          ☃ = true;
        } else if ((na.ac[☃] != null) && (ayf.b(ayf.this).a(na.ac[☃]) > 0)) {
          ☃ = true;
        }
        if (☃) {
          w.add(☃);
        }
      }
      x = new Comparator()
      {
        public int a(mu ☃, mu ☃)
        {
          int ☃ = zw.b(☃.a());
          int ☃ = zw.b(☃.a());
          
          mw ☃ = null;
          mw ☃ = null;
          if (y == 2)
          {
            ☃ = na.ab[☃];
            ☃ = na.ab[☃];
          }
          else if (y == 0)
          {
            ☃ = na.ac[☃];
            ☃ = na.ac[☃];
          }
          else if (y == 1)
          {
            ☃ = na.ad[☃];
            ☃ = na.ad[☃];
          }
          if ((☃ != null) || (☃ != null))
          {
            if (☃ == null) {
              return 1;
            }
            if (☃ == null) {
              return -1;
            }
            int ☃ = ayf.b(ayf.this).a(☃);
            int ☃ = ayf.b(ayf.this).a(☃);
            if (☃ != ☃) {
              return (☃ - ☃) * z;
            }
          }
          return ☃ - ☃;
        }
      };
    }
    
    protected void a(int ☃, int ☃, bfx ☃)
    {
      super.a(☃, ☃, ☃);
      if (v == 0) {
        ayf.a(ayf.this, ☃ + 115 - 18 + 1, ☃ + 1 + 1, 18, 18);
      } else {
        ayf.a(ayf.this, ☃ + 115 - 18, ☃ + 1, 18, 18);
      }
      if (v == 1) {
        ayf.a(ayf.this, ☃ + 165 - 18 + 1, ☃ + 1 + 1, 36, 18);
      } else {
        ayf.a(ayf.this, ☃ + 165 - 18, ☃ + 1, 36, 18);
      }
      if (v == 2) {
        ayf.a(ayf.this, ☃ + 215 - 18 + 1, ☃ + 1 + 1, 54, 18);
      } else {
        ayf.a(ayf.this, ☃ + 215 - 18, ☃ + 1, 54, 18);
      }
    }
    
    protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      mu ☃ = c(☃);
      zw ☃ = ☃.a();
      
      ayf.a(ayf.this, ☃ + 40, ☃, ☃);
      
      int ☃ = zw.b(☃);
      a(na.ac[☃], ☃ + 115, ☃, ☃ % 2 == 0);
      a(na.ad[☃], ☃ + 165, ☃, ☃ % 2 == 0);
      a(☃, ☃ + 215, ☃, ☃ % 2 == 0);
    }
    
    protected String b(int ☃)
    {
      if (☃ == 0) {
        return "stat.crafted";
      }
      if (☃ == 1) {
        return "stat.used";
      }
      return "stat.mined";
    }
  }
  
  class d
    extends awi
  {
    private final List<pm.a> v = Lists.newArrayList();
    
    public d(ave ☃)
    {
      super(l, m, 32, m - 64, ma * 4);
      
      b(false);
      for (pm.a ☃ : pm.a.values()) {
        if ((ayf.b(ayf.this).a(d) > 0) || (ayf.b(ayf.this).a(e) > 0)) {
          v.add(☃);
        }
      }
    }
    
    protected int b()
    {
      return v.size();
    }
    
    protected void a(int ☃, boolean ☃, int ☃, int ☃) {}
    
    protected boolean a(int ☃)
    {
      return false;
    }
    
    protected int k()
    {
      return b() * na * 4;
    }
    
    protected void a()
    {
      c();
    }
    
    protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      pm.a ☃ = (pm.a)v.get(☃);
      String ☃ = bnq.a("entity." + pm.b(a) + ".name", new Object[0]);
      int ☃ = ayf.b(ayf.this).a(d);
      int ☃ = ayf.b(ayf.this).a(e);
      String ☃ = bnq.a("stat.entityKills", new Object[] { Integer.valueOf(☃), ☃ });
      String ☃ = bnq.a("stat.entityKilledBy", new Object[] { ☃, Integer.valueOf(☃) });
      if (☃ == 0) {
        ☃ = bnq.a("stat.entityKills.none", new Object[] { ☃ });
      }
      if (☃ == 0) {
        ☃ = bnq.a("stat.entityKilledBy.none", new Object[] { ☃ });
      }
      c(ayf.o(ayf.this), ☃, ☃ + 2 - 10, ☃ + 1, 16777215);
      
      c(ayf.p(ayf.this), ☃, ☃ + 2, ☃ + 1 + qa, ☃ == 0 ? 6316128 : 9474192);
      c(ayf.r(ayf.this), ☃, ☃ + 2, ☃ + 1 + sa * 2, ☃ == 0 ? 6316128 : 9474192);
    }
  }
}
