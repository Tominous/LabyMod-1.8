import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Keyboard;

public class axb
  extends axu
{
  private axu f;
  private avw g;
  private avw h;
  private String i;
  private String r = "survival";
  private String s;
  private boolean t = true;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  private boolean z;
  private avs A;
  private avs B;
  private avs C;
  private avs D;
  private avs E;
  private avs F;
  private avs G;
  private String H;
  private String I;
  private String J;
  private String K;
  private int L;
  public String a = "";
  
  public axb(axu ☃)
  {
    this.f = ☃;
    
    this.J = "";
    this.K = bnq.a("selectWorld.newWorld", new Object[0]);
  }
  
  public void e()
  {
    this.g.a();
    this.h.a();
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    this.n.clear();
    this.n.add(new avs(0, this.l / 2 - 155, this.m - 28, 150, 20, bnq.a("selectWorld.create", new Object[0])));
    this.n.add(new avs(1, this.l / 2 + 5, this.m - 28, 150, 20, bnq.a("gui.cancel", new Object[0])));
    
    this.n.add(this.A = new avs(2, this.l / 2 - 75, 115, 150, 20, bnq.a("selectWorld.gameMode", new Object[0])));
    this.n.add(this.B = new avs(3, this.l / 2 - 75, 187, 150, 20, bnq.a("selectWorld.moreWorldOptions", new Object[0])));
    
    this.n.add(this.C = new avs(4, this.l / 2 - 155, 100, 150, 20, bnq.a("selectWorld.mapFeatures", new Object[0])));
    this.C.m = false;
    this.n.add(this.D = new avs(7, this.l / 2 + 5, 151, 150, 20, bnq.a("selectWorld.bonusItems", new Object[0])));
    this.D.m = false;
    this.n.add(this.E = new avs(5, this.l / 2 + 5, 100, 150, 20, bnq.a("selectWorld.mapType", new Object[0])));
    this.E.m = false;
    this.n.add(this.F = new avs(6, this.l / 2 - 155, 151, 150, 20, bnq.a("selectWorld.allowCommands", new Object[0])));
    this.F.m = false;
    this.n.add(this.G = new avs(8, this.l / 2 + 5, 120, 150, 20, bnq.a("selectWorld.customizeType", new Object[0])));
    this.G.m = false;
    
    this.g = new avw(9, this.q, this.l / 2 - 100, 60, 200, 20);
    this.g.b(true);
    this.g.a(this.K);
    
    this.h = new avw(10, this.q, this.l / 2 - 100, 60, 200, 20);
    this.h.a(this.J);
    
    a(this.z);
    
    a();
    f();
  }
  
  private void a()
  {
    this.i = this.g.b().trim();
    for (char ☃ : f.a) {
      this.i = this.i.replace(☃, '_');
    }
    if (StringUtils.isEmpty(this.i)) {
      this.i = "World";
    }
    this.i = a(this.j.f(), this.i);
  }
  
  private void f()
  {
    this.A.j = (bnq.a("selectWorld.gameMode", new Object[0]) + ": " + bnq.a(new StringBuilder().append("selectWorld.gameMode.").append(this.r).toString(), new Object[0]));
    this.H = bnq.a("selectWorld.gameMode." + this.r + ".line1", new Object[0]);
    this.I = bnq.a("selectWorld.gameMode." + this.r + ".line2", new Object[0]);
    
    this.C.j = (bnq.a("selectWorld.mapFeatures", new Object[0]) + " ");
    if (this.t) {
      this.C.j += bnq.a("options.on", new Object[0]);
    } else {
      this.C.j += bnq.a("options.off", new Object[0]);
    }
    this.D.j = (bnq.a("selectWorld.bonusItems", new Object[0]) + " ");
    if ((this.w) && (!this.x)) {
      this.D.j += bnq.a("options.on", new Object[0]);
    } else {
      this.D.j += bnq.a("options.off", new Object[0]);
    }
    this.E.j = (bnq.a("selectWorld.mapType", new Object[0]) + " " + bnq.a(adr.a[this.L].b(), new Object[0]));
    
    this.F.j = (bnq.a("selectWorld.allowCommands", new Object[0]) + " ");
    if ((this.u) && (!this.x)) {
      this.F.j += bnq.a("options.on", new Object[0]);
    } else {
      this.F.j += bnq.a("options.off", new Object[0]);
    }
  }
  
  private static final String[] M = { "CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9" };
  
  public static String a(atr ☃, String ☃)
  {
    ☃ = ☃.replaceAll("[\\./\"]", "_");
    for (String ☃ : M) {
      if (☃.equalsIgnoreCase(☃)) {
        ☃ = "_" + ☃ + "_";
      }
    }
    while (☃.c(☃) != null) {
      ☃ = ☃ + "-";
    }
    return ☃;
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 1)
    {
      this.j.a(this.f);
    }
    else if (☃.k == 0)
    {
      this.j.a(null);
      if (this.y) {
        return;
      }
      this.y = true;
      
      long ☃ = new Random().nextLong();
      String ☃ = this.h.b();
      if (!StringUtils.isEmpty(☃)) {
        try
        {
          long ☃ = Long.parseLong(☃);
          if (☃ != 0L) {
            ☃ = ☃;
          }
        }
        catch (NumberFormatException ☃)
        {
          ☃ = ☃.hashCode();
        }
      }
      adp.a ☃ = adp.a.a(this.r);
      adp ☃ = new adp(☃, ☃, this.t, this.x, adr.a[this.L]);
      ☃.a(this.a);
      if ((this.w) && (!this.x)) {
        ☃.a();
      }
      if ((this.u) && (!this.x)) {
        ☃.b();
      }
      this.j.a(this.i, this.g.b().trim(), ☃);
    }
    else if (☃.k == 3)
    {
      h();
    }
    else if (☃.k == 2)
    {
      if (this.r.equals("survival"))
      {
        if (!this.v) {
          this.u = false;
        }
        this.x = false;
        this.r = "hardcore";
        this.x = true;
        this.F.l = false;
        this.D.l = false;
        f();
      }
      else if (this.r.equals("hardcore"))
      {
        if (!this.v) {
          this.u = true;
        }
        this.x = false;
        this.r = "creative";
        f();
        this.x = false;
        this.F.l = true;
        this.D.l = true;
      }
      else
      {
        if (!this.v) {
          this.u = false;
        }
        this.r = "survival";
        f();
        this.F.l = true;
        this.D.l = true;
        this.x = false;
      }
      f();
    }
    else if (☃.k == 4)
    {
      this.t = (!this.t);
      f();
    }
    else if (☃.k == 7)
    {
      this.w = (!this.w);
      f();
    }
    else if (☃.k == 5)
    {
      this.L += 1;
      if (this.L >= adr.a.length) {
        this.L = 0;
      }
      while (!g())
      {
        this.L += 1;
        if (this.L >= adr.a.length) {
          this.L = 0;
        }
      }
      this.a = "";
      f();
      a(this.z);
    }
    else if (☃.k == 6)
    {
      this.v = true;
      this.u = (!this.u);
      f();
    }
    else if (☃.k == 8)
    {
      if (adr.a[this.L] == adr.c) {
        this.j.a(new axa(this, this.a));
      } else {
        this.j.a(new axd(this, this.a));
      }
    }
  }
  
  private boolean g()
  {
    adr ☃ = adr.a[this.L];
    if ((☃ == null) || (!☃.e())) {
      return false;
    }
    if (☃ == adr.g) {
      return r();
    }
    return true;
  }
  
  private void h()
  {
    a(!this.z);
  }
  
  private void a(boolean ☃)
  {
    this.z = ☃;
    if (adr.a[this.L] == adr.g)
    {
      this.A.m = (!this.z);
      this.A.l = false;
      if (this.s == null) {
        this.s = this.r;
      }
      this.r = "spectator";
      this.C.m = false;
      this.D.m = false;
      this.E.m = this.z;
      this.F.m = false;
      this.G.m = false;
    }
    else
    {
      this.A.m = (!this.z);
      this.A.l = true;
      if (this.s != null)
      {
        this.r = this.s;
        this.s = null;
      }
      this.C.m = ((this.z) && (adr.a[this.L] != adr.f));
      this.D.m = this.z;
      this.E.m = this.z;
      this.F.m = this.z;
      this.G.m = ((this.z) && ((adr.a[this.L] == adr.c) || (adr.a[this.L] == adr.f)));
    }
    f();
    if (this.z) {
      this.B.j = bnq.a("gui.done", new Object[0]);
    } else {
      this.B.j = bnq.a("selectWorld.moreWorldOptions", new Object[0]);
    }
  }
  
  protected void a(char ☃, int ☃)
  {
    if ((this.g.m()) && (!this.z))
    {
      this.g.a(☃, ☃);
      this.K = this.g.b();
    }
    else if ((this.h.m()) && (this.z))
    {
      this.h.a(☃, ☃);
      this.J = this.h.b();
    }
    if ((☃ == 28) || (☃ == 156)) {
      a((avs)this.n.get(0));
    }
    ((avs)this.n.get(0)).l = (this.g.b().length() > 0);
    
    a();
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    if (this.z) {
      this.h.a(☃, ☃, ☃);
    } else {
      this.g.a(☃, ☃, ☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(this.q, bnq.a("selectWorld.create", new Object[0]), this.l / 2, 20, -1);
    if (this.z)
    {
      c(this.q, bnq.a("selectWorld.enterSeed", new Object[0]), this.l / 2 - 100, 47, -6250336);
      c(this.q, bnq.a("selectWorld.seedInfo", new Object[0]), this.l / 2 - 100, 85, -6250336);
      if (this.C.m) {
        c(this.q, bnq.a("selectWorld.mapFeatures.info", new Object[0]), this.l / 2 - 150, 122, -6250336);
      }
      if (this.F.m) {
        c(this.q, bnq.a("selectWorld.allowCommands.info", new Object[0]), this.l / 2 - 150, 172, -6250336);
      }
      this.h.g();
      if (adr.a[this.L].h()) {
        this.q.a(bnq.a(adr.a[this.L].c(), new Object[0]), this.E.h + 2, this.E.i + 22, this.E.b(), 10526880);
      }
    }
    else
    {
      c(this.q, bnq.a("selectWorld.enterName", new Object[0]), this.l / 2 - 100, 47, -6250336);
      c(this.q, bnq.a("selectWorld.resultFolder", new Object[0]) + " " + this.i, this.l / 2 - 100, 85, -6250336);
      this.g.g();
      
      c(this.q, this.H, this.l / 2 - 100, 137, -6250336);
      c(this.q, this.I, this.l / 2 - 100, 149, -6250336);
    }
    super.a(☃, ☃, ☃);
  }
  
  public void a(ato ☃)
  {
    this.K = bnq.a("selectWorld.newWorld.copyOf", new Object[] { ☃.k() });
    this.J = (☃.b() + "");
    this.L = ☃.u().g();
    this.a = ☃.B();
    this.t = ☃.s();
    this.u = ☃.v();
    if (☃.t()) {
      this.r = "hardcore";
    } else if (☃.r().e()) {
      this.r = "survival";
    } else if (☃.r().d()) {
      this.r = "creative";
    }
  }
}
