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
    
    this.ac.a(16, new Byte((byte)0));
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
    if ((n()) && (this.V.nextInt(4) != 0)) {
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
    return (this.ac.a(16) & 0x1) != 0;
  }
  
  public void a(boolean ☃)
  {
    byte ☃ = this.ac.a(16);
    if (☃) {
      this.ac.b(16, Byte.valueOf((byte)(☃ | 0x1)));
    } else {
      this.ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFFE)));
    }
  }
  
  public void t_()
  {
    super.t_();
    if (n())
    {
      this.v = (this.w = this.x = 0.0D);
      this.t = (ns.c(this.t) + 1.0D - this.K);
    }
    else
    {
      this.w *= 0.6000000238418579D;
    }
  }
  
  protected void E()
  {
    super.E();
    
    cj ☃ = new cj(this);
    cj ☃ = ☃.a();
    if (n())
    {
      if (!this.o.p(☃).c().v())
      {
        a(false);
        this.o.a(null, 1015, ☃, 0);
      }
      else
      {
        if (this.V.nextInt(200) == 0) {
          this.aK = this.V.nextInt(360);
        }
        if (this.o.a(this, 4.0D) != null)
        {
          a(false);
          this.o.a(null, 1015, ☃, 0);
        }
      }
    }
    else
    {
      if ((this.a != null) && ((!this.o.d(this.a)) || (this.a.o() < 1))) {
        this.a = null;
      }
      if ((this.a == null) || (this.V.nextInt(30) == 0) || (this.a.c((int)this.s, (int)this.t, (int)this.u) < 4.0D)) {
        this.a = new cj((int)this.s + this.V.nextInt(7) - this.V.nextInt(7), (int)this.t + this.V.nextInt(6) - 2, (int)this.u + this.V.nextInt(7) - this.V.nextInt(7));
      }
      double ☃ = this.a.n() + 0.5D - this.s;
      double ☃ = this.a.o() + 0.1D - this.t;
      double ☃ = this.a.p() + 0.5D - this.u;
      
      this.v += (Math.signum(☃) * 0.5D - this.v) * 0.10000000149011612D;
      this.w += (Math.signum(☃) * 0.699999988079071D - this.w) * 0.10000000149011612D;
      this.x += (Math.signum(☃) * 0.5D - this.x) * 0.10000000149011612D;
      
      float ☃ = (float)(ns.b(this.x, this.v) * 180.0D / 3.1415927410125732D) - 90.0F;
      float ☃ = ns.g(☃ - this.y);
      this.ba = 0.5F;
      this.y += ☃;
      if ((this.V.nextInt(100) == 0) && (this.o.p(☃).c().v())) {
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
    if ((!this.o.D) && 
      (n())) {
      a(false);
    }
    return super.a(☃, ☃);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    this.ac.b(16, Byte.valueOf(☃.d("BatFlags")));
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("BatFlags", this.ac.a(16));
  }
  
  public boolean bR()
  {
    cj ☃ = new cj(this.s, aR().b, this.u);
    if (☃.o() >= this.o.F()) {
      return false;
    }
    int ☃ = this.o.l(☃);
    int ☃ = 4;
    if (a(this.o.Y())) {
      ☃ = 7;
    } else if (this.V.nextBoolean()) {
      return false;
    }
    if (☃ > this.V.nextInt(☃)) {
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
    return this.K / 2.0F;
  }
}
