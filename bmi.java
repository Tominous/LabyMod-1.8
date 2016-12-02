import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import shadersmod.client.ShadersTex;

public class bmi
{
  private final String j;
  protected List a = Lists.newArrayList();
  protected int[][] b;
  private boa k;
  protected boolean c;
  protected int d;
  protected int e;
  protected int f;
  protected int g;
  private float l;
  private float m;
  private float n;
  private float o;
  protected int h;
  protected int i;
  private static String p = "builtin/clock";
  private static String q = "builtin/compass";
  private static final String __OBFID = "CL_00001062";
  private int indexInMap = -1;
  public float baseU;
  public float baseV;
  public int sheetWidth;
  public int sheetHeight;
  public int glSpriteTextureId = -1;
  public bmi spriteSingle = null;
  public boolean isSpriteSingle = false;
  public int mipmapLevels = 0;
  
  private bmi(bmi parent)
  {
    j = j;
    isSpriteSingle = true;
  }
  
  protected bmi(String p_i1282_1_)
  {
    j = p_i1282_1_;
    if (Config.isMultiTexture()) {
      spriteSingle = new bmi(this);
    }
  }
  
  protected static bmi a(jy p_176604_0_)
  {
    String var1 = p_176604_0_.toString();
    return q.equals(var1) ? new bmp(var1) : p.equals(var1) ? new bmo(var1) : new bmi(var1);
  }
  
  public static void a(String p_176602_0_)
  {
    p = p_176602_0_;
  }
  
  public static void b(String p_176603_0_)
  {
    q = p_176603_0_;
  }
  
  public void a(int p_110971_1_, int p_110971_2_, int p_110971_3_, int p_110971_4_, boolean p_110971_5_)
  {
    d = p_110971_3_;
    e = p_110971_4_;
    c = p_110971_5_;
    float var6 = (float)(0.009999999776482582D / p_110971_1_);
    float var7 = (float)(0.009999999776482582D / p_110971_2_);
    l = (p_110971_3_ / (float)p_110971_1_ + var6);
    m = ((p_110971_3_ + f) / (float)p_110971_1_ - var6);
    n = (p_110971_4_ / p_110971_2_ + var7);
    o = ((p_110971_4_ + g) / p_110971_2_ - var7);
    
    baseU = Math.min(l, m);
    baseV = Math.min(n, o);
    if (spriteSingle != null) {
      spriteSingle.a(f, g, 0, 0, false);
    }
  }
  
  public void a(bmi p_94217_1_)
  {
    d = d;
    e = e;
    f = f;
    g = g;
    c = c;
    l = l;
    m = m;
    n = n;
    o = o;
    if (spriteSingle != null) {
      spriteSingle.a(f, g, 0, 0, false);
    }
  }
  
  public int a()
  {
    return d;
  }
  
  public int b()
  {
    return e;
  }
  
  public int c()
  {
    return f;
  }
  
  public int d()
  {
    return g;
  }
  
  public float e()
  {
    return l;
  }
  
  public float f()
  {
    return m;
  }
  
  public float a(double p_94214_1_)
  {
    float var3 = m - l;
    return l + var3 * (float)p_94214_1_ / 16.0F;
  }
  
  public float g()
  {
    return n;
  }
  
  public float h()
  {
    return o;
  }
  
  public float b(double p_94207_1_)
  {
    float var3 = o - n;
    return n + var3 * ((float)p_94207_1_ / 16.0F);
  }
  
  public String i()
  {
    return j;
  }
  
  public void j()
  {
    i += 1;
    if (i >= k.a(h))
    {
      int var1 = k.c(h);
      int var2 = k.c() == 0 ? a.size() : k.c();
      h = ((h + 1) % var2);
      i = 0;
      int var3 = k.c(h);
      
      boolean texBlur = false;
      boolean texClamp = isSpriteSingle;
      if ((var1 != var3) && (var3 >= 0) && (var3 < a.size())) {
        if (Config.isShaders()) {
          ShadersTex.uploadTexSub((int[][])a.get(var3), f, g, d, e, texBlur, texClamp);
        } else {
          bml.a((int[][])a.get(var3), f, g, d, e, texBlur, texClamp);
        }
      }
    }
    else if (k.e())
    {
      n();
    }
  }
  
