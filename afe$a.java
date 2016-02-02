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
    this.b = ☃;
    this.c = ☃;
    this.e = ☃;
    this.d = ((afe)☃.c());
    afe.b ☃ = (afe.b)☃.b(???.n());
    this.f = this.d.a;
    a(☃);
  }
  
  private void a(afe.b ☃)
  {
    this.g.clear();
    switch (afe.1.a[☃.ordinal()])
    {
    case 1: 
      this.g.add(this.c.c());
      this.g.add(this.c.d());
      break;
    case 2: 
      this.g.add(this.c.e());
      this.g.add(this.c.f());
      break;
    case 3: 
      this.g.add(this.c.e());
      this.g.add(this.c.f().a());
      break;
    case 4: 
      this.g.add(this.c.e().a());
      this.g.add(this.c.f());
      break;
    case 5: 
      this.g.add(this.c.c().a());
      this.g.add(this.c.d());
      break;
    case 6: 
      this.g.add(this.c.c());
      this.g.add(this.c.d().a());
      break;
    case 7: 
      this.g.add(this.c.f());
      this.g.add(this.c.d());
      break;
    case 8: 
      this.g.add(this.c.e());
      this.g.add(this.c.d());
      break;
    case 9: 
      this.g.add(this.c.e());
      this.g.add(this.c.c());
      break;
    case 10: 
      this.g.add(this.c.f());
      this.g.add(this.c.c());
    }
  }
  
  private void c()
  {
    for (int ☃ = 0; ☃ < this.g.size(); ☃++)
    {
      a ☃ = b((cj)this.g.get(☃));
      if ((☃ == null) || (!☃.a(this))) {
        this.g.remove(☃--);
      } else {
        this.g.set(☃, ☃.c);
      }
    }
  }
  
  private boolean a(cj ☃)
  {
    return (afe.e(this.b, ☃)) || (afe.e(this.b, ☃.a())) || (afe.e(this.b, ☃.b()));
  }
  
  private a b(cj ☃)
  {
    cj ☃ = ☃;
    alz ☃ = this.b.p(☃);
    if (afe.d(☃)) {
      return new a(this.a, this.b, ☃, ☃);
    }
    ☃ = ☃.a();
    ☃ = this.b.p(☃);
    if (afe.d(☃)) {
      return new a(this.a, this.b, ☃, ☃);
    }
    ☃ = ☃.b();
    ☃ = this.b.p(☃);
    if (afe.d(☃)) {
      return new a(this.a, this.b, ☃, ☃);
    }
    return null;
  }
  
  private boolean a(a ☃)
  {
    return c(☃.c);
  }
  
  private boolean c(cj ☃)
  {
    for (int ☃ = 0; ☃ < this.g.size(); ☃++)
    {
      cj ☃ = (cj)this.g.get(☃);
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
      if (a(this.c.a(☃))) {
        ☃++;
      }
    }
    return ☃;
  }
  
  private boolean b(a ☃)
  {
    return (a(☃)) || (this.g.size() != 2);
  }
  
  private void c(a ☃)
  {
    this.g.add(☃.c);
    
    cj ☃ = this.c.c();
    cj ☃ = this.c.d();
    cj ☃ = this.c.e();
    cj ☃ = this.c.f();
    
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
    if (!this.f)
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
      if (afe.e(this.b, ☃.a())) {
        ☃ = afe.b.e;
      }
      if (afe.e(this.b, ☃.a())) {
        ☃ = afe.b.f;
      }
    }
    if (☃ == afe.b.b)
    {
      if (afe.e(this.b, ☃.a())) {
        ☃ = afe.b.c;
      }
      if (afe.e(this.b, ☃.a())) {
        ☃ = afe.b.d;
      }
    }
    if (☃ == null) {
      ☃ = afe.b.a;
    }
    this.e = this.e.a(this.d.n(), ☃);
    this.b.a(this.c, this.e, 3);
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
    cj ☃ = this.c.c();
    cj ☃ = this.c.d();
    cj ☃ = this.c.e();
    cj ☃ = this.c.f();
    
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
    if (!this.f)
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
      if (!this.f) {
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
      if (afe.e(this.b, ☃.a())) {
        ☃ = afe.b.e;
      }
      if (afe.e(this.b, ☃.a())) {
        ☃ = afe.b.f;
      }
    }
    if (☃ == afe.b.b)
    {
      if (afe.e(this.b, ☃.a())) {
        ☃ = afe.b.c;
      }
      if (afe.e(this.b, ☃.a())) {
        ☃ = afe.b.d;
      }
    }
    if (☃ == null) {
      ☃ = afe.b.a;
    }
    a(☃);
    this.e = this.e.a(this.d.n(), ☃);
    if ((☃) || (this.b.p(this.c) != this.e))
    {
      this.b.a(this.c, this.e, 3);
      for (int ☃ = 0; ☃ < this.g.size(); ☃++)
      {
        a ☃ = b((cj)this.g.get(☃));
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
    return this.e;
  }
}
