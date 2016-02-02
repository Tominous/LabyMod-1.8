import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

final class lw$5
  implements ProfileLookupCallback
{
  lw$5(MinecraftServer paramMinecraftServer, List paramList) {}
  
  public void onProfileLookupSucceeded(GameProfile ☃)
  {
    this.a.aF().a(☃);
    this.b.add(☃);
  }
  
  public void onProfileLookupFailed(GameProfile ☃, Exception ☃)
  {
    lw.a().warn("Could not lookup user whitelist entry for " + ☃.getName(), ☃);
  }
}
