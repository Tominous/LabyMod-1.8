import java.util.List;
import org.lwjgl.opengl.GL11;

public class bft
  extends bfh
{
  public void a(adf ☃)
  {
    if (!this.b) {
      return;
    }
    for (bht ☃ : this.a)
    {
      bhs ☃ = (bhs)☃;
      
      bfl.E();
      a(☃);
      
      GL11.glCallList(☃.a(☃, ☃.g()));
      
      bfl.F();
    }
    bfl.G();
    this.a.clear();
  }
}
