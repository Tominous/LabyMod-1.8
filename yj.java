import com.google.common.base.Predicates;
import java.util.List;

public class yj
  extends zw
{
  private static final int[] k = { 11, 16, 15, 13 };
  public static final String[] a = { "minecraft:items/empty_armor_slot_helmet", "minecraft:items/empty_armor_slot_chestplate", "minecraft:items/empty_armor_slot_leggings", "minecraft:items/empty_armor_slot_boots" };
  private static final cr l = new cn()
  {
    protected zx b(ck ☃, zx ☃)
    {
      cj ☃ = ☃.d().a(agg.b(☃.f()));
      
      int ☃ = ☃.n();
      int ☃ = ☃.o();
      int ☃ = ☃.p();
      aug ☃ = new aug(☃, ☃, ☃, ☃ + 1, ☃ + 1, ☃ + 1);
      List<pr> ☃ = ☃.i().a(pr.class, ☃, Predicates.and(po.d, new po.a(☃)));
      if (☃.size() > 0)
      {
        pr ☃ = (pr)☃.get(0);
        int ☃ = (☃ instanceof wn) ? 1 : 0;
        int ☃ = ps.c(☃);
        zx ☃ = ☃.k();
        ☃.b = 1;
        ☃.c(☃ - ☃, ☃);
        if ((☃ instanceof ps)) {
          ((ps)☃).a(☃, 2.0F);
        }
        ☃.b -= 1;
        return ☃;
      }
      return super.b(☃, ☃);
    }
  };
  public final int b;
  public final int c;
  public final int d;
  private final yj.a m;
  
  public static enum a
  {
    private final String f;
    private final int g;
    private final int[] h;
    private final int i;
    
    private a(String ☃, int ☃, int[] ☃, int ☃)
    {
      this.f = ☃;
      this.g = ☃;
      this.h = ☃;
      this.i = ☃;
    }
    
    public int a(int ☃)
    {
      return yj.d()[☃] * this.g;
    }
    
    public int b(int ☃)
    {
      return this.h[☃];
    }
    
    public int a()
    {
      return this.i;
    }
    
    public zw b()
    {
      if (this == a) {
        return zy.aF;
      }
      if (this == b) {
        return zy.j;
      }
      if (this == d) {
        return zy.k;
      }
      if (this == c) {
        return zy.j;
      }
      if (this == e) {
        return zy.i;
      }
      return null;
    }
    
    public String c()
    {
      return this.f;
    }
  }
  
  public yj(yj.a ☃, int ☃, int ☃)
  {
    this.m = ☃;
    this.b = ☃;
    this.d = ☃;
    this.c = ☃.b(☃);
    d(☃.a(☃));
    this.h = 1;
    a(yz.j);
    agg.N.a(this, l);
  }
  
  public int a(zx ☃, int ☃)
  {
    if (☃ > 0) {
      return 16777215;
    }
    int ☃ = b(☃);
    if (☃ < 0) {
      ☃ = 16777215;
    }
    return ☃;
  }
  
  public int b()
  {
    return this.m.a();
  }
  
  public yj.a x_()
  {
    return this.m;
  }
  
  public boolean d_(zx ☃)
  {
    if (this.m != yj.a.a) {
      return false;
    }
    if (!☃.n()) {
      return false;
    }
    if (!☃.o().b("display", 10)) {
      return false;
    }
    if (!☃.o().m("display").b("color", 3)) {
      return false;
    }
    return true;
  }
  
  public int b(zx ☃)
  {
    if (this.m != yj.a.a) {
      return -1;
    }
    dn ☃ = ☃.o();
    if (☃ != null)
    {
      dn ☃ = ☃.m("display");
      if ((☃ != null) && 
        (☃.b("color", 3))) {
        return ☃.f("color");
      }
    }
    return 10511680;
  }
  
  public void c(zx ☃)
  {
    if (this.m != yj.a.a) {
      return;
    }
    dn ☃ = ☃.o();
    if (☃ == null) {
      return;
    }
    dn ☃ = ☃.m("display");
    if (☃.c("color")) {
      ☃.o("color");
    }
  }
  
  public void b(zx ☃, int ☃)
  {
    if (this.m != yj.a.a) {
      throw new UnsupportedOperationException("Can't dye non-leather!");
    }
    dn ☃ = ☃.o();
    if (☃ == null)
    {
      ☃ = new dn();
      ☃.d(☃);
    }
    dn ☃ = ☃.m("display");
    if (!☃.b("display", 10)) {
      ☃.a("display", ☃);
    }
    ☃.a("color", ☃);
  }
  
  public boolean a(zx ☃, zx ☃)
  {
    if (this.m.b() == ☃.b()) {
      return true;
    }
    return super.a(☃, ☃);
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    int ☃ = ps.c(☃) - 1;
    zx ☃ = ☃.q(☃);
    if (☃ == null)
    {
      ☃.c(☃, ☃.k());
      ☃.b = 0;
    }
    return ☃;
  }
}
