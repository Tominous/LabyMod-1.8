import java.util.Random;

public class alc
  extends alk
  implements og
{
  private static final Random f = new Random();
  private zx[] g = new zx[9];
  protected String a;
  
  public int o_()
  {
    return 9;
  }
  
  public zx a(int ☃)
  {
    return g[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (g[☃] != null)
    {
      if (g[☃].b <= ☃)
      {
        zx ☃ = g[☃];
        g[☃] = null;
        p_();
        return ☃;
      }
      zx ☃ = g[☃].a(☃);
      if (g[☃].b == 0) {
        g[☃] = null;
      }
      p_();
      return ☃;
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    if (g[☃] != null)
    {
      zx ☃ = g[☃];
      g[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public int m()
  {
    int ☃ = -1;
    int ☃ = 1;
    for (int ☃ = 0; ☃ < g.length; ☃++) {
      if ((g[☃] != null) && (f.nextInt(☃++) == 0)) {
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  public void a(int ☃, zx ☃)
  {
    g[☃] = ☃;
    if ((☃ != null) && (b > q_())) {
      b = q_();
    }
    p_();
  }
  
  public int a(zx ☃)
  {
    for (int ☃ = 0; ☃ < g.length; ☃++) {
      if ((g[☃] == null) || (g[☃].b() == null))
      {
        a(☃, ☃);
        return ☃;
      }
    }
    return -1;
  }
  
  public String e_()
  {
    return l_() ? a : "container.dispenser";
  }
  
  public void a(String ☃)
  {
    a = ☃;
  }
  
  public boolean l_()
  {
    return a != null;
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    du ☃ = ☃.c("Items", 10);
    g = new zx[o_()];
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot") & 0xFF;
      if ((☃ >= 0) && (☃ < g.length)) {
        g[☃] = zx.a(☃);
      }
    }
    if (☃.b("CustomName", 8)) {
      a = ☃.j("CustomName");
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    du ☃ = new du();
    for (int ☃ = 0; ☃ < g.length; ☃++) {
      if (g[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)☃);
        g[☃].b(☃);
        ☃.a(☃);
      }
    }
    ☃.a("Items", ☃);
    if (l_()) {
      ☃.a("CustomName", a);
    }
  }
  
  public int q_()
  {
    return 64;
  }
  
  public boolean a(wn ☃)
  {
    if (b.s(c) != this) {
      return false;
    }
    if (☃.e(c.n() + 0.5D, c.o() + 0.5D, c.p() + 0.5D) > 64.0D) {
      return false;
    }
    return true;
  }
  
  public void b(wn ☃) {}
  
  public void c(wn ☃) {}
  
  public boolean b(int ☃, zx ☃)
  {
    return true;
  }
  
  public String k()
  {
    return "minecraft:dispenser";
  }
  
  public xi a(wm ☃, wn ☃)
  {
    return new xr(☃, this);
  }
  
  public int a_(int ☃)
  {
    return 0;
  }
  
  public void b(int ☃, int ☃) {}
  
  public int g()
  {
    return 0;
  }
  
  public void l()
  {
    for (int ☃ = 0; ☃ < g.length; ☃++) {
      g[☃] = null;
    }
  }
}
