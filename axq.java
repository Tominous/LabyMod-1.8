import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.lwjgl.input.Keyboard;

public class axq
  extends axu
{
  private static final List<axq.a> a = ;
  private final axa f;
  private String g;
  private String h;
  private String i;
  private axq.b r;
  private avs s;
  private avw t;
  
  static
  {
    a("Classic Flat", zw.a(afi.c), ady.q, Arrays.asList(new String[] { "village" }), new aqa[] { new aqa(1, afi.c), new aqa(2, afi.d), new aqa(1, afi.h) });
    
    a("Tunnelers' Dream", zw.a(afi.b), ady.s, Arrays.asList(new String[] { "biome_1", "dungeon", "decoration", "stronghold", "mineshaft" }), new aqa[] { new aqa(1, afi.c), new aqa(5, afi.d), new aqa(230, afi.b), new aqa(1, afi.h) });
    
    a("Water World", zy.ax, ady.N, Arrays.asList(new String[] { "biome_1", "oceanmonument" }), new aqa[] { new aqa(90, afi.j), new aqa(5, afi.m), new aqa(5, afi.d), new aqa(5, afi.b), new aqa(1, afi.h) });
    
    a("Overworld", zw.a(afi.H), akc.a.b.a(), ady.q, Arrays.asList(new String[] { "village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake" }), new aqa[] { new aqa(1, afi.c), new aqa(3, afi.d), new aqa(59, afi.b), new aqa(1, afi.h) });
    
    a("Snowy Kingdom", zw.a(afi.aH), ady.B, Arrays.asList(new String[] { "village", "biome_1" }), new aqa[] { new aqa(1, afi.aH), new aqa(1, afi.c), new aqa(3, afi.d), new aqa(59, afi.b), new aqa(1, afi.h) });
    
    a("Bottomless Pit", zy.G, ady.q, Arrays.asList(new String[] { "village", "biome_1" }), new aqa[] { new aqa(1, afi.c), new aqa(3, afi.d), new aqa(2, afi.e) });
    
    a("Desert", zw.a(afi.m), ady.r, Arrays.asList(new String[] { "village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon" }), new aqa[] { new aqa(8, afi.m), new aqa(52, afi.A), new aqa(3, afi.b), new aqa(1, afi.h) });
    
    a("Redstone Ready", zy.aC, ady.r, new aqa[] { new aqa(52, afi.A), new aqa(3, afi.b), new aqa(1, afi.h) });
  }
  
  public axq(axa ☃)
  {
    f = ☃;
  }
  
  public void b()
  {
    n.clear();
    Keyboard.enableRepeatEvents(true);
    
    g = bnq.a("createWorld.customize.presets.title", new Object[0]);
    h = bnq.a("createWorld.customize.presets.share", new Object[0]);
    i = bnq.a("createWorld.customize.presets.list", new Object[0]);
    t = new avw(2, q, 50, 40, l - 100, 20);
    r = new axq.b();
    
    t.f(1230);
    t.a(f.a());
    
    n.add(s = new avs(0, l / 2 - 155, m - 28, 150, 20, bnq.a("createWorld.customize.presets.select", new Object[0])));
    n.add(new avs(1, l / 2 + 5, m - 28, 150, 20, bnq.a("gui.cancel", new Object[0])));
    
    a();
  }
  
  public void k()
  {
    super.k();
    r.p();
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    t.a(☃, ☃, ☃);
    super.a(☃, ☃, ☃);
  }
  
  protected void a(char ☃, int ☃)
  {
    if (!t.a(☃, ☃)) {
      super.a(☃, ☃);
    }
  }
  
  protected void a(avs ☃)
  {
    if ((k == 0) && (g()))
    {
      f.a(t.b());
      j.a(f);
    }
    else if (k == 1)
    {
      j.a(f);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    r.a(☃, ☃, ☃);
    a(q, g, l / 2, 8, 16777215);
    c(q, h, 50, 30, 10526880);
    c(q, i, 50, 70, 10526880);
    
    t.g();
    super.a(☃, ☃, ☃);
  }
  
  public void e()
  {
    t.a();
    super.e();
  }
  
  public void a()
  {
    boolean ☃ = g();
    s.l = ☃;
  }
  
  private boolean g()
  {
    return ((r.u > -1) && (r.u < a.size())) || (t.b().length() > 1);
  }
  
  class b
    extends awi
  {
    public int u = -1;
    
    public b()
    {
      super(l, m, 80, m - 37, 24);
    }
    
    private void a(int ☃, int ☃, zw ☃, int ☃)
    {
      e(☃ + 1, ☃ + 1);
      
      bfl.B();
      
      avc.c();
      
      k.a(new zx(☃, 1, ☃), ☃ + 2, ☃ + 2);
      avc.a();
      
      bfl.C();
    }
    
    private void e(int ☃, int ☃)
    {
      d(☃, ☃, 0, 0);
    }
    
    private void d(int ☃, int ☃, int ☃, int ☃)
    {
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      a.P().a(avp.c);
      
      float ☃ = 0.0078125F;
      float ☃ = 0.0078125F;
      int ☃ = 18;
      int ☃ = 18;
      bfx ☃ = bfx.a();
      bfd ☃ = ☃.c();
      ☃.a(7, bms.g);
      ☃.b(☃ + 0, ☃ + 18, axq.a(axq.this)).a((☃ + 0) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
      ☃.b(☃ + 18, ☃ + 18, axq.b(axq.this)).a((☃ + 18) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
      ☃.b(☃ + 18, ☃ + 0, axq.c(axq.this)).a((☃ + 18) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
      ☃.b(☃ + 0, ☃ + 0, axq.d(axq.this)).a((☃ + 0) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
      ☃.b();
    }
    
    protected int b()
    {
      return axq.f().size();
    }
    
    protected void a(int ☃, boolean ☃, int ☃, int ☃)
    {
      u = ☃;
      axq.this.a();
      axq.f(axq.this).a(fgeteu)).d);
    }
    
    protected boolean a(int ☃)
    {
      return ☃ == u;
    }
    
    protected void a() {}
    
    protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      axq.a ☃ = (axq.a)axq.f().get(☃);
      a(☃, ☃, a, b);
      q.a(c, ☃ + 18 + 5, ☃ + 6, 16777215);
    }
  }
  
  private static void a(String ☃, zw ☃, ady ☃, aqa... ☃)
  {
    a(☃, ☃, 0, ☃, null, ☃);
  }
  
  private static void a(String ☃, zw ☃, ady ☃, List<String> ☃, aqa... ☃)
  {
    a(☃, ☃, 0, ☃, ☃, ☃);
  }
  
  private static void a(String ☃, zw ☃, int ☃, ady ☃, List<String> ☃, aqa... ☃)
  {
    apz ☃ = new apz();
    for (int ☃ = ☃.length - 1; ☃ >= 0; ☃--) {
      ☃.c().add(☃[☃]);
    }
    ☃.a(az);
    ☃.d();
    if (☃ != null) {
      for (String ☃ : ☃) {
        ☃.b().put(☃, Maps.newHashMap());
      }
    }
    a.add(new axq.a(☃, ☃, ☃, ☃.toString()));
  }
  
  static class a
  {
    public zw a;
    public int b;
    public String c;
    public String d;
    
    public a(zw ☃, int ☃, String ☃, String ☃)
    {
      a = ☃;
      b = ☃;
      c = ☃;
      d = ☃;
    }
  }
}
