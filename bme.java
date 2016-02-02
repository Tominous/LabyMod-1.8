import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import shadersmod.client.ShadersTex;

public class bme
  extends bly
{
  private static final Logger g = ;
  protected final jy f;
  private static final String __OBFID = "CL_00001052";
  
  public bme(jy p_i1275_1_)
  {
    this.f = p_i1275_1_;
  }
  
  public void a(bni p_110551_1_)
    throws IOException
  {
    c();
    InputStream var2 = null;
    try
    {
      bnh var3 = p_110551_1_.a(this.f);
      var2 = var3.b();
      BufferedImage var4 = bml.a(var2);
      boolean var5 = false;
      boolean var6 = false;
      if (var3.c()) {
        try
        {
          bon var7 = (bon)var3.a("texture");
          if (var7 != null)
          {
            var5 = var7.a();
            var6 = var7.b();
          }
        }
        catch (RuntimeException var11)
        {
          g.warn("Failed reading metadata of: " + this.f, var11);
        }
      }
      if (Config.isShaders()) {
        ShadersTex.loadSimpleTexture(b(), var4, var5, var6, p_110551_1_, this.f, getMultiTexID());
      } else {
        bml.a(b(), var4, var5, var6);
      }
    }
    finally
    {
      if (var2 != null) {
        var2.close();
      }
    }
  }
}
