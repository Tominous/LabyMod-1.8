import java.util.Random;

public abstract class ahs
  extends akg
{
  public static final amk a = amk.a("decayable");
  public static final amk b = amk.a("check_decay");
  int[] N;
  protected int O;
  protected boolean P;
  
  public ahs()
  {
    super(arm.j, false);
    a(true);
    a(yz.c);
    c(0.2F);
    e(1);
    a(h);
  }
  
  public int H()
  {
    return adj.a(0.5D, 1.0D);
  }
  
  public int h(alz ☃)
  {
    return adj.c();
  }
  
  public int a(adq ☃, cj ☃, int ☃)
  {
    return aea.b(☃, ☃);
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    int ☃ = 1;
    int ☃ = ☃ + 1;
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    if (☃.a(new cj(☃ - ☃, ☃ - ☃, ☃ - ☃), new cj(☃ + ☃, ☃ + ☃, ☃ + ☃))) {
      for (int ☃ = -☃; ☃ <= ☃; ☃++) {
        for (int ☃ = -☃; ☃ <= ☃; ☃++) {
          for (int ☃ = -☃; ☃ <= ☃; ☃++)
          {
            cj ☃ = ☃.a(☃, ☃, ☃);
            alz ☃ = ☃.p(☃);
            if ((☃.c().t() == arm.j) && 
              (!((Boolean)☃.b(b)).booleanValue())) {
              ☃.a(☃, ☃.a(b, Boolean.valueOf(true)), 4);
            }
          }
        }
      }
    }
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (D) {
      return;
    }
    if ((((Boolean)☃.b(b)).booleanValue()) && (((Boolean)☃.b(a)).booleanValue()))
    {
      int ☃ = 4;
      int ☃ = ☃ + 1;
      int ☃ = ☃.n();
      int ☃ = ☃.o();
      int ☃ = ☃.p();
      
      int ☃ = 32;
      int ☃ = ☃ * ☃;
      int ☃ = ☃ / 2;
      if (N == null) {
        N = new int[☃ * ☃ * ☃];
      }
      if (☃.a(new cj(☃ - ☃, ☃ - ☃, ☃ - ☃), new cj(☃ + ☃, ☃ + ☃, ☃ + ☃)))
      {
        cj.a ☃ = new cj.a();
        for (int ☃ = -☃; ☃ <= ☃; ☃++) {
          for (int ☃ = -☃; ☃ <= ☃; ☃++) {
            for (int ☃ = -☃; ☃ <= ☃; ☃++)
            {
              afh ☃ = ☃.p(☃.c(☃ + ☃, ☃ + ☃, ☃ + ☃)).c();
              if ((☃ == afi.r) || (☃ == afi.s)) {
                N[((☃ + ☃) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃))] = 0;
              } else if (☃.t() == arm.j) {
                N[((☃ + ☃) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃))] = -2;
              } else {
                N[((☃ + ☃) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃))] = -1;
              }
            }
          }
        }
        for (int ☃ = 1; ☃ <= 4; ☃++) {
          for (int ☃ = -☃; ☃ <= ☃; ☃++) {
            for (int ☃ = -☃; ☃ <= ☃; ☃++) {
              for (int ☃ = -☃; ☃ <= ☃; ☃++) {
                if (N[((☃ + ☃) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃))] == ☃ - 1)
                {
                  if (N[((☃ + ☃ - 1) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃))] == -2) {
                    N[((☃ + ☃ - 1) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃))] = ☃;
                  }
                  if (N[((☃ + ☃ + 1) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃))] == -2) {
                    N[((☃ + ☃ + 1) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃))] = ☃;
                  }
                  if (N[((☃ + ☃) * ☃ + (☃ + ☃ - 1) * ☃ + (☃ + ☃))] == -2) {
                    N[((☃ + ☃) * ☃ + (☃ + ☃ - 1) * ☃ + (☃ + ☃))] = ☃;
                  }
                  if (N[((☃ + ☃) * ☃ + (☃ + ☃ + 1) * ☃ + (☃ + ☃))] == -2) {
                    N[((☃ + ☃) * ☃ + (☃ + ☃ + 1) * ☃ + (☃ + ☃))] = ☃;
                  }
                  if (N[((☃ + ☃) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃ - 1))] == -2) {
                    N[((☃ + ☃) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃ - 1))] = ☃;
                  }
                  if (N[((☃ + ☃) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃ + 1))] == -2) {
                    N[((☃ + ☃) * ☃ + (☃ + ☃) * ☃ + (☃ + ☃ + 1))] = ☃;
                  }
                }
              }
            }
          }
        }
      }
      int ☃ = N[(☃ * ☃ + ☃ * ☃ + ☃)];
      if (☃ >= 0) {
        ☃.a(☃, ☃.a(b, Boolean.valueOf(false)), 4);
      } else {
        e(☃, ☃);
      }
    }
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if ((☃.C(☃.a())) && (!adm.a(☃, ☃.b())) && (☃.nextInt(15) == 1))
    {
      double ☃ = ☃.n() + ☃.nextFloat();
      double ☃ = ☃.o() - 0.05D;
      double ☃ = ☃.p() + ☃.nextFloat();
      
      ☃.a(cy.s, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
    }
  }
  
  private void e(adm ☃, cj ☃)
  {
    b(☃, ☃, ☃.p(☃), 0);
    ☃.g(☃);
  }
  
  public int a(Random ☃)
  {
    return ☃.nextInt(20) == 0 ? 1 : 0;
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zw.a(afi.g);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    if (!D)
    {
      int ☃ = d(☃);
      if (☃ > 0)
      {
        ☃ -= (2 << ☃);
        if (☃ < 10) {
          ☃ = 10;
        }
      }
      if (s.nextInt(☃) == 0)
      {
        zw ☃ = a(☃, s, ☃);
        a(☃, ☃, new zx(☃, 1, a(☃)));
      }
      ☃ = 200;
      if (☃ > 0)
      {
        ☃ -= (10 << ☃);
        if (☃ < 40) {
          ☃ = 40;
        }
      }
      a(☃, ☃, ☃, ☃);
    }
  }
  
  protected void a(adm ☃, cj ☃, alz ☃, int ☃) {}
  
  protected int d(alz ☃)
  {
    return 20;
  }
  
  public boolean c()
  {
    return !R;
  }
  
  public void b(boolean ☃)
  {
    P = ☃;
    R = ☃;
    O = (☃ ? 0 : 1);
  }
  
  public adf m()
  {
    return P ? adf.b : adf.a;
  }
  
  public boolean w()
  {
    return false;
  }
  
  public abstract aio.a b(int paramInt);
}
