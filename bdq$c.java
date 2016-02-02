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
    this.v = ☃;
    this.w = ☃;
    this.x = ☃;
    this.aA = ☃;
    this.g = 8;
    if (☃ != null)
    {
      this.aB = ☃.c("Explosions", 10);
      if (this.aB.c() == 0)
      {
        this.aB = null;
      }
      else
      {
        this.g = (this.aB.c() * 2 - 1);
        for (int ☃ = 0; ☃ < this.aB.c(); ☃++)
        {
          dn ☃ = this.aB.b(☃);
          if (☃.n("Flicker"))
          {
            this.a = true;
            this.g += 15;
            break;
          }
        }
      }
    }
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃) {}
  
  public void t_()
  {
    if ((this.az == 0) && (this.aB != null))
    {
      boolean ☃ = l();
      
      boolean ☃ = false;
      if (this.aB.c() >= 3) {
        ☃ = true;
      } else {
        for (int ☃ = 0; ☃ < this.aB.c(); ☃++)
        {
          dn ☃ = this.aB.b(☃);
          if (☃.d("Type") == 1)
          {
            ☃ = true;
            break;
          }
        }
      }
      String ☃ = "fireworks." + (☃ ? "largeBlast" : "blast") + (☃ ? "_far" : "");
      this.o.a(this.s, this.t, this.u, ☃, 20.0F, 0.95F + this.V.nextFloat() * 0.1F, true);
    }
    if ((this.az % 2 == 0) && (this.aB != null) && (this.az / 2 < this.aB.c()))
    {
      int ☃ = this.az / 2;
      dn ☃ = this.aB.b(☃);
      
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
      bdq.a ☃ = new bdq.a(this.o, this.s, this.t, this.u);
      ☃.b(☃, ☃, ☃);
      this.aA.a(☃);
    }
    this.az += 1;
    if (this.az > this.g)
    {
      if (this.a)
      {
        boolean ☃ = l();
        String ☃ = "fireworks." + (☃ ? "twinkle_far" : "twinkle");
        this.o.a(this.s, this.t, this.u, ☃, 20.0F, 0.9F + this.V.nextFloat() * 0.15F, true);
      }
      J();
    }
  }
  
  private boolean l()
  {
    ave ☃ = ave.A();
    if ((☃ != null) && (☃.ac() != null) && 
      (☃.ac().e(this.s, this.t, this.u) < 256.0D)) {
      return false;
    }
    return true;
  }
  
  private void a(double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int[] ☃, int[] ☃, boolean ☃, boolean ☃)
  {
    bdq.b ☃ = new bdq.b(this.o, ☃, ☃, ☃, ☃, ☃, ☃, this.aA);
    ☃.i(0.99F);
    ☃.a(☃);
    ☃.i(☃);
    
    int ☃ = this.V.nextInt(☃.length);
    ☃.a(☃[☃]);
    if ((☃ != null) && (☃.length > 0)) {
      ☃.b(☃[this.V.nextInt(☃.length)]);
    }
    this.aA.a(☃);
  }
  
  private void a(double ☃, int ☃, int[] ☃, int[] ☃, boolean ☃, boolean ☃)
  {
    double ☃ = this.s;
    double ☃ = this.t;
    double ☃ = this.u;
    for (int ☃ = -☃; ☃ <= ☃; ☃++) {
      for (int ☃ = -☃; ☃ <= ☃; ☃++) {
        for (int ☃ = -☃; ☃ <= ☃; ☃++)
        {
          double ☃ = ☃ + (this.V.nextDouble() - this.V.nextDouble()) * 0.5D;
          double ☃ = ☃ + (this.V.nextDouble() - this.V.nextDouble()) * 0.5D;
          double ☃ = ☃ + (this.V.nextDouble() - this.V.nextDouble()) * 0.5D;
          double ☃ = ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃) / ☃ + this.V.nextGaussian() * 0.05D;
          
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
    
    a(this.s, this.t, this.u, ☃ * ☃, ☃ * ☃, 0.0D, ☃, ☃, ☃, ☃);
    
    float ☃ = this.V.nextFloat() * 3.1415927F;
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
            a(this.s, this.t, this.u, ☃ * ☃, ☃, ☃ * ☃, ☃, ☃, ☃, ☃);
          }
        }
        ☃ = ☃;
        ☃ = ☃;
      }
    }
  }
  
  private void a(int[] ☃, int[] ☃, boolean ☃, boolean ☃)
  {
    double ☃ = this.V.nextGaussian() * 0.05D;
    double ☃ = this.V.nextGaussian() * 0.05D;
    for (int ☃ = 0; ☃ < 70; ☃++)
    {
      double ☃ = this.v * 0.5D + this.V.nextGaussian() * 0.15D + ☃;
      double ☃ = this.x * 0.5D + this.V.nextGaussian() * 0.15D + ☃;
      double ☃ = this.w * 0.5D + this.V.nextDouble() * 0.5D;
      
      a(this.s, this.t, this.u, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public int a()
  {
    return 0;
  }
}
