import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class bgm$c$a
  implements JsonDeserializer<bgm.c>
{
  public bgm.c a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ☃.getAsJsonObject();
    
    String ☃ = b(☃);
    bor ☃ = a(☃);
    boolean ☃ = d(☃);
    int ☃ = c(☃);
    
    return new bgm.c(a(☃), ☃, ☃, ☃);
  }
  
  private jy a(String ☃)
  {
    jy ☃ = new jy(☃);
    ☃ = new jy(☃.b(), "block/" + ☃.a());
    return ☃;
  }
  
  private boolean d(JsonObject ☃)
  {
    return ni.a(☃, "uvlock", false);
  }
  
  protected bor a(JsonObject ☃)
  {
    int ☃ = ni.a(☃, "x", 0);
    int ☃ = ni.a(☃, "y", 0);
    
    bor ☃ = bor.a(☃, ☃);
    if (☃ == null) {
      throw new JsonParseException("Invalid BlockModelRotation x: " + ☃ + ", y: " + ☃);
    }
    return ☃;
  }
  
  protected String b(JsonObject ☃)
  {
    return ni.h(☃, "model");
  }
  
  protected int c(JsonObject ☃)
  {
    return ni.a(☃, "weight", 1);
  }
}
