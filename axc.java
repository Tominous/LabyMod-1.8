import com.google.common.collect.Lists;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class axc
  extends axu
{
  private static final List<axc.a> f = ;
  private axc.b g;
  private avs h;
  private avw i;
  private axd r;
  protected String a = "Customize World Presets";
  private String s;
  private String t;
  
  static
  {
    ant.a ☃ = ant.a.a("{ \"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":8.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":0.5, \"biomeScaleWeight\":2.0, \"biomeScaleOffset\":0.375, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":255 }");
    jy ☃ = new jy("textures/gui/presets/water.png");
    f.add(new axc.a(bnq.a("createWorld.customize.custom.preset.waterWorld", new Object[0]), ☃, ☃));
    
    ☃ = ant.a.a("{\"coordinateScale\":3000.0, \"heightScale\":6000.0, \"upperLimitScale\":250.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
    ☃ = new jy("textures/gui/presets/isles.png");
    f.add(new axc.a(bnq.a("createWorld.customize.custom.preset.isleLand", new Object[0]), ☃, ☃));
    
    ☃ = ant.a.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":5000.0, \"mainNoiseScaleY\":1000.0, \"mainNoiseScaleZ\":5000.0, \"baseSize\":8.5, \"stretchY\":5.0, \"biomeDepthWeight\":2.0, \"biomeDepthOffset\":1.0, \"biomeScaleWeight\":4.0, \"biomeScaleOffset\":1.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
    ☃ = new jy("textures/gui/presets/delight.png");
    f.add(new axc.a(bnq.a("createWorld.customize.custom.preset.caveDelight", new Object[0]), ☃, ☃));
    
    ☃ = ant.a.a("{\"coordinateScale\":738.41864, \"heightScale\":157.69133, \"upperLimitScale\":801.4267, \"lowerLimitScale\":1254.1643, \"depthNoiseScaleX\":374.93652, \"depthNoiseScaleZ\":288.65228, \"depthNoiseScaleExponent\":1.2092624, \"mainNoiseScaleX\":1355.9908, \"mainNoiseScaleY\":745.5343, \"mainNoiseScaleZ\":1183.464, \"baseSize\":1.8758626, \"stretchY\":1.7137525, \"biomeDepthWeight\":1.7553768, \"biomeDepthOffset\":3.4701107, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":2.535211, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":63 }");
    ☃ = new jy("textures/gui/presets/madness.png");
    f.add(new axc.a(bnq.a("createWorld.customize.custom.preset.mountains", new Object[0]), ☃, ☃));
    
    ☃ = ant.a.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":1000.0, \"mainNoiseScaleY\":3000.0, \"mainNoiseScaleZ\":1000.0, \"baseSize\":8.5, \"stretchY\":10.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":20 }");
    ☃ = new jy("textures/gui/presets/drought.png");
    f.add(new axc.a(bnq.a("createWorld.customize.custom.preset.drought", new Object[0]), ☃, ☃));
    
    ☃ = ant.a.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":2.0, \"lowerLimitScale\":64.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":false, \"seaLevel\":6 }");
    ☃ = new jy("textures/gui/presets/chaos.png");
    f.add(new axc.a(bnq.a("createWorld.customize.custom.preset.caveChaos", new Object[0]), ☃, ☃));
    
    ☃ = ant.a.a("{\"coordinateScale\":684.412, \"heightScale\":684.412, \"upperLimitScale\":512.0, \"lowerLimitScale\":512.0, \"depthNoiseScaleX\":200.0, \"depthNoiseScaleZ\":200.0, \"depthNoiseScaleExponent\":0.5, \"mainNoiseScaleX\":80.0, \"mainNoiseScaleY\":160.0, \"mainNoiseScaleZ\":80.0, \"baseSize\":8.5, \"stretchY\":12.0, \"biomeDepthWeight\":1.0, \"biomeDepthOffset\":0.0, \"biomeScaleWeight\":1.0, \"biomeScaleOffset\":0.0, \"useCaves\":true, \"useDungeons\":true, \"dungeonChance\":8, \"useStrongholds\":true, \"useVillages\":true, \"useMineShafts\":true, \"useTemples\":true, \"useRavines\":true, \"useWaterLakes\":true, \"waterLakeChance\":4, \"useLavaLakes\":true, \"lavaLakeChance\":80, \"useLavaOceans\":true, \"seaLevel\":40 }");
    ☃ = new jy("textures/gui/presets/luck.png");
    f.add(new axc.a(bnq.a("createWorld.customize.custom.preset.goodLuck", new Object[0]), ☃, ☃));
  }
  
  public axc(axd ☃)
  {
    this.r = ☃;
  }
  
  public void b()
  {
    this.n.clear();
    Keyboard.enableRepeatEvents(true);
    
    this.a = bnq.a("createWorld.customize.custom.presets.title", new Object[0]);
    this.s = bnq.a("createWorld.customize.presets.share", new Object[0]);
    this.t = bnq.a("createWorld.customize.presets.list", new Object[0]);
    this.i = new avw(2, this.q, 50, 40, this.l - 100, 20);
    this.g = new axc.b();
    
    this.i.f(2000);
    this.i.a(this.r.a());
    
    this.n.add(this.h = new avs(0, this.l / 2 - 102, this.m - 27, 100, 20, bnq.a("createWorld.customize.presets.select", new Object[0])));
    this.n.add(new avs(1, this.l / 2 + 3, this.m - 27, 100, 20, bnq.a("gui.cancel", new Object[0])));
    
    a();
  }
  
  public void k()
  {
    super.k();
    this.g.p();
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    this.i.a(☃, ☃, ☃);
    super.a(☃, ☃, ☃);
  }
  
  protected void a(char ☃, int ☃)
  {
    if (!this.i.a(☃, ☃)) {
      super.a(☃, ☃);
    }
  }
  
  protected void a(avs ☃)
  {
    switch (☃.k)
    {
    case 0: 
      this.r.a(this.i.b());
      this.j.a(this.r);
      break;
    case 1: 
      this.j.a(this.r);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    this.g.a(☃, ☃, ☃);
    a(this.q, this.a, this.l / 2, 8, 16777215);
    c(this.q, this.s, 50, 30, 10526880);
    c(this.q, this.t, 50, 70, 10526880);
    
    this.i.g();
    super.a(☃, ☃, ☃);
  }
  
  public void e()
  {
    this.i.a();
    super.e();
  }
  
  public void a()
  {
    this.h.l = g();
  }
  
  private boolean g()
  {
    return ((this.g.u > -1) && (this.g.u < f.size())) || (this.i.b().length() > 1);
  }
  
  class b
    extends awi
  {
    public int u = -1;
    
    public b()
    {
      super(axc.this.l, axc.this.m, 80, axc.this.m - 32, 38);
    }
    
    protected int b()
    {
      return axc.f().size();
    }
    
    protected void a(int ☃, boolean ☃, int ☃, int ☃)
    {
      this.u = ☃;
      axc.this.a();
      axc.b(axc.this).a(((axc.a)axc.f().get(axc.a(axc.this).u)).c.toString());
    }
    
    protected boolean a(int ☃)
    {
      return ☃ == this.u;
    }
    
    protected void a() {}
    
    private void a(int ☃, int ☃, jy ☃)
    {
      int ☃ = ☃ + 5;
      int ☃ = ☃;
      axc.a(axc.this, ☃ - 1, ☃ + 32, ☃ - 1, -2039584);
      axc.b(axc.this, ☃ - 1, ☃ + 32, ☃ + 32, -6250336);
      axc.c(axc.this, ☃ - 1, ☃ - 1, ☃ + 32, -2039584);
      axc.d(axc.this, ☃ + 32, ☃ - 1, ☃ + 32, -6250336);
      
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      this.a.P().a(☃);
      
      int ☃ = 32;
      int ☃ = 32;
      bfx ☃ = bfx.a();
      bfd ☃ = ☃.c();
      ☃.a(7, bms.g);
      ☃.b(☃ + 0, ☃ + 32, 0.0D).a(0.0D, 1.0D).d();
      ☃.b(☃ + 32, ☃ + 32, 0.0D).a(1.0D, 1.0D).d();
      ☃.b(☃ + 32, ☃ + 0, 0.0D).a(1.0D, 0.0D).d();
      ☃.b(☃ + 0, ☃ + 0, 0.0D).a(0.0D, 0.0D).d();
      ☃.b();
    }
    
    protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      axc.a ☃ = (axc.a)axc.f().get(☃);
      a(☃, ☃, ☃.b);
      axc.this.q.a(☃.a, ☃ + 32 + 10, ☃ + 14, 16777215);
    }
  }
  
  static class a
  {
    public String a;
    public jy b;
    public ant.a c;
    
    public a(String ☃, jy ☃, ant.a ☃)
    {
      this.a = ☃;
      this.b = ☃;
      this.c = ☃;
    }
  }
}
