import java.util.List;
import java.util.concurrent.Callable;
import org.lwjgl.util.vector.Vector3f;

public class bjh
  implements bnj
{
  private static final jy b = new jy("textures/misc/enchanted_item_glint.png");
  private boolean c = true;
  public float a;
  private final bfo d;
  private final bmj e;
  private static final String __OBFID = "CL_00001003";
  private bov modelLocation = null;
  
  public bjh(bmj p_i46165_1_, bou p_i46165_2_)
  {
    e = p_i46165_1_;
    if (Reflector.ItemModelMesherForge_Constructor.exists()) {
      d = ((bfo)Reflector.newInstance(Reflector.ItemModelMesherForge_Constructor, new Object[] { p_i46165_2_ }));
    } else {
      d = new bfo(p_i46165_2_);
    }
    b();
  }
  
  public void a(boolean p_175039_1_)
  {
    c = p_175039_1_;
  }
  
  public bfo a()
  {
    return d;
  }
  
  protected void a(zw p_175048_1_, int p_175048_2_, String p_175048_3_)
  {
    d.a(p_175048_1_, p_175048_2_, new bov(p_175048_3_, "inventory"));
  }
  
  protected void a(afh p_175029_1_, int p_175029_2_, String p_175029_3_)
  {
    a(zw.a(p_175029_1_), p_175029_2_, p_175029_3_);
  }
  
  private void a(afh p_175031_1_, String p_175031_2_)
  {
    a(p_175031_1_, 0, p_175031_2_);
  }
  
  private void a(zw p_175047_1_, String p_175047_2_)
  {
    a(p_175047_1_, 0, p_175047_2_);
  }
  
  private void a(boq p_175036_1_, zx p_175036_2_)
  {
    a(p_175036_1_, -1, p_175036_2_);
  }
  
  public void a(boq p_175035_1_, int p_175035_2_)
  {
    a(p_175035_1_, p_175035_2_, (zx)null);
  }
  
  private void a(boq p_175045_1_, int p_175045_2_, zx p_175045_3_)
  {
    bfx var4 = bfx.a();
    bfd var5 = var4.c();
    
    boolean renderTextureMap = ave.A().T().isTextureBound();
    
    boolean multiTexture = (Config.isMultiTexture()) && (renderTextureMap);
    if (multiTexture) {
      var5.setBlockLayer(adf.a);
    }
    var5.a(7, bms.b);
    
    cq[] var6 = cq.n;
    int var7 = var6.length;
    for (int var8 = 0; var8 < var7; var8++)
    {
      cq var9 = var6[var8];
      a(var5, p_175045_1_.a(var9), p_175045_2_, p_175045_3_);
    }
    a(var5, p_175045_1_.a(), p_175045_2_, p_175045_3_);
    var4.b();
    if (multiTexture)
    {
      var5.setBlockLayer(null);
      
      bfl.bindCurrentTexture();
    }
  }
  
  public void a(zx p_180454_1_, boq p_180454_2_)
  {
    if (p_180454_1_ != null)
    {
      bfl.E();
      bfl.a(0.5F, 0.5F, 0.5F);
      if (p_180454_2_.d())
      {
        bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
        bfl.b(-0.5F, -0.5F, -0.5F);
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        bfl.B();
        bfi.a.a(p_180454_1_);
      }
      else
      {
        if (Config.isCustomItems()) {
          p_180454_2_ = CustomItems.getCustomItemModel(p_180454_1_, p_180454_2_, modelLocation);
        }
        bfl.b(-0.5F, -0.5F, -0.5F);
        a(p_180454_2_, p_180454_1_);
        if (p_180454_1_.t()) {
          if ((!Config.isCustomItems()) || (!CustomItems.renderCustomEffect(this, p_180454_1_, p_180454_2_))) {
            a(p_180454_2_);
          }
        }
      }
      bfl.F();
    }
  }
  
  private void a(boq p_180451_1_)
  {
    bfl.a(false);
    bfl.c(514);
    bfl.f();
    bfl.b(768, 1);
    e.a(b);
    bfl.n(5890);
    bfl.E();
    bfl.a(8.0F, 8.0F, 8.0F);
    float var2 = (float)(ave.J() % 3000L) / 3000.0F / 8.0F;
    bfl.b(var2, 0.0F, 0.0F);
    bfl.b(-50.0F, 0.0F, 0.0F, 1.0F);
    a(p_180451_1_, -8372020);
    bfl.F();
    bfl.E();
    bfl.a(8.0F, 8.0F, 8.0F);
    float var3 = (float)(ave.J() % 4873L) / 4873.0F / 8.0F;
    bfl.b(-var3, 0.0F, 0.0F);
    bfl.b(10.0F, 0.0F, 0.0F, 1.0F);
    a(p_180451_1_, -8372020);
    bfl.F();
    bfl.n(5888);
    bfl.b(770, 771);
    bfl.e();
    bfl.c(515);
    bfl.a(true);
    e.a(bmh.g);
  }
  
  private void a(bfd p_175038_1_, bgg p_175038_2_)
  {
    df var3 = p_175038_2_.d().m();
    p_175038_1_.b(var3.n(), var3.o(), var3.p());
  }
  
  private void a(bfd p_175033_1_, bgg p_175033_2_, int p_175033_3_)
  {
    if (p_175033_1_.isMultiTexture())
    {
      p_175033_1_.a(p_175033_2_.getVertexDataSingle());
      p_175033_1_.putSprite(p_175033_2_.getSprite());
    }
    else
    {
      p_175033_1_.a(p_175033_2_.a());
    }
    if (Reflector.ForgeHooksClient_putQuadColor.exists())
    {
      if (Reflector.IColoredBakedQuad.isInstance(p_175033_2_)) {
        Reflector.call(Reflector.ForgeHooksClient_putQuadColor, new Object[] { p_175033_1_, p_175033_2_, Integer.valueOf(p_175033_3_) });
      } else {
        p_175033_1_.a(p_175033_3_);
      }
      return;
    }
    p_175033_1_.a(p_175033_3_);
    a(p_175033_1_, p_175033_2_);
  }
  
  private void a(bfd p_175032_1_, List p_175032_2_, int p_175032_3_, zx p_175032_4_)
  {
    boolean var5 = (p_175032_3_ == -1) && (p_175032_4_ != null);
    int var6 = 0;
    for (int var7 = p_175032_2_.size(); var6 < var7; var6++)
    {
      bgg var8 = (bgg)p_175032_2_.get(var6);
      int var9 = p_175032_3_;
      if ((var5) && (var8.b()))
      {
        var9 = p_175032_4_.b().a(p_175032_4_, var8.c());
        if (Config.isCustomColors()) {
          var9 = CustomColorizer.getColorFromItemStack(p_175032_4_, var8.c(), var9);
        }
        if (bfk.a) {
          var9 = bml.c(var9);
        }
        var9 |= 0xFF000000;
      }
      a(p_175032_1_, var8, var9);
    }
  }
  
  public boolean a(zx p_175050_1_)
  {
    boq var2 = d.a(p_175050_1_);
    return var2 == null ? false : var2.c();
  }
  
  private void b(zx p_175046_1_)
  {
    boq var2 = d.a(p_175046_1_);
    zw var3 = p_175046_1_.b();
    if (var3 != null)
    {
      boolean var4 = var2.c();
      if (!var4) {
        bfl.a(2.0F, 2.0F, 2.0F);
      }
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    }
  }
  
  public void a(zx p_500168_1_, bgr.b p_500168_2_)
  {
    if (p_500168_1_ != null)
    {
      boq var3 = d.a(p_500168_1_);
      a(p_500168_1_, var3, p_500168_2_);
    }
  }
  
  public void a(zx p_175049_1_, pr p_175049_2_, bgr.b p_175049_3_)
  {
    if ((p_175049_1_ != null) && (p_175049_2_ != null))
    {
      boq var4 = d.a(p_175049_1_);
      if ((p_175049_2_ instanceof wn))
      {
        wn var5 = (wn)p_175049_2_;
        zw var6 = p_175049_1_.b();
        bov var7 = null;
        if ((var6 == zy.aR) && (bG != null))
        {
          var7 = new bov("fishing_rod_cast", "inventory");
        }
        else if ((var6 == zy.f) && (var5.bQ() != null))
        {
          int var8 = p_175049_1_.l() - var5.bR();
          if (var8 >= 18) {
            var7 = new bov("bow_pulling_2", "inventory");
          } else if (var8 > 13) {
            var7 = new bov("bow_pulling_1", "inventory");
          } else if (var8 > 0) {
            var7 = new bov("bow_pulling_0", "inventory");
          }
        }
        else if (Reflector.ForgeItem_getModel.exists())
        {
          var7 = (bov)Reflector.call(var6, Reflector.ForgeItem_getModel, new Object[] { p_175049_1_, var5, Integer.valueOf(var5.bR()) });
        }
        modelLocation = var7;
        if (var7 != null) {
          var4 = d.a().a(var7);
        }
      }
      a(p_175049_1_, var4, p_175049_3_);
      
      modelLocation = null;
    }
  }
  
  protected void a(zx p_175040_1_, boq p_175040_2_, bgr.b p_175040_3_)
  {
    e.a(bmh.g);
    e.b(bmh.g).b(false, false);
    b(p_175040_1_);
    bfl.B();
    bfl.a(516, 0.1F);
    bfl.l();
    bfl.a(770, 771, 1, 0);
    bfl.E();
    if (Reflector.ForgeHooksClient_handleCameraTransforms.exists())
    {
      p_175040_2_ = (boq)Reflector.call(Reflector.ForgeHooksClient_handleCameraTransforms, new Object[] { p_175040_2_, p_175040_3_ });
    }
    else
    {
      bgr var4 = p_175040_2_.f();
      var4.a(p_175040_3_);
      if (a(var4.b(p_175040_3_))) {
        bfl.e(1028);
      }
    }
    a(p_175040_1_, p_175040_2_);
    bfl.e(1029);
    bfl.F();
    bfl.C();
    bfl.k();
    e.a(bmh.g);
    e.b(bmh.g).a();
  }
  
  private boolean a(bgq p_500169_1_)
  {
    return (d.x < 0.0F ? 1 : 0) ^ (d.y < 0.0F ? 1 : 0) ^ (d.z < 0.0F ? 1 : 0);
  }
  
  public void a(zx p_175042_1_, int p_175042_2_, int p_175042_3_)
  {
    boq var4 = d.a(p_175042_1_);
    bfl.E();
    e.a(bmh.g);
    e.b(bmh.g).b(false, false);
    bfl.B();
    bfl.d();
    bfl.a(516, 0.1F);
    bfl.l();
    bfl.b(770, 771);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    a(p_175042_2_, p_175042_3_, var4.c());
    if (Reflector.ForgeHooksClient_handleCameraTransforms.exists()) {
      var4 = (boq)Reflector.call(Reflector.ForgeHooksClient_handleCameraTransforms, new Object[] { var4, bgr.b.e });
    } else {
      var4.f().a(bgr.b.e);
    }
    a(p_175042_1_, var4);
    bfl.c();
    bfl.C();
    bfl.f();
    bfl.F();
    e.a(bmh.g);
    e.b(bmh.g).a();
  }
  
  private void a(int p_180452_1_, int p_180452_2_, boolean p_180452_3_)
  {
    bfl.b(p_180452_1_, p_180452_2_, 100.0F + a);
    bfl.b(8.0F, 8.0F, 0.0F);
    bfl.a(1.0F, 1.0F, -1.0F);
    bfl.a(0.5F, 0.5F, 0.5F);
    if (p_180452_3_)
    {
      bfl.a(40.0F, 40.0F, 40.0F);
      bfl.b(210.0F, 1.0F, 0.0F, 0.0F);
      bfl.b(-135.0F, 0.0F, 1.0F, 0.0F);
      bfl.e();
    }
    else
    {
      bfl.a(64.0F, 64.0F, 64.0F);
      bfl.b(180.0F, 1.0F, 0.0F, 0.0F);
      bfl.f();
    }
  }
  
  public void b(final zx p_180450_1_, int p_180450_2_, int p_180450_3_)
  {
    if ((p_180450_1_ != null) && (p_180450_1_.b() != null))
    {
      a += 50.0F;
      try
      {
        a(p_180450_1_, p_180450_2_, p_180450_3_);
      }
      catch (Throwable var7)
      {
        b var5 = b.a(var7, "Rendering item");
        c var6 = var5.a("Item being rendered");
        var6.a("Item Type", new Callable()
        {
          private static final String __OBFID = "CL_00001004";
          
          public String a()
            throws Exception
          {
            return String.valueOf(p_180450_1_.b());
          }
        });
        var6.a("Item Aux", new Callable()
        {
          private static final String __OBFID = "CL_00001005";
          
          public String a()
            throws Exception
          {
            return String.valueOf(p_180450_1_.i());
          }
        });
        var6.a("Item NBT", new Callable()
        {
          private static final String __OBFID = "CL_00001006";
          
          public String a()
            throws Exception
          {
            return String.valueOf(p_180450_1_.o());
          }
        });
        var6.a("Item Foil", new Callable()
        {
          private static final String __OBFID = "CL_00001007";
          
          public String a()
            throws Exception
          {
            return String.valueOf(p_180450_1_.t());
          }
        });
        throw new e(var5);
      }
      a -= 50.0F;
    }
  }
  
  public void a(avn p_175030_1_, zx p_175030_2_, int p_175030_3_, int p_175030_4_)
  {
    a(p_175030_1_, p_175030_2_, p_175030_3_, p_175030_4_, (String)null);
  }
  
  public void a(avn p_180453_1_, zx p_180453_2_, int p_180453_3_, int p_180453_4_, String p_180453_5_)
  {
    if (p_180453_2_ != null)
    {
      if ((b != 1) || (p_180453_5_ != null))
      {
        String var6 = p_180453_5_ == null ? String.valueOf(b) : p_180453_5_;
        if ((p_180453_5_ == null) && (b < 1)) {
          var6 = a.m + String.valueOf(b);
        }
        bfl.f();
        bfl.i();
        bfl.k();
        p_180453_1_.a(var6, p_180453_3_ + 19 - 2 - p_180453_1_.a(var6), p_180453_4_ + 6 + 3, 16777215);
        bfl.e();
        bfl.j();
      }
      boolean itemDamaged = p_180453_2_.g();
      if (Reflector.ForgeItem_showDurabilityBar.exists()) {
        itemDamaged = Reflector.callBoolean(p_180453_2_.b(), Reflector.ForgeItem_showDurabilityBar, new Object[] { p_180453_2_ });
      }
      if (itemDamaged)
      {
        int var10 = (int)Math.round(13.0D - p_180453_2_.h() * 13.0D / p_180453_2_.j());
        int var7 = (int)Math.round(255.0D - p_180453_2_.h() * 255.0D / p_180453_2_.j());
        if (Reflector.ForgeItem_getDurabilityForDisplay.exists())
        {
          double health = Reflector.callDouble(p_180453_2_.b(), Reflector.ForgeItem_getDurabilityForDisplay, new Object[] { p_180453_2_ });
          var10 = (int)Math.round(13.0D - health * 13.0D);
          var7 = (int)Math.round(255.0D - health * 255.0D);
        }
        bfl.f();
        bfl.i();
        bfl.x();
        bfl.c();
        bfl.k();
        bfx var8 = bfx.a();
        bfd var9 = var8.c();
        a(var9, p_180453_3_ + 2, p_180453_4_ + 13, 13, 2, 0, 0, 0, 255);
        a(var9, p_180453_3_ + 2, p_180453_4_ + 13, 12, 1, (255 - var7) / 4, 64, 0, 255);
        a(var9, p_180453_3_ + 2, p_180453_4_ + 13, var10, 1, 255 - var7, var7, 0, 255);
        if (!Reflector.ForgeHooksClient.exists()) {
          bfl.l();
        }
        bfl.d();
        bfl.w();
        bfl.e();
        bfl.j();
      }
    }
  }
  
  private void a(bfd p_500170_1_, int p_500170_2_, int p_500170_3_, int p_500170_4_, int p_500170_5_, int p_500170_6_, int p_500170_7_, int p_500170_8_, int p_500170_9_)
  {
    p_500170_1_.a(7, bms.f);
    p_500170_1_.b(p_500170_2_ + 0, p_500170_3_ + 0, 0.0D).b(p_500170_6_, p_500170_7_, p_500170_8_, p_500170_9_).d();
    p_500170_1_.b(p_500170_2_ + 0, p_500170_3_ + p_500170_5_, 0.0D).b(p_500170_6_, p_500170_7_, p_500170_8_, p_500170_9_).d();
    p_500170_1_.b(p_500170_2_ + p_500170_4_, p_500170_3_ + p_500170_5_, 0.0D).b(p_500170_6_, p_500170_7_, p_500170_8_, p_500170_9_).d();
    p_500170_1_.b(p_500170_2_ + p_500170_4_, p_500170_3_ + 0, 0.0D).b(p_500170_6_, p_500170_7_, p_500170_8_, p_500170_9_).d();
    bfx.a().b();
  }
  
  private void b()
  {
    a(afi.cf, "anvil_intact");
    a(afi.cf, 1, "anvil_slightly_damaged");
    a(afi.cf, 2, "anvil_very_damaged");
    a(afi.cy, zd.p.a(), "black_carpet");
    a(afi.cy, zd.l.a(), "blue_carpet");
    a(afi.cy, zd.m.a(), "brown_carpet");
    a(afi.cy, zd.j.a(), "cyan_carpet");
    a(afi.cy, zd.h.a(), "gray_carpet");
    a(afi.cy, zd.n.a(), "green_carpet");
    a(afi.cy, zd.d.a(), "light_blue_carpet");
    a(afi.cy, zd.f.a(), "lime_carpet");
    a(afi.cy, zd.c.a(), "magenta_carpet");
    a(afi.cy, zd.b.a(), "orange_carpet");
    a(afi.cy, zd.g.a(), "pink_carpet");
    a(afi.cy, zd.k.a(), "purple_carpet");
    a(afi.cy, zd.o.a(), "red_carpet");
    a(afi.cy, zd.i.a(), "silver_carpet");
    a(afi.cy, zd.a.a(), "white_carpet");
    a(afi.cy, zd.e.a(), "yellow_carpet");
    a(afi.bZ, akl.a.b.a(), "mossy_cobblestone_wall");
    a(afi.bZ, akl.a.a.a(), "cobblestone_wall");
    a(afi.d, agf.a.b.a(), "coarse_dirt");
    a(afi.d, agf.a.a.a(), "dirt");
    a(afi.d, agf.a.c.a(), "podzol");
    a(afi.cF, agi.b.d.a(), "double_fern");
    a(afi.cF, agi.b.c.a(), "double_grass");
    a(afi.cF, agi.b.f.a(), "paeonia");
    a(afi.cF, agi.b.e.a(), "double_rose");
    a(afi.cF, agi.b.a.a(), "sunflower");
    a(afi.cF, agi.b.b.a(), "syringa");
    a(afi.t, aio.a.c.a(), "birch_leaves");
    a(afi.t, aio.a.d.a(), "jungle_leaves");
    a(afi.t, aio.a.a.a(), "oak_leaves");
    a(afi.t, aio.a.b.a(), "spruce_leaves");
    a(afi.u, aio.a.e.a() - 4, "acacia_leaves");
    a(afi.u, aio.a.f.a() - 4, "dark_oak_leaves");
    a(afi.r, aio.a.c.a(), "birch_log");
    a(afi.r, aio.a.d.a(), "jungle_log");
    a(afi.r, aio.a.a.a(), "oak_log");
    a(afi.r, aio.a.b.a(), "spruce_log");
    a(afi.s, aio.a.e.a() - 4, "acacia_log");
    a(afi.s, aio.a.f.a() - 4, "dark_oak_log");
    a(afi.be, ahz.a.f.a(), "chiseled_brick_monster_egg");
    a(afi.be, ahz.a.b.a(), "cobblestone_monster_egg");
    a(afi.be, ahz.a.e.a(), "cracked_brick_monster_egg");
    a(afi.be, ahz.a.d.a(), "mossy_brick_monster_egg");
    a(afi.be, ahz.a.a.a(), "stone_monster_egg");
    a(afi.be, ahz.a.c.a(), "stone_brick_monster_egg");
    a(afi.f, aio.a.e.a(), "acacia_planks");
    a(afi.f, aio.a.c.a(), "birch_planks");
    a(afi.f, aio.a.f.a(), "dark_oak_planks");
    a(afi.f, aio.a.d.a(), "jungle_planks");
    a(afi.f, aio.a.a.a(), "oak_planks");
    a(afi.f, aio.a.b.a(), "spruce_planks");
    a(afi.cI, aiu.a.b.a(), "prismarine_bricks");
    a(afi.cI, aiu.a.c.a(), "dark_prismarine");
    a(afi.cI, aiu.a.a.a(), "prismarine");
    a(afi.cq, aiw.a.b.a(), "chiseled_quartz_block");
    a(afi.cq, aiw.a.a.a(), "quartz_block");
    a(afi.cq, aiw.a.c.a(), "quartz_column");
    a(afi.O, agw.a.d.b(), "allium");
    a(afi.O, agw.a.c.b(), "blue_orchid");
    a(afi.O, agw.a.e.b(), "houstonia");
    a(afi.O, agw.a.g.b(), "orange_tulip");
    a(afi.O, agw.a.j.b(), "oxeye_daisy");
    a(afi.O, agw.a.i.b(), "pink_tulip");
    a(afi.O, agw.a.b.b(), "poppy");
    a(afi.O, agw.a.f.b(), "red_tulip");
    a(afi.O, agw.a.h.b(), "white_tulip");
    a(afi.m, ajh.a.b.a(), "red_sand");
    a(afi.m, ajh.a.a.a(), "sand");
    a(afi.A, aji.a.b.a(), "chiseled_sandstone");
    a(afi.A, aji.a.a.a(), "sandstone");
    a(afi.A, aji.a.c.a(), "smooth_sandstone");
    a(afi.cM, aiz.a.b.a(), "chiseled_red_sandstone");
    a(afi.cM, aiz.a.a.a(), "red_sandstone");
    a(afi.cM, aiz.a.c.a(), "smooth_red_sandstone");
    a(afi.g, aio.a.e.a(), "acacia_sapling");
    a(afi.g, aio.a.c.a(), "birch_sapling");
    a(afi.g, aio.a.f.a(), "dark_oak_sapling");
    a(afi.g, aio.a.d.a(), "jungle_sapling");
    a(afi.g, aio.a.a.a(), "oak_sapling");
    a(afi.g, aio.a.b.a(), "spruce_sapling");
    a(afi.v, 0, "sponge");
    a(afi.v, 1, "sponge_wet");
    a(afi.cG, zd.p.a(), "black_stained_glass");
    a(afi.cG, zd.l.a(), "blue_stained_glass");
    a(afi.cG, zd.m.a(), "brown_stained_glass");
    a(afi.cG, zd.j.a(), "cyan_stained_glass");
    a(afi.cG, zd.h.a(), "gray_stained_glass");
    a(afi.cG, zd.n.a(), "green_stained_glass");
    a(afi.cG, zd.d.a(), "light_blue_stained_glass");
    a(afi.cG, zd.f.a(), "lime_stained_glass");
    a(afi.cG, zd.c.a(), "magenta_stained_glass");
    a(afi.cG, zd.b.a(), "orange_stained_glass");
    a(afi.cG, zd.g.a(), "pink_stained_glass");
    a(afi.cG, zd.k.a(), "purple_stained_glass");
    a(afi.cG, zd.o.a(), "red_stained_glass");
    a(afi.cG, zd.i.a(), "silver_stained_glass");
    a(afi.cG, zd.a.a(), "white_stained_glass");
    a(afi.cG, zd.e.a(), "yellow_stained_glass");
    a(afi.cH, zd.p.a(), "black_stained_glass_pane");
    a(afi.cH, zd.l.a(), "blue_stained_glass_pane");
    a(afi.cH, zd.m.a(), "brown_stained_glass_pane");
    a(afi.cH, zd.j.a(), "cyan_stained_glass_pane");
    a(afi.cH, zd.h.a(), "gray_stained_glass_pane");
    a(afi.cH, zd.n.a(), "green_stained_glass_pane");
    a(afi.cH, zd.d.a(), "light_blue_stained_glass_pane");
    a(afi.cH, zd.f.a(), "lime_stained_glass_pane");
    a(afi.cH, zd.c.a(), "magenta_stained_glass_pane");
    a(afi.cH, zd.b.a(), "orange_stained_glass_pane");
    a(afi.cH, zd.g.a(), "pink_stained_glass_pane");
    a(afi.cH, zd.k.a(), "purple_stained_glass_pane");
    a(afi.cH, zd.o.a(), "red_stained_glass_pane");
    a(afi.cH, zd.i.a(), "silver_stained_glass_pane");
    a(afi.cH, zd.a.a(), "white_stained_glass_pane");
    a(afi.cH, zd.e.a(), "yellow_stained_glass_pane");
    a(afi.cu, zd.p.a(), "black_stained_hardened_clay");
    a(afi.cu, zd.l.a(), "blue_stained_hardened_clay");
    a(afi.cu, zd.m.a(), "brown_stained_hardened_clay");
    a(afi.cu, zd.j.a(), "cyan_stained_hardened_clay");
    a(afi.cu, zd.h.a(), "gray_stained_hardened_clay");
    a(afi.cu, zd.n.a(), "green_stained_hardened_clay");
    a(afi.cu, zd.d.a(), "light_blue_stained_hardened_clay");
    a(afi.cu, zd.f.a(), "lime_stained_hardened_clay");
    a(afi.cu, zd.c.a(), "magenta_stained_hardened_clay");
    a(afi.cu, zd.b.a(), "orange_stained_hardened_clay");
    a(afi.cu, zd.g.a(), "pink_stained_hardened_clay");
    a(afi.cu, zd.k.a(), "purple_stained_hardened_clay");
    a(afi.cu, zd.o.a(), "red_stained_hardened_clay");
    a(afi.cu, zd.i.a(), "silver_stained_hardened_clay");
    a(afi.cu, zd.a.a(), "white_stained_hardened_clay");
    a(afi.cu, zd.e.a(), "yellow_stained_hardened_clay");
    a(afi.b, ajy.a.f.a(), "andesite");
    a(afi.b, ajy.a.g.a(), "andesite_smooth");
    a(afi.b, ajy.a.d.a(), "diorite");
    a(afi.b, ajy.a.e.a(), "diorite_smooth");
    a(afi.b, ajy.a.b.a(), "granite");
    a(afi.b, ajy.a.c.a(), "granite_smooth");
    a(afi.b, ajy.a.a.a(), "stone");
    a(afi.bf, ajz.a.c.a(), "cracked_stonebrick");
    a(afi.bf, ajz.a.a.a(), "stonebrick");
    a(afi.bf, ajz.a.d.a(), "chiseled_stonebrick");
    a(afi.bf, ajz.a.b.a(), "mossy_stonebrick");
    a(afi.U, akb.a.e.a(), "brick_slab");
    a(afi.U, akb.a.d.a(), "cobblestone_slab");
    a(afi.U, akb.a.c.a(), "old_wood_slab");
    a(afi.U, akb.a.g.a(), "nether_brick_slab");
    a(afi.U, akb.a.h.a(), "quartz_slab");
    a(afi.U, akb.a.b.a(), "sandstone_slab");
    a(afi.U, akb.a.f.a(), "stone_brick_slab");
    a(afi.U, akb.a.a.a(), "stone_slab");
    a(afi.cP, aih.a.a.a(), "red_sandstone_slab");
    a(afi.H, akc.a.a.a(), "dead_bush");
    a(afi.H, akc.a.c.a(), "fern");
    a(afi.H, akc.a.b.a(), "tall_grass");
    a(afi.bM, aio.a.e.a(), "acacia_slab");
    a(afi.bM, aio.a.c.a(), "birch_slab");
    a(afi.bM, aio.a.f.a(), "dark_oak_slab");
    a(afi.bM, aio.a.d.a(), "jungle_slab");
    a(afi.bM, aio.a.a.a(), "oak_slab");
    a(afi.bM, aio.a.b.a(), "spruce_slab");
    a(afi.L, zd.p.a(), "black_wool");
    a(afi.L, zd.l.a(), "blue_wool");
    a(afi.L, zd.m.a(), "brown_wool");
    a(afi.L, zd.j.a(), "cyan_wool");
    a(afi.L, zd.h.a(), "gray_wool");
    a(afi.L, zd.n.a(), "green_wool");
    a(afi.L, zd.d.a(), "light_blue_wool");
    a(afi.L, zd.f.a(), "lime_wool");
    a(afi.L, zd.c.a(), "magenta_wool");
    a(afi.L, zd.b.a(), "orange_wool");
    a(afi.L, zd.g.a(), "pink_wool");
    a(afi.L, zd.k.a(), "purple_wool");
    a(afi.L, zd.o.a(), "red_wool");
    a(afi.L, zd.i.a(), "silver_wool");
    a(afi.L, zd.a.a(), "white_wool");
    a(afi.L, zd.e.a(), "yellow_wool");
    a(afi.cC, "acacia_stairs");
    a(afi.cs, "activator_rail");
    a(afi.bY, "beacon");
    a(afi.h, "bedrock");
    a(afi.bV, "birch_stairs");
    a(afi.X, "bookshelf");
    a(afi.V, "brick_block");
    a(afi.V, "brick_block");
    a(afi.bu, "brick_stairs");
    a(afi.P, "brown_mushroom");
    a(afi.aK, "cactus");
    a(afi.aL, "clay");
    a(afi.cA, "coal_block");
    a(afi.q, "coal_ore");
    a(afi.e, "cobblestone");
    a(afi.ai, "crafting_table");
    a(afi.cD, "dark_oak_stairs");
    a(afi.cl, "daylight_detector");
    a(afi.I, "dead_bush");
    a(afi.E, "detector_rail");
    a(afi.ah, "diamond_block");
    a(afi.ag, "diamond_ore");
    a(afi.z, "dispenser");
    a(afi.ct, "dropper");
    a(afi.bT, "emerald_block");
    a(afi.bP, "emerald_ore");
    a(afi.bC, "enchanting_table");
    a(afi.bG, "end_portal_frame");
    a(afi.bH, "end_stone");
    a(afi.aO, "oak_fence");
    a(afi.aP, "spruce_fence");
    a(afi.aQ, "birch_fence");
    a(afi.aR, "jungle_fence");
    a(afi.aS, "dark_oak_fence");
    a(afi.aT, "acacia_fence");
    a(afi.bo, "oak_fence_gate");
    a(afi.bp, "spruce_fence_gate");
    a(afi.bq, "birch_fence_gate");
    a(afi.br, "jungle_fence_gate");
    a(afi.bs, "dark_oak_fence_gate");
    a(afi.bt, "acacia_fence_gate");
    a(afi.al, "furnace");
    a(afi.w, "glass");
    a(afi.bj, "glass_pane");
    a(afi.aX, "glowstone");
    a(afi.D, "golden_rail");
    a(afi.R, "gold_block");
    a(afi.o, "gold_ore");
    a(afi.c, "grass");
    a(afi.n, "gravel");
    a(afi.cz, "hardened_clay");
    a(afi.cx, "hay_block");
    a(afi.ci, "heavy_weighted_pressure_plate");
    a(afi.cp, "hopper");
    a(afi.aI, "ice");
    a(afi.bi, "iron_bars");
    a(afi.S, "iron_block");
    a(afi.p, "iron_ore");
    a(afi.cw, "iron_trapdoor");
    a(afi.aN, "jukebox");
    a(afi.bW, "jungle_stairs");
    a(afi.au, "ladder");
    a(afi.y, "lapis_block");
    a(afi.x, "lapis_ore");
    a(afi.ay, "lever");
    a(afi.ch, "light_weighted_pressure_plate");
    a(afi.aZ, "lit_pumpkin");
    a(afi.bk, "melon_block");
    a(afi.Y, "mossy_cobblestone");
    a(afi.bw, "mycelium");
    a(afi.aV, "netherrack");
    a(afi.by, "nether_brick");
    a(afi.bz, "nether_brick_fence");
    a(afi.bA, "nether_brick_stairs");
    a(afi.B, "noteblock");
    a(afi.ad, "oak_stairs");
    a(afi.Z, "obsidian");
    a(afi.cB, "packed_ice");
    a(afi.J, "piston");
    a(afi.aU, "pumpkin");
    a(afi.co, "quartz_ore");
    a(afi.cr, "quartz_stairs");
    a(afi.av, "rail");
    a(afi.cn, "redstone_block");
    a(afi.bJ, "redstone_lamp");
    a(afi.aC, "redstone_ore");
    a(afi.aF, "redstone_torch");
    a(afi.Q, "red_mushroom");
    a(afi.bO, "sandstone_stairs");
    a(afi.cN, "red_sandstone_stairs");
    a(afi.cJ, "sea_lantern");
    a(afi.cE, "slime");
    a(afi.aJ, "snow");
    a(afi.aH, "snow_layer");
    a(afi.aW, "soul_sand");
    a(afi.bU, "spruce_stairs");
    a(afi.F, "sticky_piston");
    a(afi.bv, "stone_brick_stairs");
    a(afi.aG, "stone_button");
    a(afi.az, "stone_pressure_plate");
    a(afi.aw, "stone_stairs");
    a(afi.W, "tnt");
    a(afi.aa, "torch");
    a(afi.bd, "trapdoor");
    a(afi.bR, "tripwire_hook");
    a(afi.bn, "vine");
    a(afi.bx, "waterlily");
    a(afi.G, "web");
    a(afi.cd, "wooden_button");
    a(afi.aB, "wooden_pressure_plate");
    a(afi.N, agw.a.a.b(), "dandelion");
    a(afi.ae, "chest");
    a(afi.cg, "trapped_chest");
    a(afi.bQ, "ender_chest");
    a(zy.a, "iron_shovel");
    a(zy.b, "iron_pickaxe");
    a(zy.c, "iron_axe");
    a(zy.d, "flint_and_steel");
    a(zy.e, "apple");
    a(zy.f, 0, "bow");
    a(zy.f, 1, "bow_pulling_0");
    a(zy.f, 2, "bow_pulling_1");
    a(zy.f, 3, "bow_pulling_2");
    a(zy.g, "arrow");
    a(zy.h, 0, "coal");
    a(zy.h, 1, "charcoal");
    a(zy.i, "diamond");
    a(zy.j, "iron_ingot");
    a(zy.k, "gold_ingot");
    a(zy.l, "iron_sword");
    a(zy.m, "wooden_sword");
    a(zy.n, "wooden_shovel");
    a(zy.o, "wooden_pickaxe");
    a(zy.p, "wooden_axe");
    a(zy.q, "stone_sword");
    a(zy.r, "stone_shovel");
    a(zy.s, "stone_pickaxe");
    a(zy.t, "stone_axe");
    a(zy.u, "diamond_sword");
    a(zy.v, "diamond_shovel");
    a(zy.w, "diamond_pickaxe");
    a(zy.x, "diamond_axe");
    a(zy.y, "stick");
    a(zy.z, "bowl");
    a(zy.A, "mushroom_stew");
    a(zy.B, "golden_sword");
    a(zy.C, "golden_shovel");
    a(zy.D, "golden_pickaxe");
    a(zy.E, "golden_axe");
    a(zy.F, "string");
    a(zy.G, "feather");
    a(zy.H, "gunpowder");
    a(zy.I, "wooden_hoe");
    a(zy.J, "stone_hoe");
    a(zy.K, "iron_hoe");
    a(zy.L, "diamond_hoe");
    a(zy.M, "golden_hoe");
    a(zy.N, "wheat_seeds");
    a(zy.O, "wheat");
    a(zy.P, "bread");
    a(zy.Q, "leather_helmet");
    a(zy.R, "leather_chestplate");
    a(zy.S, "leather_leggings");
    a(zy.T, "leather_boots");
    a(zy.U, "chainmail_helmet");
    a(zy.V, "chainmail_chestplate");
    a(zy.W, "chainmail_leggings");
    a(zy.X, "chainmail_boots");
    a(zy.Y, "iron_helmet");
    a(zy.Z, "iron_chestplate");
    a(zy.aa, "iron_leggings");
    a(zy.ab, "iron_boots");
    a(zy.ac, "diamond_helmet");
    a(zy.ad, "diamond_chestplate");
    a(zy.ae, "diamond_leggings");
    a(zy.af, "diamond_boots");
    a(zy.ag, "golden_helmet");
    a(zy.ah, "golden_chestplate");
    a(zy.ai, "golden_leggings");
    a(zy.aj, "golden_boots");
    a(zy.ak, "flint");
    a(zy.al, "porkchop");
    a(zy.am, "cooked_porkchop");
    a(zy.an, "painting");
    a(zy.ao, "golden_apple");
    a(zy.ao, 1, "golden_apple");
    a(zy.ap, "sign");
    a(zy.aq, "oak_door");
    a(zy.ar, "spruce_door");
    a(zy.as, "birch_door");
    a(zy.at, "jungle_door");
    a(zy.au, "acacia_door");
    a(zy.av, "dark_oak_door");
    a(zy.aw, "bucket");
    a(zy.ax, "water_bucket");
    a(zy.ay, "lava_bucket");
    a(zy.az, "minecart");
    a(zy.aA, "saddle");
    a(zy.aB, "iron_door");
    a(zy.aC, "redstone");
    a(zy.aD, "snowball");
    a(zy.aE, "boat");
    a(zy.aF, "leather");
    a(zy.aG, "milk_bucket");
    a(zy.aH, "brick");
    a(zy.aI, "clay_ball");
    a(zy.aJ, "reeds");
    a(zy.aK, "paper");
    a(zy.aL, "book");
    a(zy.aM, "slime_ball");
    a(zy.aN, "chest_minecart");
    a(zy.aO, "furnace_minecart");
    a(zy.aP, "egg");
    a(zy.aQ, "compass");
    a(zy.aR, "fishing_rod");
    a(zy.aR, 1, "fishing_rod_cast");
    a(zy.aS, "clock");
    a(zy.aT, "glowstone_dust");
    a(zy.aU, zp.a.a.a(), "cod");
    a(zy.aU, zp.a.b.a(), "salmon");
    a(zy.aU, zp.a.c.a(), "clownfish");
    a(zy.aU, zp.a.d.a(), "pufferfish");
    a(zy.aV, zp.a.a.a(), "cooked_cod");
    a(zy.aV, zp.a.b.a(), "cooked_salmon");
    a(zy.aW, zd.p.b(), "dye_black");
    a(zy.aW, zd.o.b(), "dye_red");
    a(zy.aW, zd.n.b(), "dye_green");
    a(zy.aW, zd.m.b(), "dye_brown");
    a(zy.aW, zd.l.b(), "dye_blue");
    a(zy.aW, zd.k.b(), "dye_purple");
    a(zy.aW, zd.j.b(), "dye_cyan");
    a(zy.aW, zd.i.b(), "dye_silver");
    a(zy.aW, zd.h.b(), "dye_gray");
    a(zy.aW, zd.g.b(), "dye_pink");
    a(zy.aW, zd.f.b(), "dye_lime");
    a(zy.aW, zd.e.b(), "dye_yellow");
    a(zy.aW, zd.d.b(), "dye_light_blue");
    a(zy.aW, zd.c.b(), "dye_magenta");
    a(zy.aW, zd.b.b(), "dye_orange");
    a(zy.aW, zd.a.b(), "dye_white");
    a(zy.aX, "bone");
    a(zy.aY, "sugar");
    a(zy.aZ, "cake");
    a(zy.ba, "bed");
    a(zy.bb, "repeater");
    a(zy.bc, "cookie");
    a(zy.be, "shears");
    a(zy.bf, "melon");
    a(zy.bg, "pumpkin_seeds");
    a(zy.bh, "melon_seeds");
    a(zy.bi, "beef");
    a(zy.bj, "cooked_beef");
    a(zy.bk, "chicken");
    a(zy.bl, "cooked_chicken");
    a(zy.bo, "rabbit");
    a(zy.bp, "cooked_rabbit");
    a(zy.bm, "mutton");
    a(zy.bn, "cooked_mutton");
    a(zy.br, "rabbit_foot");
    a(zy.bs, "rabbit_hide");
    a(zy.bq, "rabbit_stew");
    a(zy.bt, "rotten_flesh");
    a(zy.bu, "ender_pearl");
    a(zy.bv, "blaze_rod");
    a(zy.bw, "ghast_tear");
    a(zy.bx, "gold_nugget");
    a(zy.by, "nether_wart");
    d.a(zy.bz, new bfp()
    {
      private static final String __OBFID = "CL_00002440";
      
      public bov a(zx p_178113_1_)
      {
        return aai.f(p_178113_1_.i()) ? new bov("bottle_splash", "inventory") : new bov("bottle_drinkable", "inventory");
      }
    });
    a(zy.bA, "glass_bottle");
    a(zy.bB, "spider_eye");
    a(zy.bC, "fermented_spider_eye");
    a(zy.bD, "blaze_powder");
    a(zy.bE, "magma_cream");
    a(zy.bF, "brewing_stand");
    a(zy.bG, "cauldron");
    a(zy.bH, "ender_eye");
    a(zy.bI, "speckled_melon");
    d.a(zy.bJ, new bfp()
    {
      private static final String __OBFID = "CL_00002439";
      
      public bov a(zx p_178113_1_)
      {
        return new bov("spawn_egg", "inventory");
      }
    });
    a(zy.bK, "experience_bottle");
    a(zy.bL, "fire_charge");
    a(zy.bM, "writable_book");
    a(zy.bO, "emerald");
    a(zy.bP, "item_frame");
    a(zy.bQ, "flower_pot");
    a(zy.bR, "carrot");
    a(zy.bS, "potato");
    a(zy.bT, "baked_potato");
    a(zy.bU, "poisonous_potato");
    a(zy.bV, "map");
    a(zy.bW, "golden_carrot");
    a(zy.bX, 0, "skull_skeleton");
    a(zy.bX, 1, "skull_wither");
    a(zy.bX, 2, "skull_zombie");
    a(zy.bX, 3, "skull_char");
    a(zy.bX, 4, "skull_creeper");
    a(zy.bY, "carrot_on_a_stick");
    a(zy.bZ, "nether_star");
    a(zy.ca, "pumpkin_pie");
    a(zy.cc, "firework_charge");
    a(zy.ce, "comparator");
    a(zy.cf, "netherbrick");
    a(zy.cg, "quartz");
    a(zy.ch, "tnt_minecart");
    a(zy.ci, "hopper_minecart");
    a(zy.cj, "armor_stand");
    a(zy.ck, "iron_horse_armor");
    a(zy.cl, "golden_horse_armor");
    a(zy.cm, "diamond_horse_armor");
    a(zy.cn, "lead");
    a(zy.co, "name_tag");
    d.a(zy.cE, new bfp()
    {
      private static final String __OBFID = "CL_00002438";
      
      public bov a(zx p_178113_1_)
      {
        return new bov("banner", "inventory");
      }
    });
    a(zy.cq, "record_13");
    a(zy.cr, "record_cat");
    a(zy.cs, "record_blocks");
    a(zy.ct, "record_chirp");
    a(zy.cu, "record_far");
    a(zy.cv, "record_mall");
    a(zy.cw, "record_mellohi");
    a(zy.cx, "record_stal");
    a(zy.cy, "record_strad");
    a(zy.cz, "record_ward");
    a(zy.cA, "record_11");
    a(zy.cB, "record_wait");
    a(zy.cC, "prismarine_shard");
    a(zy.cD, "prismarine_crystals");
    d.a(zy.cd, new bfp()
    {
      private static final String __OBFID = "CL_00002437";
      
      public bov a(zx p_178113_1_)
      {
        return new bov("enchanted_book", "inventory");
      }
    });
    d.a(zy.bd, new bfp()
    {
      private static final String __OBFID = "CL_00002436";
      
      public bov a(zx p_178113_1_)
      {
        return new bov("filled_map", "inventory");
      }
    });
    a(afi.bX, "command_block");
    a(zy.cb, "fireworks");
    a(zy.cp, "command_block_minecart");
    a(afi.cv, "barrier");
    a(afi.ac, "mob_spawner");
    a(zy.bN, "written_book");
    a(afi.bg, aho.a.k.a(), "brown_mushroom_block");
    a(afi.bh, aho.a.k.a(), "red_mushroom_block");
    a(afi.bI, "dragon_egg");
    if (Reflector.ModelLoader_onRegisterItems.exists()) {
      Reflector.call(Reflector.ModelLoader_onRegisterItems, new Object[] { d });
    }
  }
  
  public void a(bni resourceManager)
  {
    d.b();
  }
}
