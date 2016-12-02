import com.google.common.collect.Maps;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class akw
{
  private static final Logger a = ;
  private static Map<String, Class<? extends akw>> f = Maps.newHashMap();
  private static Map<Class<? extends akw>, String> g = Maps.newHashMap();
  protected adm b;
  
  private static void a(Class<? extends akw> ☃, String ☃)
  {
    if (f.containsKey(☃)) {
      throw new IllegalArgumentException("Duplicate id: " + ☃);
    }
    f.put(☃, ☃);
    g.put(☃, ☃);
  }
  
  static
  {
    a(alh.class, "Furnace");
    a(aky.class, "Chest");
    a(alf.class, "EnderChest");
    a(ahq.a.class, "RecordPlayer");
    a(alc.class, "Trap");
    a(ald.class, "Dropper");
    a(aln.class, "Sign");
    a(all.class, "MobSpawner");
    a(alm.class, "Music");
    a(alu.class, "Piston");
    a(akx.class, "Cauldron");
    a(ale.class, "EnchantTable");
    a(alp.class, "Airportal");
    a(akz.class, "Control");
    a(akv.class, "Beacon");
    a(alo.class, "Skull");
    a(alb.class, "DLDetector");
    a(alj.class, "Hopper");
    a(ala.class, "Comparator");
    a(alg.class, "FlowerPot");
    a(aku.class, "Banner");
  }
  
  protected cj c = cj.a;
  protected boolean d;
  private int h = -1;
  protected afh e;
  
  public adm z()
  {
    return b;
  }
  
  public void a(adm ☃)
  {
    b = ☃;
  }
  
  public boolean t()
  {
    return b != null;
  }
  
  public void a(dn ☃)
  {
    c = new cj(☃.f("x"), ☃.f("y"), ☃.f("z"));
  }
  
  public void b(dn ☃)
  {
    String ☃ = (String)g.get(getClass());
    if (☃ == null) {
      throw new RuntimeException(getClass() + " is missing a mapping! This is a bug!");
    }
    ☃.a("id", ☃);
    ☃.a("x", c.n());
    ☃.a("y", c.o());
    ☃.a("z", c.p());
  }
  
  public static akw c(dn ☃)
  {
    akw ☃ = null;
    try
    {
      Class<? extends akw> ☃ = (Class)f.get(☃.j("id"));
      if (☃ != null) {
        ☃ = (akw)☃.newInstance();
      }
    }
    catch (Exception ☃)
    {
      ☃.printStackTrace();
    }
    if (☃ != null) {
      ☃.a(☃);
    } else {
      a.warn("Skipping BlockEntity with id " + ☃.j("id"));
    }
    return ☃;
  }
  
  public int u()
  {
    if (h == -1)
    {
      alz ☃ = b.p(c);
      h = ☃.c().c(☃);
    }
    return h;
  }
  
  public void p_()
  {
    if (b != null)
    {
      alz ☃ = b.p(c);
      h = ☃.c().c(☃);
      b.b(c, this);
      if (w() != afi.a) {
        b.e(c, w());
      }
    }
  }
  
  public double a(double ☃, double ☃, double ☃)
  {
    double ☃ = c.n() + 0.5D - ☃;
    double ☃ = c.o() + 0.5D - ☃;
    double ☃ = c.p() + 0.5D - ☃;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public double s()
  {
    return 4096.0D;
  }
  
  public cj v()
  {
    return c;
  }
  
  public afh w()
  {
    if (e == null) {
      e = b.p(c).c();
    }
    return e;
  }
  
  public ff y_()
  {
    return null;
  }
  
  public boolean x()
  {
    return d;
  }
  
  public void y()
  {
    d = true;
  }
  
  public void D()
  {
    d = false;
  }
  
  public boolean c(int ☃, int ☃)
  {
    return false;
  }
  
  public void E()
  {
    e = null;
    h = -1;
  }
  
  public void a(c ☃)
  {
    ☃.a("Name", new Callable()
    {
      public String a()
        throws Exception
      {
        return (String)akw.G().get(getClass()) + " // " + getClass().getCanonicalName();
      }
    });
    if (b == null) {
      return;
    }
    c.a(☃, c, w(), u());
    
    ☃.a("Actual block type", new Callable()
    {
      public String a()
        throws Exception
      {
        int ☃ = afh.a(b.p(c).c());
        try
        {
          return String.format("ID #%d (%s // %s)", new Object[] { Integer.valueOf(☃), afh.c(☃).a(), afh.c(☃).getClass().getCanonicalName() });
        }
        catch (Throwable ☃) {}
        return "ID #" + ☃;
      }
    });
    ☃.a("Actual block data value", new Callable()
    {
      public String a()
        throws Exception
      {
        alz ☃ = b.p(c);
        int ☃ = ☃.c().c(☃);
        if (☃ < 0) {
          return "Unknown? (Got " + ☃ + ")";
        }
        String ☃ = String.format("%4s", new Object[] { Integer.toBinaryString(☃) }).replace(" ", "0");
        
        return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[] { Integer.valueOf(☃), ☃ });
      }
    });
  }
  
  public void a(cj ☃)
  {
    c = ☃;
  }
  
  public boolean F()
  {
    return false;
  }
}