  private void n()
  {
    double var1 = 1.0D - i / k.a(h);
    int var3 = k.c(h);
    int var4 = k.c() == 0 ? a.size() : k.c();
    int var5 = k.c((h + 1) % var4);
    if ((var3 != var5) && (var5 >= 0) && (var5 < a.size()))
    {
      int[][] var6 = (int[][])a.get(var3);
      int[][] var7 = (int[][])a.get(var5);
      if ((b == null) || (b.length != var6.length)) {
        b = new int[var6.length][];
      }
      for (int var8 = 0; var8 < var6.length; var8++)
      {
        if (b[var8] == null) {
          b[var8] = new int[var6[var8].length];
        }
        if ((var8 < var7.length) && (var7[var8].length == var6[var8].length)) {
          for (int var9 = 0; var9 < var6[var8].length; var9++)
          {
            int var10 = var6[var8][var9];
            int var11 = var7[var8][var9];
            int var12 = (int)(((var10 & 0xFF0000) >> 16) * var1 + ((var11 & 0xFF0000) >> 16) * (1.0D - var1));
            int var13 = (int)(((var10 & 0xFF00) >> 8) * var1 + ((var11 & 0xFF00) >> 8) * (1.0D - var1));
            int var14 = (int)((var10 & 0xFF) * var1 + (var11 & 0xFF) * (1.0D - var1));
            b[var8][var9] = (var10 & 0xFF000000 | var12 << 16 | var13 << 8 | var14);
          }
        }
      }
      bml.a(b, f, g, d, e, false, false);
    }
  }
  
  public int[][] a(int p_147965_1_)
  {
    return (int[][])a.get(p_147965_1_);
  }
  
  public int k()
  {
    return a.size();
  }
  
  public void b(int p_110966_1_)
  {
    f = p_110966_1_;
    if (spriteSingle != null) {
      spriteSingle.b(f);
    }
  }
  
  public void c(int p_110969_1_)
  {
    g = p_110969_1_;
    if (spriteSingle != null) {
      spriteSingle.c(g);
    }
  }
  
  public void a(BufferedImage[] p_180598_1_, boa p_180598_2_)
    throws IOException
  {
    o();
    int var3 = p_180598_1_[0].getWidth();
    int var4 = p_180598_1_[0].getHeight();
    f = var3;
    g = var4;
    int[][] var5 = new int[p_180598_1_.length][];
    for (int var6 = 0; var6 < p_180598_1_.length; var6++)
    {
      BufferedImage var7 = p_180598_1_[var6];
      if (var7 != null)
      {
        if ((var6 > 0) && ((var7.getWidth() != var3 >> var6) || (var7.getHeight() != var4 >> var6))) {
          throw new RuntimeException(String.format("Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", new Object[] { Integer.valueOf(var6), Integer.valueOf(var7.getWidth()), Integer.valueOf(var7.getHeight()), Integer.valueOf(var3 >> var6), Integer.valueOf(var4 >> var6) }));
        }
        var5[var6] = new int[var7.getWidth() * var7.getHeight()];
        var7.getRGB(0, 0, var7.getWidth(), var7.getHeight(), var5[var6], 0, var7.getWidth());
      }
    }
    if (p_180598_2_ == null)
    {
      if (var4 != var3) {
        throw new RuntimeException("broken aspect ratio and not an animation");
      }
      a.add(var5);
    }
    else
    {
      var6 = var4 / var3;
      int var11 = var3;
      int var8 = var3;
      g = f;
      if (p_180598_2_.c() > 0)
      {
        Iterator var9 = p_180598_2_.f().iterator();
        while (var9.hasNext())
        {
          int var10 = ((Integer)var9.next()).intValue();
          if (var10 >= var6) {
            throw new RuntimeException("invalid frameindex " + var10);
          }
          e(var10);
          a.set(var10, a(var5, var11, var8, var10));
        }
        k = p_180598_2_;
      }
      else
      {
        ArrayList var12 = Lists.newArrayList();
        for (int var10 = 0; var10 < var6; var10++)
        {
          a.add(a(var5, var11, var8, var10));
          var12.add(new bnz(var10, -1));
        }
        k = new boa(var12, f, g, p_180598_2_.d(), p_180598_2_.e());
      }
    }
    for (int i = 0; i < a.size(); i++)
    {
      int[][] datas = (int[][])a.get(i);
      if (datas != null) {
        if (!j.startsWith("minecraft:blocks/leaves_")) {
          for (int di = 0; di < datas.length; di++)
          {
            int[] data = datas[di];
            fixTransparentColor(data);
          }
        }
      }
    }
    if (spriteSingle != null) {
      spriteSingle.a(p_180598_1_, p_180598_2_);
    }
  }
  
  public void d(int p_147963_1_)
  {
    ArrayList var2 = Lists.newArrayList();
    for (int var3 = 0; var3 < a.size(); var3++)
    {
      final int[][] var4 = (int[][])a.get(var3);
      if (var4 != null) {
        try
        {
          var2.add(bml.a(p_147963_1_, f, var4));
        }
        catch (Throwable var8)
        {
          b var6 = b.a(var8, "Generating mipmaps for frame");
          c var7 = var6.a("Frame being iterated");
          var7.a("Frame index", Integer.valueOf(var3));
          var7.a("Frame sizes", new Callable()
          {
            private static final String __OBFID = "CL_00001063";
            
            public String a()
              throws Exception
            {
              StringBuilder var1 = new StringBuilder();
              int[][] var2 = var4;
              int var3 = var2.length;
              for (int var4x = 0; var4x < var3; var4x++)
              {
                int[] var5 = var2[var4x];
                if (var1.length() > 0) {
                  var1.append(", ");
                }
                var1.append(var5 == null ? "null" : Integer.valueOf(var5.length));
              }
              return var1.toString();
            }
          });
          throw new e(var6);
        }
      }
    }
    a(var2);
    if (spriteSingle != null) {
      spriteSingle.d(p_147963_1_);
    }
  }
  
