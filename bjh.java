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
  
  public bjh(bmj textureManager, bou modelManager)
  {
    this.e = textureManager;
    this.d = new bfo(modelManager);
    b();
  }
  
  public void a(boolean p_175039_1_)
  {
    this.c = p_175039_1_;
  }
  
  public bfo a()
  {
    return this.d;
  }
  
  protected void a(zw itm, int subType, String identifier)
  {
    this.d.a(itm, subType, new bov(identifier, "inventory"));
  }
  
  protected void a(afh blk, int subType, String identifier)
  {
    a(zw.a(blk), subType, identifier);
  }
  
  private void a(afh blk, String identifier)
  {
    a(blk, 0, identifier);
  }
  
  private void a(zw itm, String identifier)
  {
    a(itm, 0, identifier);
  }
  
  private void a(boq model, zx stack)
  {
    a(model, -1, stack);
  }
  
  private void a(boq model, int color)
  {
    a(model, color, (zx)null);
  }
  
  private void a(boq model, int color, zx stack)
  {
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.b);
    for (cq enumfacing : cq.values()) {
      a(worldrenderer, model.a(enumfacing), color, stack);
    }
    a(worldrenderer, model.a(), color, stack);
    tessellator.b();
  }
  
  public void a(zx stack, boq model)
  {
    if (stack != null)
    {
      bfl.E();
      bfl.a(0.5F, 0.5F, 0.5F);
      if (model.d())
      {
        bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
        bfl.b(-0.5F, -0.5F, -0.5F);
        bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
        bfl.B();
        bfi.a.a(stack);
      }
      else
      {
        bfl.b(-0.5F, -0.5F, -0.5F);
        a(model, stack);
        if (stack.t()) {
          a(model);
        }
      }
      bfl.F();
    }
  }
  
  private void a(boq model)
  {
    bfl.a(false);
    bfl.c(514);
    bfl.f();
    bfl.b(768, 1);
    this.e.a(b);
    bfl.n(5890);
    bfl.E();
    bfl.a(8.0F, 8.0F, 8.0F);
    float f = (float)(ave.J() % 3000L) / 3000.0F / 8.0F;
    bfl.b(f, 0.0F, 0.0F);
    bfl.b(-50.0F, 0.0F, 0.0F, 1.0F);
    a(model, -8372020);
    bfl.F();
    bfl.E();
    bfl.a(8.0F, 8.0F, 8.0F);
    float f1 = (float)(ave.J() % 4873L) / 4873.0F / 8.0F;
    bfl.b(-f1, 0.0F, 0.0F);
    bfl.b(10.0F, 0.0F, 0.0F, 1.0F);
    a(model, -8372020);
    bfl.F();
    bfl.n(5888);
    bfl.b(770, 771);
    bfl.e();
    bfl.c(515);
    bfl.a(true);
    this.e.a(bmh.g);
  }
  
  private void a(bfd renderer, bgg quad)
  {
    df vec3i = quad.d().m();
    renderer.b(vec3i.n(), vec3i.o(), vec3i.p());
  }
  
  private void a(bfd renderer, bgg quad, int color)
  {
    renderer.a(quad.a());
    renderer.a(color);
    a(renderer, quad);
  }
  
  private void a(bfd renderer, List<bgg> quads, int color, zx stack)
  {
    boolean flag = (color == -1) && (stack != null);
    int i = 0;
    for (int j = quads.size(); i < j; i++)
    {
      bgg bakedquad = (bgg)quads.get(i);
      int k = color;
      if ((flag) && (bakedquad.b()))
      {
        k = stack.b().a(stack, bakedquad.c());
        if (bfk.a) {
          k = bml.c(k);
        }
        k |= 0xFF000000;
      }
      a(renderer, bakedquad, k);
    }
  }
  
  public boolean a(zx stack)
  {
    boq ibakedmodel = this.d.a(stack);
    return ibakedmodel == null ? false : ibakedmodel.c();
  }
  
  private void b(zx stack)
  {
    boq ibakedmodel = this.d.a(stack);
    zw item = stack.b();
    if (item != null)
    {
      boolean flag = ibakedmodel.c();
      if (!flag) {
        bfl.a(2.0F, 2.0F, 2.0F);
      }
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    }
  }
  
  public void a(zx p_181564_1_, bgr.b p_181564_2_)
  {
    if (p_181564_1_ != null)
    {
      boq ibakedmodel = this.d.a(p_181564_1_);
      a(p_181564_1_, ibakedmodel, p_181564_2_);
    }
  }
  
  public void a(zx stack, pr entityToRenderFor, bgr.b cameraTransformType)
  {
    if ((stack != null) && (entityToRenderFor != null))
    {
      boq ibakedmodel = this.d.a(stack);
      if ((entityToRenderFor instanceof wn))
      {
        wn entityplayer = (wn)entityToRenderFor;
        zw item = stack.b();
        bov modelresourcelocation = null;
        if ((item == zy.aR) && (entityplayer.bG != null))
        {
          modelresourcelocation = new bov("fishing_rod_cast", "inventory");
        }
        else if ((item == zy.f) && (entityplayer.bQ() != null))
        {
          int i = stack.l() - entityplayer.bR();
          if (i >= 18) {
            modelresourcelocation = new bov("bow_pulling_2", "inventory");
          } else if (i > 13) {
            modelresourcelocation = new bov("bow_pulling_1", "inventory");
          } else if (i > 0) {
            modelresourcelocation = new bov("bow_pulling_0", "inventory");
          }
        }
        if (modelresourcelocation != null) {
          ibakedmodel = this.d.a().a(modelresourcelocation);
        }
      }
      a(stack, ibakedmodel, cameraTransformType);
    }
  }
  
  protected void a(zx stack, boq model, bgr.b cameraTransformType)
  {
    this.e.a(bmh.g);
    this.e.b(bmh.g).b(false, false);
    b(stack);
    bfl.B();
    bfl.a(516, 0.1F);
    bfl.l();
    bfl.a(770, 771, 1, 0);
    bfl.E();
    bgr itemcameratransforms = model.f();
    itemcameratransforms.a(cameraTransformType);
    if (a(itemcameratransforms.b(cameraTransformType))) {
      bfl.e(1028);
    }
    a(stack, model);
    bfl.e(1029);
    bfl.F();
    bfl.C();
    bfl.k();
    this.e.a(bmh.g);
    this.e.b(bmh.g).a();
  }
  
  private boolean a(bgq p_183005_1_)
  {
    return (p_183005_1_.d.x < 0.0F ? 1 : 0) ^ (p_183005_1_.d.y < 0.0F ? 1 : 0) ^ (p_183005_1_.d.z < 0.0F ? 1 : 0);
  }
  
  public void a(zx stack, int x, int y)
  {
    boq ibakedmodel = this.d.a(stack);
    bfl.E();
    this.e.a(bmh.g);
    this.e.b(bmh.g).b(false, false);
    bfl.B();
    bfl.d();
    bfl.a(516, 0.1F);
    bfl.l();
    bfl.b(770, 771);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    a(x, y, ibakedmodel.c());
    ibakedmodel.f().a(bgr.b.e);
    a(stack, ibakedmodel);
    bfl.c();
    bfl.C();
    bfl.f();
    bfl.F();
    this.e.a(bmh.g);
    this.e.b(bmh.g).a();
  }
  
  private void a(int xPosition, int yPosition, boolean isGui3d)
  {
    bfl.b(xPosition, yPosition, 100.0F + this.a);
    bfl.b(8.0F, 8.0F, 0.0F);
    bfl.a(1.0F, 1.0F, -1.0F);
    bfl.a(0.5F, 0.5F, 0.5F);
    if (isGui3d)
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
  
  public void b(final zx stack, int xPosition, int yPosition)
  {
    if ((stack != null) && (stack.b() != null))
    {
      this.a += 50.0F;
      try
      {
        a(stack, xPosition, yPosition);
      }
      catch (Throwable throwable)
      {
        b crashreport = b.a(throwable, "Rendering item");
        c crashreportcategory = crashreport.a("Item being rendered");
        crashreportcategory.a("Item Type", new Callable()
        {
          public String a()
            throws Exception
          {
            return String.valueOf(stack.b());
          }
        });
        crashreportcategory.a("Item Aux", new Callable()
        {
          public String a()
            throws Exception
          {
            return String.valueOf(stack.i());
          }
        });
        crashreportcategory.a("Item NBT", new Callable()
        {
          public String a()
            throws Exception
          {
            return String.valueOf(stack.o());
          }
        });
        crashreportcategory.a("Item Foil", new Callable()
        {
          public String a()
            throws Exception
          {
            return String.valueOf(stack.t());
          }
        });
        throw new e(crashreport);
      }
      this.a -= 50.0F;
    }
  }
  
  public void a(avn fr, zx stack, int xPosition, int yPosition)
  {
    a(fr, stack, xPosition, yPosition, (String)null);
  }
  
  public void a(avn fr, zx stack, int xPosition, int yPosition, String text)
  {
    if (stack != null)
    {
      if ((stack.b != 1) || (text != null))
      {
        String s = text == null ? String.valueOf(stack.b) : text;
        if ((text == null) && (stack.b < 1)) {
          s = a.m + String.valueOf(stack.b);
        }
        bfl.f();
        bfl.i();
        bfl.k();
        fr.a(s, xPosition + 19 - 2 - fr.a(s), yPosition + 6 + 3, 16777215);
        bfl.e();
        bfl.j();
      }
      if (stack.g())
      {
        int j = (int)Math.round(13.0D - stack.h() * 13.0D / stack.j());
        int i = (int)Math.round(255.0D - stack.h() * 255.0D / stack.j());
        bfl.f();
        bfl.i();
        bfl.x();
        bfl.c();
        bfl.k();
        bfx tessellator = bfx.a();
        bfd worldrenderer = tessellator.c();
        a(worldrenderer, xPosition + 2, yPosition + 13, 13, 2, 0, 0, 0, 255);
        a(worldrenderer, xPosition + 2, yPosition + 13, 12, 1, (255 - i) / 4, 64, 0, 255);
        a(worldrenderer, xPosition + 2, yPosition + 13, j, 1, 255 - i, i, 0, 255);
        bfl.l();
        bfl.d();
        bfl.w();
        bfl.e();
        bfl.j();
      }
    }
  }
  
  private void a(bfd p_181565_1_, int p_181565_2_, int p_181565_3_, int p_181565_4_, int p_181565_5_, int p_181565_6_, int p_181565_7_, int p_181565_8_, int p_181565_9_)
  {
    p_181565_1_.a(7, bms.f);
    p_181565_1_.b(p_181565_2_ + 0, p_181565_3_ + 0, 0.0D).b(p_181565_6_, p_181565_7_, p_181565_8_, p_181565_9_).d();
    p_181565_1_.b(p_181565_2_ + 0, p_181565_3_ + p_181565_5_, 0.0D).b(p_181565_6_, p_181565_7_, p_181565_8_, p_181565_9_).d();
    p_181565_1_.b(p_181565_2_ + p_181565_4_, p_181565_3_ + p_181565_5_, 0.0D).b(p_181565_6_, p_181565_7_, p_181565_8_, p_181565_9_).d();
    p_181565_1_.b(p_181565_2_ + p_181565_4_, p_181565_3_ + 0, 0.0D).b(p_181565_6_, p_181565_7_, p_181565_8_, p_181565_9_).d();
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
    this.d.a(zy.bz, new bfp()
    {
      public bov a(zx stack)
      {
        return aai.f(stack.i()) ? new bov("bottle_splash", "inventory") : new bov("bottle_drinkable", "inventory");
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
    this.d.a(zy.bJ, new bfp()
    {
      public bov a(zx stack)
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
    this.d.a(zy.cE, new bfp()
    {
      public bov a(zx stack)
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
    this.d.a(zy.cd, new bfp()
    {
      public bov a(zx stack)
      {
        return new bov("enchanted_book", "inventory");
      }
    });
    this.d.a(zy.bd, new bfp()
    {
      public bov a(zx stack)
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
  }
  
  public void a(bni resourceManager)
  {
    this.d.b();
  }
}
