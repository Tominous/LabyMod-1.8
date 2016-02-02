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
    this.a = ☃;
    this.f = ☃;
    this.g = ☃;
    this.h = ☃;
  }
  
  public alz b()
  {
    return this.a;
  }
  
  public int u()
  {
    return 0;
  }
  
  public boolean d()
  {
    return this.g;
  }
  
  public cq e()
  {
    return this.f;
  }
  
  public boolean g()
  {
    return this.h;
  }
  
  public float a(float ☃)
  {
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    return this.j + (this.i - this.j) * ☃;
  }
  
  public float b(float ☃)
  {
    if (this.g) {
      return (a(☃) - 1.0F) * this.f.g();
    }
    return (1.0F - a(☃)) * this.f.g();
  }
  
  public float c(float ☃)
  {
    if (this.g) {
      return (a(☃) - 1.0F) * this.f.h();
    }
    return (1.0F - a(☃)) * this.f.h();
  }
  
  public float d(float ☃)
  {
    if (this.g) {
      return (a(☃) - 1.0F) * this.f.i();
    }
    return (1.0F - a(☃)) * this.f.i();
  }
  
  private List<pk> k = Lists.newArrayList();
  
  private void a(float ☃, float ☃)
  {
    if (this.g) {
      ☃ = 1.0F - ☃;
    } else {
      ☃ -= 1.0F;
    }
    aug ☃ = afi.M.a(this.b, this.c, this.a, ☃, this.f);
    if (☃ != null)
    {
      List<pk> ☃ = this.b.b(null, ☃);
      if (!☃.isEmpty())
      {
        this.k.addAll(☃);
        for (pk ☃ : this.k) {
          if ((this.a.c() == afi.cE) && (this.g)) {
            switch (alu.1.a[this.f.k().ordinal()])
            {
            case 1: 
              ☃.v = this.f.g();
              break;
            case 2: 
              ☃.w = this.f.h();
              break;
            case 3: 
              ☃.x = this.f.i();
            }
          } else {
            ☃.d(☃ * this.f.g(), ☃ * this.f.h(), ☃ * this.f.i());
          }
        }
        this.k.clear();
      }
    }
  }
  
  public void h()
  {
    if ((this.j < 1.0F) && (this.b != null))
    {
      this.j = (this.i = 1.0F);
      this.b.t(this.c);
      y();
      if (this.b.p(this.c).c() == afi.M)
      {
        this.b.a(this.c, this.a, 3);
        this.b.d(this.c, this.a.c());
      }
    }
  }
  
  public void c()
  {
    this.j = this.i;
    if (this.j >= 1.0F)
    {
      a(1.0F, 0.25F);
      this.b.t(this.c);
      y();
      if (this.b.p(this.c).c() == afi.M)
      {
        this.b.a(this.c, this.a, 3);
        this.b.d(this.c, this.a.c());
      }
      return;
    }
    this.i += 0.5F;
    if (this.i >= 1.0F) {
      this.i = 1.0F;
    }
    if (this.g) {
      a(this.i, this.i - this.j + 0.0625F);
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    this.a = afh.c(☃.f("blockId")).a(☃.f("blockData"));
    this.f = cq.a(☃.f("facing"));
    this.j = (this.i = ☃.h("progress"));
    this.g = ☃.n("extending");
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("blockId", afh.a(this.a.c()));
    ☃.a("blockData", this.a.c().c(this.a));
    ☃.a("facing", this.f.a());
    ☃.a("progress", this.j);
    ☃.a("extending", this.g);
  }
}
