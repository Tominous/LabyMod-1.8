import java.util.Random;

public class ake
  extends afh
{
  public static final amk a = amk.a("explode");
  
  public ake()
  {
    super(arm.u);
    j(M.b().a(a, Boolean.valueOf(false)));
    a(yz.d);
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    super.c(☃, ☃, ☃);
    if (☃.z(☃))
    {
      d(☃, ☃, ☃.a(a, Boolean.valueOf(true)));
      ☃.g(☃);
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (☃.z(☃))
    {
      d(☃, ☃, ☃.a(a, Boolean.valueOf(true)));
      ☃.g(☃);
    }
  }
  
  public void a(adm ☃, cj ☃, adi ☃)
  {
    if (D) {
      return;
    }
    vj ☃ = new vj(☃, ☃.n() + 0.5F, ☃.o(), ☃.p() + 0.5F, ☃.c());
    a = (s.nextInt(a / 4) + a / 8);
    ☃.d(☃);
  }
  
  public void d(adm ☃, cj ☃, alz ☃)
  {
    a(☃, ☃, ☃, null);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃)
  {
    if (D) {
      return;
    }
    if (((Boolean)☃.b(a)).booleanValue())
    {
      vj ☃ = new vj(☃, ☃.n() + 0.5F, ☃.o(), ☃.p() + 0.5F, ☃);
      ☃.d(☃);
      ☃.a(☃, "game.tnt.primed", 1.0F, 1.0F);
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.bZ() != null)
    {
      zw ☃ = ☃.bZ().b();
      if ((☃ == zy.d) || (☃ == zy.bL))
      {
        a(☃, ☃, ☃.a(a, Boolean.valueOf(true)), ☃);
        ☃.g(☃);
        if (☃ == zy.d) {
          ☃.bZ().a(1, ☃);
        } else if (!bA.d) {
          bZb -= 1;
        }
        return true;
      }
    }
    return super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pk ☃)
  {
    if ((!D) && ((☃ instanceof wq)))
    {
      wq ☃ = (wq)☃;
      if (☃.at())
      {
        a(☃, ☃, ☃.p(☃).a(a, Boolean.valueOf(true)), (c instanceof pr) ? (pr)c : null);
        ☃.g(☃);
      }
    }
  }
  
  public boolean a(adi ☃)
  {
    return false;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Boolean.valueOf((☃ & 0x1) > 0));
  }
  
  public int c(alz ☃)
  {
    return ((Boolean)☃.b(a)).booleanValue() ? 1 : 0;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
