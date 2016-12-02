import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class ady
{
  private static final Logger aD = ;
  
  public static enum b
  {
    private b() {}
  }
  
  public static class a
  {
    public float a;
    public float b;
    
    public a(float ☃, float ☃)
    {
      a = ☃;
      b = ☃;
    }
    
    public a a()
    {
      return new a(a * 0.8F, b * 0.6F);
    }
  }
  
  protected static final ady.a a = new ady.a(0.1F, 0.2F);
  protected static final ady.a b = new ady.a(-0.5F, 0.0F);
  protected static final ady.a c = new ady.a(-1.0F, 0.1F);
  protected static final ady.a d = new ady.a(-1.8F, 0.1F);
  protected static final ady.a e = new ady.a(0.125F, 0.05F);
  protected static final ady.a f = new ady.a(0.2F, 0.2F);
  protected static final ady.a g = new ady.a(0.45F, 0.3F);
  protected static final ady.a h = new ady.a(1.5F, 0.025F);
  protected static final ady.a i = new ady.a(1.0F, 0.5F);
  protected static final ady.a j = new ady.a(0.0F, 0.025F);
  protected static final ady.a k = new ady.a(0.1F, 0.8F);
  protected static final ady.a l = new ady.a(0.2F, 0.3F);
  protected static final ady.a m = new ady.a(-0.2F, 0.1F);
  private static final ady[] aE = new ady['Ā'];
  public static final Set<ady> n = Sets.newHashSet();
  public static final Map<String, ady> o = Maps.newHashMap();
  public static final ady p = new aen(0).b(112).a("Ocean").a(c);
  public static final ady q = new aeo(1).b(9286496).a("Plains");
  public static final ady r = new aed(2).b(16421912).a("Desert").b().a(2.0F, 0.0F).a(e);
  public static final ady s = new aee(3, false).b(6316128).a("Extreme Hills").a(i).a(0.2F, 0.3F);
  public static final ady t = new aeg(4, 0).b(353825).a("Forest");
  public static final ady u = new aeu(5, 0).b(747097).a("Taiga").a(5159473).a(0.25F, 0.8F).a(f);
  public static final ady v = new aet(6).b(522674).a("Swampland").a(9154376).a(m).a(0.8F, 0.9F);
  public static final ady w = new aeq(7).b(255).a("River").a(b);
  public static final ady x = new aeh(8).b(16711680).a("Hell").b().a(2.0F, 0.0F);
  public static final ady y = new aev(9).b(8421631).a("The End").b();
  public static final ady z = new aen(10).b(9474208).a("FrozenOcean").c().a(c).a(0.0F, 0.5F);
  public static final ady A = new aeq(11).b(10526975).a("FrozenRiver").c().a(b).a(0.0F, 0.5F);
  public static final ady B = new aei(12, false).b(16777215).a("Ice Plains").c().a(0.0F, 0.5F).a(e);
  public static final ady C = new aei(13, false).b(10526880).a("Ice Mountains").c().a(g).a(0.0F, 0.5F);
  public static final ady D = new ael(14).b(16711935).a("MushroomIsland").a(0.9F, 1.0F).a(l);
  public static final ady E = new ael(15).b(10486015).a("MushroomIslandShore").a(0.9F, 1.0F).a(j);
  public static final ady F = new adx(16).b(16440917).a("Beach").a(0.8F, 0.4F).a(j);
  public static final ady G = new aed(17).b(13786898).a("DesertHills").b().a(2.0F, 0.0F).a(g);
  public static final ady H = new aeg(18, 0).b(2250012).a("ForestHills").a(g);
  public static final ady I = new aeu(19, 0).b(1456435).a("TaigaHills").a(5159473).a(0.25F, 0.8F).a(g);
  public static final ady J = new aee(20, true).b(7501978).a("Extreme Hills Edge").a(i.a()).a(0.2F, 0.3F);
  public static final ady K = new aej(21, false).b(5470985).a("Jungle").a(5470985).a(0.95F, 0.9F);
  public static final ady L = new aej(22, false).b(2900485).a("JungleHills").a(5470985).a(0.95F, 0.9F).a(g);
  public static final ady M = new aej(23, true).b(6458135).a("JungleEdge").a(5470985).a(0.95F, 0.8F);
  public static final ady N = new aen(24).b(48).a("Deep Ocean").a(d);
  public static final ady O = new aes(25).b(10658436).a("Stone Beach").a(0.2F, 0.3F).a(k);
  public static final ady P = new adx(26).b(16445632).a("Cold Beach").a(0.05F, 0.3F).a(j).c();
  public static final ady Q = new aeg(27, 2).a("Birch Forest").b(3175492);
  public static final ady R = new aeg(28, 2).a("Birch Forest Hills").b(2055986).a(g);
  public static final ady S = new aeg(29, 3).b(4215066).a("Roofed Forest");
  public static final ady T = new aeu(30, 0).b(3233098).a("Cold Taiga").a(5159473).c().a(-0.5F, 0.4F).a(f).c(16777215);
  public static final ady U = new aeu(31, 0).b(2375478).a("Cold Taiga Hills").a(5159473).c().a(-0.5F, 0.4F).a(g).c(16777215);
  public static final ady V = new aeu(32, 1).b(5858897).a("Mega Taiga").a(5159473).a(0.3F, 0.8F).a(f);
  public static final ady W = new aeu(33, 1).b(4542270).a("Mega Taiga Hills").a(5159473).a(0.3F, 0.8F).a(g);
  public static final ady X = new aee(34, true).b(5271632).a("Extreme Hills+").a(i).a(0.2F, 0.3F);
  public static final ady Y = new aer(35).b(12431967).a("Savanna").a(1.2F, 0.0F).b().a(e);
  public static final ady Z = new aer(36).b(10984804).a("Savanna Plateau").a(1.0F, 0.0F).b().a(h);
  public static final ady aa = new aek(37, false, false).b(14238997).a("Mesa");
  public static final ady ab = new aek(38, false, true).b(11573093).a("Mesa Plateau F").a(h);
  public static final ady ac = new aek(39, false, false).b(13274213).a("Mesa Plateau").a(h);
  public static final ady ad = p;
  
  static
  {
    q.k();
    r.k();
    t.k();
    u.k();
    v.k();
    B.k();
    K.k();
    M.k();
    T.k();
    Y.k();
    Z.k();
    aa.k();
    ab.k();
    ac.k();
    Q.k();
    R.k();
    S.k();
    V.k();
    s.k();
    X.k();
    
    V.d(Waz + 128).a("Redwood Taiga Hills M");
    for (ady ☃ : aE) {
      if (☃ != null)
      {
        if (o.containsKey(ah)) {
          throw new Error("Biome \"" + ah + "\" is defined as both ID " + ogetah)).az + " and " + az);
        }
        o.put(ah, ☃);
        if (az < 128) {
          n.add(☃);
        }
      }
    }
    n.remove(x);
    n.remove(y);
    n.remove(z);
    n.remove(J);
  }
  
  protected static final ard ae = new ard(new Random(1234L), 1);
  protected static final ard af = new ard(new Random(2345L), 1);
  protected static final aos ag = new aos();
  public String ah;
  public int ai;
  public int aj;
  public alz ak = afi.c.Q();
  public alz al = afi.d.Q();
  public int am = 5169201;
  public float an = aa;
  public float ao = ab;
  public float ap = 0.5F;
  public float aq = 0.5F;
  public int ar = 16777215;
  public aeb as;
  protected List<ady.c> at = Lists.newArrayList();
  protected List<ady.c> au = Lists.newArrayList();
  protected List<ady.c> av = Lists.newArrayList();
  protected List<ady.c> aw = Lists.newArrayList();
  protected boolean ax;
  protected boolean ay = true;
  public final int az;
  
  protected ady(int ☃)
  {
    az = ☃;
    aE[☃] = this;
    as = a();
    
    au.add(new ady.c(tv.class, 12, 4, 4));
    au.add(new ady.c(tu.class, 10, 3, 3));
    au.add(new ady.c(tt.class, 10, 4, 4));
    au.add(new ady.c(tn.class, 10, 4, 4));
    au.add(new ady.c(to.class, 8, 4, 4));
    
    at.add(new ady.c(wc.class, 100, 4, 4));
    at.add(new ady.c(we.class, 100, 4, 4));
    at.add(new ady.c(wa.class, 100, 4, 4));
    at.add(new ady.c(vn.class, 100, 4, 4));
    at.add(new ady.c(wb.class, 100, 4, 4));
    at.add(new ady.c(vo.class, 10, 1, 4));
    at.add(new ady.c(wd.class, 5, 1, 1));
    
    av.add(new ady.c(tx.class, 10, 4, 4));
    
    aw.add(new ady.c(tk.class, 10, 8, 8));
  }
  
  protected aeb a()
  {
    return new aeb();
  }
  
  protected ady a(float ☃, float ☃)
  {
    if ((☃ > 0.1F) && (☃ < 0.2F)) {
      throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
    }
    ap = ☃;
    aq = ☃;
    return this;
  }
  
  protected final ady a(ady.a ☃)
  {
    an = a;
    ao = b;
    return this;
  }
  
  protected ady b()
  {
    ay = false;
    return this;
  }
  
  protected apv aA = new apv(false);
  protected aoi aB = new aoi(false);
  protected apt aC = new apt();
  
  public aoh a(Random ☃)
  {
    if (☃.nextInt(10) == 0) {
      return aB;
    }
    return aA;
  }
  
  public aot b(Random ☃)
  {
    return new apu(akc.a.b);
  }
  
  public agw.a a(Random ☃, cj ☃)
  {
    if (☃.nextInt(3) > 0) {
      return agw.a.a;
    }
    return agw.a.b;
  }
  
  protected ady c()
  {
    ax = true;
    return this;
  }
  
  protected ady a(String ☃)
  {
    ah = ☃;
    return this;
  }
  
  protected ady a(int ☃)
  {
    am = ☃;
    return this;
  }
  
  protected ady b(int ☃)
  {
    a(☃, false);
    return this;
  }
  
  protected ady c(int ☃)
  {
    aj = ☃;
    return this;
  }
  
  protected ady a(int ☃, boolean ☃)
  {
    ai = ☃;
    if (☃) {
      aj = ((☃ & 0xFEFEFE) >> 1);
    } else {
      aj = ☃;
    }
    return this;
  }
  
  public int a(float ☃)
  {
    ☃ /= 3.0F;
    ☃ = ns.a(☃, -1.0F, 1.0F);
    return ns.c(0.62222224F - ☃ * 0.05F, 0.5F + ☃ * 0.1F, 1.0F);
  }
  
  public List<ady.c> a(pt ☃)
  {
    switch (ady.1.a[☃.ordinal()])
    {
    case 1: 
      return at;
    case 2: 
      return au;
    case 3: 
      return av;
    case 4: 
      return aw;
    }
    return Collections.emptyList();
  }
  
  public static class c
    extends oa.a
  {
    public Class<? extends ps> b;
    public int c;
    public int d;
    
    public c(Class<? extends ps> ☃, int ☃, int ☃, int ☃)
    {
      super();
      b = ☃;
      c = ☃;
      d = ☃;
    }
    
    public String toString()
    {
      return b.getSimpleName() + "*(" + c + "-" + d + "):" + a;
    }
  }
  
  public boolean d()
  {
    return j();
  }
  
  public boolean e()
  {
    if (j()) {
      return false;
    }
    return ay;
  }
  
  public boolean f()
  {
    return aq > 0.85F;
  }
  
  public float g()
  {
    return 0.1F;
  }
  
  public final int h()
  {
    return (int)(aq * 65536.0F);
  }
  
  public final float i()
  {
    return aq;
  }
  
  public final float a(cj ☃)
  {
    if (☃.o() > 64)
    {
      float ☃ = (float)(ae.a(☃.n() * 1.0D / 8.0D, ☃.p() * 1.0D / 8.0D) * 4.0D);
      return ap - (☃ + ☃.o() - 64.0F) * 0.05F / 30.0F;
    }
    return ap;
  }
  
  public void a(adm ☃, Random ☃, cj ☃)
  {
    as.a(☃, ☃, this, ☃);
  }
  
  public int b(cj ☃)
  {
    double ☃ = ns.a(a(☃), 0.0F, 1.0F);
    double ☃ = ns.a(i(), 0.0F, 1.0F);
    
    return adl.a(☃, ☃);
  }
  
  public int c(cj ☃)
  {
    double ☃ = ns.a(a(☃), 0.0F, 1.0F);
    double ☃ = ns.a(i(), 0.0F, 1.0F);
    
    return adj.a(☃, ☃);
  }
  
  public boolean j()
  {
    return ax;
  }
  
  public void a(adm ☃, Random ☃, ans ☃, int ☃, int ☃, double ☃)
  {
    b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public final void b(adm ☃, Random ☃, ans ☃, int ☃, int ☃, double ☃)
  {
    int ☃ = ☃.F();
    alz ☃ = ak;
    alz ☃ = al;
    int ☃ = -1;
    int ☃ = (int)(☃ / 3.0D + 3.0D + ☃.nextDouble() * 0.25D);
    
    int ☃ = ☃ & 0xF;
    int ☃ = ☃ & 0xF;
    cj.a ☃ = new cj.a();
    for (int ☃ = 255; ☃ >= 0; ☃--) {
      if (☃ <= ☃.nextInt(5))
      {
        ☃.a(☃, ☃, ☃, afi.h.Q());
      }
      else
      {
        alz ☃ = ☃.a(☃, ☃, ☃);
        if (☃.c().t() == arm.a) {
          ☃ = -1;
        } else if (☃.c() == afi.b) {
          if (☃ == -1)
          {
            if (☃ <= 0)
            {
              ☃ = null;
              ☃ = afi.b.Q();
            }
            else if ((☃ >= ☃ - 4) && (☃ <= ☃ + 1))
            {
              ☃ = ak;
              ☃ = al;
            }
            if ((☃ < ☃) && ((☃ == null) || (☃.c().t() == arm.a))) {
              if (a(☃.c(☃, ☃, ☃)) < 0.15F) {
                ☃ = afi.aI.Q();
              } else {
                ☃ = afi.j.Q();
              }
            }
            ☃ = ☃;
            if (☃ >= ☃ - 1)
            {
              ☃.a(☃, ☃, ☃, ☃);
            }
            else if (☃ < ☃ - 7 - ☃)
            {
              ☃ = null;
              ☃ = afi.b.Q();
              ☃.a(☃, ☃, ☃, afi.n.Q());
            }
            else
            {
              ☃.a(☃, ☃, ☃, ☃);
            }
          }
          else if (☃ > 0)
          {
            ☃--;
            ☃.a(☃, ☃, ☃, ☃);
            if ((☃ == 0) && (☃.c() == afi.m))
            {
              ☃ = ☃.nextInt(4) + Math.max(0, ☃ - 63);
              ☃ = ☃.b(ajh.a) == ajh.a.b ? afi.cM.Q() : afi.A.Q();
            }
          }
        }
      }
    }
  }
  
  protected ady k()
  {
    return d(az + 128);
  }
  
  protected ady d(int ☃)
  {
    return new aem(☃, this);
  }
  
  public Class<? extends ady> l()
  {
    return getClass();
  }
  
  public boolean a(ady ☃)
  {
    if (☃ == this) {
      return true;
    }
    if (☃ == null) {
      return false;
    }
    return l() == ☃.l();
  }
  
  public ady.b m()
  {
    if (ap < 0.2D) {
      return ady.b.b;
    }
    if (ap < 1.0D) {
      return ady.b.c;
    }
    return ady.b.d;
  }
  
  public static ady[] n()
  {
    return aE;
  }
  
  public static ady e(int ☃)
  {
    return a(☃, null);
  }
  
  public static ady a(int ☃, ady ☃)
  {
    if ((☃ < 0) || (☃ > aE.length))
    {
      aD.warn("Biome ID is out of bounds: " + ☃ + ", defaulting to 0 (Ocean)");
      return p;
    }
    ady ☃ = aE[☃];
    if (☃ == null) {
      return ☃;
    }
    return ☃;
  }
}