  private void e(int p_130099_1_)
  {
    if (a.size() <= p_130099_1_) {
      for (int var2 = a.size(); var2 <= p_130099_1_; var2++) {
        a.add((Object)null);
      }
    }
    if (spriteSingle != null) {
      spriteSingle.e(p_130099_1_);
    }
  }
  
  private static int[][] a(int[][] p_147962_0_, int p_147962_1_, int p_147962_2_, int p_147962_3_)
  {
    int[][] var4 = new int[p_147962_0_.length][];
    for (int var5 = 0; var5 < p_147962_0_.length; var5++)
    {
      int[] var6 = p_147962_0_[var5];
      if (var6 != null)
      {
        var4[var5] = new int[(p_147962_1_ >> var5) * (p_147962_2_ >> var5)];
        System.arraycopy(var6, p_147962_3_ * var4[var5].length, var4[var5], 0, var4[var5].length);
      }
    }
    return var4;
  }
  
  public void l()
  {
    a.clear();
    if (spriteSingle != null) {
      spriteSingle.l();
    }
  }
  
  public boolean m()
  {
    return k != null;
  }
  
  public void a(List p_110968_1_)
  {
    a = p_110968_1_;
    if (spriteSingle != null) {
      spriteSingle.a(p_110968_1_);
    }
  }
  
  private void o()
  {
    k = null;
    a(Lists.newArrayList());
    h = 0;
    i = 0;
    if (spriteSingle != null) {
      spriteSingle.o();
    }
  }
  
  public String toString()
  {
    return "TextureAtlasSprite{name='" + j + '\'' + ", frameCount=" + a.size() + ", rotated=" + c + ", x=" + d + ", y=" + e + ", height=" + g + ", width=" + f + ", u0=" + l + ", u1=" + m + ", v0=" + n + ", v1=" + o + '}';
  }
  
  public boolean hasCustomLoader(bni manager, jy location)
  {
    return false;
  }
  
  public boolean load(bni manager, jy location)
  {
    return true;
  }
  
  public int getIndexInMap()
  {
    return indexInMap;
  }
  
  public void setIndexInMap(int indexInMap)
  {
    this.indexInMap = indexInMap;
  }
  
  private void fixTransparentColor(int[] data)
  {
    if (data == null) {
      return;
    }
    long redSum = 0L;
    long greenSum = 0L;
    long blueSum = 0L;
    long count = 0L;
    for (int i = 0; i < data.length; i++)
    {
      int col = data[i];
      int alpha = col >> 24 & 0xFF;
      if (alpha >= 16)
      {
        int red = col >> 16 & 0xFF;
        int green = col >> 8 & 0xFF;
        int blue = col & 0xFF;
        
        redSum += red;
        greenSum += green;
        blueSum += blue;
        
        count += 1L;
      }
    }
    if (count <= 0L) {
      return;
    }
    int redAvg = (int)(redSum / count);
    int greenAvg = (int)(greenSum / count);
    int blueAvg = (int)(blueSum / count);
    int colAvg = redAvg << 16 | greenAvg << 8 | blueAvg;
    for (int i = 0; i < data.length; i++)
    {
      int col = data[i];
      int alpha = col >> 24 & 0xFF;
      if (alpha <= 16) {
        data[i] = colAvg;
      }
    }
  }
  
  public double getSpriteU16(float atlasU)
  {
    float dU = m - l;
    return (atlasU - l) / dU * 16.0F;
  }
  
  public double getSpriteV16(float atlasV)
  {
    float dV = o - n;
    return (atlasV - n) / dV * 16.0F;
  }
  
  public void bindSpriteTexture()
  {
    if (glSpriteTextureId < 0)
    {
      glSpriteTextureId = bml.a();
      
      bml.a(glSpriteTextureId, mipmapLevels, f, g);
      
      TextureUtils.applyAnisotropicLevel();
    }
    TextureUtils.bindTexture(glSpriteTextureId);
  }
  
  public void deleteSpriteTexture()
  {
    if (glSpriteTextureId < 0) {
      return;
    }
    bml.a(glSpriteTextureId);
    
    glSpriteTextureId = -1;
  }
  
  public float toSingleU(float u)
  {
    u -= baseU;
    
    float ku = sheetWidth / f;
    
    u *= ku;
    
    return u;
  }
  
  public float toSingleV(float v)
  {
    v -= baseV;
    
    float kv = sheetHeight / g;
    
    v *= kv;
    
    return v;
  }
}
