import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

class lt$b
  implements JsonDeserializer<lt.a>, JsonSerializer<lt.a>
{
  private lt$b(lt paramlt) {}
  
  public JsonElement a(lt.a ☃, Type ☃, JsonSerializationContext ☃)
  {
    JsonObject ☃ = new JsonObject();
    ☃.addProperty("name", ☃.a().getName());
    UUID ☃ = ☃.a().getId();
    ☃.addProperty("uuid", ☃ == null ? "" : ☃.toString());
    ☃.addProperty("expiresOn", lt.a.format(☃.b()));
    return ☃;
  }
  
  public lt.a a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    if (☃.isJsonObject())
    {
      JsonObject ☃ = ☃.getAsJsonObject();
      JsonElement ☃ = ☃.get("name");
      JsonElement ☃ = ☃.get("uuid");
      JsonElement ☃ = ☃.get("expiresOn");
      if ((☃ == null) || (☃ == null)) {
        return null;
      }
      String ☃ = ☃.getAsString();
      String ☃ = ☃.getAsString();
      Date ☃ = null;
      if (☃ != null) {
        try
        {
          ☃ = lt.a.parse(☃.getAsString());
        }
        catch (ParseException ☃)
        {
          ☃ = null;
        }
      }
      if ((☃ == null) || (☃ == null)) {
        return null;
      }
      UUID ☃;
      try
      {
        ☃ = UUID.fromString(☃);
      }
      catch (Throwable ☃)
      {
        return null;
      }
      lt.a ☃ = new lt.a(a, new GameProfile(☃, ☃), ☃, null);
      return ☃;
    }
    return null;
  }
}
