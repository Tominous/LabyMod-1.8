import com.google.common.collect.Lists;
import com.google.common.util.concurrent.Futures;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
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
  private static final String __OBFID = "CL_00001129";
  
  public bpo(ave mcIn)
  {
    super(mcIn.O(), new File(mcIn.v, a.getName()));
    this.l = mcIn;
    this.m = null;
  }
  
  public bpo(ave mcIn, String folderName, String worldName, adp settings)
  {
    super(new File(mcIn.v, "saves"), mcIn.O(), new File(mcIn.v, a.getName()));
    i(mcIn.L().c());
    j(folderName);
    k(worldName);
    b(mcIn.t());
    c(settings.c());
    c(256);
    a(new bpn(this));
    this.l = mcIn;
    this.m = (X() ? kx.a : settings);
  }
  
  protected bd h()
  {
    return new bpp();
  }
  
  protected void a(String p_71247_1_, String p_71247_2_, long seed, adr type, String p_71247_6_)
  {
    a(p_71247_1_);
    
    atp var7 = Y().a(p_71247_1_, true);
    ato var8 = var7.d();
    if (Reflector.DimensionManager.exists())
    {
      le overWorld = X() ? (le)new kx(this, var7, var8, 0, this.c).b() : (le)new WorldServerOF(this, var7, var8, 0, this.c).b();
      
      overWorld.a(this.m);
      
      Integer[] dimIds = (Integer[])Reflector.call(Reflector.DimensionManager_getStaticDimensionIDs, new Object[0]);
      Integer[] arr$ = dimIds;int len$ = arr$.length;
      for (int i$ = 0; i$ < len$; i$++)
      {
        int dim = arr$[i$].intValue();
        
        le world = dim == 0 ? overWorld : (le)new kz(this, var7, dim, overWorld, this.c).b();
        
        world.a(new lb(this, world));
        if (!T()) {
          world.P().a(m());
        }
        if (Reflector.EventBus.exists()) {
          Reflector.postForgeBusEvent(Reflector.WorldEvent_Load_Constructor, new Object[] { world });
        }
      }
      ap().a(new le[] { overWorld });
      if (overWorld.P().y() == null) {
        a(this.l.t.ay);
      }
    }
    else
    {
      this.d = new le[3];
      this.i = new long[this.d.length][100];
      
      a(U(), var7);
      if (var8 == null) {
        var8 = new ato(this.m, p_71247_2_);
      } else {
        var8.a(p_71247_2_);
      }
      for (int var9 = 0; var9 < this.d.length; var9++)
      {
        byte var10 = 0;
        if (var9 == 1) {
          var10 = -1;
        }
        if (var9 == 2) {
          var10 = 1;
        }
        if (var9 == 0)
        {
          if (X()) {
            this.d[var9] = ((le)new kx(this, var7, var8, var10, this.c).b());
          } else {
            this.d[var9] = ((le)new WorldServerOF(this, var7, var8, var10, this.c).b());
          }
          this.d[var9].a(this.m);
        }
        else
        {
          this.d[var9] = ((le)new kz(this, var7, var10, this.d[0], this.c).b());
        }
        this.d[var9].a(new lb(this, this.d[var9]));
      }
      ap().a(this.d);
      if (this.d[0].P().y() == null) {
        a(this.l.t.ay);
      }
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
    if (Reflector.FMLCommonHandler_handleServerAboutToStart.exists())
    {
      Object inst = Reflector.call(Reflector.FMLCommonHandler_instance, new Object[0]);
      if (!Reflector.callBoolean(inst, Reflector.FMLCommonHandler_handleServerAboutToStart, new Object[] { this })) {
        return false;
      }
    }
    a(U(), V(), this.m.d(), this.m.h(), this.m.j());
    l(S() + " - " + this.d[0].P().k());
    if (Reflector.FMLCommonHandler_handleServerStarting.exists())
    {
      Object inst = Reflector.call(Reflector.FMLCommonHandler_instance, new Object[0]);
      if (Reflector.FMLCommonHandler_handleServerStarting.getReturnType() == Boolean.TYPE) {
        return Reflector.callBoolean(inst, Reflector.FMLCommonHandler_handleServerStarting, new Object[] { this });
      }
      Reflector.callVoid(inst, Reflector.FMLCommonHandler_handleServerStarting, new Object[] { this });
    }
    return true;
  }
  
  public void A()
  {
    boolean var1 = this.n;
    this.n = ((ave.A().u() != null) && (ave.A().V()));
    if ((!var1) && (this.n))
    {
      k.info("Saving and pausing game...");
      ap().j();
      a(false);
    }
    if (this.n)
    {
      Queue var2 = this.j;
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
        ato var9 = this.d[0].P();
        ato var3 = this.l.f.P();
        if ((!var9.z()) && (var3.y() != var9.y()))
        {
          k.info("Changing difficulty to {}, from {}", new Object[] { var3.y(), var9.y() });
          a(var3.y());
        }
        else if ((var3.z()) && (!var9.z()))
        {
          k.info("Locking difficulty to {}", new Object[] { var3.y() });
          le[] var4 = this.d;
          int var5 = var4.length;
          for (int var6 = 0; var6 < var5; var6++)
          {
            le var7 = var4[var6];
            if (var7 != null) {
              var7.P().e(true);
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
    if (this.l.f == null) {
      return this.l.t.ay;
    }
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
  
  public boolean ai()
  {
    return false;
  }
  
  public boolean ae()
  {
    return false;
  }
  
  protected void a(b report)
  {
    this.l.a(report);
  }
  
  public b b(b report)
  {
    report = super.b(report);
    report.g().a("Type", new Callable()
    {
      private static final String __OBFID = "CL_00001130";
      
      public String a()
        throws Exception
      {
        return "Integrated Server (map_client.txt)";
      }
    });
    report.g().a("Is Modded", new Callable()
    {
      private static final String __OBFID = "CL_00001131";
      
      public String a()
        throws Exception
      {
        String var1 = ClientBrandRetriever.getClientModName();
        if (!var1.equals("vanilla")) {
          return "Definitely; Client brand changed to '" + var1 + "'";
        }
        var1 = bpo.this.getServerModName();
        return ave.class.getSigners() == null ? "Very likely; Jar signature invalidated" : !var1.equals("vanilla") ? "Definitely; Server brand changed to '" + var1 + "'" : "Probably not. Jar signature remains and both client + server brands are untouched.";
      }
    });
    return report;
  }
  
  public void a(oj difficulty)
  {
    super.a(difficulty);
    if (this.l.f != null) {
      this.l.f.P().a(difficulty);
    }
  }
  
  public void a(or playerSnooper)
  {
    super.a(playerSnooper);
    playerSnooper.a("snooper_partner", this.l.I().f());
  }
  
  public boolean ad()
  {
    return ave.A().ad();
  }
  
  public String a(adp.a type, boolean allowCheats)
  {
    try
    {
      int var3 = -1;
      try
      {
        var3 = nj.a();
      }
      catch (IOException var5) {}
      if (var3 <= 0) {
        var3 = 25564;
      }
      aq().a((InetAddress)null, var3);
      k.info("Started on " + var3);
      this.o = true;
      this.p = new bpr(am(), var3 + "");
      this.p.start();
      ap().a(type);
      ap().c(allowCheats);
      return var3 + "";
    }
    catch (IOException var6) {}
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
      private static final String __OBFID = "CL_00002380";
      
      public void run()
      {
        ArrayList var1 = Lists.newArrayList(bpo.this.ap().v());
        Iterator var2 = var1.iterator();
        while (var2.hasNext())
        {
          lf var3 = (lf)var2.next();
          bpo.this.ap().e(var3);
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
  
  public void a(adp.a gameMode)
  {
    ap().a(gameMode);
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
