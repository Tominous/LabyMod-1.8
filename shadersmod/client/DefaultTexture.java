package shadersmod.client;

import bly;
import bni;

public class DefaultTexture
  extends bly
{
  public DefaultTexture()
  {
    a(null);
  }
  
  public void a(bni resourcemanager)
  {
    int[] aint = ShadersTex.createAIntImage(1, -1);
    ShadersTex.setupTexture(getMultiTexID(), aint, 1, 1, false, false);
  }
}
