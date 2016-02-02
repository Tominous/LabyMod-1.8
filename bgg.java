import net.minecraftforge.client.model.pipeline.IVertexConsumer;
import net.minecraftforge.client.model.pipeline.IVertexProducer;

public class bgg
  implements IVertexProducer
{
  protected final int[] a;
  protected final int b;
  protected final cq c;
  private static final String __OBFID = "CL_00002512";
  private bmi sprite = null;
  private int[] vertexDataSingle = null;
  
  public bgg(int[] p_i46232_1_, int p_i46232_2_, cq p_i46232_3_, bmi sprite)
  {
    p_i46232_1_ = fixVertexData(p_i46232_1_);
    
    this.a = p_i46232_1_;
    this.b = p_i46232_2_;
    this.c = p_i46232_3_;
    this.sprite = sprite;
  }
  
  public bmi getSprite()
  {
    if (this.sprite == null) {
      this.sprite = getSpriteByUv(a());
    }
    return this.sprite;
  }
  
  public String toString()
  {
    return "vertex: " + this.a.length / 7 + ", tint: " + this.b + ", facing: " + this.c + ", sprite: " + this.sprite;
  }
  
  public bgg(int[] p_i46232_1_, int p_i46232_2_, cq p_i46232_3_)
  {
    p_i46232_1_ = fixVertexData(p_i46232_1_);
    
    this.a = p_i46232_1_;
    this.b = p_i46232_2_;
    this.c = p_i46232_3_;
  }
  
  public int[] a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    return this.b != -1;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public cq d()
  {
    return this.c;
  }
  
  public int[] getVertexDataSingle()
  {
    if (this.vertexDataSingle == null) {
      this.vertexDataSingle = makeVertexDataSingle(a(), getSprite());
    }
    return this.vertexDataSingle;
  }
  
  private static int[] makeVertexDataSingle(int[] vd, bmi sprite)
  {
    int[] vdSingle = (int[])vd.clone();
    
    int ku = sprite.sheetWidth / sprite.c();
    int kv = sprite.sheetHeight / sprite.d();
    
    int step = vdSingle.length / 4;
    for (int i = 0; i < 4; i++)
    {
      int pos = i * step;
      
      float tu = Float.intBitsToFloat(vdSingle[(pos + 4)]);
      float tv = Float.intBitsToFloat(vdSingle[(pos + 4 + 1)]);
      
      float u = sprite.toSingleU(tu);
      float v = sprite.toSingleV(tv);
      
      vdSingle[(pos + 4)] = Float.floatToRawIntBits(u);
      vdSingle[(pos + 4 + 1)] = Float.floatToRawIntBits(v);
    }
    return vdSingle;
  }
  
  public void pipe(IVertexConsumer consumer)
  {
    Reflector.callVoid(Reflector.LightUtil_putBakedQuad, new Object[] { consumer, this });
  }
  
  private static bmi getSpriteByUv(int[] vertexData)
  {
    float uMin = 1.0F;
    float vMin = 1.0F;
    float uMax = 0.0F;
    float vMax = 0.0F;
    
    int step = vertexData.length / 4;
    for (int i = 0; i < 4; i++)
    {
      int pos = i * step;
      
      float tu = Float.intBitsToFloat(vertexData[(pos + 4)]);
      float tv = Float.intBitsToFloat(vertexData[(pos + 4 + 1)]);
      
      uMin = Math.min(uMin, tu);
      vMin = Math.min(vMin, tv);
      uMax = Math.max(uMax, tu);
      vMax = Math.max(vMax, tv);
    }
    float uMid = (uMin + uMax) / 2.0F;
    float vMid = (vMin + vMax) / 2.0F;
    bmi spriteUv = ave.A().T().getIconByUV(uMid, vMid);
    return spriteUv;
  }
  
  private static int[] fixVertexData(int[] vd)
  {
    if (Config.isShaders())
    {
      if (vd.length == 28) {
        vd = expandVertexData(vd);
      }
    }
    else if (vd.length == 56) {
      vd = compactVertexData(vd);
    }
    return vd;
  }
  
  private static int[] expandVertexData(int[] vd)
  {
    int step = vd.length / 4;
    int stepNew = step * 2;
    int[] vdNew = new int[stepNew * 4];
    for (int i = 0; i < 4; i++) {
      System.arraycopy(vd, i * step, vdNew, i * stepNew, step);
    }
    return vdNew;
  }
  
  private static int[] compactVertexData(int[] vd)
  {
    int step = vd.length / 4;
    int stepNew = step / 2;
    int[] vdNew = new int[stepNew * 4];
    for (int i = 0; i < 4; i++) {
      System.arraycopy(vd, i * step, vdNew, i * stepNew, stepNew);
    }
    return vdNew;
  }
}
