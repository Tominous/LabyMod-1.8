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
    this.a = ☃;
  }
  
  public void b()
  {
    this.f = bnq.a("selectWorld.title", new Object[0]);
    try
    {
      f();
    }
    catch (atq ☃)
    {
      g.error("Couldn't load level list", ☃);
      this.j.a(new axj("Unable to load worlds", ☃.getMessage()));
      return;
    }
    this.u = bnq.a("selectWorld.world", new Object[0]);
    this.v = bnq.a("selectWorld.conversion", new Object[0]);
    this.w[adp.a.b.a()] = bnq.a("gameMode.survival", new Object[0]);
    this.w[adp.a.c.a()] = bnq.a("gameMode.creative", new Object[0]);
    this.w[adp.a.d.a()] = bnq.a("gameMode.adventure", new Object[0]);
    this.w[adp.a.e.a()] = bnq.a("gameMode.spectator", new Object[0]);
    
    this.t = new axv.a(this.j);
    this.t.d(4, 5);
    
    a();
  }
  
  public void k()
  {
    super.k();
    this.t.p();
  }
  
  private void f()
    throws atq
  {
    atr ☃ = this.j.f();
    this.s = ☃.b();
    Collections.sort(this.s);
    this.r = -1;
  }
  
  protected String b(int ☃)
  {
    return ((ats)this.s.get(☃)).a();
  }
  
  protected String h(int ☃)
  {
    String ☃ = ((ats)this.s.get(☃)).b();
    if (StringUtils.isEmpty(☃)) {
      ☃ = bnq.a("selectWorld.world", new Object[0]) + " " + (☃ + 1);
    }
    return ☃;
  }
  
  public void a()
  {
    this.n.add(this.z = new avs(1, this.l / 2 - 154, this.m - 52, 150, 20, bnq.a("selectWorld.select", new Object[0])));
    this.n.add(new avs(3, this.l / 2 + 4, this.m - 52, 150, 20, bnq.a("selectWorld.create", new Object[0])));
    
    this.n.add(this.A = new avs(6, this.l / 2 - 154, this.m - 28, 72, 20, bnq.a("selectWorld.rename", new Object[0])));
    this.n.add(this.y = new avs(2, this.l / 2 - 76, this.m - 28, 72, 20, bnq.a("selectWorld.delete", new Object[0])));
    this.n.add(this.B = new avs(7, this.l / 2 + 4, this.m - 28, 72, 20, bnq.a("selectWorld.recreate", new Object[0])));
    this.n.add(new avs(0, this.l / 2 + 82, this.m - 28, 72, 20, bnq.a("gui.cancel", new Object[0])));
    
    this.z.l = false;
    this.y.l = false;
    this.A.l = false;
    this.B.l = false;
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 2)
    {
      String ☃ = h(this.r);
      if (☃ != null)
      {
        this.x = true;
        
        awy ☃ = a(this, ☃, this.r);
        this.j.a(☃);
      }
    }
    else if (☃.k == 1)
    {
      i(this.r);
    }
    else if (☃.k == 3)
    {
      this.j.a(new axb(this));
    }
    else if (☃.k == 6)
    {
      this.j.a(new axt(this, b(this.r)));
    }
    else if (☃.k == 0)
    {
      this.j.a(this.a);
    }
    else if (☃.k == 7)
    {
      axb ☃ = new axb(this);
      atp ☃ = this.j.f().a(b(this.r), false);
      ato ☃ = ☃.d();
      ☃.a();
      
      ☃.a(☃);
      this.j.a(☃);
    }
    else
    {
      this.t.a(☃);
    }
  }
  
  public void i(int ☃)
  {
    this.j.a(null);
    if (this.i) {
      return;
    }
    this.i = true;
    
    String ☃ = b(☃);
    if (☃ == null) {
      ☃ = "World" + ☃;
    }
    String ☃ = h(☃);
    if (☃ == null) {
      ☃ = "World" + ☃;
    }
    if (this.j.f().f(☃)) {
      this.j.a(☃, ☃, null);
    }
  }
  
  public void a(boolean ☃, int ☃)
  {
    if (this.x)
    {
      this.x = false;
      if (☃)
      {
        atr ☃ = this.j.f();
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
      this.j.a(this);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    this.t.a(☃, ☃, ☃);
    
    a(this.q, this.f, this.l / 2, 20, 16777215);
    
    super.a(☃, ☃, ☃);
  }
  
  class a
    extends awi
  {
    public a(ave ☃)
    {
      super(axv.this.l, axv.this.m, 32, axv.this.m - 64, 36);
    }
    
    protected int b()
    {
      return axv.a(axv.this).size();
    }
    
    protected void a(int ☃, boolean ☃, int ☃, int ☃)
    {
      axv.a(axv.this, ☃);
      boolean ☃ = (axv.b(axv.this) >= 0) && (axv.b(axv.this) < b());
      axv.c(axv.this).l = ☃;
      axv.d(axv.this).l = ☃;
      axv.e(axv.this).l = ☃;
      axv.f(axv.this).l = ☃;
      if ((☃) && (☃)) {
        axv.this.i(☃);
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
      axv.this.c();
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
      axv.this.c(axv.this.q, ☃, ☃ + 2, ☃ + 1, 16777215);
      axv.this.c(axv.this.q, ☃, ☃ + 2, ☃ + 12, 8421504);
      axv.this.c(axv.this.q, ☃, ☃ + 2, ☃ + 12 + 10, 8421504);
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
