import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.util.vector.Vector3f;

class bgh$a
  implements JsonDeserializer<bgh>
{
  public bgh a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ☃.getAsJsonObject();
    Vector3f ☃ = e(☃);
    Vector3f ☃ = d(☃);
    bgj ☃ = a(☃);
    Map<cq, bgi> ☃ = a(☃, ☃);
    if ((☃.has("shade")) && (!ni.c(☃, "shade"))) {
      throw new JsonParseException("Expected shade to be a Boolean");
    }
    boolean ☃ = ni.a(☃, "shade", true);
    
    return new bgh(☃, ☃, ☃, ☃, ☃);
  }
  
  private bgj a(JsonObject ☃)
  {
    bgj ☃ = null;
    if (☃.has("rotation"))
    {
      JsonObject ☃ = ni.s(☃, "rotation");
      Vector3f ☃ = a(☃, "origin");
      ☃.scale(0.0625F);
      cq.a ☃ = c(☃);
      float ☃ = b(☃);
      boolean ☃ = ni.a(☃, "rescale", false);
      
      ☃ = new bgj(☃, ☃, ☃, ☃);
    }
    return ☃;
  }
  
  private float b(JsonObject ☃)
  {
    float ☃ = ni.k(☃, "angle");
    if ((☃ != 0.0F) && (ns.e(☃) != 22.5F) && (ns.e(☃) != 45.0F)) {
      throw new JsonParseException("Invalid rotation " + ☃ + " found, only -45/-22.5/0/22.5/45 allowed");
    }
    return ☃;
  }
  
  private cq.a c(JsonObject ☃)
  {
    String ☃ = ni.h(☃, "axis");
    cq.a ☃ = cq.a.a(☃.toLowerCase());
    if (☃ == null) {
      throw new JsonParseException("Invalid rotation axis: " + ☃);
    }
    return ☃;
  }
  
  private Map<cq, bgi> a(JsonDeserializationContext ☃, JsonObject ☃)
  {
    Map<cq, bgi> ☃ = b(☃, ☃);
    if (☃.isEmpty()) {
      throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
    }
    return ☃;
  }
  
  private Map<cq, bgi> b(JsonDeserializationContext ☃, JsonObject ☃)
  {
    Map<cq, bgi> ☃ = Maps.newEnumMap(cq.class);
    JsonObject ☃ = ni.s(☃, "faces");
    for (Map.Entry<String, JsonElement> ☃ : ☃.entrySet())
    {
      cq ☃ = a((String)☃.getKey());
      ☃.put(☃, (bgi)☃.deserialize((JsonElement)☃.getValue(), bgi.class));
    }
    return ☃;
  }
  
  private cq a(String ☃)
  {
    cq ☃ = cq.a(☃);
    if (☃ == null) {
      throw new JsonParseException("Unknown facing: " + ☃);
    }
    return ☃;
  }
  
  private Vector3f d(JsonObject ☃)
  {
    Vector3f ☃ = a(☃, "to");
    if ((☃.x < -16.0F) || (☃.y < -16.0F) || (☃.z < -16.0F) || (☃.x > 32.0F) || (☃.y > 32.0F) || (☃.z > 32.0F)) {
      throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + ☃);
    }
    return ☃;
  }
  
  private Vector3f e(JsonObject ☃)
  {
    Vector3f ☃ = a(☃, "from");
    if ((☃.x < -16.0F) || (☃.y < -16.0F) || (☃.z < -16.0F) || (☃.x > 32.0F) || (☃.y > 32.0F) || (☃.z > 32.0F)) {
      throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + ☃);
    }
    return ☃;
  }
  
  private Vector3f a(JsonObject ☃, String ☃)
  {
    JsonArray ☃ = ni.t(☃, ☃);
    if (☃.size() != 3) {
      throw new JsonParseException("Expected 3 " + ☃ + " values, found: " + ☃.size());
    }
    float[] ☃ = new float[3];
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      ☃[☃] = ni.d(☃.get(☃), ☃ + "[" + ☃ + "]");
    }
    return new Vector3f(☃[0], ☃[1], ☃[2]);
  }
}
