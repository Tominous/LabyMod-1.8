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
    b = ☃;
  }
  
  public void a()
  {
    j();
    if (b.k_())
    {
      afh ☃ = b.o.p(new cj(b.s, b.aR().b, b.u)).c();
      if (☃ == afi.au) {
        h = "ladder";
      } else if (☃ == afi.bn) {
        h = "vines";
      }
    }
    else if (b.V())
    {
      h = "water";
    }
  }
  
  public void a(ow ☃, float ☃, float ☃)
  {
    g();
    a();
    
    ou ☃ = new ou(☃, b.W, ☃, ☃, h, b.O);
    
    a.add(☃);
    c = b.W;
    g = true;
    if ((☃.f()) && (!f) && (b.ai()))
    {
      f = true;
      d = b.W;
      e = d;
      b.h_();
    }
  }
  
  public eu b()
  {
    if (a.size() == 0) {
      return new fb("death.attack.generic", new Object[] { b.f_() });
    }
    ou ☃ = i();
    ou ☃ = (ou)a.get(a.size() - 1);
    
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
        ☃ = new fb("death.fell.accident." + a(☃), new Object[] { b.f_() });
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
            ☃ = new fb("death.fell.assist.item", new Object[] { b.f_(), ☃, ☃.C() });
          } else {
            ☃ = new fb("death.fell.assist", new Object[] { b.f_(), ☃ });
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
              ☃ = new fb("death.fell.finish.item", new Object[] { b.f_(), ☃, ☃.C() });
            } else {
              ☃ = new fb("death.fell.finish", new Object[] { b.f_(), ☃ });
            }
          }
          else
          {
            ☃ = new fb("death.fell.killer", new Object[] { b.f_() });
          }
        }
      }
    }
    else
    {
      ☃ = ☃.a().b(b);
    }
    return ☃;
  }
  
  public pr c()
  {
    pr ☃ = null;
    wn ☃ = null;
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    for (ou ☃ : a)
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
    for (int ☃ = 0; ☃ < a.size(); ☃++)
    {
      ou ☃ = (ou)a.get(☃);
      ou ☃ = ☃ > 0 ? (ou)a.get(☃ - 1) : null;
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
    if (f) {
      return b.W - d;
    }
    return e - d;
  }
  
  private void j()
  {
    h = null;
  }
  
  public void g()
  {
    int ☃ = f ? 300 : 100;
    if ((g) && ((!b.ai()) || (b.W - c > ☃)))
    {
      boolean ☃ = f;
      g = false;
      f = false;
      e = b.W;
      if (☃) {
        b.j();
      }
      a.clear();
    }
  }
  
  public pr h()
  {
    return b;
  }
}
