import com.google.common.collect.Lists;
import java.util.List;

public class afe$a
{
  private final adm b;
  private final cj c;
  private final afe d;
  private alz e;
  private final boolean f;
  private final List<cj> g = Lists.newArrayList();
  
  public afe$a(afe arg1, adm ☃, cj ☃, alz ☃)
  {
    b = ☃;
    c = ☃;
    e = ☃;
    d = ((afe)☃.c());
    afe.b ☃ = (afe.b)☃.b(???.n());
    f = d.a;
    a(☃);
  }
  
  private void a(afe.b ☃)
  {
    g.clear();
    switch (afe.1.a[☃.ordinal()])
    {
    case 1: 
      g.add(c.c());
      g.add(c.d());
      break;
    case 2: 
      g.add(c.e());
      g.add(c.f());
      break;
    case 3: 
      g.add(c.e());
      g.add(c.f().a());
      break;
    case 4: 
      g.add(c.e().a());
      g.add(c.f());
      break;
    case 5: 
      g.add(c.c().a());
      g.add(c.d());
      break;
    case 6: 
      g.add(c.c());
      g.add(c.d().a());
      break;
    case 7: 
      g.add(c.f());
      g.add(c.d());
      break;
    case 8: 
      g.add(c.e());
      g.add(c.d());
      break;
    case 9: 
      g.add(c.e());
      g.add(c.c());
      break;
    case 10: 
      g.add(c.f());
      g.add(c.c());
    }
  }
  
  private void c()
  {
    for (int ☃ = 0; ☃ < g.size(); ☃++)
    {
      a ☃ = b((cj)g.get(☃));
      if ((☃ == null) || (!☃.a(this))) {
        g.remove(☃--);
      } else {
        g.set(☃, c);
      }
    }
  }
  
  private boolean a(cj ☃)
  {
    return (afe.e(b, ☃)) || (afe.e(b, ☃.a())) || (afe.e(b, ☃.b()));
  }
  
  private a b(cj ☃)
  {
    cj ☃ = ☃;
    alz ☃ = b.p(☃);
    if (afe.d(☃)) {
      return new a(a, b, ☃, ☃);
    }
    ☃ = ☃.a();
    ☃ = b.p(☃);
    if (afe.d(☃)) {
      return new a(a, b, ☃, ☃);
    }
    ☃ = ☃.b();
    ☃ = b.p(☃);
    if (afe.d(☃)) {
      return new a(a, b, ☃, ☃);
    }
    return null;
  }
  
  private boolean a(a ☃)
  {
    return c(c);
  }
  
  private boolean c(cj ☃)
  {
    for (int ☃ = 0; ☃ < g.size(); ☃++)
    {
      cj ☃ = (cj)g.get(☃);
      if ((☃.n() == ☃.n()) && (☃.p() == ☃.p())) {
        return true;
      }
    }
    return false;
  }
  
  protected int a()
  {
    int ☃ = 0;
    for (cq ☃ : cq.c.a) {
      if (a(c.a(☃))) {
        ☃++;
      }
    }
    return ☃;
  }
  
  private boolean b(a ☃)
  {
    return (a(☃)) || (g.size() != 2);
  }
  
  private void c(a ☃)
  {
    g.add(c);
    
    cj ☃ = c.c();
    cj ☃ = c.d();
    cj ☃ = c.e();
    cj ☃ = c.f();
    
    boolean ☃ = c(☃);
    boolean ☃ = c(☃);
    boolean ☃ = c(☃);
    boolean ☃ = c(☃);
    
    afe.b ☃ = null;
    if ((☃) || (☃)) {
      ☃ = afe.b.a;
    }
    if ((☃) || (☃)) {
      ☃ = afe.b.b;
    }
    if (!f)
    {
      if ((☃) && (☃) && (!☃) && (!☃)) {
        ☃ = afe.b.g;
      }
      if ((☃) && (☃) && (!☃) && (!☃)) {
        ☃ = afe.b.h;
      }
      if ((☃) && (☃) && (!☃) && (!☃)) {
        ☃ = afe.b.i;
      }
      if ((☃) && (☃) && (!☃) && (!☃)) {
        ☃ = afe.b.j;
      }
    }
    if (☃ == afe.b.a)
    {
      if (afe.e(b, ☃.a())) {
        ☃ = afe.b.e;
      }
      if (afe.e(b, ☃.a())) {
        ☃ = afe.b.f;
      }
    }
    if (☃ == afe.b.b)
    {
      if (afe.e(b, ☃.a())) {
        ☃ = afe.b.c;
      }
      if (afe.e(b, ☃.a())) {
        ☃ = afe.b.d;
      }
    }
    if (☃ == null) {
      ☃ = afe.b.a;
    }
    e = e.a(d.n(), ☃);
    b.a(c, e, 3);
  }
  
