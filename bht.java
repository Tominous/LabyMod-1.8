import com.google.common.collect.Sets;
import java.nio.FloatBuffer;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import shadersmod.client.SVertexBuilder;

public class bht
{
  private adm d;
  private final bfr e;
  public static int a;
  private cj f;
  public bhq b;
  private final ReentrantLock g;
  private final ReentrantLock h;
  private bhn i;
  private final Set j;
  private final int k;
  private final FloatBuffer l;
  private final bmt[] m;
  public aug c;
  private int n;
  private boolean o;
  private EnumMap p;
  private static final String __OBFID = "CL_00002452";
  private cj[] positionOffsets16 = new cj[cq.n.length];
  private static adf[] ENUM_WORLD_BLOCK_LAYERS = ;
  private adf[] blockLayersSingle = new adf[1];
  private boolean fixBlockLayer = (Config.isMipmaps()) && (!Reflector.BetterFoliageClient.exists());
  
  public bht(adm worldIn, bfr renderGlobalIn, cj blockPosIn, int indexIn)
  {
    this.b = bhq.a;
    this.g = new ReentrantLock();
    this.h = new ReentrantLock();
    this.i = null;
    this.j = Sets.newHashSet();
    this.l = avd.h(16);
    this.m = new bmt[adf.values().length];
    this.n = -1;
    this.o = true;
    
    this.d = worldIn;
    this.e = renderGlobalIn;
    this.k = indexIn;
    if (!blockPosIn.equals(j())) {
      a(blockPosIn);
    }
    if (bqs.f()) {
      for (int var5 = 0; var5 < adf.values().length; var5++) {
        this.m[var5] = new bmt(bms.a);
      }
    }
  }
  
  public boolean a(int frameIndexIn)
  {
    if (this.n == frameIndexIn) {
      return false;
    }
    this.n = frameIndexIn;
    return true;
  }
  
  public bmt b(int p_178565_1_)
  {
    return this.m[p_178565_1_];
  }
  
  public void a(cj p_178576_1_)
  {
    h();
    this.f = p_178576_1_;
    this.c = new aug(p_178576_1_, p_178576_1_.a(16, 16, 16));
    
    m();
    for (int i = 0; i < this.positionOffsets16.length; i++) {
      this.positionOffsets16[i] = null;
    }
  }
  
  public void a(float p_178570_1_, float p_178570_2_, float p_178570_3_, bhn p_178570_4_)
  {
    bhq var5 = p_178570_4_.c();
    if ((var5.c() != null) && (!var5.b(adf.d)))
    {
      bfd worldRenderer = p_178570_4_.d().a(adf.d);
      
      a(worldRenderer, this.f);
      
      worldRenderer.a(var5.c());
      
      a(adf.d, p_178570_1_, p_178570_2_, p_178570_3_, worldRenderer, var5);
    }
  }
  
  public void b(float p_178581_1_, float p_178581_2_, float p_178581_3_, bhn p_178581_4_)
  {
    bhq var5 = new bhq();
    boolean var6 = true;
    cj var7 = this.f;
    cj var8 = var7.a(15, 15, 15);
    p_178581_4_.f().lock();
    bff var9;
    try
    {
      if (p_178581_4_.a() != bhn.a.b) {
        return;
      }
      if (this.d == null) {
        return;
      }
      var9 = createRegionRenderCache(this.d, var7.a(-1, -1, -1), var8.a(1, 1, 1), 1);
      p_178581_4_.a(var5);
    }
    finally
    {
      p_178581_4_.f().unlock();
    }
    bhw var10 = new bhw();
    HashSet var11 = Sets.newHashSet();
    if (!var9.W())
    {
      a += 1;
      boolean[] var12 = new boolean[adf.values().length];
      bgd var13 = ave.A().ae();
      
      Iterator var14 = BlockPosM.getAllInBoxMutable(var7, var8).iterator();
      
      boolean forgeHasTileEntityExists = Reflector.ForgeBlock_hasTileEntity.exists();
      boolean forgeBlockCanRenderInLayerExists = Reflector.ForgeBlock_canRenderInLayer.exists();
      boolean forgeHooksSetRenderLayerExists = Reflector.ForgeHooksClient_setRenderLayer.exists();
      while (var14.hasNext())
      {
        BlockPosM var15 = (BlockPosM)var14.next();
        alz var16 = var9.p(var15);
        afh var17 = var16.c();
        if (var17.c()) {
          var10.a(var15);
        }
        boolean hasTileEntity;
        boolean hasTileEntity;
        if (forgeHasTileEntityExists) {
          hasTileEntity = Reflector.callBoolean(var17, Reflector.ForgeBlock_hasTileEntity, new Object[] { var16 });
        } else {
          hasTileEntity = var17.z();
        }
        if (hasTileEntity)
        {
          akw var18 = var9.s(new cj(var15));
          bhd var19 = bhc.a.b(var18);
          if ((var18 != null) && (var19 != null))
          {
            var5.a(var18);
            if (var19.a()) {
              var11.add(var18);
            }
          }
        }
        adf[] blockLayers;
        adf[] blockLayers;
        if (forgeBlockCanRenderInLayerExists)
        {
          blockLayers = ENUM_WORLD_BLOCK_LAYERS;
        }
        else
        {
          blockLayers = this.blockLayersSingle;
          blockLayers[0] = var17.m();
        }
        for (int i = 0; i < blockLayers.length; i++)
        {
          adf var34 = blockLayers[i];
          if (forgeBlockCanRenderInLayerExists)
          {
            boolean canRenderInLayer = Reflector.callBoolean(var17, Reflector.ForgeBlock_canRenderInLayer, new Object[] { var34 });
            if (!canRenderInLayer) {}
          }
          else
          {
            var34 = fixBlockLayer(var17, var34);
            if (forgeHooksSetRenderLayerExists) {
              Reflector.callVoid(Reflector.ForgeHooksClient_setRenderLayer, new Object[] { var34 });
            }
            int var35 = var34.ordinal();
            if (var17.b() != -1)
            {
              bfd var20 = p_178581_4_.d().a(var35);
              
              var20.setBlockLayer(var34);
              if (!var5.d(var34))
              {
                var5.c(var34);
                a(var20, var7);
              }
              var12[var35] |= var13.a(var16, var15, var9, var20);
            }
          }
        }
      }
      adf[] var30 = adf.values();
      int var31 = var30.length;
      for (int var32 = 0; var32 < var31; var32++)
      {
        adf var33 = var30[var32];
        if (var12[var33.ordinal()] != 0) {
          var5.a(var33);
        }
        if (var5.d(var33))
        {
          if (Config.isShaders()) {
            SVertexBuilder.calcNormalChunkLayer(p_178581_4_.d().a(var33));
          }
          a(var33, p_178581_1_, p_178581_2_, p_178581_3_, p_178581_4_.d().a(var33), var5);
        }
      }
    }
    var5.a(var10.a());
    this.g.lock();
    try
    {
      HashSet var28 = Sets.newHashSet(var11);
      HashSet var29 = Sets.newHashSet(this.j);
      var28.removeAll(this.j);
      var29.removeAll(var11);
      this.j.clear();
      this.j.addAll(var11);
      this.e.a(var29, var28);
    }
    finally
    {
      this.g.unlock();
    }
  }
  
