import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

public abstract class qf
{
  protected final Map<qb, qc> a = Maps.newHashMap();
  protected final Map<String, qc> b = new nk();
  protected final Multimap<qb, qb> c = HashMultimap.create();
  
  public qc a(qb ☃)
  {
    return (qc)a.get(☃);
  }
  
  public qc a(String ☃)
  {
    return (qc)b.get(☃);
  }
  
  public qc b(qb ☃)
  {
    if (b.containsKey(☃.a())) {
      throw new IllegalArgumentException("Attribute is already registered!");
    }
    qc ☃ = c(☃);
    b.put(☃.a(), ☃);
    a.put(☃, ☃);
    
    qb ☃ = ☃.d();
    while (☃ != null)
    {
      c.put(☃, ☃);
      ☃ = ☃.d();
    }
    return ☃;
  }
  
  protected abstract qc c(qb paramqb);
  
  public Collection<qc> a()
  {
    return b.values();
  }
  
  public void a(qc ☃) {}
  
  public void a(Multimap<String, qd> ☃)
  {
    for (Map.Entry<String, qd> ☃ : ☃.entries())
    {
      qc ☃ = a((String)☃.getKey());
      if (☃ != null) {
        ☃.c((qd)☃.getValue());
      }
    }
  }
  
  public void b(Multimap<String, qd> ☃)
  {
    for (Map.Entry<String, qd> ☃ : ☃.entries())
    {
      qc ☃ = a((String)☃.getKey());
      if (☃ != null)
      {
        ☃.c((qd)☃.getValue());
        ☃.b((qd)☃.getValue());
      }
    }
  }
}
