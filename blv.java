import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.vector.Matrix4f;

public class blv
{
  private static final Logger a = ;
  private int b;
  private final int c;
  private final int d;
  private final IntBuffer e;
  private final FloatBuffer f;
  private final String g;
  private boolean h;
  private final blq i;
  
  public blv(String ☃, int ☃, int ☃, blq ☃)
  {
    g = ☃;
    c = ☃;
    d = ☃;
    i = ☃;
    if (☃ <= 3)
    {
      e = BufferUtils.createIntBuffer(☃);
      f = null;
    }
    else
    {
      e = null;
      f = BufferUtils.createFloatBuffer(☃);
    }
    b = -1;
    h();
  }
  
  private void h()
  {
    h = true;
    if (i != null) {
      i.d();
    }
  }
  
  public static int a(String ☃)
  {
    int ☃ = -1;
    if (☃.equals("int")) {
      ☃ = 0;
    } else if (☃.equals("float")) {
      ☃ = 4;
    } else if (☃.startsWith("matrix")) {
      if (☃.endsWith("2x2")) {
        ☃ = 8;
      } else if (☃.endsWith("3x3")) {
        ☃ = 9;
      } else if (☃.endsWith("4x4")) {
        ☃ = 10;
      }
    }
    return ☃;
  }
  
  public void b(int ☃)
  {
    b = ☃;
  }
  
  public String a()
  {
    return g;
  }
  
  public void a(float ☃)
  {
    f.position(0);
    f.put(0, ☃);
    h();
  }
  
  public void a(float ☃, float ☃)
  {
    f.position(0);
    f.put(0, ☃);
    f.put(1, ☃);
    h();
  }
  
  public void a(float ☃, float ☃, float ☃)
  {
    f.position(0);
    f.put(0, ☃);
    f.put(1, ☃);
    f.put(2, ☃);
    h();
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃)
  {
    f.position(0);
    f.put(☃);
    f.put(☃);
    f.put(☃);
    f.put(☃);
    f.flip();
    h();
  }
  
  public void b(float ☃, float ☃, float ☃, float ☃)
  {
    f.position(0);
    if (d >= 4) {
      f.put(0, ☃);
    }
    if (d >= 5) {
      f.put(1, ☃);
    }
    if (d >= 6) {
      f.put(2, ☃);
    }
    if (d >= 7) {
      f.put(3, ☃);
    }
    h();
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃)
  {
    e.position(0);
    if (d >= 0) {
      e.put(0, ☃);
    }
    if (d >= 1) {
      e.put(1, ☃);
    }
    if (d >= 2) {
      e.put(2, ☃);
    }
    if (d >= 3) {
      e.put(3, ☃);
    }
    h();
  }
  
  public void a(float[] ☃)
  {
    if (☃.length < c)
    {
      a.warn("Uniform.set called with a too-small value array (expected " + c + ", got " + ☃.length + "). Ignoring.");
      return;
    }
    f.position(0);
    f.put(☃);
    f.position(0);
    h();
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    f.position(0);
    f.put(0, ☃);
    f.put(1, ☃);
    f.put(2, ☃);
    f.put(3, ☃);
    f.put(4, ☃);
    f.put(5, ☃);
    f.put(6, ☃);
    f.put(7, ☃);
    f.put(8, ☃);
    f.put(9, ☃);
    f.put(10, ☃);
    f.put(11, ☃);
    f.put(12, ☃);
    f.put(13, ☃);
    f.put(14, ☃);
    f.put(15, ☃);
    h();
  }
  
  public void a(Matrix4f ☃)
  {
    a(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33);
  }
  
  public void b()
  {
    if (!h) {}
    h = false;
    if (d <= 3)
    {
      i();
    }
    else if (d <= 7)
    {
      j();
    }
    else if (d <= 10)
    {
      k();
    }
    else
    {
      a.warn("Uniform.upload called, but type value (" + d + ") is not " + "a valid type. Ignoring.");
      return;
    }
  }
  
  private void i()
  {
    switch (d)
    {
    case 0: 
      bqs.a(b, e);
      break;
    case 1: 
      bqs.b(b, e);
      break;
    case 2: 
      bqs.c(b, e);
      break;
    case 3: 
      bqs.d(b, e);
      break;
    default: 
      a.warn("Uniform.upload called, but count value (" + c + ") is " + " not in the range of 1 to 4. Ignoring.");
    }
  }
  
  private void j()
  {
    switch (d)
    {
    case 4: 
      bqs.a(b, f);
      break;
    case 5: 
      bqs.b(b, f);
      break;
    case 6: 
      bqs.c(b, f);
      break;
    case 7: 
      bqs.d(b, f);
      break;
    default: 
      a.warn("Uniform.upload called, but count value (" + c + ") is " + "not in the range of 1 to 4. Ignoring.");
    }
  }
  
  private void k()
  {
    switch (d)
    {
    case 8: 
      bqs.a(b, true, f);
      break;
    case 9: 
      bqs.b(b, true, f);
      break;
    case 10: 
      bqs.c(b, true, f);
    }
  }
}
