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
    j.addAll(☃);
  }
  
  public adi(adm ☃, pk ☃, double ☃, double ☃, double ☃, float ☃, boolean ☃, boolean ☃)
  {
    d = ☃;
    h = ☃;
    i = ☃;
    e = ☃;
    f = ☃;
    g = ☃;
    a = ☃;
    b = ☃;
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
            
            float ☃ = i * (0.7F + d.s.nextFloat() * 0.6F);
            double ☃ = e;
            double ☃ = f;
            double ☃ = g;
            
            float ☃ = 0.3F;
            while (☃ > 0.0F)
            {
              cj ☃ = new cj(☃, ☃, ☃);
              alz ☃ = d.p(☃);
              if (☃.c().t() != arm.a)
              {
                float ☃ = h != null ? h.a(this, d, ☃, ☃) : ☃.c().a(null);
                ☃ -= (☃ + 0.3F) * 0.3F;
              }
              if ((☃ > 0.0F) && ((h == null) || (h.a(this, d, ☃, ☃, ☃)))) {
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
    j.addAll(☃);
    
    float ☃ = i * 2.0F;
    
    int ☃ = ns.c(e - ☃ - 1.0D);
    int ☃ = ns.c(e + ☃ + 1.0D);
    int ☃ = ns.c(f - ☃ - 1.0D);
    int ☃ = ns.c(f + ☃ + 1.0D);
    int ☃ = ns.c(g - ☃ - 1.0D);
    int ☃ = ns.c(g + ☃ + 1.0D);
    List<pk> ☃ = d.b(h, new aug(☃, ☃, ☃, ☃, ☃, ☃));
    aui ☃ = new aui(e, f, g);
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      pk ☃ = (pk)☃.get(☃);
      if (!☃.aW())
      {
        double ☃ = ☃.f(e, f, g) / ☃;
        if (☃ <= 1.0D)
        {
          double ☃ = s - e;
          double ☃ = t + ☃.aS() - f;
          double ☃ = u - g;
          
          double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
          if (☃ != 0.0D)
          {
            ☃ /= ☃;
            ☃ /= ☃;
            ☃ /= ☃;
            
            double ☃ = d.a(☃, ☃.aR());
            double ☃ = (1.0D - ☃) * ☃;
            ☃.a(ow.a(this), (int)((☃ * ☃ + ☃) / 2.0D * 8.0D * ☃ + 1.0D));
            
            double ☃ = acr.a(☃, ☃);
            v += ☃ * ☃;
            w += ☃ * ☃;
            x += ☃ * ☃;
            if (((☃ instanceof wn)) && (!bA.a)) {
              k.put((wn)☃, new aui(☃ * ☃, ☃ * ☃, ☃ * ☃));
            }
          }
        }
      }
    }
  }
  
  public void a(boolean ☃)
  {
    d.a(e, f, g, "random.explode", 4.0F, (1.0F + (d.s.nextFloat() - d.s.nextFloat()) * 0.2F) * 0.7F);
    if ((i < 2.0F) || (!b)) {
      d.a(cy.b, e, f, g, 1.0D, 0.0D, 0.0D, new int[0]);
    } else {
      d.a(cy.c, e, f, g, 1.0D, 0.0D, 0.0D, new int[0]);
    }
    if (b) {
      for (cj ☃ : j)
      {
        afh ☃ = d.p(☃).c();
        if (☃)
        {
          double ☃ = ☃.n() + d.s.nextFloat();
          double ☃ = ☃.o() + d.s.nextFloat();
          double ☃ = ☃.p() + d.s.nextFloat();
          
          double ☃ = ☃ - e;
          double ☃ = ☃ - f;
          double ☃ = ☃ - g;
          
          double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
          
          ☃ /= ☃;
          ☃ /= ☃;
          ☃ /= ☃;
          
          double ☃ = 0.5D / (☃ / i + 0.1D);
          ☃ *= (d.s.nextFloat() * d.s.nextFloat() + 0.3F);
          ☃ *= ☃;
          ☃ *= ☃;
          ☃ *= ☃;
          
          d.a(cy.a, (☃ + e * 1.0D) / 2.0D, (☃ + f * 1.0D) / 2.0D, (☃ + g * 1.0D) / 2.0D, ☃, ☃, ☃, new int[0]);
          d.a(cy.l, ☃, ☃, ☃, ☃, ☃, ☃, new int[0]);
        }
        if (☃.t() != arm.a)
        {
          if (☃.a(this)) {
            ☃.a(d, ☃, d.p(☃), 1.0F / i, 0);
          }
          d.a(☃, afi.a.Q(), 3);
          ☃.a(d, ☃, this);
        }
      }
    }
    if (a) {
      for (cj ☃ : j) {
        if ((d.p(☃).c().t() == arm.a) && (d.p(☃.b()).c().o()) && (c.nextInt(3) == 0)) {
          d.a(☃, afi.ab.Q());
        }
      }
    }
  }
  
  public Map<wn, aui> b()
  {
    return k;
  }
  
  public pr c()
  {
    if (h == null) {
      return null;
    }
    if ((h instanceof vj)) {
      return ((vj)h).j();
    }
    if ((h instanceof pr)) {
      return (pr)h;
    }
    return null;
  }
  
  public void d()
  {
    j.clear();
  }
  
  public List<cj> e()
  {
    return j;
  }
}
