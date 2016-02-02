import java.util.List;
import java.util.Random;

public class aeu
  extends ady
{
  private static final apk aD = new apk();
  private static final aps aE = new aps(false);
  private static final apf aF = new apf(false, false);
  private static final apf aG = new apf(false, true);
  private static final aok aH = new aok(afi.Y, 0);
  private int aI;
  
  public aeu(int ☃, int ☃)
  {
    super(☃);
    this.aI = ☃;
    
    this.au.add(new ady.c(ua.class, 8, 4, 4));
    
    this.as.A = 10;
    if ((☃ == 1) || (☃ == 2))
    {
      this.as.C = 7;
      this.as.D = 1;
      this.as.E = 3;
    }
    else
    {
      this.as.C = 1;
      this.as.E = 1;
    }
  }
  
  public aoh a(Random ☃)
  {
    if (((this.aI == 1) || (this.aI == 2)) && (☃.nextInt(3) == 0))
    {
      if ((this.aI == 2) || (☃.nextInt(13) == 0)) {
        return aG;
      }
      return aF;
    }
    if (☃.nextInt(3) == 0) {
      return aD;
    }
    return aE;
  }
  
  public aot b(Random ☃)
  {
    if (☃.nextInt(5) > 0) {
      return new apu(akc.a.c);
    }
    return new apu(akc.a.b);
  }
  
  public void a(adm ☃, Random ☃, cj ☃)
  {
    if ((this.aI == 1) || (this.aI == 2))
    {
      int ☃ = ☃.nextInt(3);
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        int ☃ = ☃.nextInt(16) + 8;
        int ☃ = ☃.nextInt(16) + 8;
        cj ☃ = ☃.m(☃.a(☃, 0, ☃));
        aH.b(☃, ☃, ☃);
      }
    }
    ag.a(agi.b.d);
    for (int ☃ = 0; ☃ < 7; ☃++)
    {
      int ☃ = ☃.nextInt(16) + 8;
      int ☃ = ☃.nextInt(16) + 8;
      int ☃ = ☃.nextInt(☃.m(☃.a(☃, 0, ☃)).o() + 32);
      ag.b(☃, ☃, ☃.a(☃, ☃, ☃));
    }
    super.a(☃, ☃, ☃);
  }
  
  public void a(adm ☃, Random ☃, ans ☃, int ☃, int ☃, double ☃)
  {
    if ((this.aI == 1) || (this.aI == 2))
    {
      this.ak = afi.c.Q();
      this.al = afi.d.Q();
      if (☃ > 1.75D) {
        this.ak = afi.d.Q().a(agf.a, agf.a.b);
      } else if (☃ > -0.95D) {
        this.ak = afi.d.Q().a(agf.a, agf.a.c);
      }
    }
    b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected ady d(int ☃)
  {
    if (this.az == ady.V.az) {
      return new aeu(☃, 2).a(5858897, true).a("Mega Spruce Taiga").a(5159473).a(0.25F, 0.8F).a(new ady.a(this.an, this.ao));
    }
    return super.d(☃);
  }
}
