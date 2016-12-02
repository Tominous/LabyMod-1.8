import java.util.List;
import java.util.Random;

public class aei
  extends ady
{
  private boolean aD;
  private apb aE = new apb();
  private apa aF = new apa(4);
  
  public aei(int ☃, boolean ☃)
  {
    super(☃);
    aD = ☃;
    if (☃) {
      ak = afi.aJ.Q();
    }
    au.clear();
  }
  
  public void a(adm ☃, Random ☃, cj ☃)
  {
    if (aD)
    {
      for (int ☃ = 0; ☃ < 3; ☃++)
      {
        int ☃ = ☃.nextInt(16) + 8;
        int ☃ = ☃.nextInt(16) + 8;
        aE.b(☃, ☃, ☃.m(☃.a(☃, 0, ☃)));
      }
      for (int ☃ = 0; ☃ < 2; ☃++)
      {
        int ☃ = ☃.nextInt(16) + 8;
        int ☃ = ☃.nextInt(16) + 8;
        aF.b(☃, ☃, ☃.m(☃.a(☃, 0, ☃)));
      }
    }
    super.a(☃, ☃, ☃);
  }
  
  public aoh a(Random ☃)
  {
    return new aps(false);
  }
  
  protected ady d(int ☃)
  {
    ady ☃ = new aei(☃, true).a(13828095, true).a(ah + " Spikes").c().a(0.0F, 0.5F).a(new ady.a(an + 0.1F, ao + 0.1F));
    
    an = (an + 0.3F);
    ao = (ao + 0.4F);
    
    return ☃;
  }
}