  protected void b()
  {
    this.g.lock();
    try
    {
      if ((this.i != null) && (this.i.a() != bhn.a.d))
      {
        this.i.e();
        this.i = null;
      }
    }
    finally
    {
      this.g.unlock();
    }
  }
  
  public ReentrantLock c()
  {
    return this.g;
  }
  
  public bhn d()
  {
    this.g.lock();
    bhn var1;
    try
    {
      b();
      this.i = new bhn(this, bhn.b.a);
      var1 = this.i;
    }
    finally
    {
      this.g.unlock();
    }
    return var1;
  }
  
  public bhn e()
  {
    this.g.lock();
    bhn var1;
    try
    {
      if ((this.i == null) || (this.i.a() != bhn.a.a))
      {
        if ((this.i != null) && (this.i.a() != bhn.a.d))
        {
          this.i.e();
          this.i = null;
        }
        this.i = new bhn(this, bhn.b.b);
        this.i.a(this.b);
        bhn var1 = this.i;
        return var1;
      }
      var1 = null;
    }
    finally
    {
      this.g.unlock();
    }
    return var1;
  }
  
  private void a(bfd p_178573_1_, cj p_178573_2_)
  {
    p_178573_1_.a(7, bms.a);
    p_178573_1_.c(-p_178573_2_.n(), -p_178573_2_.o(), -p_178573_2_.p());
  }
  
  private void a(adf p_178584_1_, float p_178584_2_, float p_178584_3_, float p_178584_4_, bfd p_178584_5_, bhq p_178584_6_)
  {
    if ((p_178584_1_ == adf.d) && (!p_178584_6_.b(p_178584_1_)))
    {
      p_178584_5_.a(p_178584_2_, p_178584_3_, p_178584_4_);
      p_178584_6_.a(p_178584_5_.a());
    }
    p_178584_5_.e();
  }
  
  private void m()
  {
    bfl.E();
    bfl.D();
    float var1 = 1.000001F;
    bfl.b(-8.0F, -8.0F, -8.0F);
    bfl.a(var1, var1, var1);
    bfl.b(8.0F, 8.0F, 8.0F);
    bfl.a(2982, this.l);
    bfl.F();
  }
  
  public void f()
  {
    bfl.a(this.l);
  }
  
  public bhq g()
  {
    return this.b;
  }
  
  public void a(bhq p_178580_1_)
  {
    this.h.lock();
    try
    {
      this.b = p_178580_1_;
    }
    finally
    {
      this.h.unlock();
    }
  }
  
  public void h()
  {
    b();
    this.b = bhq.a;
  }
  
  public void a()
  {
    h();
    this.d = null;
    for (int var1 = 0; var1 < adf.values().length; var1++) {
      if (this.m[var1] != null) {
        this.m[var1].c();
      }
    }
  }
  
  public cj j()
  {
    return this.f;
  }
  
  public void a(boolean p_178575_1_)
  {
    this.o = p_178575_1_;
  }
  
  public boolean l()
  {
    return this.o;
  }
  
  public cj a(cq p_500163_1_)
  {
    return getPositionOffset16(p_500163_1_);
  }
  
  public cj getPositionOffset16(cq facing)
  {
    int index = facing.a();
    cj posOffset = this.positionOffsets16[index];
    if (posOffset == null)
    {
      posOffset = j().a(facing, 16);
      this.positionOffsets16[index] = posOffset;
    }
    return posOffset;
  }
  
  protected bff createRegionRenderCache(adm world, cj from, cj to, int subtract)
  {
    return new bff(world, from, to, subtract);
  }
  
  private adf fixBlockLayer(afh block, adf layer)
  {
    if (!this.fixBlockLayer) {
      return layer;
    }
    if (layer == adf.c)
    {
      if ((block instanceof ajb)) {
        return layer;
      }
      if ((block instanceof afo)) {
        return layer;
      }
      return adf.b;
    }
    return layer;
  }
}