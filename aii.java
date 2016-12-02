import com.google.common.collect.Lists;
import java.util.List;

public class aii
  extends afc
{
  private static final List<String> a = Lists.newArrayList(new String[] { "harp", "bd", "snare", "hat", "bassattack" });
  
  public aii()
  {
    super(arm.d);
    a(yz.d);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    boolean ☃ = ☃.z(☃);
    
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alm))
    {
      alm ☃ = (alm)☃;
      if (☃.f != ☃)
      {
        if (☃) {
          ☃.a(☃, ☃);
        }
        ☃.f = ☃;
      }
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alm))
    {
      alm ☃ = (alm)☃;
      
      ☃.b();
      ☃.a(☃, ☃);
      ☃.b(na.S);
    }
    return true;
  }
  
  public void a(adm ☃, cj ☃, wn ☃)
  {
    if (☃.D) {
      return;
    }
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof alm))
    {
      ((alm)☃).a(☃, ☃);
      ☃.b(na.R);
    }
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new alm();
  }
  
  private String b(int ☃)
  {
    if ((☃ < 0) || (☃ >= a.size())) {
      ☃ = 0;
    }
    return (String)a.get(☃);
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, int ☃, int ☃)
  {
    float ☃ = (float)Math.pow(2.0D, (☃ - 12) / 12.0D);
    
    ☃.a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, "note." + b(☃), 3.0F, ☃);
    ☃.a(cy.x, ☃.n() + 0.5D, ☃.o() + 1.2D, ☃.p() + 0.5D, ☃ / 24.0D, 0.0D, 0.0D, new int[0]);
    return true;
  }
  
  public int b()
  {
    return 3;
  }
}
