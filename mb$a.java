import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

class mb$a
  implements JsonDeserializer<ma<K>>, JsonSerializer<ma<K>>
{
  private mb$a(mb parammb) {}
  
  public JsonElement a(ma<K> ☃, Type ☃, JsonSerializationContext ☃)
  {
    JsonObject ☃ = new JsonObject();
    ☃.a(☃);
    return ☃;
  }
  
  public ma<K> a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    if (☃.isJsonObject())
    {
      JsonObject ☃ = ☃.getAsJsonObject();
      ma<K> ☃ = a.a(☃);
      return ☃;
    }
    return null;
  }
}
