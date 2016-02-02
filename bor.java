import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraftforge.client.model.IModelPart;
import net.minecraftforge.client.model.IModelState;
import net.minecraftforge.client.model.ITransformation;
import net.minecraftforge.client.model.TRSRTransformation;
import org.lwjgl.util.vector.Vector3f;

public enum bor
  implements IModelState, ITransformation
{
  private static final Map q;
  private final int r;
  private final org.lwjgl.util.vector.Matrix4f s;
  private final int t;
  private final int u;
  private static final bor[] v;
  private static final String __OBFID = "CL_00002393";
  
  private static int b(int p_177521_0_, int p_177521_1_)
  {
    return p_177521_0_ * 360 + p_177521_1_;
  }
  
  private bor(String p_i46087_1_, int p_i46087_2_, int p_i46087_3_, int p_i46087_4_)
  {
    this.r = b(p_i46087_3_, p_i46087_4_);
    this.s = new org.lwjgl.util.vector.Matrix4f();
    org.lwjgl.util.vector.Matrix4f var5 = new org.lwjgl.util.vector.Matrix4f();
    var5.setIdentity();
    org.lwjgl.util.vector.Matrix4f.rotate(-p_i46087_3_ * 0.017453292F, new Vector3f(1.0F, 0.0F, 0.0F), var5, var5);
    this.t = ns.a(p_i46087_3_ / 90);
    org.lwjgl.util.vector.Matrix4f var6 = new org.lwjgl.util.vector.Matrix4f();
    var6.setIdentity();
    org.lwjgl.util.vector.Matrix4f.rotate(-p_i46087_4_ * 0.017453292F, new Vector3f(0.0F, 1.0F, 0.0F), var6, var6);
    this.u = ns.a(p_i46087_4_ / 90);
    org.lwjgl.util.vector.Matrix4f.mul(var6, var5, this.s);
  }
  
  public org.lwjgl.util.vector.Matrix4f a()
  {
    return this.s;
  }
  
  public cq a(cq p_177523_1_)
  {
    cq var2 = p_177523_1_;
    for (int var3 = 0; var3 < this.t; var3++) {
      var2 = var2.a(cq.a.a);
    }
    if (var2.k() != cq.a.b) {
      for (var3 = 0; var3 < this.u; var3++) {
        var2 = var2.a(cq.a.b);
      }
    }
    return var2;
  }
  
  public int a(cq facing, int vertexIndex)
  {
    int var3 = vertexIndex;
    if (facing.k() == cq.a.a) {
      var3 = (vertexIndex + this.t) % 4;
    }
    cq var4 = facing;
    for (int var5 = 0; var5 < this.t; var5++) {
      var4 = var4.a(cq.a.a);
    }
    if (var4.k() == cq.a.b) {
      var3 = (var3 + this.u) % 4;
    }
    return var3;
  }
  
  public static bor a(int p_177524_0_, int p_177524_1_)
  {
    return (bor)q.get(Integer.valueOf(b(ns.b(p_177524_0_, 360), ns.b(p_177524_1_, 360))));
  }
  
  static
  {
    q = Maps.newHashMap();
    
    v = new bor[] { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p };
    
    bor[] var0 = values();
    int var1 = var0.length;
    for (int var2 = 0; var2 < var1; var2++)
    {
      bor var3 = var0[var2];
      q.put(Integer.valueOf(var3.r), var3);
    }
  }
  
  public TRSRTransformation apply(IModelPart part)
  {
    return new TRSRTransformation(getMatrix());
  }
  
  public javax.vecmath.Matrix4f getMatrix()
  {
    if (Reflector.ForgeHooksClient_getMatrix.exists()) {
      return (javax.vecmath.Matrix4f)Reflector.call(Reflector.ForgeHooksClient_getMatrix, new Object[] { this });
    }
    return new javax.vecmath.Matrix4f(a());
  }
  
  public cq rotate(cq facing)
  {
    return a(facing);
  }
  
  public int rotate(cq facing, int vertexIndex)
  {
    return a(facing, vertexIndex);
  }
}
