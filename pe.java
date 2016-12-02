import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

public class pe
{
  public static final pe[] a = new pe[32];
  private static final Map<jy, pe> I = Maps.newHashMap();
  public static final pe b = null;
  public static final pe c = new pe(1, new jy("speed"), false, 8171462).c("potion.moveSpeed").b(0, 0).a(vy.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.20000000298023224D, 2);
  public static final pe d = new pe(2, new jy("slowness"), true, 5926017).c("potion.moveSlowdown").b(1, 0).a(vy.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15000000596046448D, 2);
  public static final pe e = new pe(3, new jy("haste"), false, 14270531).c("potion.digSpeed").b(2, 0).a(1.5D);
  public static final pe f = new pe(4, new jy("mining_fatigue"), true, 4866583).c("potion.digSlowDown").b(3, 0);
  public static final pe g = new pb(5, new jy("strength"), false, 9643043).c("potion.damageBoost").b(4, 0).a(vy.e, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 2.5D, 2);
  public static final pe h = new pd(6, new jy("instant_health"), false, 16262179).c("potion.heal");
  public static final pe i = new pd(7, new jy("instant_damage"), true, 4393481).c("potion.harm");
  public static final pe j = new pe(8, new jy("jump_boost"), false, 2293580).c("potion.jump").b(2, 1);
  public static final pe k = new pe(9, new jy("nausea"), true, 5578058).c("potion.confusion").b(3, 1).a(0.25D);
  public static final pe l = new pe(10, new jy("regeneration"), false, 13458603).c("potion.regeneration").b(7, 0).a(0.25D);
  public static final pe m = new pe(11, new jy("resistance"), false, 10044730).c("potion.resistance").b(6, 1);
  public static final pe n = new pe(12, new jy("fire_resistance"), false, 14981690).c("potion.fireResistance").b(7, 1);
  public static final pe o = new pe(13, new jy("water_breathing"), false, 3035801).c("potion.waterBreathing").b(0, 2);
  public static final pe p = new pe(14, new jy("invisibility"), false, 8356754).c("potion.invisibility").b(0, 1);
  public static final pe q = new pe(15, new jy("blindness"), true, 2039587).c("potion.blindness").b(5, 1).a(0.25D);
  public static final pe r = new pe(16, new jy("night_vision"), false, 2039713).c("potion.nightVision").b(4, 1);
  public static final pe s = new pe(17, new jy("hunger"), true, 5797459).c("potion.hunger").b(1, 1);
  public static final pe t = new pb(18, new jy("weakness"), true, 4738376).c("potion.weakness").b(5, 0).a(vy.e, "22653B89-116E-49DC-9B6B-9971489B5BE5", 2.0D, 0);
  public static final pe u = new pe(19, new jy("poison"), true, 5149489).c("potion.poison").b(6, 0).a(0.25D);
  public static final pe v = new pe(20, new jy("wither"), true, 3484199).c("potion.wither").b(1, 2).a(0.25D);
  public static final pe w = new pc(21, new jy("health_boost"), false, 16284963).c("potion.healthBoost").b(2, 2).a(vy.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0D, 0);
  public static final pe x = new pa(22, new jy("absorption"), false, 2445989).c("potion.absorption").b(2, 2);
  public static final pe y = new pd(23, new jy("saturation"), false, 16262179).c("potion.saturation");
  public static final pe z = null;
  public static final pe A = null;
  public static final pe B = null;
  public static final pe C = null;
  public static final pe D = null;
  public static final pe E = null;
  public static final pe F = null;
  public static final pe G = null;
  public final int H;
  private final Map<qb, qd> J = Maps.newHashMap();
  private final boolean K;
  private final int L;
  private String M = "";
  private int N = -1;
  private double O;
  private boolean P;
  
  protected pe(int ☃, jy ☃, boolean ☃, int ☃)
  {
    H = ☃;
    
    a[☃] = this;
    I.put(☃, this);
    K = ☃;
    if (☃) {
      O = 0.5D;
    } else {
      O = 1.0D;
    }
    L = ☃;
  }
  
  public static pe b(String ☃)
  {
    return (pe)I.get(new jy(☃));
  }
  
  public static Set<jy> c()
  {
    return I.keySet();
  }
  
  protected pe b(int ☃, int ☃)
  {
    N = (☃ + ☃ * 8);
    return this;
  }
  
