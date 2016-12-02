import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.BitSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import shadersmod.client.SVertexBuilder;

public class bfd
{
  private ByteBuffer a;
  public IntBuffer b;
  private ShortBuffer c;
  public FloatBuffer d;
  public int e;
  private bmv f;
  private int g;
  private boolean h;
  public int i;
  private double j;
  private double k;
  private double l;
  private bmu m;
  private boolean n;
  private static final String __OBFID = "CL_00000942";
  private adf blockLayer = null;
  private boolean[] drawnIcons = new boolean['Ā'];
  private bmi[] quadSprites = null;
  private bmi quadSprite = null;
  public SVertexBuilder sVertexBuilder;
  
  public bfd(int p_i46275_1_)
  {
    if (Config.isShaders()) {
      p_i46275_1_ *= 2;
    }
    a = avd.c(p_i46275_1_ * 4);
    b = a.asIntBuffer();
    c = a.asShortBuffer();
    d = a.asFloatBuffer();
    
    SVertexBuilder.initVertexBuilder(this);
  }
  
  private void b(int p_178983_1_)
  {
    if (Config.isShaders()) {
      p_178983_1_ *= 2;
    }
    if (p_178983_1_ > b.remaining())
    {
      int var2 = a.capacity();
      int var3 = var2 % 2097152;
      int var4 = var3 + (((b.position() + p_178983_1_) * 4 - var3) / 2097152 + 1) * 2097152;
      LogManager.getLogger().warn("Needed to grow BufferBuilder buffer: Old size " + var2 + " bytes, new size " + var4 + " bytes.");
      int var5 = b.position();
      ByteBuffer var6 = avd.c(var4);
      a.position(0);
      var6.put(a);
      var6.rewind();
      a = var6;
      
      d = a.asFloatBuffer();
      b = a.asIntBuffer();
      b.position(var5);
      c = a.asShortBuffer();
      c.position(var5 << 1);
      if (quadSprites != null)
      {
        bmi[] sprites = quadSprites;
        int quadSize = getBufferQuadSize();
        quadSprites = new bmi[quadSize];
        System.arraycopy(sprites, 0, quadSprites, 0, Math.min(sprites.length, quadSprites.length));
      }
    }
  }
  
  public void a(float p_500120_1_, float p_500120_2_, float p_500120_3_)
  {
    int var4 = e / 4;
    float[] var5 = new float[var4];
    for (int var6 = 0; var6 < var4; var6++) {
      var5[var6] = a(d, (float)(p_500120_1_ + j), (float)(p_500120_2_ + k), (float)(p_500120_3_ + l), m.f(), var6 * m.g());
    }
    Integer[] var15 = new Integer[var4];
    for (int var7 = 0; var7 < var15.length; var7++) {
      var15[var7] = Integer.valueOf(var7);
    }
    Arrays.sort(var15, new bfd.1(this, var5));
    BitSet var16 = new BitSet();
    int var8 = m.g();
    int[] var9 = new int[var8];
    for (int var10 = 0; (var10 = var16.nextClearBit(var10)) < var15.length; var10++)
    {
      int var11 = var15[var10].intValue();
      if (var11 != var10)
      {
        b.limit(var11 * var8 + var8);
        b.position(var11 * var8);
        b.get(var9);
        int var12 = var11;
        for (int var13 = var15[var11].intValue(); var12 != var10; var13 = var15[var13].intValue())
        {
          b.limit(var13 * var8 + var8);
          b.position(var13 * var8);
          IntBuffer var14 = b.slice();
          b.limit(var12 * var8 + var8);
          b.position(var12 * var8);
          b.put(var14);
          var16.set(var12);
          var12 = var13;
        }
        b.limit(var10 * var8 + var8);
        b.position(var10 * var8);
        b.put(var9);
      }
      var16.set(var10);
    }
    if (quadSprites != null)
    {
      bmi[] quadSpritesSorted = new bmi[e / 4];
      int quadStep = m.f() / 4 * 4;
      for (int i = 0; i < var15.length; i++)
      {
        int indexQuad = var15[i].intValue();
        int indexQuadSorted = i;
        quadSpritesSorted[indexQuadSorted] = quadSprites[indexQuad];
      }
      System.arraycopy(quadSpritesSorted, 0, quadSprites, 0, quadSpritesSorted.length);
    }
  }
  
