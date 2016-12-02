import java.util.Arrays;
import java.util.List;

public class akx
  extends alk
  implements km, ot
{
  private static final int[] a = { 3 };
  private static final int[] f = { 0, 1, 2 };
  private zx[] g = new zx[4];
  private int h;
  private boolean[] i;
  private zw j;
  private String k;
  
  public String e_()
  {
    return l_() ? k : "container.brewing";
  }
  
  public boolean l_()
  {
    return (k != null) && (k.length() > 0);
  }
  
  public void a(String ☃)
  {
    k = ☃;
  }
  
  public int o_()
  {
    return g.length;
  }
  
  public void c()
  {
    if (h > 0)
    {
      h -= 1;
      if (h == 0)
      {
        o();
        p_();
      }
      else if (!n())
      {
        h = 0;
        p_();
      }
      else if (j != g[3].b())
      {
        h = 0;
        p_();
      }
    }
    else if (n())
    {
      h = 400;
      j = g[3].b();
    }
    if (!b.D)
    {
      boolean[] ☃ = m();
      if (!Arrays.equals(☃, i))
      {
        i = ☃;
        alz ☃ = b.p(v());
        if (!(☃.c() instanceof afl)) {
          return;
        }
        for (int ☃ = 0; ☃ < afl.a.length; ☃++) {
          ☃ = ☃.a(afl.a[☃], Boolean.valueOf(☃[☃]));
        }
        b.a(c, ☃, 2);
      }
    }
  }
  
  private boolean n()
  {
    if ((g[3] == null) || (g[3].b <= 0)) {
      return false;
    }
    zx ☃ = g[3];
    if (!☃.b().l(☃)) {
      return false;
    }
    boolean ☃ = false;
    for (int ☃ = 0; ☃ < 3; ☃++) {
      if ((g[☃] != null) && (g[☃].b() == zy.bz))
      {
        int ☃ = g[☃].i();
        int ☃ = c(☃, ☃);
        if ((!aai.f(☃)) && (aai.f(☃)))
        {
          ☃ = true;
          break;
        }
        List<pf> ☃ = zy.bz.e(☃);
        List<pf> ☃ = zy.bz.e(☃);
        if (((☃ <= 0) || (☃ != ☃)) && ((☃ == null) || ((!☃.equals(☃)) && (☃ != null)))) {
          if (☃ != ☃)
          {
            ☃ = true;
            break;
          }
        }
      }
    }
    return ☃;
  }
  
  private void o()
  {
    if (!n()) {
      return;
    }
    zx ☃ = g[3];
    for (int ☃ = 0; ☃ < 3; ☃++) {
      if ((g[☃] != null) && (g[☃].b() == zy.bz))
      {
        int ☃ = g[☃].i();
        int ☃ = c(☃, ☃);
        
        List<pf> ☃ = zy.bz.e(☃);
        List<pf> ☃ = zy.bz.e(☃);
        if (((☃ > 0) && (☃ == ☃)) || ((☃ != null) && ((☃.equals(☃)) || (☃ == null))))
        {
          if ((!aai.f(☃)) && (aai.f(☃))) {
            g[☃].b(☃);
          }
        }
        else if (☃ != ☃) {
          g[☃].b(☃);
        }
      }
    }
    if (☃.b().r())
    {
      g[3] = new zx(☃.b().q());
    }
    else
    {
      g[3].b -= 1;
      if (g[3].b <= 0) {
        g[3] = null;
      }
    }
  }
  
  private int c(int ☃, zx ☃)
  {
    if (☃ == null) {
      return ☃;
    }
    if (☃.b().l(☃)) {
      return abe.a(☃, ☃.b().j(☃));
    }
    return ☃;
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    du ☃ = ☃.c("Items", 10);
    g = new zx[o_()];
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot");
      if ((☃ >= 0) && (☃ < g.length)) {
        g[☃] = zx.a(☃);
      }
    }
    h = ☃.e("BrewTime");
    if (☃.b("CustomName", 8)) {
      k = ☃.j("CustomName");
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("BrewTime", (short)h);
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
      ☃.a("CustomName", k);
    }
  }
  
  public zx a(int ☃)
  {
    if ((☃ >= 0) && (☃ < g.length)) {
      return g[☃];
    }
    return null;
  }
  
  public zx a(int ☃, int ☃)
  {
    if ((☃ >= 0) && (☃ < g.length))
    {
      zx ☃ = g[☃];
      g[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    if ((☃ >= 0) && (☃ < g.length))
    {
      zx ☃ = g[☃];
      g[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    if ((☃ >= 0) && (☃ < g.length)) {
      g[☃] = ☃;
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
    if (☃ == 3) {
      return ☃.b().l(☃);
    }
    return (☃.b() == zy.bz) || (☃.b() == zy.bA);
  }
  
  public boolean[] m()
  {
    boolean[] ☃ = new boolean[3];
    for (int ☃ = 0; ☃ < 3; ☃++) {
      if (g[☃] != null) {
        ☃[☃] = true;
      }
    }
    return ☃;
  }
  
  public int[] a(cq ☃)
  {
    if (☃ == cq.b) {
      return a;
    }
    return f;
  }
  
  public boolean a(int ☃, zx ☃, cq ☃)
  {
    return b(☃, ☃);
  }
  
  public boolean b(int ☃, zx ☃, cq ☃)
  {
    return true;
  }
  
  public String k()
  {
    return "minecraft:brewing_stand";
  }
  
  public xi a(wm ☃, wn ☃)
  {
    return new xm(☃, this);
  }
  
  public int a_(int ☃)
  {
    switch (☃)
    {
    case 0: 
      return h;
    }
    return 0;
  }
  
  public void b(int ☃, int ☃)
  {
    switch (☃)
    {
    case 0: 
      h = ☃;
    }
  }
  
  public int g()
  {
    return 1;
  }
  
  public void l()
  {
    for (int ☃ = 0; ☃ < g.length; ☃++) {
      g[☃] = null;
    }
  }
}
