import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class avd
{
  public static synchronized int a(int ☃)
  {
    int ☃ = GL11.glGenLists(☃);
    if (☃ == 0)
    {
      int ☃ = GL11.glGetError();
      String ☃ = "No error code reported";
      if (☃ != 0) {
        ☃ = GLU.gluErrorString(☃);
      }
      throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + ☃ + ", GL error (" + ☃ + "): " + ☃);
    }
    return ☃;
  }
  
  public static synchronized void a(int ☃, int ☃)
  {
    GL11.glDeleteLists(☃, ☃);
  }
  
  public static synchronized void b(int ☃)
  {
    GL11.glDeleteLists(☃, 1);
  }
  
  public static synchronized ByteBuffer c(int ☃)
  {
    return ByteBuffer.allocateDirect(☃).order(ByteOrder.nativeOrder());
  }
  
  public static IntBuffer f(int ☃)
  {
    return c(☃ << 2).asIntBuffer();
  }
  
  public static FloatBuffer h(int ☃)
  {
    return c(☃ << 2).asFloatBuffer();
  }
}
