import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.awt.image.BufferedImage;

class bnp$2
  implements bfm
{
  bnp$2(bnp this$0, bfm parambfm, bnp.a parama, MinecraftProfileTexture.Type paramType, jy paramjy, MinecraftProfileTexture paramMinecraftProfileTexture) {}
  
  public BufferedImage a(BufferedImage image)
  {
    if (this.val$iimagebuffer != null) {
      image = this.val$iimagebuffer.a(image);
    }
    return image;
  }
  
  public void a()
  {
    if (this.val$iimagebuffer != null) {
      this.val$iimagebuffer.a();
    }
    if (this.val$skinAvailableCallback != null) {
      this.val$skinAvailableCallback.a(this.val$p_152789_2_, this.val$resourcelocation, this.val$profileTexture);
    }
  }
}
