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
    f = ☃;
    
    J = "";
    K = bnq.a("selectWorld.newWorld", new Object[0]);
  }
  
  public void e()
  {
    g.a();
    h.a();
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    n.add(new avs(0, l / 2 - 155, m - 28, 150, 20, bnq.a("selectWorld.create", new Object[0])));
    n.add(new avs(1, l / 2 + 5, m - 28, 150, 20, bnq.a("gui.cancel", new Object[0])));
    
    n.add(A = new avs(2, l / 2 - 75, 115, 150, 20, bnq.a("selectWorld.gameMode", new Object[0])));
    n.add(B = new avs(3, l / 2 - 75, 187, 150, 20, bnq.a("selectWorld.moreWorldOptions", new Object[0])));
    
    n.add(C = new avs(4, l / 2 - 155, 100, 150, 20, bnq.a("selectWorld.mapFeatures", new Object[0])));
    C.m = false;
    n.add(D = new avs(7, l / 2 + 5, 151, 150, 20, bnq.a("selectWorld.bonusItems", new Object[0])));
    D.m = false;
    n.add(E = new avs(5, l / 2 + 5, 100, 150, 20, bnq.a("selectWorld.mapType", new Object[0])));
    E.m = false;
    n.add(F = new avs(6, l / 2 - 155, 151, 150, 20, bnq.a("selectWorld.allowCommands", new Object[0])));
    F.m = false;
    n.add(G = new avs(8, l / 2 + 5, 120, 150, 20, bnq.a("selectWorld.customizeType", new Object[0])));
    G.m = false;
    
    g = new avw(9, q, l / 2 - 100, 60, 200, 20);
    g.b(true);
    g.a(K);
    
    h = new avw(10, q, l / 2 - 100, 60, 200, 20);
    h.a(J);
    
    a(z);
    
    a();
    f();
  }
  
  private void a()
  {
    i = g.b().trim();
    for (char ☃ : f.a) {
      i = i.replace(☃, '_');
    }
    if (StringUtils.isEmpty(i)) {
      i = "World";
    }
    i = a(j.f(), i);
  }
  
  private void f()
  {
    A.j = (bnq.a("selectWorld.gameMode", new Object[0]) + ": " + bnq.a(new StringBuilder().append("selectWorld.gameMode.").append(r).toString(), new Object[0]));
    H = bnq.a("selectWorld.gameMode." + r + ".line1", new Object[0]);
    I = bnq.a("selectWorld.gameMode." + r + ".line2", new Object[0]);
    
    C.j = (bnq.a("selectWorld.mapFeatures", new Object[0]) + " ");
    if (t) {
      C.j += bnq.a("options.on", new Object[0]);
    } else {
      C.j += bnq.a("options.off", new Object[0]);
    }
    D.j = (bnq.a("selectWorld.bonusItems", new Object[0]) + " ");
    if ((w) && (!x)) {
      D.j += bnq.a("options.on", new Object[0]);
    } else {
      D.j += bnq.a("options.off", new Object[0]);
    }
    E.j = (bnq.a("selectWorld.mapType", new Object[0]) + " " + bnq.a(adr.a[L].b(), new Object[0]));
    
    F.j = (bnq.a("selectWorld.allowCommands", new Object[0]) + " ");
    if ((u) && (!x)) {
      F.j += bnq.a("options.on", new Object[0]);
    } else {
      F.j += bnq.a("options.off", new Object[0]);
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
    if (!l) {
      return;
    }
    if (k == 1)
    {
      j.a(f);
    }
    else if (k == 0)
    {
      j.a(null);
      if (y) {
        return;
      }
      y = true;
      
      long ☃ = new Random().nextLong();
      String ☃ = h.b();
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
      adp.a ☃ = adp.a.a(r);
      adp ☃ = new adp(☃, ☃, t, x, adr.a[L]);
      ☃.a(a);
      if ((w) && (!x)) {
        ☃.a();
      }
      if ((u) && (!x)) {
        ☃.b();
      }
      j.a(i, g.b().trim(), ☃);
    }
    else if (k == 3)
    {
      h();
    }
    else if (k == 2)
    {
      if (r.equals("survival"))
      {
        if (!v) {
          u = false;
        }
        x = false;
        r = "hardcore";
        x = true;
        F.l = false;
        D.l = false;
        f();
      }
      else if (r.equals("hardcore"))
      {
        if (!v) {
          u = true;
        }
        x = false;
        r = "creative";
        f();
        x = false;
        F.l = true;
        D.l = true;
      }
      else
      {
        if (!v) {
          u = false;
        }
        r = "survival";
        f();
        F.l = true;
        D.l = true;
        x = false;
      }
      f();
    }
    else if (k == 4)
    {
      t = (!t);
      f();
    }
    else if (k == 7)
    {
      w = (!w);
      f();
    }
    else if (k == 5)
    {
      L += 1;
      if (L >= adr.a.length) {
        L = 0;
      }
      while (!g())
      {
        L += 1;
        if (L >= adr.a.length) {
          L = 0;
        }
      }
      a = "";
      f();
      a(z);
    }
    else if (k == 6)
    {
      v = true;
      u = (!u);
      f();
    }
    else if (k == 8)
    {
      if (adr.a[L] == adr.c) {
        j.a(new axa(this, a));
      } else {
        j.a(new axd(this, a));
      }
    }
  }
  
  private boolean g()
  {
    adr ☃ = adr.a[L];
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
    a(!z);
  }
  
  private void a(boolean ☃)
  {
    z = ☃;
    if (adr.a[L] == adr.g)
    {
      A.m = (!z);
      A.l = false;
      if (s == null) {
        s = r;
      }
      r = "spectator";
      C.m = false;
      D.m = false;
      E.m = z;
      F.m = false;
      G.m = false;
    }
    else
    {
      A.m = (!z);
      A.l = true;
      if (s != null)
      {
        r = s;
        s = null;
      }
      C.m = ((z) && (adr.a[L] != adr.f));
      D.m = z;
      E.m = z;
      F.m = z;
      G.m = ((z) && ((adr.a[L] == adr.c) || (adr.a[L] == adr.f)));
    }
    f();
    if (z) {
      B.j = bnq.a("gui.done", new Object[0]);
    } else {
      B.j = bnq.a("selectWorld.moreWorldOptions", new Object[0]);
    }
  }
  
  protected void a(char ☃, int ☃)
  {
    if ((g.m()) && (!z))
    {
      g.a(☃, ☃);
      K = g.b();
    }
    else if ((h.m()) && (z))
    {
      h.a(☃, ☃);
      J = h.b();
    }
    if ((☃ == 28) || (☃ == 156)) {
      a((avs)n.get(0));
    }
    n.get(0)).l = (g.b().length() > 0);
    
    a();
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    if (z) {
      h.a(☃, ☃, ☃);
    } else {
      g.a(☃, ☃, ☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(q, bnq.a("selectWorld.create", new Object[0]), l / 2, 20, -1);
    if (z)
    {
      c(q, bnq.a("selectWorld.enterSeed", new Object[0]), l / 2 - 100, 47, -6250336);
      c(q, bnq.a("selectWorld.seedInfo", new Object[0]), l / 2 - 100, 85, -6250336);
      if (C.m) {
        c(q, bnq.a("selectWorld.mapFeatures.info", new Object[0]), l / 2 - 150, 122, -6250336);
      }
      if (F.m) {
        c(q, bnq.a("selectWorld.allowCommands.info", new Object[0]), l / 2 - 150, 172, -6250336);
      }
      h.g();
      if (adr.a[L].h()) {
        q.a(bnq.a(adr.a[L].c(), new Object[0]), E.h + 2, E.i + 22, E.b(), 10526880);
      }
    }
    else
    {
      c(q, bnq.a("selectWorld.enterName", new Object[0]), l / 2 - 100, 47, -6250336);
      c(q, bnq.a("selectWorld.resultFolder", new Object[0]) + " " + i, l / 2 - 100, 85, -6250336);
      g.g();
      
      c(q, H, l / 2 - 100, 137, -6250336);
      c(q, I, l / 2 - 100, 149, -6250336);
    }
    super.a(☃, ☃, ☃);
  }
  
  public void a(ato ☃)
  {
    K = bnq.a("selectWorld.newWorld.copyOf", new Object[] { ☃.k() });
    J = (☃.b() + "");
    L = ☃.u().g();
    a = ☃.B();
    t = ☃.s();
    u = ☃.v();
    if (☃.t()) {
      r = "hardcore";
    } else if (☃.r().e()) {
      r = "survival";
    } else if (☃.r().d()) {
      r = "creative";
    }
  }
}
