import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;

public class js$a
{
  private final int a;
  private final int b;
  private GameProfile[] c;
  
  public js$a(int ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public GameProfile[] c()
  {
    return this.c;
  }
  
  public void a(GameProfile[] ☃)
  {
    this.c = ☃;
  }
  
  public static class a
    implements JsonDeserializer<js.a>, JsonSerializer<js.a>
  {
    public js.a a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
      throws JsonParseException
    {
      JsonObject ☃ = ni.l(☃, "players");
      js.a ☃ = new js.a(ni.m(☃, "max"), ni.m(☃, "online"));
      if (ni.d(☃, "sample"))
      {
        JsonArray ☃ = ni.t(☃, "sample");
        if (☃.size() > 0)
        {
          GameProfile[] ☃ = new GameProfile[☃.size()];
          for (int ☃ = 0; ☃ < ☃.length; ☃++)
          {
            JsonObject ☃ = ni.l(☃.get(☃), "player[" + ☃ + "]");
            String ☃ = ni.h(☃, "id");
            ☃[☃] = new GameProfile(UUID.fromString(☃), ni.h(☃, "name"));
          }
          ☃.a(☃);
        }
      }
      return ☃;
    }
    
    public JsonElement a(js.a ☃, Type ☃, JsonSerializationContext ☃)
    {
      JsonObject ☃ = new JsonObject();
      
      ☃.addProperty("max", Integer.valueOf(☃.a()));
      ☃.addProperty("online", Integer.valueOf(☃.b()));
      if ((☃.c() != null) && (☃.c().length > 0))
      {
        JsonArray ☃ = new JsonArray();
        for (int ☃ = 0; ☃ < ☃.c().length; ☃++)
        {
          JsonObject ☃ = new JsonObject();
          UUID ☃ = ☃.c()[☃].getId();
          ☃.addProperty("id", ☃ == null ? "" : ☃.toString());
          ☃.addProperty("name", ☃.c()[☃].getName());
          ☃.add(☃);
        }
        ☃.add("sample", ☃);
      }
      return ☃;
    }
  }
}
