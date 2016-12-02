import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public class bgf
{
  private static final String __OBFID = "CL_00002518";
  private static float aoLightValueOpaque = 0.2F;
  
  public static void updateAoLightValue()
  {
    aoLightValueOpaque = 1.0F - Config.getAmbientOcclusionLevel() * 0.8F;
  }
  
  public boolean a(adq blockAccessIn, boq modelIn, alz blockStateIn, cj blockPosIn, bfd worldRendererIn)
  {
    afh var6 = blockStateIn.c();
    var6.a(blockAccessIn, blockPosIn);
    return a(blockAccessIn, modelIn, blockStateIn, blockPosIn, worldRendererIn, true);
  }
  
  public boolean a(adq blockAccessIn, boq modelIn, alz blockStateIn, cj blockPosIn, bfd worldRendererIn, boolean checkSides)
  {
    boolean var7 = (ave.x()) && (blockStateIn.c().r() == 0) && (modelIn.b());
    try
    {
      afh var8 = blockStateIn.c();
      
      return var7 ? renderModelAmbientOcclusion(blockAccessIn, modelIn, var8, blockStateIn, blockPosIn, worldRendererIn, checkSides) : renderModelStandard(blockAccessIn, modelIn, var8, blockStateIn, blockPosIn, worldRendererIn, checkSides);
    }
    catch (Throwable var11)
    {
      b var9 = b.a(var11, "Tesselating block model");
      c var10 = var9.a("Block model being tesselated");
      c.a(var10, blockPosIn, blockStateIn);
      var10.a("Using AO", Boolean.valueOf(var7));
      throw new e(var9);
    }
  }
  
  public boolean a(adq blockAccessIn, boq modelIn, afh blockIn, cj blockPosIn, bfd worldRendererIn, boolean checkSides)
  {
    return renderModelAmbientOcclusion(blockAccessIn, modelIn, blockIn, blockAccessIn.p(blockPosIn), blockPosIn, worldRendererIn, checkSides);
  }
  
  public boolean renderModelAmbientOcclusion(adq blockAccessIn, boq modelIn, afh blockIn, alz blockStateIn, cj blockPosIn, bfd worldRendererIn, boolean checkSides)
  {
    boolean var7 = false;
    
    RenderEnv renderEnv = null;
    
    cq[] var11 = cq.n;
    int var12 = var11.length;
    for (int var13 = 0; var13 < var12; var13++)
    {
      cq var14 = var11[var13];
      List var15 = modelIn.a(var14);
      if (!var15.isEmpty())
      {
        cj var16 = blockPosIn.a(var14);
        if ((!checkSides) || (blockIn.a(blockAccessIn, var16, var14)))
        {
          if (renderEnv == null) {
            renderEnv = RenderEnv.getInstance(blockAccessIn, blockStateIn, blockPosIn);
          }
          if (!renderEnv.isBreakingAnimation(var15)) {
            if (Config.isBetterGrass()) {
              var15 = BetterGrass.getFaceQuads(blockAccessIn, blockIn, blockPosIn, var14, var15);
            }
          }
          renderModelAmbientOcclusionQuads(blockAccessIn, blockIn, blockPosIn, worldRendererIn, var15, renderEnv);
          var7 = true;
        }
      }
    }
    List var17 = modelIn.a();
    if (var17.size() > 0)
    {
      if (renderEnv == null) {
        renderEnv = RenderEnv.getInstance(blockAccessIn, blockStateIn, blockPosIn);
      }
      renderModelAmbientOcclusionQuads(blockAccessIn, blockIn, blockPosIn, worldRendererIn, var17, renderEnv);
      var7 = true;
    }
    if ((renderEnv != null) && (Config.isBetterSnow()) && (!renderEnv.isBreakingAnimation())) {
      if (BetterSnow.shouldRender(blockAccessIn, blockIn, blockStateIn, blockPosIn))
      {
        boq modelSnow = BetterSnow.getModelSnowLayer();
        alz stateSnow = BetterSnow.getStateSnowLayer();
        renderModelAmbientOcclusion(blockAccessIn, modelSnow, stateSnow.c(), stateSnow, blockPosIn, worldRendererIn, true);
      }
    }
    return var7;
  }
  
  public boolean b(adq blockAccessIn, boq modelIn, afh blockIn, cj blockPosIn, bfd worldRendererIn, boolean checkSides)
  {
    return renderModelStandard(blockAccessIn, modelIn, blockIn, blockAccessIn.p(blockPosIn), blockPosIn, worldRendererIn, checkSides);
  }
  
  public boolean renderModelStandard(adq blockAccessIn, boq modelIn, afh blockIn, alz blockStateIn, cj blockPosIn, bfd worldRendererIn, boolean checkSides)
  {
    boolean var7 = false;
    
    RenderEnv renderEnv = null;
    
    cq[] var9 = cq.n;
    int var10 = var9.length;
    for (int var11 = 0; var11 < var10; var11++)
    {
      cq var12 = var9[var11];
      List var13 = modelIn.a(var12);
      if (!var13.isEmpty())
      {
        cj var14 = blockPosIn.a(var12);
        if ((!checkSides) || (blockIn.a(blockAccessIn, var14, var12)))
        {
          if (renderEnv == null) {
            renderEnv = RenderEnv.getInstance(blockAccessIn, blockStateIn, blockPosIn);
          }
          if (!renderEnv.isBreakingAnimation(var13)) {
            if (Config.isBetterGrass()) {
              var13 = BetterGrass.getFaceQuads(blockAccessIn, blockIn, blockPosIn, var12, var13);
            }
          }
          int var15 = blockIn.c(blockAccessIn, var14);
          
          renderModelStandardQuads(blockAccessIn, blockIn, blockPosIn, var12, var15, false, worldRendererIn, var13, renderEnv);
          var7 = true;
        }
      }
    }
    List var16 = modelIn.a();
    if (var16.size() > 0)
    {
      if (renderEnv == null) {
        renderEnv = RenderEnv.getInstance(blockAccessIn, blockStateIn, blockPosIn);
      }
      renderModelStandardQuads(blockAccessIn, blockIn, blockPosIn, (cq)null, -1, true, worldRendererIn, var16, renderEnv);
      var7 = true;
    }
    if ((renderEnv != null) && (Config.isBetterSnow()) && (!renderEnv.isBreakingAnimation())) {
      if (BetterSnow.shouldRender(blockAccessIn, blockIn, blockStateIn, blockPosIn)) {
        if (BetterSnow.shouldRender(blockAccessIn, blockIn, blockStateIn, blockPosIn))
        {
          boq modelSnow = BetterSnow.getModelSnowLayer();
          alz stateSnow = BetterSnow.getStateSnowLayer();
          renderModelStandard(blockAccessIn, modelSnow, stateSnow.c(), stateSnow, blockPosIn, worldRendererIn, true);
        }
      }
    }
    return var7;
  }
  
  private void renderModelAmbientOcclusionQuads(adq blockAccessIn, afh blockIn, cj blockPosIn, bfd worldRendererIn, List listQuadsIn, RenderEnv renderEnv)
  {
    float[] quadBounds = renderEnv.getQuadBounds();
    BitSet boundsFlags = renderEnv.getBoundsFlags();
    bgf.b aoFaceIn = renderEnv.getAoFace();
    alz blockStateIn = renderEnv.getBlockState();
    
    double var9 = blockPosIn.n();
    double var11 = blockPosIn.o();
    double var13 = blockPosIn.p();
    afh.a var15 = blockIn.R();
    if (var15 != afh.a.a)
    {
      long var16 = ns.a(blockPosIn);
      var9 += ((float)(var16 >> 16 & 0xF) / 15.0F - 0.5D) * 0.5D;
      var13 += ((float)(var16 >> 24 & 0xF) / 15.0F - 0.5D) * 0.5D;
      if (var15 == afh.a.c) {
        var11 += ((float)(var16 >> 20 & 0xF) / 15.0F - 1.0D) * 0.2D;
      }
    }
    for (Iterator var22 = listQuadsIn.iterator(); var22.hasNext(); worldRendererIn.a(var9, var11, var13))
    {
      bgg var17 = (bgg)var22.next();
      if (!renderEnv.isBreakingAnimation(var17))
      {
        bgg quad = var17;
        if (Config.isConnectedTextures()) {
          var17 = ConnectedTextures.getConnectedTexture(blockAccessIn, blockStateIn, blockPosIn, var17, renderEnv);
        }
        if ((var17 == quad) && (Config.isNaturalTextures())) {
          var17 = NaturalTextures.getNaturalTexture(blockPosIn, var17);
        }
      }
      a(blockIn, var17.a(), var17.d(), quadBounds, boundsFlags);
      aoFaceIn.a(blockAccessIn, blockIn, blockPosIn, var17.d(), quadBounds, boundsFlags);
      if (worldRendererIn.isMultiTexture())
      {
        worldRendererIn.a(var17.getVertexDataSingle());
        worldRendererIn.putSprite(var17.getSprite());
      }
      else
      {
        worldRendererIn.a(var17.a());
      }
      worldRendererIn.a(bgf.b.a(aoFaceIn)[0], bgf.b.a(aoFaceIn)[1], bgf.b.a(aoFaceIn)[2], bgf.b.a(aoFaceIn)[3]);
      
      int colorMultiplier = CustomColorizer.getColorMultiplier(var17, blockIn, blockAccessIn, blockPosIn, renderEnv);
      if ((var17.b()) || (colorMultiplier >= 0))
      {
        int var18;
        int var18;
        if (colorMultiplier >= 0) {
          var18 = colorMultiplier;
        } else {
          var18 = blockIn.a(blockAccessIn, blockPosIn, var17.c());
        }
        if (bfk.a) {
          var18 = bml.c(var18);
        }
        float var19 = (var18 >> 16 & 0xFF) / 255.0F;
        float var20 = (var18 >> 8 & 0xFF) / 255.0F;
        float var21 = (var18 & 0xFF) / 255.0F;
        worldRendererIn.a(bgf.b.b(aoFaceIn)[0] * var19, bgf.b.b(aoFaceIn)[0] * var20, bgf.b.b(aoFaceIn)[0] * var21, 4);
        worldRendererIn.a(bgf.b.b(aoFaceIn)[1] * var19, bgf.b.b(aoFaceIn)[1] * var20, bgf.b.b(aoFaceIn)[1] * var21, 3);
        worldRendererIn.a(bgf.b.b(aoFaceIn)[2] * var19, bgf.b.b(aoFaceIn)[2] * var20, bgf.b.b(aoFaceIn)[2] * var21, 2);
        worldRendererIn.a(bgf.b.b(aoFaceIn)[3] * var19, bgf.b.b(aoFaceIn)[3] * var20, bgf.b.b(aoFaceIn)[3] * var21, 1);
      }
      else
      {
        worldRendererIn.a(bgf.b.b(aoFaceIn)[0], bgf.b.b(aoFaceIn)[0], bgf.b.b(aoFaceIn)[0], 4);
        worldRendererIn.a(bgf.b.b(aoFaceIn)[1], bgf.b.b(aoFaceIn)[1], bgf.b.b(aoFaceIn)[1], 3);
        worldRendererIn.a(bgf.b.b(aoFaceIn)[2], bgf.b.b(aoFaceIn)[2], bgf.b.b(aoFaceIn)[2], 2);
        worldRendererIn.a(bgf.b.b(aoFaceIn)[3], bgf.b.b(aoFaceIn)[3], bgf.b.b(aoFaceIn)[3], 1);
      }
    }
  }
  
  private void a(afh blockIn, int[] vertexData, cq facingIn, float[] quadBounds, BitSet boundsFlags)
  {
    float var6 = 32.0F;
    float var7 = 32.0F;
    float var8 = 32.0F;
    float var9 = -32.0F;
    float var10 = -32.0F;
    float var11 = -32.0F;
    
    int step = vertexData.length / 4;
    for (int var12 = 0; var12 < 4; var12++)
    {
      float var13 = Float.intBitsToFloat(vertexData[(var12 * step)]);
      float var14 = Float.intBitsToFloat(vertexData[(var12 * step + 1)]);
      float var15 = Float.intBitsToFloat(vertexData[(var12 * step + 2)]);
      
      var6 = Math.min(var6, var13);
      var7 = Math.min(var7, var14);
      var8 = Math.min(var8, var15);
      var9 = Math.max(var9, var13);
      var10 = Math.max(var10, var14);
      var11 = Math.max(var11, var15);
    }
    if (quadBounds != null)
    {
      quadBounds[cq.e.a()] = var6;
      quadBounds[cq.f.a()] = var9;
      quadBounds[cq.a.a()] = var7;
      quadBounds[cq.b.a()] = var10;
      quadBounds[cq.c.a()] = var8;
      quadBounds[cq.d.a()] = var11;
      
      quadBounds[(cq.e.a() + cq.n.length)] = (1.0F - var6);
      quadBounds[(cq.f.a() + cq.n.length)] = (1.0F - var9);
      quadBounds[(cq.a.a() + cq.n.length)] = (1.0F - var7);
      quadBounds[(cq.b.a() + cq.n.length)] = (1.0F - var10);
      quadBounds[(cq.c.a() + cq.n.length)] = (1.0F - var8);
      quadBounds[(cq.d.a() + cq.n.length)] = (1.0F - var11);
    }
    float var16 = 1.0E-4F;
    float var13 = 0.9999F;
    switch (bgf.1.a[facingIn.ordinal()])
    {
    case 1: 
      boundsFlags.set(1, (var6 >= 1.0E-4F) || (var8 >= 1.0E-4F) || (var9 <= 0.9999F) || (var11 <= 0.9999F));
      boundsFlags.set(0, ((var7 < 1.0E-4F) || (blockIn.d())) && (var7 == var10));
      break;
    case 2: 
      boundsFlags.set(1, (var6 >= 1.0E-4F) || (var8 >= 1.0E-4F) || (var9 <= 0.9999F) || (var11 <= 0.9999F));
      boundsFlags.set(0, ((var10 > 0.9999F) || (blockIn.d())) && (var7 == var10));
      break;
    case 3: 
      boundsFlags.set(1, (var6 >= 1.0E-4F) || (var7 >= 1.0E-4F) || (var9 <= 0.9999F) || (var10 <= 0.9999F));
      boundsFlags.set(0, ((var8 < 1.0E-4F) || (blockIn.d())) && (var8 == var11));
      break;
    case 4: 
      boundsFlags.set(1, (var6 >= 1.0E-4F) || (var7 >= 1.0E-4F) || (var9 <= 0.9999F) || (var10 <= 0.9999F));
      boundsFlags.set(0, ((var11 > 0.9999F) || (blockIn.d())) && (var8 == var11));
      break;
    case 5: 
      boundsFlags.set(1, (var7 >= 1.0E-4F) || (var8 >= 1.0E-4F) || (var10 <= 0.9999F) || (var11 <= 0.9999F));
      boundsFlags.set(0, ((var6 < 1.0E-4F) || (blockIn.d())) && (var6 == var9));
      break;
    case 6: 
      boundsFlags.set(1, (var7 >= 1.0E-4F) || (var8 >= 1.0E-4F) || (var10 <= 0.9999F) || (var11 <= 0.9999F));
      boundsFlags.set(0, ((var9 > 0.9999F) || (blockIn.d())) && (var6 == var9));
    }
  }
  
  private void renderModelStandardQuads(adq blockAccessIn, afh blockIn, cj blockPosIn, cq faceIn, int brightnessIn, boolean ownBrightness, bfd worldRendererIn, List listQuadsIn, RenderEnv renderEnv)
  {
    BitSet boundsFlags = renderEnv.getBoundsFlags();
    alz blockStateIn = renderEnv.getBlockState();
    
    double var10 = blockPosIn.n();
    double var12 = blockPosIn.o();
    double var14 = blockPosIn.p();
    afh.a var16 = blockIn.R();
    if (var16 != afh.a.a)
    {
      int var17 = blockPosIn.n();
      int var18 = blockPosIn.p();
      long var19 = var17 * 3129871 ^ var18 * 116129781L;
      var19 = var19 * var19 * 42317861L + var19 * 11L;
      var10 += ((float)(var19 >> 16 & 0xF) / 15.0F - 0.5D) * 0.5D;
      var14 += ((float)(var19 >> 24 & 0xF) / 15.0F - 0.5D) * 0.5D;
      if (var16 == afh.a.c) {
        var12 += ((float)(var19 >> 20 & 0xF) / 15.0F - 1.0D) * 0.2D;
      }
    }
    for (Iterator var23 = listQuadsIn.iterator(); var23.hasNext(); worldRendererIn.a(var10, var12, var14))
    {
      bgg var24 = (bgg)var23.next();
      if (!renderEnv.isBreakingAnimation(var24))
      {
        bgg quad = var24;
        if (Config.isConnectedTextures()) {
          var24 = ConnectedTextures.getConnectedTexture(blockAccessIn, blockStateIn, blockPosIn, var24, renderEnv);
        }
        if ((var24 == quad) && (Config.isNaturalTextures())) {
          var24 = NaturalTextures.getNaturalTexture(blockPosIn, var24);
        }
      }
      if (ownBrightness)
      {
        a(blockIn, var24.a(), var24.d(), (float[])null, boundsFlags);
        brightnessIn = boundsFlags.get(0) ? blockIn.c(blockAccessIn, blockPosIn.a(var24.d())) : blockIn.c(blockAccessIn, blockPosIn);
      }
      if (worldRendererIn.isMultiTexture())
      {
        worldRendererIn.a(var24.getVertexDataSingle());
        worldRendererIn.putSprite(var24.getSprite());
      }
      else
      {
        worldRendererIn.a(var24.a());
      }
      worldRendererIn.a(brightnessIn, brightnessIn, brightnessIn, brightnessIn);
      
      int colorMultiplier = CustomColorizer.getColorMultiplier(var24, blockIn, blockAccessIn, blockPosIn, renderEnv);
      if ((var24.b()) || (colorMultiplier >= 0))
      {
        int var25;
        int var25;
        if (colorMultiplier >= 0) {
          var25 = colorMultiplier;
        } else {
          var25 = blockIn.a(blockAccessIn, blockPosIn, var24.c());
        }
        if (bfk.a) {
          var25 = bml.c(var25);
        }
        float var20 = (var25 >> 16 & 0xFF) / 255.0F;
        float var21 = (var25 >> 8 & 0xFF) / 255.0F;
        float var22 = (var25 & 0xFF) / 255.0F;
        worldRendererIn.a(var20, var21, var22, 4);
        worldRendererIn.a(var20, var21, var22, 3);
        worldRendererIn.a(var20, var21, var22, 2);
        worldRendererIn.a(var20, var21, var22, 1);
      }
    }
  }
  
  public void a(boq p_178262_1_, float p_178262_2_, float p_178262_3_, float p_178262_4_, float p_178262_5_)
  {
    cq[] var6 = cq.n;
    int var7 = var6.length;
    for (int var8 = 0; var8 < var7; var8++)
    {
      cq var9 = var6[var8];
      a(p_178262_2_, p_178262_3_, p_178262_4_, p_178262_5_, p_178262_1_.a(var9));
    }
    a(p_178262_2_, p_178262_3_, p_178262_4_, p_178262_5_, p_178262_1_.a());
  }
  
  public void a(boq p_178266_1_, alz p_178266_2_, float p_178266_3_, boolean p_178266_4_)
  {
    afh var5 = p_178266_2_.c();
    var5.j();
    bfl.b(90.0F, 0.0F, 1.0F, 0.0F);
    int var6 = var5.h(var5.b(p_178266_2_));
    if (bfk.a) {
      var6 = bml.c(var6);
    }
    float var7 = (var6 >> 16 & 0xFF) / 255.0F;
    float var8 = (var6 >> 8 & 0xFF) / 255.0F;
    float var9 = (var6 & 0xFF) / 255.0F;
    if (!p_178266_4_) {
      bfl.c(p_178266_3_, p_178266_3_, p_178266_3_, 1.0F);
    }
    a(p_178266_1_, p_178266_3_, var7, var8, var9);
  }
  
  private void a(float p_178264_1_, float p_178264_2_, float p_178264_3_, float p_178264_4_, List p_178264_5_)
  {
    bfx var6 = bfx.a();
    bfd var7 = var6.c();
    Iterator var8 = p_178264_5_.iterator();
    while (var8.hasNext())
    {
      bgg var9 = (bgg)var8.next();
      var7.a(7, bms.b);
      var7.a(var9.a());
      if (var9.b()) {
        var7.d(p_178264_2_ * p_178264_1_, p_178264_3_ * p_178264_1_, p_178264_4_ * p_178264_1_);
      } else {
        var7.d(p_178264_1_, p_178264_1_, p_178264_1_);
      }
      df var10 = var9.d().m();
      var7.b(var10.n(), var10.o(), var10.p());
      var6.b();
    }
  }
  
  public static class b
  {
    private final float[] b = new float[4];
    private final int[] c = new int[4];
    private static final String __OBFID = "CL_00002515";
    
    public b(bgf bmr) {}
    
    public b() {}
    
    public void a(adq blockAccessIn, afh blockIn, cj blockPosIn, cq facingIn, float[] quadBounds, BitSet boundsFlags)
    {
      cj var7 = boundsFlags.get(0) ? blockPosIn.a(facingIn) : blockPosIn;
      bgf.a var8 = bgf.a.a(facingIn);
      cj var9 = var7.a(g[0]);
      cj var10 = var7.a(g[1]);
      cj var11 = var7.a(g[2]);
      cj var12 = var7.a(g[3]);
      int var13 = blockIn.c(blockAccessIn, var9);
      int var14 = blockIn.c(blockAccessIn, var10);
      int var15 = blockIn.c(blockAccessIn, var11);
      int var16 = blockIn.c(blockAccessIn, var12);
      
      float var17 = bgf.fixAoLightValue(blockAccessIn.p(var9).c().h());
      float var18 = bgf.fixAoLightValue(blockAccessIn.p(var10).c().h());
      float var19 = bgf.fixAoLightValue(blockAccessIn.p(var11).c().h());
      float var20 = bgf.fixAoLightValue(blockAccessIn.p(var12).c().h());
      
      boolean var21 = blockAccessIn.p(var9.a(facingIn)).c().q();
      boolean var22 = blockAccessIn.p(var10.a(facingIn)).c().q();
      boolean var23 = blockAccessIn.p(var11.a(facingIn)).c().q();
      boolean var24 = blockAccessIn.p(var12.a(facingIn)).c().q();
      int var29;
      float var25;
      int var29;
      if ((!var23) && (!var21))
      {
        float var25 = var17;
        var29 = var13;
      }
      else
      {
        cj var33 = var9.a(g[2]);
        
        var25 = bgf.fixAoLightValue(blockAccessIn.p(var33).c().h());
        var29 = blockIn.c(blockAccessIn, var33);
      }
      int var30;
      float var26;
      int var30;
      if ((!var24) && (!var21))
      {
        float var26 = var17;
        var30 = var13;
      }
      else
      {
        cj var33 = var9.a(g[3]);
        
        var26 = bgf.fixAoLightValue(blockAccessIn.p(var33).c().h());
        var30 = blockIn.c(blockAccessIn, var33);
      }
      int var31;
      float var27;
      int var31;
      if ((!var23) && (!var22))
      {
        float var27 = var18;
        var31 = var14;
      }
      else
      {
        cj var33 = var10.a(g[2]);
        
        var27 = bgf.fixAoLightValue(blockAccessIn.p(var33).c().h());
        var31 = blockIn.c(blockAccessIn, var33);
      }
      int var32;
      float var28;
      int var32;
      if ((!var24) && (!var22))
      {
        float var28 = var18;
        var32 = var14;
      }
      else
      {
        cj var33 = var10.a(g[3]);
        
        var28 = bgf.fixAoLightValue(blockAccessIn.p(var33).c().h());
        var32 = blockIn.c(blockAccessIn, var33);
      }
      int var60 = blockIn.c(blockAccessIn, blockPosIn);
      if ((boundsFlags.get(0)) || (!blockAccessIn.p(blockPosIn.a(facingIn)).c().c())) {
        var60 = blockIn.c(blockAccessIn, blockPosIn.a(facingIn));
      }
      float var34 = boundsFlags.get(0) ? blockAccessIn.p(var7).c().h() : blockAccessIn.p(blockPosIn).c().h();
      
      var34 = bgf.fixAoLightValue(var34);
      
      bgf.c var35 = bgf.c.a(facingIn);
      if ((boundsFlags.get(1)) && (i))
      {
        float var36 = (var20 + var17 + var26 + var34) * 0.25F;
        float var37 = (var19 + var17 + var25 + var34) * 0.25F;
        float var38 = (var19 + var18 + var27 + var34) * 0.25F;
        float var39 = (var20 + var18 + var28 + var34) * 0.25F;
        float var40 = quadBounds[j[0].m] * quadBounds[j[1].m];
        float var41 = quadBounds[j[2].m] * quadBounds[j[3].m];
        float var42 = quadBounds[j[4].m] * quadBounds[j[5].m];
        float var43 = quadBounds[j[6].m] * quadBounds[j[7].m];
        float var44 = quadBounds[k[0].m] * quadBounds[k[1].m];
        float var45 = quadBounds[k[2].m] * quadBounds[k[3].m];
        float var46 = quadBounds[k[4].m] * quadBounds[k[5].m];
        float var47 = quadBounds[k[6].m] * quadBounds[k[7].m];
        float var48 = quadBounds[l[0].m] * quadBounds[l[1].m];
        float var49 = quadBounds[l[2].m] * quadBounds[l[3].m];
        float var50 = quadBounds[l[4].m] * quadBounds[l[5].m];
        float var51 = quadBounds[l[6].m] * quadBounds[l[7].m];
        float var52 = quadBounds[m[0].m] * quadBounds[m[1].m];
        float var53 = quadBounds[m[2].m] * quadBounds[m[3].m];
        float var54 = quadBounds[m[4].m] * quadBounds[m[5].m];
        float var55 = quadBounds[m[6].m] * quadBounds[m[7].m];
        b[bgf.c.a(var35)] = (var36 * var40 + var37 * var41 + var38 * var42 + var39 * var43);
        b[bgf.c.b(var35)] = (var36 * var44 + var37 * var45 + var38 * var46 + var39 * var47);
        b[bgf.c.c(var35)] = (var36 * var48 + var37 * var49 + var38 * var50 + var39 * var51);
        b[bgf.c.d(var35)] = (var36 * var52 + var37 * var53 + var38 * var54 + var39 * var55);
        int var56 = a(var16, var13, var30, var60);
        int var57 = a(var15, var13, var29, var60);
        int var58 = a(var15, var14, var31, var60);
        int var59 = a(var16, var14, var32, var60);
        c[bgf.c.a(var35)] = a(var56, var57, var58, var59, var40, var41, var42, var43);
        c[bgf.c.b(var35)] = a(var56, var57, var58, var59, var44, var45, var46, var47);
        c[bgf.c.c(var35)] = a(var56, var57, var58, var59, var48, var49, var50, var51);
        c[bgf.c.d(var35)] = a(var56, var57, var58, var59, var52, var53, var54, var55);
      }
      else
      {
        float var36 = (var20 + var17 + var26 + var34) * 0.25F;
        float var37 = (var19 + var17 + var25 + var34) * 0.25F;
        float var38 = (var19 + var18 + var27 + var34) * 0.25F;
        float var39 = (var20 + var18 + var28 + var34) * 0.25F;
        c[bgf.c.a(var35)] = a(var16, var13, var30, var60);
        c[bgf.c.b(var35)] = a(var15, var13, var29, var60);
        c[bgf.c.c(var35)] = a(var15, var14, var31, var60);
        c[bgf.c.d(var35)] = a(var16, var14, var32, var60);
        b[bgf.c.a(var35)] = var36;
        b[bgf.c.b(var35)] = var37;
        b[bgf.c.c(var35)] = var38;
        b[bgf.c.d(var35)] = var39;
      }
    }
    
    private int a(int p_147778_1_, int p_147778_2_, int p_147778_3_, int p_147778_4_)
    {
      if (p_147778_1_ == 0) {
        p_147778_1_ = p_147778_4_;
      }
      if (p_147778_2_ == 0) {
        p_147778_2_ = p_147778_4_;
      }
      if (p_147778_3_ == 0) {
        p_147778_3_ = p_147778_4_;
      }
      return p_147778_1_ + p_147778_2_ + p_147778_3_ + p_147778_4_ >> 2 & 0xFF00FF;
    }
    
    private int a(int p_178203_1_, int p_178203_2_, int p_178203_3_, int p_178203_4_, float p_178203_5_, float p_178203_6_, float p_178203_7_, float p_178203_8_)
    {
      int var9 = (int)((p_178203_1_ >> 16 & 0xFF) * p_178203_5_ + (p_178203_2_ >> 16 & 0xFF) * p_178203_6_ + (p_178203_3_ >> 16 & 0xFF) * p_178203_7_ + (p_178203_4_ >> 16 & 0xFF) * p_178203_8_) & 0xFF;
      int var10 = (int)((p_178203_1_ & 0xFF) * p_178203_5_ + (p_178203_2_ & 0xFF) * p_178203_6_ + (p_178203_3_ & 0xFF) * p_178203_7_ + (p_178203_4_ & 0xFF) * p_178203_8_) & 0xFF;
      return var9 << 16 | var10;
    }
  }
  
  public static enum a
  {
    protected final cq[] g;
    protected final float h;
    protected final boolean i;
    protected final bgf.d[] j;
    protected final bgf.d[] k;
    protected final bgf.d[] l;
    protected final bgf.d[] m;
    private static final a[] n;
    private static final a[] o;
    private static final String __OBFID = "CL_00002516";
    
    private a(String p_i46236_1_, int p_i46236_2_, cq[] p_i46236_3_, float p_i46236_4_, boolean p_i46236_5_, bgf.d[] p_i46236_6_, bgf.d[] p_i46236_7_, bgf.d[] p_i46236_8_, bgf.d[] p_i46236_9_)
    {
      g = p_i46236_3_;
      h = p_i46236_4_;
      i = p_i46236_5_;
      j = p_i46236_6_;
      k = p_i46236_7_;
      l = p_i46236_8_;
      m = p_i46236_9_;
    }
    
    public static a a(cq p_178273_0_)
    {
      return n[p_178273_0_.a()];
    }
    
    static
    {
      n = new a[6];
      
      o = new a[] { a, b, c, d, e, f };
      
      n[cq.a.a()] = a;
      n[cq.b.a()] = b;
      n[cq.c.a()] = c;
      n[cq.d.a()] = d;
      n[cq.e.a()] = e;
      n[cq.f.a()] = f;
    }
  }
  
  public static enum d
  {
    protected final int m;
    private static final d[] n = { a, b, c, d, e, f, g, h, i, j, k, l };
    private static final String __OBFID = "CL_00002513";
    
    private d(String p_i46233_1_, int p_i46233_2_, cq p_i46233_3_, boolean p_i46233_4_)
    {
      m = (p_i46233_3_.a() + (p_i46233_4_ ? cq.values().length : 0));
    }
  }
  
  static enum c
  {
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private static final c[] k;
    private static final c[] l;
    private static final String __OBFID = "CL_00002514";
    
    private c(String p_i46234_1_, int p_i46234_2_, int p_i46234_3_, int p_i46234_4_, int p_i46234_5_, int p_i46234_6_)
    {
      g = p_i46234_3_;
      h = p_i46234_4_;
      i = p_i46234_5_;
      j = p_i46234_6_;
    }
    
    public static c a(cq p_178184_0_)
    {
      return k[p_178184_0_.a()];
    }
    
    static
    {
      k = new c[6];
      
      l = new c[] { a, b, c, d, e, f };
      
      k[cq.a.a()] = a;
      k[cq.b.a()] = b;
      k[cq.c.a()] = c;
      k[cq.d.a()] = d;
      k[cq.e.a()] = e;
      k[cq.f.a()] = f;
    }
  }
  
  public static float fixAoLightValue(float val)
  {
    if (val == 0.2F) {
      return aoLightValueOpaque;
    }
    return val;
  }
}
