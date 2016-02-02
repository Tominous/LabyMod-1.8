import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class js$b
  implements JsonDeserializer<js>, JsonSerializer<js>
{
  public js a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ni.l(☃, "status");
    js ☃ = new js();
    if (☃.has("description")) {
      ☃.a((eu)☃.deserialize(☃.get("description"), eu.class));
    }
    if (☃.has("players")) {
      ☃.a((js.a)☃.deserialize(☃.get("players"), js.a.class));
    }
    if (☃.has("version")) {
      ☃.a((js.c)☃.deserialize(☃.get("version"), js.c.class));
    }
    if (☃.has("favicon")) {
      ☃.a(ni.h(☃, "favicon"));
    }
    return ☃;
  }
  
  public JsonElement a(js ☃, Type ☃, JsonSerializationContext ☃)
  {
    JsonObject ☃ = new JsonObject();
    if (☃.a() != null) {
      ☃.add("description", ☃.serialize(☃.a()));
    }
    if (☃.b() != null) {
      ☃.add("players", ☃.serialize(☃.b()));
    }
    if (☃.c() != null) {
      ☃.add("version", ☃.serialize(☃.c()));
    }
    if (☃.d() != null) {
      ☃.addProperty("favicon", ☃.d());
    }
    return ☃;
  }
}
