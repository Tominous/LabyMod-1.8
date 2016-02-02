import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map.Entry;

public class bgm$a
  implements JsonDeserializer<bgm>
{
  public bgm a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ☃.getAsJsonObject();
    
    List<bgm.d> ☃ = a(☃, ☃);
    
    return new bgm(☃);
  }
  
  protected List<bgm.d> a(JsonDeserializationContext ☃, JsonObject ☃)
  {
    JsonObject ☃ = ni.s(☃, "variants");
    
    List<bgm.d> ☃ = Lists.newArrayList();
    for (Map.Entry<String, JsonElement> ☃ : ☃.entrySet()) {
      ☃.add(a(☃, ☃));
    }
    return ☃;
  }
  
  protected bgm.d a(JsonDeserializationContext ☃, Map.Entry<String, JsonElement> ☃)
  {
    String ☃ = (String)☃.getKey();
    
    List<bgm.c> ☃ = Lists.newArrayList();
    JsonElement ☃ = (JsonElement)☃.getValue();
    if (☃.isJsonArray()) {
      for (JsonElement ☃ : ☃.getAsJsonArray()) {
        ☃.add((bgm.c)☃.deserialize(☃, bgm.c.class));
      }
    } else {
      ☃.add((bgm.c)☃.deserialize(☃, bgm.c.class));
    }
    return new bgm.d(☃, ☃);
  }
}
