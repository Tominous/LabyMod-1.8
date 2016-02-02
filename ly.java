import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Map;
import java.util.UUID;

public class ly
  extends mb<GameProfile, lz>
{
  public ly(File ☃)
  {
    super(☃);
  }
  
  protected ma<GameProfile> a(JsonObject ☃)
  {
    return new lz(☃);
  }
  
  public String[] a()
  {
    String[] ☃ = new String[e().size()];
    int ☃ = 0;
    for (lz ☃ : e().values()) {
      ☃[(☃++)] = ((GameProfile)☃.f()).getName();
    }
    return ☃;
  }
  
  public boolean b(GameProfile ☃)
  {
    lz ☃ = (lz)b(☃);
    if (☃ != null) {
      return ☃.b();
    }
    return false;
  }
  
  protected String c(GameProfile ☃)
  {
    return ☃.getId().toString();
  }
  
  public GameProfile a(String ☃)
  {
    for (lz ☃ : e().values()) {
      if (☃.equalsIgnoreCase(((GameProfile)☃.f()).getName())) {
        return (GameProfile)☃.f();
      }
    }
    return null;
  }
}
