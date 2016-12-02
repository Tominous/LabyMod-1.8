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
    super(a(t));
    b = ☃;
    c();
  }
  
  public void a(adm ☃)
  {
    b = ☃;
    for (tf ☃ : e) {
      ☃.a(☃);
    }
  }
  
  public void a(cj ☃)
  {
    if (c.size() > 64) {
      return;
    }
    if (!e(☃)) {
      c.add(☃);
    }
  }
  
  public void a()
  {
    f += 1;
    for (tf ☃ : e) {
      ☃.a(f);
    }
    e();
    f();
    g();
    if (f % 400 == 0) {
      c();
    }
  }
  
  private void e()
  {
    for (Iterator<tf> ☃ = e.iterator(); ☃.hasNext();)
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
    return e;
  }
  
  public tf a(cj ☃, int ☃)
  {
    tf ☃ = null;
    double ☃ = 3.4028234663852886E38D;
    for (tf ☃ : e)
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
    if (c.isEmpty()) {
      return;
    }
    b((cj)c.remove(0));
  }
  
  private void g()
  {
    for (int ☃ = 0; ☃ < d.size(); ☃++)
    {
      te ☃ = (te)d.get(☃);
      tf ☃ = a(☃.d(), 32);
      if (☃ == null)
      {
        ☃ = new tf(b);
        e.add(☃);
        c();
      }
      ☃.a(☃);
    }
    d.clear();
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
              ☃.a(f);
            }
          }
        }
      }
    }
  }
  
  private te c(cj ☃)
  {
    for (te ☃ : d) {
      if ((☃.d().n() == ☃.n()) && (☃.d().p() == ☃.p()) && (Math.abs(☃.d().o() - ☃.o()) <= 1)) {
        return ☃;
      }
    }
    for (tf ☃ : e)
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
    cq ☃ = agh.h(b, ☃);
    cq ☃ = ☃.d();
    
    int ☃ = a(☃, ☃, 5);
    int ☃ = a(☃, ☃, ☃ + 1);
    if (☃ != ☃) {
      d.add(new te(☃, ☃ < ☃ ? ☃ : ☃, f));
    }
  }
  
  private int a(cj ☃, cq ☃, int ☃)
  {
    int ☃ = 0;
    for (int ☃ = 1; ☃ <= 5; ☃++) {
      if (b.i(☃.a(☃, ☃)))
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
    for (cj ☃ : c) {
      if (☃.equals(☃)) {
        return true;
      }
    }
    return false;
  }
  
  private boolean f(cj ☃)
  {
    afh ☃ = b.p(☃).c();
    if ((☃ instanceof agh)) {
      return ☃.t() == arm.d;
    }
    return false;
  }
  
  public void a(dn ☃)
  {
    f = ☃.f("Tick");
    du ☃ = ☃.c("Villages", 10);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      tf ☃ = new tf();
      ☃.a(☃);
      e.add(☃);
    }
  }
  
  public void b(dn ☃)
  {
    ☃.a("Tick", f);
    du ☃ = new du();
    for (tf ☃ : e)
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
