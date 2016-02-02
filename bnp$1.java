import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.util.Map;

class bnp$1
  extends CacheLoader<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>>
{
  bnp$1(bnp parambnp) {}
  
  public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile ☃)
    throws Exception
  {
    return ave.A().aa().getTextures(☃, false);
  }
}
