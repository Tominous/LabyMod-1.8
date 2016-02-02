import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;
import java.util.Map;
import java.util.UUID;

class bnp$3
  implements Runnable
{
  bnp$3(bnp parambnp, GameProfile paramGameProfile, boolean paramBoolean, bnp.a parama) {}
  
  public void run()
  {
    final Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> ☃ = Maps.newHashMap();
    try
    {
      ☃.putAll(bnp.a(this.d).getTextures(this.a, this.b));
    }
    catch (InsecureTextureException localInsecureTextureException) {}
    if ((☃.isEmpty()) && (this.a.getId().equals(ave.A().L().e().getId())))
    {
      this.a.getProperties().clear();
      this.a.getProperties().putAll(ave.A().N());
      ☃.putAll(bnp.a(this.d).getTextures(this.a, false));
    }
    ave.A().a(new Runnable()
    {
      public void run()
      {
        if (☃.containsKey(MinecraftProfileTexture.Type.SKIN)) {
          bnp.3.this.d.a((MinecraftProfileTexture)☃.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, bnp.3.this.c);
        }
        if (☃.containsKey(MinecraftProfileTexture.Type.CAPE)) {
          bnp.3.this.d.a((MinecraftProfileTexture)☃.get(MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, bnp.3.this.c);
        }
      }
    });
  }
}
