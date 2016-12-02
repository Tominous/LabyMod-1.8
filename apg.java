import java.util.Random;

public abstract class apg
  extends aoh
{
  protected final int a;
  protected final alz b;
  protected final alz c;
  protected int d;
  
  public apg(boolean ☃, int ☃, int ☃, alz ☃, alz ☃)
  {
    super(☃);
    this.a = ☃;
    this.d = ☃;
    
    this.b = ☃;
    this.c = ☃;
  }
  
  protected int a(Random ☃)
  {
    int ☃ = ☃.nextInt(3) + this.a;
    if (this.d > 1) {
      ☃ += ☃.nextInt(this.d);
    }
    return ☃;
  }
  
  private boolean c(adm ☃, cj ☃, int ☃)
  {
    boolean ☃ = true;
    if ((☃.o() < 1) || (☃.o() + ☃ + 1 > 256)) {
      return false;
    }
    for (int ☃ = 0; ☃ <= 1 + ☃; ☃++)
    {
      int ☃ = 2;
      if (☃ == 0) {
        ☃ = 1;
      } else if (☃ >= 1 + ☃ - 2) {
        ☃ = 2;
      }
      for (int ☃ = -☃; (☃ <= ☃) && (☃); ☃++) {
        for (int ☃ = -☃; (☃ <= ☃) && (☃); ☃++) {
          if ((☃.o() + ☃ < 0) || (☃.o() + ☃ >= 256) || 
            (!a(☃.p(☃.a(☃, ☃, ☃)).c()))) {
            ☃ = false;
          }
        }
      }
    }
    return ☃;
  }
  
  private boolean a(cj ☃, adm ☃)
  {
    cj ☃ = ☃.b();
    afh ☃ = ☃.p(☃).c();
    if (((☃ != afi.c) && (☃ != afi.d)) || (☃.o() < 2)) {
      return false;
    }
    a(☃, ☃);
    a(☃, ☃.f());
    a(☃, ☃.d());
    a(☃, ☃.d().f());
    
    return true;
  }
  
  protected boolean a(adm ☃, Random ☃, cj ☃, int ☃)
  {
    return (c(☃, ☃, ☃)) && (a(☃, ☃));
  }
  
  protected void a(adm ☃, cj ☃, int ☃)
  {
    int ☃ = ☃ * ☃;
    for (int ☃ = -☃; ☃ <= ☃ + 1; ☃++) {
      for (int ☃ = -☃; ☃ <= ☃ + 1; ☃++)
      {
        int ☃ = ☃ - 1;
        int ☃ = ☃ - 1;
        if ((☃ * ☃ + ☃ * ☃ <= ☃) || (☃ * ☃ + ☃ * ☃ <= ☃) || (☃ * ☃ + ☃ * ☃ <= ☃) || (☃ * ☃ + ☃ * ☃ <= ☃))
        {
          cj ☃ = ☃.a(☃, 0, ☃);
          arm ☃ = ☃.p(☃).c().t();
          if ((☃ == arm.a) || (☃ == arm.j)) {
            a(☃, ☃, this.c);
          }
        }
      }
    }
  }
  
  protected void b(adm ☃, cj ☃, int ☃)
  {
    int ☃ = ☃ * ☃;
    for (int ☃ = -☃; ☃ <= ☃; ☃++) {
      for (int ☃ = -☃; ☃ <= ☃; ☃++) {
        if (☃ * ☃ + ☃ * ☃ <= ☃)
        {
          cj ☃ = ☃.a(☃, 0, ☃);
          arm ☃ = ☃.p(☃).c().t();
          if ((☃ == arm.a) || (☃ == arm.j)) {
            a(☃, ☃, this.c);
          }
        }
      }
    }
  }
}
