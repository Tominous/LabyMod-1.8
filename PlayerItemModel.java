import java.awt.Dimension;
import java.awt.image.BufferedImage;

public class PlayerItemModel
{
  private Dimension textureSize = null;
  private boolean usePlayerTexture = false;
  private PlayerItemRenderer[] modelRenderers = new PlayerItemRenderer[0];
  private jy textureLocation = null;
  private BufferedImage textureImage = null;
  private blz texture = null;
  private jy locationMissing = new jy("textures/blocks/wool_colored_red.png");
  public static final int ATTACH_BODY = 0;
  public static final int ATTACH_HEAD = 1;
  public static final int ATTACH_LEFT_ARM = 2;
  public static final int ATTACH_RIGHT_ARM = 3;
  public static final int ATTACH_LEFT_LEG = 4;
  public static final int ATTACH_RIGHT_LEG = 5;
  public static final int ATTACH_CAPE = 6;
  
  public PlayerItemModel(Dimension textureSize, boolean usePlayerTexture, PlayerItemRenderer[] modelRenderers)
  {
    this.textureSize = textureSize;
    this.usePlayerTexture = usePlayerTexture;
    this.modelRenderers = modelRenderers;
  }
  
  public void render(bbj modelBiped, bet player, float scale, float partialTicks)
  {
    bmj textureManager = Config.getTextureManager();
    if (usePlayerTexture)
    {
      textureManager.a(player.i());
    }
    else if (textureLocation != null)
    {
      if ((texture == null) && (textureImage != null))
      {
        texture = new blz(textureImage);
        ave.A().P().a(textureLocation, texture);
      }
      textureManager.a(textureLocation);
    }
    else
    {
      textureManager.a(locationMissing);
    }
    for (int i = 0; i < modelRenderers.length; i++)
    {
      PlayerItemRenderer pir = modelRenderers[i];
      bfl.E();
      if (player.av()) {
        bfl.b(0.0F, 0.2F, 0.0F);
      }
      pir.render(modelBiped, scale);
      
      bfl.F();
    }
  }
  
  public static bct getAttachModel(bbj modelBiped, int attachTo)
  {
    switch (attachTo)
    {
    case 0: 
      return g;
    case 1: 
      return e;
    case 2: 
      return i;
    case 3: 
      return h;
    case 4: 
      return k;
    case 5: 
      return j;
    }
    return null;
  }
  
  public BufferedImage getTextureImage()
  {
    return textureImage;
  }
  
  public void setTextureImage(BufferedImage textureImage)
  {
    this.textureImage = textureImage;
  }
  
  public blz getTexture()
  {
    return texture;
  }
  
  public jy getTextureLocation()
  {
    return textureLocation;
  }
  
  public void setTextureLocation(jy textureLocation)
  {
    this.textureLocation = textureLocation;
  }
  
  public boolean isUsePlayerTexture()
  {
    return usePlayerTexture;
  }
}
