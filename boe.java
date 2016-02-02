import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

public class boe
  extends bnv<bod>
{
  public bod a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ☃.getAsJsonObject();
    float[] ☃ = new float['Ā'];
    float[] ☃ = new float['Ā'];
    float[] ☃ = new float['Ā'];
    float ☃ = 1.0F;
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    if (☃.has("characters"))
    {
      if (!☃.get("characters").isJsonObject()) {
        throw new JsonParseException("Invalid font->characters: expected object, was " + ☃.get("characters"));
      }
      JsonObject ☃ = ☃.getAsJsonObject("characters");
      if (☃.has("default"))
      {
        if (!☃.get("default").isJsonObject()) {
          throw new JsonParseException("Invalid font->characters->default: expected object, was " + ☃.get("default"));
        }
        JsonObject ☃ = ☃.getAsJsonObject("default");
        
        ☃ = ni.a(☃, "width", ☃);
        Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, ☃, "Invalid default width");
        ☃ = ni.a(☃, "spacing", ☃);
        Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, ☃, "Invalid default spacing");
        ☃ = ni.a(☃, "left", ☃);
        Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, ☃, "Invalid default left");
      }
      for (int ☃ = 0; ☃ < 256; ☃++)
      {
        JsonElement ☃ = ☃.get(Integer.toString(☃));
        float ☃ = ☃;
        float ☃ = ☃;
        float ☃ = ☃;
        if (☃ != null)
        {
          JsonObject ☃ = ni.l(☃, "characters[" + ☃ + "]");
          ☃ = ni.a(☃, "width", ☃);
          Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, ☃, "Invalid width");
          ☃ = ni.a(☃, "spacing", ☃);
          Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, ☃, "Invalid spacing");
          ☃ = ni.a(☃, "left", ☃);
          Validate.inclusiveBetween(0.0D, 3.4028234663852886E38D, ☃, "Invalid left");
        }
        ☃[☃] = ☃;
        ☃[☃] = ☃;
        ☃[☃] = ☃;
      }
    }
    return new bod(☃, ☃, ☃);
  }
  
  public String a()
  {
    return "font";
  }
}
