import java.util.List;
import java.util.Random;

public class aer
  extends ady
{
  private static final app aD = new app(false);
  
  protected aer(int ☃)
  {
    super(☃);
    
    this.au.add(new ady.c(tp.class, 1, 2, 6));
    
    this.as.A = 1;
    this.as.B = 4;
    this.as.C = 20;
  }
  
  public aoh a(Random ☃)
  {
    if (☃.nextInt(5) > 0) {
      return aD;
    }
    return this.aA;
  }
  
  protected ady d(int ☃)
  {
    ady ☃ = new aer.a(☃, this);
    
    ☃.ap = ((this.ap + 1.0F) * 0.5F);
    ☃.an = (this.an * 0.5F + 0.3F);
    ☃.ao = (this.ao * 0.5F + 1.2F);
    
    return ☃;
  }
  
  public void a(adm ☃, Random ☃, cj ☃)
  {
    ag.a(agi.b.c);
    for (int ☃ = 0; ☃ < 7; ☃++)
    {
      int ☃ = ☃.nextInt(16) + 8;
      int ☃ = ☃.nextInt(16) + 8;
      int ☃ = ☃.nextInt(☃.m(☃.a(☃, 0, ☃)).o() + 32);
      ag.b(☃, ☃, ☃.a(☃, ☃, ☃));
    }
    super.a(☃, ☃, ☃);
  }
  
  public static class a
    extends aem
  {
    public a(int ☃, ady ☃)
    {
      super(☃);
      
      this.as.A = 2;
      this.as.B = 2;
      this.as.C = 5;
    }
    
    public void a(adm ☃, Random ☃, ans ☃, int ☃, int ☃, double ☃)
    {
      this.ak = afi.c.Q();
      this.al = afi.d.Q();
      if (☃ > 1.75D)
      {
        this.ak = afi.b.Q();
        this.al = afi.b.Q();
      }
      else if (☃ > -0.5D)
      {
        this.ak = afi.d.Q().a(agf.a, agf.a.b);
      }
      b(☃, ☃, ☃, ☃, ☃, ☃);
    }
    
    public void a(adm ☃, Random ☃, cj ☃)
    {
      this.as.a(☃, ☃, this, ☃);
    }
  }
}