  public bfd.a a()
  {
    b.rewind();
    int var1 = j();
    b.limit(var1);
    int[] var2 = new int[var1];
    b.get(var2);
    b.limit(b.capacity());
    b.position(var1);
    
    bmi[] quadSpritesCopy = null;
    if (quadSprites != null)
    {
      int countQuads = e / 4;
      quadSpritesCopy = new bmi[countQuads];
      System.arraycopy(quadSprites, 0, quadSpritesCopy, 0, countQuads);
    }
    return new bfd.a(var2, new bmu(m), quadSpritesCopy);
  }
  
  public int j()
  {
    return e * m.f();
  }
  
  private static float a(FloatBuffer p_500127_0_, float p_500127_1_, float p_500127_2_, float p_500127_3_, int p_500127_4_, int p_500127_5_)
  {
    float var6 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 0 + 0);
    float var7 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 0 + 1);
    float var8 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 0 + 2);
    float var9 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 1 + 0);
    float var10 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 1 + 1);
    float var11 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 1 + 2);
    float var12 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 2 + 0);
    float var13 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 2 + 1);
    float var14 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 2 + 2);
    float var15 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 3 + 0);
    float var16 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 3 + 1);
    float var17 = p_500127_0_.get(p_500127_5_ + p_500127_4_ * 3 + 2);
    float var18 = (var6 + var9 + var12 + var15) * 0.25F - p_500127_1_;
    float var19 = (var7 + var10 + var13 + var16) * 0.25F - p_500127_2_;
    float var20 = (var8 + var11 + var14 + var17) * 0.25F - p_500127_3_;
    return var18 * var18 + var19 * var19 + var20 * var20;
  }
  
  public void a(bfd.a p_500124_1_)
  {
    b.clear();
    b(p_500124_1_.a().length);
    b.put(p_500124_1_.a());
    e = p_500124_1_.b();
    m = new bmu(p_500124_1_.c());
    if (stateQuadSprites != null)
    {
      if (quadSprites == null) {
        quadSprites = new bmi[getBufferQuadSize()];
      }
      bmi[] src = stateQuadSprites;
      System.arraycopy(src, 0, quadSprites, 0, src.length);
    }
    else
    {
      quadSprites = null;
    }
  }
  
  public void b()
  {
    e = 0;
    f = null;
    g = 0;
    
    quadSprite = null;
  }
  
  public void a(int p_500126_1_, bmu p_500126_2_)
  {
    if (n) {
      throw new IllegalStateException("Already building!");
    }
    n = true;
    b();
    i = p_500126_1_;
    m = p_500126_2_;
    f = p_500126_2_.c(g);
    h = false;
    a.limit(a.capacity());
    if (Config.isShaders()) {
      SVertexBuilder.endSetVertexFormat(this);
    }
    if (Config.isMultiTexture())
    {
      if (blockLayer != null) {
        if (quadSprites == null) {
          quadSprites = new bmi[getBufferQuadSize()];
        }
      }
    }
    else {
      quadSprites = null;
    }
  }
  
  public bfd a(double p_500127_1_, double p_500127_3_)
  {
    if ((quadSprite != null) && (quadSprites != null))
    {
      p_500127_1_ = quadSprite.toSingleU((float)p_500127_1_);
      p_500127_3_ = quadSprite.toSingleV((float)p_500127_3_);
      
      quadSprites[(e / 4)] = quadSprite;
    }
    int var5 = e * m.g() + m.d(g);
    switch (bfd.2.a[f.a().ordinal()])
    {
    case 1: 
      a.putFloat(var5, (float)p_500127_1_);
      a.putFloat(var5 + 4, (float)p_500127_3_);
      break;
    case 2: 
    case 3: 
      a.putInt(var5, (int)p_500127_1_);
      a.putInt(var5 + 4, (int)p_500127_3_);
      break;
    case 4: 
    case 5: 
      a.putShort(var5, (short)(int)p_500127_3_);
      a.putShort(var5 + 2, (short)(int)p_500127_1_);
      break;
    case 6: 
    case 7: 
      a.put(var5, (byte)(int)p_500127_3_);
      a.put(var5 + 1, (byte)(int)p_500127_1_);
    }
    k();
    return this;
  }
  
  public bfd a(int p_500128_1_, int p_500128_2_)
  {
    int var3 = e * m.g() + m.d(g);
    switch (bfd.2.a[f.a().ordinal()])
    {
    case 1: 
      a.putFloat(var3, p_500128_1_);
      a.putFloat(var3 + 4, p_500128_2_);
      break;
    case 2: 
    case 3: 
      a.putInt(var3, p_500128_1_);
      a.putInt(var3 + 4, p_500128_2_);
      break;
    case 4: 
    case 5: 
      a.putShort(var3, (short)p_500128_2_);
      a.putShort(var3 + 2, (short)p_500128_1_);
      break;
    case 6: 
    case 7: 
      a.put(var3, (byte)p_500128_2_);
      a.put(var3 + 1, (byte)p_500128_1_);
    }
    k();
    return this;
  }
  
  public void a(int p_178962_1_, int p_178962_2_, int p_178962_3_, int p_178962_4_)
  {
    int var5 = (e - 4) * m.f() + m.b(1) / 4;
    int var6 = m.g() >> 2;
    b.put(var5, p_178962_1_);
    b.put(var5 + var6, p_178962_2_);
    b.put(var5 + var6 * 2, p_178962_3_);
    b.put(var5 + var6 * 3, p_178962_4_);
  }
  
  public void a(double p_178987_1_, double p_178987_3_, double p_178987_5_)
  {
    int var7 = m.f();
    int var8 = (e - 4) * var7;
    for (int var9 = 0; var9 < 4; var9++)
    {
      int var10 = var8 + var9 * var7;
      int var11 = var10 + 1;
      int var12 = var11 + 1;
      b.put(var10, Float.floatToRawIntBits((float)(p_178987_1_ + j) + Float.intBitsToFloat(b.get(var10))));
      b.put(var11, Float.floatToRawIntBits((float)(p_178987_3_ + k) + Float.intBitsToFloat(b.get(var11))));
      b.put(var12, Float.floatToRawIntBits((float)(p_178987_5_ + l) + Float.intBitsToFloat(b.get(var12))));
    }
  }
  
  private int c(int p_78909_1_)
  {
    return ((e - p_78909_1_) * m.g() + m.e()) / 4;
  }
  
  public void a(float p_178978_1_, float p_178978_2_, float p_178978_3_, int p_178978_4_)
  {
    int var5 = c(p_178978_4_);
    int var6 = -1;
    if (!h)
    {
      var6 = b.get(var5);
      if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN)
      {
        int var7 = (int)((var6 & 0xFF) * p_178978_1_);
        int var8 = (int)((var6 >> 8 & 0xFF) * p_178978_2_);
        int var9 = (int)((var6 >> 16 & 0xFF) * p_178978_3_);
        var6 &= 0xFF000000;
        var6 |= var9 << 16 | var8 << 8 | var7;
      }
      else
      {
        int var7 = (int)((var6 >> 24 & 0xFF) * p_178978_1_);
        int var8 = (int)((var6 >> 16 & 0xFF) * p_178978_2_);
        int var9 = (int)((var6 >> 8 & 0xFF) * p_178978_3_);
        var6 &= 0xFF;
        var6 |= var7 << 24 | var8 << 16 | var9 << 8;
      }
    }
    b.put(var5, var6);
  }
  
  private void b(int p_178988_1_, int p_178988_2_)
  {
    int var3 = c(p_178988_2_);
    int var4 = p_178988_1_ >> 16 & 0xFF;
    int var5 = p_178988_1_ >> 8 & 0xFF;
    int var6 = p_178988_1_ & 0xFF;
    int var7 = p_178988_1_ >> 24 & 0xFF;
    a(var3, var4, var5, var6, var7);
  }
  
  public void b(float p_178994_1_, float p_178994_2_, float p_178994_3_, int p_178994_4_)
  {
    int var5 = c(p_178994_4_);
    int var6 = ns.a((int)(p_178994_1_ * 255.0F), 0, 255);
    int var7 = ns.a((int)(p_178994_2_ * 255.0F), 0, 255);
    int var8 = ns.a((int)(p_178994_3_ * 255.0F), 0, 255);
    a(var5, var6, var7, var8, 255);
  }
  
  private void a(int p_178972_1_, int p_178972_2_, int p_178972_3_, int p_178972_4_, int p_178972_5_)
  {
    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
      b.put(p_178972_1_, p_178972_5_ << 24 | p_178972_4_ << 16 | p_178972_3_ << 8 | p_178972_2_);
    } else {
      b.put(p_178972_1_, p_178972_2_ << 24 | p_178972_3_ << 16 | p_178972_4_ << 8 | p_178972_5_);
    }
  }
  
  public void c()
  {
    h = true;
  }
  
  public bfd a(float p_500130_1_, float p_500130_2_, float p_500130_3_, float p_500130_4_)
  {
    return b((int)(p_500130_1_ * 255.0F), (int)(p_500130_2_ * 255.0F), (int)(p_500130_3_ * 255.0F), (int)(p_500130_4_ * 255.0F));
  }
  
  public bfd b(int p_500131_1_, int p_500131_2_, int p_500131_3_, int p_500131_4_)
  {
    if (h) {
      return this;
    }
    int var5 = e * m.g() + m.d(g);
    switch (bfd.2.a[f.a().ordinal()])
    {
    case 1: 
      a.putFloat(var5, p_500131_1_ / 255.0F);
      a.putFloat(var5 + 4, p_500131_2_ / 255.0F);
      a.putFloat(var5 + 8, p_500131_3_ / 255.0F);
      a.putFloat(var5 + 12, p_500131_4_ / 255.0F);
      break;
    case 2: 
    case 3: 
      a.putFloat(var5, p_500131_1_);
      a.putFloat(var5 + 4, p_500131_2_);
      a.putFloat(var5 + 8, p_500131_3_);
      a.putFloat(var5 + 12, p_500131_4_);
      break;
    case 4: 
    case 5: 
      a.putShort(var5, (short)p_500131_1_);
      a.putShort(var5 + 2, (short)p_500131_2_);
      a.putShort(var5 + 4, (short)p_500131_3_);
      a.putShort(var5 + 6, (short)p_500131_4_);
      break;
    case 6: 
    case 7: 
      if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN)
      {
        a.put(var5, (byte)p_500131_1_);
        a.put(var5 + 1, (byte)p_500131_2_);
        a.put(var5 + 2, (byte)p_500131_3_);
        a.put(var5 + 3, (byte)p_500131_4_);
      }
      else
      {
        a.put(var5, (byte)p_500131_4_);
        a.put(var5 + 1, (byte)p_500131_3_);
        a.put(var5 + 2, (byte)p_500131_2_);
        a.put(var5 + 3, (byte)p_500131_1_);
      }
      break;
    }
    k();
    return this;
  }
  
  public void a(int[] p_178981_1_)
  {
    if (Config.isShaders()) {
      SVertexBuilder.beginAddVertexData(this, p_178981_1_);
    }
    b(p_178981_1_.length);
    b.position(j());
    b.put(p_178981_1_);
    e += p_178981_1_.length / m.f();
    if (Config.isShaders()) {
      SVertexBuilder.endAddVertexData(this);
    }
  }
  
  public void d()
  {
    e += 1;
    b(m.f());
    
    g = 0;
    f = m.c(g);
    if (Config.isShaders()) {
      SVertexBuilder.endAddVertex(this);
    }
  }
  
  public bfd b(double p_500133_1_, double p_500133_3_, double p_500133_5_)
  {
    if (Config.isShaders()) {
      SVertexBuilder.beginAddVertex(this);
    }
    int var7 = e * m.g() + m.d(g);
    switch (bfd.2.a[f.a().ordinal()])
    {
    case 1: 
      a.putFloat(var7, (float)(p_500133_1_ + j));
      a.putFloat(var7 + 4, (float)(p_500133_3_ + k));
      a.putFloat(var7 + 8, (float)(p_500133_5_ + l));
      break;
    case 2: 
    case 3: 
      a.putInt(var7, Float.floatToRawIntBits((float)(p_500133_1_ + j)));
      a.putInt(var7 + 4, Float.floatToRawIntBits((float)(p_500133_3_ + k)));
      a.putInt(var7 + 8, Float.floatToRawIntBits((float)(p_500133_5_ + l)));
      break;
    case 4: 
    case 5: 
      a.putShort(var7, (short)(int)(p_500133_1_ + j));
      a.putShort(var7 + 2, (short)(int)(p_500133_3_ + k));
      a.putShort(var7 + 4, (short)(int)(p_500133_5_ + l));
      break;
    case 6: 
    case 7: 
      a.put(var7, (byte)(int)(p_500133_1_ + j));
      a.put(var7 + 1, (byte)(int)(p_500133_3_ + k));
      a.put(var7 + 2, (byte)(int)(p_500133_5_ + l));
    }
    k();
    return this;
  }
  
  public void b(float p_500134_1_, float p_500134_2_, float p_500134_3_)
  {
    int var4 = (byte)(int)(p_500134_1_ * 127.0F) & 0xFF;
    int var5 = (byte)(int)(p_500134_2_ * 127.0F) & 0xFF;
    int var6 = (byte)(int)(p_500134_3_ * 127.0F) & 0xFF;
    int var7 = var4 | var5 << 8 | var6 << 16;
    int var8 = m.g() >> 2;
    int var9 = (e - 4) * var8 + m.c() / 4;
    b.put(var9, var7);
    b.put(var9 + var8, var7);
    b.put(var9 + var8 * 2, var7);
    b.put(var9 + var8 * 3, var7);
  }
  
  private void k()
  {
    g += 1;
    g %= m.i();
    f = m.c(g);
    if (f.b() == bmv.b.g) {
      k();
    }
  }
  
  public bfd c(float p_500135_1_, float p_500135_2_, float p_500135_3_)
  {
    int var4 = e * m.g() + m.d(g);
    switch (bfd.2.a[f.a().ordinal()])
    {
    case 1: 
      a.putFloat(var4, p_500135_1_);
      a.putFloat(var4 + 4, p_500135_2_);
      a.putFloat(var4 + 8, p_500135_3_);
      break;
    case 2: 
    case 3: 
      a.putInt(var4, (int)p_500135_1_);
      a.putInt(var4 + 4, (int)p_500135_2_);
      a.putInt(var4 + 8, (int)p_500135_3_);
      break;
    case 4: 
    case 5: 
      a.putShort(var4, (short)((int)p_500135_1_ * 32767 & 0xFFFF));
      a.putShort(var4 + 2, (short)((int)p_500135_2_ * 32767 & 0xFFFF));
      a.putShort(var4 + 4, (short)((int)p_500135_3_ * 32767 & 0xFFFF));
      break;
    case 6: 
    case 7: 
      a.put(var4, (byte)((int)p_500135_1_ * 127 & 0xFF));
      a.put(var4 + 1, (byte)((int)p_500135_2_ * 127 & 0xFF));
      a.put(var4 + 2, (byte)((int)p_500135_3_ * 127 & 0xFF));
    }
    k();
    return this;
  }
  
  public void c(double p_178969_1_, double p_178969_3_, double p_178969_5_)
  {
    j = p_178969_1_;
    k = p_178969_3_;
    l = p_178969_5_;
  }
  
  public void e()
  {
    if (!n) {
      throw new IllegalStateException("Not building!");
    }
    n = false;
    a.position(0);
    a.limit(j() * 4);
  }
  
  public ByteBuffer f()
  {
    return a;
  }
  
  public bmu g()
  {
    return m;
  }
  
  public int h()
  {
    return e;
  }
  
  public int i()
  {
    return i;
  }
  
  public void a(int p_178968_1_)
  {
    for (int var2 = 0; var2 < 4; var2++) {
      b(p_178968_1_, var2 + 1);
    }
  }
  
  public void d(float p_178990_1_, float p_178990_2_, float p_178990_3_)
  {
    for (int var4 = 0; var4 < 4; var4++) {
      b(p_178990_1_, p_178990_2_, p_178990_3_, var4 + 1);
    }
  }
  
  public void putSprite(bmi sprite)
  {
    if (quadSprites == null) {
      return;
    }
    int countQuads = e / 4;
    
    quadSprites[(countQuads - 1)] = sprite;
  }
  
  public void setSprite(bmi sprite)
  {
    if (quadSprites == null) {
      return;
    }
    quadSprite = sprite;
  }
  
  public boolean isMultiTexture()
  {
    return quadSprites != null;
  }
  
  public void drawMultiTexture()
  {
    if (quadSprites == null) {
      return;
    }
    int maxTextureIndex = Config.getMinecraft().T().getCountRegisteredSprites();
    if (drawnIcons.length <= maxTextureIndex) {
      drawnIcons = new boolean[maxTextureIndex + 1];
    }
    Arrays.fill(drawnIcons, false);
    
    int texSwitch = 0;
    int grassOverlayIndex = -1;
    int countQuads = e / 4;
    for (int i = 0; i < countQuads; i++)
    {
      bmi icon = quadSprites[i];
      if (icon != null)
      {
        int iconIndex = icon.getIndexInMap();
        if (drawnIcons[iconIndex] == 0) {
          if (icon == TextureUtils.iconGrassSideOverlay)
          {
            if (grassOverlayIndex < 0) {
              grassOverlayIndex = i;
            }
          }
          else
          {
            i = drawForIcon(icon, i) - 1;
            texSwitch++;
            if (blockLayer != adf.d) {
              drawnIcons[iconIndex] = true;
            }
          }
        }
      }
    }
    if (grassOverlayIndex >= 0)
    {
      drawForIcon(TextureUtils.iconGrassSideOverlay, grassOverlayIndex);
      texSwitch++;
    }
    if (texSwitch > 0) {}
  }
  
  private int drawForIcon(bmi sprite, int startQuadPos)
  {
    GL11.glBindTexture(3553, glSpriteTextureId);
    
    int firstRegionEnd = -1;
    int lastPos = -1;
    int countQuads = e / 4;
    for (int i = startQuadPos; i < countQuads; i++)
    {
      bmi ts = quadSprites[i];
      if (ts == sprite)
      {
        if (lastPos < 0) {
          lastPos = i;
        }
      }
      else if (lastPos >= 0)
      {
        draw(lastPos, i);
        if (blockLayer == adf.d) {
          return i;
        }
        lastPos = -1;
        if (firstRegionEnd < 0) {
          firstRegionEnd = i;
        }
      }
    }
    if (lastPos >= 0) {
      draw(lastPos, countQuads);
    }
    if (firstRegionEnd < 0) {
      firstRegionEnd = countQuads;
    }
    return firstRegionEnd;
  }
  
  private void draw(int startQuadVertex, int endQuadVertex)
  {
    int vxQuadCount = endQuadVertex - startQuadVertex;
    if (vxQuadCount <= 0) {
      return;
    }
    int startVertex = startQuadVertex * 4;
    int vxCount = vxQuadCount * 4;
    
    GL11.glDrawArrays(i, startVertex, vxCount);
  }
  
  public void setBlockLayer(adf blockLayer)
  {
    this.blockLayer = blockLayer;
    if (blockLayer == null)
    {
      quadSprites = null;
      quadSprite = null;
    }
  }
  
  private int getBufferQuadSize()
  {
    int quadSize = b.capacity() * 4 / (m.f() * 4);
    return quadSize;
  }
  
  public void checkAndGrow()
  {
    b(m.f());
  }
  
  public class a
  {
    private final int[] b;
    private final bmu c;
    private static final String __OBFID = "CL_00002568";
    private bmi[] stateQuadSprites;
    
    public a(int[] buf, bmu vertFormat, bmi[] quadSprites)
    {
      b = buf;
      c = vertFormat;
      stateQuadSprites = quadSprites;
    }
    
    public a(int[] p_i46380_2_, bmu p_i46380_3_)
    {
      b = p_i46380_2_;
      c = p_i46380_3_;
    }
    
    public int[] a()
    {
      return b;
    }
    
    public int b()
    {
      return b.length / c.f();
    }
    
    public bmu c()
    {
      return c;
    }
  }
}
