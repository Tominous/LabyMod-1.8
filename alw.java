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
    this.a = ☃;
    this.b = ☃;
    if (☃)
    {
      this.d = ☃;
      this.c = ☃.a(☃);
    }
    else
    {
      this.d = ☃.d();
      this.c = ☃.a(☃, 2);
    }
  }
  
  public boolean a()
  {
    this.e.clear();
    this.f.clear();
    
    afh ☃ = this.a.p(this.c).c();
    if (!als.a(☃, this.a, this.c, this.d, false))
    {
      if (☃.k() != 1) {
        return false;
      }
      this.f.add(this.c);
      return true;
    }
    if (!a(this.c)) {
      return false;
    }
    for (int ☃ = 0; ☃ < this.e.size(); ☃++)
    {
      cj ☃ = (cj)this.e.get(☃);
      if ((this.a.p(☃).c() == afi.cE) && 
        (!b(☃))) {
        return false;
      }
    }
    return true;
  }
  
  private boolean a(cj ☃)
  {
    afh ☃ = this.a.p(☃).c();
    if (☃.t() == arm.a) {
      return true;
    }
    if (!als.a(☃, this.a, ☃, this.d, false)) {
      return true;
    }
    if (☃.equals(this.b)) {
      return true;
    }
    if (this.e.contains(☃)) {
      return true;
    }
    int ☃ = 1;
    if (☃ + this.e.size() > 12) {
      return false;
    }
    while (☃ == afi.cE)
    {
      cj ☃ = ☃.a(this.d.d(), ☃);
      ☃ = this.a.p(☃).c();
      if ((☃.t() == arm.a) || (!als.a(☃, this.a, ☃, this.d, false)) || (☃.equals(this.b))) {
        break;
      }
      ☃++;
      if (☃ + this.e.size() > 12) {
        return false;
      }
    }
    int ☃ = 0;
    for (int ☃ = ☃ - 1; ☃ >= 0; ☃--)
    {
      this.e.add(☃.a(this.d.d(), ☃));
      ☃++;
    }
    for (int ☃ = 1;; ☃++)
    {
      cj ☃ = ☃.a(this.d, ☃);
      
      int ☃ = this.e.indexOf(☃);
      if (☃ > -1)
      {
        a(☃, ☃);
        for (int ☃ = 0; ☃ <= ☃ + ☃; ☃++)
        {
          cj ☃ = (cj)this.e.get(☃);
          if ((this.a.p(☃).c() == afi.cE) && 
            (!b(☃))) {
            return false;
          }
        }
        return true;
      }
      ☃ = this.a.p(☃).c();
      if (☃.t() == arm.a) {
        return true;
      }
      if ((!als.a(☃, this.a, ☃, this.d, true)) || (☃.equals(this.b))) {
        return false;
      }
      if (☃.k() == 1)
      {
        this.f.add(☃);
        return true;
      }
      if (this.e.size() >= 12) {
        return false;
      }
      this.e.add(☃);
      ☃++;
    }
  }
  
  private void a(int ☃, int ☃)
  {
    List<cj> ☃ = Lists.newArrayList();
    List<cj> ☃ = Lists.newArrayList();
    List<cj> ☃ = Lists.newArrayList();
    
    ☃.addAll(this.e.subList(0, ☃));
    ☃.addAll(this.e.subList(this.e.size() - ☃, this.e.size()));
    ☃.addAll(this.e.subList(☃, this.e.size() - ☃));
    
    this.e.clear();
    this.e.addAll(☃);
    this.e.addAll(☃);
    this.e.addAll(☃);
  }
  
  private boolean b(cj ☃)
  {
    for (cq ☃ : ) {
      if ((☃.k() != this.d.k()) && 
        (!a(☃.a(☃)))) {
        return false;
      }
    }
    return true;
  }
  
  public List<cj> c()
  {
    return this.e;
  }
  
  public List<cj> d()
  {
    return this.f;
  }
}
