import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public abstract class xi
{
  public List<zx> b = Lists.newArrayList();
  public List<yg> c = Lists.newArrayList();
  public int d;
  private short a;
  private int f = -1;
  private int g;
  private final Set<yg> h = Sets.newHashSet();
  protected List<xn> e = Lists.newArrayList();
  
  protected yg a(yg ☃)
  {
    e = c.size();
    c.add(☃);
    b.add(null);
    return ☃;
  }
  
  public void a(xn ☃)
  {
    if (e.contains(☃)) {
      throw new IllegalArgumentException("Listener already listening");
    }
    e.add(☃);
    
    ☃.a(this, a());
    b();
  }
  
  public void b(xn ☃)
  {
    e.remove(☃);
  }
  
  public List<zx> a()
  {
    List<zx> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < c.size(); ☃++) {
      ☃.add(((yg)c.get(☃)).d());
    }
    return ☃;
  }
  
  public void b()
  {
    for (int ☃ = 0; ☃ < c.size(); ☃++)
    {
      zx ☃ = ((yg)c.get(☃)).d();
      zx ☃ = (zx)b.get(☃);
      if (!zx.b(☃, ☃))
      {
        ☃ = ☃ == null ? null : ☃.k();
        b.set(☃, ☃);
        for (int ☃ = 0; ☃ < e.size(); ☃++) {
          ((xn)e.get(☃)).a(this, ☃, ☃);
        }
      }
    }
  }
  
  public boolean a(wn ☃, int ☃)
  {
    return false;
  }
  
  public yg a(og ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < c.size(); ☃++)
    {
      yg ☃ = (yg)c.get(☃);
      if (☃.a(☃, ☃)) {
        return ☃;
      }
    }
    return null;
  }
  
  public yg a(int ☃)
  {
    return (yg)c.get(☃);
  }
  
  public zx b(wn ☃, int ☃)
  {
    yg ☃ = (yg)c.get(☃);
    if (☃ != null) {
      return ☃.d();
    }
    return null;
  }
  
  public zx a(int ☃, int ☃, int ☃, wn ☃)
  {
    zx ☃ = null;
    wm ☃ = bi;
    if (☃ == 5)
    {
      int ☃ = g;
      g = c(☃);
      if (((☃ != 1) || (g != 2)) && (☃ != g))
      {
        d();
      }
      else if (☃.p() == null)
      {
        d();
      }
      else if (g == 0)
      {
        f = b(☃);
        if (a(f, ☃))
        {
          g = 1;
          h.clear();
        }
        else
        {
          d();
        }
      }
      else if (g == 1)
      {
        yg ☃ = (yg)c.get(☃);
        if ((☃ != null) && (a(☃, ☃.p(), true)) && (☃.a(☃.p())) && (pb > h.size()) && (b(☃))) {
          h.add(☃);
        }
      }
      else if (g == 2)
      {
        if (!h.isEmpty())
        {
          zx ☃ = ☃.p().k();
          int ☃ = pb;
          for (yg ☃ : h) {
            if ((☃ != null) && (a(☃, ☃.p(), true)) && (☃.a(☃.p())) && (pb >= h.size()) && (b(☃)))
            {
              zx ☃ = ☃.k();
              int ☃ = ☃.e() ? db : 0;
              a(h, f, ☃, ☃);
              if (b > ☃.c()) {
                b = ☃.c();
              }
              if (b > ☃.b(☃)) {
                b = ☃.b(☃);
              }
              ☃ -= b - ☃;
              ☃.d(☃);
            }
          }
          b = ☃;
          if (b <= 0) {
            ☃ = null;
          }
          ☃.b(☃);
        }
        d();
      }
      else
      {
        d();
      }
    }
    else if (g != 0)
    {
      d();
    }
    else if (((☃ == 0) || (☃ == 1)) && ((☃ == 0) || (☃ == 1)))
    {
      if (☃ == 64537)
      {
        if (☃.p() != null)
        {
          if (☃ == 0)
          {
            ☃.a(☃.p(), true);
            ☃.b(null);
          }
          if (☃ == 1)
          {
            ☃.a(☃.p().a(1), true);
            if (pb == 0) {
              ☃.b(null);
            }
          }
        }
      }
      else if (☃ == 1)
      {
        if (☃ < 0) {
          return null;
        }
        yg ☃ = (yg)c.get(☃);
        if ((☃ != null) && (☃.a(☃)))
        {
          zx ☃ = b(☃, ☃);
          if (☃ != null)
          {
            zw ☃ = ☃.b();
            ☃ = ☃.k();
            if ((☃.d() != null) && (☃.d().b() == ☃)) {
              a(☃, ☃, true, ☃);
            }
          }
        }
      }
      else
      {
        if (☃ < 0) {
          return null;
        }
        yg ☃ = (yg)c.get(☃);
        if (☃ != null)
        {
          zx ☃ = ☃.d();
          zx ☃ = ☃.p();
          if (☃ != null) {
            ☃ = ☃.k();
          }
          if (☃ == null)
          {
            if ((☃ != null) && (☃.a(☃)))
            {
              int ☃ = ☃ == 0 ? b : 1;
              if (☃ > ☃.b(☃)) {
                ☃ = ☃.b(☃);
              }
              if (b >= ☃) {
                ☃.d(☃.a(☃));
              }
              if (b == 0) {
                ☃.b(null);
              }
            }
          }
          else if (☃.a(☃)) {
            if (☃ == null)
            {
              int ☃ = ☃ == 0 ? b : (b + 1) / 2;
              zx ☃ = ☃.a(☃);
              
              ☃.b(☃);
              if (b == 0) {
                ☃.d(null);
              }
              ☃.a(☃, ☃.p());
            }
            else if (☃.a(☃))
            {
              if ((☃.b() != ☃.b()) || (☃.i() != ☃.i()) || (!zx.a(☃, ☃)))
              {
                if (b <= ☃.b(☃))
                {
                  ☃.d(☃);
                  ☃.b(☃);
                }
              }
              else
              {
                int ☃ = ☃ == 0 ? b : 1;
                if (☃ > ☃.b(☃) - b) {
                  ☃ = ☃.b(☃) - b;
                }
                if (☃ > ☃.c() - b) {
                  ☃ = ☃.c() - b;
                }
                ☃.a(☃);
                if (b == 0) {
                  ☃.b(null);
                }
                b += ☃;
              }
            }
            else if ((☃.b() == ☃.b()) && (☃.c() > 1) && ((!☃.f()) || (☃.i() == ☃.i())) && (zx.a(☃, ☃)))
            {
              int ☃ = b;
              if ((☃ > 0) && (☃ + b <= ☃.c()))
              {
                b += ☃;
                ☃ = ☃.a(☃);
                if (b == 0) {
                  ☃.d(null);
                }
                ☃.a(☃, ☃.p());
              }
            }
          }
          ☃.f();
        }
      }
    }
    else if ((☃ == 2) && (☃ >= 0) && (☃ < 9))
    {
      yg ☃ = (yg)c.get(☃);
      if (☃.a(☃))
      {
        zx ☃ = ☃.a(☃);
        boolean ☃ = (☃ == null) || ((d == ☃) && (☃.a(☃)));
        int ☃ = -1;
        if (!☃)
        {
          ☃ = ☃.j();
          ☃ |= ☃ > -1;
        }
        if ((☃.e()) && (☃))
        {
          zx ☃ = ☃.d();
          
          ☃.a(☃, ☃.k());
          if (((d == ☃) && (☃.a(☃))) || (☃ == null))
          {
            ☃.a(b);
            ☃.d(☃);
            ☃.a(☃, ☃);
          }
          else if (☃ > -1)
          {
            ☃.a(☃);
            ☃.a(b);
            ☃.d(null);
            ☃.a(☃, ☃);
          }
        }
        else if ((!☃.e()) && (☃ != null) && (☃.a(☃)))
        {
          ☃.a(☃, null);
          ☃.d(☃);
        }
      }
    }
    else if ((☃ == 3) && (bA.d) && (☃.p() == null) && (☃ >= 0))
    {
      yg ☃ = (yg)c.get(☃);
      if ((☃ != null) && (☃.e()))
      {
        zx ☃ = ☃.d().k();
        b = ☃.c();
        ☃.b(☃);
      }
    }
    else if ((☃ == 4) && (☃.p() == null) && (☃ >= 0))
    {
      yg ☃ = (yg)c.get(☃);
      if ((☃ != null) && (☃.e()) && (☃.a(☃)))
      {
        zx ☃ = ☃.a(☃ == 0 ? 1 : db);
        ☃.a(☃, ☃);
        ☃.a(☃, true);
      }
    }
    else if ((☃ == 6) && (☃ >= 0))
    {
      yg ☃ = (yg)c.get(☃);
      zx ☃ = ☃.p();
      if ((☃ != null) && ((☃ == null) || (!☃.e()) || (!☃.a(☃))))
      {
        int ☃ = ☃ == 0 ? 0 : c.size() - 1;
        int ☃ = ☃ == 0 ? 1 : -1;
        for (int ☃ = 0; ☃ < 2; ☃++) {
          for (int ☃ = ☃; (☃ >= 0) && (☃ < c.size()) && (b < ☃.c()); ☃ += ☃)
          {
            yg ☃ = (yg)c.get(☃);
            if ((☃.e()) && (a(☃, ☃, true)) && (☃.a(☃)) && (a(☃, ☃)) && (
              (☃ != 0) || (db != ☃.d().c())))
            {
              int ☃ = Math.min(☃.c() - b, db);
              zx ☃ = ☃.a(☃);
              b += ☃;
              if (b <= 0) {
                ☃.d(null);
              }
              ☃.a(☃, ☃);
            }
          }
        }
      }
      b();
    }
    return ☃;
  }
  
  public boolean a(zx ☃, yg ☃)
  {
    return true;
  }
  
  protected void a(int ☃, int ☃, boolean ☃, wn ☃)
  {
    a(☃, ☃, 1, ☃);
  }
  
  public void b(wn ☃)
  {
    wm ☃ = bi;
    if (☃.p() != null)
    {
      ☃.a(☃.p(), false);
      ☃.b(null);
    }
  }
  
  public void a(og ☃)
  {
    b();
  }
  
  public void a(int ☃, zx ☃)
  {
    a(☃).d(☃);
  }
  
  public void a(zx[] ☃)
  {
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      a(☃).d(☃[☃]);
    }
  }
  
  public void b(int ☃, int ☃) {}
  
  public short a(wm ☃)
  {
    a = ((short)(a + 1));
    return a;
  }
  
  private Set<wn> i = Sets.newHashSet();
  
  public boolean c(wn ☃)
  {
    return !i.contains(☃);
  }
  
  public void a(wn ☃, boolean ☃)
  {
    if (☃) {
      i.remove(☃);
    } else {
      i.add(☃);
    }
  }
  
  public abstract boolean a(wn paramwn);
  
  protected boolean a(zx ☃, int ☃, int ☃, boolean ☃)
  {
    boolean ☃ = false;
    
    int ☃ = ☃;
    if (☃) {
      ☃ = ☃ - 1;
    }
    if (☃.d()) {
      while ((b > 0) && (((!☃) && (☃ < ☃)) || ((☃) && (☃ >= ☃))))
      {
        yg ☃ = (yg)c.get(☃);
        zx ☃ = ☃.d();
        if ((☃ != null) && (☃.b() == ☃.b()) && ((!☃.f()) || (☃.i() == ☃.i())) && (zx.a(☃, ☃)))
        {
          int ☃ = b + b;
          if (☃ <= ☃.c())
          {
            b = 0;
            b = ☃;
            ☃.f();
            ☃ = true;
          }
          else if (b < ☃.c())
          {
            b -= ☃.c() - b;
            b = ☃.c();
            ☃.f();
            ☃ = true;
          }
        }
        if (☃) {
          ☃--;
        } else {
          ☃++;
        }
      }
    }
    if (b > 0)
    {
      if (☃) {
        ☃ = ☃ - 1;
      } else {
        ☃ = ☃;
      }
      while (((!☃) && (☃ < ☃)) || ((☃) && (☃ >= ☃)))
      {
        yg ☃ = (yg)c.get(☃);
        zx ☃ = ☃.d();
        if (☃ == null)
        {
          ☃.d(☃.k());
          ☃.f();
          b = 0;
          ☃ = true;
          break;
        }
        if (☃) {
          ☃--;
        } else {
          ☃++;
        }
      }
    }
    return ☃;
  }
  
  public static int b(int ☃)
  {
    return ☃ >> 2 & 0x3;
  }
  
  public static int c(int ☃)
  {
    return ☃ & 0x3;
  }
  
  public static int d(int ☃, int ☃)
  {
    return ☃ & 0x3 | (☃ & 0x3) << 2;
  }
  
  public static boolean a(int ☃, wn ☃)
  {
    if (☃ == 0) {
      return true;
    }
    if (☃ == 1) {
      return true;
    }
    if ((☃ == 2) && (bA.d)) {
      return true;
    }
    return false;
  }
  
  protected void d()
  {
    g = 0;
    h.clear();
  }
  
  public static boolean a(yg ☃, zx ☃, boolean ☃)
  {
    boolean ☃ = (☃ == null) || (!☃.e());
    if ((☃ != null) && (☃.e()) && (☃ != null) && (☃.a(☃.d())) && (zx.a(☃.d(), ☃))) {
      ☃ |= db + (☃ ? 0 : b) <= ☃.c();
    }
    return ☃;
  }
  
  public static void a(Set<yg> ☃, int ☃, zx ☃, int ☃)
  {
    switch (☃)
    {
    case 0: 
      b = ns.d(b / ☃.size());
      break;
    case 1: 
      b = 1;
      break;
    case 2: 
      b = ☃.b().j();
    }
    b += ☃;
  }
  
  public boolean b(yg ☃)
  {
    return true;
  }
  
  public static int a(akw ☃)
  {
    if ((☃ instanceof og)) {
      return b((og)☃);
    }
    return 0;
  }
  
  public static int b(og ☃)
  {
    if (☃ == null) {
      return 0;
    }
    int ☃ = 0;
    float ☃ = 0.0F;
    for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if (☃ != null)
      {
        ☃ += b / Math.min(☃.q_(), ☃.c());
        ☃++;
      }
    }
    ☃ /= ☃.o_();
    return ns.d(☃ * 14.0F) + (☃ > 0 ? 1 : 0);
  }
}
