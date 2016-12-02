import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ajd
  extends akf
{
  private static Map<adm, List<ajd.a>> b = ;
  private final boolean N;
  
  static class a
  {
    cj a;
    long b;
    
    public a(cj ☃, long ☃)
    {
      a = ☃;
      b = ☃;
    }
  }
  
  private boolean a(adm ☃, cj ☃, boolean ☃)
  {
    if (!b.containsKey(☃)) {
      b.put(☃, Lists.newArrayList());
    }
    List<ajd.a> ☃ = (List)b.get(☃);
    if (☃) {
      ☃.add(new ajd.a(☃, ☃.K()));
    }
    int ☃ = 0;
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      ajd.a ☃ = (ajd.a)☃.get(☃);
      if (a.equals(☃))
      {
        ☃++;
        if (☃ >= 8) {
          return true;
        }
      }
    }
    return false;
  }
  
  protected ajd(boolean ☃)
  {
    N = ☃;
    a(true);
    a(null);
  }
  
  public int a(adm ☃)
  {
    return 2;
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    if (N) {
      for (cq ☃ : cq.values()) {
        ☃.c(☃.a(☃), this);
      }
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    if (N) {
      for (cq ☃ : cq.values()) {
        ☃.c(☃.a(☃), this);
      }
    }
  }
  
  public int a(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    if ((N) && (☃.b(a) != ☃)) {
      return 15;
    }
    return 0;
  }
  
  private boolean g(adm ☃, cj ☃, alz ☃)
  {
    cq ☃ = ((cq)☃.b(a)).d();
    
    return ☃.b(☃.a(☃), ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, Random ☃) {}
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    boolean ☃ = g(☃, ☃, ☃);
    
    List<ajd.a> ☃ = (List)b.get(☃);
    while ((☃ != null) && (!☃.isEmpty()) && (☃.K() - get0b > 60L)) {
      ☃.remove(0);
    }
    if (N)
    {
      if (☃)
      {
        ☃.a(☃, afi.aE.Q().a(a, ☃.b(a)), 3);
        if (a(☃, ☃, true))
        {
          ☃.a(☃.n() + 0.5F, ☃.o() + 0.5F, ☃.p() + 0.5F, "random.fizz", 0.5F, 2.6F + (s.nextFloat() - s.nextFloat()) * 0.8F);
          for (int ☃ = 0; ☃ < 5; ☃++)
          {
            double ☃ = ☃.n() + ☃.nextDouble() * 0.6D + 0.2D;
            double ☃ = ☃.o() + ☃.nextDouble() * 0.6D + 0.2D;
            double ☃ = ☃.p() + ☃.nextDouble() * 0.6D + 0.2D;
            
            ☃.a(cy.l, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
          }
          ☃.a(☃, ☃.p(☃).c(), 160);
        }
      }
    }
    else if ((!☃) && 
      (!a(☃, ☃, false))) {
      ☃.a(☃, afi.aF.Q().a(a, ☃.b(a)), 3);
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (e(☃, ☃, ☃)) {
      return;
    }
    if (N == g(☃, ☃, ☃)) {
      ☃.a(☃, this, a(☃));
    }
  }
  
  public int b(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    if (☃ == cq.a) {
      return a(☃, ☃, ☃, ☃);
    }
    return 0;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zw.a(afi.aF);
  }
  
  public boolean i()
  {
    return true;
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (!N) {
      return;
    }
    double ☃ = ☃.n() + 0.5D + (☃.nextDouble() - 0.5D) * 0.2D;
    double ☃ = ☃.o() + 0.7D + (☃.nextDouble() - 0.5D) * 0.2D;
    double ☃ = ☃.p() + 0.5D + (☃.nextDouble() - 0.5D) * 0.2D;
    
    cq ☃ = (cq)☃.b(a);
    if (☃.k().c())
    {
      cq ☃ = ☃.d();
      
      double ☃ = 0.27D;
      
      ☃ += 0.27D * ☃.g();
      ☃ += 0.22D;
      ☃ += 0.27D * ☃.i();
    }
    ☃.a(cy.E, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zw.a(afi.aF);
  }
  
  public boolean b(afh ☃)
  {
    return (☃ == afi.aE) || (☃ == afi.aF);
  }
}
