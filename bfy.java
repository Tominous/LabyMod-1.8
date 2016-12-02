import java.util.List;
import org.lwjgl.opengl.GL11;

public class bfy
  extends bfh
{
  public void a(adf ☃)
  {
    if (!this.b) {
      return;
    }
    for (bht ☃ : this.a)
    {
      bmt ☃ = ☃.b(☃.ordinal());
      
      bfl.E();
      a(☃);
      ☃.f();
      
      ☃.a();
      
      a();
      
      ☃.a(7);
      
      bfl.F();
    }
    bqs.g(bqs.R, 0);
    
    bfl.G();
    
    this.a.clear();
  }
  
  private void a()
  {
    GL11.glVertexPointer(3, 5126, 28, 0L);
    GL11.glColorPointer(4, 5121, 28, 12L);
    GL11.glTexCoordPointer(2, 5126, 28, 16L);
    bqs.l(bqs.r);
    GL11.glTexCoordPointer(2, 5122, 28, 24L);
    bqs.l(bqs.q);
  }
}
