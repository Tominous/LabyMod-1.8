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
    this.c = ☃;
    
    this.d = ☃;
    
    bnq.a(a);
  }
  
  public void a(List<bnk> ☃)
  {
    this.e.clear();
    for (bnk ☃ : ☃) {
      try
      {
        bog ☃ = (bog)☃.a(this.c, "language");
        if (☃ != null) {
          for (bnr ☃ : ☃.a()) {
            if (!this.e.containsKey(☃.a())) {
              this.e.put(☃.a(), ☃);
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
    if (!"en_US".equals(this.d)) {
      ☃.add(this.d);
    }
    a.a(☃, ☃);
    
    dj.a(a.a);
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
    this.d = ☃.a();
  }
  
  public bnr c()
  {
    return this.e.containsKey(this.d) ? (bnr)this.e.get(this.d) : (bnr)this.e.get("en_US");
  }
  
  public SortedSet<bnr> d()
  {
    return Sets.newTreeSet(this.e.values());
  }
}
