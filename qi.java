import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class qi
  extends qf
{
  private final Set<qc> e = Sets.newHashSet();
  protected final Map<String, qc> d = new nk();
  
  public qh e(qb ☃)
  {
    return (qh)super.a(☃);
  }
  
  public qh b(String ☃)
  {
    qc ☃ = super.a(☃);
    if (☃ == null) {
      ☃ = (qc)d.get(☃);
    }
    return (qh)☃;
  }
  
  public qc b(qb ☃)
  {
    qc ☃ = super.b(☃);
    if (((☃ instanceof qj)) && (((qj)☃).g() != null)) {
      d.put(((qj)☃).g(), ☃);
    }
    return ☃;
  }
  
  protected qc c(qb ☃)
  {
    return new qh(this, ☃);
  }
  
  public void a(qc ☃)
  {
    if (☃.a().c()) {
      e.add(☃);
    }
    for (qb ☃ : c.get(☃.a()))
    {
      qh ☃ = e(☃);
      if (☃ != null) {
        ☃.f();
      }
    }
  }
  
  public Set<qc> b()
  {
    return e;
  }
  
  public Collection<qc> c()
  {
    Set<qc> ☃ = Sets.newHashSet();
    for (qc ☃ : a()) {
      if (☃.a().c()) {
        ☃.add(☃);
      }
    }
    return ☃;
  }
}
