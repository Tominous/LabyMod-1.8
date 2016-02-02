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
    this.aI = this.aF;
    if (☃)
    {
      this.as.A = 3;
      this.aI = this.aG;
    }
  }
  
  public aoh a(Random ☃)
  {
    if (☃.nextInt(3) > 0) {
      return this.aE;
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
      this.aD.b(☃, ☃, ☃.a(☃, ☃, ☃));
    }
  }
  
  public void a(adm ☃, Random ☃, ans ☃, int ☃, int ☃, double ☃)
  {
    this.ak = afi.c.Q();
    this.al = afi.d.Q();
    if (((☃ < -1.0D) || (☃ > 2.0D)) && (this.aI == this.aH))
    {
      this.ak = afi.n.Q();
      this.al = afi.n.Q();
    }
    else if ((☃ > 1.0D) && (this.aI != this.aG))
    {
      this.ak = afi.b.Q();
      this.al = afi.b.Q();
    }
    b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  private aee b(ady ☃)
  {
    this.aI = this.aH;
    
    a(☃.ai, true);
    a(☃.ah + " M");
    a(new ady.a(☃.an, ☃.ao));
    a(☃.ap, ☃.aq);
    return this;
  }
  
  protected ady d(int ☃)
  {
    return new aee(☃, false).b(this);
  }
}
