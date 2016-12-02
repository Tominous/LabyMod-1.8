public class ow
{
  public static ow a = new ow("inFire").n();
  public static ow b = new ow("lightningBolt");
  public static ow c = new ow("onFire").k().n();
  public static ow d = new ow("lava").n();
  public static ow e = new ow("inWall").k();
  public static ow f = new ow("drown").k();
  public static ow g = new ow("starve").k().m();
  public static ow h = new ow("cactus");
  public static ow i = new ow("fall").k();
  public static ow j = new ow("outOfWorld").k().l();
  public static ow k = new ow("generic").k();
  public static ow l = new ow("magic").k().t();
  public static ow m = new ow("wither").k();
  public static ow n = new ow("anvil");
  public static ow o = new ow("fallingBlock");
  private boolean q;
  private boolean r;
  private boolean s;
  
  public static ow a(pr ☃)
  {
    return new ox("mob", ☃);
  }
  
  public static ow a(wn ☃)
  {
    return new ox("player", ☃);
  }
  
  public static ow a(wq ☃, pk ☃)
  {
    return new oy("arrow", ☃, ☃).b();
  }
  
  public static ow a(ws ☃, pk ☃)
  {
    if (☃ == null) {
      return new oy("onFire", ☃, ☃).n().b();
    }
    return new oy("fireball", ☃, ☃).n().b();
  }
  
  public static ow a(pk ☃, pk ☃)
  {
    return new oy("thrown", ☃, ☃).b();
  }
  
  public static ow b(pk ☃, pk ☃)
  {
    return new oy("indirectMagic", ☃, ☃).k().t();
  }
  
  public static ow a(pk ☃)
  {
    return new ox("thorns", ☃).v().t();
  }
  
  public static ow a(adi ☃)
  {
    if ((☃ != null) && (☃.c() != null)) {
      return new ox("explosion.player", ☃.c()).q().d();
    }
    return new ow("explosion").q().d();
  }
  
  private float t = 0.3F;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  public String p;
  
  public boolean a()
  {
    return this.v;
  }
  
  public ow b()
  {
    this.v = true;
    return this;
  }
  
  public boolean c()
  {
    return this.y;
  }
  
  public ow d()
  {
    this.y = true;
    return this;
  }
  
  public boolean e()
  {
    return this.q;
  }
  
  public float f()
  {
    return this.t;
  }
  
  public boolean g()
  {
    return this.r;
  }
  
  public boolean h()
  {
    return this.s;
  }
  
  protected ow(String ☃)
  {
    this.p = ☃;
  }
  
  public pk i()
  {
    return j();
  }
  
  public pk j()
  {
    return null;
  }
  
  protected ow k()
  {
    this.q = true;
    
    this.t = 0.0F;
    return this;
  }
  
  protected ow l()
  {
    this.r = true;
    return this;
  }
  
  protected ow m()
  {
    this.s = true;
    
    this.t = 0.0F;
    return this;
  }
  
  protected ow n()
  {
    this.u = true;
    return this;
  }
  
  public eu b(pr ☃)
  {
    pr ☃ = ☃.bt();
    String ☃ = "death.attack." + this.p;
    String ☃ = ☃ + ".player";
    if ((☃ != null) && (di.c(☃))) {
      return new fb(☃, new Object[] { ☃.f_(), ☃.f_() });
    }
    return new fb(☃, new Object[] { ☃.f_() });
  }
  
  public boolean o()
  {
    return this.u;
  }
  
  public String p()
  {
    return this.p;
  }
  
  public ow q()
  {
    this.w = true;
    return this;
  }
  
  public boolean r()
  {
    return this.w;
  }
  
  public boolean s()
  {
    return this.x;
  }
  
  public ow t()
  {
    this.x = true;
    return this;
  }
  
  public boolean u()
  {
    pk ☃ = j();
    if (((☃ instanceof wn)) && (((wn)☃).bA.d)) {
      return true;
    }
    return false;
  }
}
