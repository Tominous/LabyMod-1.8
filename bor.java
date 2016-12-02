import com.google.common.collect.Maps;
import java.util.Map;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

public enum bor
{
  private static final Map<Integer, bor> q;
  private final int r;
  private final Matrix4f s;
  private final int t;
  private final int u;
  
  static
  {
    q = Maps.newHashMap();
    for (bor ☃ : values()) {
      q.put(Integer.valueOf(☃.r), ☃);
    }
  }
  
  private static int b(int ☃, int ☃)
  {
    return ☃ * 360 + ☃;
  }
  
  private bor(int ☃, int ☃)
  {
    this.r = b(☃, ☃);
    
    this.s = new Matrix4f();
    
    Matrix4f ☃ = new Matrix4f();
    ☃.setIdentity();
    Matrix4f.rotate(-☃ * 0.017453292F, new Vector3f(1.0F, 0.0F, 0.0F), ☃, ☃);
    this.t = ns.a(☃ / 90);
    
    Matrix4f ☃ = new Matrix4f();
    ☃.setIdentity();
    Matrix4f.rotate(-☃ * 0.017453292F, new Vector3f(0.0F, 1.0F, 0.0F), ☃, ☃);
    this.u = ns.a(☃ / 90);
    
    Matrix4f.mul(☃, ☃, this.s);
  }
  
  public Matrix4f a()
  {
    return this.s;
  }
  
  public cq a(cq ☃)
  {
    cq ☃ = ☃;
    for (int ☃ = 0; ☃ < this.t; ☃++) {
      ☃ = ☃.a(cq.a.a);
    }
    if (☃.k() != cq.a.b) {
      for (int ☃ = 0; ☃ < this.u; ☃++) {
        ☃ = ☃.a(cq.a.b);
      }
    }
    return ☃;
  }
  
  public int a(cq ☃, int ☃)
  {
    int ☃ = ☃;
    if (☃.k() == cq.a.a) {
      ☃ = (☃ + this.t) % 4;
    }
    cq ☃ = ☃;
    for (int ☃ = 0; ☃ < this.t; ☃++) {
      ☃ = ☃.a(cq.a.a);
    }
    if (☃.k() == cq.a.b) {
      ☃ = (☃ + this.u) % 4;
    }
    return ☃;
  }
  
  public static bor a(int ☃, int ☃)
  {
    return (bor)q.get(Integer.valueOf(b(ns.b(☃, 360), ns.b(☃, 360))));
  }
}
