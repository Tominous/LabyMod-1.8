import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;

class bdc$1
  implements bnp.a
{
  bdc$1(bdc parambdc) {}
  
  public void a(MinecraftProfileTexture.Type ☃, jy ☃, MinecraftProfileTexture ☃)
  {
    switch (bdc.2.a[☃.ordinal()])
    {
    case 1: 
      bdc.a(this.a, ☃);
      bdc.a(this.a, ☃.getMetadata("model"));
      if (bdc.a(this.a) == null) {
        bdc.a(this.a, "default");
      }
      break;
    case 2: 
      bdc.b(this.a, ☃);
    }
  }
}
