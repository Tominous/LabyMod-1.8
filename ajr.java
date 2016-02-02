import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class ajr
  extends afh
{
  public static final amk a = amk.a("wet");
  
  protected ajr()
  {
    super(arm.m);
    j(this.M.b().a(a, Boolean.valueOf(false)));
    a(yz.b);
  }
  
  public String f()
  {
    return di.a(a() + ".dry.name");
  }
  
  public int a(alz ☃)
  {
    return ((Boolean)☃.b(a)).booleanValue() ? 1 : 0;
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    e(☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    e(☃, ☃, ☃);
    super.a(☃, ☃, ☃, ☃);
  }
  
  protected void e(adm ☃, cj ☃, alz ☃)
  {
    if ((!((Boolean)☃.b(a)).booleanValue()) && (e(☃, ☃)))
    {
      ☃.a(☃, ☃.a(a, Boolean.valueOf(true)), 2);
      ☃.b(2001, ☃, afh.a(afi.j));
    }
  }
  
  private boolean e(adm ☃, cj ☃)
  {
    Queue<nz<cj, Integer>> ☃ = Lists.newLinkedList();
    ArrayList<cj> ☃ = Lists.newArrayList();
    ☃.add(new nz(☃, Integer.valueOf(0)));
    
    int ☃ = 0;
    while (!☃.isEmpty())
    {
      nz<cj, Integer> ☃ = (nz)☃.poll();
      cj ☃ = (cj)☃.a();
      int ☃ = ((Integer)☃.b()).intValue();
      for (cq ☃ : cq.values())
      {
        cj ☃ = ☃.a(☃);
        if (☃.p(☃).c().t() == arm.h)
        {
          ☃.a(☃, afi.a.Q(), 2);
          ☃.add(☃);
          ☃++;
          if (☃ < 6) {
            ☃.add(new nz(☃, Integer.valueOf(☃ + 1)));
          }
        }
      }
      if (☃ > 64) {
        break;
      }
    }
    for (cj ☃ : ☃) {
      ☃.c(☃, afi.a);
    }
    return ☃ > 0;
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    ☃.add(new zx(☃, 1, 0));
    ☃.add(new zx(☃, 1, 1));
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Boolean.valueOf((☃ & 0x1) == 1));
  }
  
  public int c(alz ☃)
  {
    return ((Boolean)☃.b(a)).booleanValue() ? 1 : 0;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (!((Boolean)☃.b(a)).booleanValue()) {
      return;
    }
    cq ☃ = cq.a(☃);
    if ((☃ == cq.b) || (adm.a(☃, ☃.a(☃)))) {
      return;
    }
    double ☃ = ☃.n();
    double ☃ = ☃.o();
    double ☃ = ☃.p();
    if (☃ == cq.a)
    {
      ☃ -= 0.05D;
      ☃ += ☃.nextDouble();
      ☃ += ☃.nextDouble();
    }
    else
    {
      ☃ += ☃.nextDouble() * 0.8D;
      if (☃.k() == cq.a.a)
      {
        ☃ += ☃.nextDouble();
        if (☃ == cq.f) {
          ☃ += 1.1D;
        } else {
          ☃ += 0.05D;
        }
      }
      else
      {
        ☃ += ☃.nextDouble();
        if (☃ == cq.d) {
          ☃ += 1.1D;
        } else {
          ☃ += 0.05D;
        }
      }
    }
    ☃.a(cy.s, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
  }
}
