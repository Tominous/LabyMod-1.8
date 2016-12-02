import java.util.Random;
import java.util.UUID;

public abstract class qa
  extends tm
  implements px
{
  protected se bm = new se(this);
  
  public qa(adm ☃)
  {
    super(☃);
    cm();
  }
  
  protected void h()
  {
    super.h();
    this.ac.a(16, Byte.valueOf((byte)0));
    this.ac.a(17, "");
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    if (b() == null) {
      ☃.a("OwnerUUID", "");
    } else {
      ☃.a("OwnerUUID", b());
    }
    ☃.a("Sitting", cn());
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    String ☃ = "";
    if (☃.b("OwnerUUID", 8))
    {
      ☃ = ☃.j("OwnerUUID");
    }
    else
    {
      String ☃ = ☃.j("Owner");
      ☃ = lw.a(☃);
    }
    if (☃.length() > 0)
    {
      b(☃);
      m(true);
    }
    this.bm.a(☃.n("Sitting"));
    n(☃.n("Sitting"));
  }
  
  protected void l(boolean ☃)
  {
    cy ☃ = cy.I;
    if (!☃) {
      ☃ = cy.l;
    }
    for (int ☃ = 0; ☃ < 7; ☃++)
    {
      double ☃ = this.V.nextGaussian() * 0.02D;
      double ☃ = this.V.nextGaussian() * 0.02D;
      double ☃ = this.V.nextGaussian() * 0.02D;
      this.o.a(☃, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + 0.5D + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, ☃, ☃, ☃, new int[0]);
    }
  }
  
  public void a(byte ☃)
  {
    if (☃ == 7) {
      l(true);
    } else if (☃ == 6) {
      l(false);
    } else {
      super.a(☃);
    }
  }
  
  public boolean cl()
  {
    return (this.ac.a(16) & 0x4) != 0;
  }
  
  public void m(boolean ☃)
  {
    byte ☃ = this.ac.a(16);
    if (☃) {
      this.ac.b(16, Byte.valueOf((byte)(☃ | 0x4)));
    } else {
      this.ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFFB)));
    }
    cm();
  }
  
  protected void cm() {}
  
  public boolean cn()
  {
    return (this.ac.a(16) & 0x1) != 0;
  }
  
  public void n(boolean ☃)
  {
    byte ☃ = this.ac.a(16);
    if (☃) {
      this.ac.b(16, Byte.valueOf((byte)(☃ | 0x1)));
    } else {
      this.ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFFE)));
    }
  }
  
  public String b()
  {
    return this.ac.e(17);
  }
  
  public void b(String ☃)
  {
    this.ac.b(17, ☃);
  }
  
  public pr co()
  {
    try
    {
      UUID ☃ = UUID.fromString(b());
      if (☃ == null) {
        return null;
      }
      return this.o.b(☃);
    }
    catch (IllegalArgumentException ☃) {}
    return null;
  }
  
  public boolean e(pr ☃)
  {
    return ☃ == co();
  }
  
  public se cp()
  {
    return this.bm;
  }
  
  public boolean a(pr ☃, pr ☃)
  {
    return true;
  }
  
  public auq bO()
  {
    if (cl())
    {
      pr ☃ = co();
      if (☃ != null) {
        return ☃.bO();
      }
    }
    return super.bO();
  }
  
  public boolean c(pr ☃)
  {
    if (cl())
    {
      pr ☃ = co();
      if (☃ == ☃) {
        return true;
      }
      if (☃ != null) {
        return ☃.c(☃);
      }
    }
    return super.c(☃);
  }
  
  public void a(ow ☃)
  {
    if ((!this.o.D) && (this.o.Q().b("showDeathMessages")) && (l_()) && 
      ((co() instanceof lf))) {
      ((lf)co()).a(bs().b());
    }
    super.a(☃);
  }
}
