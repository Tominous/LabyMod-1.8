import com.google.common.collect.Lists;
import com.google.common.util.concurrent.Futures;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bpo
  extends MinecraftServer
{
  private static final Logger k = ;
  private final ave l;
  private final adp m;
  private boolean n;
  private boolean o;
  private bpr p;
  
  public bpo(ave ☃)
  {
    super(☃.O(), new File(☃.v, a.getName()));
    this.l = ☃;
    this.m = null;
  }
  
  public bpo(ave ☃, String ☃, String ☃, adp ☃)
  {
    super(new File(☃.v, "saves"), ☃.O(), new File(☃.v, a.getName()));
    
    i(☃.L().c());
    j(☃);
    k(☃);
    b(☃.t());
    c(☃.c());
    c(256);
    a(new bpn(this));
    
    this.l = ☃;
    this.m = (X() ? kx.a : ☃);
  }
  
  protected bd h()
  {
    return new bpp();
  }
  
  protected void a(String ☃, String ☃, long ☃, adr ☃, String ☃)
  {
    a(☃);
    
    this.d = new le[3];
    this.i = new long[this.d.length][100];
    
    atp ☃ = Y().a(☃, true);
    a(U(), ☃);
    
    ato ☃ = ☃.d();
    if (☃ == null) {
      ☃ = new ato(this.m, ☃);
    } else {
      ☃.a(☃);
    }
    for (int ☃ = 0; ☃ < this.d.length; ☃++)
    {
      int ☃ = 0;
      if (☃ == 1) {
        ☃ = -1;
      }
      if (☃ == 2) {
        ☃ = 1;
      }
      if (☃ == 0)
      {
        if (X()) {
          this.d[☃] = ((le)new kx(this, ☃, ☃, ☃, this.c).b());
        } else {
          this.d[☃] = ((le)new le(this, ☃, ☃, ☃, this.c).b());
        }
        this.d[☃].a(this.m);
      }
      else
      {
        this.d[☃] = ((le)new kz(this, ☃, ☃, this.d[0], this.c).b());
      }
      this.d[☃].a(new lb(this, this.d[☃]));
    }
    ap().a(this.d);
    if (this.d[0].P().y() == null) {
      a(this.l.t.ay);
    }
    k();
  }
  
  protected boolean i()
    throws IOException
  {
    k.info("Starting integrated minecraft server version 1.8.8");
    
    d(true);
    e(true);
    f(true);
    g(true);
    h(true);
    
    k.info("Generating keypair");
    a(ng.b());
    
    a(U(), V(), this.m.d(), this.m.h(), this.m.j());
    l(S() + " - " + this.d[0].P().k());
    
    return true;
  }
  
  protected void A()
  {
    boolean ☃ = this.n;
    this.n = ((ave.A().u() != null) && (ave.A().V()));
    if ((!☃) && (this.n))
    {
      k.info("Saving and pausing game...");
      ap().j();
      a(false);
    }
    if (this.n)
    {
      synchronized (this.j)
      {
        while (!this.j.isEmpty()) {
          g.a((FutureTask)this.j.poll(), k);
        }
      }
    }
    else
    {
      super.A();
      if (this.l.t.c != ap().s())
      {
        k.info("Changing view distance to {}, from {}", new Object[] { Integer.valueOf(this.l.t.c), Integer.valueOf(ap().s()) });
        ap().a(this.l.t.c);
      }
      if (this.l.f != null)
      {
        ato ☃ = this.d[0].P();
        ato ☃ = this.l.f.P();
        if ((!☃.z()) && (☃.y() != ☃.y()))
        {
          k.info("Changing difficulty to {}, from {}", new Object[] { ☃.y(), ☃.y() });
          a(☃.y());
        }
        else if ((☃.z()) && (!☃.z()))
        {
          k.info("Locking difficulty to {}", new Object[] { ☃.y() });
          for (le ☃ : this.d) {
            if (☃ != null) {
              ☃.P().e(true);
            }
          }
        }
      }
    }
  }
  
  public boolean l()
  {
    return false;
  }
  
  public adp.a m()
  {
    return this.m.e();
  }
  
  public oj n()
  {
    return this.l.f.P().y();
  }
  
  public boolean o()
  {
    return this.m.f();
  }
  
  public boolean q()
  {
    return true;
  }
  
  public boolean r()
  {
    return true;
  }
  
  public File y()
  {
    return this.l.v;
  }
  
  public boolean ae()
  {
    return false;
  }
  
  public boolean ai()
  {
    return false;
  }
  
  protected void a(b ☃)
  {
    this.l.a(☃);
  }
  
  public b b(b ☃)
  {
    ☃ = super.b(☃);
    
    ☃.g().a("Type", new Callable()
    {
      public String a()
        throws Exception
      {
        return "Integrated Server (map_client.txt)";
      }
    });
    ☃.g().a("Is Modded", new Callable()
    {
      public String a()
        throws Exception
      {
        String ☃ = ClientBrandRetriever.getClientModName();
        if (!☃.equals("vanilla")) {
          return "Definitely; Client brand changed to '" + ☃ + "'";
        }
        ☃ = bpo.this.getServerModName();
        if (!☃.equals("vanilla")) {
          return "Definitely; Server brand changed to '" + ☃ + "'";
        }
        if (ave.class.getSigners() == null) {
          return "Very likely; Jar signature invalidated";
        }
        return "Probably not. Jar signature remains and both client + server brands are untouched.";
      }
    });
    return ☃;
  }
  
  public void a(oj ☃)
  {
    super.a(☃);
    if (this.l.f != null) {
      this.l.f.P().a(☃);
    }
  }
  
  public void a(or ☃)
  {
    super.a(☃);
    
    ☃.a("snooper_partner", this.l.I().f());
  }
  
  public boolean ad()
  {
    return ave.A().ad();
  }
  
  public String a(adp.a ☃, boolean ☃)
  {
    try
    {
      int ☃ = -1;
      try
      {
        ☃ = nj.a();
      }
      catch (IOException localIOException) {}
      if (☃ <= 0) {
        ☃ = 25564;
      }
      aq().a(null, ☃);
      k.info("Started on " + ☃);
      this.o = true;
      
      this.p = new bpr(am(), ☃ + "");
      this.p.start();
      
      ap().a(☃);
      ap().c(☃);
      
      return ☃ + "";
    }
    catch (IOException localIOException1) {}
    return null;
  }
  
  public void t()
  {
    super.t();
    if (this.p != null)
    {
      this.p.interrupt();
      this.p = null;
    }
  }
  
  public void w()
  {
    Futures.getUnchecked(a(new Runnable()
    {
      public void run()
      {
        List<lf> ☃ = Lists.newArrayList(bpo.this.ap().v());
        for (lf ☃ : ☃) {
          bpo.this.ap().e(☃);
        }
      }
    }));
    super.w();
    if (this.p != null)
    {
      this.p.interrupt();
      this.p = null;
    }
  }
  
  public void a()
  {
    x();
  }
  
  public boolean b()
  {
    return this.o;
  }
  
  public void a(adp.a ☃)
  {
    ap().a(☃);
  }
  
  public boolean al()
  {
    return true;
  }
  
  public int p()
  {
    return 4;
  }
}
