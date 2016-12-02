import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ld
  implements amv
{
  private static final Logger b = ;
  private Set<Long> c = Collections.newSetFromMap(new ConcurrentHashMap());
  private amy d;
  private amv e;
  private and f;
  public boolean a = true;
  private nq<amy> g = new nq();
  private List<amy> h = Lists.newArrayList();
  private le i;
  
  public ld(le ☃, and ☃, amv ☃)
  {
    d = new amx(☃, 0, 0);
    
    i = ☃;
    f = ☃;
    e = ☃;
  }
  
  public boolean a(int ☃, int ☃)
  {
    return g.b(adg.a(☃, ☃));
  }
  
  public List<amy> a()
  {
    return h;
  }
  
  public void b(int ☃, int ☃)
  {
    if (i.t.e())
    {
      if (!i.c(☃, ☃)) {
        c.add(Long.valueOf(adg.a(☃, ☃)));
      }
    }
    else {
      c.add(Long.valueOf(adg.a(☃, ☃)));
    }
  }
  
  public void b()
  {
    for (amy ☃ : h) {
      b(a, b);
    }
  }
  
  public amy c(int ☃, int ☃)
  {
    long ☃ = adg.a(☃, ☃);
    c.remove(Long.valueOf(☃));
    
    amy ☃ = (amy)g.a(☃);
    if (☃ == null)
    {
      ☃ = e(☃, ☃);
      if (☃ == null) {
        if (e == null) {
          ☃ = d;
        } else {
          try
          {
            ☃ = e.d(☃, ☃);
          }
          catch (Throwable ☃)
          {
            b ☃ = b.a(☃, "Exception generating new chunk");
            c ☃ = ☃.a("Chunk to be generated");
            
            ☃.a("Location", String.format("%d,%d", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃) }));
            ☃.a("Position hash", Long.valueOf(☃));
            ☃.a("Generator", e.f());
            
            throw new e(☃);
          }
        }
      }
      g.a(☃, ☃);
      h.add(☃);
      ☃.c();
      ☃.a(this, this, ☃, ☃);
    }
    return ☃;
  }
  
  public amy d(int ☃, int ☃)
  {
    amy ☃ = (amy)g.a(adg.a(☃, ☃));
    if (☃ == null)
    {
      if ((i.ad()) || (a)) {
        return c(☃, ☃);
      }
      return d;
    }
    return ☃;
  }
  
  private amy e(int ☃, int ☃)
  {
    if (f == null) {
      return null;
    }
    try
    {
      amy ☃ = f.a(i, ☃, ☃);
      if (☃ != null)
      {
        ☃.b(i.K());
        if (e != null) {
          e.a(☃, ☃, ☃);
        }
      }
      return ☃;
    }
    catch (Exception ☃)
    {
      b.error("Couldn't load chunk", ☃);
    }
    return null;
  }
  
  private void a(amy ☃)
  {
    if (f == null) {
      return;
    }
    try
    {
      f.b(i, ☃);
    }
    catch (Exception ☃)
    {
      b.error("Couldn't save entities", ☃);
    }
  }
  
  private void b(amy ☃)
  {
    if (f == null) {
      return;
    }
    try
    {
      ☃.b(i.K());
      f.a(i, ☃);
    }
    catch (IOException ☃)
    {
      b.error("Couldn't save chunk", ☃);
    }
    catch (adn ☃)
    {
      b.error("Couldn't save chunk; already in use by another instance of Minecraft?", ☃);
    }
  }
  
  public void a(amv ☃, int ☃, int ☃)
  {
    amy ☃ = d(☃, ☃);
    if (!☃.t())
    {
      ☃.n();
      if (e != null)
      {
        e.a(☃, ☃, ☃);
        ☃.e();
      }
    }
  }
  
  public boolean a(amv ☃, amy ☃, int ☃, int ☃)
  {
    if ((e != null) && 
      (e.a(☃, ☃, ☃, ☃)))
    {
      amy ☃ = d(☃, ☃);
      ☃.e();
      return true;
    }
    return false;
  }
  
  public boolean a(boolean ☃, nu ☃)
  {
    int ☃ = 0;
    List<amy> ☃ = Lists.newArrayList(h);
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      amy ☃ = (amy)☃.get(☃);
      if (☃) {
        a(☃);
      }
      if (☃.a(☃))
      {
        b(☃);
        ☃.f(false);
        ☃++;
        if ((☃ == 24) && (!☃)) {
          return false;
        }
      }
    }
    return true;
  }
  
  public void c()
  {
    if (f != null) {
      f.b();
    }
  }
  
  public boolean d()
  {
    if (!i.c)
    {
      for (int ☃ = 0; ☃ < 100; ☃++) {
        if (!c.isEmpty())
        {
          Long ☃ = (Long)c.iterator().next();
          
          amy ☃ = (amy)g.a(☃.longValue());
          if (☃ != null)
          {
            ☃.d();
            b(☃);
            a(☃);
            g.d(☃.longValue());
            h.remove(☃);
          }
          c.remove(☃);
        }
      }
      if (f != null) {
        f.a();
      }
    }
    return e.d();
  }
  
  public boolean e()
  {
    return !i.c;
  }
  
  public String f()
  {
    return "ServerChunkCache: " + g.a() + " Drop: " + c.size();
  }
  
  public List<ady.c> a(pt ☃, cj ☃)
  {
    return e.a(☃, ☃);
  }
  
  public cj a(adm ☃, String ☃, cj ☃)
  {
    return e.a(☃, ☃, ☃);
  }
  
  public int g()
  {
    return g.a();
  }
  
  public void a(amy ☃, int ☃, int ☃) {}
  
  public amy a(cj ☃)
  {
    return d(☃.n() >> 4, ☃.p() >> 4);
  }
}
