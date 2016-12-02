import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public class ato
{
  public static final oj a = oj.c;
  private long b;
  private adr c = adr.b;
  private String d = "";
  private int e;
  private int f;
  private int g;
  private long h;
  private long i;
  private long j;
  private long k;
  private dn l;
  private int m;
  private String n;
  private int o;
  private int p;
  private boolean q;
  private int r;
  private boolean s;
  private int t;
  private adp.a u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  private oj z;
  private boolean A;
  private double B = 0.0D;
  private double C = 0.0D;
  private double D = 6.0E7D;
  private long E = 0L;
  private double F = 0.0D;
  private double G = 5.0D;
  private double H = 0.2D;
  private int I = 5;
  private int J = 15;
  private adk K = new adk();
  
  protected ato() {}
  
  public ato(dn ☃)
  {
    b = ☃.g("RandomSeed");
    if (☃.b("generatorName", 8))
    {
      String ☃ = ☃.j("generatorName");
      c = adr.a(☃);
      if (c == null)
      {
        c = adr.b;
      }
      else if (c.f())
      {
        int ☃ = 0;
        if (☃.b("generatorVersion", 99)) {
          ☃ = ☃.f("generatorVersion");
        }
        c = c.a(☃);
      }
      if (☃.b("generatorOptions", 8)) {
        d = ☃.j("generatorOptions");
      }
    }
    u = adp.a.a(☃.f("GameType"));
    if (☃.b("MapFeatures", 99)) {
      v = ☃.n("MapFeatures");
    } else {
      v = true;
    }
    e = ☃.f("SpawnX");
    f = ☃.f("SpawnY");
    g = ☃.f("SpawnZ");
    h = ☃.g("Time");
    if (☃.b("DayTime", 99)) {
      i = ☃.g("DayTime");
    } else {
      i = h;
    }
    j = ☃.g("LastPlayed");
    k = ☃.g("SizeOnDisk");
    n = ☃.j("LevelName");
    o = ☃.f("version");
    p = ☃.f("clearWeatherTime");
    r = ☃.f("rainTime");
    q = ☃.n("raining");
    t = ☃.f("thunderTime");
    s = ☃.n("thundering");
    w = ☃.n("hardcore");
    if (☃.b("initialized", 99)) {
      y = ☃.n("initialized");
    } else {
      y = true;
    }
    if (☃.b("allowCommands", 99)) {
      x = ☃.n("allowCommands");
    } else {
      x = (u == adp.a.c);
    }
    if (☃.b("Player", 10))
    {
      l = ☃.m("Player");
      m = l.f("Dimension");
    }
    if (☃.b("GameRules", 10)) {
      K.a(☃.m("GameRules"));
    }
    if (☃.b("Difficulty", 99)) {
      z = oj.a(☃.d("Difficulty"));
    }
    if (☃.b("DifficultyLocked", 1)) {
      A = ☃.n("DifficultyLocked");
    }
    if (☃.b("BorderCenterX", 99)) {
      B = ☃.i("BorderCenterX");
    }
    if (☃.b("BorderCenterZ", 99)) {
      C = ☃.i("BorderCenterZ");
    }
    if (☃.b("BorderSize", 99)) {
      D = ☃.i("BorderSize");
    }
    if (☃.b("BorderSizeLerpTime", 99)) {
      E = ☃.g("BorderSizeLerpTime");
    }
    if (☃.b("BorderSizeLerpTarget", 99)) {
      F = ☃.i("BorderSizeLerpTarget");
    }
    if (☃.b("BorderSafeZone", 99)) {
      G = ☃.i("BorderSafeZone");
    }
    if (☃.b("BorderDamagePerBlock", 99)) {
      H = ☃.i("BorderDamagePerBlock");
    }
    if (☃.b("BorderWarningBlocks", 99)) {
      I = ☃.f("BorderWarningBlocks");
    }
    if (☃.b("BorderWarningTime", 99)) {
      J = ☃.f("BorderWarningTime");
    }
  }
  
  public ato(adp ☃, String ☃)
  {
    a(☃);
    n = ☃;
    z = a;
    y = false;
  }
  
  public void a(adp ☃)
  {
    b = ☃.d();
    u = ☃.e();
    v = ☃.g();
    w = ☃.f();
    c = ☃.h();
    d = ☃.j();
    x = ☃.i();
  }
  
  public ato(ato ☃)
  {
    b = b;
    c = c;
    d = d;
    u = u;
    v = v;
    e = e;
    f = f;
    g = g;
    h = h;
    i = i;
    j = j;
    k = k;
    l = l;
    m = m;
    n = n;
    o = o;
    r = r;
    q = q;
    t = t;
    s = s;
    w = w;
    x = x;
    y = y;
    K = K;
    z = z;
    A = A;
    B = B;
    C = C;
    D = D;
    E = E;
    F = F;
    G = G;
    H = H;
    J = J;
    I = I;
  }
  
  public dn a()
  {
    dn ☃ = new dn();
    
    a(☃, l);
    
    return ☃;
  }
  
  public dn a(dn ☃)
  {
    dn ☃ = new dn();
    a(☃, ☃);
    
    return ☃;
  }
  
  private void a(dn ☃, dn ☃)
  {
    ☃.a("RandomSeed", b);
    ☃.a("generatorName", c.a());
    ☃.a("generatorVersion", c.d());
    ☃.a("generatorOptions", d);
    ☃.a("GameType", u.a());
    ☃.a("MapFeatures", v);
    ☃.a("SpawnX", e);
    ☃.a("SpawnY", f);
    ☃.a("SpawnZ", g);
    ☃.a("Time", h);
    ☃.a("DayTime", i);
    ☃.a("SizeOnDisk", k);
    ☃.a("LastPlayed", MinecraftServer.az());
    ☃.a("LevelName", n);
    ☃.a("version", o);
    ☃.a("clearWeatherTime", p);
    ☃.a("rainTime", r);
    ☃.a("raining", q);
    ☃.a("thunderTime", t);
    ☃.a("thundering", s);
    ☃.a("hardcore", w);
    ☃.a("allowCommands", x);
    ☃.a("initialized", y);
    ☃.a("BorderCenterX", B);
    ☃.a("BorderCenterZ", C);
    ☃.a("BorderSize", D);
    ☃.a("BorderSizeLerpTime", E);
    ☃.a("BorderSafeZone", G);
    ☃.a("BorderDamagePerBlock", H);
    ☃.a("BorderSizeLerpTarget", F);
    ☃.a("BorderWarningBlocks", I);
    ☃.a("BorderWarningTime", J);
    if (z != null) {
      ☃.a("Difficulty", (byte)z.a());
    }
    ☃.a("DifficultyLocked", A);
    ☃.a("GameRules", K.a());
    if (☃ != null) {
      ☃.a("Player", ☃);
    }
  }
  
  public long b()
  {
    return b;
  }
  
  public int c()
  {
    return e;
  }
  
  public int d()
  {
    return f;
  }
  
  public int e()
  {
    return g;
  }
  
  public long f()
  {
    return h;
  }
  
  public long g()
  {
    return i;
  }
  
  public long h()
  {
    return k;
  }
  
  public dn i()
  {
    return l;
  }
  
  public void a(int ☃)
  {
    e = ☃;
  }
  
  public void b(int ☃)
  {
    f = ☃;
  }
  
  public void c(int ☃)
  {
    g = ☃;
  }
  
  public void b(long ☃)
  {
    h = ☃;
  }
  
  public void c(long ☃)
  {
    i = ☃;
  }
  
  public void a(cj ☃)
  {
    e = ☃.n();
    f = ☃.o();
    g = ☃.p();
  }
  
  public String k()
  {
    return n;
  }
  
  public void a(String ☃)
  {
    n = ☃;
  }
  
  public int l()
  {
    return o;
  }
  
  public void e(int ☃)
  {
    o = ☃;
  }
  
  public long m()
  {
    return j;
  }
  
  public int A()
  {
    return p;
  }
  
  public void i(int ☃)
  {
    p = ☃;
  }
  
  public boolean n()
  {
    return s;
  }
  
  public void a(boolean ☃)
  {
    s = ☃;
  }
  
  public int o()
  {
    return t;
  }
  
  public void f(int ☃)
  {
    t = ☃;
  }
  
  public boolean p()
  {
    return q;
  }
  
  public void b(boolean ☃)
  {
    q = ☃;
  }
  
  public int q()
  {
    return r;
  }
  
  public void g(int ☃)
  {
    r = ☃;
  }
  
  public adp.a r()
  {
    return u;
  }
  
  public boolean s()
  {
    return v;
  }
  
  public void f(boolean ☃)
  {
    v = ☃;
  }
  
  public void a(adp.a ☃)
  {
    u = ☃;
  }
  
  public boolean t()
  {
    return w;
  }
  
  public void g(boolean ☃)
  {
    w = ☃;
  }
  
  public adr u()
  {
    return c;
  }
  
  public void a(adr ☃)
  {
    c = ☃;
  }
  
  public String B()
  {
    return d;
  }
  
  public boolean v()
  {
    return x;
  }
  
  public void c(boolean ☃)
  {
    x = ☃;
  }
  
  public boolean w()
  {
    return y;
  }
  
  public void d(boolean ☃)
  {
    y = ☃;
  }
  
  public adk x()
  {
    return K;
  }
  
  public double C()
  {
    return B;
  }
  
  public double D()
  {
    return C;
  }
  
  public double E()
  {
    return D;
  }
  
  public void a(double ☃)
  {
    D = ☃;
  }
  
  public long F()
  {
    return E;
  }
  
  public void e(long ☃)
  {
    E = ☃;
  }
  
  public double G()
  {
    return F;
  }
  
  public void b(double ☃)
  {
    F = ☃;
  }
  
  public void c(double ☃)
  {
    C = ☃;
  }
  
  public void d(double ☃)
  {
    B = ☃;
  }
  
  public double H()
  {
    return G;
  }
  
  public void e(double ☃)
  {
    G = ☃;
  }
  
  public double I()
  {
    return H;
  }
  
  public void f(double ☃)
  {
    H = ☃;
  }
  
  public int J()
  {
    return I;
  }
  
  public int K()
  {
    return J;
  }
  
  public void j(int ☃)
  {
    I = ☃;
  }
  
  public void k(int ☃)
  {
    J = ☃;
  }
  
  public oj y()
  {
    return z;
  }
  
  public void a(oj ☃)
  {
    z = ☃;
  }
  
  public boolean z()
  {
    return A;
  }
  
  public void e(boolean ☃)
  {
    A = ☃;
  }
  
  public void a(c ☃)
  {
    ☃.a("Level seed", new Callable()
    {
      public String a()
        throws Exception
      {
        return String.valueOf(b());
      }
    });
    ☃.a("Level generator", new Callable()
    {
      public String a()
        throws Exception
      {
        return String.format("ID %02d - %s, ver %d. Features enabled: %b", new Object[] { Integer.valueOf(ato.a(ato.this).g()), ato.a(ato.this).a(), Integer.valueOf(ato.a(ato.this).d()), Boolean.valueOf(ato.b(ato.this)) });
      }
    });
    ☃.a("Level generator options", new Callable()
    {
      public String a()
        throws Exception
      {
        return ato.c(ato.this);
      }
    });
    ☃.a("Level spawn location", new Callable()
    {
      public String a()
        throws Exception
      {
        return c.a(ato.d(ato.this), ato.e(ato.this), ato.f(ato.this));
      }
    });
    ☃.a("Level time", new Callable()
    {
      public String a()
        throws Exception
      {
        return String.format("%d game time, %d day time", new Object[] { Long.valueOf(ato.g(ato.this)), Long.valueOf(ato.h(ato.this)) });
      }
    });
    ☃.a("Level dimension", new Callable()
    {
      public String a()
        throws Exception
      {
        return String.valueOf(ato.i(ato.this));
      }
    });
    ☃.a("Level storage version", new Callable()
    {
      public String a()
        throws Exception
      {
        String ☃ = "Unknown?";
        try
        {
          switch (ato.j(ato.this))
          {
          case 19133: 
            ☃ = "Anvil";
            break;
          case 19132: 
            ☃ = "McRegion";
          }
        }
        catch (Throwable localThrowable) {}
        return String.format("0x%05X - %s", new Object[] { Integer.valueOf(ato.j(ato.this)), ☃ });
      }
    });
    ☃.a("Level weather", new Callable()
    {
      public String a()
        throws Exception
      {
        return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", new Object[] { Integer.valueOf(ato.k(ato.this)), Boolean.valueOf(ato.l(ato.this)), Integer.valueOf(ato.m(ato.this)), Boolean.valueOf(ato.n(ato.this)) });
      }
    });
    ☃.a("Level game mode", new Callable()
    {
      public String a()
        throws Exception
      {
        return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", new Object[] { ato.o(ato.this).b(), Integer.valueOf(ato.o(ato.this).a()), Boolean.valueOf(ato.p(ato.this)), Boolean.valueOf(ato.q(ato.this)) });
      }
    });
  }
}
