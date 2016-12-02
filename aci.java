import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class aci
{
  private static final aci[] a = new aci['Ā'];
  public static final aci[] b;
  private static final Map<jy, aci> E = Maps.newHashMap();
  public static final aci c = new acr(0, new jy("protection"), 10, 0);
  public static final aci d = new acr(1, new jy("fire_protection"), 5, 1);
  public static final aci e = new acr(2, new jy("feather_falling"), 5, 2);
  public static final aci f = new acr(3, new jy("blast_protection"), 2, 3);
  public static final aci g = new acr(4, new jy("projectile_protection"), 5, 4);
  public static final aci h = new acq(5, new jy("respiration"), 2);
  public static final aci i = new acv(6, new jy("aqua_affinity"), 2);
  public static final aci j = new acs(7, new jy("thorns"), 1);
  public static final aci k = new acu(8, new jy("depth_strider"), 2);
  public static final aci l = new acf(16, new jy("sharpness"), 10, 0);
  public static final aci m = new acf(17, new jy("smite"), 5, 1);
  public static final aci n = new acf(18, new jy("bane_of_arthropods"), 5, 2);
  public static final aci o = new aco(19, new jy("knockback"), 5);
  public static final aci p = new acm(20, new jy("fire_aspect"), 2);
  public static final aci q = new acp(21, new jy("looting"), 2, acj.g);
  public static final aci r = new ach(32, new jy("efficiency"), 10);
  public static final aci s = new act(33, new jy("silk_touch"), 1);
  public static final aci t = new acg(34, new jy("unbreaking"), 5);
  public static final aci u = new acp(35, new jy("fortune"), 2, acj.h);
  public static final aci v = new acb(48, new jy("power"), 10);
  public static final aci w = new ace(49, new jy("punch"), 2);
  public static final aci x = new acc(50, new jy("flame"), 2);
  public static final aci y = new acd(51, new jy("infinity"), 1);
  public static final aci z = new acp(61, new jy("luck_of_the_sea"), 2, acj.i);
  public static final aci A = new acn(62, new jy("lure"), 2, acj.i);
  public final int B;
  private final int F;
  public acj C;
  protected String D;
  
  static
  {
    List<aci> ☃ = Lists.newArrayList();
    for (aci ☃ : a) {
      if (☃ != null) {
        ☃.add(☃);
      }
    }
    b = (aci[])☃.toArray(new aci[☃.size()]);
  }
  
  public static aci c(int ☃)
  {
    if ((☃ < 0) || (☃ >= a.length)) {
      return null;
    }
    return a[☃];
  }
  
  protected aci(int ☃, jy ☃, int ☃, acj ☃)
  {
    B = ☃;
    F = ☃;
    C = ☃;
    if (a[☃] != null) {
      throw new IllegalArgumentException("Duplicate enchantment id!");
    }
    a[☃] = this;
    E.put(☃, this);
  }
  
  public static aci b(String ☃)
  {
    return (aci)E.get(new jy(☃));
  }
  
  public static Set<jy> c()
  {
    return E.keySet();
  }
  
  public int d()
  {
    return F;
  }
  
  public int e()
  {
    return 1;
  }
  
  public int b()
  {
    return 1;
  }
  
  public int a(int ☃)
  {
    return 1 + ☃ * 10;
  }
  
  public int b(int ☃)
  {
    return a(☃) + 5;
  }
  
  public int a(int ☃, ow ☃)
  {
    return 0;
  }
  
  public float a(int ☃, pw ☃)
  {
    return 0.0F;
  }
  
  public boolean a(aci ☃)
  {
    return this != ☃;
  }
  
  public aci c(String ☃)
  {
    D = ☃;
    return this;
  }
  
  public String a()
  {
    return "enchantment." + D;
  }
  
  public String d(int ☃)
  {
    String ☃ = di.a(a());
    return ☃ + " " + di.a(new StringBuilder().append("enchantment.level.").append(☃).toString());
  }
  
  public boolean a(zx ☃)
  {
    return C.a(☃.b());
  }
  
  public void a(pr ☃, pk ☃, int ☃) {}
  
  public void b(pr ☃, pk ☃, int ☃) {}
}
