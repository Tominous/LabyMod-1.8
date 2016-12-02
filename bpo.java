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
    super(mcIn.O(), new File(v, a.getName()));
    l = mcIn;
    m = null;
  }
  
  public bpo(ave mcIn, String folderName, String worldName, adp settings)
  {
    super(new File(v, "saves"), mcIn.O(), new File(v, a.getName()));
    i(mcIn.L().c());
    j(folderName);
    k(worldName);
    b(mcIn.t());
    c(settings.c());
    c(256);
    a(new bpn(this));
    l = mcIn;
    m = (X() ? kx.a : settings);
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
      le overWorld = X() ? (le)new kx(this, var7, var8, 0, c).b() : (le)new WorldServerOF(this, var7, var8, 0, c).b();
      
      overWorld.a(m);
      
      Integer[] dimIds = (Integer[])Reflector.call(Reflector.DimensionManager_getStaticDimensionIDs, new Object[0]);
      Integer[] arr$ = dimIds;int len$ = arr$.length;
      for (int i$ = 0; i$ < len$; i$++)
      {
        int dim = arr$[i$].intValue();
        
        le world = dim == 0 ? overWorld : (le)new kz(this, var7, dim, overWorld, c).b();
        
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
        a(l.t.ay);
      }
    }
    else
    {
      d = new le[3];
      i = new long[d.length][100];
      
      a(U(), var7);
      if (var8 == null) {
        var8 = new ato(m, p_71247_2_);
      } else {
        var8.a(p_71247_2_);
      }
      for (int var9 = 0; var9 < d.length; var9++)
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
            d[var9] = ((le)new kx(this, var7, var8, var10, c).b());
          } else {
            d[var9] = ((le)new WorldServerOF(this, var7, var8, var10, c).b());
          }
          d[var9].a(m);
        }
        else
        {
          d[var9] = ((le)new kz(this, var7, var10, d[0], c).b());
        }
        d[var9].a(new lb(this, d[var9]));
      }
      ap().a(d);
      if (d[0].P().y() == null) {
        a(l.t.ay);
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
    a(U(), V(), m.d(), m.h(), m.j());
    l(S() + " - " + d[0].P().k());
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
    boolean var1 = n;
    n = ((ave.A().u() != null) && (ave.A().V()));
    if ((!var1) && (n))
    {
      k.info("Saving and pausing game...");
      ap().j();
      a(false);
    }
    if (n)
    {
      Queue var2 = j;
      synchronized (j)
      {
        while (!j.isEmpty()) {
          g.a((FutureTask)j.poll(), k);
        }
      }
    }
    else
    {
      super.A();
      if (l.t.c != ap().s())
      {
        k.info("Changing view distance to {}, from {}", new Object[] { Integer.valueOf(l.t.c), Integer.valueOf(ap().s()) });
        ap().a(l.t.c);
      }
      if (l.f != null)
      {
        ato var9 = d[0].P();
        ato var3 = l.f.P();
        if ((!var9.z()) && (var3.y() != var9.y()))
        {
          k.info("Changing difficulty to {}, from {}", new Object[] { var3.y(), var9.y() });
          a(var3.y());
        }
        else if ((var3.z()) && (!var9.z()))
        {
          k.info("Locking difficulty to {}", new Object[] { var3.y() });
          le[] var4 = d;
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
    return m.e();
  }
  
  public oj n()
  {
    if (l.f == null) {
      return l.t.ay;
    }
    return l.f.P().y();
  }
  
  public boolean o()
  {
    return m.f();
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
    return l.v;
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
    l.a(report);
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
        var1 = getServerModName();
        return ave.class.getSigners() == null ? "Very likely; Jar signature invalidated" : !var1.equals("vanilla") ? "Definitely; Server brand changed to '" + var1 + "'" : "Probably not. Jar signature remains and both client + server brands are untouched.";
      }
    });
    return report;
  }
  
  public void a(oj difficulty)
  {
    super.a(difficulty);
    if (l.f != null) {
      l.f.P().a(difficulty);
    }
  }
  
  public void a(or playerSnooper)
  {
    super.a(playerSnooper);
    playerSnooper.a("snooper_partner", l.I().f());
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
      o = true;
      p = new bpr(am(), var3 + "");
      p.start();
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
    if (p != null)
    {
      p.interrupt();
      p = null;
    }
  }
  
  public void w()
  {
    Futures.getUnchecked(a(new Runnable()
    {
      private static final String __OBFID = "CL_00002380";
      
      public void run()
      {
        ArrayList var1 = Lists.newArrayList(ap().v());
        Iterator var2 = var1.iterator();
        while (var2.hasNext())
        {
          lf var3 = (lf)var2.next();
          ap().e(var3);
        }
      }
    }));
    super.w();
    if (p != null)
    {
      p.interrupt();
      p = null;
    }
  }
  
  public void a()
  {
    x();
  }
  
  public boolean b()
  {
    return o;
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
