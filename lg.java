import net.minecraft.server.MinecraftServer;

public class lg
{
  public adm a;
  public lf b;
  private adp.a c = adp.a.a;
  private boolean d;
  private int e;
  private cj f = cj.a;
  private int g;
  private boolean h;
  private cj i = cj.a;
  private int j;
  private int k = -1;
  
  public lg(adm ☃)
  {
    a = ☃;
  }
  
  public void a(adp.a ☃)
  {
    c = ☃;
    
    ☃.a(b.bA);
    
    b.t();
    b.b.ap().a(new gz(gz.a.b, new lf[] { b }));
  }
  
  public adp.a b()
  {
    return c;
  }
  
  public boolean c()
  {
    return c.e();
  }
  
  public boolean d()
  {
    return c.d();
  }
  
  public void b(adp.a ☃)
  {
    if (c == adp.a.a) {
      c = ☃;
    }
    a(c);
  }
  
  public void a()
  {
    g += 1;
    if (h)
    {
      int ☃ = g - j;
      afh ☃ = a.p(i).c();
      if (☃.t() == arm.a)
      {
        h = false;
      }
      else
      {
        float ☃ = ☃.a(b, b.o, i) * (☃ + 1);
        int ☃ = (int)(☃ * 10.0F);
        if (☃ != k)
        {
          a.c(b.F(), i, ☃);
          k = ☃;
        }
        if (☃ >= 1.0F)
        {
          h = false;
          b(i);
        }
      }
    }
    else if (d)
    {
      afh ☃ = a.p(f).c();
      if (☃.t() == arm.a)
      {
        a.c(b.F(), f, -1);
        k = -1;
        d = false;
      }
      else
      {
        int ☃ = g - e;
        float ☃ = ☃.a(b, b.o, i) * (☃ + 1);
        int ☃ = (int)(☃ * 10.0F);
        if (☃ != k)
        {
          a.c(b.F(), f, ☃);
          k = ☃;
        }
      }
    }
  }
  
  public void a(cj ☃, cq ☃)
  {
    if (d())
    {
      if (!a.a(null, ☃, ☃)) {
        b(☃);
      }
      return;
    }
    afh ☃ = a.p(☃).c();
    if (c.c())
    {
      if (c == adp.a.e) {
        return;
      }
      if (!b.cn())
      {
        zx ☃ = b.bZ();
        if (☃ == null) {
          return;
        }
        if (!☃.c(☃)) {
          return;
        }
      }
    }
    a.a(null, ☃, ☃);
    e = g;
    float ☃ = 1.0F;
    if (☃.t() != arm.a)
    {
      ☃.a(a, ☃, b);
      ☃ = ☃.a(b, b.o, ☃);
    }
    if ((☃.t() != arm.a) && (☃ >= 1.0F))
    {
      b(☃);
    }
    else
    {
      d = true;
      f = ☃;
      
      int ☃ = (int)(☃ * 10.0F);
      a.c(b.F(), ☃, ☃);
      k = ☃;
    }
  }
  
  public void a(cj ☃)
  {
    if (☃.equals(f))
    {
      int ☃ = g - e;
      
      afh ☃ = a.p(☃).c();
      if (☃.t() != arm.a)
      {
        float ☃ = ☃.a(b, b.o, ☃) * (☃ + 1);
        if (☃ >= 0.7F)
        {
          d = false;
          a.c(b.F(), ☃, -1);
          b(☃);
        }
        else if (!h)
        {
          d = false;
          h = true;
          i = ☃;
          j = e;
        }
      }
    }
  }
  
  public void e()
  {
    d = false;
    
    a.c(b.F(), f, -1);
  }
  
  private boolean c(cj ☃)
  {
    alz ☃ = a.p(☃);
    
    ☃.c().a(a, ☃, ☃, b);
    
    boolean ☃ = a.g(☃);
    if (☃) {
      ☃.c().d(a, ☃, ☃);
    }
    return ☃;
  }
  
  public boolean b(cj ☃)
  {
    if ((c.d()) && 
      (b.bA() != null) && ((b.bA().b() instanceof aay))) {
      return false;
    }
    alz ☃ = a.p(☃);
    akw ☃ = a.s(☃);
    if (c.c())
    {
      if (c == adp.a.e) {
        return false;
      }
      if (!b.cn())
      {
        zx ☃ = b.bZ();
        if (☃ == null) {
          return false;
        }
        if (!☃.c(☃.c())) {
          return false;
        }
      }
    }
    a.a(b, 2001, ☃, afh.f(☃));
    
    boolean ☃ = c(☃);
    if (d())
    {
      b.a.a(new fv(a, ☃));
    }
    else
    {
      zx ☃ = b.bZ();
      boolean ☃ = b.b(☃.c());
      if (☃ != null)
      {
        ☃.a(a, ☃.c(), ☃, b);
        if (b == 0) {
          b.ca();
        }
      }
      if ((☃) && (☃)) {
        ☃.c().a(a, b, ☃, ☃, ☃);
      }
    }
    return ☃;
  }
  
  public boolean a(wn ☃, adm ☃, zx ☃)
  {
    if (c == adp.a.e) {
      return false;
    }
    int ☃ = b;
    int ☃ = ☃.i();
    zx ☃ = ☃.a(☃, ☃);
    if ((☃ != ☃) || ((☃ != null) && ((b != ☃) || (☃.l() > 0) || (☃.i() != ☃))))
    {
      bi.a[bi.c] = ☃;
      if (d())
      {
        b = ☃;
        if (☃.e()) {
          ☃.b(☃);
        }
      }
      if (b == 0) {
        bi.a[bi.c] = null;
      }
      if (!☃.bS()) {
        ((lf)☃).a(bj);
      }
      return true;
    }
    return false;
  }
  
  public boolean a(wn ☃, adm ☃, zx ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (c == adp.a.e)
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof oo))
      {
        afh ☃ = ☃.p(☃).c();
        oo ☃ = (oo)☃;
        if (((☃ instanceof aky)) && ((☃ instanceof afs))) {
          ☃ = ((afs)☃).f(☃, ☃);
        }
        if (☃ != null)
        {
          ☃.a(☃);
          return true;
        }
      }
      else if ((☃ instanceof og))
      {
        ☃.a((og)☃);
        return true;
      }
      return false;
    }
    if ((!☃.av()) || (☃.bA() == null))
    {
      alz ☃ = ☃.p(☃);
      if (☃.c().a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃)) {
        return true;
      }
    }
    if (☃ == null) {
      return false;
    }
    if (d())
    {
      int ☃ = ☃.i();
      int ☃ = b;
      boolean ☃ = ☃.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      ☃.b(☃);
      b = ☃;
      return ☃;
    }
    return ☃.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(le ☃)
  {
    a = ☃;
  }
}
