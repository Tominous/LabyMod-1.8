import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class bgi
{
  public static final cq a = null;
  public final cq b;
  public final int c;
  public final String d;
  public final bgk e;
  
  public bgi(cq ☃, int ☃, String ☃, bgk ☃)
  {
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
  }
  
  static class a
    implements JsonDeserializer<bgi>
  {
    public bgi a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
      throws JsonParseException
    {
      JsonObject ☃ = ☃.getAsJsonObject();
      
      cq ☃ = c(☃);
      int ☃ = a(☃);
      String ☃ = b(☃);
      bgk ☃ = (bgk)☃.deserialize(☃, bgk.class);
      
      return new bgi(☃, ☃, ☃, ☃);
    }
    
    protected int a(JsonObject ☃)
    {
      return ni.a(☃, "tintindex", -1);
    }
    
    private String b(JsonObject ☃)
    {
      return ni.h(☃, "texture");
    }
    
    private cq c(JsonObject ☃)
    {
      String ☃ = ni.a(☃, "cullface", "");
      return cq.a(☃);
    }
  }
}
