import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bcz
  implements amv
{
  private static final Logger a = ;
  private amy b;
  private nq<amy> c = new nq();
  private List<amy> d = Lists.newArrayList();
  private adm e;
  
  public bcz(adm ☃)
  {
    b = new amx(☃, 0, 0);
    
    e = ☃;
  }
  
  public boolean a(int ☃, int ☃)
  {
    return true;
  }
  
  public void b(int ☃, int ☃)
  {
    amy ☃ = d(☃, ☃);
    if (!☃.f()) {
      ☃.d();
    }
    c.d(adg.a(☃, ☃));
    d.remove(☃);
  }
  
  public amy c(int ☃, int ☃)
  {
    amy ☃ = new amy(e, ☃, ☃);
    c.a(adg.a(☃, ☃), ☃);
    d.add(☃);
    ☃.c(true);
    
    return ☃;
  }
  
  public amy d(int ☃, int ☃)
  {
    amy ☃ = (amy)c.a(adg.a(☃, ☃));
    if (☃ == null) {
      return b;
    }
    return ☃;
  }
  
  public boolean a(boolean ☃, nu ☃)
  {
    return true;
  }
  
  public void c() {}
  
  public boolean d()
  {
    long ☃ = System.currentTimeMillis();
    for (amy ☃ : d) {
      ☃.b(System.currentTimeMillis() - ☃ > 5L);
    }
    if (System.currentTimeMillis() - ☃ > 100L) {
      a.info("Warning: Clientside chunk ticking took {} ms", new Object[] { Long.valueOf(System.currentTimeMillis() - ☃) });
    }
    return false;
  }
  
  public boolean e()
  {
    return false;
  }
  
  public void a(amv ☃, int ☃, int ☃) {}
  
  public boolean a(amv ☃, amy ☃, int ☃, int ☃)
  {
    return false;
  }
  
  public String f()
  {
    return "MultiplayerChunkCache: " + c.a() + ", " + d.size();
  }
  
  public List<ady.c> a(pt ☃, cj ☃)
  {
    return null;
  }
  
  public cj a(adm ☃, String ☃, cj ☃)
  {
    return null;
  }
  
  public int g()
  {
    return d.size();
  }
  
  public void a(amy ☃, int ☃, int ☃) {}
  
  public amy a(cj ☃)
  {
    return d(☃.n() >> 4, ☃.p() >> 4);
  }
}
