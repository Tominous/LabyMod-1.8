import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;

class bdc$1
  implements bnp.a
{
  bdc$1(bdc this$0) {}
  
  public void a(MinecraftProfileTexture.Type p_180521_1_, jy location, MinecraftProfileTexture profileTexture)
  {
    switch (bdc.2.$SwitchMap$com$mojang$authlib$minecraft$MinecraftProfileTexture$Type[p_180521_1_.ordinal()])
    {
    case 1: 
      bdc.a(this.this$0, location);
      bdc.a(this.this$0, profileTexture.getMetadata("model"));
      if (bdc.a(this.this$0) == null) {
        bdc.a(this.this$0, "default");
      }
      break;
    case 2: 
      bdc.b(this.this$0, location);
    }
  }
}
