import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

public abstract class aqq
  extends any
{
  private aqs d;
  protected Map<Long, aqu> e = Maps.newHashMap();
  
  public abstract String a();
  
  protected final void a(adm ☃, final int ☃, final int ☃, int ☃, int ☃, ans ☃)
  {
    a(☃);
    if (this.e.containsKey(Long.valueOf(adg.a(☃, ☃)))) {
      return;
    }
    this.b.nextInt();
    try
    {
      if (a(☃, ☃))
      {
        aqu ☃ = b(☃, ☃);
        this.e.put(Long.valueOf(adg.a(☃, ☃)), ☃);
        a(☃, ☃, ☃);
      }
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Exception preparing structure feature");
      c ☃ = ☃.a("Feature being prepared");
      
      ☃.a("Is feature chunk", new Callable()
      {
        public String a()
          throws Exception
        {
          return aqq.this.a(☃, ☃) ? "True" : "False";
        }
      });
      ☃.a("Chunk location", String.format("%d,%d", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃) }));
      
      ☃.a("Chunk pos hash", new Callable()
      {
        public String a()
          throws Exception
        {
          return String.valueOf(adg.a(☃, ☃));
        }
      });
      ☃.a("Structure type", new Callable()
      {
        public String a()
          throws Exception
        {
          return aqq.this.getClass().getCanonicalName();
        }
      });
      throw new e(☃);
    }
  }
  
  public boolean a(adm ☃, Random ☃, adg ☃)
  {
    a(☃);
    
    int ☃ = (☃.a << 4) + 8;
    int ☃ = (☃.b << 4) + 8;
    
    boolean ☃ = false;
    for (aqu ☃ : this.e.values()) {
      if ((☃.d()) && (☃.a(☃)) && 
        (☃.a().a(☃, ☃, ☃ + 15, ☃ + 15)))
      {
        ☃.a(☃, ☃, new aqe(☃, ☃, ☃ + 15, ☃ + 15));
        ☃.b(☃);
        ☃ = true;
        
        a(☃.e(), ☃.f(), ☃);
      }
    }
    return ☃;
  }
  
  public boolean b(cj ☃)
  {
    a(this.c);
    return c(☃) != null;
  }
  
  protected aqu c(cj ☃)
  {
    for (aqu ☃ : this.e.values()) {
      if ((☃.d()) && 
        (☃.a().b(☃)))
      {
        Iterator<aqt> ☃ = ☃.b().iterator();
        while (☃.hasNext())
        {
          aqt ☃ = (aqt)☃.next();
          if (☃.c().b(☃)) {
            return ☃;
          }
        }
      }
    }
    return null;
  }
  
  public boolean a(adm ☃, cj ☃)
  {
    a(☃);
    for (aqu ☃ : this.e.values()) {
      if ((☃.d()) && 
        (☃.a().b(☃))) {
        return true;
      }
    }
    return false;
  }
  
  public cj b(adm ☃, cj ☃)
  {
    this.c = ☃;
    
    a(☃);
    
    this.b.setSeed(☃.J());
    long ☃ = this.b.nextLong();
    long ☃ = this.b.nextLong();
    long ☃ = (☃.n() >> 4) * ☃;
    long ☃ = (☃.p() >> 4) * ☃;
    this.b.setSeed(☃ ^ ☃ ^ ☃.J());
    
    a(☃, ☃.n() >> 4, ☃.p() >> 4, 0, 0, null);
    
    double ☃ = Double.MAX_VALUE;
    cj ☃ = null;
    for (aqu ☃ : this.e.values()) {
      if (☃.d())
      {
        aqt ☃ = (aqt)☃.b().get(0);
        cj ☃ = ☃.a();
        
        double ☃ = ☃.i(☃);
        if (☃ < ☃)
        {
          ☃ = ☃;
          ☃ = ☃;
        }
      }
    }
    if (☃ != null) {
      return ☃;
    }
    List<cj> ☃ = z_();
    if (☃ != null)
    {
      cj ☃ = null;
      for (cj ☃ : ☃)
      {
        double ☃ = ☃.i(☃);
        if (☃ < ☃)
        {
          ☃ = ☃;
          ☃ = ☃;
        }
      }
      return ☃;
    }
    return null;
  }
  
  protected List<cj> z_()
  {
    return null;
  }
  
  private void a(adm ☃)
  {
    dn ☃;
    if (this.d == null)
    {
      this.d = ((aqs)☃.a(aqs.class, a()));
      if (this.d == null)
      {
        this.d = new aqs(a());
        ☃.a(a(), this.d);
      }
      else
      {
        ☃ = this.d.a();
        for (String ☃ : ☃.c())
        {
          eb ☃ = ☃.a(☃);
          if (☃.a() == 10)
          {
            dn ☃ = (dn)☃;
            if ((☃.c("ChunkX")) && (☃.c("ChunkZ")))
            {
              int ☃ = ☃.f("ChunkX");
              int ☃ = ☃.f("ChunkZ");
              
              aqu ☃ = aqr.a(☃, ☃);
              if (☃ != null) {
                this.e.put(Long.valueOf(adg.a(☃, ☃)), ☃);
              }
            }
          }
        }
      }
    }
  }
  
  private void a(int ☃, int ☃, aqu ☃)
  {
    this.d.a(☃.a(☃, ☃), ☃, ☃);
    this.d.c();
  }
  
  protected abstract boolean a(int paramInt1, int paramInt2);
  
  protected abstract aqu b(int paramInt1, int paramInt2);
}
