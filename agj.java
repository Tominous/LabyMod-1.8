import java.util.Random;

public class agj
  extends afh
{
  public agj()
  {
    super(arm.D, arn.E);
    
    a(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    ☃.a(☃, this, a(☃));
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    ☃.a(☃, this, a(☃));
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    e(☃, ☃);
  }
  
  private void e(adm ☃, cj ☃)
  {
    if ((!agr.e(☃, ☃.b())) || (☃.o() < 0)) {
      return;
    }
    int ☃ = 32;
    if ((agr.N) || (!☃.a(☃.a(-☃, -☃, -☃), ☃.a(☃, ☃, ☃))))
    {
      ☃.g(☃);
      
      cj ☃ = ☃;
      while ((agr.e(☃, ☃)) && (☃.o() > 0)) {
        ☃ = ☃.b();
      }
      if (☃.o() > 0) {
        ☃.a(☃, Q(), 2);
      }
    }
    else
    {
      ☃.d(new uy(☃, ☃.n() + 0.5F, ☃.o(), ☃.p() + 0.5F, Q()));
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    f(☃, ☃);
    return true;
  }
  
  public void a(adm ☃, cj ☃, wn ☃)
  {
    f(☃, ☃);
  }
  
  private void f(adm ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    if (☃.c() != this) {
      return;
    }
    for (int ☃ = 0; ☃ < 1000; ☃++)
    {
      cj ☃ = ☃.a(s.nextInt(16) - s.nextInt(16), s.nextInt(8) - s.nextInt(8), s.nextInt(16) - s.nextInt(16));
      if (pcJ == arm.a)
      {
        if (D)
        {
          for (int ☃ = 0; ☃ < 128; ☃++)
          {
            double ☃ = s.nextDouble();
            float ☃ = (s.nextFloat() - 0.5F) * 0.2F;
            float ☃ = (s.nextFloat() - 0.5F) * 0.2F;
            float ☃ = (s.nextFloat() - 0.5F) * 0.2F;
            
            double ☃ = ☃.n() + (☃.n() - ☃.n()) * ☃ + (s.nextDouble() - 0.5D) * 1.0D + 0.5D;
            double ☃ = ☃.o() + (☃.o() - ☃.o()) * ☃ + s.nextDouble() * 1.0D - 0.5D;
            double ☃ = ☃.p() + (☃.p() - ☃.p()) * ☃ + (s.nextDouble() - 0.5D) * 1.0D + 0.5D;
            ☃.a(cy.y, ☃, ☃, ☃, ☃, ☃, ☃, new int[0]);
          }
        }
        else
        {
          ☃.a(☃, ☃, 2);
          ☃.g(☃);
        }
        return;
      }
    }
  }
  
  public int a(adm ☃)
  {
    return 5;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    return true;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return null;
  }
}
