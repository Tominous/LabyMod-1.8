import java.util.Random;

public class apc
  extends aot
{
  private afh a;
  
  public apc(afh ☃)
  {
    this.a = ☃;
  }
  
  public boolean b(adm ☃, Random ☃, cj ☃)
  {
    ☃ = ☃.a(-8, 0, -8);
    while ((☃.o() > 5) && (☃.d(☃))) {
      ☃ = ☃.b();
    }
    if (☃.o() <= 4) {
      return false;
    }
    ☃ = ☃.c(4);
    
    boolean[] ☃ = new boolean['ࠀ'];
    
    int ☃ = ☃.nextInt(4) + 4;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      double ☃ = ☃.nextDouble() * 6.0D + 3.0D;
      double ☃ = ☃.nextDouble() * 4.0D + 2.0D;
      double ☃ = ☃.nextDouble() * 6.0D + 3.0D;
      
      double ☃ = ☃.nextDouble() * (16.0D - ☃ - 2.0D) + 1.0D + ☃ / 2.0D;
      double ☃ = ☃.nextDouble() * (8.0D - ☃ - 4.0D) + 2.0D + ☃ / 2.0D;
      double ☃ = ☃.nextDouble() * (16.0D - ☃ - 2.0D) + 1.0D + ☃ / 2.0D;
      for (int ☃ = 1; ☃ < 15; ☃++) {
        for (int ☃ = 1; ☃ < 15; ☃++) {
          for (int ☃ = 1; ☃ < 7; ☃++)
          {
            double ☃ = (☃ - ☃) / (☃ / 2.0D);
            double ☃ = (☃ - ☃) / (☃ / 2.0D);
            double ☃ = (☃ - ☃) / (☃ / 2.0D);
            double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
            if (☃ < 1.0D) {
              ☃[((☃ * 16 + ☃) * 8 + ☃)] = true;
            }
          }
        }
      }
    }
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 0; ☃ < 8; ☃++)
        {
          boolean ☃ = (☃[((☃ * 16 + ☃) * 8 + ☃)] == 0) && (((☃ < 15) && (☃[(((☃ + 1) * 16 + ☃) * 8 + ☃)] != 0)) || ((☃ > 0) && (☃[(((☃ - 1) * 16 + ☃) * 8 + ☃)] != 0)) || ((☃ < 15) && (☃[((☃ * 16 + (☃ + 1)) * 8 + ☃)] != 0)) || ((☃ > 0) && (☃[((☃ * 16 + (☃ - 1)) * 8 + ☃)] != 0)) || ((☃ < 7) && (☃[((☃ * 16 + ☃) * 8 + (☃ + 1))] != 0)) || ((☃ > 0) && (☃[((☃ * 16 + ☃) * 8 + (☃ - 1))] != 0)));
          if (☃)
          {
            arm ☃ = ☃.p(☃.a(☃, ☃, ☃)).c().t();
            if ((☃ >= 4) && (☃.d())) {
              return false;
            }
            if ((☃ < 4) && (!☃.a()) && (☃.p(☃.a(☃, ☃, ☃)).c() != this.a)) {
              return false;
            }
          }
        }
      }
    }
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 0; ☃ < 8; ☃++) {
          if (☃[((☃ * 16 + ☃) * 8 + ☃)] != 0) {
            ☃.a(☃.a(☃, ☃, ☃), ☃ >= 4 ? afi.a.Q() : this.a.Q(), 2);
          }
        }
      }
    }
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 4; ☃ < 8; ☃++) {
          if (☃[((☃ * 16 + ☃) * 8 + ☃)] != 0)
          {
            cj ☃ = ☃.a(☃, ☃ - 1, ☃);
            if ((☃.p(☃).c() == afi.d) && (☃.b(ads.a, ☃.a(☃, ☃, ☃)) > 0))
            {
              ady ☃ = ☃.b(☃);
              if (☃.ak.c() == afi.bw) {
                ☃.a(☃, afi.bw.Q(), 2);
              } else {
                ☃.a(☃, afi.c.Q(), 2);
              }
            }
          }
        }
      }
    }
    if (this.a.t() == arm.i) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 0; ☃ < 16; ☃++) {
          for (int ☃ = 0; ☃ < 8; ☃++)
          {
            boolean ☃ = (☃[((☃ * 16 + ☃) * 8 + ☃)] == 0) && (((☃ < 15) && (☃[(((☃ + 1) * 16 + ☃) * 8 + ☃)] != 0)) || ((☃ > 0) && (☃[(((☃ - 1) * 16 + ☃) * 8 + ☃)] != 0)) || ((☃ < 15) && (☃[((☃ * 16 + (☃ + 1)) * 8 + ☃)] != 0)) || ((☃ > 0) && (☃[((☃ * 16 + (☃ - 1)) * 8 + ☃)] != 0)) || ((☃ < 7) && (☃[((☃ * 16 + ☃) * 8 + (☃ + 1))] != 0)) || ((☃ > 0) && (☃[((☃ * 16 + ☃) * 8 + (☃ - 1))] != 0)));
            if ((☃) && 
              ((☃ < 4) || (☃.nextInt(2) != 0)) && (☃.p(☃.a(☃, ☃, ☃)).c().t().a())) {
              ☃.a(☃.a(☃, ☃, ☃), afi.b.Q(), 2);
            }
          }
        }
      }
    }
    if (this.a.t() == arm.h) {
      for (int ☃ = 0; ☃ < 16; ☃++) {
        for (int ☃ = 0; ☃ < 16; ☃++)
        {
          int ☃ = 4;
          if (☃.v(☃.a(☃, ☃, ☃))) {
            ☃.a(☃.a(☃, ☃, ☃), afi.aI.Q(), 2);
          }
        }
      }
    }
    return true;
  }
}
