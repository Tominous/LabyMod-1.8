package shadersmod.client;

import adq;
import afh;
import alz;
import bfd;
import bmu;
import cj;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class SVertexBuilder
{
  int vertexSize;
  int offsetNormal;
  int offsetUV;
  int offsetUVCenter;
  boolean hasNormal;
  boolean hasTangent;
  boolean hasUV;
  boolean hasUVCenter;
  long[] entityData;
  int entityDataIndex;
  
  public SVertexBuilder()
  {
    entityData = new long[10];
    entityDataIndex = 0;
    entityData[entityDataIndex] = 0L;
  }
  
  public static void initVertexBuilder(bfd wrr)
  {
    sVertexBuilder = new SVertexBuilder();
  }
  
  public void pushEntity(long data)
  {
    entityDataIndex += 1;
    entityData[entityDataIndex] = data;
  }
  
  public void popEntity()
  {
    entityData[entityDataIndex] = 0L;
    entityDataIndex -= 1;
  }
  
  public static void pushEntity(alz blockState, cj blockPos, adq blockAccess, bfd wrr)
  {
    afh block = blockState.c();
    int blockID = afh.a(block);
    int renderType = block.b();
    int meta = block.c(blockState);
    
    int dataLo = ((renderType & 0xFFFF) << 16) + (blockID & 0xFFFF);
    int dataHi = meta & 0xFFFF;
    sVertexBuilder.pushEntity((dataHi << 32) + dataLo);
  }
  
  public static void popEntity(bfd wrr)
  {
    sVertexBuilder.popEntity();
  }
  
  public static boolean popEntity(boolean value, bfd wrr)
  {
    sVertexBuilder.popEntity();
    
    return value;
  }
  
  public static void endSetVertexFormat(bfd wrr)
  {
    SVertexBuilder svb = sVertexBuilder;
    bmu vf = wrr.g();
    vertexSize = (vf.g() / 4);
    hasNormal = vf.b();
    hasTangent = hasNormal;
    hasUV = vf.a(0);
    offsetNormal = (hasNormal ? vf.c() / 4 : 0);
    offsetUV = (hasUV ? vf.b(0) / 4 : 0);
    offsetUVCenter = 8;
  }
  
  public static void beginAddVertex(bfd wrr)
  {
    if (e == 0) {
      endSetVertexFormat(wrr);
    }
  }
  
  public static void endAddVertex(bfd wrr)
  {
    SVertexBuilder svb = sVertexBuilder;
    if (vertexSize == 14)
    {
      if ((i == 7) && (e % 4 == 0)) {
        svb.calcNormal(wrr, wrr.j() - 4 * vertexSize);
      }
      long eData = entityData[entityDataIndex];
      int pos = wrr.j() - 14 + 12;
      b.put(pos, (int)eData);
      b.put(pos + 1, (int)(eData >> 32));
    }
  }
  
  public static void beginAddVertexData(bfd wrr, int[] data)
  {
    if (e == 0) {
      endSetVertexFormat(wrr);
    }
    SVertexBuilder svb = sVertexBuilder;
    if (vertexSize == 14)
    {
      long eData = entityData[entityDataIndex];
      for (int pos = 12; pos + 1 < data.length; pos += 14)
      {
        data[pos] = ((int)eData);
        data[(pos + 1)] = ((int)(eData >> 32));
      }
    }
  }
  
  public static void endAddVertexData(bfd wrr)
  {
    SVertexBuilder svb = sVertexBuilder;
    if (vertexSize == 14) {
      if ((i == 7) && (e % 4 == 0)) {
        svb.calcNormal(wrr, wrr.j() - 4 * vertexSize);
      }
    }
  }
  
  public void calcNormal(bfd wrr, int baseIndex)
  {
    SVertexBuilder svb = this;
    FloatBuffer floatBuffer = d;
    IntBuffer intBuffer = b;
    int rbi = wrr.j();
    
    float v0x = floatBuffer.get(baseIndex + 0 * vertexSize);
    float v0y = floatBuffer.get(baseIndex + 0 * vertexSize + 1);
    float v0z = floatBuffer.get(baseIndex + 0 * vertexSize + 2);
    float v0u = floatBuffer.get(baseIndex + 0 * vertexSize + offsetUV);
    float v0v = floatBuffer.get(baseIndex + 0 * vertexSize + offsetUV + 1);
    float v1x = floatBuffer.get(baseIndex + 1 * vertexSize);
    float v1y = floatBuffer.get(baseIndex + 1 * vertexSize + 1);
    float v1z = floatBuffer.get(baseIndex + 1 * vertexSize + 2);
    float v1u = floatBuffer.get(baseIndex + 1 * vertexSize + offsetUV);
    float v1v = floatBuffer.get(baseIndex + 1 * vertexSize + offsetUV + 1);
    float v2x = floatBuffer.get(baseIndex + 2 * vertexSize);
    float v2y = floatBuffer.get(baseIndex + 2 * vertexSize + 1);
    float v2z = floatBuffer.get(baseIndex + 2 * vertexSize + 2);
    float v2u = floatBuffer.get(baseIndex + 2 * vertexSize + offsetUV);
    float v2v = floatBuffer.get(baseIndex + 2 * vertexSize + offsetUV + 1);
    float v3x = floatBuffer.get(baseIndex + 3 * vertexSize);
    float v3y = floatBuffer.get(baseIndex + 3 * vertexSize + 1);
    float v3z = floatBuffer.get(baseIndex + 3 * vertexSize + 2);
    float v3u = floatBuffer.get(baseIndex + 3 * vertexSize + offsetUV);
    float v3v = floatBuffer.get(baseIndex + 3 * vertexSize + offsetUV + 1);
    
    float x1 = v2x - v0x;
    float y1 = v2y - v0y;
    float z1 = v2z - v0z;
    float x2 = v3x - v1x;
    float y2 = v3y - v1y;
    float z2 = v3z - v1z;
    float vnx = y1 * z2 - y2 * z1;
    float vny = z1 * x2 - z2 * x1;
    float vnz = x1 * y2 - x2 * y1;
    float lensq = vnx * vnx + vny * vny + vnz * vnz;
    float mult = lensq != 0.0D ? (float)(1.0D / Math.sqrt(lensq)) : 1.0F;
    vnx *= mult;
    vny *= mult;
    vnz *= mult;
    
    x1 = v1x - v0x;
    y1 = v1y - v0y;
    z1 = v1z - v0z;
    float u1 = v1u - v0u;
    float v1 = v1v - v0v;
    x2 = v2x - v0x;
    y2 = v2y - v0y;
    z2 = v2z - v0z;
    float u2 = v2u - v0u;
    float v2 = v2v - v0v;
    float d = u1 * v2 - u2 * v1;
    float r = d != 0.0F ? 1.0F / d : 1.0F;
    float tan1x = (v2 * x1 - v1 * x2) * r;
    float tan1y = (v2 * y1 - v1 * y2) * r;
    float tan1z = (v2 * z1 - v1 * z2) * r;
    float tan2x = (u1 * x2 - u2 * x1) * r;
    float tan2y = (u1 * y2 - u2 * y1) * r;
    float tan2z = (u1 * z2 - u2 * z1) * r;
    lensq = tan1x * tan1x + tan1y * tan1y + tan1z * tan1z;
    mult = lensq != 0.0D ? (float)(1.0D / Math.sqrt(lensq)) : 1.0F;
    tan1x *= mult;
    tan1y *= mult;
    tan1z *= mult;
    lensq = tan2x * tan2x + tan2y * tan2y + tan2z * tan2z;
    mult = lensq != 0.0D ? (float)(1.0D / Math.sqrt(lensq)) : 1.0F;
    tan2x *= mult;
    tan2y *= mult;
    tan2z *= mult;
    float tan3x = vnz * tan1y - vny * tan1z;
    float tan3y = vnx * tan1z - vnz * tan1x;
    float tan3z = vny * tan1x - vnx * tan1y;
    float tan1w = tan2x * tan3x + tan2y * tan3y + tan2z * tan3z < 0.0F ? -1.0F : 1.0F;
    
    int bnx = (int)(vnx * 127.0F) & 0xFF;
    int bny = (int)(vny * 127.0F) & 0xFF;
    int bnz = (int)(vnz * 127.0F) & 0xFF;
    int packedNormal = (bnz << 16) + (bny << 8) + bnx;
    intBuffer.put(baseIndex + 0 * vertexSize + offsetNormal, packedNormal);
    intBuffer.put(baseIndex + 1 * vertexSize + offsetNormal, packedNormal);
    intBuffer.put(baseIndex + 2 * vertexSize + offsetNormal, packedNormal);
    intBuffer.put(baseIndex + 3 * vertexSize + offsetNormal, packedNormal);
    
    int packedTan1xy = ((int)(tan1x * 32767.0F) & 0xFFFF) + (((int)(tan1y * 32767.0F) & 0xFFFF) << 16);
    int packedTan1zw = ((int)(tan1z * 32767.0F) & 0xFFFF) + (((int)(tan1w * 32767.0F) & 0xFFFF) << 16);
    intBuffer.put(baseIndex + 0 * vertexSize + 10, packedTan1xy);
    intBuffer.put(baseIndex + 0 * vertexSize + 10 + 1, packedTan1zw);
    intBuffer.put(baseIndex + 1 * vertexSize + 10, packedTan1xy);
    intBuffer.put(baseIndex + 1 * vertexSize + 10 + 1, packedTan1zw);
    intBuffer.put(baseIndex + 2 * vertexSize + 10, packedTan1xy);
    intBuffer.put(baseIndex + 2 * vertexSize + 10 + 1, packedTan1zw);
    intBuffer.put(baseIndex + 3 * vertexSize + 10, packedTan1xy);
    intBuffer.put(baseIndex + 3 * vertexSize + 10 + 1, packedTan1zw);
    
    float midU = (v0u + v1u + v2u + v3u) / 4.0F;
    float midV = (v0v + v1v + v2v + v3v) / 4.0F;
    floatBuffer.put(baseIndex + 0 * vertexSize + 8, midU);
    floatBuffer.put(baseIndex + 0 * vertexSize + 8 + 1, midV);
    floatBuffer.put(baseIndex + 1 * vertexSize + 8, midU);
    floatBuffer.put(baseIndex + 1 * vertexSize + 8 + 1, midV);
    floatBuffer.put(baseIndex + 2 * vertexSize + 8, midU);
    floatBuffer.put(baseIndex + 2 * vertexSize + 8 + 1, midV);
    floatBuffer.put(baseIndex + 3 * vertexSize + 8, midU);
    floatBuffer.put(baseIndex + 3 * vertexSize + 8 + 1, midV);
  }
  
  public static void calcNormalChunkLayer(bfd wrr)
  {
    if (wrr.g().b()) {
      if ((i == 7) && (e % 4 == 0))
      {
        SVertexBuilder svb = sVertexBuilder;
        endSetVertexFormat(wrr);
        int indexEnd = e * vertexSize;
        for (int index = 0; index < indexEnd; index += vertexSize * 4) {
          svb.calcNormal(wrr, index);
        }
      }
    }
  }
  
  public static void drawArrays(int drawMode, int first, int count, bfd wrr)
  {
    if (count != 0)
    {
      bmu vf = wrr.g();
      int vertexSizeByte = vf.g();
      if (vertexSizeByte == 56)
      {
        ByteBuffer bb = wrr.f();
        bb.position(32);
        GL20.glVertexAttribPointer(Shaders.midTexCoordAttrib, 2, 5126, false, vertexSizeByte, bb);
        bb.position(40);
        GL20.glVertexAttribPointer(Shaders.tangentAttrib, 4, 5122, false, vertexSizeByte, bb);
        bb.position(48);
        GL20.glVertexAttribPointer(Shaders.entityAttrib, 3, 5122, false, vertexSizeByte, bb);
        bb.position(0);
        GL20.glEnableVertexAttribArray(Shaders.midTexCoordAttrib);
        GL20.glEnableVertexAttribArray(Shaders.tangentAttrib);
        GL20.glEnableVertexAttribArray(Shaders.entityAttrib);
        GL11.glDrawArrays(drawMode, first, count);
        GL20.glDisableVertexAttribArray(Shaders.midTexCoordAttrib);
        GL20.glDisableVertexAttribArray(Shaders.tangentAttrib);
        GL20.glDisableVertexAttribArray(Shaders.entityAttrib);
      }
      else
      {
        GL11.glDrawArrays(drawMode, first, count);
      }
    }
  }
}
