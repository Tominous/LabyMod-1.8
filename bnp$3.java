import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Utils;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

class bnp$3
  implements Runnable
{
  bnp$3(bnp this$0, GameProfile paramGameProfile, boolean paramBoolean, bnp.a parama) {}
  
  public void run()
  {
    final Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> map = Maps.newHashMap();
    try
    {
      map.putAll(bnp.a(this$0).getTextures(val$profile, val$requireSecure));
    }
    catch (InsecureTextureException localInsecureTextureException) {}
    if ((map.isEmpty()) && (val$profile.getId().equals(ave.A().L().e().getId())))
    {
      val$profile.getProperties().clear();
      val$profile.getProperties().putAll(ave.A().N());
      map.putAll(bnp.a(this$0).getTextures(val$profile, false));
    }
    ave.A().a(new Runnable()
    {
      public void run()
      {
        if (map.containsKey(MinecraftProfileTexture.Type.SKIN))
        {
          MinecraftProfileTexture a = (MinecraftProfileTexture)map.get(MinecraftProfileTexture.Type.SKIN);
          if ((getInstancedumb_str != null) && (getInstancedumb.contains(Utils.sha1(val$profile.getId().toString())))) {
            a = new MinecraftProfileTexture(getInstancedumb_str, null);
          }
          this$0.a(a, MinecraftProfileTexture.Type.SKIN, val$skinAvailableCallback);
        }
        if (map.containsKey(MinecraftProfileTexture.Type.CAPE)) {
          this$0.a((MinecraftProfileTexture)map.get(MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, val$skinAvailableCallback);
        }
      }
    });
  }
}
