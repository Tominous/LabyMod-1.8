import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bns
  implements bnj
{
  private static final Logger b = ;
  private final bny c;
  private String d;
  protected static final bnt a = new bnt();
  private Map<String, bnr> e = Maps.newHashMap();
  
  public bns(bny ☃, String ☃)
  {
    c = ☃;
    
    d = ☃;
    
    bnq.a(a);
  }
  
  public void a(List<bnk> ☃)
  {
    e.clear();
    for (bnk ☃ : ☃) {
      try
      {
        bog ☃ = (bog)☃.a(c, "language");
        if (☃ != null) {
          for (bnr ☃ : ☃.a()) {
            if (!e.containsKey(☃.a())) {
              e.put(☃.a(), ☃);
            }
          }
        }
      }
      catch (RuntimeException ☃)
      {
        b.warn("Unable to parse metadata section of resourcepack: " + ☃.b(), ☃);
      }
      catch (IOException ☃)
      {
        b.warn("Unable to parse metadata section of resourcepack: " + ☃.b(), ☃);
      }
    }
  }
  
  public void a(bni ☃)
  {
    List<String> ☃ = Lists.newArrayList(new String[] { "en_US" });
    if (!"en_US".equals(d)) {
      ☃.add(d);
    }
    a.a(☃, ☃);
    
    dj.a(aa);
  }
  
  public boolean a()
  {
    return a.a();
  }
  
  public boolean b()
  {
    return (c() != null) && (c().b());
  }
  
  public void a(bnr ☃)
  {
    d = ☃.a();
  }
  
  public bnr c()
  {
    return e.containsKey(d) ? (bnr)e.get(d) : (bnr)e.get("en_US");
  }
  
  public SortedSet<bnr> d()
  {
    return Sets.newTreeSet(e.values());
  }
}
