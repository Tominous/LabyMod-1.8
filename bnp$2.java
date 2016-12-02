import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.awt.image.BufferedImage;

class bnp$2
  implements bfm
{
  bnp$2(bnp this$0, bfm parambfm, bnp.a parama, MinecraftProfileTexture.Type paramType, jy paramjy, MinecraftProfileTexture paramMinecraftProfileTexture) {}
  
  public BufferedImage a(BufferedImage image)
  {
    if (val$iimagebuffer != null) {
      image = val$iimagebuffer.a(image);
    }
    return image;
  }
  
  public void a()
  {
    if (val$iimagebuffer != null) {
      val$iimagebuffer.a();
    }
    if (val$skinAvailableCallback != null) {
      val$skinAvailableCallback.a(val$p_152789_2_, val$resourcelocation, val$profileTexture);
    }
  }
}
