import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map.Entry;

public class eu$a
  implements JsonDeserializer<eu>, JsonSerializer<eu>
{
  private static final Gson a;
  
  static
  {
    GsonBuilder ☃ = new GsonBuilder();
    ☃.registerTypeHierarchyAdapter(eu.class, new a());
    ☃.registerTypeHierarchyAdapter(ez.class, new ez.a());
    ☃.registerTypeAdapterFactory(new nr());
    a = ☃.create();
  }
  
  public eu a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
    throws JsonParseException
  {
    if (☃.isJsonPrimitive()) {
      return new fa(☃.getAsString());
    }
    if (☃.isJsonObject())
    {
      JsonObject ☃ = ☃.getAsJsonObject();
      eu ☃;
      if (☃.has("text"))
      {
        ☃ = new fa(☃.get("text").getAsString());
      }
      else
      {
        eu ☃;
        if (☃.has("translate"))
        {
          String ☃ = ☃.get("translate").getAsString();
          eu ☃;
          if (☃.has("with"))
          {
            JsonArray ☃ = ☃.getAsJsonArray("with");
            Object[] ☃ = new Object[☃.size()];
            for (int ☃ = 0; ☃ < ☃.length; ☃++)
            {
              ☃[☃] = a(☃.get(☃), ☃, ☃);
              if ((☃[☃] instanceof fa))
              {
                fa ☃ = (fa)☃[☃];
                if ((☃.b().g()) && (☃.a().isEmpty())) {
                  ☃[☃] = ☃.g();
                }
              }
            }
            ☃ = new fb(☃, ☃);
          }
          else
          {
            ☃ = new fb(☃, new Object[0]);
          }
        }
        else
        {
          eu ☃;
          if (☃.has("score"))
          {
            JsonObject ☃ = ☃.getAsJsonObject("score");
            if ((☃.has("name")) && (☃.has("objective")))
            {
              eu ☃ = new ex(ni.h(☃, "name"), ni.h(☃, "objective"));
              if (☃.has("value")) {
                ((ex)☃).b(ni.h(☃, "value"));
              }
            }
            else
            {
              throw new JsonParseException("A score component needs a least a name and an objective");
            }
          }
          else
          {
            eu ☃;
            if (☃.has("selector")) {
              ☃ = new ey(ni.h(☃, "selector"));
            } else {
              throw new JsonParseException("Don't know how to turn " + ☃.toString() + " into a Component");
            }
          }
        }
      }
      eu ☃;
      if (☃.has("extra"))
      {
        JsonArray ☃ = ☃.getAsJsonArray("extra");
        if (☃.size() > 0) {
          for (int ☃ = 0; ☃ < ☃.size(); ☃++) {
            ☃.a(a(☃.get(☃), ☃, ☃));
          }
        } else {
          throw new JsonParseException("Unexpected empty array of components");
        }
      }
      ☃.a((ez)☃.deserialize(☃, ez.class));
      
      return ☃;
    }
    if (☃.isJsonArray())
    {
      JsonArray ☃ = ☃.getAsJsonArray();
      eu ☃ = null;
      for (JsonElement ☃ : ☃)
      {
        eu ☃ = a(☃, ☃.getClass(), ☃);
        if (☃ == null) {
          ☃ = ☃;
        } else {
          ☃.a(☃);
        }
      }
      return ☃;
    }
    throw new JsonParseException("Don't know how to turn " + ☃.toString() + " into a Component");
  }
  
  private void a(ez ☃, JsonObject ☃, JsonSerializationContext ☃)
  {
    JsonElement ☃ = ☃.serialize(☃);
    if (☃.isJsonObject())
    {
      JsonObject ☃ = (JsonObject)☃;
      for (Map.Entry<String, JsonElement> ☃ : ☃.entrySet()) {
        ☃.add((String)☃.getKey(), (JsonElement)☃.getValue());
      }
    }
  }
  
  public JsonElement a(eu ☃, Type ☃, JsonSerializationContext ☃)
  {
    if (((☃ instanceof fa)) && (☃.b().g()) && (☃.a().isEmpty())) {
      return new JsonPrimitive(((fa)☃).g());
    }
    JsonObject ☃ = new JsonObject();
    if (!☃.b().g()) {
      a(☃.b(), ☃, ☃);
    }
    if (!☃.a().isEmpty())
    {
      JsonArray ☃ = new JsonArray();
      for (eu ☃ : ☃.a()) {
        ☃.add(a(☃, ☃.getClass(), ☃));
      }
      ☃.add("extra", ☃);
    }
    if ((☃ instanceof fa))
    {
      ☃.addProperty("text", ((fa)☃).g());
    }
    else if ((☃ instanceof fb))
    {
      fb ☃ = (fb)☃;
      ☃.addProperty("translate", ☃.i());
      if ((☃.j() != null) && (☃.j().length > 0))
      {
        JsonArray ☃ = new JsonArray();
        for (Object ☃ : ☃.j()) {
          if ((☃ instanceof eu)) {
            ☃.add(a((eu)☃, ☃.getClass(), ☃));
          } else {
            ☃.add(new JsonPrimitive(String.valueOf(☃)));
          }
        }
        ☃.add("with", ☃);
      }
    }
    else if ((☃ instanceof ex))
    {
      ex ☃ = (ex)☃;
      JsonObject ☃ = new JsonObject();
      ☃.addProperty("name", ☃.g());
      ☃.addProperty("objective", ☃.h());
      ☃.addProperty("value", ☃.e());
      ☃.add("score", ☃);
    }
    else if ((☃ instanceof ey))
    {
      ey ☃ = (ey)☃;
      ☃.addProperty("selector", ☃.g());
    }
    else
    {
      throw new IllegalArgumentException("Don't know how to serialize " + ☃ + " as a Component");
    }
    return ☃;
  }
  
  public static String a(eu ☃)
  {
    return a.toJson(☃);
  }
  
  public static eu a(String ☃)
  {
    return (eu)a.fromJson(☃, eu.class);
  }
}
