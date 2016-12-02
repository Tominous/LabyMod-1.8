import com.google.common.collect.Maps;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

public class or
{
  private final Map<String, Object> a = Maps.newHashMap();
  private final Map<String, Object> b = Maps.newHashMap();
  private final String c = UUID.randomUUID().toString();
  private final URL d;
  private final os e;
  private final Timer f = new Timer("Snooper Timer", true);
  private final Object g = new Object();
  private final long h;
  private boolean i;
  private int j;
  
  public or(String ☃, os ☃, long ☃)
  {
    try
    {
      d = new URL("http://snoop.minecraft.net/" + ☃ + "?version=" + 2);
    }
    catch (MalformedURLException ☃)
    {
      throw new IllegalArgumentException();
    }
    e = ☃;
    h = ☃;
  }
  
  public void a()
  {
    if (i) {
      return;
    }
    i = true;
    
    h();
    
    f.schedule(new TimerTask()
    {
      public void run()
      {
        if (!or.a(or.this).ad()) {
          return;
        }
        Map<String, Object> ☃;
        synchronized (or.b(or.this))
        {
          ☃ = Maps.newHashMap(or.c(or.this));
          if (or.d(or.this) == 0) {
            ☃.putAll(or.e(or.this));
          }
          ☃.put("snooper_count", Integer.valueOf(or.f(or.this)));
          ☃.put("snooper_token", or.g(or.this));
        }
        nj.a(or.h(or.this), ☃, true);
      }
    }, 0L, 900000L);
  }
  
  private void h()
  {
    i();
    
    a("snooper_token", c);
    b("snooper_token", c);
    b("os_name", System.getProperty("os.name"));
    b("os_version", System.getProperty("os.version"));
    b("os_architecture", System.getProperty("os.arch"));
    b("java_version", System.getProperty("java.version"));
    a("version", "1.8.8");
    
    e.b(this);
  }
  
  private void i()
  {
    RuntimeMXBean ☃ = ManagementFactory.getRuntimeMXBean();
    List<String> ☃ = ☃.getInputArguments();
    int ☃ = 0;
    for (String ☃ : ☃) {
      if (☃.startsWith("-X")) {
        a("jvm_arg[" + ☃++ + "]", ☃);
      }
    }
    a("jvm_args", Integer.valueOf(☃));
  }
  
  public void b()
  {
    b("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
    b("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
    b("memory_free", Long.valueOf(Runtime.getRuntime().freeMemory()));
    b("cpu_cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
    
    e.a(this);
  }
  
  public void a(String ☃, Object ☃)
  {
    synchronized (g)
    {
      b.put(☃, ☃);
    }
  }
  
  public void b(String ☃, Object ☃)
  {
    synchronized (g)
    {
      a.put(☃, ☃);
    }
  }
  
  public Map<String, String> c()
  {
    Map<String, String> ☃ = Maps.newLinkedHashMap();
    synchronized (g)
    {
      b();
      for (Map.Entry<String, Object> ☃ : a.entrySet()) {
        ☃.put(☃.getKey(), ☃.getValue().toString());
      }
      for (Map.Entry<String, Object> ☃ : b.entrySet()) {
        ☃.put(☃.getKey(), ☃.getValue().toString());
      }
    }
    return ☃;
  }
  
  public boolean d()
  {
    return i;
  }
  
  public void e()
  {
    f.cancel();
  }
  
  public String f()
  {
    return c;
  }
  
  public long g()
  {
    return h;
  }
}
