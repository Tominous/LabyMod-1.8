import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;

public class boo
  extends bnv<bon>
{
  public bon a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    JsonObject ☃ = ☃.getAsJsonObject();
    boolean ☃ = ni.a(☃, "blur", false);
    boolean ☃ = ni.a(☃, "clamp", false);
    
    List<Integer> ☃ = Lists.newArrayList();
    if (☃.has("mipmaps")) {
      try
      {
        JsonArray ☃ = ☃.getAsJsonArray("mipmaps");
        for (int ☃ = 0; ☃ < ☃.size(); ☃++)
        {
          JsonElement ☃ = ☃.get(☃);
          if (☃.isJsonPrimitive()) {
            try
            {
              ☃.add(Integer.valueOf(☃.getAsInt()));
            }
            catch (NumberFormatException ☃)
            {
              throw new JsonParseException("Invalid texture->mipmap->" + ☃ + ": expected number, was " + ☃, ☃);
            }
          } else if (☃.isJsonObject()) {
            throw new JsonParseException("Invalid texture->mipmap->" + ☃ + ": expected number, was " + ☃);
          }
        }
      }
      catch (ClassCastException ☃)
      {
        throw new JsonParseException("Invalid texture->mipmaps: expected array, was " + ☃.get("mipmaps"), ☃);
      }
    }
    return new bon(☃, ☃, ☃);
  }
  
  public String a()
  {
    return "texture";
  }
}
