import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import java.util.UUID;

public class md
  extends ls<GameProfile>
{
  public md(GameProfile ☃)
  {
    this(☃, null, null, null, null);
  }
  
  public md(GameProfile ☃, Date ☃, String ☃, Date ☃, String ☃)
  {
    super(☃, ☃, ☃, ☃, ☃);
  }
  
  public md(JsonObject ☃)
  {
    super(b(☃), ☃);
  }
  
  protected void a(JsonObject ☃)
  {
    if (f() == null) {
      return;
    }
    ☃.addProperty("uuid", ((GameProfile)f()).getId() == null ? "" : ((GameProfile)f()).getId().toString());
    ☃.addProperty("name", ((GameProfile)f()).getName());
    super.a(☃);
  }
  
  private static GameProfile b(JsonObject ☃)
  {
    if ((!☃.has("uuid")) || (!☃.has("name"))) {
      return null;
    }
    String ☃ = ☃.get("uuid").getAsString();
    UUID ☃;
    try
    {
      ☃ = UUID.fromString(☃);
    }
    catch (Throwable ☃)
    {
      return null;
    }
    return new GameProfile(☃, ☃.get("name").getAsString());
  }
}
