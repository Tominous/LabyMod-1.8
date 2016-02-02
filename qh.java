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
    this.a = ☃;
    this.b = ☃;
    this.f = ☃.b();
    for (int ☃ = 0; ☃ < 3; ☃++) {
      this.c.put(Integer.valueOf(☃), Sets.newHashSet());
    }
  }
  
  public qb a()
  {
    return this.b;
  }
  
  public double b()
  {
    return this.f;
  }
  
  public void a(double ☃)
  {
    if (☃ == b()) {
      return;
    }
    this.f = ☃;
    f();
  }
  
  public Collection<qd> a(int ☃)
  {
    return (Collection)this.c.get(Integer.valueOf(☃));
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
    return (qd)this.e.get(☃);
  }
  
  public boolean a(qd ☃)
  {
    return this.e.get(☃.a()) != null;
  }
  
  public void b(qd ☃)
  {
    if (a(☃.a()) != null) {
      throw new IllegalArgumentException("Modifier is already applied on this attribute!");
    }
    Set<qd> ☃ = (Set)this.d.get(☃.b());
    if (☃ == null)
    {
      ☃ = Sets.newHashSet();
      this.d.put(☃.b(), ☃);
    }
    ((Set)this.c.get(Integer.valueOf(☃.c()))).add(☃);
    ☃.add(☃);
    this.e.put(☃.a(), ☃);
    
    f();
  }
  
  protected void f()
  {
    this.g = true;
    this.a.a(this);
  }
  
  public void c(qd ☃)
  {
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      Set<qd> ☃ = (Set)this.c.get(Integer.valueOf(☃));
      ☃.remove(☃);
    }
    Set<qd> ☃ = (Set)this.d.get(☃.b());
    if (☃ != null)
    {
      ☃.remove(☃);
      if (☃.isEmpty()) {
        this.d.remove(☃.b());
      }
    }
    this.e.remove(☃.a());
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
    if (this.g)
    {
      this.h = g();
      this.g = false;
    }
    return this.h;
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
    return this.b.a(☃);
  }
  
  private Collection<qd> b(int ☃)
  {
    Set<qd> ☃ = Sets.newHashSet(a(☃));
    
    qb ☃ = this.b.d();
    while (☃ != null)
    {
      qc ☃ = this.a.a(☃);
      if (☃ != null) {
        ☃.addAll(☃.a(☃));
      }
      ☃ = ☃.d();
    }
    return ☃;
  }
}
