import java.util.Random;

public class vl
  extends vv
{
  private float a = 0.5F;
  private int b;
  
  public vl(adm ☃)
  {
    super(☃);
    
    ab = true;
    b_ = 10;
    
    i.a(4, new vl.a(this));
    i.a(5, new rp(this, 1.0D));
    i.a(7, new rz(this, 1.0D));
    i.a(8, new ri(this, wn.class, 8.0F));
    i.a(8, new ry(this));
    
    bi.a(1, new sm(this, true, new Class[0]));
    bi.a(2, new sp(this, wn.class, true));
  }
  
  protected void aX()
  {
    super.aX();
    a(vy.e).a(6.0D);
    a(vy.d).a(0.23000000417232513D);
    a(vy.b).a(48.0D);
  }
  
  protected void h()
  {
    super.h();
    
    ac.a(16, new Byte((byte)0));
  }
  
  protected String z()
  {
    return "mob.blaze.breathe";
  }
  
  protected String bo()
  {
    return "mob.blaze.hit";
  }
  
  protected String bp()
  {
    return "mob.blaze.death";
  }
  
  public int b(float ☃)
  {
    return 15728880;
  }
  
  public float c(float ☃)
  {
    return 1.0F;
  }
  
  public void m()
  {
    if ((!C) && (w < 0.0D)) {
      w *= 0.6D;
    }
    if (o.D)
    {
      if ((V.nextInt(24) == 0) && (!R())) {
        o.a(s + 0.5D, t + 0.5D, u + 0.5D, "fire.fire", 1.0F + V.nextFloat(), V.nextFloat() * 0.7F + 0.3F, false);
      }
      for (int ☃ = 0; ☃ < 2; ☃++) {
        o.a(cy.m, s + (V.nextDouble() - 0.5D) * J, t + V.nextDouble() * K, u + (V.nextDouble() - 0.5D) * J, 0.0D, 0.0D, 0.0D, new int[0]);
      }
    }
    super.m();
  }
  
  protected void E()
  {
    if (U()) {
      a(ow.f, 1.0F);
    }
    b -= 1;
    if (b <= 0)
    {
      b = 100;
      a = (0.5F + (float)V.nextGaussian() * 3.0F);
    }
    pr ☃ = u();
    if ((☃ != null) && (t + ☃.aS() > t + aS() + a))
    {
      w += (0.30000001192092896D - w) * 0.30000001192092896D;
      ai = true;
    }
    super.E();
  }
  
  public void e(float ☃, float ☃) {}
  
  protected zw A()
  {
    return zy.bv;
  }
  
  public boolean at()
  {
    return n();
  }
  
  protected void b(boolean ☃, int ☃)
  {
    if (☃)
    {
      int ☃ = V.nextInt(2 + ☃);
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        a(zy.bv, 1);
      }
    }
  }
  
  public boolean n()
  {
    return (ac.a(16) & 0x1) != 0;
  }
  
  public void a(boolean ☃)
  {
    byte ☃ = ac.a(16);
    if (☃) {
      ☃ = (byte)(☃ | 0x1);
    } else {
      ☃ = (byte)(☃ & 0xFFFFFFFE);
    }
    ac.b(16, Byte.valueOf(☃));
  }
  
  protected boolean n_()
  {
    return true;
  }
  
  static class a
    extends rd
  {
    private vl a;
    private int b;
    private int c;
    
    public a(vl ☃)
    {
      a = ☃;
      
      a(3);
    }
    
    public boolean a()
    {
      pr ☃ = a.u();
      if ((☃ == null) || (!☃.ai())) {
        return false;
      }
      return true;
    }
    
    public void c()
    {
      b = 0;
    }
    
    public void d()
    {
      a.a(false);
    }
    
    public void e()
    {
      c -= 1;
      
      pr ☃ = a.u();
      
      double ☃ = a.h(☃);
      if (☃ < 4.0D)
      {
        if (c <= 0)
        {
          c = 20;
          a.r(☃);
        }
        a.q().a(s, t, u, 1.0D);
      }
      else if (☃ < 256.0D)
      {
        double ☃ = s - a.s;
        double ☃ = aRb + K / 2.0F - (a.t + a.K / 2.0F);
        double ☃ = u - a.u;
        if (c <= 0)
        {
          b += 1;
          if (b == 1)
          {
            c = 60;
            a.a(true);
          }
          else if (b <= 4)
          {
            c = 6;
          }
          else
          {
            c = 100;
            b = 0;
            a.a(false);
          }
          if (b > 1)
          {
            float ☃ = ns.c(ns.a(☃)) * 0.5F;
            
            a.o.a(null, 1009, new cj((int)a.s, (int)a.t, (int)a.u), 0);
            for (int ☃ = 0; ☃ < 1; ☃++)
            {
              ww ☃ = new ww(a.o, a, ☃ + a.bc().nextGaussian() * ☃, ☃, ☃ + a.bc().nextGaussian() * ☃);
              t = (a.t + a.K / 2.0F + 0.5D);
              a.o.d(☃);
            }
          }
        }
        a.p().a(☃, 10.0F, 10.0F);
      }
      else
      {
        a.s().n();
        a.q().a(s, t, u, 1.0D);
      }
      super.e();
    }
  }
}
