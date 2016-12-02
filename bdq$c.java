import java.util.Random;

public class bdq$c
  extends beb
{
  private int az;
  private final bec aA;
  private du aB;
  boolean a;
  
  public bdq$c(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, bec ☃, dn ☃)
  {
    super(☃, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
    v = ☃;
    w = ☃;
    x = ☃;
    aA = ☃;
    g = 8;
    if (☃ != null)
    {
      aB = ☃.c("Explosions", 10);
      if (aB.c() == 0)
      {
        aB = null;
      }
      else
      {
        g = (aB.c() * 2 - 1);
        for (int ☃ = 0; ☃ < aB.c(); ☃++)
        {
          dn ☃ = aB.b(☃);
          if (☃.n("Flicker"))
          {
            a = true;
            g += 15;
            break;
          }
        }
      }
    }
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃) {}
  
  public void t_()
  {
    if ((az == 0) && (aB != null))
    {
      boolean ☃ = l();
      
      boolean ☃ = false;
      if (aB.c() >= 3) {
        ☃ = true;
      } else {
        for (int ☃ = 0; ☃ < aB.c(); ☃++)
        {
          dn ☃ = aB.b(☃);
          if (☃.d("Type") == 1)
          {
            ☃ = true;
            break;
          }
        }
      }
      String ☃ = "fireworks." + (☃ ? "largeBlast" : "blast") + (☃ ? "_far" : "");
      o.a(s, t, u, ☃, 20.0F, 0.95F + V.nextFloat() * 0.1F, true);
    }
    if ((az % 2 == 0) && (aB != null) && (az / 2 < aB.c()))
    {
      int ☃ = az / 2;
      dn ☃ = aB.b(☃);
      
      int ☃ = ☃.d("Type");
      boolean ☃ = ☃.n("Trail");
      boolean ☃ = ☃.n("Flicker");
      int[] ☃ = ☃.l("Colors");
      int[] ☃ = ☃.l("FadeColors");
      if (☃.length == 0) {
        ☃ = new int[] { ze.a[0] };
      }
      if (☃ == 1) {
        a(0.5D, 4, ☃, ☃, ☃, ☃);
      } else if (☃ == 2) {
        a(0.5D, new double[][] { { 0.0D, 1.0D }, { 0.3455D, 0.309D }, { 0.9511D, 0.309D }, { 0.3795918367346939D, -0.12653061224489795D }, { 0.6122448979591837D, -0.8040816326530612D }, { 0.0D, -0.35918367346938773D } }, ☃, ☃, ☃, ☃, false);
      } else if (☃ == 3) {
        a(0.5D, new double[][] { { 0.0D, 0.2D }, { 0.2D, 0.2D }, { 0.2D, 0.6D }, { 0.6D, 0.6D }, { 0.6D, 0.2D }, { 0.2D, 0.2D }, { 0.2D, 0.0D }, { 0.4D, 0.0D }, { 0.4D, -0.6D }, { 0.2D, -0.6D }, { 0.2D, -0.4D }, { 0.0D, -0.4D } }, ☃, ☃, ☃, ☃, true);
      } else if (☃ == 4) {
        a(☃, ☃, ☃, ☃);
      } else {
        a(0.25D, 2, ☃, ☃, ☃, ☃);
      }
      int ☃ = ☃[0];
      float ☃ = ((☃ & 0xFF0000) >> 16) / 255.0F;
      float ☃ = ((☃ & 0xFF00) >> 8) / 255.0F;
      float ☃ = ((☃ & 0xFF) >> 0) / 255.0F;
      bdq.a ☃ = new bdq.a(o, s, t, u);
      ☃.b(☃, ☃, ☃);
      aA.a(☃);
    }
    az += 1;
    if (az > g)
    {
      if (a)
      {
        boolean ☃ = l();
        String ☃ = "fireworks." + (☃ ? "twinkle_far" : "twinkle");
        o.a(s, t, u, ☃, 20.0F, 0.9F + V.nextFloat() * 0.15F, true);
      }
      J();
    }
  }
  
  private boolean l()
  {
    ave ☃ = ave.A();
    if ((☃ != null) && (☃.ac() != null) && 
      (☃.ac().e(s, t, u) < 256.0D)) {
      return false;
    }
    return true;
  }
  
  private void a(double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int[] ☃, int[] ☃, boolean ☃, boolean ☃)
  {
    bdq.b ☃ = new bdq.b(o, ☃, ☃, ☃, ☃, ☃, ☃, aA);
    ☃.i(0.99F);
    ☃.a(☃);
    ☃.i(☃);
    
    int ☃ = V.nextInt(☃.length);
    ☃.a(☃[☃]);
    if ((☃ != null) && (☃.length > 0)) {
      ☃.b(☃[V.nextInt(☃.length)]);
    }
    aA.a(☃);
  }
  
  private void a(double ☃, int ☃, int[] ☃, int[] ☃, boolean ☃, boolean ☃)
  {
    double ☃ = s;
    double ☃ = t;
    double ☃ = u;
    for (int ☃ = -☃; ☃ <= ☃; ☃++) {
      for (int ☃ = -☃; ☃ <= ☃; ☃++) {
        for (int ☃ = -☃; ☃ <= ☃; ☃++)
        {
          double ☃ = ☃ + (V.nextDouble() - V.nextDouble()) * 0.5D;
          double ☃ = ☃ + (V.nextDouble() - V.nextDouble()) * 0.5D;
          double ☃ = ☃ + (V.nextDouble() - V.nextDouble()) * 0.5D;
          double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃) / ☃ + V.nextGaussian() * 0.05D;
          
          a(☃, ☃, ☃, ☃ / ☃, ☃ / ☃, ☃ / ☃, ☃, ☃, ☃, ☃);
          if ((☃ != -☃) && (☃ != ☃) && (☃ != -☃) && (☃ != ☃)) {
            ☃ += ☃ * 2 - 1;
          }
        }
      }
    }
  }
  
  private void a(double ☃, double[][] ☃, int[] ☃, int[] ☃, boolean ☃, boolean ☃, boolean ☃)
  {
    double ☃ = ☃[0][0];
    double ☃ = ☃[0][1];
    
    a(s, t, u, ☃ * ☃, ☃ * ☃, 0.0D, ☃, ☃, ☃, ☃);
    
    float ☃ = V.nextFloat() * 3.1415927F;
    double ☃ = ☃ ? 0.034D : 0.34D;
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      double ☃ = ☃ + ☃ * 3.1415927F * ☃;
      
      double ☃ = ☃;
      double ☃ = ☃;
      for (int ☃ = 1; ☃ < ☃.length; ☃++)
      {
        double ☃ = ☃[☃][0];
        double ☃ = ☃[☃][1];
        for (double ☃ = 0.25D; ☃ <= 1.0D; ☃ += 0.25D)
        {
          double ☃ = (☃ + (☃ - ☃) * ☃) * ☃;
          double ☃ = (☃ + (☃ - ☃) * ☃) * ☃;
          
          double ☃ = ☃ * Math.sin(☃);
          ☃ *= Math.cos(☃);
          for (double ☃ = -1.0D; ☃ <= 1.0D; ☃ += 2.0D) {
            a(s, t, u, ☃ * ☃, ☃, ☃ * ☃, ☃, ☃, ☃, ☃);
          }
        }
        ☃ = ☃;
        ☃ = ☃;
      }
    }
  }
  
  private void a(int[] ☃, int[] ☃, boolean ☃, boolean ☃)
  {
    double ☃ = V.nextGaussian() * 0.05D;
    double ☃ = V.nextGaussian() * 0.05D;
    for (int ☃ = 0; ☃ < 70; ☃++)
    {
      double ☃ = v * 0.5D + V.nextGaussian() * 0.15D + ☃;
      double ☃ = x * 0.5D + V.nextGaussian() * 0.15D + ☃;
      double ☃ = w * 0.5D + V.nextDouble() * 0.5D;
      
      a(s, t, u, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public int a()
  {
    return 0;
  }
}
