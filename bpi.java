import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class bpi
  implements JsonDeserializer<bph>
{
  public bph a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ni.l(☃, "entry");
    bph ☃ = new bph();
    
    ☃.a(ni.a(☃, "replace", false));
    
    bpg ☃ = bpg.a(ni.a(☃, "category", bpg.a.a()));
    ☃.a(☃);
    Validate.notNull(☃, "Invalid category", new Object[0]);
    if (☃.has("sounds"))
    {
      JsonArray ☃ = ni.t(☃, "sounds");
      for (int ☃ = 0; ☃ < ☃.size(); ☃++)
      {
        JsonElement ☃ = ☃.get(☃);
        bph.a ☃ = new bph.a();
        if (ni.a(☃))
        {
          ☃.a(ni.a(☃, "sound"));
        }
        else
        {
          JsonObject ☃ = ni.l(☃, "sound");
          ☃.a(ni.h(☃, "name"));
          if (☃.has("type"))
          {
            bph.a.a ☃ = bph.a.a.a(ni.h(☃, "type"));
            Validate.notNull(☃, "Invalid type", new Object[0]);
            ☃.a(☃);
          }
          if (☃.has("volume"))
          {
            float ☃ = ni.k(☃, "volume");
            Validate.isTrue(☃ > 0.0F, "Invalid volume", new Object[0]);
            ☃.a(☃);
          }
          if (☃.has("pitch"))
          {
            float ☃ = ni.k(☃, "pitch");
            Validate.isTrue(☃ > 0.0F, "Invalid pitch", new Object[0]);
            ☃.b(☃);
          }
          if (☃.has("weight"))
          {
            int ☃ = ni.m(☃, "weight");
            Validate.isTrue(☃ > 0, "Invalid weight", new Object[0]);
            ☃.a(☃);
          }
          if (☃.has("stream")) {
            ☃.a(ni.i(☃, "stream"));
          }
        }
        ☃.a().add(☃);
      }
    }
    return ☃;
  }
}
