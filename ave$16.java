import java.util.concurrent.Callable;
import org.lwjgl.opengl.GL11;

class ave$16
  implements Callable<String>
{
  ave$16(ave paramave) {}
  
  public String a()
  {
    return GL11.glGetString(7937) + " GL version " + GL11.glGetString(7938) + ", " + GL11.glGetString(7936);
  }
}
