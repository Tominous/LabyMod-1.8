import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class bob
  extends bnv<boa>
  implements JsonSerializer<boa>
{
  public boa a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    List<bnz> ☃ = Lists.newArrayList();
    JsonObject ☃ = ni.l(☃, "metadata section");
    int ☃ = ni.a(☃, "frametime", 1);
    if (☃ != 1) {
      Validate.inclusiveBetween(1L, 2147483647L, ☃, "Invalid default frame time");
    }
    if (☃.has("frames")) {
      try
      {
        JsonArray ☃ = ni.t(☃, "frames");
        for (int ☃ = 0; ☃ < ☃.size(); ☃++)
        {
          JsonElement ☃ = ☃.get(☃);
          
          bnz ☃ = a(☃, ☃);
          if (☃ != null) {
            ☃.add(☃);
          }
        }
      }
      catch (ClassCastException ☃)
      {
        throw new JsonParseException("Invalid animation->frames: expected array, was " + ☃.get("frames"), ☃);
      }
    }
    int ☃ = ni.a(☃, "width", -1);
    int ☃ = ni.a(☃, "height", -1);
    if (☃ != -1) {
      Validate.inclusiveBetween(1L, 2147483647L, ☃, "Invalid width");
    }
    if (☃ != -1) {
      Validate.inclusiveBetween(1L, 2147483647L, ☃, "Invalid height");
    }
    boolean ☃ = ni.a(☃, "interpolate", false);
    
    return new boa(☃, ☃, ☃, ☃, ☃);
  }
  
  private bnz a(int ☃, JsonElement ☃)
  {
    if (☃.isJsonPrimitive()) {
      return new bnz(ni.f(☃, "frames[" + ☃ + "]"));
    }
    if (☃.isJsonObject())
    {
      JsonObject ☃ = ni.l(☃, "frames[" + ☃ + "]");
      int ☃ = ni.a(☃, "time", -1);
      if (☃.has("time")) {
        Validate.inclusiveBetween(1L, 2147483647L, ☃, "Invalid frame time");
      }
      int ☃ = ni.m(☃, "index");
      Validate.inclusiveBetween(0L, 2147483647L, ☃, "Invalid frame index");
      return new bnz(☃, ☃);
    }
    return null;
  }
  
  public JsonElement a(boa ☃, Type ☃, JsonSerializationContext ☃)
  {
    JsonObject ☃ = new JsonObject();
    
    ☃.addProperty("frametime", Integer.valueOf(☃.d()));
    if (☃.b() != -1) {
      ☃.addProperty("width", Integer.valueOf(☃.b()));
    }
    if (☃.a() != -1) {
      ☃.addProperty("height", Integer.valueOf(☃.a()));
    }
    if (☃.c() > 0)
    {
      JsonArray ☃ = new JsonArray();
      for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
        if (☃.b(☃))
        {
          JsonObject ☃ = new JsonObject();
          
          ☃.addProperty("index", Integer.valueOf(☃.c(☃)));
          ☃.addProperty("time", Integer.valueOf(☃.a(☃)));
          
          ☃.add(☃);
        }
        else
        {
          ☃.add(new JsonPrimitive(Integer.valueOf(☃.c(☃))));
        }
      }
      ☃.add("frames", ☃);
    }
    return ☃;
  }
  
  public String a()
  {
    return "animation";
  }
}
