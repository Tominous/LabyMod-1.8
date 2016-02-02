import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public class th
  extends ate
{
  private adm b;
  private final List<cj> c = Lists.newArrayList();
  private final List<te> d = Lists.newArrayList();
  private final List<tf> e = Lists.newArrayList();
  private int f;
  
  public th(String ☃)
  {
    super(☃);
  }
  
  public th(adm ☃)
  {
    super(a(☃.t));
    this.b = ☃;
    c();
  }
  
  public void a(adm ☃)
  {
    this.b = ☃;
    for (tf ☃ : this.e) {
      ☃.a(☃);
    }
  }
  
  public void a(cj ☃)
  {
    if (this.c.size() > 64) {
      return;
    }
    if (!e(☃)) {
      this.c.add(☃);
    }
  }
  
  public void a()
  {
    this.f += 1;
    for (tf ☃ : this.e) {
      ☃.a(this.f);
    }
    e();
    f();
    g();
    if (this.f % 400 == 0) {
      c();
    }
  }
  
  private void e()
  {
    for (Iterator<tf> ☃ = this.e.iterator(); ☃.hasNext();)
    {
      tf ☃ = (tf)☃.next();
      if (☃.g())
      {
        ☃.remove();
        c();
      }
    }
  }
  
  public List<tf> b()
  {
    return this.e;
  }
  
  public tf a(cj ☃, int ☃)
  {
    tf ☃ = null;
    double ☃ = 3.4028234663852886E38D;
    for (tf ☃ : this.e)
    {
      double ☃ = ☃.a().i(☃);
      if (☃ < ☃)
      {
        float ☃ = ☃ + ☃.b();
        if (☃ <= ☃ * ☃)
        {
          ☃ = ☃;
          ☃ = ☃;
        }
      }
    }
    return ☃;
  }
  
  private void f()
  {
    if (this.c.isEmpty()) {
      return;
    }
    b((cj)this.c.remove(0));
  }
  
  private void g()
  {
    for (int ☃ = 0; ☃ < this.d.size(); ☃++)
    {
      te ☃ = (te)this.d.get(☃);
      tf ☃ = a(☃.d(), 32);
      if (☃ == null)
      {
        ☃ = new tf(this.b);
        this.e.add(☃);
        c();
      }
      ☃.a(☃);
    }
    this.d.clear();
  }
  
  private void b(cj ☃)
  {
    int ☃ = 16;int ☃ = 4;int ☃ = 16;
    for (int ☃ = -☃; ☃ < ☃; ☃++) {
      for (int ☃ = -☃; ☃ < ☃; ☃++) {
        for (int ☃ = -☃; ☃ < ☃; ☃++)
        {
          cj ☃ = ☃.a(☃, ☃, ☃);
          if (f(☃))
          {
            te ☃ = c(☃);
            if (☃ == null) {
              d(☃);
            } else {
              ☃.a(this.f);
            }
          }
        }
      }
    }
  }
  
  private te c(cj ☃)
  {
    for (te ☃ : this.d) {
      if ((☃.d().n() == ☃.n()) && (☃.d().p() == ☃.p()) && (Math.abs(☃.d().o() - ☃.o()) <= 1)) {
        return ☃;
      }
    }
    for (tf ☃ : this.e)
    {
      te ☃ = ☃.e(☃);
      if (☃ != null) {
        return ☃;
      }
    }
    return null;
  }
  
  private void d(cj ☃)
  {
    cq ☃ = agh.h(this.b, ☃);
    cq ☃ = ☃.d();
    
    int ☃ = a(☃, ☃, 5);
    int ☃ = a(☃, ☃, ☃ + 1);
    if (☃ != ☃) {
      this.d.add(new te(☃, ☃ < ☃ ? ☃ : ☃, this.f));
    }
  }
  
  private int a(cj ☃, cq ☃, int ☃)
  {
    int ☃ = 0;
    for (int ☃ = 1; ☃ <= 5; ☃++) {
      if (this.b.i(☃.a(☃, ☃)))
      {
        ☃++;
        if (☃ >= ☃) {
          return ☃;
        }
      }
    }
    return ☃;
  }
  
  private boolean e(cj ☃)
  {
    for (cj ☃ : this.c) {
      if (☃.equals(☃)) {
        return true;
      }
    }
    return false;
  }
  
  private boolean f(cj ☃)
  {
    afh ☃ = this.b.p(☃).c();
    if ((☃ instanceof agh)) {
      return ☃.t() == arm.d;
    }
    return false;
  }
  
  public void a(dn ☃)
  {
    this.f = ☃.f("Tick");
    du ☃ = ☃.c("Villages", 10);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      tf ☃ = new tf();
      ☃.a(☃);
      this.e.add(☃);
    }
  }
  
  public void b(dn ☃)
  {
    ☃.a("Tick", this.f);
    du ☃ = new du();
    for (tf ☃ : this.e)
    {
      dn ☃ = new dn();
      ☃.b(☃);
      ☃.a(☃);
    }
    ☃.a("Villages", ☃);
  }
  
  public static String a(anm ☃)
  {
    return "villages" + ☃.l();
  }
}
