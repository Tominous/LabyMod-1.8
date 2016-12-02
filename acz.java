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
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
    f = true;
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
    return a;
  }
  
  public zx b()
  {
    return b;
  }
  
  public boolean c()
  {
    return b != null;
  }
  
  public zx d()
  {
    return c;
  }
  
  public int e()
  {
    return d;
  }
  
  public int f()
  {
    return e;
  }
  
  public void g()
  {
    d += 1;
  }
  
  public void a(int ☃)
  {
    e += ☃;
  }
  
  public boolean h()
  {
    return d >= e;
  }
  
  public void i()
  {
    d = e;
  }
  
  public boolean j()
  {
    return f;
  }
  
  public void a(dn ☃)
  {
    dn ☃ = ☃.m("buy");
    a = zx.a(☃);
    dn ☃ = ☃.m("sell");
    c = zx.a(☃);
    if (☃.b("buyB", 10)) {
      b = zx.a(☃.m("buyB"));
    }
    if (☃.b("uses", 99)) {
      d = ☃.f("uses");
    }
    if (☃.b("maxUses", 99)) {
      e = ☃.f("maxUses");
    } else {
      e = 7;
    }
    if (☃.b("rewardExp", 1)) {
      f = ☃.n("rewardExp");
    } else {
      f = true;
    }
  }
  
  public dn k()
  {
    dn ☃ = new dn();
    ☃.a("buy", a.b(new dn()));
    ☃.a("sell", c.b(new dn()));
    if (b != null) {
      ☃.a("buyB", b.b(new dn()));
    }
    ☃.a("uses", d);
    ☃.a("maxUses", e);
    ☃.a("rewardExp", f);
    return ☃;
  }
}
