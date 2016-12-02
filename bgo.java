import net.minecraftforge.client.model.ITransformation;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;
import shadersmod.client.Shaders;

public class bgo
{
  private static final float a = 1.0F / (float)Math.cos(0.39269909262657166D) - 1.0F;
  private static final float b = 1.0F / (float)Math.cos(0.7853981633974483D) - 1.0F;
  private static final String __OBFID = "CL_00002490";
  
  public bgg a(Vector3f posFrom, Vector3f posTo, bgi face, bmi sprite, cq facing, bor modelRotationIn, bgj partRotation, boolean uvLocked, boolean shade)
  {
    return makeBakedQuad(posFrom, posTo, face, sprite, facing, modelRotationIn, partRotation, uvLocked, shade);
  }
  
  public bgg makeBakedQuad(Vector3f posFrom, Vector3f posTo, bgi face, bmi sprite, cq facing, ITransformation modelRotationIn, bgj partRotation, boolean uvLocked, boolean shade)
  {
    int[] var10 = makeQuadVertexData(face, sprite, facing, a(posFrom, posTo), modelRotationIn, partRotation, uvLocked, shade);
    cq var11 = a(var10);
    if (uvLocked) {
      a(var10, var11, e, sprite);
    }
    if (partRotation == null) {
      a(var10, var11);
    }
    if (Reflector.ForgeHooksClient_fillNormal.exists()) {
      Reflector.callVoid(Reflector.ForgeHooksClient_fillNormal, new Object[] { var10, var11 });
    }
    return new bgg(var10, c, var11, sprite);
  }
  
  private int[] makeQuadVertexData(bgi p_178405_1_, bmi p_178405_2_, cq p_178405_3_, float[] p_178405_4_, ITransformation p_178405_5_, bgj p_178405_6_, boolean p_178405_7_, boolean shade)
  {
    int vertexSize = 28;
    if (Config.isShaders()) {
      vertexSize = 56;
    }
    int[] var9 = new int[vertexSize];
    for (int var10 = 0; var10 < 4; var10++) {
      fillVertexData(var9, var10, p_178405_3_, p_178405_1_, p_178405_4_, p_178405_2_, p_178405_5_, p_178405_6_, p_178405_7_, shade);
    }
    return var9;
  }
  
  private int a(cq p_178413_1_)
  {
    float var2 = b(p_178413_1_);
    int var3 = ns.a((int)(var2 * 255.0F), 0, 255);
    return 0xFF000000 | var3 << 16 | var3 << 8 | var3;
  }
  
  private float b(cq p_178412_1_)
  {
    switch (bgo.1.a[p_178412_1_.ordinal()])
    {
    case 1: 
      if (Config.isShaders()) {
        return Shaders.blockLightLevel05;
      }
      return 0.5F;
    case 2: 
      return 1.0F;
    case 3: 
    case 4: 
      if (Config.isShaders()) {
        return Shaders.blockLightLevel08;
      }
      return 0.8F;
    case 5: 
    case 6: 
      if (Config.isShaders()) {
        return Shaders.blockLightLevel06;
      }
      return 0.6F;
    }
    return 1.0F;
  }
  
  private float[] a(Vector3f pos1, Vector3f pos2)
  {
    float[] var3 = new float[cq.values().length];
    var3[bfj.a.f] = (x / 16.0F);
    var3[bfj.a.e] = (y / 16.0F);
    var3[bfj.a.d] = (z / 16.0F);
    var3[bfj.a.c] = (x / 16.0F);
    var3[bfj.a.b] = (y / 16.0F);
    var3[bfj.a.a] = (z / 16.0F);
    return var3;
  }
  
  private void fillVertexData(int[] faceData, int vertexIndex, cq facing, bgi partFace, float[] p_178402_5_, bmi sprite, ITransformation modelRotationIn, bgj partRotation, boolean uvLocked, boolean shade)
  {
    cq var11 = modelRotationIn.rotate(facing);
    
    int var12 = shade ? a(var11) : -1;
    bfj.b var13 = bfj.a(facing).a(vertexIndex);
    Vector3f var14 = new Vector3f(p_178402_5_[a], p_178402_5_[b], p_178402_5_[c]);
    a(var14, partRotation);
    int var15 = rotateVertex(var14, facing, vertexIndex, modelRotationIn, uvLocked);
    a(faceData, var15, vertexIndex, var14, var12, sprite, e);
  }
  
  private void a(int[] faceData, int storeIndex, int vertexIndex, Vector3f position, int shadeColor, bmi sprite, bgk faceUV)
  {
    int step = faceData.length / 4;
    int var8 = storeIndex * step;
    faceData[var8] = Float.floatToRawIntBits(x);
    faceData[(var8 + 1)] = Float.floatToRawIntBits(y);
    faceData[(var8 + 2)] = Float.floatToRawIntBits(z);
    faceData[(var8 + 3)] = shadeColor;
    faceData[(var8 + 4)] = Float.floatToRawIntBits(sprite.a(faceUV.a(vertexIndex)));
    faceData[(var8 + 4 + 1)] = Float.floatToRawIntBits(sprite.b(faceUV.b(vertexIndex)));
  }
  
