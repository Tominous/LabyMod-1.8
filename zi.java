import java.util.List;
import java.util.Random;

public class zi
  extends zw
{
  public boolean f(zx ☃)
  {
    return true;
  }
  
  public boolean f_(zx ☃)
  {
    return false;
  }
  
  public aaj g(zx ☃)
  {
    if (h(☃).c() > 0) {
      return aaj.b;
    }
    return super.g(☃);
  }
  
  public du h(zx ☃)
  {
    dn ☃ = ☃.o();
    if ((☃ == null) || (!☃.b("StoredEnchantments", 9))) {
      return new du();
    }
    return (du)☃.a("StoredEnchantments");
  }
  
  public void a(zx ☃, wn ☃, List<String> ☃, boolean ☃)
  {
    super.a(☃, ☃, ☃, ☃);
    
    du ☃ = h(☃);
    if (☃ != null) {
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        int ☃ = ☃.b(☃).e("id");
        int ☃ = ☃.b(☃).e("lvl");
        if (aci.c(☃) != null) {
          ☃.add(aci.c(☃).d(☃));
        }
      }
    }
  }
  
  public void a(zx ☃, acl ☃)
  {
    du ☃ = h(☃);
    boolean ☃ = true;
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      if (☃.e("id") == ☃.b.B)
      {
        if (☃.e("lvl") < ☃.c) {
          ☃.a("lvl", (short)☃.c);
        }
        ☃ = false;
        break;
      }
    }
    if (☃)
    {
      dn ☃ = new dn();
      
      ☃.a("id", (short)☃.b.B);
      ☃.a("lvl", (short)☃.c);
      
      ☃.a(☃);
    }
    if (!☃.n()) {
      ☃.d(new dn());
    }
    ☃.o().a("StoredEnchantments", ☃);
  }
  
  public zx a(acl ☃)
  {
    zx ☃ = new zx(this);
    a(☃, ☃);
    return ☃;
  }
  
  public void a(aci ☃, List<zx> ☃)
  {
    for (int ☃ = ☃.e(); ☃ <= ☃.b(); ☃++) {
      ☃.add(a(new acl(☃, ☃)));
    }
  }
  
  public ob b(Random ☃)
  {
    return a(☃, 1, 1, 1);
  }
  
  public ob a(Random ☃, int ☃, int ☃, int ☃)
  {
    zx ☃ = new zx(zy.aL, 1, 0);
    ack.a(☃, ☃, 30);
    
    return new ob(☃, ☃, ☃, ☃);
  }
}
