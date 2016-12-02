import java.util.Calendar;
import java.util.Random;

public class tk
  extends tj
{
  private cj a;
  
  public tk(adm ☃)
  {
    super(☃);
    
    a(0.5F, 0.9F);
    a(true);
  }
  
  protected void h()
  {
    super.h();
    
    ac.a(16, new Byte((byte)0));
  }
  
  protected float bB()
  {
    return 0.1F;
  }
  
  protected float bC()
  {
    return super.bC() * 0.95F;
  }
  
  protected String z()
  {
    if ((n()) && (V.nextInt(4) != 0)) {
      return null;
    }
    return "mob.bat.idle";
  }
  
  protected String bo()
  {
    return "mob.bat.hurt";
  }
  
  protected String bp()
  {
    return "mob.bat.death";
  }
  
  public boolean ae()
  {
    return false;
  }
  
  protected void s(pk ☃) {}
  
  protected void bL() {}
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(6.0D);
  }
  
  public boolean n()
  {
    return (ac.a(16) & 0x1) != 0;
  }
  
  public void a(boolean ☃)
  {
    byte ☃ = ac.a(16);
    if (☃) {
      ac.b(16, Byte.valueOf((byte)(☃ | 0x1)));
    } else {
      ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFFE)));
    }
  }
  
  public void t_()
  {
    super.t_();
    if (n())
    {
      v = (w = x = 0.0D);
      t = (ns.c(t) + 1.0D - K);
    }
    else
    {
      w *= 0.6000000238418579D;
    }
  }
  
  protected void E()
  {
    super.E();
    
    cj ☃ = new cj(this);
    cj ☃ = ☃.a();
    if (n())
    {
      if (!o.p(☃).c().v())
      {
        a(false);
        o.a(null, 1015, ☃, 0);
      }
      else
      {
        if (V.nextInt(200) == 0) {
          aK = V.nextInt(360);
        }
        if (o.a(this, 4.0D) != null)
        {
          a(false);
          o.a(null, 1015, ☃, 0);
        }
      }
    }
    else
    {
      if ((a != null) && ((!o.d(a)) || (a.o() < 1))) {
        a = null;
      }
      if ((a == null) || (V.nextInt(30) == 0) || (a.c((int)s, (int)t, (int)u) < 4.0D)) {
        a = new cj((int)s + V.nextInt(7) - V.nextInt(7), (int)t + V.nextInt(6) - 2, (int)u + V.nextInt(7) - V.nextInt(7));
      }
      double ☃ = a.n() + 0.5D - s;
      double ☃ = a.o() + 0.1D - t;
      double ☃ = a.p() + 0.5D - u;
      
      v += (Math.signum(☃) * 0.5D - v) * 0.10000000149011612D;
      w += (Math.signum(☃) * 0.699999988079071D - w) * 0.10000000149011612D;
      x += (Math.signum(☃) * 0.5D - x) * 0.10000000149011612D;
      
      float ☃ = (float)(ns.b(x, v) * 180.0D / 3.1415927410125732D) - 90.0F;
      float ☃ = ns.g(☃ - y);
      ba = 0.5F;
      y += ☃;
      if ((V.nextInt(100) == 0) && (o.p(☃).c().v())) {
        a(true);
      }
    }
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  public void e(float ☃, float ☃) {}
  
  protected void a(double ☃, boolean ☃, afh ☃, cj ☃) {}
  
  public boolean aI()
  {
    return true;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if ((!o.D) && 
      (n())) {
      a(false);
    }
    return super.a(☃, ☃);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    ac.b(16, Byte.valueOf(☃.d("BatFlags")));
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("BatFlags", ac.a(16));
  }
  
  public boolean bR()
  {
    cj ☃ = new cj(s, aRb, u);
    if (☃.o() >= o.F()) {
      return false;
    }
    int ☃ = o.l(☃);
    int ☃ = 4;
    if (a(o.Y())) {
      ☃ = 7;
    } else if (V.nextBoolean()) {
      return false;
    }
    if (☃ > V.nextInt(☃)) {
      return false;
    }
    return super.bR();
  }
  
  private boolean a(Calendar ☃)
  {
    return ((☃.get(2) + 1 == 10) && (☃.get(5) >= 20)) || ((☃.get(2) + 1 == 11) && (☃.get(5) <= 3));
  }
  
  public float aS()
  {
    return K / 2.0F;
  }
}
