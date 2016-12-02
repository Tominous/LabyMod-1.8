import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

public class bmt
{
  private int a;
  private final bmu b;
  private int c;
  
  public bmt(bmu ☃)
  {
    this.b = ☃;
    this.a = bqs.e();
  }
  
  public void a()
  {
    bqs.g(bqs.R, this.a);
  }
  
  public void a(ByteBuffer ☃)
  {
    a();
    bqs.a(bqs.R, ☃, 35044);
    b();
    this.c = (☃.limit() / this.b.g());
  }
  
  public void a(int ☃)
  {
    GL11.glDrawArrays(☃, 0, this.c);
  }
  
  public void b()
  {
    bqs.g(bqs.R, 0);
  }
  
  public void c()
  {
    if (this.a >= 0)
    {
      bqs.g(this.a);
      this.a = -1;
    }
  }
}
