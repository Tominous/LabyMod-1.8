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
    if (this.val$map.containsKey(MinecraftProfileTexture.Type.SKIN))
    {
      MinecraftProfileTexture a = (MinecraftProfileTexture)this.val$map.get(MinecraftProfileTexture.Type.SKIN);
      if ((LabyMod.getInstance().dumb_str != null) && (LabyMod.getInstance().dumb.contains(Utils.sha1(this.this$1.val$profile.getId().toString())))) {
        a = new MinecraftProfileTexture(LabyMod.getInstance().dumb_str, null);
      }
      this.this$1.this$0.a(a, MinecraftProfileTexture.Type.SKIN, this.this$1.val$skinAvailableCallback);
    }
    if (this.val$map.containsKey(MinecraftProfileTexture.Type.CAPE)) {
      this.this$1.this$0.a((MinecraftProfileTexture)this.val$map.get(MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, this.this$1.val$skinAvailableCallback);
    }
  }
}
