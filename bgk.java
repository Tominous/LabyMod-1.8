import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class bgk
{
  public float[] a;
  public final int b;
  
  public bgk(float[] ☃, int ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public float a(int ☃)
  {
    if (a == null) {
      throw new NullPointerException("uvs");
    }
    int ☃ = d(☃);
    return (☃ == 0) || (☃ == 1) ? a[0] : a[2];
  }
  
  public float b(int ☃)
  {
    if (a == null) {
      throw new NullPointerException("uvs");
    }
    int ☃ = d(☃);
    return (☃ == 0) || (☃ == 3) ? a[1] : a[3];
  }
  
  private int d(int ☃)
  {
    return (☃ + b / 90) % 4;
  }
  
  public int c(int ☃)
  {
    return (☃ + (4 - b / 90)) % 4;
  }
  
  public void a(float[] ☃)
  {
    if (a == null) {
      a = ☃;
    }
  }
  
  static class a
    implements JsonDeserializer<bgk>
  {
    public bgk a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
      throws JsonParseException
    {
      JsonObject ☃ = ☃.getAsJsonObject();
      
      float[] ☃ = b(☃);
      int ☃ = a(☃);
      
      return new bgk(☃, ☃);
    }
    
    protected int a(JsonObject ☃)
    {
      int ☃ = ni.a(☃, "rotation", 0);
      if ((☃ < 0) || (☃ % 90 != 0) || (☃ / 90 > 3)) {
        throw new JsonParseException("Invalid rotation " + ☃ + " found, only 0/90/180/270 allowed");
      }
      return ☃;
    }
    
    private float[] b(JsonObject ☃)
    {
      if (!☃.has("uv")) {
        return null;
      }
      JsonArray ☃ = ni.t(☃, "uv");
      if (☃.size() != 4) {
        throw new JsonParseException("Expected 4 uv values, found: " + ☃.size());
      }
      float[] ☃ = new float[4];
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        ☃[☃] = ni.d(☃.get(☃), "uv[" + ☃ + "]");
      }
      return ☃;
    }
  }
}
