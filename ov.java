import com.google.common.collect.Lists;
import java.util.List;

public class ov
{
  private final List<ou> a = Lists.newArrayList();
  private final pr b;
  private int c;
  private int d;
  private int e;
  private boolean f;
  private boolean g;
  private String h;
  
  public ov(pr ☃)
  {
    this.b = ☃;
  }
  
  public void a()
  {
    j();
    if (this.b.k_())
    {
      afh ☃ = this.b.o.p(new cj(this.b.s, this.b.aR().b, this.b.u)).c();
      if (☃ == afi.au) {
        this.h = "ladder";
      } else if (☃ == afi.bn) {
        this.h = "vines";
      }
    }
    else if (this.b.V())
    {
      this.h = "water";
    }
  }
  
  public void a(ow ☃, float ☃, float ☃)
  {
    g();
    a();
    
    ou ☃ = new ou(☃, this.b.W, ☃, ☃, this.h, this.b.O);
    
    this.a.add(☃);
    this.c = this.b.W;
    this.g = true;
    if ((☃.f()) && (!this.f) && (this.b.ai()))
    {
      this.f = true;
      this.d = this.b.W;
      this.e = this.d;
      this.b.h_();
    }
  }
  
  public eu b()
  {
    if (this.a.size() == 0) {
      return new fb("death.attack.generic", new Object[] { this.b.f_() });
    }
    ou ☃ = i();
    ou ☃ = (ou)this.a.get(this.a.size() - 1);
    
    eu ☃ = ☃.h();
    pk ☃ = ☃.a().j();
    eu ☃;
    eu ☃;
    if ((☃ != null) && (☃.a() == ow.i))
    {
      eu ☃ = ☃.h();
      eu ☃;
      if ((☃.a() == ow.i) || (☃.a() == ow.j))
      {
        ☃ = new fb("death.fell.accident." + a(☃), new Object[] { this.b.f_() });
      }
      else
      {
        eu ☃;
        if ((☃ != null) && ((☃ == null) || (!☃.equals(☃))))
        {
          pk ☃ = ☃.a().j();
          zx ☃ = (☃ instanceof pr) ? ((pr)☃).bA() : null;
          eu ☃;
          if ((☃ != null) && (☃.s())) {
            ☃ = new fb("death.fell.assist.item", new Object[] { this.b.f_(), ☃, ☃.C() });
          } else {
            ☃ = new fb("death.fell.assist", new Object[] { this.b.f_(), ☃ });
          }
        }
        else
        {
          eu ☃;
          if (☃ != null)
          {
            zx ☃ = (☃ instanceof pr) ? ((pr)☃).bA() : null;
            eu ☃;
            if ((☃ != null) && (☃.s())) {
              ☃ = new fb("death.fell.finish.item", new Object[] { this.b.f_(), ☃, ☃.C() });
            } else {
              ☃ = new fb("death.fell.finish", new Object[] { this.b.f_(), ☃ });
            }
          }
          else
          {
            ☃ = new fb("death.fell.killer", new Object[] { this.b.f_() });
          }
        }
      }
    }
    else
    {
      ☃ = ☃.a().b(this.b);
    }
    return ☃;
  }
  
  public pr c()
  {
    pr ☃ = null;
    wn ☃ = null;
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    for (ou ☃ : this.a)
    {
      if (((☃.a().j() instanceof wn)) && ((☃ == null) || (☃.c() > ☃)))
      {
        ☃ = ☃.c();
        ☃ = (wn)☃.a().j();
      }
      if (((☃.a().j() instanceof pr)) && ((☃ == null) || (☃.c() > ☃)))
      {
        ☃ = ☃.c();
        ☃ = (pr)☃.a().j();
      }
    }
    if ((☃ != null) && (☃ >= ☃ / 3.0F)) {
      return ☃;
    }
    return ☃;
  }
  
  private ou i()
  {
    ou ☃ = null;
    ou ☃ = null;
    int ☃ = 0;
    float ☃ = 0.0F;
    for (int ☃ = 0; ☃ < this.a.size(); ☃++)
    {
      ou ☃ = (ou)this.a.get(☃);
      ou ☃ = ☃ > 0 ? (ou)this.a.get(☃ - 1) : null;
      if (((☃.a() == ow.i) || (☃.a() == ow.j)) && (☃.i() > 0.0F) && ((☃ == null) || (☃.i() > ☃)))
      {
        if (☃ > 0) {
          ☃ = ☃;
        } else {
          ☃ = ☃;
        }
        ☃ = ☃.i();
      }
      if ((☃.g() != null) && ((☃ == null) || (☃.c() > ☃))) {
        ☃ = ☃;
      }
    }
    if ((☃ > 5.0F) && (☃ != null)) {
      return ☃;
    }
    if ((☃ > 5) && (☃ != null)) {
      return ☃;
    }
    return null;
  }
  
  private String a(ou ☃)
  {
    return ☃.g() == null ? "generic" : ☃.g();
  }
  
  public int f()
  {
    if (this.f) {
      return this.b.W - this.d;
    }
    return this.e - this.d;
  }
  
  private void j()
  {
    this.h = null;
  }
  
  public void g()
  {
    int ☃ = this.f ? 300 : 100;
    if ((this.g) && ((!this.b.ai()) || (this.b.W - this.c > ☃)))
    {
      boolean ☃ = this.f;
      this.g = false;
      this.f = false;
      this.e = this.b.W;
      if (☃) {
        this.b.j();
      }
      this.a.clear();
    }
  }
  
  public pr h()
  {
    return this.b;
  }
}
