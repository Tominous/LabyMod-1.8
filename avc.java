import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class avc
{
  private static FloatBuffer a = avd.h(16);
  private static final aui b = new aui(0.20000000298023224D, 1.0D, -0.699999988079071D).a();
  private static final aui c = new aui(-0.20000000298023224D, 1.0D, 0.699999988079071D).a();
  
  public static void a()
  {
    bfl.f();
    bfl.b(0);
    bfl.b(1);
    bfl.h();
  }
  
  public static void b()
  {
    bfl.e();
    bfl.a(0);
    bfl.a(1);
    bfl.g();
    bfl.a(1032, 5634);
    float ☃ = 0.4F;
    float ☃ = 0.6F;
    float ☃ = 0.0F;
    
    GL11.glLight(16384, 4611, a(b.a, b.b, b.c, 0.0D));
    GL11.glLight(16384, 4609, a(☃, ☃, ☃, 1.0F));
    GL11.glLight(16384, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
    GL11.glLight(16384, 4610, a(☃, ☃, ☃, 1.0F));
    
    GL11.glLight(16385, 4611, a(c.a, c.b, c.c, 0.0D));
    GL11.glLight(16385, 4609, a(☃, ☃, ☃, 1.0F));
    GL11.glLight(16385, 4608, a(0.0F, 0.0F, 0.0F, 1.0F));
    GL11.glLight(16385, 4610, a(☃, ☃, ☃, 1.0F));
    
    bfl.j(7424);
    GL11.glLightModel(2899, a(☃, ☃, ☃, 1.0F));
  }
  
  private static FloatBuffer a(double ☃, double ☃, double ☃, double ☃)
  {
    return a((float)☃, (float)☃, (float)☃, (float)☃);
  }
  
  private static FloatBuffer a(float ☃, float ☃, float ☃, float ☃)
  {
    a.clear();
    a.put(☃).put(☃).put(☃).put(☃);
    a.flip();
    return a;
  }
  
  public static void c()
  {
    bfl.E();
    bfl.b(-30.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(165.0F, 1.0F, 0.0F, 0.0F);
    b();
    bfl.F();
  }
}
