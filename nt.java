import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class nt
{
  private static final Logger b = ;
  private final List c;
  private final List d;
  public boolean a;
  private String e;
  private final Map f;
  private static final String __OBFID = "CL_00001497";
  public boolean profilerGlobalEnabled;
  private boolean profilerLocalEnabled;
  private static final String SCHEDULED_EXECUTABLES = "scheduledExecutables";
  private static final String TICK = "tick";
  private static final String PRE_RENDER_ERRORS = "preRenderErrors";
  private static final String RENDER = "render";
  private static final String DISPLAY = "display";
  
  public nt()
  {
    this.c = Lists.newArrayList();
    
    this.d = Lists.newArrayList();
    
    this.e = "";
    
    this.f = Maps.newHashMap();
    
    this.profilerGlobalEnabled = true;
    this.profilerLocalEnabled = this.profilerGlobalEnabled;
  }
  
  private static final int HASH_SCHEDULED_EXECUTABLES = "scheduledExecutables".hashCode();
  private static final int HASH_TICK = "tick".hashCode();
  private static final int HASH_PRE_RENDER_ERRORS = "preRenderErrors".hashCode();
  private static final int HASH_RENDER = "render".hashCode();
  private static final int HASH_DISPLAY = "display".hashCode();
  
  public void a()
  {
    this.f.clear();
    this.e = "";
    this.c.clear();
    
    this.profilerLocalEnabled = this.profilerGlobalEnabled;
  }
  
  public void a(String name)
  {
    if (Lagometer.isActive())
    {
      int hashName = name.hashCode();
      if ((hashName == HASH_SCHEDULED_EXECUTABLES) && (name.equals("scheduledExecutables")))
      {
        Lagometer.timerScheduledExecutables.start();
      }
      else if ((hashName == HASH_TICK) && (name.equals("tick")) && (Config.isMinecraftThread()))
      {
        Lagometer.timerScheduledExecutables.end();
        Lagometer.timerTick.start();
      }
      else if ((hashName == HASH_PRE_RENDER_ERRORS) && (name.equals("preRenderErrors")))
      {
        Lagometer.timerTick.end();
      }
    }
    if (Config.isFastRender())
    {
      int hashName = name.hashCode();
      if ((hashName == HASH_RENDER) && (name.equals("render"))) {
        bfl.clearEnabled = false;
      } else if ((hashName == HASH_DISPLAY) && (name.equals("display"))) {
        bfl.clearEnabled = true;
      }
    }
    if (!this.profilerLocalEnabled) {
      return;
    }
    if (this.a)
    {
      if (this.e.length() > 0) {
        this.e += ".";
      }
      this.e += name;
      this.c.add(this.e);
      this.d.add(Long.valueOf(System.nanoTime()));
    }
  }
  
  public void b()
  {
    if (!this.profilerLocalEnabled) {
      return;
    }
    if (this.a)
    {
      long var1 = System.nanoTime();
      long var3 = ((Long)this.d.remove(this.d.size() - 1)).longValue();
      this.c.remove(this.c.size() - 1);
      long var5 = var1 - var3;
      if (this.f.containsKey(this.e)) {
        this.f.put(this.e, Long.valueOf(((Long)this.f.get(this.e)).longValue() + var5));
      } else {
        this.f.put(this.e, Long.valueOf(var5));
      }
      if (var5 > 100000000L) {
        b.warn("Something's taking too long! '" + this.e + "' took aprox " + var5 / 1000000.0D + " ms");
      }
      this.e = (!this.c.isEmpty() ? (String)this.c.get(this.c.size() - 1) : "");
    }
  }
  
  public static final class a
    implements Comparable<a>
  {
    public double a;
    public double b;
    public String c;
    
    public a(String p_i1554_1_, double p_i1554_2_, double p_i1554_4_)
    {
      this.c = p_i1554_1_;
      this.a = p_i1554_2_;
      this.b = p_i1554_4_;
    }
    
    public int a(a p_compareTo_1_)
    {
      return p_compareTo_1_.a > this.a ? 1 : p_compareTo_1_.a < this.a ? -1 : p_compareTo_1_.c.compareTo(this.c);
    }
    
    public int a()
    {
      return (this.c.hashCode() & 0xAAAAAA) + 4473924;
    }
  }
  
  public List b(String p_76321_1_)
  {
    this.profilerLocalEnabled = this.profilerGlobalEnabled;
    if (!this.profilerLocalEnabled) {
      return new ArrayList(Arrays.asList(new nt.a[] { new nt.a("root", 0.0D, 0.0D) }));
    }
    if (!this.a) {
      return null;
    }
    long var3 = this.f.containsKey("root") ? ((Long)this.f.get("root")).longValue() : 0L;
    long var5 = this.f.containsKey(p_76321_1_) ? ((Long)this.f.get(p_76321_1_)).longValue() : -1L;
    ArrayList var7 = Lists.newArrayList();
    if (p_76321_1_.length() > 0) {
      p_76321_1_ = p_76321_1_ + ".";
    }
    long var8 = 0L;
    Iterator var10 = this.f.keySet().iterator();
    while (var10.hasNext())
    {
      String var11 = (String)var10.next();
      if ((var11.length() > p_76321_1_.length()) && (var11.startsWith(p_76321_1_)) && (var11.indexOf(".", p_76321_1_.length() + 1) < 0)) {
        var8 += ((Long)this.f.get(var11)).longValue();
      }
    }
    float var20 = (float)var8;
    if (var8 < var5) {
      var8 = var5;
    }
    if (var3 < var8) {
      var3 = var8;
    }
    Iterator var21 = this.f.keySet().iterator();
    while (var21.hasNext())
    {
      String var12 = (String)var21.next();
      if ((var12.length() > p_76321_1_.length()) && (var12.startsWith(p_76321_1_)) && (var12.indexOf(".", p_76321_1_.length() + 1) < 0))
      {
        long var13 = ((Long)this.f.get(var12)).longValue();
        double var15 = var13 * 100.0D / var8;
        double var17 = var13 * 100.0D / var3;
        String var19 = var12.substring(p_76321_1_.length());
        var7.add(new nt.a(var19, var15, var17));
      }
    }
    var21 = this.f.keySet().iterator();
    while (var21.hasNext())
    {
      String var12 = (String)var21.next();
      
      this.f.put(var12, Long.valueOf(((Long)this.f.get(var12)).longValue() * 950L / 1000L));
    }
    if ((float)var8 > var20) {
      var7.add(new nt.a("unspecified", ((float)var8 - var20) * 100.0D / var8, ((float)var8 - var20) * 100.0D / var3));
    }
    Collections.sort(var7);
    var7.add(0, new nt.a(p_76321_1_, 100.0D, var8 * 100.0D / var3));
    return var7;
  }
  
  public void c(String name)
  {
    if (!this.profilerLocalEnabled) {
      return;
    }
    b();
    a(name);
  }
  
  public String c()
  {
    return this.c.size() == 0 ? "[UNKNOWN]" : (String)this.c.get(this.c.size() - 1);
  }
}
