import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class bgo
{
  private static final float a = 1.0F / (float)Math.cos(0.39269909262657166D) - 1.0F;
  private static final float b = 1.0F / (float)Math.cos(0.7853981852531433D) - 1.0F;
  
  public bgg a(Vector3f ☃, Vector3f ☃, bgi ☃, bmi ☃, cq ☃, bor ☃, bgj ☃, boolean ☃, boolean ☃)
  {
    int[] ☃ = a(☃, ☃, ☃, a(☃, ☃), ☃, ☃, ☃, ☃);
    cq ☃ = a(☃);
    if (☃) {
      a(☃, ☃, ☃.e, ☃);
    }
    if (☃ == null) {
      a(☃, ☃);
    }
    return new bgg(☃, ☃.c, ☃);
  }
  
  private int[] a(bgi ☃, bmi ☃, cq ☃, float[] ☃, bor ☃, bgj ☃, boolean ☃, boolean ☃)
  {
    int[] ☃ = new int[28];
    for (int ☃ = 0; ☃ < 4; ☃++) {
      a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
    return ☃;
  }
  
  private int a(cq ☃)
  {
    float ☃ = b(☃);
    
    int ☃ = ns.a((int)(☃ * 255.0F), 0, 255);
    return 0xFF000000 | ☃ << 16 | ☃ << 8 | ☃;
  }
  
  private float b(cq ☃)
  {
    switch (bgo.1.a[☃.ordinal()])
    {
    case 1: 
      return 0.5F;
    case 2: 
      return 1.0F;
    case 3: 
    case 4: 
      return 0.8F;
    case 5: 
    case 6: 
      return 0.6F;
    }
    return 1.0F;
  }
  
  private float[] a(Vector3f ☃, Vector3f ☃)
  {
    float[] ☃ = new float[cq.values().length];
    ☃[bfj.a.f] = (☃.x / 16.0F);
    ☃[bfj.a.e] = (☃.y / 16.0F);
    ☃[bfj.a.d] = (☃.z / 16.0F);
    ☃[bfj.a.c] = (☃.x / 16.0F);
    ☃[bfj.a.b] = (☃.y / 16.0F);
    ☃[bfj.a.a] = (☃.z / 16.0F);
    return ☃;
  }
  
  private void a(int[] ☃, int ☃, cq ☃, bgi ☃, float[] ☃, bmi ☃, bor ☃, bgj ☃, boolean ☃, boolean ☃)
  {
    cq ☃ = ☃.a(☃);
    int ☃ = ☃ ? a(☃) : -1;
    bfj.b ☃ = bfj.a(☃).a(☃);
    
    Vector3f ☃ = new Vector3f(☃[☃.a], ☃[☃.b], ☃[☃.c]);
    a(☃, ☃);
    int ☃ = a(☃, ☃, ☃, ☃, ☃);
    
    a(☃, ☃, ☃, ☃, ☃, ☃, ☃.e);
  }
  
  private void a(int[] ☃, int ☃, int ☃, Vector3f ☃, int ☃, bmi ☃, bgk ☃)
  {
    int ☃ = ☃ * 7;
    ☃[☃] = Float.floatToRawIntBits(☃.x);
    ☃[(☃ + 1)] = Float.floatToRawIntBits(☃.y);
    ☃[(☃ + 2)] = Float.floatToRawIntBits(☃.z);
    ☃[(☃ + 3)] = ☃;
    ☃[(☃ + 4)] = Float.floatToRawIntBits(☃.a(☃.a(☃)));
    ☃[(☃ + 4 + 1)] = Float.floatToRawIntBits(☃.b(☃.b(☃)));
  }
  
  private void a(Vector3f ☃, bgj ☃)
  {
    if (☃ == null) {
      return;
    }
    Matrix4f ☃ = a();
    
    Vector3f ☃ = new Vector3f(0.0F, 0.0F, 0.0F);
    switch (bgo.1.b[☃.b.ordinal()])
    {
    case 1: 
      Matrix4f.rotate(☃.c * 0.017453292F, new Vector3f(1.0F, 0.0F, 0.0F), ☃, ☃);
      ☃.set(0.0F, 1.0F, 1.0F);
      break;
    case 2: 
      Matrix4f.rotate(☃.c * 0.017453292F, new Vector3f(0.0F, 1.0F, 0.0F), ☃, ☃);
      ☃.set(1.0F, 0.0F, 1.0F);
      break;
    case 3: 
      Matrix4f.rotate(☃.c * 0.017453292F, new Vector3f(0.0F, 0.0F, 1.0F), ☃, ☃);
      ☃.set(1.0F, 1.0F, 0.0F);
    }
    if (☃.d)
    {
      if (Math.abs(☃.c) == 22.5F) {
        ☃.scale(a);
      } else {
        ☃.scale(b);
      }
      Vector3f.add(☃, new Vector3f(1.0F, 1.0F, 1.0F), ☃);
    }
    else
    {
      ☃.set(1.0F, 1.0F, 1.0F);
    }
    a(☃, new Vector3f(☃.a), ☃, ☃);
  }
  
  public int a(Vector3f ☃, cq ☃, int ☃, bor ☃, boolean ☃)
  {
    if (☃ == bor.a) {
      return ☃;
    }
    a(☃, new Vector3f(0.5F, 0.5F, 0.5F), ☃.a(), new Vector3f(1.0F, 1.0F, 1.0F));
    
    return ☃.a(☃, ☃);
  }
  
  private void a(Vector3f ☃, Vector3f ☃, Matrix4f ☃, Vector3f ☃)
  {
    Vector4f ☃ = new Vector4f(☃.x - ☃.x, ☃.y - ☃.y, ☃.z - ☃.z, 1.0F);
    Matrix4f.transform(☃, ☃, ☃);
    ☃.x *= ☃.x;
    ☃.y *= ☃.y;
    ☃.z *= ☃.z;
    ☃.set(☃.x + ☃.x, ☃.y + ☃.y, ☃.z + ☃.z);
  }
  
  private Matrix4f a()
  {
    Matrix4f ☃ = new Matrix4f();
    ☃.setIdentity();
    return ☃;
  }
  
  public static cq a(int[] ☃)
  {
    Vector3f ☃ = new Vector3f(Float.intBitsToFloat(☃[0]), Float.intBitsToFloat(☃[1]), Float.intBitsToFloat(☃[2]));
    Vector3f ☃ = new Vector3f(Float.intBitsToFloat(☃[7]), Float.intBitsToFloat(☃[8]), Float.intBitsToFloat(☃[9]));
    Vector3f ☃ = new Vector3f(Float.intBitsToFloat(☃[14]), Float.intBitsToFloat(☃[15]), Float.intBitsToFloat(☃[16]));
    Vector3f ☃ = new Vector3f();
    Vector3f ☃ = new Vector3f();
    Vector3f ☃ = new Vector3f();
    Vector3f.sub(☃, ☃, ☃);
    Vector3f.sub(☃, ☃, ☃);
    Vector3f.cross(☃, ☃, ☃);
    
    float ☃ = (float)Math.sqrt(☃.x * ☃.x + ☃.y * ☃.y + ☃.z * ☃.z);
    ☃.x /= ☃;
    ☃.y /= ☃;
    ☃.z /= ☃;
    
    cq ☃ = null;
    float ☃ = 0.0F;
    for (cq ☃ : cq.values())
    {
      df ☃ = ☃.m();
      Vector3f ☃ = new Vector3f(☃.n(), ☃.o(), ☃.p());
      float ☃ = Vector3f.dot(☃, ☃);
      if ((☃ >= 0.0F) && (☃ > ☃))
      {
        ☃ = ☃;
        ☃ = ☃;
      }
    }
    if (☃ == null) {
      return cq.b;
    }
    return ☃;
  }
  
  public void a(int[] ☃, cq ☃, bgk ☃, bmi ☃)
  {
    for (int ☃ = 0; ☃ < 4; ☃++) {
      a(☃, ☃, ☃, ☃, ☃);
    }
  }
  
  private void a(int[] ☃, cq ☃)
  {
    int[] ☃ = new int[☃.length];
    System.arraycopy(☃, 0, ☃, 0, ☃.length);
    
    float[] ☃ = new float[cq.values().length];
    ☃[bfj.a.f] = 999.0F;
    ☃[bfj.a.e] = 999.0F;
    ☃[bfj.a.d] = 999.0F;
    ☃[bfj.a.c] = -999.0F;
    ☃[bfj.a.b] = -999.0F;
    ☃[bfj.a.a] = -999.0F;
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      int ☃ = 7 * ☃;
      float ☃ = Float.intBitsToFloat(☃[☃]);
      float ☃ = Float.intBitsToFloat(☃[(☃ + 1)]);
      float ☃ = Float.intBitsToFloat(☃[(☃ + 2)]);
      if (☃ < ☃[bfj.a.f]) {
        ☃[bfj.a.f] = ☃;
      }
      if (☃ < ☃[bfj.a.e]) {
        ☃[bfj.a.e] = ☃;
      }
      if (☃ < ☃[bfj.a.d]) {
        ☃[bfj.a.d] = ☃;
      }
      if (☃ > ☃[bfj.a.c]) {
        ☃[bfj.a.c] = ☃;
      }
      if (☃ > ☃[bfj.a.b]) {
        ☃[bfj.a.b] = ☃;
      }
      if (☃ > ☃[bfj.a.a]) {
        ☃[bfj.a.a] = ☃;
      }
    }
    bfj ☃ = bfj.a(☃);
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      int ☃ = 7 * ☃;
      bfj.b ☃ = ☃.a(☃);
      
      float ☃ = ☃[☃.a];
      float ☃ = ☃[☃.b];
      float ☃ = ☃[☃.c];
      
      ☃[☃] = Float.floatToRawIntBits(☃);
      ☃[(☃ + 1)] = Float.floatToRawIntBits(☃);
      ☃[(☃ + 2)] = Float.floatToRawIntBits(☃);
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        int ☃ = 7 * ☃;
        float ☃ = Float.intBitsToFloat(☃[☃]);
        float ☃ = Float.intBitsToFloat(☃[(☃ + 1)]);
        float ☃ = Float.intBitsToFloat(☃[(☃ + 2)]);
        if ((ns.a(☃, ☃)) && (ns.a(☃, ☃)) && (ns.a(☃, ☃)))
        {
          ☃[(☃ + 4)] = ☃[(☃ + 4)];
          ☃[(☃ + 4 + 1)] = ☃[(☃ + 4 + 1)];
        }
      }
    }
  }
  
  private void a(int ☃, int[] ☃, cq ☃, bgk ☃, bmi ☃)
  {
    int ☃ = 7 * ☃;
    float ☃ = Float.intBitsToFloat(☃[☃]);
    float ☃ = Float.intBitsToFloat(☃[(☃ + 1)]);
    float ☃ = Float.intBitsToFloat(☃[(☃ + 2)]);
    if ((☃ < -0.1F) || (☃ >= 1.1F)) {
      ☃ -= ns.d(☃);
    }
    if ((☃ < -0.1F) || (☃ >= 1.1F)) {
      ☃ -= ns.d(☃);
    }
    if ((☃ < -0.1F) || (☃ >= 1.1F)) {
      ☃ -= ns.d(☃);
    }
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    switch (bgo.1.a[☃.ordinal()])
    {
    case 1: 
      ☃ = ☃ * 16.0F;
      ☃ = (1.0F - ☃) * 16.0F;
      break;
    case 2: 
      ☃ = ☃ * 16.0F;
      ☃ = ☃ * 16.0F;
      break;
    case 3: 
      ☃ = (1.0F - ☃) * 16.0F;
      ☃ = (1.0F - ☃) * 16.0F;
      break;
    case 4: 
      ☃ = ☃ * 16.0F;
      ☃ = (1.0F - ☃) * 16.0F;
      break;
    case 5: 
      ☃ = ☃ * 16.0F;
      ☃ = (1.0F - ☃) * 16.0F;
      break;
    case 6: 
      ☃ = (1.0F - ☃) * 16.0F;
      ☃ = (1.0F - ☃) * 16.0F;
    }
    int ☃ = ☃.c(☃) * 7;
    ☃[(☃ + 4)] = Float.floatToRawIntBits(☃.a(☃));
    ☃[(☃ + 4 + 1)] = Float.floatToRawIntBits(☃.b(☃));
  }
}
