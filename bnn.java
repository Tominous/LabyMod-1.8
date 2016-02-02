import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bnn
  implements bng
{
  private static final Logger a = ;
  private static final Joiner b = Joiner.on(", ");
  private final Map<String, bnb> c = Maps.newHashMap();
  private final List<bnj> d = Lists.newArrayList();
  private final Set<String> e = Sets.newLinkedHashSet();
  private final bny f;
  
  public bnn(bny ☃)
  {
    this.f = ☃;
  }
  
  public void a(bnk ☃)
  {
    for (String ☃ : ☃.c())
    {
      this.e.add(☃);
      bnb ☃ = (bnb)this.c.get(☃);
      if (☃ == null)
      {
        ☃ = new bnb(this.f);
        this.c.put(☃, ☃);
      }
      ☃.a(☃);
    }
  }
  
  public Set<String> a()
  {
    return this.e;
  }
  
  public bnh a(jy ☃)
    throws IOException
  {
    bni ☃ = (bni)this.c.get(☃.b());
    if (☃ != null) {
      return ☃.a(☃);
    }
    throw new FileNotFoundException(☃.toString());
  }
  
  public List<bnh> b(jy ☃)
    throws IOException
  {
    bni ☃ = (bni)this.c.get(☃.b());
    if (☃ != null) {
      return ☃.b(☃);
    }
    throw new FileNotFoundException(☃.toString());
  }
  
  private void b()
  {
    this.c.clear();
    this.e.clear();
  }
  
  public void a(List<bnk> ☃)
  {
    b();
    
    a.info("Reloading ResourceManager: " + b.join(Iterables.transform(☃, new Function()
    {
      public String a(bnk ☃)
      {
        return ☃.b();
      }
    })));
    for (bnk ☃ : ☃) {
      a(☃);
    }
    c();
  }
  
  public void a(bnj ☃)
  {
    this.d.add(☃);
    
    ☃.a(this);
  }
  
  private void c()
  {
    for (bnj ☃ : this.d) {
      ☃.a(this);
    }
  }
}
