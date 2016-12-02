import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class axv
  extends axu
  implements awx
{
  private static final Logger g = ;
  private final DateFormat h = new SimpleDateFormat();
  protected axu a;
  protected String f = "Select world";
  private boolean i;
  private int r;
  private List<ats> s;
  private axv.a t;
  private String u;
  private String v;
  private String[] w = new String[4];
  private boolean x;
  private avs y;
  private avs z;
  private avs A;
  private avs B;
  
  public axv(axu ☃)
  {
    a = ☃;
  }
  
  public void b()
  {
    f = bnq.a("selectWorld.title", new Object[0]);
    try
    {
      f();
    }
    catch (atq ☃)
    {
      g.error("Couldn't load level list", ☃);
      j.a(new axj("Unable to load worlds", ☃.getMessage()));
      return;
    }
    u = bnq.a("selectWorld.world", new Object[0]);
    v = bnq.a("selectWorld.conversion", new Object[0]);
    w[adp.a.b.a()] = bnq.a("gameMode.survival", new Object[0]);
    w[adp.a.c.a()] = bnq.a("gameMode.creative", new Object[0]);
    w[adp.a.d.a()] = bnq.a("gameMode.adventure", new Object[0]);
    w[adp.a.e.a()] = bnq.a("gameMode.spectator", new Object[0]);
    
    t = new axv.a(j);
    t.d(4, 5);
    
    a();
  }
  
  public void k()
  {
    super.k();
    t.p();
  }
  
  private void f()
    throws atq
  {
    atr ☃ = j.f();
    s = ☃.b();
    Collections.sort(s);
    r = -1;
  }
  
  protected String b(int ☃)
  {
    return ((ats)s.get(☃)).a();
  }
  
  protected String h(int ☃)
  {
    String ☃ = ((ats)s.get(☃)).b();
    if (StringUtils.isEmpty(☃)) {
      ☃ = bnq.a("selectWorld.world", new Object[0]) + " " + (☃ + 1);
    }
    return ☃;
  }
  
  public void a()
  {
    n.add(z = new avs(1, l / 2 - 154, m - 52, 150, 20, bnq.a("selectWorld.select", new Object[0])));
    n.add(new avs(3, l / 2 + 4, m - 52, 150, 20, bnq.a("selectWorld.create", new Object[0])));
    
    n.add(A = new avs(6, l / 2 - 154, m - 28, 72, 20, bnq.a("selectWorld.rename", new Object[0])));
    n.add(y = new avs(2, l / 2 - 76, m - 28, 72, 20, bnq.a("selectWorld.delete", new Object[0])));
    n.add(B = new avs(7, l / 2 + 4, m - 28, 72, 20, bnq.a("selectWorld.recreate", new Object[0])));
    n.add(new avs(0, l / 2 + 82, m - 28, 72, 20, bnq.a("gui.cancel", new Object[0])));
    
    z.l = false;
    y.l = false;
    A.l = false;
    B.l = false;
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    if (k == 2)
    {
      String ☃ = h(r);
      if (☃ != null)
      {
        x = true;
        
        awy ☃ = a(this, ☃, r);
        j.a(☃);
      }
    }
    else if (k == 1)
    {
      i(r);
    }
    else if (k == 3)
    {
      j.a(new axb(this));
    }
    else if (k == 6)
    {
      j.a(new axt(this, b(r)));
    }
    else if (k == 0)
    {
      j.a(a);
    }
    else if (k == 7)
    {
      axb ☃ = new axb(this);
      atp ☃ = j.f().a(b(r), false);
      ato ☃ = ☃.d();
      ☃.a();
      
      ☃.a(☃);
      j.a(☃);
    }
    else
    {
      t.a(☃);
    }
  }
  
  public void i(int ☃)
  {
    j.a(null);
    if (i) {
      return;
    }
    i = true;
    
    String ☃ = b(☃);
    if (☃ == null) {
      ☃ = "World" + ☃;
    }
    String ☃ = h(☃);
    if (☃ == null) {
      ☃ = "World" + ☃;
    }
    if (j.f().f(☃)) {
      j.a(☃, ☃, null);
    }
  }
  
  public void a(boolean ☃, int ☃)
  {
    if (x)
    {
      x = false;
      if (☃)
      {
        atr ☃ = j.f();
        ☃.d();
        ☃.e(b(☃));
        try
        {
          f();
        }
        catch (atq ☃)
        {
          g.error("Couldn't load level list", ☃);
        }
      }
      j.a(this);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    t.a(☃, ☃, ☃);
    
    a(q, f, l / 2, 20, 16777215);
    
    super.a(☃, ☃, ☃);
  }
  
  class a
    extends awi
  {
    public a(ave ☃)
    {
      super(l, m, 32, m - 64, 36);
    }
    
    protected int b()
    {
      return axv.a(axv.this).size();
    }
    
    protected void a(int ☃, boolean ☃, int ☃, int ☃)
    {
      axv.a(axv.this, ☃);
      boolean ☃ = (axv.b(axv.this) >= 0) && (axv.b(axv.this) < b());
      cl = ☃;
      dl = ☃;
      el = ☃;
      fl = ☃;
      if ((☃) && (☃)) {
        i(☃);
      }
    }
    
    protected boolean a(int ☃)
    {
      return ☃ == axv.b(axv.this);
    }
    
    protected int k()
    {
      return axv.a(axv.this).size() * 36;
    }
    
    protected void a()
    {
      c();
    }
    
    protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      ats ☃ = (ats)axv.a(axv.this).get(☃);
      
      String ☃ = ☃.b();
      if (StringUtils.isEmpty(☃)) {
        ☃ = axv.g(axv.this) + " " + (☃ + 1);
      }
      String ☃ = ☃.a();
      ☃ = ☃ + " (" + axv.h(axv.this).format(new Date(☃.e()));
      ☃ = ☃ + ")";
      String ☃ = "";
      if (☃.d())
      {
        ☃ = axv.i(axv.this) + " " + ☃;
      }
      else
      {
        ☃ = axv.j(axv.this)[☃.f().a()];
        if (☃.g()) {
          ☃ = a.e + bnq.a("gameMode.hardcore", new Object[0]) + a.v;
        }
        if (☃.h()) {
          ☃ = ☃ + ", " + bnq.a("selectWorld.cheats", new Object[0]);
        }
      }
      c(q, ☃, ☃ + 2, ☃ + 1, 16777215);
      c(q, ☃, ☃ + 2, ☃ + 12, 8421504);
      c(q, ☃, ☃ + 2, ☃ + 12 + 10, 8421504);
    }
  }
  
  public static awy a(awx ☃, String ☃, int ☃)
  {
    String ☃ = bnq.a("selectWorld.deleteQuestion", new Object[0]);
    String ☃ = "'" + ☃ + "' " + bnq.a("selectWorld.deleteWarning", new Object[0]);
    String ☃ = bnq.a("selectWorld.deleteButton", new Object[0]);
    String ☃ = bnq.a("gui.cancel", new Object[0]);
    
    awy ☃ = new awy(☃, ☃, ☃, ☃, ☃, ☃);
    
    return ☃;
  }
}
