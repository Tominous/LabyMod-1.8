import shadersmod.client.SVertexBuilder;

public class bgd
  implements bnj
{
  private bgc a;
  private final avh b;
  private final bgf c = new bgf();
  private final bgb d = new bgb();
  private final bge e = new bge();
  private static final String __OBFID = "CL_00002520";
  
  public bgd(bgc p_i46237_1_, avh p_i46237_2_)
  {
    a = p_i46237_1_;
    b = p_i46237_2_;
  }
  
  public bgc a()
  {
    return a;
  }
  
  public void a(alz p_175020_1_, cj p_175020_2_, bmi p_175020_3_, adq p_175020_4_)
  {
    afh var5 = p_175020_1_.c();
    int var6 = var5.b();
    if (var6 == 3)
    {
      p_175020_1_ = var5.a(p_175020_1_, p_175020_4_, p_175020_2_);
      boq var7 = a.b(p_175020_1_);
      if (Reflector.ISmartBlockModel.isInstance(var7))
      {
        alz extendedState = (alz)Reflector.call(var5, Reflector.ForgeBlock_getExtendedState, new Object[] { p_175020_1_, p_175020_4_, p_175020_2_ });
        for (adf layer : adf.values()) {
          if (Reflector.callBoolean(var5, Reflector.ForgeBlock_canRenderInLayer, new Object[] { layer }))
          {
            Reflector.callVoid(Reflector.ForgeHooksClient_setRenderLayer, new Object[] { layer });
            boq targetLayer = (boq)Reflector.call(var7, Reflector.ISmartBlockModel_handleBlockState, new Object[] { extendedState });
            boq damageModel = new bow.a(targetLayer, p_175020_3_).b();
            c.a(p_175020_4_, damageModel, p_175020_1_, p_175020_2_, bfx.a().c());
          }
        }
        return;
      }
      boq var8 = new bow.a(var7, p_175020_3_).b();
      c.a(p_175020_4_, var8, p_175020_1_, p_175020_2_, bfx.a().c());
    }
  }
  
  public boolean a(alz p_175018_1_, cj p_175018_2_, adq p_175018_3_, bfd p_175018_4_)
  {
    try
    {
      int var5 = p_175018_1_.c().b();
      if (var5 == -1) {
        return false;
      }
      switch (var5)
      {
      case 1: 
        if (Config.isShaders()) {
          SVertexBuilder.pushEntity(p_175018_1_, p_175018_2_, p_175018_3_, p_175018_4_);
        }
        boolean flag1 = e.a(p_175018_3_, p_175018_1_, p_175018_2_, p_175018_4_);
        if (Config.isShaders()) {
          SVertexBuilder.popEntity(p_175018_4_);
        }
        return flag1;
      case 2: 
        return false;
      case 3: 
        boq var9 = a(p_175018_1_, p_175018_3_, p_175018_2_);
        if (Config.isShaders()) {
          SVertexBuilder.pushEntity(p_175018_1_, p_175018_2_, p_175018_3_, p_175018_4_);
        }
        boolean flag3 = c.a(p_175018_3_, var9, p_175018_1_, p_175018_2_, p_175018_4_);
        if (Config.isShaders()) {
          SVertexBuilder.popEntity(p_175018_4_);
        }
        return flag3;
      }
      return false;
    }
    catch (Throwable var8)
    {
      b var6 = b.a(var8, "Tesselating block in world");
      c var7 = var6.a("Block being tesselated");
      c.a(var7, p_175018_2_, p_175018_1_.c(), p_175018_1_.c().c(p_175018_1_));
      throw new e(var6);
    }
  }
  
  public bgf b()
  {
    return c;
  }
  
  private boq a(alz p_175017_1_, cj p_175017_2_)
  {
    boq var3 = a.b(p_175017_1_);
    if ((p_175017_2_ != null) && (b.v) && ((var3 instanceof box))) {
      var3 = ((box)var3).a(ns.a(p_175017_2_));
    }
    return var3;
  }
  
  public boq a(alz p_175022_1_, adq p_175022_2_, cj p_175022_3_)
  {
    afh var4 = p_175022_1_.c();
    if (p_175022_2_.G() != adr.g) {
      try
      {
        p_175022_1_ = var4.a(p_175022_1_, p_175022_2_, p_175022_3_);
      }
      catch (Exception var6) {}
    }
    boq var5 = a.b(p_175022_1_);
    if ((p_175022_3_ != null) && (b.v) && ((var5 instanceof box))) {
      var5 = ((box)var5).a(ns.a(p_175022_3_));
    }
    if (Reflector.ISmartBlockModel.isInstance(var5))
    {
      alz extendedState = (alz)Reflector.call(var4, Reflector.ForgeBlock_getExtendedState, new Object[] { p_175022_1_, p_175022_2_, p_175022_3_ });
      var5 = (boq)Reflector.call(var5, Reflector.ISmartBlockModel_handleBlockState, new Object[] { extendedState });
    }
    return var5;
  }
  
  public void a(alz p_175016_1_, float p_175016_2_)
  {
    int var3 = p_175016_1_.c().b();
    if (var3 != -1) {
      switch (var3)
      {
      case 1: 
      default: 
        break;
      case 2: 
        d.a(p_175016_1_.c(), p_175016_2_);
        break;
      case 3: 
        boq var4 = a(p_175016_1_, (cj)null);
        c.a(var4, p_175016_1_, p_175016_2_, true);
      }
    }
  }
  
  public boolean a(afh p_175021_1_, int p_175021_2_)
  {
    if (p_175021_1_ == null) {
      return false;
    }
    int var3 = p_175021_1_.b();
    return var3 != 3;
  }
  
  public void a(bni resourceManager)
  {
    e.a();
  }
}
