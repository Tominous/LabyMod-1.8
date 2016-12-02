package mods.betterhat.main;

import bbs;
import bcg;
import bcr;
import bct;
import bfx;
import java.util.List;

public class ModelBoxUV
  extends bcr
{
  public final float textureWidth;
  public final float textureHeight;
  public final float field_78252_a;
  public final float field_78250_b;
  public final float field_78251_c;
  public final float field_78248_d;
  public final float field_78249_e;
  public final float field_78246_f;
  public String g;
  private boolean mirror;
  private bcg[] vertexPositions;
  private QuadData[] quadDataList;
  private bbs[] quadList;
  
  public static ModelBoxUV addBox(ModelRendererUV renderer, float x, float y, float z, int w, int h, int d, float add)
  {
    int offsetX = ((Integer)ReflectionHelper.getPrivateValue(bct.class, renderer, BetterHat.fTextureOffsetX)).intValue();
    int offsetY = ((Integer)ReflectionHelper.getPrivateValue(bct.class, renderer, BetterHat.fTextureOffsetY)).intValue();
    ModelBoxUV box = new ModelBoxUV(renderer, offsetX, offsetY, x, y, z, w, h, d, add);
    l.add(box);
    return box;
  }
  
  public ModelBoxUV(ModelRendererUV modelRenderer, int textureX, int textureY, float x1, float y1, float z1, int w, int h, int d, float add)
  {
    super(modelRenderer, textureX, textureY, x1, y1, z1, w, h, d, add);
    textureWidth = a;
    textureHeight = b;
    field_78252_a = x1;
    field_78250_b = y1;
    field_78251_c = z1;
    field_78248_d = (x1 + w);
    field_78249_e = (y1 + h);
    field_78246_f = (z1 + d);
    mirror = i;
    vertexPositions = new bcg[8];
    quadDataList = new QuadData[6];
    quadList = null;
    float x2 = x1 + w;
    float y2 = y1 + h;
    float z2 = z1 + d;
    x1 -= add;
    y1 -= add;
    z1 -= add;
    x2 += add;
    y2 += add;
    z2 += add;
    if (mirror)
    {
      float f7 = x2;
      x2 = x1;
      x1 = f7;
    }
    bcg vertex0 = new bcg(x1, y1, z1, 0.0F, 0.0F);
    bcg vertex2 = new bcg(x2, y1, z1, 0.0F, 8.0F);
    bcg vertex3 = new bcg(x2, y2, z1, 8.0F, 8.0F);
    bcg vertex4 = new bcg(x1, y2, z1, 8.0F, 0.0F);
    bcg vertex5 = new bcg(x1, y1, z2, 0.0F, 0.0F);
    bcg vertex6 = new bcg(x2, y1, z2, 0.0F, 8.0F);
    bcg vertex7 = new bcg(x2, y2, z2, 8.0F, 8.0F);
    bcg vertex8 = new bcg(x1, y2, z2, 8.0F, 0.0F);
    vertexPositions[0] = vertex0;
    vertexPositions[1] = vertex2;
    vertexPositions[2] = vertex3;
    vertexPositions[3] = vertex4;
    vertexPositions[4] = vertex5;
    vertexPositions[5] = vertex6;
    vertexPositions[6] = vertex7;
    vertexPositions[7] = vertex8;
    for (int i = 0; i < quadDataList.length; i++) {
      quadDataList[i] = new QuadData(textureX, textureY, w, h, d, i);
    }
  }
  
  public ModelBoxUV setSideUV(int side, int textureX, int textureY)
  {
    QuadData data = quadDataList[side];
    int deltaX = Math.abs(uvPos[2] - uvPos[0]);
    int deltaY = Math.abs(uvPos[3] - uvPos[1]);
    uvPos[0] = textureX;
    uvPos[1] = textureY;
    uvPos[2] = (textureX + deltaX);
    uvPos[3] = (textureY + deltaY);
    if (side == 3)
    {
      uvPos[1] = (textureY + deltaY);
      uvPos[3] = textureY;
    }
    return this;
  }
  
  public ModelBoxUV setAllUV(int textureX, int textureY)
  {
    for (int i = 0; i < quadDataList.length; i++) {
      setSideUV(i, textureX, textureY);
    }
    return this;
  }
  
  public ModelBoxUV initQuads()
  {
    quadList = new bbs[6];
    for (int i = 0; i < quadList.length; i++)
    {
      QuadData data = quadDataList[i];
      quadList[i] = new bbs(getVertexes(i), uvPos[0], uvPos[1], uvPos[2], uvPos[3], textureWidth, textureHeight);
    }
    if (mirror) {
      for (int j1 = 0; j1 < quadList.length; j1++) {
        quadList[j1].a();
      }
    }
    quadDataList = null;
    return this;
  }
  
  private bcg[] getVertexes(int side)
  {
    int i0 = vectorIndex[side][0];
    int i2 = vectorIndex[side][1];
    int i3 = vectorIndex[side][2];
    int i4 = vectorIndex[side][3];
    return new bcg[] { vertexPositions[i0], vertexPositions[i2], vertexPositions[i3], vertexPositions[i4] };
  }
  
  public void render(bfx par1Tessellator, float par2)
  {
    if (quadList == null) {
      initQuads();
    }
    for (int i = 0; i < quadList.length; i++) {
      quadList[i].a(par1Tessellator.c(), par2);
    }
  }
  
  public bcr func_78244_a(String name)
  {
    g = name;
    return this;
  }
  
  private static final int[][] vectorIndex = { { 5, 1, 2, 6 }, { 0, 4, 7, 3 }, { 5, 4, 0, 1 }, { 2, 3, 7, 6 }, { 1, 0, 3, 2 }, { 4, 5, 6, 7 } };
  
  private static class QuadData
  {
    public int[] uvPos;
    
    public QuadData(int textureX, int textureY, int w, int h, int d, int side)
    {
      uvPos = new int[4];
      if (side == 0)
      {
        uvPos[0] = (textureX + d + w);
        uvPos[1] = (textureY + d);
        uvPos[2] = (textureX + d + w + d);
        uvPos[3] = (textureY + d + h);
      }
      else if (side == 1)
      {
        uvPos[0] = textureX;
        uvPos[1] = (textureY + d);
        uvPos[2] = (textureX + d);
        uvPos[3] = (textureY + d + h);
      }
      else if (side == 2)
      {
        uvPos[0] = (textureX + d);
        uvPos[1] = textureY;
        uvPos[2] = (textureX + d + w);
        uvPos[3] = (textureY + d);
      }
      else if (side == 3)
      {
        uvPos[0] = (textureX + d + w);
        uvPos[1] = (textureY + d);
        uvPos[2] = (textureX + d + w + w);
        uvPos[3] = textureY;
      }
      else if (side == 4)
      {
        uvPos[0] = (textureX + d);
        uvPos[1] = (textureY + d);
        uvPos[2] = (textureX + d + w);
        uvPos[3] = (textureY + d + h);
      }
      else if (side == 5)
      {
        uvPos[0] = (textureX + d + w + d);
        uvPos[1] = (textureY + d);
        uvPos[2] = (textureX + d + w + d + w);
        uvPos[3] = (textureY + d + h);
      }
    }
  }
}
