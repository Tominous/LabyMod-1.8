import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;
import java.util.List;
import java.util.Random;

public class axd
  extends axu
  implements avx.a, awg.b
{
  private axb i;
  protected String a = "Customize World Settings";
  protected String f = "Page 1 of 3";
  protected String g = "Basic Settings";
  protected String[] h = new String[4];
  private awg r;
  private avs s;
  private avs t;
  private avs u;
  private avs v;
  private avs w;
  private avs x;
  private avs y;
  private avs z;
  private boolean A = false;
  private int B = 0;
  private boolean C = false;
  private Predicate<String> D = new Predicate()
  {
    public boolean a(String ☃)
    {
      Float ☃ = Floats.tryParse(☃);
      return (☃.length() == 0) || ((☃ != null) && (Floats.isFinite(☃.floatValue())) && (☃.floatValue() >= 0.0F));
    }
  };
  private ant.a E = new ant.a();
  private ant.a F;
  private Random G = new Random();
  
  public axd(axu ☃, String ☃)
  {
    i = ((axb)☃);
    a(☃);
  }
  
  public void b()
  {
    int ☃ = 0;
    int ☃ = 0;
    if (r != null)
    {
      ☃ = r.e();
      ☃ = r.n();
    }
    a = bnq.a("options.customizeTitle", new Object[0]);
    n.clear();
    
    n.add(v = new avs(302, 20, 5, 80, 20, bnq.a("createWorld.customize.custom.prev", new Object[0])));
    n.add(w = new avs(303, l - 100, 5, 80, 20, bnq.a("createWorld.customize.custom.next", new Object[0])));
    
    n.add(u = new avs(304, l / 2 - 187, m - 27, 90, 20, bnq.a("createWorld.customize.custom.defaults", new Object[0])));
    n.add(t = new avs(301, l / 2 - 92, m - 27, 90, 20, bnq.a("createWorld.customize.custom.randomize", new Object[0])));
    n.add(z = new avs(305, l / 2 + 3, m - 27, 90, 20, bnq.a("createWorld.customize.custom.presets", new Object[0])));
    n.add(s = new avs(300, l / 2 + 98, m - 27, 90, 20, bnq.a("gui.done", new Object[0])));
    u.l = A;
    
    x = new avs(306, l / 2 - 55, 160, 50, 20, bnq.a("gui.yes", new Object[0]));
    x.m = false;
    n.add(x);
    
    y = new avs(307, l / 2 + 5, 160, 50, 20, bnq.a("gui.no", new Object[0]));
    y.m = false;
    n.add(y);
    if (B != 0)
    {
      x.m = true;
      y.m = true;
    }
    f();
    if (☃ != 0)
    {
      r.c(☃);
      r.h(☃);
      i();
    }
  }
  
  public void k()
  {
    super.k();
    r.p();
  }
  
  private void f()
  {
    awg.f[] ☃ = { new awg.g(160, bnq.a("createWorld.customize.custom.seaLevel", new Object[0]), true, this, 1.0F, 255.0F, F.r), new awg.a(148, bnq.a("createWorld.customize.custom.useCaves", new Object[0]), true, F.s), new awg.a(150, bnq.a("createWorld.customize.custom.useStrongholds", new Object[0]), true, F.v), new awg.a(151, bnq.a("createWorld.customize.custom.useVillages", new Object[0]), true, F.w), new awg.a(152, bnq.a("createWorld.customize.custom.useMineShafts", new Object[0]), true, F.x), new awg.a(153, bnq.a("createWorld.customize.custom.useTemples", new Object[0]), true, F.y), new awg.a(210, bnq.a("createWorld.customize.custom.useMonuments", new Object[0]), true, F.z), new awg.a(154, bnq.a("createWorld.customize.custom.useRavines", new Object[0]), true, F.A), new awg.a(149, bnq.a("createWorld.customize.custom.useDungeons", new Object[0]), true, F.t), new awg.g(157, bnq.a("createWorld.customize.custom.dungeonChance", new Object[0]), true, this, 1.0F, 100.0F, F.u), new awg.a(155, bnq.a("createWorld.customize.custom.useWaterLakes", new Object[0]), true, F.B), new awg.g(158, bnq.a("createWorld.customize.custom.waterLakeChance", new Object[0]), true, this, 1.0F, 100.0F, F.C), new awg.a(156, bnq.a("createWorld.customize.custom.useLavaLakes", new Object[0]), true, F.D), new awg.g(159, bnq.a("createWorld.customize.custom.lavaLakeChance", new Object[0]), true, this, 10.0F, 100.0F, F.E), new awg.a(161, bnq.a("createWorld.customize.custom.useLavaOceans", new Object[0]), true, F.F), new awg.g(162, bnq.a("createWorld.customize.custom.fixedBiome", new Object[0]), true, this, -1.0F, 37.0F, F.G), new awg.g(163, bnq.a("createWorld.customize.custom.biomeSize", new Object[0]), true, this, 1.0F, 8.0F, F.H), new awg.g(164, bnq.a("createWorld.customize.custom.riverSize", new Object[0]), true, this, 1.0F, 5.0F, F.I) };
    
    awg.f[] ☃ = { new awg.e(416, bnq.a("tile.dirt.name", new Object[0]), false), null, new awg.g(165, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, F.J), new awg.g(166, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, F.K), new awg.g(167, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, F.L), new awg.g(168, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, F.M), new awg.e(417, bnq.a("tile.gravel.name", new Object[0]), false), null, new awg.g(169, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, F.N), new awg.g(170, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, F.O), new awg.g(171, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, F.P), new awg.g(172, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, F.Q), new awg.e(418, bnq.a("tile.stone.granite.name", new Object[0]), false), null, new awg.g(173, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, F.R), new awg.g(174, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, F.S), new awg.g(175, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, F.T), new awg.g(176, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, F.U), new awg.e(419, bnq.a("tile.stone.diorite.name", new Object[0]), false), null, new awg.g(177, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, F.V), new awg.g(178, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, F.W), new awg.g(179, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, F.X), new awg.g(180, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, F.Y), new awg.e(420, bnq.a("tile.stone.andesite.name", new Object[0]), false), null, new awg.g(181, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, F.Z), new awg.g(182, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, F.aa), new awg.g(183, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, F.ab), new awg.g(184, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, F.ac), new awg.e(421, bnq.a("tile.oreCoal.name", new Object[0]), false), null, new awg.g(185, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, F.ad), new awg.g(186, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, F.ae), new awg.g(187, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, F.af), new awg.g(189, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, F.ag), new awg.e(422, bnq.a("tile.oreIron.name", new Object[0]), false), null, new awg.g(190, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, F.ah), new awg.g(191, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, F.ai), new awg.g(192, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, F.aj), new awg.g(193, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, F.ak), new awg.e(423, bnq.a("tile.oreGold.name", new Object[0]), false), null, new awg.g(194, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, F.al), new awg.g(195, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, F.am), new awg.g(196, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, F.an), new awg.g(197, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, F.ao), new awg.e(424, bnq.a("tile.oreRedstone.name", new Object[0]), false), null, new awg.g(198, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, F.ap), new awg.g(199, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, F.aq), new awg.g(200, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, F.ar), new awg.g(201, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, F.as), new awg.e(425, bnq.a("tile.oreDiamond.name", new Object[0]), false), null, new awg.g(202, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, F.at), new awg.g(203, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, F.au), new awg.g(204, bnq.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0F, 255.0F, F.av), new awg.g(205, bnq.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0F, 255.0F, F.aw), new awg.e(426, bnq.a("tile.oreLapis.name", new Object[0]), false), null, new awg.g(206, bnq.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0F, 50.0F, F.ax), new awg.g(207, bnq.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0F, 40.0F, F.ay), new awg.g(208, bnq.a("createWorld.customize.custom.center", new Object[0]), false, this, 0.0F, 255.0F, F.az), new awg.g(209, bnq.a("createWorld.customize.custom.spread", new Object[0]), false, this, 0.0F, 255.0F, F.aA) };
    
    awg.f[] ☃ = { new awg.g(100, bnq.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]), false, this, 1.0F, 5000.0F, F.i), new awg.g(101, bnq.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]), false, this, 1.0F, 5000.0F, F.j), new awg.g(102, bnq.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]), false, this, 1.0F, 5000.0F, F.k), new awg.g(103, bnq.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]), false, this, 1.0F, 2000.0F, F.f), new awg.g(104, bnq.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]), false, this, 1.0F, 2000.0F, F.g), new awg.g(105, bnq.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]), false, this, 0.01F, 20.0F, F.h), new awg.g(106, bnq.a("createWorld.customize.custom.baseSize", new Object[0]), false, this, 1.0F, 25.0F, F.l), new awg.g(107, bnq.a("createWorld.customize.custom.coordinateScale", new Object[0]), false, this, 1.0F, 6000.0F, F.b), new awg.g(108, bnq.a("createWorld.customize.custom.heightScale", new Object[0]), false, this, 1.0F, 6000.0F, F.c), new awg.g(109, bnq.a("createWorld.customize.custom.stretchY", new Object[0]), false, this, 0.01F, 50.0F, F.m), new awg.g(110, bnq.a("createWorld.customize.custom.upperLimitScale", new Object[0]), false, this, 1.0F, 5000.0F, F.d), new awg.g(111, bnq.a("createWorld.customize.custom.lowerLimitScale", new Object[0]), false, this, 1.0F, 5000.0F, F.e), new awg.g(112, bnq.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]), false, this, 1.0F, 20.0F, F.n), new awg.g(113, bnq.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]), false, this, 0.0F, 20.0F, F.o), new awg.g(114, bnq.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]), false, this, 1.0F, 20.0F, F.p), new awg.g(115, bnq.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]), false, this, 0.0F, 20.0F, F.q) };
    
    awg.f[] ☃ = { new awg.e(400, bnq.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]) + ":", false), new awg.c(132, String.format("%5.3f", new Object[] { Float.valueOf(F.i) }), false, D), new awg.e(401, bnq.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]) + ":", false), new awg.c(133, String.format("%5.3f", new Object[] { Float.valueOf(F.j) }), false, D), new awg.e(402, bnq.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]) + ":", false), new awg.c(134, String.format("%5.3f", new Object[] { Float.valueOf(F.k) }), false, D), new awg.e(403, bnq.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]) + ":", false), new awg.c(135, String.format("%5.3f", new Object[] { Float.valueOf(F.f) }), false, D), new awg.e(404, bnq.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]) + ":", false), new awg.c(136, String.format("%5.3f", new Object[] { Float.valueOf(F.g) }), false, D), new awg.e(405, bnq.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]) + ":", false), new awg.c(137, String.format("%2.3f", new Object[] { Float.valueOf(F.h) }), false, D), new awg.e(406, bnq.a("createWorld.customize.custom.baseSize", new Object[0]) + ":", false), new awg.c(138, String.format("%2.3f", new Object[] { Float.valueOf(F.l) }), false, D), new awg.e(407, bnq.a("createWorld.customize.custom.coordinateScale", new Object[0]) + ":", false), new awg.c(139, String.format("%5.3f", new Object[] { Float.valueOf(F.b) }), false, D), new awg.e(408, bnq.a("createWorld.customize.custom.heightScale", new Object[0]) + ":", false), new awg.c(140, String.format("%5.3f", new Object[] { Float.valueOf(F.c) }), false, D), new awg.e(409, bnq.a("createWorld.customize.custom.stretchY", new Object[0]) + ":", false), new awg.c(141, String.format("%2.3f", new Object[] { Float.valueOf(F.m) }), false, D), new awg.e(410, bnq.a("createWorld.customize.custom.upperLimitScale", new Object[0]) + ":", false), new awg.c(142, String.format("%5.3f", new Object[] { Float.valueOf(F.d) }), false, D), new awg.e(411, bnq.a("createWorld.customize.custom.lowerLimitScale", new Object[0]) + ":", false), new awg.c(143, String.format("%5.3f", new Object[] { Float.valueOf(F.e) }), false, D), new awg.e(412, bnq.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]) + ":", false), new awg.c(144, String.format("%2.3f", new Object[] { Float.valueOf(F.n) }), false, D), new awg.e(413, bnq.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]) + ":", false), new awg.c(145, String.format("%2.3f", new Object[] { Float.valueOf(F.o) }), false, D), new awg.e(414, bnq.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]) + ":", false), new awg.c(146, String.format("%2.3f", new Object[] { Float.valueOf(F.p) }), false, D), new awg.e(415, bnq.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]) + ":", false), new awg.c(147, String.format("%2.3f", new Object[] { Float.valueOf(F.q) }), false, D) };
    
    r = new awg(j, l, m, 32, m - 32, 25, this, new awg.f[][] { ☃, ☃, ☃, ☃ });
    for (int ☃ = 0; ☃ < 4; ☃++) {
      h[☃] = bnq.a("createWorld.customize.custom.page" + ☃, new Object[0]);
    }
    i();
  }
  
  public String a()
  {
    return F.toString().replace("\n", "");
  }
  
  public void a(String ☃)
  {
    if ((☃ != null) && (☃.length() != 0)) {
      F = ant.a.a(☃);
    } else {
      F = new ant.a();
    }
  }
  
  public void a(int ☃, String ☃)
  {
    float ☃ = 0.0F;
    try
    {
      ☃ = Float.parseFloat(☃);
    }
    catch (NumberFormatException localNumberFormatException) {}
    float ☃ = 0.0F;
    switch (☃)
    {
    case 139: 
      ☃ = F.b = ns.a(☃, 1.0F, 6000.0F);
      break;
    case 140: 
      ☃ = F.c = ns.a(☃, 1.0F, 6000.0F);
      break;
    case 142: 
      ☃ = F.d = ns.a(☃, 1.0F, 5000.0F);
      break;
    case 143: 
      ☃ = F.e = ns.a(☃, 1.0F, 5000.0F);
      break;
    case 135: 
      ☃ = F.f = ns.a(☃, 1.0F, 2000.0F);
      break;
    case 136: 
      ☃ = F.g = ns.a(☃, 1.0F, 2000.0F);
      break;
    case 137: 
      ☃ = F.h = ns.a(☃, 0.01F, 20.0F);
      break;
    case 132: 
      ☃ = F.i = ns.a(☃, 1.0F, 5000.0F);
      break;
    case 133: 
      ☃ = F.j = ns.a(☃, 1.0F, 5000.0F);
      break;
    case 134: 
      ☃ = F.k = ns.a(☃, 1.0F, 5000.0F);
      break;
    case 138: 
      ☃ = F.l = ns.a(☃, 1.0F, 25.0F);
      break;
    case 141: 
      ☃ = F.m = ns.a(☃, 0.01F, 50.0F);
      break;
    case 144: 
      ☃ = F.n = ns.a(☃, 1.0F, 20.0F);
      break;
    case 145: 
      ☃ = F.o = ns.a(☃, 0.0F, 20.0F);
      break;
    case 146: 
      ☃ = F.p = ns.a(☃, 1.0F, 20.0F);
      break;
    case 147: 
      ☃ = F.q = ns.a(☃, 0.0F, 20.0F);
    }
    if ((☃ != ☃) && (☃ != 0.0F)) {
      ((avw)r.d(☃)).a(b(☃, ☃));
    }
    ((avx)r.d(☃ - 132 + 100)).a(☃, false);
    if (!F.equals(E)) {
      a(true);
    }
  }
  
  private void a(boolean ☃)
  {
    A = ☃;
    u.l = ☃;
  }
  
  public String a(int ☃, String ☃, float ☃)
  {
    return ☃ + ": " + b(☃, ☃);
  }
  
  private String b(int ☃, float ☃)
  {
    switch (☃)
    {
    case 100: 
    case 101: 
    case 102: 
    case 103: 
    case 104: 
    case 107: 
    case 108: 
    case 110: 
    case 111: 
    case 132: 
    case 133: 
    case 134: 
    case 135: 
    case 136: 
    case 139: 
    case 140: 
    case 142: 
    case 143: 
      return String.format("%5.3f", new Object[] { Float.valueOf(☃) });
    case 105: 
    case 106: 
    case 109: 
    case 112: 
    case 113: 
    case 114: 
    case 115: 
    case 137: 
    case 138: 
    case 141: 
    case 144: 
    case 145: 
    case 146: 
    case 147: 
      return String.format("%2.3f", new Object[] { Float.valueOf(☃) });
    case 162: 
      if (☃ < 0.0F) {
        return bnq.a("gui.all", new Object[0]);
      }
      if ((int)☃ >= xaz)
      {
        ady ☃ = ady.n()[((int)☃ + 2)];
        return ☃ != null ? ah : "?";
      }
      ady ☃ = ady.n()[((int)☃)];
      return ☃ != null ? ah : "?";
    }
    return String.format("%d", new Object[] { Integer.valueOf((int)☃) });
  }
  
  public void a(int ☃, boolean ☃)
  {
    switch (☃)
    {
    case 148: 
      F.s = ☃;
      break;
    case 149: 
      F.t = ☃;
      break;
    case 150: 
      F.v = ☃;
      break;
    case 151: 
      F.w = ☃;
      break;
    case 152: 
      F.x = ☃;
      break;
    case 153: 
      F.y = ☃;
      break;
    case 154: 
      F.A = ☃;
      break;
    case 210: 
      F.z = ☃;
      break;
    case 155: 
      F.B = ☃;
      break;
    case 156: 
      F.D = ☃;
      break;
    case 161: 
      F.F = ☃;
    }
    if (!F.equals(E)) {
      a(true);
    }
  }
  
  public void a(int ☃, float ☃)
  {
    switch (☃)
    {
    case 107: 
      F.b = ☃;
      break;
    case 108: 
      F.c = ☃;
      break;
    case 110: 
      F.d = ☃;
      break;
    case 111: 
      F.e = ☃;
      break;
    case 103: 
      F.f = ☃;
      break;
    case 104: 
      F.g = ☃;
      break;
    case 105: 
      F.h = ☃;
      break;
    case 100: 
      F.i = ☃;
      break;
    case 101: 
      F.j = ☃;
      break;
    case 102: 
      F.k = ☃;
      break;
    case 106: 
      F.l = ☃;
      break;
    case 109: 
      F.m = ☃;
      break;
    case 112: 
      F.n = ☃;
      break;
    case 113: 
      F.o = ☃;
      break;
    case 114: 
      F.p = ☃;
      break;
    case 115: 
      F.q = ☃;
      break;
    case 157: 
      F.u = ((int)☃);
      break;
    case 158: 
      F.C = ((int)☃);
      break;
    case 159: 
      F.E = ((int)☃);
      break;
    case 160: 
      F.r = ((int)☃);
      break;
    case 162: 
      F.G = ((int)☃);
      break;
    case 163: 
      F.H = ((int)☃);
      break;
    case 164: 
      F.I = ((int)☃);
      break;
    case 166: 
      F.K = ((int)☃);
      break;
    case 165: 
      F.J = ((int)☃);
      break;
    case 167: 
      F.L = ((int)☃);
      break;
    case 168: 
      F.M = ((int)☃);
      break;
    case 170: 
      F.O = ((int)☃);
      break;
    case 169: 
      F.N = ((int)☃);
      break;
    case 171: 
      F.P = ((int)☃);
      break;
    case 172: 
      F.Q = ((int)☃);
      break;
    case 174: 
      F.S = ((int)☃);
      break;
    case 173: 
      F.R = ((int)☃);
      break;
    case 175: 
      F.T = ((int)☃);
      break;
    case 176: 
      F.U = ((int)☃);
      break;
    case 178: 
      F.W = ((int)☃);
      break;
    case 177: 
      F.V = ((int)☃);
      break;
    case 179: 
      F.X = ((int)☃);
      break;
    case 180: 
      F.Y = ((int)☃);
      break;
    case 182: 
      F.aa = ((int)☃);
      break;
    case 181: 
      F.Z = ((int)☃);
      break;
    case 183: 
      F.ab = ((int)☃);
      break;
    case 184: 
      F.ac = ((int)☃);
      break;
    case 186: 
      F.ae = ((int)☃);
      break;
    case 185: 
      F.ad = ((int)☃);
      break;
    case 187: 
      F.af = ((int)☃);
      break;
    case 189: 
      F.ag = ((int)☃);
      break;
    case 191: 
      F.ai = ((int)☃);
      break;
    case 190: 
      F.ah = ((int)☃);
      break;
    case 192: 
      F.aj = ((int)☃);
      break;
    case 193: 
      F.ak = ((int)☃);
      break;
    case 195: 
      F.am = ((int)☃);
      break;
    case 194: 
      F.al = ((int)☃);
      break;
    case 196: 
      F.an = ((int)☃);
      break;
    case 197: 
      F.ao = ((int)☃);
      break;
    case 199: 
      F.aq = ((int)☃);
      break;
    case 198: 
      F.ap = ((int)☃);
      break;
    case 200: 
      F.ar = ((int)☃);
      break;
    case 201: 
      F.as = ((int)☃);
      break;
    case 203: 
      F.au = ((int)☃);
      break;
    case 202: 
      F.at = ((int)☃);
      break;
    case 204: 
      F.av = ((int)☃);
      break;
    case 205: 
      F.aw = ((int)☃);
      break;
    case 207: 
      F.ay = ((int)☃);
      break;
    case 206: 
      F.ax = ((int)☃);
      break;
    case 208: 
      F.az = ((int)☃);
      break;
    case 209: 
      F.aA = ((int)☃);
    }
    if ((☃ >= 100) && (☃ < 116))
    {
      avp ☃ = r.d(☃ - 100 + 132);
      if (☃ != null) {
        ((avw)☃).a(b(☃, ☃));
      }
    }
    if (!F.equals(E)) {
      a(true);
    }
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    switch (k)
    {
    case 300: 
      i.a = F.toString();
      j.a(i);
      break;
    case 305: 
      j.a(new axc(this));
      break;
    case 301: 
      for (int ☃ = 0; ☃ < r.b(); ☃++)
      {
        awg.d ☃ = r.e(☃);
        avp ☃ = ☃.a();
        if ((☃ instanceof avs))
        {
          avs ☃ = (avs)☃;
          if ((☃ instanceof avx))
          {
            float ☃ = ((avx)☃).d() * (0.75F + G.nextFloat() * 0.5F) + (G.nextFloat() * 0.1F - 0.05F);
            ((avx)☃).a(ns.a(☃, 0.0F, 1.0F));
          }
          else if ((☃ instanceof awb))
          {
            ((awb)☃).b(G.nextBoolean());
          }
        }
        avp ☃ = ☃.b();
        if ((☃ instanceof avs))
        {
          avs ☃ = (avs)☃;
          if ((☃ instanceof avx))
          {
            float ☃ = ((avx)☃).d() * (0.75F + G.nextFloat() * 0.5F) + (G.nextFloat() * 0.1F - 0.05F);
            ((avx)☃).a(ns.a(☃, 0.0F, 1.0F));
          }
          else if ((☃ instanceof awb))
          {
            ((awb)☃).b(G.nextBoolean());
          }
        }
      }
      break;
    case 302: 
      r.h();
      i();
      break;
    case 303: 
      r.i();
      i();
      break;
    case 304: 
      if (A) {
        b(304);
      }
      break;
    case 307: 
      B = 0;
      h();
      break;
    case 306: 
      h();
    }
  }
  
  private void g()
  {
    F.a();
    f();
    a(false);
  }
  
  private void b(int ☃)
  {
    B = ☃;
    b(true);
  }
  
  private void h()
  {
    switch (B)
    {
    case 300: 
      a((awb)r.d(300));
      break;
    case 304: 
      g();
    }
    B = 0;
    C = true;
    b(false);
  }
  
  private void b(boolean ☃)
  {
    x.m = ☃;
    y.m = ☃;
    t.l = (!☃);
    s.l = (!☃);
    v.l = (!☃);
    w.l = (!☃);
    u.l = ((A) && (!☃));
    z.l = (!☃);
    r.a(!☃);
  }
  
  private void i()
  {
    v.l = (r.e() != 0);
    w.l = (r.e() != r.f() - 1);
    f = bnq.a("book.pageIndicator", new Object[] { Integer.valueOf(r.e() + 1), Integer.valueOf(r.f()) });
    g = h[r.e()];
    t.l = (r.e() != r.f() - 1);
  }
  
  protected void a(char ☃, int ☃)
  {
    super.a(☃, ☃);
    if (B != 0) {
      return;
    }
    switch (☃)
    {
    case 208: 
      a(-1.0F);
      break;
    case 200: 
      a(1.0F);
      break;
    default: 
      r.a(☃, ☃);
    }
  }
  
  private void a(float ☃)
  {
    avp ☃ = r.g();
    if (!(☃ instanceof avw)) {
      return;
    }
    float ☃ = ☃;
    if (axu.r())
    {
      ☃ *= 0.1F;
      if (axu.q()) {
        ☃ *= 0.1F;
      }
    }
    else if (axu.q())
    {
      ☃ *= 10.0F;
      if (axu.s()) {
        ☃ *= 10.0F;
      }
    }
    avw ☃ = (avw)☃;
    Float ☃ = Floats.tryParse(☃.b());
    if (☃ == null) {
      return;
    }
    ☃ = Float.valueOf(☃.floatValue() + ☃);
    int ☃ = ☃.d();
    String ☃ = b(☃.d(), ☃.floatValue());
    ☃.a(☃);
    a(☃, ☃);
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    if ((B != 0) || (C)) {
      return;
    }
    r.b(☃, ☃, ☃);
  }
  
  protected void b(int ☃, int ☃, int ☃)
  {
    super.b(☃, ☃, ☃);
    if (C)
    {
      C = false;
      return;
    }
    if (B != 0) {
      return;
    }
    r.c(☃, ☃, ☃);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    r.a(☃, ☃, ☃);
    
    a(q, a, l / 2, 2, 16777215);
    a(q, f, l / 2, 12, 16777215);
    a(q, g, l / 2, 22, 16777215);
    
    super.a(☃, ☃, ☃);
    if (B != 0)
    {
      a(0, 0, l, m, Integer.MIN_VALUE);
      
      a(l / 2 - 91, l / 2 + 90, 99, -2039584);
      a(l / 2 - 91, l / 2 + 90, 185, -6250336);
      b(l / 2 - 91, 99, 185, -2039584);
      b(l / 2 + 90, 99, 185, -6250336);
      
      float ☃ = 85.0F;
      float ☃ = 180.0F;
      
      bfl.f();
      bfl.n();
      bfx ☃ = bfx.a();
      bfd ☃ = ☃.c();
      j.P().a(b);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      float ☃ = 32.0F;
      ☃.a(7, bms.i);
      ☃.b(l / 2 - 90, 185.0D, 0.0D).a(0.0D, 2.65625D).b(64, 64, 64, 64).d();
      ☃.b(l / 2 + 90, 185.0D, 0.0D).a(5.625D, 2.65625D).b(64, 64, 64, 64).d();
      ☃.b(l / 2 + 90, 100.0D, 0.0D).a(5.625D, 0.0D).b(64, 64, 64, 64).d();
      ☃.b(l / 2 - 90, 100.0D, 0.0D).a(0.0D, 0.0D).b(64, 64, 64, 64).d();
      ☃.b();
      
      a(q, bnq.a("createWorld.customize.custom.confirmTitle", new Object[0]), l / 2, 105, 16777215);
      a(q, bnq.a("createWorld.customize.custom.confirm1", new Object[0]), l / 2, 125, 16777215);
      a(q, bnq.a("createWorld.customize.custom.confirm2", new Object[0]), l / 2, 135, 16777215);
      
      x.a(j, ☃, ☃);
      y.a(j, ☃, ☃);
    }
  }
}