  public int d()
  {
    return H;
  }
  
  public void a(pr ☃, int ☃)
  {
    if (H == lH)
    {
      if (☃.bn() < ☃.bu()) {
        ☃.h(1.0F);
      }
    }
    else if (H == uH)
    {
      if (☃.bn() > 1.0F) {
        ☃.a(ow.l, 1.0F);
      }
    }
    else if (H == vH) {
      ☃.a(ow.m, 1.0F);
    } else if ((H == sH) && ((☃ instanceof wn))) {
      ((wn)☃).a(0.025F * (☃ + 1));
    } else if ((H == yH) && ((☃ instanceof wn)))
    {
      if (!o.D) {
        ((wn)☃).cl().a(☃ + 1, 1.0F);
      }
    }
    else if (((H == hH) && (!☃.bm())) || ((H == iH) && (☃.bm()))) {
      ☃.h(Math.max(4 << ☃, 0));
    } else if (((H == iH) && (!☃.bm())) || ((H == hH) && (☃.bm()))) {
      ☃.a(ow.l, 6 << ☃);
    }
  }
  
  public void a(pk ☃, pk ☃, pr ☃, int ☃, double ☃)
  {
    if (((H == hH) && (!☃.bm())) || ((H == iH) && (☃.bm())))
    {
      int ☃ = (int)(☃ * (4 << ☃) + 0.5D);
      ☃.h(☃);
    }
    else if (((H == iH) && (!☃.bm())) || ((H == hH) && (☃.bm())))
    {
      int ☃ = (int)(☃ * (6 << ☃) + 0.5D);
      if (☃ == null) {
        ☃.a(ow.l, ☃);
      } else {
        ☃.a(ow.b(☃, ☃), ☃);
      }
    }
  }
  
  public boolean b()
  {
    return false;
  }
  
  public boolean a(int ☃, int ☃)
  {
    if (H == lH)
    {
      int ☃ = 50 >> ☃;
      if (☃ > 0) {
        return ☃ % ☃ == 0;
      }
      return true;
    }
    if (H == uH)
    {
      int ☃ = 25 >> ☃;
      if (☃ > 0) {
        return ☃ % ☃ == 0;
      }
      return true;
    }
    if (H == vH)
    {
      int ☃ = 40 >> ☃;
      if (☃ > 0) {
        return ☃ % ☃ == 0;
      }
      return true;
    }
    if (H == sH) {
      return true;
    }
    return false;
  }
  
  public pe c(String ☃)
  {
    M = ☃;
    return this;
  }
  
  public String a()
  {
    return M;
  }
  
  public boolean e()
  {
    return N >= 0;
  }
  
  public int f()
  {
    return N;
  }
  
  public boolean g()
  {
    return K;
  }
  
  public static String a(pf ☃)
  {
    if (☃.h()) {
      return "**:**";
    }
    int ☃ = ☃.b();
    return nx.a(☃);
  }
  
  protected pe a(double ☃)
  {
    O = ☃;
    return this;
  }
  
  public double h()
  {
    return O;
  }
  
  public boolean j()
  {
    return P;
  }
  
  public int k()
  {
    return L;
  }
  
  public pe a(qb ☃, String ☃, double ☃, int ☃)
  {
    qd ☃ = new qd(UUID.fromString(☃), a(), ☃, ☃);
    J.put(☃, ☃);
    return this;
  }
  
  public Map<qb, qd> l()
  {
    return J;
  }
  
  public void a(pr ☃, qf ☃, int ☃)
  {
    for (Map.Entry<qb, qd> ☃ : J.entrySet())
    {
      qc ☃ = ☃.a((qb)☃.getKey());
      if (☃ != null) {
        ☃.c((qd)☃.getValue());
      }
    }
  }
  
  public void b(pr ☃, qf ☃, int ☃)
  {
    for (Map.Entry<qb, qd> ☃ : J.entrySet())
    {
      qc ☃ = ☃.a((qb)☃.getKey());
      if (☃ != null)
      {
        qd ☃ = (qd)☃.getValue();
        ☃.c(☃);
        ☃.b(new qd(☃.a(), a() + " " + ☃, a(☃, ☃), ☃.c()));
      }
    }
  }
  
  public double a(int ☃, qd ☃)
  {
    return ☃.d() * (☃ + 1);
  }
}
