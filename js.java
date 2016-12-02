import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;

public class js
{
  private eu a;
  private js.a b;
  private js.c c;
  private String d;
  
  public eu a()
  {
    return this.a;
  }
  
  public void a(eu ☃)
  {
    this.a = ☃;
  }
  
  public js.a b()
  {
    return this.b;
  }
  
  public void a(js.a ☃)
  {
    this.b = ☃;
  }
  
  public js.c c()
  {
    return this.c;
  }
  
  public void a(js.c ☃)
  {
    this.c = ☃;
  }
  
  public void a(String ☃)
  {
    this.d = ☃;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public static class a
  {
    private final int a;
    private final int b;
    private GameProfile[] c;
    
    public a(int ☃, int ☃)
    {
      this.a = ☃;
      this.b = ☃;
    }
    
    public int a()
    {
      return this.a;
    }
    
    public int b()
    {
      return this.b;
    }
    
    public GameProfile[] c()
    {
      return this.c;
    }
    
    public void a(GameProfile[] ☃)
    {
      this.c = ☃;
    }
    
    public static class a
      implements JsonDeserializer<js.a>, JsonSerializer<js.a>
    {
      public js.a a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
        throws JsonParseException
      {
        JsonObject ☃ = ni.l(☃, "players");
        js.a ☃ = new js.a(ni.m(☃, "max"), ni.m(☃, "online"));
        if (ni.d(☃, "sample"))
        {
          JsonArray ☃ = ni.t(☃, "sample");
          if (☃.size() > 0)
          {
            GameProfile[] ☃ = new GameProfile[☃.size()];
            for (int ☃ = 0; ☃ < ☃.length; ☃++)
            {
              JsonObject ☃ = ni.l(☃.get(☃), "player[" + ☃ + "]");
              String ☃ = ni.h(☃, "id");
              ☃[☃] = new GameProfile(UUID.fromString(☃), ni.h(☃, "name"));
            }
            ☃.a(☃);
          }
        }
        return ☃;
      }
      
      public JsonElement a(js.a ☃, Type ☃, JsonSerializationContext ☃)
      {
        JsonObject ☃ = new JsonObject();
        
        ☃.addProperty("max", Integer.valueOf(☃.a()));
        ☃.addProperty("online", Integer.valueOf(☃.b()));
        if ((☃.c() != null) && (☃.c().length > 0))
        {
          JsonArray ☃ = new JsonArray();
          for (int ☃ = 0; ☃ < ☃.c().length; ☃++)
          {
            JsonObject ☃ = new JsonObject();
            UUID ☃ = ☃.c()[☃].getId();
            ☃.addProperty("id", ☃ == null ? "" : ☃.toString());
            ☃.addProperty("name", ☃.c()[☃].getName());
            ☃.add(☃);
          }
          ☃.add("sample", ☃);
        }
        return ☃;
      }
    }
  }
  
  public static class c
  {
    private final String a;
    private final int b;
    
    public c(String ☃, int ☃)
    {
      this.a = ☃;
      this.b = ☃;
    }
    
    public String a()
    {
      return this.a;
    }
    
    public int b()
    {
      return this.b;
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
  
  public static class b
    implements JsonDeserializer<js>, JsonSerializer<js>
  {
    public js a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
      throws JsonParseException
    {
      JsonObject ☃ = ni.l(☃, "status");
      js ☃ = new js();
      if (☃.has("description")) {
        ☃.a((eu)☃.deserialize(☃.get("description"), eu.class));
      }
      if (☃.has("players")) {
        ☃.a((js.a)☃.deserialize(☃.get("players"), js.a.class));
      }
      if (☃.has("version")) {
        ☃.a((js.c)☃.deserialize(☃.get("version"), js.c.class));
      }
      if (☃.has("favicon")) {
        ☃.a(ni.h(☃, "favicon"));
      }
      return ☃;
    }
    
    public JsonElement a(js ☃, Type ☃, JsonSerializationContext ☃)
    {
      JsonObject ☃ = new JsonObject();
      if (☃.a() != null) {
        ☃.add("description", ☃.serialize(☃.a()));
      }
      if (☃.b() != null) {
        ☃.add("players", ☃.serialize(☃.b()));
      }
      if (☃.c() != null) {
        ☃.add("version", ☃.serialize(☃.c()));
      }
      if (☃.d() != null) {
        ☃.addProperty("favicon", ☃.d());
      }
      return ☃;
    }
  }
}
