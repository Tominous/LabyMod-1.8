import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.lwjgl.util.vector.Vector3f;

class bgq$a
  implements JsonDeserializer<bgq>
{
  private static final Vector3f a = new Vector3f(0.0F, 0.0F, 0.0F);
  private static final Vector3f b = new Vector3f(0.0F, 0.0F, 0.0F);
  private static final Vector3f c = new Vector3f(1.0F, 1.0F, 1.0F);
  
  public bgq a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ☃.getAsJsonObject();
    
    Vector3f ☃ = a(☃, "rotation", a);
    
    Vector3f ☃ = a(☃, "translation", b);
    ☃.scale(0.0625F);
    ☃.x = ns.a(☃.x, -1.5F, 1.5F);
    ☃.y = ns.a(☃.y, -1.5F, 1.5F);
    ☃.z = ns.a(☃.z, -1.5F, 1.5F);
    
    Vector3f ☃ = a(☃, "scale", c);
    ☃.x = ns.a(☃.x, -4.0F, 4.0F);
    ☃.y = ns.a(☃.y, -4.0F, 4.0F);
    ☃.z = ns.a(☃.z, -4.0F, 4.0F);
    
    return new bgq(☃, ☃, ☃);
  }
  
  private Vector3f a(JsonObject ☃, String ☃, Vector3f ☃)
  {
    if (!☃.has(☃)) {
      return ☃;
    }
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
