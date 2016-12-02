import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class lz
  extends ma<GameProfile>
{
  private final int a;
  private final boolean b;
  
  public lz(GameProfile ☃, int ☃, boolean ☃)
  {
    super(☃);
    a = ☃;
    b = ☃;
  }
  
  public lz(JsonObject ☃)
  {
    super(b(☃), ☃);
    a = (☃.has("level") ? ☃.get("level").getAsInt() : 0);
    b = ((☃.has("bypassesPlayerLimit")) && (☃.get("bypassesPlayerLimit").getAsBoolean()));
  }
  
  public int a()
  {
    return a;
  }
  
  public boolean b()
  {
    return b;
  }
  
  protected void a(JsonObject ☃)
  {
    if (f() == null) {
      return;
    }
    ☃.addProperty("uuid", ((GameProfile)f()).getId() == null ? "" : ((GameProfile)f()).getId().toString());
    ☃.addProperty("name", ((GameProfile)f()).getName());
    super.a(☃);
    ☃.addProperty("level", Integer.valueOf(a));
    ☃.addProperty("bypassesPlayerLimit", Boolean.valueOf(b));
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
