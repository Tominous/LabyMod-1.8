import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

public class bmt
{
  private int a;
  private final bmu b;
  private int c;
  
  public bmt(bmu ☃)
  {
    b = ☃;
    a = bqs.e();
  }
  
  public void a()
  {
    bqs.g(bqs.R, a);
  }
  
  public void a(ByteBuffer ☃)
  {
    a();
    bqs.a(bqs.R, ☃, 35044);
    b();
    c = (☃.limit() / b.g());
  }
  
  public void a(int ☃)
  {
    GL11.glDrawArrays(☃, 0, c);
  }
  
  public void b()
  {
    bqs.g(bqs.R, 0);
  }
  
  public void c()
  {
    if (a >= 0)
    {
      bqs.g(a);
      a = -1;
    }
  }
}
