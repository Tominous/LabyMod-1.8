import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.awt.image.BufferedImage;

class bnp$2
  implements bfm
{
  bnp$2(bnp parambnp, bfm parambfm, bnp.a parama, MinecraftProfileTexture.Type paramType, jy paramjy, MinecraftProfileTexture paramMinecraftProfileTexture) {}
  
  public BufferedImage a(BufferedImage ☃)
  {
    if (this.a != null) {
      ☃ = this.a.a(☃);
    }
    return ☃;
  }
  
  public void a()
  {
    if (this.a != null) {
      this.a.a();
    }
    if (this.b != null) {
      this.b.a(this.c, this.d, this.e);
    }
  }
}
