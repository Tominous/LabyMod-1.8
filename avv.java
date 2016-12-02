import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
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
  
  public avv(ave ☃)
  {
    this.a = ☃;
    this.f = ☃.k;
  }
  
  public void a(avr ☃)
  {
    this.a.A.a("debug");
    bfl.E();
    
    a();
    b(☃);
    
    bfl.F();
    if (this.a.t.aD) {
      e();
    }
    this.a.A.b();
  }
  
  private boolean d()
  {
    return (this.a.h.cq()) || (this.a.t.w);
  }
  
  protected void a()
  {
    List<String> ☃ = b();
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      String ☃ = (String)☃.get(☃);
      if (!Strings.isNullOrEmpty(☃))
      {
        int ☃ = this.f.a;
        int ☃ = this.f.a(☃);
        int ☃ = 2;
        int ☃ = 2 + ☃ * ☃;
        a(1, ☃ - 1, 2 + ☃ + 1, ☃ + ☃ - 1, -1873784752);
        this.f.a(☃, 2, ☃, 14737632);
      }
    }
  }
  
  protected void b(avr ☃)
  {
    List<String> ☃ = c();
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      String ☃ = (String)☃.get(☃);
      if (!Strings.isNullOrEmpty(☃))
      {
        int ☃ = this.f.a;
        int ☃ = this.f.a(☃);
        int ☃ = ☃.a() - 2 - ☃;
        int ☃ = 2 + ☃ * ☃;
        a(☃ - 1, ☃ - 1, ☃ + ☃ + 1, ☃ + ☃ - 1, -1873784752);
        this.f.a(☃, ☃, ☃, 14737632);
      }
    }
  }
  
  protected List<String> b()
  {
    cj ☃ = new cj(this.a.ac().s, this.a.ac().aR().b, this.a.ac().u);
    if (d()) {
      return Lists.newArrayList(new String[] { "Minecraft 1.8.8 (" + this.a.c() + "/" + ClientBrandRetriever.getClientModName() + ")", this.a.C, this.a.g.f(), this.a.g.g(), "P: " + this.a.j.b() + ". T: " + this.a.f.z(), this.a.f.A(), "", String.format("Chunk-relative: %d %d %d", new Object[] { Integer.valueOf(☃.n() & 0xF), Integer.valueOf(☃.o() & 0xF), Integer.valueOf(☃.p() & 0xF) }) });
    }
    pk ☃ = this.a.ac();
    cq ☃ = ☃.aP();
    String ☃ = "Invalid";
    switch (avv.1.a[☃.ordinal()])
    {
    case 1: 
      ☃ = "Towards negative Z";
      break;
    case 2: 
      ☃ = "Towards positive Z";
      break;
    case 3: 
      ☃ = "Towards negative X";
      break;
    case 4: 
      ☃ = "Towards positive X";
    }
    List<String> ☃ = Lists.newArrayList(new String[] { "Minecraft 1.8.8 (" + this.a.c() + "/" + ClientBrandRetriever.getClientModName() + ")", this.a.C, this.a.g.f(), this.a.g.g(), "P: " + this.a.j.b() + ". T: " + this.a.f.z(), this.a.f.A(), "", String.format("XYZ: %.3f / %.5f / %.3f", new Object[] { Double.valueOf(this.a.ac().s), Double.valueOf(this.a.ac().aR().b), Double.valueOf(this.a.ac().u) }), String.format("Block: %d %d %d", new Object[] { Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()) }), String.format("Chunk: %d %d %d in %d %d %d", new Object[] { Integer.valueOf(☃.n() & 0xF), Integer.valueOf(☃.o() & 0xF), Integer.valueOf(☃.p() & 0xF), Integer.valueOf(☃.n() >> 4), Integer.valueOf(☃.o() >> 4), Integer.valueOf(☃.p() >> 4) }), String.format("Facing: %s (%s) (%.1f / %.1f)", new Object[] { ☃, ☃, Float.valueOf(ns.g(☃.y)), Float.valueOf(ns.g(☃.z)) }) });
    if ((this.a.f != null) && (this.a.f.e(☃)))
    {
      amy ☃ = this.a.f.f(☃);
      ☃.add("Biome: " + ☃.a(☃, this.a.f.v()).ah);
      ☃.add("Light: " + ☃.a(☃, 0) + " (" + ☃.a(ads.a, ☃) + " sky, " + ☃.a(ads.b, ☃) + " block)");
      ok ☃ = this.a.f.E(☃);
      if ((this.a.E()) && (this.a.G() != null))
      {
        lf ☃ = this.a.G().ap().a(this.a.h.aK());
        if (☃ != null) {
          ☃ = ☃.o.E(new cj(☃));
        }
      }
      ☃.add(String.format("Local Difficulty: %.2f (Day %d)", new Object[] { Float.valueOf(☃.b()), Long.valueOf(this.a.f.L() / 24000L) }));
    }
    if ((this.a.o != null) && (this.a.o.a())) {
      ☃.add("Shader: " + this.a.o.f().b());
    }
    if ((this.a.s != null) && (this.a.s.a == auh.a.b) && (this.a.s.a() != null))
    {
      cj ☃ = this.a.s.a();
      ☃.add(String.format("Looking at: %d %d %d", new Object[] { Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()) }));
    }
    return ☃;
  }
  
  protected List<String> c()
  {
    long ☃ = Runtime.getRuntime().maxMemory();
    long ☃ = Runtime.getRuntime().totalMemory();
    long ☃ = Runtime.getRuntime().freeMemory();
    long ☃ = ☃ - ☃;
    
    List<String> ☃ = Lists.newArrayList(new String[] { String.format("Java: %s %dbit", new Object[] { System.getProperty("java.version"), Integer.valueOf(this.a.U() ? 64 : 32) }), String.format("Mem: % 2d%% %03d/%03dMB", new Object[] { Long.valueOf(☃ * 100L / ☃), Long.valueOf(a(☃)), Long.valueOf(a(☃)) }), String.format("Allocated: % 2d%% %03dMB", new Object[] { Long.valueOf(☃ * 100L / ☃), Long.valueOf(a(☃)) }), "", String.format("CPU: %s", new Object[] { bqs.j() }), "", String.format("Display: %dx%d (%s)", new Object[] { Integer.valueOf(Display.getWidth()), Integer.valueOf(Display.getHeight()), GL11.glGetString(7936) }), GL11.glGetString(7937), GL11.glGetString(7938) });
    if (d()) {
      return ☃;
    }
    if ((this.a.s != null) && (this.a.s.a == auh.a.b) && (this.a.s.a() != null))
    {
      cj ☃ = this.a.s.a();
      alz ☃ = this.a.f.p(☃);
      if (this.a.f.G() != adr.g) {
        ☃ = ☃.c().a(☃, this.a.f, ☃);
      }
      ☃.add("");
      ☃.add(String.valueOf(afh.c.c(☃.c())));
      for (Map.Entry<amo, Comparable> ☃ : ☃.b().entrySet())
      {
        String ☃ = ((Comparable)☃.getValue()).toString();
        if (☃.getValue() == Boolean.TRUE) {
          ☃ = a.k + ☃;
        } else if (☃.getValue() == Boolean.FALSE) {
          ☃ = a.m + ☃;
        }
        ☃.add(((amo)☃.getKey()).a() + ": " + ☃);
      }
    }
    return ☃;
  }
  
  private void e()
  {
    bfl.i();
    
    nh ☃ = this.a.aj();
    int ☃ = ☃.a();
    int ☃ = ☃.b();
    long[] ☃ = ☃.c();
    avr ☃ = new avr(this.a);
    int ☃ = ☃;
    int ☃ = 0;
    
    a(0, ☃.b() - 60, 240, ☃.b(), -1873784752);
    while (☃ != ☃)
    {
      int ☃ = ☃.a(☃[☃], 30);
      int ☃ = c(ns.a(☃, 0, 60), 0, 30, 60);
      b(☃, ☃.b(), ☃.b() - ☃, ☃);
      ☃++;
      ☃ = ☃.b(☃ + 1);
    }
    a(1, ☃.b() - 30 + 1, 14, ☃.b() - 30 + 10, -1873784752);
    this.f.a("60", 2, ☃.b() - 30 + 2, 14737632);
    a(0, 239, ☃.b() - 30, -1);
    
    a(1, ☃.b() - 60 + 1, 14, ☃.b() - 60 + 10, -1873784752);
    this.f.a("30", 2, ☃.b() - 60 + 2, 14737632);
    a(0, 239, ☃.b() - 60, -1);
    
    a(0, 239, ☃.b() - 1, -1);
    b(0, ☃.b() - 60, ☃.b(), -1);
    b(239, ☃.b() - 60, ☃.b(), -1);
    if (this.a.t.g <= 120) {
      a(0, 239, ☃.b() - 60 + this.a.t.g / 2, -16711681);
    }
    bfl.j();
  }
  
  private int c(int ☃, int ☃, int ☃, int ☃)
  {
    if (☃ < ☃) {
      return a(-16711936, 65280, ☃ / ☃);
    }
    return a(65280, -65536, (☃ - ☃) / (☃ - ☃));
  }
  
  private int a(int ☃, int ☃, float ☃)
  {
    int ☃ = ☃ >> 24 & 0xFF;
    int ☃ = ☃ >> 16 & 0xFF;
    int ☃ = ☃ >> 8 & 0xFF;
    int ☃ = ☃ & 0xFF;
    int ☃ = ☃ >> 24 & 0xFF;
    int ☃ = ☃ >> 16 & 0xFF;
    int ☃ = ☃ >> 8 & 0xFF;
    int ☃ = ☃ & 0xFF;
    int ☃ = ns.a((int)(☃ + (☃ - ☃) * ☃), 0, 255);
    int ☃ = ns.a((int)(☃ + (☃ - ☃) * ☃), 0, 255);
    int ☃ = ns.a((int)(☃ + (☃ - ☃) * ☃), 0, 255);
    int ☃ = ns.a((int)(☃ + (☃ - ☃) * ☃), 0, 255);
    return ☃ << 24 | ☃ << 16 | ☃ << 8 | ☃;
  }
  
  private static long a(long ☃)
  {
    return ☃ / 1024L / 1024L;
  }
}
