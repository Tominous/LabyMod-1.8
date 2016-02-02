import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

class bgr$a
  implements JsonDeserializer<bgr>
{
  public bgr a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ☃.getAsJsonObject();
    
    bgq ☃ = a(☃, ☃, "thirdperson");
    bgq ☃ = a(☃, ☃, "firstperson");
    bgq ☃ = a(☃, ☃, "head");
    bgq ☃ = a(☃, ☃, "gui");
    bgq ☃ = a(☃, ☃, "ground");
    bgq ☃ = a(☃, ☃, "fixed");
    
    return new bgr(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  private bgq a(JsonDeserializationContext ☃, JsonObject ☃, String ☃)
  {
    if (☃.has(☃)) {
      return (bgq)☃.deserialize(☃.get(☃), bgq.class);
    }
    return bgq.a;
  }
}
