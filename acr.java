public class acr
  extends aci
{
  private static final String[] E = { "all", "fire", "fall", "explosion", "projectile" };
  private static final int[] F = { 1, 10, 5, 5, 3 };
  private static final int[] G = { 11, 8, 6, 8, 6 };
  private static final int[] H = { 20, 12, 10, 12, 15 };
  public final int a;
  
  public acr(int ☃, jy ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃, acj.b);
    a = ☃;
    if (☃ == 2) {
      C = acj.c;
    }
  }
  
  public int a(int ☃)
  {
    return F[a] + (☃ - 1) * G[a];
  }
  
  public int b(int ☃)
  {
    return a(☃) + H[a];
  }
  
  public int b()
  {
    return 4;
  }
  
  public int a(int ☃, ow ☃)
  {
    if (☃.g()) {
      return 0;
    }
    float ☃ = (6 + ☃ * ☃) / 3.0F;
    if (a == 0) {
      return ns.d(☃ * 0.75F);
    }
    if ((a == 1) && (☃.o())) {
      return ns.d(☃ * 1.25F);
    }
    if ((a == 2) && (☃ == ow.i)) {
      return ns.d(☃ * 2.5F);
    }
    if ((a == 3) && (☃.c())) {
      return ns.d(☃ * 1.5F);
    }
    if ((a == 4) && (☃.a())) {
      return ns.d(☃ * 1.5F);
    }
    return 0;
  }
  
  public String a()
  {
    return "enchantment.protect." + E[a];
  }
  
  public boolean a(aci ☃)
  {
    if ((☃ instanceof acr))
    {
      acr ☃ = (acr)☃;
      if (a == a) {
        return false;
      }
      if ((a == 2) || (a == 2)) {
        return true;
      }
      return false;
    }
    return super.a(☃);
  }
  
  public static int a(pk ☃, int ☃)
  {
    int ☃ = ack.a(dB, ☃.as());
    if (☃ > 0) {
      ☃ -= ns.d(☃ * (☃ * 0.15F));
    }
    return ☃;
  }
  
  public static double a(pk ☃, double ☃)
  {
    int ☃ = ack.a(fB, ☃.as());
    if (☃ > 0) {
      ☃ -= ns.c(☃ * (☃ * 0.15F));
    }
    return ☃;
  }
}
