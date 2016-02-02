import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;
import shadersmod.client.ShadersRender;

public class bfy
  extends bfh
{
  private static final String __OBFID = "CL_00002533";
  
  public void a(adf p_178001_1_)
  {
    if (this.b)
    {
      Iterator var2 = this.a.iterator();
      while (var2.hasNext())
      {
        bht var3 = (bht)var2.next();
        bmt var4 = var3.b(p_178001_1_.ordinal());
        bfl.E();
        a(var3);
        var3.f();
        var4.a();
        a();
        var4.a(7);
        bfl.F();
      }
      bqs.g(bqs.R, 0);
      bfl.G();
      this.a.clear();
    }
  }
  
  private void a()
  {
    if (Config.isShaders())
    {
      ShadersRender.setupArrayPointersVbo();
      return;
    }
    GL11.glVertexPointer(3, 5126, 28, 0L);
    GL11.glColorPointer(4, 5121, 28, 12L);
    GL11.glTexCoordPointer(2, 5126, 28, 16L);
    bqs.l(bqs.r);
    GL11.glTexCoordPointer(2, 5122, 28, 24L);
    bqs.l(bqs.q);
  }
}
