import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.lwjgl.util.vector.Vector3f;

public class bgq
{
  public static final bgq a = new bgq(new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F));
  public final Vector3f b;
  public final Vector3f c;
  public final Vector3f d;
  
  public bgq(Vector3f ☃, Vector3f ☃, Vector3f ☃)
  {
    this.b = new Vector3f(☃);
    this.c = new Vector3f(☃);
    this.d = new Vector3f(☃);
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if (getClass() != ☃.getClass()) {
      return false;
    }
    bgq ☃ = (bgq)☃;
    if (!this.b.equals(☃.b)) {
      return false;
    }
    if (!this.d.equals(☃.d)) {
      return false;
    }
    if (!this.c.equals(☃.c)) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    int ☃ = this.b.hashCode();
    ☃ = 31 * ☃ + this.c.hashCode();
    ☃ = 31 * ☃ + this.d.hashCode();
    return ☃;
  }
  
  static class a
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
}