  private boolean d(cj ☃)
  {
    a ☃ = b(☃);
    if (☃ == null) {
      return false;
    }
    ☃.c();
    return ☃.b(this);
  }
  
  public a a(boolean ☃, boolean ☃)
  {
    cj ☃ = c.c();
    cj ☃ = c.d();
    cj ☃ = c.e();
    cj ☃ = c.f();
    
    boolean ☃ = d(☃);
    boolean ☃ = d(☃);
    boolean ☃ = d(☃);
    boolean ☃ = d(☃);
    
    afe.b ☃ = null;
    if (((☃) || (☃)) && (!☃) && (!☃)) {
      ☃ = afe.b.a;
    }
    if (((☃) || (☃)) && (!☃) && (!☃)) {
      ☃ = afe.b.b;
    }
    if (!f)
    {
      if ((☃) && (☃) && (!☃) && (!☃)) {
        ☃ = afe.b.g;
      }
      if ((☃) && (☃) && (!☃) && (!☃)) {
        ☃ = afe.b.h;
      }
      if ((☃) && (☃) && (!☃) && (!☃)) {
        ☃ = afe.b.i;
      }
      if ((☃) && (☃) && (!☃) && (!☃)) {
        ☃ = afe.b.j;
      }
    }
    if (☃ == null)
    {
      if ((☃) || (☃)) {
        ☃ = afe.b.a;
      }
      if ((☃) || (☃)) {
        ☃ = afe.b.b;
      }
      if (!f) {
        if (☃)
        {
          if ((☃) && (☃)) {
            ☃ = afe.b.g;
          }
          if ((☃) && (☃)) {
            ☃ = afe.b.h;
          }
          if ((☃) && (☃)) {
            ☃ = afe.b.j;
          }
          if ((☃) && (☃)) {
            ☃ = afe.b.i;
          }
        }
        else
        {
          if ((☃) && (☃)) {
            ☃ = afe.b.i;
          }
          if ((☃) && (☃)) {
            ☃ = afe.b.j;
          }
          if ((☃) && (☃)) {
            ☃ = afe.b.h;
          }
          if ((☃) && (☃)) {
            ☃ = afe.b.g;
          }
        }
      }
    }
    if (☃ == afe.b.a)
    {
      if (afe.e(b, ☃.a())) {
        ☃ = afe.b.e;
      }
      if (afe.e(b, ☃.a())) {
        ☃ = afe.b.f;
      }
    }
    if (☃ == afe.b.b)
    {
      if (afe.e(b, ☃.a())) {
        ☃ = afe.b.c;
      }
      if (afe.e(b, ☃.a())) {
        ☃ = afe.b.d;
      }
    }
    if (☃ == null) {
      ☃ = afe.b.a;
    }
    a(☃);
    e = e.a(d.n(), ☃);
    if ((☃) || (b.p(c) != e))
    {
      b.a(c, e, 3);
      for (int ☃ = 0; ☃ < g.size(); ☃++)
      {
        a ☃ = b((cj)g.get(☃));
        if (☃ != null)
        {
          ☃.c();
          if (☃.b(this)) {
            ☃.c(this);
          }
        }
      }
    }
    return this;
  }
  
  public alz b()
  {
    return e;
  }
}
