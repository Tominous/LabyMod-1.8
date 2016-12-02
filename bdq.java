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
      v = ☃;
      w = ☃;
      x = ☃;
      aB = ☃;
      
      h *= 0.75F;
      
      g = (48 + V.nextInt(12));
      T = false;
    }
    
    public void a(boolean ☃)
    {
      az = ☃;
    }
    
    public void i(boolean ☃)
    {
      aA = ☃;
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
      aC = (((☃ & 0xFF0000) >> 16) / 255.0F);
      aD = (((☃ & 0xFF00) >> 8) / 255.0F);
      aE = (((☃ & 0xFF) >> 0) / 255.0F);
      aF = true;
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
      if ((!aA) || (f < g / 3) || ((f + g) / 3 % 2 == 0)) {
        super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
      }
    }
    
    public void t_()
    {
      p = s;
      q = t;
      r = u;
      if (f++ >= g) {
        J();
      }
      if (f > g / 2)
      {
        i(1.0F - (f - g / 2) / g);
        if (aF)
        {
          ar += (aC - ar) * 0.2F;
          as += (aD - as) * 0.2F;
          at += (aE - at) * 0.2F;
        }
      }
      k(a + (7 - f * 8 / g));
      
      w -= 0.004D;
      d(v, w, x);
      v *= 0.9100000262260437D;
      w *= 0.9100000262260437D;
      x *= 0.9100000262260437D;
      if (C)
      {
        v *= 0.699999988079071D;
        x *= 0.699999988079071D;
      }
      if ((az) && (f < g / 2) && ((f + g) % 2 == 0))
      {
        b ☃ = new b(o, s, t, u, 0.0D, 0.0D, 0.0D, aB);
        ☃.i(0.99F);
        ☃.b(ar, as, at);
        f = (g / 2);
        if (aF)
        {
          aF = true;
          aC = aC;
          aD = aD;
          aE = aE;
        }
        aA = aA;
        aB.a(☃);
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
      
      g = 4;
    }
    
    public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
    {
      float ☃ = 0.25F;
      float ☃ = 0.5F;
      float ☃ = 0.125F;
      float ☃ = 0.375F;
      float ☃ = 7.1F * ns.a((f + ☃ - 1.0F) * 0.25F * 3.1415927F);
      au = (0.6F - (f + ☃ - 1.0F) * 0.25F * 0.5F);
      
      float ☃ = (float)(p + (s - p) * ☃ - aw);
      float ☃ = (float)(q + (t - q) * ☃ - ax);
      float ☃ = (float)(r + (u - r) * ☃ - ay);
      
      int ☃ = b(☃);
      int ☃ = ☃ >> 16 & 0xFFFF;
      int ☃ = ☃ & 0xFFFF;
      
      ☃.b(☃ - ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ - ☃ * ☃ - ☃ * ☃).a(0.5D, 0.375D).a(ar, as, at, au).a(☃, ☃).d();
      ☃.b(☃ - ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ - ☃ * ☃ + ☃ * ☃).a(0.5D, 0.125D).a(ar, as, at, au).a(☃, ☃).d();
      ☃.b(☃ + ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ + ☃ * ☃ + ☃ * ☃).a(0.25D, 0.125D).a(ar, as, at, au).a(☃, ☃).d();
      ☃.b(☃ + ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ + ☃ * ☃ - ☃ * ☃).a(0.25D, 0.375D).a(ar, as, at, au).a(☃, ☃).d();
    }
  }
  
  public static class d
    implements bed
  {
    public beb a(int ☃, adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
    {
      bdq.b ☃ = new bdq.b(☃, ☃, ☃, ☃, ☃, ☃, ☃, Aj);
      ☃.i(0.99F);
      return ☃;
    }
  }
}
