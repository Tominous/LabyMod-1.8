import java.awt.image.BufferedImage;
import java.io.IOException;
import shadersmod.client.ShadersTex;

public class blz
  extends bly
{
  private final int[] f;
  private final int g;
  private final int h;
  private static final String __OBFID = "CL_00001048";
  private boolean shadersInitialized = false;
  
  public blz(BufferedImage p_i1270_1_)
  {
    this(p_i1270_1_.getWidth(), p_i1270_1_.getHeight());
    p_i1270_1_.getRGB(0, 0, p_i1270_1_.getWidth(), p_i1270_1_.getHeight(), f, 0, p_i1270_1_.getWidth());
    d();
  }
  
  public blz(int p_i1271_1_, int p_i1271_2_)
  {
    g = p_i1271_1_;
    h = p_i1271_2_;
    
    f = new int[p_i1271_1_ * p_i1271_2_ * 3];
    if (Config.isShaders())
    {
      ShadersTex.initDynamicTexture(b(), p_i1271_1_, p_i1271_2_, this);
      shadersInitialized = true;
    }
    else
    {
      bml.a(b(), p_i1271_1_, p_i1271_2_);
    }
  }
  
  public void a(bni p_110551_1_)
    throws IOException
  {}
  
  public void d()
  {
    if (Config.isShaders())
    {
      if (!shadersInitialized)
      {
        ShadersTex.initDynamicTexture(b(), g, h, this);
        shadersInitialized = true;
      }
      ShadersTex.updateDynamicTexture(b(), f, g, h, this);
    }
    else
    {
      bml.a(b(), f, g, h);
    }
  }
  
  public int[] e()
  {
    return f;
  }
}
