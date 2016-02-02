import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map.Entry;
import java.util.Set;

public class boh
  extends bnv<bog>
{
  public bog a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ☃.getAsJsonObject();
    Set<bnr> ☃ = Sets.newHashSet();
    for (Map.Entry<String, JsonElement> ☃ : ☃.entrySet())
    {
      String ☃ = (String)☃.getKey();
      JsonObject ☃ = ni.l((JsonElement)☃.getValue(), "language");
      String ☃ = ni.h(☃, "region");
      String ☃ = ni.h(☃, "name");
      boolean ☃ = ni.a(☃, "bidirectional", false);
      if (☃.isEmpty()) {
        throw new JsonParseException("Invalid language->'" + ☃ + "'->region: empty value");
      }
      if (☃.isEmpty()) {
        throw new JsonParseException("Invalid language->'" + ☃ + "'->name: empty value");
      }
      if (!☃.add(new bnr(☃, ☃, ☃, ☃))) {
        throw new JsonParseException("Duplicate language->'" + ☃ + "' defined");
      }
    }
    return new bog(☃);
  }
  
  public String a()
  {
    return "language";
  }
}
