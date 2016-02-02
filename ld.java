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
    this.d = new amx(☃, 0, 0);
    
    this.i = ☃;
    this.f = ☃;
    this.e = ☃;
  }
  
  public boolean a(int ☃, int ☃)
  {
    return this.g.b(adg.a(☃, ☃));
  }
  
  public List<amy> a()
  {
    return this.h;
  }
  
  public void b(int ☃, int ☃)
  {
    if (this.i.t.e())
    {
      if (!this.i.c(☃, ☃)) {
        this.c.add(Long.valueOf(adg.a(☃, ☃)));
      }
    }
    else {
      this.c.add(Long.valueOf(adg.a(☃, ☃)));
    }
  }
  
  public void b()
  {
    for (amy ☃ : this.h) {
      b(☃.a, ☃.b);
    }
  }
  
  public amy c(int ☃, int ☃)
  {
    long ☃ = adg.a(☃, ☃);
    this.c.remove(Long.valueOf(☃));
    
    amy ☃ = (amy)this.g.a(☃);
    if (☃ == null)
    {
      ☃ = e(☃, ☃);
      if (☃ == null) {
        if (this.e == null) {
          ☃ = this.d;
        } else {
          try
          {
            ☃ = this.e.d(☃, ☃);
          }
          catch (Throwable ☃)
          {
            b ☃ = b.a(☃, "Exception generating new chunk");
            c ☃ = ☃.a("Chunk to be generated");
            
            ☃.a("Location", String.format("%d,%d", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃) }));
            ☃.a("Position hash", Long.valueOf(☃));
            ☃.a("Generator", this.e.f());
            
            throw new e(☃);
          }
        }
      }
      this.g.a(☃, ☃);
      this.h.add(☃);
      ☃.c();
      ☃.a(this, this, ☃, ☃);
    }
    return ☃;
  }
  
  public amy d(int ☃, int ☃)
  {
    amy ☃ = (amy)this.g.a(adg.a(☃, ☃));
    if (☃ == null)
    {
      if ((this.i.ad()) || (this.a)) {
        return c(☃, ☃);
      }
      return this.d;
    }
    return ☃;
  }
  
  private amy e(int ☃, int ☃)
  {
    if (this.f == null) {
      return null;
    }
    try
    {
      amy ☃ = this.f.a(this.i, ☃, ☃);
      if (☃ != null)
      {
        ☃.b(this.i.K());
        if (this.e != null) {
          this.e.a(☃, ☃, ☃);
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
    if (this.f == null) {
      return;
    }
    try
    {
      this.f.b(this.i, ☃);
    }
    catch (Exception ☃)
    {
      b.error("Couldn't save entities", ☃);
    }
  }
  
  private void b(amy ☃)
  {
    if (this.f == null) {
      return;
    }
    try
    {
      ☃.b(this.i.K());
      this.f.a(this.i, ☃);
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
      if (this.e != null)
      {
        this.e.a(☃, ☃, ☃);
        ☃.e();
      }
    }
  }
  
  public boolean a(amv ☃, amy ☃, int ☃, int ☃)
  {
    if ((this.e != null) && 
      (this.e.a(☃, ☃, ☃, ☃)))
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
    List<amy> ☃ = Lists.newArrayList(this.h);
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
    if (this.f != null) {
      this.f.b();
    }
  }
  
  public boolean d()
  {
    if (!this.i.c)
    {
      for (int ☃ = 0; ☃ < 100; ☃++) {
        if (!this.c.isEmpty())
        {
          Long ☃ = (Long)this.c.iterator().next();
          
          amy ☃ = (amy)this.g.a(☃.longValue());
          if (☃ != null)
          {
            ☃.d();
            b(☃);
            a(☃);
            this.g.d(☃.longValue());
            this.h.remove(☃);
          }
          this.c.remove(☃);
        }
      }
      if (this.f != null) {
        this.f.a();
      }
    }
    return this.e.d();
  }
  
  public boolean e()
  {
    return !this.i.c;
  }
  
  public String f()
  {
    return "ServerChunkCache: " + this.g.a() + " Drop: " + this.c.size();
  }
  
  public List<ady.c> a(pt ☃, cj ☃)
  {
    return this.e.a(☃, ☃);
  }
  
  public cj a(adm ☃, String ☃, cj ☃)
  {
    return this.e.a(☃, ☃, ☃);
  }
  
  public int g()
  {
    return this.g.a();
  }
  
  public void a(amy ☃, int ☃, int ☃) {}
  
  public amy a(cj ☃)
  {
    return d(☃.n() >> 4, ☃.p() >> 4);
  }
}
