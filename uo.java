import java.util.Map;
import java.util.Random;

public class uo
  extends un
{
  private float c = 1.0F;
  
  public uo(adm ☃)
  {
    super(☃);
  }
  
  public uo(adm ☃, cj ☃, cq ☃)
  {
    super(☃, ☃);
    a(☃);
  }
  
  protected void h()
  {
    H().a(8, 5);
    H().a(9, Byte.valueOf((byte)0));
  }
  
  public float ao()
  {
    return 0.0F;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if ((!☃.c()) && (o() != null))
    {
      if (!o.D)
      {
        a(☃.j(), false);
        a(null);
      }
      return true;
    }
    return super.a(☃, ☃);
  }
  
  public int l()
  {
    return 12;
  }
  
  public int m()
  {
    return 12;
  }
  
  public boolean a(double ☃)
  {
    double ☃ = 16.0D;
    ☃ *= 64.0D * j;
    return ☃ < ☃ * ☃;
  }
  
  public void b(pk ☃)
  {
    a(☃, true);
  }
  
  public void a(pk ☃, boolean ☃)
  {
    if (!o.Q().b("doEntityDrops")) {
      return;
    }
    zx ☃ = o();
    if ((☃ instanceof wn))
    {
      wn ☃ = (wn)☃;
      if (bA.d)
      {
        b(☃);
        return;
      }
    }
    if (☃) {
      a(new zx(zy.bP), 0.0F);
    }
    if ((☃ != null) && (V.nextFloat() < c))
    {
      ☃ = ☃.k();
      b(☃);
      a(☃, 0.0F);
    }
  }
  
  private void b(zx ☃)
  {
    if (☃ == null) {
      return;
    }
    if (☃.b() == zy.bd)
    {
      atg ☃ = ((aab)☃.b()).a(☃, o);
      h.remove("frame-" + F());
    }
    ☃.a(null);
  }
  
  public zx o()
  {
    return H().f(8);
  }
  
  public void a(zx ☃)
  {
    a(☃, true);
  }
  
  private void a(zx ☃, boolean ☃)
  {
    if (☃ != null)
    {
      ☃ = ☃.k();
      b = 1;
      ☃.a(this);
    }
    H().b(8, ☃);
    H().i(8);
    if ((☃) && (a != null)) {
      o.e(a, afi.a);
    }
  }
  
  public int p()
  {
    return H().a(9);
  }
  
  public void a(int ☃)
  {
    a(☃, true);
  }
  
  private void a(int ☃, boolean ☃)
  {
    H().b(9, Byte.valueOf((byte)(☃ % 8)));
    if ((☃) && (a != null)) {
      o.e(a, afi.a);
    }
  }
  
  public void b(dn ☃)
  {
    if (o() != null)
    {
      ☃.a("Item", o().b(new dn()));
      ☃.a("ItemRotation", (byte)p());
      ☃.a("ItemDropChance", c);
    }
    super.b(☃);
  }
  
  public void a(dn ☃)
  {
    dn ☃ = ☃.m("Item");
    if ((☃ != null) && (!☃.c_()))
    {
      a(zx.a(☃), false);
      a(☃.d("ItemRotation"), false);
      if (☃.b("ItemDropChance", 99)) {
        c = ☃.h("ItemDropChance");
      }
      if (☃.c("Direction")) {
        a(p() * 2, false);
      }
    }
    super.a(☃);
  }
  
  public boolean e(wn ☃)
  {
    if (o() == null)
    {
      zx ☃ = ☃.bA();
      if ((☃ != null) && 
        (!o.D))
      {
        a(☃);
        if (!bA.d) {
          if (--b <= 0) {
            bi.a(bi.c, null);
          }
        }
      }
    }
    else if (!o.D)
    {
      a(p() + 1);
    }
    return true;
  }
  
  public int q()
  {
    if (o() == null) {
      return 0;
    }
    return p() % 8 + 1;
  }
}
