import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class bft
  extends bfh
{
  private static final String __OBFID = "CL_00000957";
  
  public void a(adf p_178001_1_)
  {
    if (b)
    {
      if (a.size() == 0) {
        return;
      }
      Iterator var2 = a.iterator();
      while (var2.hasNext())
      {
        bht var3 = (bht)var2.next();
        bhs var4 = (bhs)var3;
        bfl.E();
        a(var3);
        GL11.glCallList(var4.a(p_178001_1_, var4.g()));
        bfl.F();
      }
      if (Config.isMultiTexture()) {
        bfl.bindCurrentTexture();
      }
      bfl.G();
      a.clear();
    }
  }
}
