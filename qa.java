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
    ac.a(16, Byte.valueOf((byte)0));
    ac.a(17, "");
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
    bm.a(☃.n("Sitting"));
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
      double ☃ = V.nextGaussian() * 0.02D;
      double ☃ = V.nextGaussian() * 0.02D;
      double ☃ = V.nextGaussian() * 0.02D;
      o.a(☃, s + V.nextFloat() * J * 2.0F - J, t + 0.5D + V.nextFloat() * K, u + V.nextFloat() * J * 2.0F - J, ☃, ☃, ☃, new int[0]);
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
    return (ac.a(16) & 0x4) != 0;
  }
  
  public void m(boolean ☃)
  {
    byte ☃ = ac.a(16);
    if (☃) {
      ac.b(16, Byte.valueOf((byte)(☃ | 0x4)));
    } else {
      ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFFB)));
    }
    cm();
  }
  
  protected void cm() {}
  
  public boolean cn()
  {
    return (ac.a(16) & 0x1) != 0;
  }
  
  public void n(boolean ☃)
  {
    byte ☃ = ac.a(16);
    if (☃) {
      ac.b(16, Byte.valueOf((byte)(☃ | 0x1)));
    } else {
      ac.b(16, Byte.valueOf((byte)(☃ & 0xFFFFFFFE)));
    }
  }
  
  public String b()
  {
    return ac.e(17);
  }
  
  public void b(String ☃)
  {
    ac.b(17, ☃);
  }
  
  public pr co()
  {
    try
    {
      UUID ☃ = UUID.fromString(b());
      if (☃ == null) {
        return null;
      }
      return o.b(☃);
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
    return bm;
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
    if ((!o.D) && (o.Q().b("showDeathMessages")) && (l_()) && 
      ((co() instanceof lf))) {
      ((lf)co()).a(bs().b());
    }
    super.a(☃);
  }
}
