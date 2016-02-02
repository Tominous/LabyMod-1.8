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
    this.a = avd.c(p_i46275_1_ * 4);
    this.b = this.a.asIntBuffer();
    this.c = this.a.asShortBuffer();
    this.d = this.a.asFloatBuffer();
    
    SVertexBuilder.initVertexBuilder(this);
  }
  
  private void b(int p_178983_1_)
  {
    if (Config.isShaders()) {
      p_178983_1_ *= 2;
    }
    if (p_178983_1_ > this.b.remaining())
    {
      int var2 = this.a.capacity();
      int var3 = var2 % 2097152;
      int var4 = var3 + (((this.b.position() + p_178983_1_) * 4 - var3) / 2097152 + 1) * 2097152;
      LogManager.getLogger().warn("Needed to grow BufferBuilder buffer: Old size " + var2 + " bytes, new size " + var4 + " bytes.");
      int var5 = this.b.position();
      ByteBuffer var6 = avd.c(var4);
      this.a.position(0);
      var6.put(this.a);
      var6.rewind();
      this.a = var6;
      
      this.d = this.a.asFloatBuffer();
      this.b = this.a.asIntBuffer();
      this.b.position(var5);
      this.c = this.a.asShortBuffer();
      this.c.position(var5 << 1);
      if (this.quadSprites != null)
      {
        bmi[] sprites = this.quadSprites;
        int quadSize = getBufferQuadSize();
        this.quadSprites = new bmi[quadSize];
        System.arraycopy(sprites, 0, this.quadSprites, 0, Math.min(sprites.length, this.quadSprites.length));
      }
    }
  }
  
  public void a(float p_500120_1_, float p_500120_2_, float p_500120_3_)
  {
    int var4 = this.e / 4;
    float[] var5 = new float[var4];
    for (int var6 = 0; var6 < var4; var6++) {
      var5[var6] = a(this.d, (float)(p_500120_1_ + this.j), (float)(p_500120_2_ + this.k), (float)(p_500120_3_ + this.l), this.m.f(), var6 * this.m.g());
    }
    Integer[] var15 = new Integer[var4];
    for (int var7 = 0; var7 < var15.length; var7++) {
      var15[var7] = Integer.valueOf(var7);
    }
    Arrays.sort(var15, new bfd.1(this, var5));
    BitSet var16 = new BitSet();
    int var8 = this.m.g();
    int[] var9 = new int[var8];
    for (int var10 = 0; (var10 = var16.nextClearBit(var10)) < var15.length; var10++)
    {
      int var11 = var15[var10].intValue();
      if (var11 != var10)
      {
        this.b.limit(var11 * var8 + var8);
        this.b.position(var11 * var8);
        this.b.get(var9);
        int var12 = var11;
        for (int var13 = var15[var11].intValue(); var12 != var10; var13 = var15[var13].intValue())
        {
          this.b.limit(var13 * var8 + var8);
          this.b.position(var13 * var8);
          IntBuffer var14 = this.b.slice();
          this.b.limit(var12 * var8 + var8);
          this.b.position(var12 * var8);
          this.b.put(var14);
          var16.set(var12);
          var12 = var13;
        }
        this.b.limit(var10 * var8 + var8);
        this.b.position(var10 * var8);
        this.b.put(var9);
      }
      var16.set(var10);
    }
    if (this.quadSprites != null)
    {
      bmi[] quadSpritesSorted = new bmi[this.e / 4];
      int quadStep = this.m.f() / 4 * 4;
      for (int i = 0; i < var15.length; i++)
      {
        int indexQuad = var15[i].intValue();
        int indexQuadSorted = i;
        quadSpritesSorted[indexQuadSorted] = this.quadSprites[indexQuad];
      }
      System.arraycopy(quadSpritesSorted, 0, this.quadSprites, 0, quadSpritesSorted.length);
    }
  }
  
  public bfd.a a()
  {
    this.b.rewind();
    int var1 = j();
    this.b.limit(var1);
    int[] var2 = new int[var1];
    this.b.get(var2);
    this.b.limit(this.b.capacity());
    this.b.position(var1);
    
    bmi[] quadSpritesCopy = null;
    if (this.quadSprites != null)
    {
      int countQuads = this.e / 4;
      quadSpritesCopy = new bmi[countQuads];
      System.arraycopy(this.quadSprites, 0, quadSpritesCopy, 0, countQuads);
    }
    return new bfd.a(var2, new bmu(this.m), quadSpritesCopy);
  }
  
  public int j()
  {
    return this.e * this.m.f();
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
    this.b.clear();
    b(p_500124_1_.a().length);
    this.b.put(p_500124_1_.a());
    this.e = p_500124_1_.b();
    this.m = new bmu(p_500124_1_.c());
    if (p_500124_1_.stateQuadSprites != null)
    {
      if (this.quadSprites == null) {
        this.quadSprites = new bmi[getBufferQuadSize()];
      }
      bmi[] src = p_500124_1_.stateQuadSprites;
      System.arraycopy(src, 0, this.quadSprites, 0, src.length);
    }
    else
    {
      this.quadSprites = null;
    }
  }
  
  public void b()
  {
    this.e = 0;
    this.f = null;
    this.g = 0;
    
    this.quadSprite = null;
  }
  
  public void a(int p_500126_1_, bmu p_500126_2_)
  {
    if (this.n) {
      throw new IllegalStateException("Already building!");
    }
    this.n = true;
    b();
    this.i = p_500126_1_;
    this.m = p_500126_2_;
    this.f = p_500126_2_.c(this.g);
    this.h = false;
    this.a.limit(this.a.capacity());
    if (Config.isShaders()) {
      SVertexBuilder.endSetVertexFormat(this);
    }
    if (Config.isMultiTexture())
    {
      if (this.blockLayer != null) {
        if (this.quadSprites == null) {
          this.quadSprites = new bmi[getBufferQuadSize()];
        }
      }
    }
    else {
      this.quadSprites = null;
    }
  }
  
  public bfd a(double p_500127_1_, double p_500127_3_)
  {
    if ((this.quadSprite != null) && (this.quadSprites != null))
    {
      p_500127_1_ = this.quadSprite.toSingleU((float)p_500127_1_);
      p_500127_3_ = this.quadSprite.toSingleV((float)p_500127_3_);
      
      this.quadSprites[(this.e / 4)] = this.quadSprite;
    }
    int var5 = this.e * this.m.g() + this.m.d(this.g);
    switch (bfd.2.a[this.f.a().ordinal()])
    {
    case 1: 
      this.a.putFloat(var5, (float)p_500127_1_);
      this.a.putFloat(var5 + 4, (float)p_500127_3_);
      break;
    case 2: 
    case 3: 
      this.a.putInt(var5, (int)p_500127_1_);
      this.a.putInt(var5 + 4, (int)p_500127_3_);
      break;
    case 4: 
    case 5: 
      this.a.putShort(var5, (short)(int)p_500127_3_);
      this.a.putShort(var5 + 2, (short)(int)p_500127_1_);
      break;
    case 6: 
    case 7: 
      this.a.put(var5, (byte)(int)p_500127_3_);
      this.a.put(var5 + 1, (byte)(int)p_500127_1_);
    }
    k();
    return this;
  }
  
  public bfd a(int p_500128_1_, int p_500128_2_)
  {
    int var3 = this.e * this.m.g() + this.m.d(this.g);
    switch (bfd.2.a[this.f.a().ordinal()])
    {
    case 1: 
      this.a.putFloat(var3, p_500128_1_);
      this.a.putFloat(var3 + 4, p_500128_2_);
      break;
    case 2: 
    case 3: 
      this.a.putInt(var3, p_500128_1_);
      this.a.putInt(var3 + 4, p_500128_2_);
      break;
    case 4: 
    case 5: 
      this.a.putShort(var3, (short)p_500128_2_);
      this.a.putShort(var3 + 2, (short)p_500128_1_);
      break;
    case 6: 
    case 7: 
      this.a.put(var3, (byte)p_500128_2_);
      this.a.put(var3 + 1, (byte)p_500128_1_);
    }
    k();
    return this;
  }
  
  public void a(int p_178962_1_, int p_178962_2_, int p_178962_3_, int p_178962_4_)
  {
    int var5 = (this.e - 4) * this.m.f() + this.m.b(1) / 4;
    int var6 = this.m.g() >> 2;
    this.b.put(var5, p_178962_1_);
    this.b.put(var5 + var6, p_178962_2_);
    this.b.put(var5 + var6 * 2, p_178962_3_);
    this.b.put(var5 + var6 * 3, p_178962_4_);
  }
  
  public void a(double p_178987_1_, double p_178987_3_, double p_178987_5_)
  {
    int var7 = this.m.f();
    int var8 = (this.e - 4) * var7;
    for (int var9 = 0; var9 < 4; var9++)
    {
      int var10 = var8 + var9 * var7;
      int var11 = var10 + 1;
      int var12 = var11 + 1;
      this.b.put(var10, Float.floatToRawIntBits((float)(p_178987_1_ + this.j) + Float.intBitsToFloat(this.b.get(var10))));
      this.b.put(var11, Float.floatToRawIntBits((float)(p_178987_3_ + this.k) + Float.intBitsToFloat(this.b.get(var11))));
      this.b.put(var12, Float.floatToRawIntBits((float)(p_178987_5_ + this.l) + Float.intBitsToFloat(this.b.get(var12))));
    }
  }
  
  private int c(int p_78909_1_)
  {
    return ((this.e - p_78909_1_) * this.m.g() + this.m.e()) / 4;
  }
  
  public void a(float p_178978_1_, float p_178978_2_, float p_178978_3_, int p_178978_4_)
  {
    int var5 = c(p_178978_4_);
    int var6 = -1;
    if (!this.h)
    {
      var6 = this.b.get(var5);
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
    this.b.put(var5, var6);
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
      this.b.put(p_178972_1_, p_178972_5_ << 24 | p_178972_4_ << 16 | p_178972_3_ << 8 | p_178972_2_);
    } else {
      this.b.put(p_178972_1_, p_178972_2_ << 24 | p_178972_3_ << 16 | p_178972_4_ << 8 | p_178972_5_);
    }
  }
  
  public void c()
  {
    this.h = true;
  }
  
  public bfd a(float p_500130_1_, float p_500130_2_, float p_500130_3_, float p_500130_4_)
  {
    return b((int)(p_500130_1_ * 255.0F), (int)(p_500130_2_ * 255.0F), (int)(p_500130_3_ * 255.0F), (int)(p_500130_4_ * 255.0F));
  }
  
  public bfd b(int p_500131_1_, int p_500131_2_, int p_500131_3_, int p_500131_4_)
  {
    if (this.h) {
      return this;
    }
    int var5 = this.e * this.m.g() + this.m.d(this.g);
    switch (bfd.2.a[this.f.a().ordinal()])
    {
    case 1: 
      this.a.putFloat(var5, p_500131_1_ / 255.0F);
      this.a.putFloat(var5 + 4, p_500131_2_ / 255.0F);
      this.a.putFloat(var5 + 8, p_500131_3_ / 255.0F);
      this.a.putFloat(var5 + 12, p_500131_4_ / 255.0F);
      break;
    case 2: 
    case 3: 
      this.a.putFloat(var5, p_500131_1_);
      this.a.putFloat(var5 + 4, p_500131_2_);
      this.a.putFloat(var5 + 8, p_500131_3_);
      this.a.putFloat(var5 + 12, p_500131_4_);
      break;
    case 4: 
    case 5: 
      this.a.putShort(var5, (short)p_500131_1_);
      this.a.putShort(var5 + 2, (short)p_500131_2_);
      this.a.putShort(var5 + 4, (short)p_500131_3_);
      this.a.putShort(var5 + 6, (short)p_500131_4_);
      break;
    case 6: 
    case 7: 
      if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN)
      {
        this.a.put(var5, (byte)p_500131_1_);
        this.a.put(var5 + 1, (byte)p_500131_2_);
        this.a.put(var5 + 2, (byte)p_500131_3_);
        this.a.put(var5 + 3, (byte)p_500131_4_);
      }
      else
      {
        this.a.put(var5, (byte)p_500131_4_);
        this.a.put(var5 + 1, (byte)p_500131_3_);
        this.a.put(var5 + 2, (byte)p_500131_2_);
        this.a.put(var5 + 3, (byte)p_500131_1_);
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
    this.b.position(j());
    this.b.put(p_178981_1_);
    this.e += p_178981_1_.length / this.m.f();
    if (Config.isShaders()) {
      SVertexBuilder.endAddVertexData(this);
    }
  }
  
  public void d()
  {
    this.e += 1;
    b(this.m.f());
    
    this.g = 0;
    this.f = this.m.c(this.g);
    if (Config.isShaders()) {
      SVertexBuilder.endAddVertex(this);
    }
  }
  
  public bfd b(double p_500133_1_, double p_500133_3_, double p_500133_5_)
  {
    if (Config.isShaders()) {
      SVertexBuilder.beginAddVertex(this);
    }
    int var7 = this.e * this.m.g() + this.m.d(this.g);
    switch (bfd.2.a[this.f.a().ordinal()])
    {
    case 1: 
      this.a.putFloat(var7, (float)(p_500133_1_ + this.j));
      this.a.putFloat(var7 + 4, (float)(p_500133_3_ + this.k));
      this.a.putFloat(var7 + 8, (float)(p_500133_5_ + this.l));
      break;
    case 2: 
    case 3: 
      this.a.putInt(var7, Float.floatToRawIntBits((float)(p_500133_1_ + this.j)));
      this.a.putInt(var7 + 4, Float.floatToRawIntBits((float)(p_500133_3_ + this.k)));
      this.a.putInt(var7 + 8, Float.floatToRawIntBits((float)(p_500133_5_ + this.l)));
      break;
    case 4: 
    case 5: 
      this.a.putShort(var7, (short)(int)(p_500133_1_ + this.j));
      this.a.putShort(var7 + 2, (short)(int)(p_500133_3_ + this.k));
      this.a.putShort(var7 + 4, (short)(int)(p_500133_5_ + this.l));
      break;
    case 6: 
    case 7: 
      this.a.put(var7, (byte)(int)(p_500133_1_ + this.j));
      this.a.put(var7 + 1, (byte)(int)(p_500133_3_ + this.k));
      this.a.put(var7 + 2, (byte)(int)(p_500133_5_ + this.l));
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
    int var8 = this.m.g() >> 2;
    int var9 = (this.e - 4) * var8 + this.m.c() / 4;
    this.b.put(var9, var7);
    this.b.put(var9 + var8, var7);
    this.b.put(var9 + var8 * 2, var7);
    this.b.put(var9 + var8 * 3, var7);
  }
  
  private void k()
  {
    this.g += 1;
    this.g %= this.m.i();
    this.f = this.m.c(this.g);
    if (this.f.b() == bmv.b.g) {
      k();
    }
  }
  
  public bfd c(float p_500135_1_, float p_500135_2_, float p_500135_3_)
  {
    int var4 = this.e * this.m.g() + this.m.d(this.g);
    switch (bfd.2.a[this.f.a().ordinal()])
    {
    case 1: 
      this.a.putFloat(var4, p_500135_1_);
      this.a.putFloat(var4 + 4, p_500135_2_);
      this.a.putFloat(var4 + 8, p_500135_3_);
      break;
    case 2: 
    case 3: 
      this.a.putInt(var4, (int)p_500135_1_);
      this.a.putInt(var4 + 4, (int)p_500135_2_);
      this.a.putInt(var4 + 8, (int)p_500135_3_);
      break;
    case 4: 
    case 5: 
      this.a.putShort(var4, (short)((int)p_500135_1_ * 32767 & 0xFFFF));
      this.a.putShort(var4 + 2, (short)((int)p_500135_2_ * 32767 & 0xFFFF));
      this.a.putShort(var4 + 4, (short)((int)p_500135_3_ * 32767 & 0xFFFF));
      break;
    case 6: 
    case 7: 
      this.a.put(var4, (byte)((int)p_500135_1_ * 127 & 0xFF));
      this.a.put(var4 + 1, (byte)((int)p_500135_2_ * 127 & 0xFF));
      this.a.put(var4 + 2, (byte)((int)p_500135_3_ * 127 & 0xFF));
    }
    k();
    return this;
  }
  
  public void c(double p_178969_1_, double p_178969_3_, double p_178969_5_)
  {
    this.j = p_178969_1_;
    this.k = p_178969_3_;
    this.l = p_178969_5_;
  }
  
  public void e()
  {
    if (!this.n) {
      throw new IllegalStateException("Not building!");
    }
    this.n = false;
    this.a.position(0);
    this.a.limit(j() * 4);
  }
  
  public ByteBuffer f()
  {
    return this.a;
  }
  
  public bmu g()
  {
    return this.m;
  }
  
  public int h()
  {
    return this.e;
  }
  
  public int i()
  {
    return this.i;
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
    if (this.quadSprites == null) {
      return;
    }
    int countQuads = this.e / 4;
    
    this.quadSprites[(countQuads - 1)] = sprite;
  }
  
  public void setSprite(bmi sprite)
  {
    if (this.quadSprites == null) {
      return;
    }
    this.quadSprite = sprite;
  }
  
  public boolean isMultiTexture()
  {
    return this.quadSprites != null;
  }
  
  public void drawMultiTexture()
  {
    if (this.quadSprites == null) {
      return;
    }
    int maxTextureIndex = Config.getMinecraft().T().getCountRegisteredSprites();
    if (this.drawnIcons.length <= maxTextureIndex) {
      this.drawnIcons = new boolean[maxTextureIndex + 1];
    }
    Arrays.fill(this.drawnIcons, false);
    
    int texSwitch = 0;
    int grassOverlayIndex = -1;
    int countQuads = this.e / 4;
    for (int i = 0; i < countQuads; i++)
    {
      bmi icon = this.quadSprites[i];
      if (icon != null)
      {
        int iconIndex = icon.getIndexInMap();
        if (this.drawnIcons[iconIndex] == 0) {
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
            if (this.blockLayer != adf.d) {
              this.drawnIcons[iconIndex] = true;
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
    GL11.glBindTexture(3553, sprite.glSpriteTextureId);
    
    int firstRegionEnd = -1;
    int lastPos = -1;
    int countQuads = this.e / 4;
    for (int i = startQuadPos; i < countQuads; i++)
    {
      bmi ts = this.quadSprites[i];
      if (ts == sprite)
      {
        if (lastPos < 0) {
          lastPos = i;
        }
      }
      else if (lastPos >= 0)
      {
        draw(lastPos, i);
        if (this.blockLayer == adf.d) {
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
    
    GL11.glDrawArrays(this.i, startVertex, vxCount);
  }
  
  public void setBlockLayer(adf blockLayer)
  {
    this.blockLayer = blockLayer;
    if (blockLayer == null)
    {
      this.quadSprites = null;
      this.quadSprite = null;
    }
  }
  
  private int getBufferQuadSize()
  {
    int quadSize = this.b.capacity() * 4 / (this.m.f() * 4);
    return quadSize;
  }
  
  public void checkAndGrow()
  {
    b(this.m.f());
  }
  
  public class a
  {
    private final int[] b;
    private final bmu c;
    private static final String __OBFID = "CL_00002568";
    private bmi[] stateQuadSprites;
    
    public a(int[] buf, bmu vertFormat, bmi[] quadSprites)
    {
      this.b = buf;
      this.c = vertFormat;
      this.stateQuadSprites = quadSprites;
    }
    
    public a(int[] p_i46380_2_, bmu p_i46380_3_)
    {
      this.b = p_i46380_2_;
      this.c = p_i46380_3_;
    }
    
    public int[] a()
    {
      return this.b;
    }
    
    public int b()
    {
      return this.b.length / this.c.f();
    }
    
    public bmu c()
    {
      return this.c;
    }
  }
}
