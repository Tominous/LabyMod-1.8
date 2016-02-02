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
    this.b = ☃.g("RandomSeed");
    if (☃.b("generatorName", 8))
    {
      String ☃ = ☃.j("generatorName");
      this.c = adr.a(☃);
      if (this.c == null)
      {
        this.c = adr.b;
      }
      else if (this.c.f())
      {
        int ☃ = 0;
        if (☃.b("generatorVersion", 99)) {
          ☃ = ☃.f("generatorVersion");
        }
        this.c = this.c.a(☃);
      }
      if (☃.b("generatorOptions", 8)) {
        this.d = ☃.j("generatorOptions");
      }
    }
    this.u = adp.a.a(☃.f("GameType"));
    if (☃.b("MapFeatures", 99)) {
      this.v = ☃.n("MapFeatures");
    } else {
      this.v = true;
    }
    this.e = ☃.f("SpawnX");
    this.f = ☃.f("SpawnY");
    this.g = ☃.f("SpawnZ");
    this.h = ☃.g("Time");
    if (☃.b("DayTime", 99)) {
      this.i = ☃.g("DayTime");
    } else {
      this.i = this.h;
    }
    this.j = ☃.g("LastPlayed");
    this.k = ☃.g("SizeOnDisk");
    this.n = ☃.j("LevelName");
    this.o = ☃.f("version");
    this.p = ☃.f("clearWeatherTime");
    this.r = ☃.f("rainTime");
    this.q = ☃.n("raining");
    this.t = ☃.f("thunderTime");
    this.s = ☃.n("thundering");
    this.w = ☃.n("hardcore");
    if (☃.b("initialized", 99)) {
      this.y = ☃.n("initialized");
    } else {
      this.y = true;
    }
    if (☃.b("allowCommands", 99)) {
      this.x = ☃.n("allowCommands");
    } else {
      this.x = (this.u == adp.a.c);
    }
    if (☃.b("Player", 10))
    {
      this.l = ☃.m("Player");
      this.m = this.l.f("Dimension");
    }
    if (☃.b("GameRules", 10)) {
      this.K.a(☃.m("GameRules"));
    }
    if (☃.b("Difficulty", 99)) {
      this.z = oj.a(☃.d("Difficulty"));
    }
    if (☃.b("DifficultyLocked", 1)) {
      this.A = ☃.n("DifficultyLocked");
    }
    if (☃.b("BorderCenterX", 99)) {
      this.B = ☃.i("BorderCenterX");
    }
    if (☃.b("BorderCenterZ", 99)) {
      this.C = ☃.i("BorderCenterZ");
    }
    if (☃.b("BorderSize", 99)) {
      this.D = ☃.i("BorderSize");
    }
    if (☃.b("BorderSizeLerpTime", 99)) {
      this.E = ☃.g("BorderSizeLerpTime");
    }
    if (☃.b("BorderSizeLerpTarget", 99)) {
      this.F = ☃.i("BorderSizeLerpTarget");
    }
    if (☃.b("BorderSafeZone", 99)) {
      this.G = ☃.i("BorderSafeZone");
    }
    if (☃.b("BorderDamagePerBlock", 99)) {
      this.H = ☃.i("BorderDamagePerBlock");
    }
    if (☃.b("BorderWarningBlocks", 99)) {
      this.I = ☃.f("BorderWarningBlocks");
    }
    if (☃.b("BorderWarningTime", 99)) {
      this.J = ☃.f("BorderWarningTime");
    }
  }
  
  public ato(adp ☃, String ☃)
  {
    a(☃);
    this.n = ☃;
    this.z = a;
    this.y = false;
  }
  
  public void a(adp ☃)
  {
    this.b = ☃.d();
    this.u = ☃.e();
    this.v = ☃.g();
    this.w = ☃.f();
    this.c = ☃.h();
    this.d = ☃.j();
    this.x = ☃.i();
  }
  
  public ato(ato ☃)
  {
    this.b = ☃.b;
    this.c = ☃.c;
    this.d = ☃.d;
    this.u = ☃.u;
    this.v = ☃.v;
    this.e = ☃.e;
    this.f = ☃.f;
    this.g = ☃.g;
    this.h = ☃.h;
    this.i = ☃.i;
    this.j = ☃.j;
    this.k = ☃.k;
    this.l = ☃.l;
    this.m = ☃.m;
    this.n = ☃.n;
    this.o = ☃.o;
    this.r = ☃.r;
    this.q = ☃.q;
    this.t = ☃.t;
    this.s = ☃.s;
    this.w = ☃.w;
    this.x = ☃.x;
    this.y = ☃.y;
    this.K = ☃.K;
    this.z = ☃.z;
    this.A = ☃.A;
    this.B = ☃.B;
    this.C = ☃.C;
    this.D = ☃.D;
    this.E = ☃.E;
    this.F = ☃.F;
    this.G = ☃.G;
    this.H = ☃.H;
    this.J = ☃.J;
    this.I = ☃.I;
  }
  
  public dn a()
  {
    dn ☃ = new dn();
    
    a(☃, this.l);
    
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
    ☃.a("RandomSeed", this.b);
    ☃.a("generatorName", this.c.a());
    ☃.a("generatorVersion", this.c.d());
    ☃.a("generatorOptions", this.d);
    ☃.a("GameType", this.u.a());
    ☃.a("MapFeatures", this.v);
    ☃.a("SpawnX", this.e);
    ☃.a("SpawnY", this.f);
    ☃.a("SpawnZ", this.g);
    ☃.a("Time", this.h);
    ☃.a("DayTime", this.i);
    ☃.a("SizeOnDisk", this.k);
    ☃.a("LastPlayed", MinecraftServer.az());
    ☃.a("LevelName", this.n);
    ☃.a("version", this.o);
    ☃.a("clearWeatherTime", this.p);
    ☃.a("rainTime", this.r);
    ☃.a("raining", this.q);
    ☃.a("thunderTime", this.t);
    ☃.a("thundering", this.s);
    ☃.a("hardcore", this.w);
    ☃.a("allowCommands", this.x);
    ☃.a("initialized", this.y);
    ☃.a("BorderCenterX", this.B);
    ☃.a("BorderCenterZ", this.C);
    ☃.a("BorderSize", this.D);
    ☃.a("BorderSizeLerpTime", this.E);
    ☃.a("BorderSafeZone", this.G);
    ☃.a("BorderDamagePerBlock", this.H);
    ☃.a("BorderSizeLerpTarget", this.F);
    ☃.a("BorderWarningBlocks", this.I);
    ☃.a("BorderWarningTime", this.J);
    if (this.z != null) {
      ☃.a("Difficulty", (byte)this.z.a());
    }
    ☃.a("DifficultyLocked", this.A);
    ☃.a("GameRules", this.K.a());
    if (☃ != null) {
      ☃.a("Player", ☃);
    }
  }
  
  public long b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.e;
  }
  
  public int d()
  {
    return this.f;
  }
  
  public int e()
  {
    return this.g;
  }
  
  public long f()
  {
    return this.h;
  }
  
  public long g()
  {
    return this.i;
  }
  
  public long h()
  {
    return this.k;
  }
  
  public dn i()
  {
    return this.l;
  }
  
  public void a(int ☃)
  {
    this.e = ☃;
  }
  
  public void b(int ☃)
  {
    this.f = ☃;
  }
  
  public void c(int ☃)
  {
    this.g = ☃;
  }
  
  public void b(long ☃)
  {
    this.h = ☃;
  }
  
  public void c(long ☃)
  {
    this.i = ☃;
  }
  
  public void a(cj ☃)
  {
    this.e = ☃.n();
    this.f = ☃.o();
    this.g = ☃.p();
  }
  
  public String k()
  {
    return this.n;
  }
  
  public void a(String ☃)
  {
    this.n = ☃;
  }
  
  public int l()
  {
    return this.o;
  }
  
  public void e(int ☃)
  {
    this.o = ☃;
  }
  
  public long m()
  {
    return this.j;
  }
  
  public int A()
  {
    return this.p;
  }
  
  public void i(int ☃)
  {
    this.p = ☃;
  }
  
  public boolean n()
  {
    return this.s;
  }
  
  public void a(boolean ☃)
  {
    this.s = ☃;
  }
  
  public int o()
  {
    return this.t;
  }
  
  public void f(int ☃)
  {
    this.t = ☃;
  }
  
  public boolean p()
  {
    return this.q;
  }
  
  public void b(boolean ☃)
  {
    this.q = ☃;
  }
  
  public int q()
  {
    return this.r;
  }
  
  public void g(int ☃)
  {
    this.r = ☃;
  }
  
  public adp.a r()
  {
    return this.u;
  }
  
  public boolean s()
  {
    return this.v;
  }
  
  public void f(boolean ☃)
  {
    this.v = ☃;
  }
  
  public void a(adp.a ☃)
  {
    this.u = ☃;
  }
  
  public boolean t()
  {
    return this.w;
  }
  
  public void g(boolean ☃)
  {
    this.w = ☃;
  }
  
  public adr u()
  {
    return this.c;
  }
  
  public void a(adr ☃)
  {
    this.c = ☃;
  }
  
  public String B()
  {
    return this.d;
  }
  
  public boolean v()
  {
    return this.x;
  }
  
  public void c(boolean ☃)
  {
    this.x = ☃;
  }
  
  public boolean w()
  {
    return this.y;
  }
  
  public void d(boolean ☃)
  {
    this.y = ☃;
  }
  
  public adk x()
  {
    return this.K;
  }
  
  public double C()
  {
    return this.B;
  }
  
  public double D()
  {
    return this.C;
  }
  
  public double E()
  {
    return this.D;
  }
  
  public void a(double ☃)
  {
    this.D = ☃;
  }
  
  public long F()
  {
    return this.E;
  }
  
  public void e(long ☃)
  {
    this.E = ☃;
  }
  
  public double G()
  {
    return this.F;
  }
  
  public void b(double ☃)
  {
    this.F = ☃;
  }
  
  public void c(double ☃)
  {
    this.C = ☃;
  }
  
  public void d(double ☃)
  {
    this.B = ☃;
  }
  
  public double H()
  {
    return this.G;
  }
  
  public void e(double ☃)
  {
    this.G = ☃;
  }
  
  public double I()
  {
    return this.H;
  }
  
  public void f(double ☃)
  {
    this.H = ☃;
  }
  
  public int J()
  {
    return this.I;
  }
  
  public int K()
  {
    return this.J;
  }
  
  public void j(int ☃)
  {
    this.I = ☃;
  }
  
  public void k(int ☃)
  {
    this.J = ☃;
  }
  
  public oj y()
  {
    return this.z;
  }
  
  public void a(oj ☃)
  {
    this.z = ☃;
  }
  
  public boolean z()
  {
    return this.A;
  }
  
  public void e(boolean ☃)
  {
    this.A = ☃;
  }
  
  public void a(c ☃)
  {
    ☃.a("Level seed", new Callable()
    {
      public String a()
        throws Exception
      {
        return String.valueOf(ato.this.b());
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