  private void a(Vector3f p_178407_1_, bgj p_178407_2_)
  {
    if (p_178407_2_ != null)
    {
      Matrix4f var3 = a();
      Vector3f var4 = new Vector3f(0.0F, 0.0F, 0.0F);
      switch (bgo.1.b[b.ordinal()])
      {
      case 1: 
        Matrix4f.rotate(c * 0.017453292F, new Vector3f(1.0F, 0.0F, 0.0F), var3, var3);
        var4.set(0.0F, 1.0F, 1.0F);
        break;
      case 2: 
        Matrix4f.rotate(c * 0.017453292F, new Vector3f(0.0F, 1.0F, 0.0F), var3, var3);
        var4.set(1.0F, 0.0F, 1.0F);
        break;
      case 3: 
        Matrix4f.rotate(c * 0.017453292F, new Vector3f(0.0F, 0.0F, 1.0F), var3, var3);
        var4.set(1.0F, 1.0F, 0.0F);
      }
      if (d)
      {
        if (Math.abs(c) == 22.5F) {
          var4.scale(a);
        } else {
          var4.scale(b);
        }
        Vector3f.add(var4, new Vector3f(1.0F, 1.0F, 1.0F), var4);
      }
      else
      {
        var4.set(1.0F, 1.0F, 1.0F);
      }
      a(p_178407_1_, new Vector3f(a), var3, var4);
    }
  }
  
  public int a(Vector3f position, cq facing, int vertexIndex, bor modelRotationIn, boolean uvLocked)
  {
    return rotateVertex(position, facing, vertexIndex, modelRotationIn, uvLocked);
  }
  
  public int rotateVertex(Vector3f position, cq facing, int vertexIndex, ITransformation modelRotationIn, boolean uvLocked)
  {
    if (modelRotationIn == bor.a) {
      return vertexIndex;
    }
    if (Reflector.ForgeHooksClient_transform.exists()) {
      Reflector.call(Reflector.ForgeHooksClient_transform, new Object[] { position, modelRotationIn.getMatrix() });
    } else {
      a(position, new Vector3f(0.5F, 0.5F, 0.5F), ((bor)modelRotationIn).a(), new Vector3f(1.0F, 1.0F, 1.0F));
    }
    return modelRotationIn.rotate(facing, vertexIndex);
  }
  
  private void a(Vector3f position, Vector3f rotationOrigin, Matrix4f rotationMatrix, Vector3f scale)
  {
    Vector4f var5 = new Vector4f(x - x, y - y, z - z, 1.0F);
    Matrix4f.transform(rotationMatrix, var5, var5);
    x *= x;
    y *= y;
    z *= z;
    position.set(x + x, y + y, z + z);
  }
  
  private Matrix4f a()
  {
    Matrix4f var1 = new Matrix4f();
    var1.setIdentity();
    return var1;
  }
  
  public static cq a(int[] p_178410_0_)
  {
    int step = p_178410_0_.length / 4;
    int step2 = step * 2;
    int step3 = step * 3;
    Vector3f var1 = new Vector3f(Float.intBitsToFloat(p_178410_0_[0]), Float.intBitsToFloat(p_178410_0_[1]), Float.intBitsToFloat(p_178410_0_[2]));
    Vector3f var2 = new Vector3f(Float.intBitsToFloat(p_178410_0_[step]), Float.intBitsToFloat(p_178410_0_[(step + 1)]), Float.intBitsToFloat(p_178410_0_[(step + 2)]));
    Vector3f var3 = new Vector3f(Float.intBitsToFloat(p_178410_0_[step2]), Float.intBitsToFloat(p_178410_0_[(step2 + 1)]), Float.intBitsToFloat(p_178410_0_[(step2 + 2)]));
    Vector3f var4 = new Vector3f();
    Vector3f var5 = new Vector3f();
    Vector3f var6 = new Vector3f();
    Vector3f.sub(var1, var2, var4);
    Vector3f.sub(var3, var2, var5);
    Vector3f.cross(var5, var4, var6);
    float var7 = (float)Math.sqrt(x * x + y * y + z * z);
    x /= var7;
    y /= var7;
    z /= var7;
    cq var8 = null;
    float var9 = 0.0F;
    cq[] var10 = cq.values();
    int var11 = var10.length;
    for (int var12 = 0; var12 < var11; var12++)
    {
      cq var13 = var10[var12];
      df var14 = var13.m();
      Vector3f var15 = new Vector3f(var14.n(), var14.o(), var14.p());
      float var16 = Vector3f.dot(var6, var15);
      if ((var16 >= 0.0F) && (var16 > var9))
      {
        var9 = var16;
        var8 = var13;
      }
    }
    if (var9 < 0.719F) {
      if ((var8 == cq.f) || (var8 == cq.e) || (var8 == cq.c) || (var8 == cq.d)) {
        var8 = cq.c;
      } else {
        var8 = cq.b;
      }
    }
    if (var8 == null) {
      return cq.b;
    }
    return var8;
  }
  
