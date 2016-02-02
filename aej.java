import java.util.List;
import java.util.Random;

public class aej
  extends ady
{
  private boolean aD;
  private static final alz aE = afi.r.Q().a(ail.b, aio.a.d);
  private static final alz aF = afi.t.Q().a(aik.Q, aio.a.d).a(ahs.b, Boolean.valueOf(false));
  private static final alz aG = afi.t.Q().a(aik.Q, aio.a.a).a(ahs.b, Boolean.valueOf(false));
  
  public aej(int ☃, boolean ☃)
  {
    super(☃);
    this.aD = ☃;
    if (☃) {
      this.as.A = 2;
    } else {
      this.as.A = 50;
    }
    this.as.C = 25;
    this.as.B = 4;
    if (!☃) {
      this.at.add(new ady.c(ts.class, 2, 1, 1));
    }
    this.au.add(new ady.c(tn.class, 10, 4, 4));
  }
  
  public aoh a(Random ☃)
  {
    if (☃.nextInt(10) == 0) {
      return this.aB;
    }
    if (☃.nextInt(2) == 0) {
      return new aov(aE, aG);
    }
    if ((!this.aD) && (☃.nextInt(3) == 0)) {
      return new ape(false, 10, 20, aE, aF);
    }
    return new apv(false, 4 + ☃.nextInt(7), aE, aF, true);
  }
  
  public aot b(Random ☃)
  {
    if (☃.nextInt(4) == 0) {
      return new apu(akc.a.c);
    }
    return new apu(akc.a.b);
  }
  
  public void a(adm ☃, Random ☃, cj ☃)
  {
    super.a(☃, ☃, ☃);
    
    int ☃ = ☃.nextInt(16) + 8;
    int ☃ = ☃.nextInt(16) + 8;
    int ☃ = ☃.nextInt(☃.m(☃.a(☃, 0, ☃)).o() * 2);
    new aph().b(☃, ☃, ☃.a(☃, ☃, ☃));
    
    apw ☃ = new apw();
    for (int ☃ = 0; ☃ < 50; ☃++)
    {
      int ☃ = ☃.nextInt(16) + 8;
      int ☃ = 128;
      int ☃ = ☃.nextInt(16) + 8;
      
      ☃.b(☃, ☃, ☃.a(☃, 128, ☃));
    }
  }
}
