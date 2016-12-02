import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.util.HashMap;
import java.util.Map;

class bnp$1
  extends CacheLoader<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>>
{
  bnp$1(bnp this$0) {}
  
  public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile p_load_1_)
    throws Exception
  {
    try
    {
      return ave.A().aa().getTextures(p_load_1_, false);
    }
    catch (Exception error) {}
    return new HashMap();
  }
}
