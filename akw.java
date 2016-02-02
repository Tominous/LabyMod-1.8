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
    return this.b;
  }
  
  public void a(adm ☃)
  {
    this.b = ☃;
  }
  
  public boolean t()
  {
    return this.b != null;
  }
  
  public void a(dn ☃)
  {
    this.c = new cj(☃.f("x"), ☃.f("y"), ☃.f("z"));
  }
  
  public void b(dn ☃)
  {
    String ☃ = (String)g.get(getClass());
    if (☃ == null) {
      throw new RuntimeException(getClass() + " is missing a mapping! This is a bug!");
    }
    ☃.a("id", ☃);
    ☃.a("x", this.c.n());
    ☃.a("y", this.c.o());
    ☃.a("z", this.c.p());
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
    if (this.h == -1)
    {
      alz ☃ = this.b.p(this.c);
      this.h = ☃.c().c(☃);
    }
    return this.h;
  }
  
  public void p_()
  {
    if (this.b != null)
    {
      alz ☃ = this.b.p(this.c);
      this.h = ☃.c().c(☃);
      this.b.b(this.c, this);
      if (w() != afi.a) {
        this.b.e(this.c, w());
      }
    }
  }
  
  public double a(double ☃, double ☃, double ☃)
  {
    double ☃ = this.c.n() + 0.5D - ☃;
    double ☃ = this.c.o() + 0.5D - ☃;
    double ☃ = this.c.p() + 0.5D - ☃;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public double s()
  {
    return 4096.0D;
  }
  
  public cj v()
  {
    return this.c;
  }
  
  public afh w()
  {
    if (this.e == null) {
      this.e = this.b.p(this.c).c();
    }
    return this.e;
  }
  
  public ff y_()
  {
    return null;
  }
  
  public boolean x()
  {
    return this.d;
  }
  
  public void y()
  {
    this.d = true;
  }
  
  public void D()
  {
    this.d = false;
  }
  
  public boolean c(int ☃, int ☃)
  {
    return false;
  }
  
  public void E()
  {
    this.e = null;
    this.h = -1;
  }
  
  public void a(c ☃)
  {
    ☃.a("Name", new Callable()
    {
      public String a()
        throws Exception
      {
        return (String)akw.G().get(akw.this.getClass()) + " // " + akw.this.getClass().getCanonicalName();
      }
    });
    if (this.b == null) {
      return;
    }
    c.a(☃, this.c, w(), u());
    
    ☃.a("Actual block type", new Callable()
    {
      public String a()
        throws Exception
      {
        int ☃ = afh.a(akw.this.b.p(akw.this.c).c());
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
        alz ☃ = akw.this.b.p(akw.this.c);
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
    this.c = ☃;
  }
  
  public boolean F()
  {
    return false;
  }
}
