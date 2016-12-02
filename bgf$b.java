import java.util.BitSet;

public class bgf$b
{
  private final float[] b = new float[4];
  private final int[] c = new int[4];
  private static final String __OBFID = "CL_00002515";
  
  public bgf$b(bgf bmr) {}
  
  public bgf$b() {}
  
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
