import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Map;
import java.util.UUID;

public class mc
  extends mb<GameProfile, md>
{
  public mc(File ☃)
  {
    super(☃);
  }
  
  protected ma<GameProfile> a(JsonObject ☃)
  {
    return new md(☃);
  }
  
  public boolean a(GameProfile ☃)
  {
    return d(☃);
  }
  
  public String[] a()
  {
    String[] ☃ = new String[e().size()];
    int ☃ = 0;
    for (md ☃ : e().values()) {
      ☃[(☃++)] = ((GameProfile)☃.f()).getName();
    }
    return ☃;
  }
  
  protected String b(GameProfile ☃)
  {
    return ☃.getId().toString();
  }
  
  public GameProfile a(String ☃)
  {
    for (md ☃ : e().values()) {
      if (☃.equalsIgnoreCase(((GameProfile)☃.f()).getName())) {
        return (GameProfile)☃.f();
      }
    }
    return null;
  }
}
