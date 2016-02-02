public class acz
{
  private zx a;
  private zx b;
  private zx c;
  private int d;
  private int e;
  private boolean f;
  
  public acz(dn ☃)
  {
    a(☃);
  }
  
  public acz(zx ☃, zx ☃, zx ☃)
  {
    this(☃, ☃, ☃, 0, 7);
  }
  
  public acz(zx ☃, zx ☃, zx ☃, int ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
    this.f = true;
  }
  
  public acz(zx ☃, zx ☃)
  {
    this(☃, null, ☃);
  }
  
  public acz(zx ☃, zw ☃)
  {
    this(☃, new zx(☃));
  }
  
  public zx a()
  {
    return this.a;
  }
  
  public zx b()
  {
    return this.b;
  }
  
  public boolean c()
  {
    return this.b != null;
  }
  
  public zx d()
  {
    return this.c;
  }
  
  public int e()
  {
    return this.d;
  }
  
  public int f()
  {
    return this.e;
  }
  
  public void g()
  {
    this.d += 1;
  }
  
  public void a(int ☃)
  {
    this.e += ☃;
  }
  
  public boolean h()
  {
    return this.d >= this.e;
  }
  
  public void i()
  {
    this.d = this.e;
  }
  
  public boolean j()
  {
    return this.f;
  }
  
  public void a(dn ☃)
  {
    dn ☃ = ☃.m("buy");
    this.a = zx.a(☃);
    dn ☃ = ☃.m("sell");
    this.c = zx.a(☃);
    if (☃.b("buyB", 10)) {
      this.b = zx.a(☃.m("buyB"));
    }
    if (☃.b("uses", 99)) {
      this.d = ☃.f("uses");
    }
    if (☃.b("maxUses", 99)) {
      this.e = ☃.f("maxUses");
    } else {
      this.e = 7;
    }
    if (☃.b("rewardExp", 1)) {
      this.f = ☃.n("rewardExp");
    } else {
      this.f = true;
    }
  }
  
  public dn k()
  {
    dn ☃ = new dn();
    ☃.a("buy", this.a.b(new dn()));
    ☃.a("sell", this.c.b(new dn()));
    if (this.b != null) {
      ☃.a("buyB", this.b.b(new dn()));
    }
    ☃.a("uses", this.d);
    ☃.a("maxUses", this.e);
    ☃.a("rewardExp", this.f);
    return ☃;
  }
}
