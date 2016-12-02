import java.util.Random;

public class ajf
  extends agd
{
  public static final amk a = amk.a("locked");
  public static final amn b = amn.a("delay", 1, 4);
  
  protected ajf(boolean ☃)
  {
    super(☃);
    j(M.b().a(O, cq.c).a(b, Integer.valueOf(1)).a(a, Boolean.valueOf(false)));
  }
  
  public String f()
  {
    return di.a("item.diode.name");
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    return ☃.a(a, Boolean.valueOf(b(☃, ☃, ☃)));
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (!bA.e) {
      return false;
    }
    ☃.a(☃, ☃.a(b), 3);
    return true;
  }
  
  protected int d(alz ☃)
  {
    return ((Integer)☃.b(b)).intValue() * 2;
  }
  
  protected alz e(alz ☃)
  {
    Integer ☃ = (Integer)☃.b(b);
    Boolean ☃ = (Boolean)☃.b(a);
    cq ☃ = (cq)☃.b(O);
    return afi.bc.Q().a(O, ☃).a(b, ☃).a(a, ☃);
  }
  
  protected alz k(alz ☃)
  {
    Integer ☃ = (Integer)☃.b(b);
    Boolean ☃ = (Boolean)☃.b(a);
    cq ☃ = (cq)☃.b(O);
    return afi.bb.Q().a(O, ☃).a(b, ☃).a(a, ☃);
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.bb;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.bb;
  }
  
  public boolean b(adq ☃, cj ☃, alz ☃)
  {
    return c(☃, ☃, ☃) > 0;
  }
  
  protected boolean c(afh ☃)
  {
    return d(☃);
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (!N) {
      return;
    }
    cq ☃ = (cq)☃.b(O);
    
    double ☃ = ☃.n() + 0.5F + (☃.nextFloat() - 0.5F) * 0.2D;
    double ☃ = ☃.o() + 0.4F + (☃.nextFloat() - 0.5F) * 0.2D;
    double ☃ = ☃.p() + 0.5F + (☃.nextFloat() - 0.5F) * 0.2D;
    
    float ☃ = -5.0F;
    if (☃.nextBoolean()) {
      ☃ = ((Integer)☃.b(b)).intValue() * 2 - 1;
    }
    ☃ /= 16.0F;
    
    double ☃ = ☃ * ☃.g();
    double ☃ = ☃ * ☃.i();
    
    ☃.a(cy.E, ☃ + ☃, ☃, ☃ + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    super.b(☃, ☃, ☃);
    h(☃, ☃, ☃);
  }
  
  public alz a(int ☃)
  {
    return Q().a(O, cq.b(☃)).a(a, Boolean.valueOf(false)).a(b, Integer.valueOf(1 + (☃ >> 2)));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(O)).b();
    ☃ |= ((Integer)☃.b(b)).intValue() - 1 << 2;
    
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { O, b, a });
  }
}
