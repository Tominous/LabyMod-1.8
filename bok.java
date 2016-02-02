import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class bok
  extends bnv<boj>
  implements JsonSerializer<boj>
{
  public boj a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ☃.getAsJsonObject();
    eu ☃ = (eu)☃.deserialize(☃.get("description"), eu.class);
    if (☃ == null) {
      throw new JsonParseException("Invalid/missing description!");
    }
    int ☃ = ni.m(☃, "pack_format");
    return new boj(☃, ☃);
  }
  
  public JsonElement a(boj ☃, Type ☃, JsonSerializationContext ☃)
  {
    JsonObject ☃ = new JsonObject();
    
    ☃.addProperty("pack_format", Integer.valueOf(☃.b()));
    ☃.add("description", ☃.serialize(☃.a()));
    
    return ☃;
  }
  
  public String a()
  {
    return "pack";
  }
}
