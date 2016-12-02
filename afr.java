import java.util.List;
import java.util.Random;

public class afr
  extends afh
{
  public static final amn a = amn.a("level", 0, 3);
  
  public afr()
  {
    super(arm.f, arn.m);
    j(this.M.b().a(a, Integer.valueOf(0)));
  }
  
  public void a(adm ☃, cj ☃, alz ☃, aug ☃, List<aug> ☃, pk ☃)
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    float ☃ = 0.125F;
    a(0.0F, 0.0F, 0.0F, ☃, 1.0F, 1.0F);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, ☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    a(1.0F - ☃, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    a(0.0F, 0.0F, 1.0F - ☃, 1.0F, 1.0F, 1.0F);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    
    j();
  }
  
  public void j()
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pk ☃)
  {
    int ☃ = ((Integer)☃.b(a)).intValue();
    float ☃ = ☃.o() + (6.0F + 3 * ☃) / 16.0F;
    if ((!☃.D) && (☃.at()) && (☃ > 0) && (☃.aR().b <= ☃))
    {
      ☃.N();
      
      a(☃, ☃, ☃, ☃ - 1);
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    zx ☃ = ☃.bi.h();
    if (☃ == null) {
      return true;
    }
    int ☃ = ((Integer)☃.b(a)).intValue();
    zw ☃ = ☃.b();
    if (☃ == zy.ax)
    {
      if (☃ < 3)
      {
        if (!☃.bA.d) {
          ☃.bi.a(☃.bi.c, new zx(zy.aw));
        }
        ☃.b(na.I);
        
        a(☃, ☃, ☃, 3);
      }
      return true;
    }
    if (☃ == zy.bA)
    {
      if (☃ > 0)
      {
        if (!☃.bA.d)
        {
          zx ☃ = new zx(zy.bz, 1, 0);
          if (!☃.bi.a(☃)) {
            ☃.d(new uz(☃, ☃.n() + 0.5D, ☃.o() + 1.5D, ☃.p() + 0.5D, ☃));
          } else if ((☃ instanceof lf)) {
            ((lf)☃).a(☃.bj);
          }
          ☃.b(na.J);
          
          ☃.b -= 1;
          if (☃.b <= 0) {
            ☃.bi.a(☃.bi.c, null);
          }
        }
        a(☃, ☃, ☃, ☃ - 1);
      }
      return true;
    }
    if ((☃ > 0) && ((☃ instanceof yj)))
    {
      yj ☃ = (yj)☃;
      if ((☃.x_() == yj.a.a) && (☃.d_(☃)))
      {
        ☃.c(☃);
        a(☃, ☃, ☃, ☃ - 1);
        ☃.b(na.K);
        return true;
      }
    }
    if ((☃ > 0) && ((☃ instanceof ym)) && 
      (aku.c(☃) > 0))
    {
      zx ☃ = ☃.k();
      ☃.b = 1;
      aku.e(☃);
      if ((☃.b > 1) || (☃.bA.d))
      {
        if (!☃.bi.a(☃)) {
          ☃.d(new uz(☃, ☃.n() + 0.5D, ☃.o() + 1.5D, ☃.p() + 0.5D, ☃));
        } else if ((☃ instanceof lf)) {
          ((lf)☃).a(☃.bj);
        }
        ☃.b(na.L);
        if (!☃.bA.d) {
          ☃.b -= 1;
        }
      }
      else
      {
        ☃.bi.a(☃.bi.c, ☃);
      }
      if (!☃.bA.d) {
        a(☃, ☃, ☃, ☃ - 1);
      }
      return true;
    }
    return false;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, int ☃)
  {
    ☃.a(☃, ☃.a(a, Integer.valueOf(ns.a(☃, 0, 3))), 2);
    ☃.e(☃, this);
  }
  
  public void k(adm ☃, cj ☃)
  {
    if (☃.s.nextInt(20) != 1) {
      return;
    }
    alz ☃ = ☃.p(☃);
    if (((Integer)☃.b(a)).intValue() < 3) {
      ☃.a(☃, ☃.a(a), 2);
    }
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.bG;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.bG;
  }
  
  public boolean O()
  {
    return true;
  }
  
  public int l(adm ☃, cj ☃)
  {
    return ((Integer)☃.p(☃).b(a)).intValue();
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Integer.valueOf(☃));
  }
  
  public int c(alz ☃)
  {
    return ((Integer)☃.b(a)).intValue();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
