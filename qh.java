import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class qh
  implements qc
{
  private final qf a;
  private final qb b;
  private final Map<Integer, Set<qd>> c = Maps.newHashMap();
  private final Map<String, Set<qd>> d = Maps.newHashMap();
  private final Map<UUID, qd> e = Maps.newHashMap();
  private double f;
  private boolean g = true;
  private double h;
  
  public qh(qf ☃, qb ☃)
  {
    a = ☃;
    b = ☃;
    f = ☃.b();
    for (int ☃ = 0; ☃ < 3; ☃++) {
      c.put(Integer.valueOf(☃), Sets.newHashSet());
    }
  }
  
  public qb a()
  {
    return b;
  }
  
  public double b()
  {
    return f;
  }
  
  public void a(double ☃)
  {
    if (☃ == b()) {
      return;
    }
    f = ☃;
    f();
  }
  
  public Collection<qd> a(int ☃)
  {
    return (Collection)c.get(Integer.valueOf(☃));
  }
  
  public Collection<qd> c()
  {
    Set<qd> ☃ = Sets.newHashSet();
    for (int ☃ = 0; ☃ < 3; ☃++) {
      ☃.addAll(a(☃));
    }
    return ☃;
  }
  
  public qd a(UUID ☃)
  {
    return (qd)e.get(☃);
  }
  
  public boolean a(qd ☃)
  {
    return e.get(☃.a()) != null;
  }
  
  public void b(qd ☃)
  {
    if (a(☃.a()) != null) {
      throw new IllegalArgumentException("Modifier is already applied on this attribute!");
    }
    Set<qd> ☃ = (Set)d.get(☃.b());
    if (☃ == null)
    {
      ☃ = Sets.newHashSet();
      d.put(☃.b(), ☃);
    }
    ((Set)c.get(Integer.valueOf(☃.c()))).add(☃);
    ☃.add(☃);
    e.put(☃.a(), ☃);
    
    f();
  }
  
  protected void f()
  {
    g = true;
    a.a(this);
  }
  
  public void c(qd ☃)
  {
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      Set<qd> ☃ = (Set)c.get(Integer.valueOf(☃));
      ☃.remove(☃);
    }
    Set<qd> ☃ = (Set)d.get(☃.b());
    if (☃ != null)
    {
      ☃.remove(☃);
      if (☃.isEmpty()) {
        d.remove(☃.b());
      }
    }
    e.remove(☃.a());
    f();
  }
  
  public void d()
  {
    Collection<qd> ☃ = c();
    if (☃ == null) {
      return;
    }
    ☃ = Lists.newArrayList(☃);
    for (qd ☃ : ☃) {
      c(☃);
    }
  }
  
  public double e()
  {
    if (g)
    {
      h = g();
      g = false;
    }
    return h;
  }
  
  private double g()
  {
    double ☃ = b();
    for (qd ☃ : b(0)) {
      ☃ += ☃.d();
    }
    double ☃ = ☃;
    for (qd ☃ : b(1)) {
      ☃ += ☃ * ☃.d();
    }
    for (qd ☃ : b(2)) {
      ☃ *= (1.0D + ☃.d());
    }
    return b.a(☃);
  }
  
  private Collection<qd> b(int ☃)
  {
    Set<qd> ☃ = Sets.newHashSet(a(☃));
    
    qb ☃ = b.d();
    while (☃ != null)
    {
      qc ☃ = a.a(☃);
      if (☃ != null) {
        ☃.addAll(☃.a(☃));
      }
      ☃ = ☃.d();
    }
    return ☃;
  }
}
