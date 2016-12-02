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
    this.aI = ☃;
    this.aJ = ☃;
    
    b();
    a(2.0F, 0.0F);
    
    this.au.clear();
    this.ak = afi.m.Q().a(ajh.a, ajh.a.b);
    this.al = afi.cu.Q();
    
    this.as.A = 64537;
    this.as.D = 20;
    this.as.F = 3;
    this.as.G = 5;
    this.as.B = 0;
    
    this.au.clear();
    if (☃) {
      this.as.A = 5;
    }
  }
  
  public aoh a(Random ☃)
  {
    return this.aA;
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
    if ((this.aD == null) || (this.aE != ☃.J())) {
      a(☃.J());
    }
    if ((this.aF == null) || (this.aG == null) || (this.aE != ☃.J()))
    {
      Random ☃ = new Random(this.aE);
      this.aF = new ard(☃, 4);
      this.aG = new ard(☃, 1);
    }
    this.aE = ☃.J();
    
    double ☃ = 0.0D;
    if (this.aI)
    {
      int ☃ = (☃ & 0xFFFFFFF0) + (☃ & 0xF);
      int ☃ = (☃ & 0xFFFFFFF0) + (☃ & 0xF);
      
      double ☃ = Math.min(Math.abs(☃), this.aF.a(☃ * 0.25D, ☃ * 0.25D));
      if (☃ > 0.0D)
      {
        double ☃ = 0.001953125D;
        double ☃ = Math.abs(this.aG.a(☃ * ☃, ☃ * ☃));
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
    alz ☃ = this.al;
    
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
              ☃ = this.al;
            }
            if ((☃ < ☃) && ((☃ == null) || (☃.c().t() == arm.a))) {
              ☃ = afi.j.Q();
            }
            ☃ = ☃ + Math.max(0, ☃ - ☃);
            if (☃ >= ☃ - 1)
            {
              if ((this.aJ) && (☃ > 86 + ☃ * 2))
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
                ☃.a(☃, ☃, ☃, this.ak);
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
    this.aD = new alz[64];
    Arrays.fill(this.aD, afi.cz.Q());
    
    Random ☃ = new Random(☃);
    this.aH = new ard(☃, 1);
    for (int ☃ = 0; ☃ < 64; ☃++)
    {
      ☃ += ☃.nextInt(5) + 1;
      if (☃ < 64) {
        this.aD[☃] = afi.cu.Q().a(afv.a, zd.b);
      }
    }
    int ☃ = ☃.nextInt(4) + 2;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = ☃.nextInt(3) + 1;
      int ☃ = ☃.nextInt(64);
      for (int ☃ = 0; (☃ + ☃ < 64) && (☃ < ☃); ☃++) {
        this.aD[(☃ + ☃)] = afi.cu.Q().a(afv.a, zd.e);
      }
    }
    int ☃ = ☃.nextInt(4) + 2;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = ☃.nextInt(3) + 2;
      int ☃ = ☃.nextInt(64);
      for (int ☃ = 0; (☃ + ☃ < 64) && (☃ < ☃); ☃++) {
        this.aD[(☃ + ☃)] = afi.cu.Q().a(afv.a, zd.m);
      }
    }
    int ☃ = ☃.nextInt(4) + 2;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = ☃.nextInt(3) + 1;
      int ☃ = ☃.nextInt(64);
      for (int ☃ = 0; (☃ + ☃ < 64) && (☃ < ☃); ☃++) {
        this.aD[(☃ + ☃)] = afi.cu.Q().a(afv.a, zd.o);
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
        this.aD[(☃ + ☃)] = afi.cu.Q().a(afv.a, zd.a);
        if ((☃ + ☃ > 1) && (☃.nextBoolean())) {
          this.aD[(☃ + ☃ - 1)] = afi.cu.Q().a(afv.a, zd.i);
        }
        if ((☃ + ☃ < 63) && (☃.nextBoolean())) {
          this.aD[(☃ + ☃ + 1)] = afi.cu.Q().a(afv.a, zd.i);
        }
      }
    }
  }
  
  private alz a(int ☃, int ☃, int ☃)
  {
    int ☃ = (int)Math.round(this.aH.a(☃ * 1.0D / 512.0D, ☃ * 1.0D / 512.0D) * 2.0D);
    return this.aD[((☃ + ☃ + 64) % 64)];
  }
  
  protected ady d(int ☃)
  {
    boolean ☃ = this.az == ady.aa.az;
    
    aek ☃ = new aek(☃, ☃, this.aJ);
    if (!☃)
    {
      ☃.a(g);
      ☃.a(this.ah + " M");
    }
    else
    {
      ☃.a(this.ah + " (Bryce)");
    }
    ☃.a(this.ai, true);
    
    return ☃;
  }
}
