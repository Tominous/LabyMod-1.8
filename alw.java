import com.google.common.collect.Lists;
import java.util.List;

public class alw
{
  private final adm a;
  private final cj b;
  private final cj c;
  private final cq d;
  private final List<cj> e = Lists.newArrayList();
  private final List<cj> f = Lists.newArrayList();
  
  public alw(adm ☃, cj ☃, cq ☃, boolean ☃)
  {
    a = ☃;
    b = ☃;
    if (☃)
    {
      d = ☃;
      c = ☃.a(☃);
    }
    else
    {
      d = ☃.d();
      c = ☃.a(☃, 2);
    }
  }
  
  public boolean a()
  {
    e.clear();
    f.clear();
    
    afh ☃ = a.p(c).c();
    if (!als.a(☃, a, c, d, false))
    {
      if (☃.k() != 1) {
        return false;
      }
      f.add(c);
      return true;
    }
    if (!a(c)) {
      return false;
    }
    for (int ☃ = 0; ☃ < e.size(); ☃++)
    {
      cj ☃ = (cj)e.get(☃);
      if ((a.p(☃).c() == afi.cE) && 
        (!b(☃))) {
        return false;
      }
    }
    return true;
  }
  
  private boolean a(cj ☃)
  {
    afh ☃ = a.p(☃).c();
    if (☃.t() == arm.a) {
      return true;
    }
    if (!als.a(☃, a, ☃, d, false)) {
      return true;
    }
    if (☃.equals(b)) {
      return true;
    }
    if (e.contains(☃)) {
      return true;
    }
    int ☃ = 1;
    if (☃ + e.size() > 12) {
      return false;
    }
    while (☃ == afi.cE)
    {
      cj ☃ = ☃.a(d.d(), ☃);
      ☃ = a.p(☃).c();
      if ((☃.t() == arm.a) || (!als.a(☃, a, ☃, d, false)) || (☃.equals(b))) {
        break;
      }
      ☃++;
      if (☃ + e.size() > 12) {
        return false;
      }
    }
    int ☃ = 0;
    for (int ☃ = ☃ - 1; ☃ >= 0; ☃--)
    {
      e.add(☃.a(d.d(), ☃));
      ☃++;
    }
    for (int ☃ = 1;; ☃++)
    {
      cj ☃ = ☃.a(d, ☃);
      
      int ☃ = e.indexOf(☃);
      if (☃ > -1)
      {
        a(☃, ☃);
        for (int ☃ = 0; ☃ <= ☃ + ☃; ☃++)
        {
          cj ☃ = (cj)e.get(☃);
          if ((a.p(☃).c() == afi.cE) && 
            (!b(☃))) {
            return false;
          }
        }
        return true;
      }
      ☃ = a.p(☃).c();
      if (☃.t() == arm.a) {
        return true;
      }
      if ((!als.a(☃, a, ☃, d, true)) || (☃.equals(b))) {
        return false;
      }
      if (☃.k() == 1)
      {
        f.add(☃);
        return true;
      }
      if (e.size() >= 12) {
        return false;
      }
      e.add(☃);
      ☃++;
    }
  }
  
  private void a(int ☃, int ☃)
  {
    List<cj> ☃ = Lists.newArrayList();
    List<cj> ☃ = Lists.newArrayList();
    List<cj> ☃ = Lists.newArrayList();
    
    ☃.addAll(e.subList(0, ☃));
    ☃.addAll(e.subList(e.size() - ☃, e.size()));
    ☃.addAll(e.subList(☃, e.size() - ☃));
    
    e.clear();
    e.addAll(☃);
    e.addAll(☃);
    e.addAll(☃);
  }
  
  private boolean b(cj ☃)
  {
    for (cq ☃ : ) {
      if ((☃.k() != d.k()) && 
        (!a(☃.a(☃)))) {
        return false;
      }
    }
    return true;
  }
  
  public List<cj> c()
  {
    return e;
  }
  
  public List<cj> d()
  {
    return f;
  }
}
