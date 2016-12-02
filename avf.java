import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class avf
{
  public int a;
  public int b;
  
  public void a()
  {
    Mouse.setGrabbed(true);
    a = 0;
    b = 0;
  }
  
  public void b()
  {
    Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
    Mouse.setGrabbed(false);
  }
  
  public void c()
  {
    a = Mouse.getDX();
    b = Mouse.getDY();
  }
}
