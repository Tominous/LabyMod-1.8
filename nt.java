import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import de.labystudio.modapi.ModAPI;
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
  
  private void labymod(String name)
  {
    if ((name.equals("litParticles")) && (ModAPI.enabled())) {
      ModAPI.callEvent(new RenderWorldEvent());
    }
  }
  
  public void a()
  {
    this.f.clear();
    this.e = "";
    this.c.clear();
  }
  
  public void a(String name)
  {
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
    if (this.a)
    {
      long i = System.nanoTime();
      long j = ((Long)this.d.remove(this.d.size() - 1)).longValue();
      this.c.remove(this.c.size() - 1);
      long k = i - j;
      if (this.f.containsKey(this.e)) {
        this.f.put(this.e, Long.valueOf(((Long)this.f.get(this.e)).longValue() + k));
      } else {
        this.f.put(this.e, Long.valueOf(k));
      }
      if (k > 100000000L) {
        b.warn("Something's taking too long! '" + this.e + "' took aprox " + k / 1000000.0D + " ms");
      }
      this.e = (!this.c.isEmpty() ? (String)this.c.get(this.c.size() - 1) : "");
    }
  }
  
  public List<nt.a> b(String p_76321_1_)
  {
    if (!this.a) {
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
    labymod(name);
    b();
    a(name);
  }
  
  public String c()
  {
    return this.c.size() == 0 ? "[UNKNOWN]" : (String)this.c.get(this.c.size() - 1);
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
}
