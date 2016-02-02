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
    this.aG = ☃;
    this.as.A = 10;
    this.as.C = 2;
    if (this.aG == 1)
    {
      this.as.A = 6;
      this.as.B = 100;
      this.as.C = 1;
    }
    a(5159473);
    a(0.7F, 0.8F);
    if (this.aG == 2)
    {
      this.aj = 353825;
      this.ai = 3175492;
      a(0.6F, 0.6F);
    }
    if (this.aG == 0) {
      this.au.add(new ady.c(ua.class, 5, 4, 4));
    }
    if (this.aG == 3) {
      this.as.A = 64537;
    }
  }
  
  protected ady a(int ☃, boolean ☃)
  {
    if (this.aG == 2)
    {
      this.aj = 353825;
      this.ai = ☃;
      if (☃) {
        this.aj = ((this.aj & 0xFEFEFE) >> 1);
      }
      return this;
    }
    return super.a(☃, ☃);
  }
  
  public aoh a(Random ☃)
  {
    if ((this.aG == 3) && (☃.nextInt(3) > 0)) {
      return aF;
    }
    if ((this.aG == 2) || (☃.nextInt(5) == 0)) {
      return aE;
    }
    return this.aA;
  }
  
  public agw.a a(Random ☃, cj ☃)
  {
    if (this.aG == 1)
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
    if (this.aG == 3) {
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
    if (this.aG == 1) {
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
    if (this.aG == 3) {
      return (☃ & 0xFEFEFE) + 2634762 >> 1;
    }
    return ☃;
  }
  
  protected ady d(int ☃)
  {
    if (this.az == ady.t.az)
    {
      aeg ☃ = new aeg(☃, 1);
      ☃.a(new ady.a(this.an, this.ao + 0.2F));
      ☃.a("Flower Forest");
      ☃.a(6976549, true);
      ☃.a(8233509);
      return ☃;
    }
    if ((this.az == ady.Q.az) || (this.az == ady.R.az)) {
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
        this.aE.a(☃, ☃, ☃);
      }
    };
  }
}
