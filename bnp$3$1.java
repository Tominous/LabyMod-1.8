import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Utils;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

class bnp$3$1
  implements Runnable
{
  bnp$3$1(bnp.3 this$1, Map paramMap) {}
  
  public void run()
  {
    if (val$map.containsKey(MinecraftProfileTexture.Type.SKIN))
    {
      MinecraftProfileTexture a = (MinecraftProfileTexture)val$map.get(MinecraftProfileTexture.Type.SKIN);
      if ((getInstancedumb_str != null) && (getInstancedumb.contains(Utils.sha1(this$1.val$profile.getId().toString())))) {
        a = new MinecraftProfileTexture(getInstancedumb_str, null);
      }
      this$1.this$0.a(a, MinecraftProfileTexture.Type.SKIN, this$1.val$skinAvailableCallback);
    }
    if (val$map.containsKey(MinecraftProfileTexture.Type.CAPE)) {
      this$1.this$0.a((MinecraftProfileTexture)val$map.get(MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, this$1.val$skinAvailableCallback);
    }
  }
}
