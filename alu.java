import com.google.common.collect.Lists;
import java.util.List;

public class alu
  extends akw
  implements km
{
  private alz a;
  private cq f;
  private boolean g;
  private boolean h;
  private float i;
  private float j;
  
  public alu() {}
  
  public alu(alz ☃, cq ☃, boolean ☃, boolean ☃)
  {
    a = ☃;
    f = ☃;
    g = ☃;
    h = ☃;
  }
  
  public alz b()
  {
    return a;
  }
  
  public int u()
  {
    return 0;
  }
  
  public boolean d()
  {
    return g;
  }
  
  public cq e()
  {
    return f;
  }
  
  public boolean g()
  {
    return h;
  }
  
  public float a(float ☃)
  {
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    return j + (i - j) * ☃;
  }
  
  public float b(float ☃)
  {
    if (g) {
      return (a(☃) - 1.0F) * f.g();
    }
    return (1.0F - a(☃)) * f.g();
  }
  
  public float c(float ☃)
  {
    if (g) {
      return (a(☃) - 1.0F) * f.h();
    }
    return (1.0F - a(☃)) * f.h();
  }
  
  public float d(float ☃)
  {
    if (g) {
      return (a(☃) - 1.0F) * f.i();
    }
    return (1.0F - a(☃)) * f.i();
  }
  
  private List<pk> k = Lists.newArrayList();
  
  private void a(float ☃, float ☃)
  {
    if (g) {
      ☃ = 1.0F - ☃;
    } else {
      ☃ -= 1.0F;
    }
    aug ☃ = afi.M.a(b, c, a, ☃, f);
    if (☃ != null)
    {
      List<pk> ☃ = b.b(null, ☃);
      if (!☃.isEmpty())
      {
        k.addAll(☃);
        for (pk ☃ : k) {
          if ((a.c() == afi.cE) && (g)) {
            switch (alu.1.a[f.k().ordinal()])
            {
            case 1: 
              v = f.g();
              break;
            case 2: 
              w = f.h();
              break;
            case 3: 
              x = f.i();
            }
          } else {
            ☃.d(☃ * f.g(), ☃ * f.h(), ☃ * f.i());
          }
        }
        k.clear();
      }
    }
  }
  
  public void h()
  {
    if ((j < 1.0F) && (b != null))
    {
      j = (i = 1.0F);
      b.t(c);
      y();
      if (b.p(c).c() == afi.M)
      {
        b.a(c, a, 3);
        b.d(c, a.c());
      }
    }
  }
  
  public void c()
  {
    j = i;
    if (j >= 1.0F)
    {
      a(1.0F, 0.25F);
      b.t(c);
      y();
      if (b.p(c).c() == afi.M)
      {
        b.a(c, a, 3);
        b.d(c, a.c());
      }
      return;
    }
    i += 0.5F;
    if (i >= 1.0F) {
      i = 1.0F;
    }
    if (g) {
      a(i, i - j + 0.0625F);
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    a = afh.c(☃.f("blockId")).a(☃.f("blockData"));
    f = cq.a(☃.f("facing"));
    j = (i = ☃.h("progress"));
    g = ☃.n("extending");
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("blockId", afh.a(a.c()));
    ☃.a("blockData", a.c().c(a));
    ☃.a("facing", f.a());
    ☃.a("progress", j);
    ☃.a("extending", g);
  }
}