  public void a(int[] p_178409_1_, cq p_178409_2_, bgk p_178409_3_, bmi p_178409_4_)
  {
    for (int var5 = 0; var5 < 4; var5++) {
      a(var5, p_178409_1_, p_178409_2_, p_178409_3_, p_178409_4_);
    }
  }
  
  private void a(int[] p_178408_1_, cq p_178408_2_)
  {
    int[] var3 = new int[p_178408_1_.length];
    System.arraycopy(p_178408_1_, 0, var3, 0, p_178408_1_.length);
    float[] var4 = new float[cq.values().length];
    var4[bfj.a.f] = 999.0F;
    var4[bfj.a.e] = 999.0F;
    var4[bfj.a.d] = 999.0F;
    var4[bfj.a.c] = -999.0F;
    var4[bfj.a.b] = -999.0F;
    var4[bfj.a.a] = -999.0F;
    
    int step = p_178408_1_.length / 4;
    for (int var5 = 0; var5 < 4; var5++)
    {
      int var6 = step * var5;
      float var7 = Float.intBitsToFloat(var3[var6]);
      float var8 = Float.intBitsToFloat(var3[(var6 + 1)]);
      float var9 = Float.intBitsToFloat(var3[(var6 + 2)]);
      if (var7 < var4[bfj.a.f]) {
        var4[bfj.a.f] = var7;
      }
      if (var8 < var4[bfj.a.e]) {
        var4[bfj.a.e] = var8;
      }
      if (var9 < var4[bfj.a.d]) {
        var4[bfj.a.d] = var9;
      }
      if (var7 > var4[bfj.a.c]) {
        var4[bfj.a.c] = var7;
      }
      if (var8 > var4[bfj.a.b]) {
        var4[bfj.a.b] = var8;
      }
      if (var9 > var4[bfj.a.a]) {
        var4[bfj.a.a] = var9;
      }
    }
    bfj var17 = bfj.a(p_178408_2_);
    for (int var6 = 0; var6 < 4; var6++)
    {
      int var18 = step * var6;
      bfj.b var19 = var17.a(var6);
      float var9 = var4[a];
      float var10 = var4[b];
      float var11 = var4[c];
      p_178408_1_[var18] = Float.floatToRawIntBits(var9);
      p_178408_1_[(var18 + 1)] = Float.floatToRawIntBits(var10);
      p_178408_1_[(var18 + 2)] = Float.floatToRawIntBits(var11);
      for (int var12 = 0; var12 < 4; var12++)
      {
        int var13 = step * var12;
        float var14 = Float.intBitsToFloat(var3[var13]);
        float var15 = Float.intBitsToFloat(var3[(var13 + 1)]);
        float var16 = Float.intBitsToFloat(var3[(var13 + 2)]);
        if ((ns.a(var9, var14)) && (ns.a(var10, var15)) && (ns.a(var11, var16)))
        {
          p_178408_1_[(var18 + 4)] = var3[(var13 + 4)];
          p_178408_1_[(var18 + 4 + 1)] = var3[(var13 + 4 + 1)];
        }
      }
    }
  }
  
  private void a(int p_178401_1_, int[] p_178401_2_, cq p_178401_3_, bgk p_178401_4_, bmi p_178401_5_)
  {
    int step = p_178401_2_.length / 4;
    int var6 = step * p_178401_1_;
    float var7 = Float.intBitsToFloat(p_178401_2_[var6]);
    float var8 = Float.intBitsToFloat(p_178401_2_[(var6 + 1)]);
    float var9 = Float.intBitsToFloat(p_178401_2_[(var6 + 2)]);
    if ((var7 < -0.1F) || (var7 >= 1.1F)) {
      var7 -= ns.d(var7);
    }
    if ((var8 < -0.1F) || (var8 >= 1.1F)) {
      var8 -= ns.d(var8);
    }
    if ((var9 < -0.1F) || (var9 >= 1.1F)) {
      var9 -= ns.d(var9);
    }
    float var10 = 0.0F;
    float var11 = 0.0F;
    switch (bgo.1.a[p_178401_3_.ordinal()])
    {
    case 1: 
      var10 = var7 * 16.0F;
      var11 = (1.0F - var9) * 16.0F;
      break;
    case 2: 
      var10 = var7 * 16.0F;
      var11 = var9 * 16.0F;
      break;
    case 3: 
      var10 = (1.0F - var7) * 16.0F;
      var11 = (1.0F - var8) * 16.0F;
      break;
    case 4: 
      var10 = var7 * 16.0F;
      var11 = (1.0F - var8) * 16.0F;
      break;
    case 5: 
      var10 = var9 * 16.0F;
      var11 = (1.0F - var8) * 16.0F;
      break;
    case 6: 
      var10 = (1.0F - var9) * 16.0F;
      var11 = (1.0F - var8) * 16.0F;
    }
    int var12 = p_178401_4_.c(p_178401_1_) * step;
    p_178401_2_[(var12 + 4)] = Float.floatToRawIntBits(p_178401_5_.a(var10));
    p_178401_2_[(var12 + 4 + 1)] = Float.floatToRawIntBits(p_178401_5_.b(var11));
  }
}
