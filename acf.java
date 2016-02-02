import java.util.Random;

public class acf
  extends aci
{
  private static final String[] E = { "all", "undead", "arthropods" };
  private static final int[] F = { 1, 5, 5 };
  private static final int[] G = { 11, 8, 8 };
  private static final int[] H = { 20, 20, 20 };
  public final int a;
  
  public acf(int ☃, jy ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃, acj.g);
    this.a = ☃;
  }
  
  public int a(int ☃)
  {
    return F[this.a] + (☃ - 1) * G[this.a];
  }
  
  public int b(int ☃)
  {
    return a(☃) + H[this.a];
  }
  
  public int b()
  {
    return 5;
  }
  
  public float a(int ☃, pw ☃)
  {
    if (this.a == 0) {
      return ☃ * 1.25F;
    }
    if ((this.a == 1) && (☃ == pw.b)) {
      return ☃ * 2.5F;
    }
    if ((this.a == 2) && (☃ == pw.c)) {
      return ☃ * 2.5F;
    }
    return 0.0F;
  }
  
  public String a()
  {
    return "enchantment.damage." + E[this.a];
  }
  
  public boolean a(aci ☃)
  {
    return !(☃ instanceof acf);
  }
  
  public boolean a(zx ☃)
  {
    if ((☃.b() instanceof yl)) {
      return true;
    }
    return super.a(☃);
  }
  
  public void a(pr ☃, pk ☃, int ☃)
  {
    if ((☃ instanceof pr))
    {
      pr ☃ = (pr)☃;
      if ((this.a == 2) && (☃.bz() == pw.c))
      {
        int ☃ = 20 + ☃.bc().nextInt(10 * ☃);
        ☃.c(new pf(pe.d.H, ☃, 3));
      }
    }
  }
}
