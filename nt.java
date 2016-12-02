import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.events.RenderMainEvent;
import de.labystudio.modapi.events.RenderWorldEvent;
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
  private final List<String> c = Lists.newArrayList();
  private final List<Long> d = Lists.newArrayList();
  public boolean a;
  private String e = "";
  private final Map<String, Long> f = Maps.newHashMap();
  
  public void a()
  {
    f.clear();
    e = "";
    c.clear();
  }
  
  public void a(String name)
  {
    if (a)
    {
      if (e.length() > 0) {
        e += ".";
      }
      e += name;
      c.add(e);
      d.add(Long.valueOf(System.nanoTime()));
    }
  }
  
  public void b()
  {
    if (a)
    {
      long i = System.nanoTime();
      long j = ((Long)d.remove(d.size() - 1)).longValue();
      c.remove(c.size() - 1);
      long k = i - j;
      if (f.containsKey(e)) {
        f.put(e, Long.valueOf(((Long)f.get(e)).longValue() + k));
      } else {
        f.put(e, Long.valueOf(k));
      }
      if (k > 100000000L) {
        b.warn("Something's taking too long! '" + e + "' took aprox " + k / 1000000.0D + " ms");
      }
      e = (!c.isEmpty() ? (String)c.get(c.size() - 1) : "");
    }
  }
  
  public List<nt.a> b(String p_76321_1_)
  {
    if (!a) {
      return null;
    }
    long i = this.f.containsKey("root") ? ((Long)this.f.get("root")).longValue() : 0L;
    long j = this.f.containsKey(p_76321_1_) ? ((Long)this.f.get(p_76321_1_)).longValue() : -1L;
    List<nt.a> list = Lists.newArrayList();
    if (p_76321_1_.length() > 0) {
      p_76321_1_ = p_76321_1_ + ".";
    }
    long k = 0L;
    for (Iterator localIterator = this.f.keySet().iterator(); localIterator.hasNext();)
    {
      s = (String)localIterator.next();
      if ((s.length() > p_76321_1_.length()) && (s.startsWith(p_76321_1_)) && (s.indexOf(".", p_76321_1_.length() + 1) < 0)) {
        k += ((Long)this.f.get(s)).longValue();
      }
    }
    String s;
    float f = (float)k;
    if (k < j) {
      k = j;
    }
    if (i < k) {
      i = k;
    }
    for (String s1 : this.f.keySet()) {
      if ((s1.length() > p_76321_1_.length()) && (s1.startsWith(p_76321_1_)) && (s1.indexOf(".", p_76321_1_.length() + 1) < 0))
      {
        long l = ((Long)this.f.get(s1)).longValue();
        double d0 = l * 100.0D / k;
        double d1 = l * 100.0D / i;
        String s2 = s1.substring(p_76321_1_.length());
        list.add(new nt.a(s2, d0, d1));
      }
    }
    for (String s3 : this.f.keySet()) {
      this.f.put(s3, Long.valueOf(((Long)this.f.get(s3)).longValue() * 999L / 1000L));
    }
    if ((float)k > f) {
      list.add(new nt.a("unspecified", ((float)k - f) * 100.0D / k, ((float)k - f) * 100.0D / i));
    }
    Collections.sort(list);
    list.add(0, new nt.a(p_76321_1_, 100.0D, k * 100.0D / i));
    return list;
  }
  
  public void c(String name)
  {
    if (ModAPI.enabled())
    {
      if (name.equals("outline")) {
        ModAPI.callEvent(new RenderWorldEvent());
      }
      if (name.equals("weather")) {
        ModAPI.callEvent(new RenderMainEvent());
      }
    }
    b();
    a(name);
  }
  
  public String c()
  {
    return c.size() == 0 ? "[UNKNOWN]" : (String)c.get(c.size() - 1);
  }
  
  public static final class a
    implements Comparable<a>
  {
    public double a;
    public double b;
    public String c;
    
    public a(String p_i1554_1_, double p_i1554_2_, double p_i1554_4_)
    {
      c = p_i1554_1_;
      a = p_i1554_2_;
      b = p_i1554_4_;
    }
    
    public int a(a p_compareTo_1_)
    {
      return a > a ? 1 : a < a ? -1 : c.compareTo(c);
    }
    
    public int a()
    {
      return (c.hashCode() & 0xAAAAAA) + 4473924;
    }
  }
}
