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
    aI = ☃;
    
    au.add(new ady.c(ua.class, 8, 4, 4));
    
    as.A = 10;
    if ((☃ == 1) || (☃ == 2))
    {
      as.C = 7;
      as.D = 1;
      as.E = 3;
    }
    else
    {
      as.C = 1;
      as.E = 1;
    }
  }
  
  public aoh a(Random ☃)
  {
    if (((aI == 1) || (aI == 2)) && (☃.nextInt(3) == 0))
    {
      if ((aI == 2) || (☃.nextInt(13) == 0)) {
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
    if ((aI == 1) || (aI == 2))
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
    if ((aI == 1) || (aI == 2))
    {
      ak = afi.c.Q();
      al = afi.d.Q();
      if (☃ > 1.75D) {
        ak = afi.d.Q().a(agf.a, agf.a.b);
      } else if (☃ > -0.95D) {
        ak = afi.d.Q().a(agf.a, agf.a.c);
      }
    }
    b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected ady d(int ☃)
  {
    if (az == Vaz) {
      return new aeu(☃, 2).a(5858897, true).a("Mega Spruce Taiga").a(5159473).a(0.25F, 0.8F).a(new ady.a(an, ao));
    }
    return super.d(☃);
  }
}
