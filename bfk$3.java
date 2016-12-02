import java.util.concurrent.Callable;
import org.lwjgl.input.Mouse;

class bfk$3
  implements Callable
{
  private static final String __OBFID = "CL_00000950";
  
  bfk$3(bfk parambfk, int paramInt1, int paramInt2) {}
  
  public String a()
    throws Exception
  {
    return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", new Object[] { Integer.valueOf(val$var20), Integer.valueOf(val$var21), Integer.valueOf(Mouse.getX()), Integer.valueOf(Mouse.getY()) });
  }
}
