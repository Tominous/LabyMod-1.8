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
      bdc.a(a, ☃);
      bdc.a(a, ☃.getMetadata("model"));
      if (bdc.a(a) == null) {
        bdc.a(a, "default");
      }
      break;
    case 2: 
      bdc.b(a, ☃);
    }
  }
}
