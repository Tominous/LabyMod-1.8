import java.util.Random;

public class aee
  extends ady
{
  private aot aD = new apj(afi.be.Q().a(ahz.a, ahz.a.a), 9);
  private aps aE = new aps(false);
  private int aF = 0;
  private int aG = 1;
  private int aH = 2;
  private int aI;
  
  protected aee(int ☃, boolean ☃)
  {
    super(☃);
    aI = aF;
    if (☃)
    {
      as.A = 3;
      aI = aG;
    }
  }
  
  public aoh a(Random ☃)
  {
    if (☃.nextInt(3) > 0) {
      return aE;
    }
    return super.a(☃);
  }
  
  public void a(adm ☃, Random ☃, cj ☃)
  {
    super.a(☃, ☃, ☃);
    
    int ☃ = 3 + ☃.nextInt(6);
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = ☃.nextInt(16);
      int ☃ = ☃.nextInt(28) + 4;
      int ☃ = ☃.nextInt(16);
      
      cj ☃ = ☃.a(☃, ☃, ☃);
      if (☃.p(☃).c() == afi.b) {
        ☃.a(☃, afi.bP.Q(), 2);
      }
    }
    for (int ☃ = 0; ☃ < 7; ☃++)
    {
      int ☃ = ☃.nextInt(16);
      int ☃ = ☃.nextInt(64);
      int ☃ = ☃.nextInt(16);
      aD.b(☃, ☃, ☃.a(☃, ☃, ☃));
    }
  }
  
  public void a(adm ☃, Random ☃, ans ☃, int ☃, int ☃, double ☃)
  {
    ak = afi.c.Q();
    al = afi.d.Q();
    if (((☃ < -1.0D) || (☃ > 2.0D)) && (aI == aH))
    {
      ak = afi.n.Q();
      al = afi.n.Q();
    }
    else if ((☃ > 1.0D) && (aI != aG))
    {
      ak = afi.b.Q();
      al = afi.b.Q();
    }
    b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  private aee b(ady ☃)
  {
    aI = aH;
    
    a(ai, true);
    a(ah + " M");
    a(new ady.a(an, ao));
    a(ap, aq);
    return this;
  }
  
  protected ady d(int ☃)
  {
    return new aee(☃, false).b(this);
  }
}
