import java.util.List;
import java.util.Random;
import java.util.UUID;

public class wd
  extends vv
  implements vx
{
  private static final UUID a = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
  private static final qd b = new qd(a, "Drinking speed penalty", -0.25D, 0).a(false);
  private static final zw[] c = { zy.aT, zy.aY, zy.aC, zy.bB, zy.bA, zy.H, zy.y, zy.y };
  private int bm;
  
  public wd(adm ☃)
  {
    super(☃);
    a(0.6F, 1.95F);
    
    this.i.a(1, new ra(this));
    this.i.a(2, new sa(this, 1.0D, 60, 10.0F));
    this.i.a(2, new rz(this, 1.0D));
    this.i.a(3, new ri(this, wn.class, 8.0F));
    this.i.a(3, new ry(this));
    
    this.bi.a(1, new sm(this, false, new Class[0]));
    this.bi.a(2, new sp(this, wn.class, true));
  }
  
  protected void h()
  {
    super.h();
    
    H().a(21, Byte.valueOf((byte)0));
  }
  
  protected String z()
  {
    return null;
  }
  
  protected String bo()
  {
    return null;
  }
  
  protected String bp()
  {
    return null;
  }
  
  public void a(boolean ☃)
  {
    H().b(21, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
  
  public boolean n()
  {
    return H().a(21) == 1;
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(26.0D);
    a(vy.d).a(0.25D);
  }
  
  public void m()
  {
    if (!this.o.D)
    {
      if (n())
      {
        if (this.bm-- <= 0)
        {
          a(false);
          zx ☃ = bA();
          c(0, null);
          if ((☃ != null) && (☃.b() == zy.bz))
          {
            List<pf> ☃ = zy.bz.h(☃);
            if (☃ != null) {
              for (pf ☃ : ☃) {
                c(new pf(☃));
              }
            }
          }
          a(vy.d).c(b);
        }
      }
      else
      {
        int ☃ = -1;
        if ((this.V.nextFloat() < 0.15F) && (a(arm.h)) && (!a(pe.o))) {
          ☃ = 8237;
        } else if ((this.V.nextFloat() < 0.15F) && (at()) && (!a(pe.n))) {
          ☃ = 16307;
        } else if ((this.V.nextFloat() < 0.05F) && (bn() < bu())) {
          ☃ = 16341;
        } else if ((this.V.nextFloat() < 0.25F) && (u() != null) && (!a(pe.c)) && (u().h(this) > 121.0D)) {
          ☃ = 16274;
        } else if ((this.V.nextFloat() < 0.25F) && (u() != null) && (!a(pe.c)) && (u().h(this) > 121.0D)) {
          ☃ = 16274;
        }
        if (☃ > -1)
        {
          c(0, new zx(zy.bz, 1, ☃));
          this.bm = bA().l();
          a(true);
          qc ☃ = a(vy.d);
          ☃.c(b);
          ☃.b(b);
        }
      }
      if (this.V.nextFloat() < 7.5E-4F) {
        this.o.a(this, (byte)15);
      }
    }
    super.m();
  }
  
  public void a(byte ☃)
  {
    if (☃ == 15) {
      for (int ☃ = 0; ☃ < this.V.nextInt(35) + 10; ☃++) {
        this.o.a(cy.r, this.s + this.V.nextGaussian() * 0.12999999523162842D, aR().e + 0.5D + this.V.nextGaussian() * 0.12999999523162842D, this.u + this.V.nextGaussian() * 0.12999999523162842D, 0.0D, 0.0D, 0.0D, new int[0]);
      }
    } else {
      super.a(☃);
    }
  }
  
  protected float c(ow ☃, float ☃)
  {
    ☃ = super.c(☃, ☃);
    if (☃.j() == this) {
      ☃ = 0.0F;
    }
    if (☃.s()) {
      ☃ = (float)(☃ * 0.15D);
    }
    return ☃;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    int ☃ = this.V.nextInt(3) + 1;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = this.V.nextInt(3);
      zw ☃ = c[this.V.nextInt(c.length)];
      if (☃ > 0) {
        ☃ += this.V.nextInt(☃ + 1);
      }
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        a(☃, 1);
      }
    }
  }
  
  public void a(pr ☃, float ☃)
  {
    if (n()) {
      return;
    }
    xc ☃ = new xc(this.o, this, 32732);
    double ☃ = ☃.t + ☃.aS() - 1.100000023841858D;
    ☃.z -= -20.0F;
    double ☃ = ☃.s + ☃.v - this.s;
    double ☃ = ☃ - this.t;
    double ☃ = ☃.u + ☃.x - this.u;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    if ((☃ >= 8.0F) && (!☃.a(pe.d))) {
      ☃.a(32698);
    } else if ((☃.bn() >= 8.0F) && (!☃.a(pe.u))) {
      ☃.a(32660);
    } else if ((☃ <= 3.0F) && (!☃.a(pe.t)) && (this.V.nextFloat() < 0.25F)) {
      ☃.a(32696);
    }
    ☃.c(☃, ☃ + ☃ * 0.2F, ☃, 0.75F, 8.0F);
    
    this.o.d(☃);
  }
  
  public float aS()
  {
    return 1.62F;
  }
}
