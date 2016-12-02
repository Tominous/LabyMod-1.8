import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class bgm
{
  static final Gson a = new GsonBuilder().registerTypeAdapter(bgm.class, new bgm.a()).registerTypeAdapter(bgm.c.class, new bgm.c.a()).create();
  private final Map<String, bgm.d> b = Maps.newHashMap();
  
  public static bgm a(Reader ☃)
  {
    return (bgm)a.fromJson(☃, bgm.class);
  }
  
  public bgm(Collection<bgm.d> ☃)
  {
    for (bgm.d ☃ : ☃) {
      b.put(bgm.d.a(☃), ☃);
    }
  }
  
  public bgm(List<bgm> ☃)
  {
    for (bgm ☃ : ☃) {
      b.putAll(b);
    }
  }
  
  public bgm.d b(String ☃)
  {
    bgm.d ☃ = (bgm.d)b.get(☃);
    if (☃ == null) {
      throw new bgm.b();
    }
    return ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ instanceof bgm))
    {
      bgm ☃ = (bgm)☃;
      return b.equals(b);
    }
    return false;
  }
  
  public int hashCode()
  {
    return b.hashCode();
  }
  
  public static class d
  {
    private final String a;
    private final List<bgm.c> b;
    
    public d(String ☃, List<bgm.c> ☃)
    {
      a = ☃;
      b = ☃;
    }
    
    public List<bgm.c> b()
    {
      return b;
    }
    
    public boolean equals(Object ☃)
    {
      if (this == ☃) {
        return true;
      }
      if (!(☃ instanceof d)) {
        return false;
      }
      d ☃ = (d)☃;
      if (!a.equals(a)) {
        return false;
      }
      if (!b.equals(b)) {
        return false;
      }
      return true;
    }
    
    public int hashCode()
    {
      int ☃ = a.hashCode();
      ☃ = 31 * ☃ + b.hashCode();
      return ☃;
    }
  }
  
  public static class c
  {
    private final jy a;
    private final bor b;
    private final boolean c;
    private final int d;
    
    public c(jy ☃, bor ☃, boolean ☃, int ☃)
    {
      a = ☃;
      b = ☃;
      c = ☃;
      d = ☃;
    }
    
    public jy a()
    {
      return a;
    }
    
    public bor b()
    {
      return b;
    }
    
    public boolean c()
    {
      return c;
    }
    
    public int d()
    {
      return d;
    }
    
    public boolean equals(Object ☃)
    {
      if (this == ☃) {
        return true;
      }
      if ((☃ instanceof c))
      {
        c ☃ = (c)☃;
        return (a.equals(a)) && (b == b) && (c == c);
      }
      return false;
    }
    
    public int hashCode()
    {
      int ☃ = a.hashCode();
      ☃ = 31 * ☃ + (b != null ? b.hashCode() : 0);
      ☃ = 31 * ☃ + (c ? 1 : 0);
      return ☃;
    }
    
    public static class a
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
  }
  
  public static class a
    implements JsonDeserializer<bgm>
  {
    public bgm a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
      throws JsonParseException
    {
      JsonObject ☃ = ☃.getAsJsonObject();
      
      List<bgm.d> ☃ = a(☃, ☃);
      
      return new bgm(☃);
    }
    
    protected List<bgm.d> a(JsonDeserializationContext ☃, JsonObject ☃)
    {
      JsonObject ☃ = ni.s(☃, "variants");
      
      List<bgm.d> ☃ = Lists.newArrayList();
      for (Map.Entry<String, JsonElement> ☃ : ☃.entrySet()) {
        ☃.add(a(☃, ☃));
      }
      return ☃;
    }
    
    protected bgm.d a(JsonDeserializationContext ☃, Map.Entry<String, JsonElement> ☃)
    {
      String ☃ = (String)☃.getKey();
      
      List<bgm.c> ☃ = Lists.newArrayList();
      JsonElement ☃ = (JsonElement)☃.getValue();
      if (☃.isJsonArray()) {
        for (JsonElement ☃ : ☃.getAsJsonArray()) {
          ☃.add((bgm.c)☃.deserialize(☃, bgm.c.class));
        }
      } else {
        ☃.add((bgm.c)☃.deserialize(☃, bgm.c.class));
      }
      return new bgm.d(☃, ☃);
    }
  }
  
  public class b
    extends RuntimeException
  {
    protected b() {}
  }
}
