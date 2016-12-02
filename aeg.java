import java.util.List;
import java.util.Random;

public class aeg
  extends ady
{
  private int aG;
  protected static final aoj aD = new aoj(false, true);
  protected static final aoj aE = new aoj(false, false);
  protected static final apn aF = new apn(false);
  
  public aeg(int ☃, int ☃)
  {
    super(☃);
    aG = ☃;
    as.A = 10;
    as.C = 2;
    if (aG == 1)
    {
      as.A = 6;
      as.B = 100;
      as.C = 1;
    }
    a(5159473);
    a(0.7F, 0.8F);
    if (aG == 2)
    {
      aj = 353825;
      ai = 3175492;
      a(0.6F, 0.6F);
    }
    if (aG == 0) {
      au.add(new ady.c(ua.class, 5, 4, 4));
    }
    if (aG == 3) {
      as.A = 64537;
    }
  }
  
  protected ady a(int ☃, boolean ☃)
  {
    if (aG == 2)
    {
      aj = 353825;
      ai = ☃;
      if (☃) {
        aj = ((aj & 0xFEFEFE) >> 1);
      }
      return this;
    }
    return super.a(☃, ☃);
  }
  
  public aoh a(Random ☃)
  {
    if ((aG == 3) && (☃.nextInt(3) > 0)) {
      return aF;
    }
    if ((aG == 2) || (☃.nextInt(5) == 0)) {
      return aE;
    }
    return aA;
  }
  
  public agw.a a(Random ☃, cj ☃)
  {
    if (aG == 1)
    {
      double ☃ = ns.a((1.0D + af.a(☃.n() / 48.0D, ☃.p() / 48.0D)) / 2.0D, 0.0D, 0.9999D);
      agw.a ☃ = agw.a.values()[((int)(☃ * agw.a.values().length))];
      if (☃ == agw.a.c) {
        return agw.a.b;
      }
      return ☃;
    }
    return super.a(☃, ☃);
  }
  
  public void a(adm ☃, Random ☃, cj ☃)
  {
    if (aG == 3) {
      for (int ☃ = 0; ☃ < 4; ☃++) {
        for (int ☃ = 0; ☃ < 4; ☃++)
        {
          int ☃ = ☃ * 4 + 1 + 8 + ☃.nextInt(3);
          int ☃ = ☃ * 4 + 1 + 8 + ☃.nextInt(3);
          
          cj ☃ = ☃.m(☃.a(☃, 0, ☃));
          if (☃.nextInt(20) == 0)
          {
            aoz ☃ = new aoz();
            ☃.b(☃, ☃, ☃);
          }
          else
          {
            aoh ☃ = a(☃);
            ☃.e();
            if (☃.b(☃, ☃, ☃)) {
              ☃.a(☃, ☃, ☃);
            }
          }
        }
      }
    }
    int ☃ = ☃.nextInt(5) - 3;
    if (aG == 1) {
      ☃ += 2;
    }
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = ☃.nextInt(3);
      if (☃ == 0) {
        ag.a(agi.b.b);
      } else if (☃ == 1) {
        ag.a(agi.b.e);
      } else if (☃ == 2) {
        ag.a(agi.b.f);
      }
      for (int ☃ = 0; ☃ < 5; ☃++)
      {
        int ☃ = ☃.nextInt(16) + 8;
        int ☃ = ☃.nextInt(16) + 8;
        int ☃ = ☃.nextInt(☃.m(☃.a(☃, 0, ☃)).o() + 32);
        if (ag.b(☃, ☃, new cj(☃.n() + ☃, ☃, ☃.p() + ☃))) {
          break;
        }
      }
    }
    super.a(☃, ☃, ☃);
  }
  
  public int b(cj ☃)
  {
    int ☃ = super.b(☃);
    if (aG == 3) {
      return (☃ & 0xFEFEFE) + 2634762 >> 1;
    }
    return ☃;
  }
  
  protected ady d(int ☃)
  {
    if (az == taz)
    {
      aeg ☃ = new aeg(☃, 1);
      ☃.a(new ady.a(an, ao + 0.2F));
      ☃.a("Flower Forest");
      ☃.a(6976549, true);
      ☃.a(8233509);
      return ☃;
    }
    if ((az == Qaz) || (az == Raz)) {
      new aem(☃, this)
      {
        public aoh a(Random ☃)
        {
          if (☃.nextBoolean()) {
            return aeg.aD;
          }
          return aeg.aE;
        }
      };
    }
    new aem(☃, this)
    {
      public void a(adm ☃, Random ☃, cj ☃)
      {
        aE.a(☃, ☃, ☃);
      }
    };
  }
}
