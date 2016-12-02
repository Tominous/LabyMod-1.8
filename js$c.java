import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class js$c
{
  private final String a;
  private final int b;
  
  public js$c(String ☃, int ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public String a()
  {
    return a;
  }
  
  public int b()
  {
    return b;
  }
  
  public static class a
    implements JsonDeserializer<js.c>, JsonSerializer<js.c>
  {
    public js.c a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
      throws JsonParseException
    {
      JsonObject ☃ = ni.l(☃, "version");
      return new js.c(ni.h(☃, "name"), ni.m(☃, "protocol"));
    }
    
    public JsonElement a(js.c ☃, Type ☃, JsonSerializationContext ☃)
    {
      JsonObject ☃ = new JsonObject();
      ☃.addProperty("name", ☃.a());
      ☃.addProperty("protocol", Integer.valueOf(☃.b()));
      return ☃;
    }
  }
}
