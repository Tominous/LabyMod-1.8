import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class auz
{
  private static final IntBuffer a = avd.f(16);
  private static final FloatBuffer b = avd.h(16);
  private static final FloatBuffer c = avd.h(16);
  private static final FloatBuffer d = avd.h(3);
  private static aui e = new aui(0.0D, 0.0D, 0.0D);
  private static float f;
  private static float g;
  private static float h;
  private static float i;
  private static float j;
  
  public static void a(wn ☃, boolean ☃)
  {
    bfl.a(2982, b);
    bfl.a(2983, c);
    GL11.glGetInteger(2978, a);
    
    float ☃ = (a.get(0) + a.get(2)) / 2;
    float ☃ = (a.get(1) + a.get(3)) / 2;
    GLU.gluUnProject(☃, ☃, 0.0F, b, c, a, d);
    
    e = new aui(d.get(0), d.get(1), d.get(2));
    
    int ☃ = ☃ ? 1 : 0;
    
    float ☃ = ☃.z;
    float ☃ = ☃.y;
    
    f = ns.b(☃ * 3.1415927F / 180.0F) * (1 - ☃ * 2);
    h = ns.a(☃ * 3.1415927F / 180.0F) * (1 - ☃ * 2);
    
    i = -h * ns.a(☃ * 3.1415927F / 180.0F) * (1 - ☃ * 2);
    j = f * ns.a(☃ * 3.1415927F / 180.0F) * (1 - ☃ * 2);
    g = ns.b(☃ * 3.1415927F / 180.0F);
  }
  
  public static aui a(pk ☃, double ☃)
  {
    double ☃ = ☃.p + (☃.s - ☃.p) * ☃;
    double ☃ = ☃.q + (☃.t - ☃.q) * ☃;
    double ☃ = ☃.r + (☃.u - ☃.r) * ☃;
    
    double ☃ = ☃ + e.a;
    double ☃ = ☃ + e.b;
    double ☃ = ☃ + e.c;
    
    return new aui(☃, ☃, ☃);
  }
  
  public static afh a(adm ☃, pk ☃, float ☃)
  {
    aui ☃ = a(☃, ☃);
    cj ☃ = new cj(☃);
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if (☃.t().d())
    {
      float ☃ = 0.0F;
      if ((☃.c() instanceof ahv)) {
        ☃ = ahv.b(((Integer)☃.b(ahv.b)).intValue()) - 0.11111111F;
      }
      float ☃ = ☃.o() + 1 - ☃;
      if (☃.b >= ☃) {
        ☃ = ☃.p(☃.a()).c();
      }
    }
    return ☃;
  }
  
  public static aui a()
  {
    return e;
  }
  
  public static float b()
  {
    return f;
  }
  
  public static float c()
  {
    return g;
  }
  
  public static float d()
  {
    return h;
  }
  
  public static float e()
  {
    return i;
  }
  
  public static float f()
  {
    return j;
  }
}
