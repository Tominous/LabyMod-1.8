import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class adi
{
  private final boolean a;
  private final boolean b;
  private final Random c = new Random();
  private final adm d;
  private final double e;
  private final double f;
  private final double g;
  private final pk h;
  private final float i;
  private final List<cj> j = Lists.newArrayList();
  private final Map<wn, aui> k = Maps.newHashMap();
  
  public adi(adm ☃, pk ☃, double ☃, double ☃, double ☃, float ☃, List<cj> ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, ☃, false, true, ☃);
  }
  
  public adi(adm ☃, pk ☃, double ☃, double ☃, double ☃, float ☃, boolean ☃, boolean ☃, List<cj> ☃)
  {
    this(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    this.j.addAll(☃);
  }
  
  public adi(adm ☃, pk ☃, double ☃, double ☃, double ☃, float ☃, boolean ☃, boolean ☃)
  {
    this.d = ☃;
    this.h = ☃;
    this.i = ☃;
    this.e = ☃;
    this.f = ☃;
    this.g = ☃;
    this.a = ☃;
    this.b = ☃;
  }
  
  public void a()
  {
    Set<cj> ☃ = Sets.newHashSet();
    
    int ☃ = 16;
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 0; ☃ < 16; ☃++) {
          if ((☃ == 0) || (☃ == 15) || (☃ == 0) || (☃ == 15) || (☃ == 0) || (☃ == 15))
          {
            double ☃ = ☃ / 15.0F * 2.0F - 1.0F;
            double ☃ = ☃ / 15.0F * 2.0F - 1.0F;
            double ☃ = ☃ / 15.0F * 2.0F - 1.0F;
            double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
            
            ☃ /= ☃;
            ☃ /= ☃;
            ☃ /= ☃;
            
            float ☃ = this.i * (0.7F + this.d.s.nextFloat() * 0.6F);
            double ☃ = this.e;
            double ☃ = this.f;
            double ☃ = this.g;
            
            float ☃ = 0.3F;
            while (☃ > 0.0F)
            {
              cj ☃ = new cj(☃, ☃, ☃);
              alz ☃ = this.d.p(☃);
              if (☃.c().t() != arm.a)
              {
                float ☃ = this.h != null ? this.h.a(this, this.d, ☃, ☃) : ☃.c().a(null);
                ☃ -= (☃ + 0.3F) * 0.3F;
              }
              if ((☃ > 0.0F) && ((this.h == null) || (this.h.a(this, this.d, ☃, ☃, ☃)))) {
                ☃.add(☃);
              }
              ☃ += ☃ * 0.30000001192092896D;
              ☃ += ☃ * 0.30000001192092896D;
              ☃ += ☃ * 0.30000001192092896D;
              ☃ -= 0.22500001F;
            }
          }
        }
      }
    }
    this.j.addAll(☃);
    
    float ☃ = this.i * 2.0F;
    
    int ☃ = ns.c(this.e - ☃ - 1.0D);
    int ☃ = ns.c(this.e + ☃ + 1.0D);
    int ☃ = ns.c(this.f - ☃ - 1.0D);
    int ☃ = ns.c(this.f + ☃ + 1.0D);
    int ☃ = ns.c(this.g - ☃ - 1.0D);
    int ☃ = ns.c(this.g + ☃ + 1.0D);
    List<pk> ☃ = this.d.b(this.h, new aug(☃, ☃, ☃, ☃, ☃, ☃));
    aui ☃ = new aui(this.e, this.f, this.g);
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      pk ☃ = (pk)☃.get(☃);
      if (!☃.aW())
      {
        double ☃ = ☃.f(this.e, this.f, this.g) / ☃;
        if (☃ <= 1.0D)
        {
          double ☃ = ☃.s - this.e;
          double ☃ = ☃.t + ☃.aS() - this.f;
          double ☃ = ☃.u - this.g;
          
          double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
          if (☃ != 0.0D)
          {
            ☃ /= ☃;
            ☃ /= ☃;
            ☃ /= ☃;
            
            double ☃ = this.d.a(☃, ☃.aR());
            double ☃ = (1.0D - ☃) * ☃;
            ☃.a(ow.a(this), (int)((☃ * ☃ + ☃) / 2.0D * 8.0D * ☃ + 1.0D));
            
            double ☃ = acr.a(☃, ☃);
            ☃.v += ☃ * ☃;
            ☃.w += ☃ * ☃;
            ☃.x += ☃ * ☃;
            if (((☃ instanceof wn)) && (!((wn)☃).bA.a)) {
              this.k.put((wn)☃, new aui(☃ * ☃, ☃ * ☃, ☃ * ☃));
            }
          }
        }
      }
    }
  }
  
  public void a(boolean ☃)
  {
    this.d.a(this.e, this.f, this.g, "random.explode", 4.0F, (1.0F + (this.d.s.nextFloat() - this.d.s.nextFloat()) * 0.2F) * 0.7F);
    if ((this.i < 2.0F) || (!this.b)) {
      this.d.a(cy.b, this.e, this.f, this.g, 1.0D, 0.0D, 0.0D, new int[0]);
    } else {
      this.d.a(cy.c, this.e, this.f, this.g, 1.0D, 0.0D, 0.0D, new int[0]);
    }
    if (this.b) {
      for (cj ☃ : this.j)
      {
        afh ☃ = this.d.p(☃).c();
        if (☃)
        {
          double ☃ = ☃.n() + this.d.s.nextFloat();
          double ☃ = ☃.o() + this.d.s.nextFloat();
          double ☃ = ☃.p() + this.d.s.nextFloat();
          
          double ☃ = ☃ - this.e;
          double ☃ = ☃ - this.f;
          double ☃ = ☃ - this.g;
          
          double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
          
          ☃ /= ☃;
          ☃ /= ☃;
          ☃ /= ☃;
          
          double ☃ = 0.5D / (☃ / this.i + 0.1D);
          ☃ *= (this.d.s.nextFloat() * this.d.s.nextFloat() + 0.3F);
          ☃ *= ☃;
          ☃ *= ☃;
          ☃ *= ☃;
          
          this.d.a(cy.a, (☃ + this.e * 1.0D) / 2.0D, (☃ + this.f * 1.0D) / 2.0D, (☃ + this.g * 1.0D) / 2.0D, ☃, ☃, ☃, new int[0]);
          this.d.a(cy.l, ☃, ☃, ☃, ☃, ☃, ☃, new int[0]);
        }
        if (☃.t() != arm.a)
        {
          if (☃.a(this)) {
            ☃.a(this.d, ☃, this.d.p(☃), 1.0F / this.i, 0);
          }
          this.d.a(☃, afi.a.Q(), 3);
          ☃.a(this.d, ☃, this);
        }
      }
    }
    if (this.a) {
      for (cj ☃ : this.j) {
        if ((this.d.p(☃).c().t() == arm.a) && (this.d.p(☃.b()).c().o()) && (this.c.nextInt(3) == 0)) {
          this.d.a(☃, afi.ab.Q());
        }
      }
    }
  }
  
  public Map<wn, aui> b()
  {
    return this.k;
  }
  
  public pr c()
  {
    if (this.h == null) {
      return null;
    }
    if ((this.h instanceof vj)) {
      return ((vj)this.h).j();
    }
    if ((this.h instanceof pr)) {
      return (pr)this.h;
    }
    return null;
  }
  
  public void d()
  {
    this.j.clear();
  }
  
  public List<cj> e()
  {
    return this.j;
  }
}
