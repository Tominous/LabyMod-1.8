import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

final class lt$1
  implements ProfileLookupCallback
{
  lt$1(GameProfile[] paramArrayOfGameProfile) {}
  
  public void onProfileLookupSucceeded(GameProfile ☃)
  {
    this.a[0] = ☃;
  }
  
  public void onProfileLookupFailed(GameProfile ☃, Exception ☃)
  {
    this.a[0] = null;
  }
}
