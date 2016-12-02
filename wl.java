public class wl
{
  public boolean a;
  public boolean b;
  public boolean c;
  public boolean d;
  public boolean e = true;
  private float f = 0.05F;
  private float g = 0.1F;
  
  public void a(dn ☃)
  {
    dn ☃ = new dn();
    
    ☃.a("invulnerable", a);
    ☃.a("flying", b);
    ☃.a("mayfly", c);
    ☃.a("instabuild", d);
    ☃.a("mayBuild", e);
    ☃.a("flySpeed", f);
    ☃.a("walkSpeed", g);
    ☃.a("abilities", ☃);
  }
  
  public void b(dn ☃)
  {
    if (☃.b("abilities", 10))
    {
      dn ☃ = ☃.m("abilities");
      
      a = ☃.n("invulnerable");
      b = ☃.n("flying");
      c = ☃.n("mayfly");
      d = ☃.n("instabuild");
      if (☃.b("flySpeed", 99))
      {
        f = ☃.h("flySpeed");
        g = ☃.h("walkSpeed");
      }
      if (☃.b("mayBuild", 1)) {
        e = ☃.n("mayBuild");
      }
    }
  }
  
  public float a()
  {
    return f;
  }
  
  public void a(float ☃)
  {
    f = ☃;
  }
  
  public float b()
  {
    return g;
  }
  
  public void b(float ☃)
  {
    g = ☃;
  }
}
