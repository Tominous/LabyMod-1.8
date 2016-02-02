import com.google.common.collect.Lists;
import java.io.File;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bdf
{
  private static final Logger a = ;
  private final ave b;
  private final List<bde> c = Lists.newArrayList();
  
  public bdf(ave ☃)
  {
    this.b = ☃;
    a();
  }
  
  public void a()
  {
    try
    {
      this.c.clear();
      
      dn ☃ = dx.a(new File(this.b.v, "servers.dat"));
      if (☃ == null) {
        return;
      }
      du ☃ = ☃.c("servers", 10);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
        this.c.add(bde.a(☃.b(☃)));
      }
    }
    catch (Exception ☃)
    {
      a.error("Couldn't load server list", ☃);
    }
  }
  
  public void b()
  {
    try
    {
      du ☃ = new du();
      for (bde ☃ : this.c) {
        ☃.a(☃.a());
      }
      dn ☃ = new dn();
      ☃.a("servers", ☃);
      dx.a(☃, new File(this.b.v, "servers.dat"));
    }
    catch (Exception ☃)
    {
      a.error("Couldn't save server list", ☃);
    }
  }
  
  public bde a(int ☃)
  {
    return (bde)this.c.get(☃);
  }
  
  public void b(int ☃)
  {
    this.c.remove(☃);
  }
  
  public void a(bde ☃)
  {
    this.c.add(☃);
  }
  
  public int c()
  {
    return this.c.size();
  }
  
  public void a(int ☃, int ☃)
  {
    bde ☃ = a(☃);
    this.c.set(☃, a(☃));
    this.c.set(☃, ☃);
    b();
  }
  
  public void a(int ☃, bde ☃)
  {
    this.c.set(☃, ☃);
  }
  
  public static void b(bde ☃)
  {
    bdf ☃ = new bdf(ave.A());
    ☃.a();
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      bde ☃ = ☃.a(☃);
      if ((☃.a.equals(☃.a)) && (☃.b.equals(☃.b)))
      {
        ☃.a(☃, ☃);
        break;
      }
    }
    ☃.b();
  }
}
