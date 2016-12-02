import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class aek
  extends ady
{
  private alz[] aD;
  private long aE;
  private ard aF;
  private ard aG;
  private ard aH;
  private boolean aI;
  private boolean aJ;
  
  public aek(int ☃, boolean ☃, boolean ☃)
  {
    super(☃);
    aI = ☃;
    aJ = ☃;
    
    b();
    a(2.0F, 0.0F);
    
    au.clear();
    ak = afi.m.Q().a(ajh.a, ajh.a.b);
    al = afi.cu.Q();
    
    as.A = 64537;
    as.D = 20;
    as.F = 3;
    as.G = 5;
    as.B = 0;
    
    au.clear();
    if (☃) {
      as.A = 5;
    }
  }
  
  public aoh a(Random ☃)
  {
    return aA;
  }
  
  public int c(cj ☃)
  {
    return 10387789;
  }
  
  public int b(cj ☃)
  {
    return 9470285;
  }
  
  public void a(adm ☃, Random ☃, cj ☃)
  {
    super.a(☃, ☃, ☃);
  }
  
  public void a(adm ☃, Random ☃, ans ☃, int ☃, int ☃, double ☃)
  {
    if ((aD == null) || (aE != ☃.J())) {
      a(☃.J());
    }
    if ((aF == null) || (aG == null) || (aE != ☃.J()))
    {
      Random ☃ = new Random(aE);
      aF = new ard(☃, 4);
      aG = new ard(☃, 1);
    }
    aE = ☃.J();
    
    double ☃ = 0.0D;
    if (aI)
    {
      int ☃ = (☃ & 0xFFFFFFF0) + (☃ & 0xF);
      int ☃ = (☃ & 0xFFFFFFF0) + (☃ & 0xF);
      
      double ☃ = Math.min(Math.abs(☃), aF.a(☃ * 0.25D, ☃ * 0.25D));
      if (☃ > 0.0D)
      {
        double ☃ = 0.001953125D;
        double ☃ = Math.abs(aG.a(☃ * ☃, ☃ * ☃));
        ☃ = ☃ * ☃ * 2.5D;
        double ☃ = Math.ceil(☃ * 50.0D) + 14.0D;
        if (☃ > ☃) {
          ☃ = ☃;
        }
        ☃ += 64.0D;
      }
    }
    int ☃ = ☃ & 0xF;
    int ☃ = ☃ & 0xF;
    
    int ☃ = ☃.F();
    
    alz ☃ = afi.cu.Q();
    alz ☃ = al;
    
    int ☃ = (int)(☃ / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
    boolean ☃ = Math.cos(☃ / 3.0D * 3.141592653589793D) > 0.0D;
    int ☃ = -1;
    boolean ☃ = false;
    for (int ☃ = 255; ☃ >= 0; ☃--)
    {
      if ((☃.a(☃, ☃, ☃).c().t() == arm.a) && (☃ < (int)☃)) {
        ☃.a(☃, ☃, ☃, afi.b.Q());
      }
      if (☃ <= ☃.nextInt(5))
      {
        ☃.a(☃, ☃, ☃, afi.h.Q());
      }
      else
      {
        alz ☃ = ☃.a(☃, ☃, ☃);
        if (☃.c().t() == arm.a) {
          ☃ = -1;
        } else if (☃.c() == afi.b) {
          if (☃ == -1)
          {
            ☃ = false;
            if (☃ <= 0)
            {
              ☃ = null;
              ☃ = afi.b.Q();
            }
            else if ((☃ >= ☃ - 4) && (☃ <= ☃ + 1))
            {
              ☃ = afi.cu.Q();
              ☃ = al;
            }
            if ((☃ < ☃) && ((☃ == null) || (☃.c().t() == arm.a))) {
              ☃ = afi.j.Q();
            }
            ☃ = ☃ + Math.max(0, ☃ - ☃);
            if (☃ >= ☃ - 1)
            {
              if ((aJ) && (☃ > 86 + ☃ * 2))
              {
                if (☃) {
                  ☃.a(☃, ☃, ☃, afi.d.Q().a(agf.a, agf.a.b));
                } else {
                  ☃.a(☃, ☃, ☃, afi.c.Q());
                }
              }
              else if (☃ > ☃ + 3 + ☃)
              {
                alz ☃;
                alz ☃;
                if ((☃ < 64) || (☃ > 127))
                {
                  ☃ = afi.cu.Q().a(afv.a, zd.b);
                }
                else
                {
                  alz ☃;
                  if (☃) {
                    ☃ = afi.cz.Q();
                  } else {
                    ☃ = a(☃, ☃, ☃);
                  }
                }
                ☃.a(☃, ☃, ☃, ☃);
              }
              else
              {
                ☃.a(☃, ☃, ☃, ak);
                ☃ = true;
              }
            }
            else
            {
              ☃.a(☃, ☃, ☃, ☃);
              if (☃.c() == afi.cu) {
                ☃.a(☃, ☃, ☃, ☃.c().Q().a(afv.a, zd.b));
              }
            }
          }
          else if (☃ > 0)
          {
            ☃--;
            if (☃)
            {
              ☃.a(☃, ☃, ☃, afi.cu.Q().a(afv.a, zd.b));
            }
            else
            {
              alz ☃ = a(☃, ☃, ☃);
              ☃.a(☃, ☃, ☃, ☃);
            }
          }
        }
      }
    }
  }
  
  private void a(long ☃)
  {
    aD = new alz[64];
    Arrays.fill(aD, afi.cz.Q());
    
    Random ☃ = new Random(☃);
    aH = new ard(☃, 1);
    for (int ☃ = 0; ☃ < 64; ☃++)
    {
      ☃ += ☃.nextInt(5) + 1;
      if (☃ < 64) {
        aD[☃] = afi.cu.Q().a(afv.a, zd.b);
      }
    }
    int ☃ = ☃.nextInt(4) + 2;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = ☃.nextInt(3) + 1;
      int ☃ = ☃.nextInt(64);
      for (int ☃ = 0; (☃ + ☃ < 64) && (☃ < ☃); ☃++) {
        aD[(☃ + ☃)] = afi.cu.Q().a(afv.a, zd.e);
      }
    }
    int ☃ = ☃.nextInt(4) + 2;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = ☃.nextInt(3) + 2;
      int ☃ = ☃.nextInt(64);
      for (int ☃ = 0; (☃ + ☃ < 64) && (☃ < ☃); ☃++) {
        aD[(☃ + ☃)] = afi.cu.Q().a(afv.a, zd.m);
      }
    }
    int ☃ = ☃.nextInt(4) + 2;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = ☃.nextInt(3) + 1;
      int ☃ = ☃.nextInt(64);
      for (int ☃ = 0; (☃ + ☃ < 64) && (☃ < ☃); ☃++) {
        aD[(☃ + ☃)] = afi.cu.Q().a(afv.a, zd.o);
      }
    }
    int ☃ = ☃.nextInt(3) + 3;
    int ☃ = 0;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = 1;
      ☃ += ☃.nextInt(16) + 4;
      for (int ☃ = 0; (☃ + ☃ < 64) && (☃ < ☃); ☃++)
      {
        aD[(☃ + ☃)] = afi.cu.Q().a(afv.a, zd.a);
        if ((☃ + ☃ > 1) && (☃.nextBoolean())) {
          aD[(☃ + ☃ - 1)] = afi.cu.Q().a(afv.a, zd.i);
        }
        if ((☃ + ☃ < 63) && (☃.nextBoolean())) {
          aD[(☃ + ☃ + 1)] = afi.cu.Q().a(afv.a, zd.i);
        }
      }
    }
  }
  
  private alz a(int ☃, int ☃, int ☃)
  {
    int ☃ = (int)Math.round(aH.a(☃ * 1.0D / 512.0D, ☃ * 1.0D / 512.0D) * 2.0D);
    return aD[((☃ + ☃ + 64) % 64)];
  }
  
  protected ady d(int ☃)
  {
    boolean ☃ = az == aaaz;
    
    aek ☃ = new aek(☃, ☃, aJ);
    if (!☃)
    {
      ☃.a(g);
      ☃.a(ah + " M");
    }
    else
    {
      ☃.a(ah + " (Bryce)");
    }
    ☃.a(ai, true);
    
    return ☃;
  }
}
