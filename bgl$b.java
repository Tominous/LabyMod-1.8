import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringUtils;

public class bgl$b
  implements JsonDeserializer<bgl>
{
  public bgl a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ☃.getAsJsonObject();
    
    List<bgh> ☃ = a(☃, ☃);
    String ☃ = c(☃);
    
    boolean ☃ = StringUtils.isEmpty(☃);
    boolean ☃ = ☃.isEmpty();
    if ((☃) && (☃)) {
      throw new JsonParseException("BlockModel requires either elements or parent, found neither");
    }
    if ((!☃) && (!☃)) {
      throw new JsonParseException("BlockModel requires either elements or parent, found both");
    }
    Map<String, String> ☃ = b(☃);
    boolean ☃ = a(☃);
    
    bgr ☃ = bgr.a;
    if (☃.has("display"))
    {
      JsonObject ☃ = ni.s(☃, "display");
      ☃ = (bgr)☃.deserialize(☃, bgr.class);
    }
    if (☃) {
      return new bgl(new jy(☃), ☃, ☃, true, ☃);
    }
    return new bgl(☃, ☃, ☃, true, ☃);
  }
  
  private Map<String, String> b(JsonObject ☃)
  {
    Map<String, String> ☃ = Maps.newHashMap();
    if (☃.has("textures"))
    {
      JsonObject ☃ = ☃.getAsJsonObject("textures");
      for (Map.Entry<String, JsonElement> ☃ : ☃.entrySet()) {
        ☃.put(☃.getKey(), ((JsonElement)☃.getValue()).getAsString());
      }
    }
    return ☃;
  }
  
  private String c(JsonObject ☃)
  {
    return ni.a(☃, "parent", "");
  }
  
  protected boolean a(JsonObject ☃)
  {
    return ni.a(☃, "ambientocclusion", true);
  }
  
  protected List<bgh> a(JsonDeserializationContext ☃, JsonObject ☃)
  {
    List<bgh> ☃ = Lists.newArrayList();
    if (☃.has("elements")) {
      for (JsonElement ☃ : ni.t(☃, "elements")) {
        ☃.add((bgh)☃.deserialize(☃, bgh.class));
      }
    }
    return ☃;
  }
}
