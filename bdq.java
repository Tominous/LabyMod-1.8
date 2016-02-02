import java.util.Random;

public class bdq
{
  public static class c
    extends beb
  {
    private int az;
    private final bec aA;
    private du aB;
    boolean a;
    
    public c(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, bec ☃, dn ☃)
    {
      super(☃, ☃, ☃, 0.0D, 0.0D, 0.0D);
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
  
  public static class b
    extends beb
  {
    private int a = 160;
    private boolean az;
    private boolean aA;
    private final bec aB;
    private float aC;
    private float aD;
    private float aE;
    private boolean aF;
    
    public b(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, bec ☃)
    {
      super(☃, ☃, ☃);
      this.v = ☃;
      this.w = ☃;
      this.x = ☃;
      this.aB = ☃;
      
      this.h *= 0.75F;
      
      this.g = (48 + this.V.nextInt(12));
      this.T = false;
    }
    
    public void a(boolean ☃)
    {
      this.az = ☃;
    }
    
    public void i(boolean ☃)
    {
      this.aA = ☃;
    }
    
    public void a(int ☃)
    {
      float ☃ = ((☃ & 0xFF0000) >> 16) / 255.0F;
      float ☃ = ((☃ & 0xFF00) >> 8) / 255.0F;
      float ☃ = ((☃ & 0xFF) >> 0) / 255.0F;
      float ☃ = 1.0F;
      b(☃ * ☃, ☃ * ☃, ☃ * ☃);
    }
    
    public void b(int ☃)
    {
      this.aC = (((☃ & 0xFF0000) >> 16) / 255.0F);
      this.aD = (((☃ & 0xFF00) >> 8) / 255.0F);
      this.aE = (((☃ & 0xFF) >> 0) / 255.0F);
      this.aF = true;
    }
    
    public aug S()
    {
      return null;
    }
    
    public boolean ae()
    {
      return false;
    }
    
    public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
    {
      if ((!this.aA) || (this.f < this.g / 3) || ((this.f + this.g) / 3 % 2 == 0)) {
        super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
      }
    }
    
    public void t_()
    {
      this.p = this.s;
      this.q = this.t;
      this.r = this.u;
      if (this.f++ >= this.g) {
        J();
      }
      if (this.f > this.g / 2)
      {
        i(1.0F - (this.f - this.g / 2) / this.g);
        if (this.aF)
        {
          this.ar += (this.aC - this.ar) * 0.2F;
          this.as += (this.aD - this.as) * 0.2F;
          this.at += (this.aE - this.at) * 0.2F;
        }
      }
      k(this.a + (7 - this.f * 8 / this.g));
      
      this.w -= 0.004D;
      d(this.v, this.w, this.x);
      this.v *= 0.9100000262260437D;
      this.w *= 0.9100000262260437D;
      this.x *= 0.9100000262260437D;
      if (this.C)
      {
        this.v *= 0.699999988079071D;
        this.x *= 0.699999988079071D;
      }
      if ((this.az) && (this.f < this.g / 2) && ((this.f + this.g) % 2 == 0))
      {
        b ☃ = new b(this.o, this.s, this.t, this.u, 0.0D, 0.0D, 0.0D, this.aB);
        ☃.i(0.99F);
        ☃.b(this.ar, this.as, this.at);
        ☃.f = (☃.g / 2);
        if (this.aF)
        {
          ☃.aF = true;
          ☃.aC = this.aC;
          ☃.aD = this.aD;
          ☃.aE = this.aE;
        }
        ☃.aA = this.aA;
        this.aB.a(☃);
      }
    }
    
    public int b(float ☃)
    {
      return 15728880;
    }
    
    public float c(float ☃)
    {
      return 1.0F;
    }
  }
  
  public static class a
    extends beb
  {
    protected a(adm ☃, double ☃, double ☃, double ☃)
    {
      super(☃, ☃, ☃);
      
      this.g = 4;
    }
    
    public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
    {
      float ☃ = 0.25F;
      float ☃ = 0.5F;
      float ☃ = 0.125F;
      float ☃ = 0.375F;
      float ☃ = 7.1F * ns.a((this.f + ☃ - 1.0F) * 0.25F * 3.1415927F);
      this.au = (0.6F - (this.f + ☃ - 1.0F) * 0.25F * 0.5F);
      
      float ☃ = (float)(this.p + (this.s - this.p) * ☃ - aw);
      float ☃ = (float)(this.q + (this.t - this.q) * ☃ - ax);
      float ☃ = (float)(this.r + (this.u - this.r) * ☃ - ay);
      
      int ☃ = b(☃);
      int ☃ = ☃ >> 16 & 0xFFFF;
      int ☃ = ☃ & 0xFFFF;
      
      ☃.b(☃ - ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ - ☃ * ☃ - ☃ * ☃).a(0.5D, 0.375D).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
      ☃.b(☃ - ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ - ☃ * ☃ + ☃ * ☃).a(0.5D, 0.125D).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
      ☃.b(☃ + ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ + ☃ * ☃ + ☃ * ☃).a(0.25D, 0.125D).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
      ☃.b(☃ + ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ + ☃ * ☃ - ☃ * ☃).a(0.25D, 0.375D).a(this.ar, this.as, this.at, this.au).a(☃, ☃).d();
    }
  }
  
  public static class d
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      bdq.b ☃ = new bdq.b(☃, ☃, ☃, ☃, ☃, ☃, ☃, ave.A().j);
      ☃.i(0.99F);
      return ☃;
    }
  }
}
