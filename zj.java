import java.util.Random;

public class zj
  extends zw
{
  public zj()
  {
    a(yz.f);
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    alz ☃ = ☃.p(☃);
    if ((☃.a(☃.a(☃), ☃, ☃)) && (☃.c() == afi.bG) && (!((Boolean)☃.b(ago.b)).booleanValue()))
    {
      if (☃.D) {
        return true;
      }
      ☃.a(☃, ☃.a(ago.b, Boolean.valueOf(true)), 2);
      ☃.e(☃, afi.bG);
      ☃.b -= 1;
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        double ☃ = ☃.n() + (5.0F + g.nextFloat() * 6.0F) / 16.0F;
        double ☃ = ☃.o() + 0.8125F;
        double ☃ = ☃.p() + (5.0F + g.nextFloat() * 6.0F) / 16.0F;
        double ☃ = 0.0D;
        double ☃ = 0.0D;
        double ☃ = 0.0D;
        
        ☃.a(cy.l, ☃, ☃, ☃, ☃, ☃, ☃, new int[0]);
      }
      cq ☃ = (cq)☃.b(ago.a);
      
      int ☃ = 0;
      int ☃ = 0;
      boolean ☃ = false;
      boolean ☃ = true;
      cq ☃ = ☃.e();
      for (int ☃ = -2; ☃ <= 2; ☃++)
      {
        cj ☃ = ☃.a(☃, ☃);
        alz ☃ = ☃.p(☃);
        if (☃.c() == afi.bG)
        {
          if (!((Boolean)☃.b(ago.b)).booleanValue())
          {
            ☃ = false;
            break;
          }
          ☃ = ☃;
          if (!☃)
          {
            ☃ = ☃;
            ☃ = true;
          }
        }
      }
      if ((☃) && (☃ == ☃ + 2))
      {
        cj ☃ = ☃.a(☃, 4);
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          cj ☃ = ☃.a(☃, ☃);
          alz ☃ = ☃.p(☃);
          if ((☃.c() != afi.bG) || (!((Boolean)☃.b(ago.b)).booleanValue()))
          {
            ☃ = false;
            break;
          }
        }
        for (int ☃ = ☃ - 1; ☃ <= ☃ + 1; ☃ += 4)
        {
          ☃ = ☃.a(☃, ☃);
          for (int ☃ = 1; ☃ <= 3; ☃++)
          {
            cj ☃ = ☃.a(☃, ☃);
            alz ☃ = ☃.p(☃);
            if ((☃.c() != afi.bG) || (!((Boolean)☃.b(ago.b)).booleanValue()))
            {
              ☃ = false;
              break;
            }
          }
        }
        if (☃) {
          for (int ☃ = ☃; ☃ <= ☃; ☃++)
          {
            ☃ = ☃.a(☃, ☃);
            for (int ☃ = 1; ☃ <= 3; ☃++)
            {
              cj ☃ = ☃.a(☃, ☃);
              
              ☃.a(☃, afi.bF.Q(), 2);
            }
          }
        }
      }
      return true;
    }
    return false;
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    auh ☃ = a(☃, ☃, false);
    if ((☃ != null) && (☃.a == auh.a.b) && 
      (☃.p(☃.a()).c() == afi.bG)) {
      return ☃;
    }
    if (!☃.D)
    {
      cj ☃ = ☃.a("Stronghold", new cj(☃));
      if (☃ != null)
      {
        wr ☃ = new wr(☃, ☃.s, ☃.t, ☃.u);
        ☃.a(☃);
        ☃.d(☃);
        
        ☃.a(☃, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
        ☃.a(null, 1002, new cj(☃), 0);
        if (!☃.bA.d) {
          ☃.b -= 1;
        }
        ☃.b(na.ad[zw.b(this)]);
      }
    }
    return ☃;
  }
}
