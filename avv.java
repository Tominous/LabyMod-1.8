import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import net.minecraft.client.ClientBrandRetriever;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class avv
  extends avp
{
  private final ave a;
  private final avn f;
  private static final String __OBFID = "CL_00001956";
  
  public avv(ave mc)
  {
    a = mc;
    f = k;
  }
  
  public void a(avr scaledResolutionIn)
  {
    a.A.a("debug");
    bfl.E();
    a();
    b(scaledResolutionIn);
    bfl.F();
    
    a.A.b();
  }
  
  private boolean d()
  {
    return (a.h.cq()) || (a.t.w);
  }
  
  protected void a()
  {
    List var1 = b();
    for (int var2 = 0; var2 < var1.size(); var2++)
    {
      String var3 = (String)var1.get(var2);
      if (!Strings.isNullOrEmpty(var3))
      {
        int var4 = f.a;
        int var5 = f.a(var3);
        boolean var6 = true;
        int var7 = 2 + var4 * var2;
        a(1, var7 - 1, 2 + var5 + 1, var7 + var4 - 1, -1873784752);
        f.a(var3, 2, var7, 14737632);
      }
    }
  }
  
  protected void b(avr p_175239_1_)
  {
    List var2 = c();
    for (int var3 = 0; var3 < var2.size(); var3++)
    {
      String var4 = (String)var2.get(var3);
      if (!Strings.isNullOrEmpty(var4))
      {
        int var5 = f.a;
        int var6 = f.a(var4);
        int var7 = p_175239_1_.a() - 2 - var6;
        int var8 = 2 + var5 * var3;
        a(var7 - 1, var8 - 1, var7 + var6 + 1, var8 + var5 - 1, -1873784752);
        f.a(var4, var7, var8, 14737632);
      }
    }
  }
  
  protected List b()
  {
    cj var1 = new cj(a.ac().s, a.ac().aR().b, a.ac().u);
    if (d()) {
      return Lists.newArrayList(new String[] { "Minecraft 1.8.8 (" + a.c() + "/" + ClientBrandRetriever.getClientModName() + ")", a.C, a.g.f(), a.g.g(), "P: " + a.j.b() + ". T: " + a.f.z(), a.f.A(), "", String.format("Chunk-relative: %d %d %d", new Object[] { Integer.valueOf(var1.n() & 0xF), Integer.valueOf(var1.o() & 0xF), Integer.valueOf(var1.p() & 0xF) }) });
    }
    pk var2 = a.ac();
    cq var3 = var2.aP();
    String var4 = "Invalid";
    switch (avv.1.a[var3.ordinal()])
    {
    case 1: 
      var4 = "Towards negative Z";
      break;
    case 2: 
      var4 = "Towards positive Z";
      break;
    case 3: 
      var4 = "Towards negative X";
      break;
    case 4: 
      var4 = "Towards positive X";
    }
    ArrayList var5 = Lists.newArrayList(new String[] { "Minecraft 1.8.8 (" + a.c() + "/" + ClientBrandRetriever.getClientModName() + ")", a.C, a.g.f(), a.g.g(), "P: " + a.j.b() + ". T: " + a.f.z(), a.f.A(), "", String.format("XYZ: %.3f / %.5f / %.3f", new Object[] { Double.valueOf(a.ac().s), Double.valueOf(a.ac().aR().b), Double.valueOf(a.ac().u) }), String.format("Block: %d %d %d", new Object[] { Integer.valueOf(var1.n()), Integer.valueOf(var1.o()), Integer.valueOf(var1.p()) }), String.format("Chunk: %d %d %d in %d %d %d", new Object[] { Integer.valueOf(var1.n() & 0xF), Integer.valueOf(var1.o() & 0xF), Integer.valueOf(var1.p() & 0xF), Integer.valueOf(var1.n() >> 4), Integer.valueOf(var1.o() >> 4), Integer.valueOf(var1.p() >> 4) }), String.format("Facing: %s (%s) (%.1f / %.1f)", new Object[] { var3, var4, Float.valueOf(ns.g(y)), Float.valueOf(ns.g(z)) }) });
    if ((a.f != null) && (a.f.e(var1)))
    {
      amy var6 = a.f.f(var1);
      var5.add("Biome: " + aa.f.v()).ah);
      var5.add("Light: " + var6.a(var1, 0) + " (" + var6.a(ads.a, var1) + " sky, " + var6.a(ads.b, var1) + " block)");
      ok var7 = a.f.E(var1);
      if ((a.E()) && (a.G() != null))
      {
        lf var8 = a.G().ap().a(a.h.aK());
        if (var8 != null) {
          var7 = o.E(new cj(var8));
        }
      }
      var5.add(String.format("Local Difficulty: %.2f (Day %d)", new Object[] { Float.valueOf(var7.b()), Long.valueOf(a.f.L() / 24000L) }));
    }
    if ((a.o != null) && (a.o.a())) {
      var5.add("Shader: " + a.o.f().b());
    }
    if ((a.s != null) && (a.s.a == auh.a.b) && (a.s.a() != null))
    {
      cj var9 = a.s.a();
      var5.add(String.format("Looking at: %d %d %d", new Object[] { Integer.valueOf(var9.n()), Integer.valueOf(var9.o()), Integer.valueOf(var9.p()) }));
    }
    return var5;
  }
  
  protected List c()
  {
    long var1 = Runtime.getRuntime().maxMemory();
    long var3 = Runtime.getRuntime().totalMemory();
    long var5 = Runtime.getRuntime().freeMemory();
    long var7 = var3 - var5;
    ArrayList var9 = Lists.newArrayList(new String[] { String.format("Java: %s %dbit", new Object[] { System.getProperty("java.version"), Integer.valueOf(a.U() ? 64 : 32) }), String.format("Mem: % 2d%% %03d/%03dMB", new Object[] { Long.valueOf(var7 * 100L / var1), Long.valueOf(a(var7)), Long.valueOf(a(var1)) }), String.format("Allocated: % 2d%% %03dMB", new Object[] { Long.valueOf(var3 * 100L / var1), Long.valueOf(a(var3)) }), "", String.format("CPU: %s", new Object[] { bqs.j() }), "", String.format("Display: %dx%d (%s)", new Object[] { Integer.valueOf(Display.getWidth()), Integer.valueOf(Display.getHeight()), GL11.glGetString(7936) }), GL11.glGetString(7937), GL11.glGetString(7938) });
    if (Reflector.FMLCommonHandler_getBrandings.exists())
    {
      Object instance = Reflector.call(Reflector.FMLCommonHandler_instance, new Object[0]);
      var9.add("");
      var9.addAll((Collection)Reflector.call(instance, Reflector.FMLCommonHandler_getBrandings, new Object[] { Boolean.valueOf(false) }));
    }
    if (d()) {
      return var9;
    }
    if ((a.s != null) && (a.s.a == auh.a.b) && (a.s.a() != null))
    {
      cj var10 = a.s.a();
      alz var11 = a.f.p(var10);
      if (a.f.G() != adr.g) {
        var11 = var11.c().a(var11, a.f, var10);
      }
      var9.add("");
      var9.add(String.valueOf(afh.c.c(var11.c())));
      Map.Entry var13;
      String var14;
      for (Iterator var12 = var11.b().entrySet().iterator(); var12.hasNext(); var9.add(((amo)var13.getKey()).a() + ": " + var14))
      {
        var13 = (Map.Entry)var12.next();
        var14 = ((Comparable)var13.getValue()).toString();
        if (var13.getValue() == Boolean.TRUE) {
          var14 = a.k + var14;
        } else if (var13.getValue() == Boolean.FALSE) {
          var14 = a.m + var14;
        }
      }
    }
    return var9;
  }
  
  private void e()
  {
    bfl.i();
    nh var1 = a.aj();
    int var2 = var1.a();
    int var3 = var1.b();
    long[] var4 = var1.c();
    avr var5 = new avr(a);
    int var6 = var2;
    int var7 = 0;
    a(0, var5.b() - 60, 240, var5.b(), -1873784752);
    while (var6 != var3)
    {
      int var8 = var1.a(var4[var6], 30);
      int var9 = c(ns.a(var8, 0, 60), 0, 30, 60);
      b(var7, var5.b(), var5.b() - var8, var9);
      var7++;
      var6 = var1.b(var6 + 1);
    }
    a(1, var5.b() - 30 + 1, 14, var5.b() - 30 + 10, -1873784752);
    f.a("60", 2, var5.b() - 30 + 2, 14737632);
    a(0, 239, var5.b() - 30, -1);
    a(1, var5.b() - 60 + 1, 14, var5.b() - 60 + 10, -1873784752);
    f.a("30", 2, var5.b() - 60 + 2, 14737632);
    a(0, 239, var5.b() - 60, -1);
    a(0, 239, var5.b() - 1, -1);
    b(0, var5.b() - 60, var5.b(), -1);
    b(239, var5.b() - 60, var5.b(), -1);
    if (a.t.g <= 120) {
      a(0, 239, var5.b() - 60 + a.t.g / 2, -16711681);
    }
    bfl.j();
  }
  
  private int c(int p_500114_1_, int p_500114_2_, int p_500114_3_, int p_500114_4_)
  {
    return p_500114_1_ < p_500114_3_ ? a(-16711936, 65280, p_500114_1_ / p_500114_3_) : a(65280, -65536, (p_500114_1_ - p_500114_3_) / (p_500114_4_ - p_500114_3_));
  }
  
  private int a(int p_500115_1_, int p_500115_2_, float p_500115_3_)
  {
    int var4 = p_500115_1_ >> 24 & 0xFF;
    int var5 = p_500115_1_ >> 16 & 0xFF;
    int var6 = p_500115_1_ >> 8 & 0xFF;
    int var7 = p_500115_1_ & 0xFF;
    int var8 = p_500115_2_ >> 24 & 0xFF;
    int var9 = p_500115_2_ >> 16 & 0xFF;
    int var10 = p_500115_2_ >> 8 & 0xFF;
    int var11 = p_500115_2_ & 0xFF;
    int var12 = ns.a((int)(var4 + (var8 - var4) * p_500115_3_), 0, 255);
    int var13 = ns.a((int)(var5 + (var9 - var5) * p_500115_3_), 0, 255);
    int var14 = ns.a((int)(var6 + (var10 - var6) * p_500115_3_), 0, 255);
    int var15 = ns.a((int)(var7 + (var11 - var7) * p_500115_3_), 0, 255);
    return var12 << 24 | var13 << 16 | var14 << 8 | var15;
  }
  
  private static long a(long p_175240_0_)
  {
    return p_175240_0_ / 1024L / 1024L;
  }
}
