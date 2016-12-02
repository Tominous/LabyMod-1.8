import java.util.Random;

public class anr
  extends any
{
  private float[] d = new float['Ѐ'];
  
  protected void a(long ☃, int ☃, int ☃, ans ☃, double ☃, double ☃, double ☃, float ☃, float ☃, float ☃, int ☃, int ☃, double ☃)
  {
    Random ☃ = new Random(☃);
    
    double ☃ = ☃ * 16 + 8;
    double ☃ = ☃ * 16 + 8;
    
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    if (☃ <= 0)
    {
      int ☃ = this.a * 16 - 16;
      ☃ = ☃ - ☃.nextInt(☃ / 4);
    }
    boolean ☃ = false;
    if (☃ == -1)
    {
      ☃ = ☃ / 2;
      ☃ = true;
    }
    float ☃ = 1.0F;
    for (int ☃ = 0; ☃ < 256; ☃++)
    {
      if ((☃ == 0) || (☃.nextInt(3) == 0)) {
        ☃ = 1.0F + ☃.nextFloat() * ☃.nextFloat() * 1.0F;
      }
      this.d[☃] = (☃ * ☃);
    }
    for (; ☃ < ☃; ☃++)
    {
      double ☃ = 1.5D + ns.a(☃ * 3.1415927F / ☃) * ☃ * 1.0F;
      double ☃ = ☃ * ☃;
      
      ☃ *= (☃.nextFloat() * 0.25D + 0.75D);
      ☃ *= (☃.nextFloat() * 0.25D + 0.75D);
      
      float ☃ = ns.b(☃);
      float ☃ = ns.a(☃);
      ☃ += ns.b(☃) * ☃;
      ☃ += ☃;
      ☃ += ns.a(☃) * ☃;
      
      ☃ *= 0.7F;
      
      ☃ += ☃ * 0.05F;
      ☃ += ☃ * 0.05F;
      
      ☃ *= 0.8F;
      ☃ *= 0.5F;
      ☃ += (☃.nextFloat() - ☃.nextFloat()) * ☃.nextFloat() * 2.0F;
      ☃ += (☃.nextFloat() - ☃.nextFloat()) * ☃.nextFloat() * 4.0F;
      if ((☃) || (☃.nextInt(4) != 0))
      {
        double ☃ = ☃ - ☃;
        double ☃ = ☃ - ☃;
        double ☃ = ☃ - ☃;
        double ☃ = ☃ + 2.0F + 16.0F;
        if (☃ * ☃ + ☃ * ☃ - ☃ * ☃ > ☃ * ☃) {
          return;
        }
        if ((☃ >= ☃ - 16.0D - ☃ * 2.0D) && (☃ >= ☃ - 16.0D - ☃ * 2.0D) && (☃ <= ☃ + 16.0D + ☃ * 2.0D) && (☃ <= ☃ + 16.0D + ☃ * 2.0D))
        {
          int ☃ = ns.c(☃ - ☃) - ☃ * 16 - 1;
          int ☃ = ns.c(☃ + ☃) - ☃ * 16 + 1;
          
          int ☃ = ns.c(☃ - ☃) - 1;
          int ☃ = ns.c(☃ + ☃) + 1;
          
          int ☃ = ns.c(☃ - ☃) - ☃ * 16 - 1;
          int ☃ = ns.c(☃ + ☃) - ☃ * 16 + 1;
          if (☃ < 0) {
            ☃ = 0;
          }
          if (☃ > 16) {
            ☃ = 16;
          }
          if (☃ < 1) {
            ☃ = 1;
          }
          if (☃ > 248) {
            ☃ = 248;
          }
          if (☃ < 0) {
            ☃ = 0;
          }
          if (☃ > 16) {
            ☃ = 16;
          }
          boolean ☃ = false;
          for (int ☃ = ☃; (!☃) && (☃ < ☃); ☃++) {
            for (int ☃ = ☃; (!☃) && (☃ < ☃); ☃++) {
              for (int ☃ = ☃ + 1; (!☃) && (☃ >= ☃ - 1); ☃--) {
                if ((☃ >= 0) && (☃ < 256))
                {
                  alz ☃ = ☃.a(☃, ☃, ☃);
                  if ((☃.c() == afi.i) || (☃.c() == afi.j)) {
                    ☃ = true;
                  }
                  if ((☃ != ☃ - 1) && (☃ != ☃) && (☃ != ☃ - 1) && (☃ != ☃) && (☃ != ☃ - 1)) {
                    ☃ = ☃;
                  }
                }
              }
            }
          }
          if (!☃)
          {
            cj.a ☃ = new cj.a();
            for (int ☃ = ☃; ☃ < ☃; ☃++)
            {
              double ☃ = (☃ + ☃ * 16 + 0.5D - ☃) / ☃;
              for (int ☃ = ☃; ☃ < ☃; ☃++)
              {
                double ☃ = (☃ + ☃ * 16 + 0.5D - ☃) / ☃;
                boolean ☃ = false;
                if (☃ * ☃ + ☃ * ☃ < 1.0D) {
                  for (int ☃ = ☃; ☃ > ☃; ☃--)
                  {
                    double ☃ = (☃ - 1 + 0.5D - ☃) / ☃;
                    if ((☃ * ☃ + ☃ * ☃) * this.d[(☃ - 1)] + ☃ * ☃ / 6.0D < 1.0D)
                    {
                      alz ☃ = ☃.a(☃, ☃, ☃);
                      if (☃.c() == afi.c) {
                        ☃ = true;
                      }
                      if ((☃.c() == afi.b) || (☃.c() == afi.d) || (☃.c() == afi.c)) {
                        if (☃ - 1 < 10)
                        {
                          ☃.a(☃, ☃, ☃, afi.k.Q());
                        }
                        else
                        {
                          ☃.a(☃, ☃, ☃, afi.a.Q());
                          if ((☃) && (☃.a(☃, ☃ - 1, ☃).c() == afi.d))
                          {
                            ☃.c(☃ + ☃ * 16, 0, ☃ + ☃ * 16);
                            ☃.a(☃, ☃ - 1, ☃, this.c.b(☃).ak);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            if (☃) {
              break;
            }
          }
        }
      }
    }
  }
  
  protected void a(adm ☃, int ☃, int ☃, int ☃, int ☃, ans ☃)
  {
    if (this.b.nextInt(50) != 0) {
      return;
    }
    double ☃ = ☃ * 16 + this.b.nextInt(16);
    double ☃ = this.b.nextInt(this.b.nextInt(40) + 8) + 20;
    double ☃ = ☃ * 16 + this.b.nextInt(16);
    
    int ☃ = 1;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      float ☃ = this.b.nextFloat() * 3.1415927F * 2.0F;
      float ☃ = (this.b.nextFloat() - 0.5F) * 2.0F / 8.0F;
      float ☃ = (this.b.nextFloat() * 2.0F + this.b.nextFloat()) * 2.0F;
      
      a(this.b.nextLong(), ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, 0, 0, 3.0D);
    }
  }
}
