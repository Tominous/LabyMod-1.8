import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class bgm$c
{
  private final jy a;
  private final bor b;
  private final boolean c;
  private final int d;
  
  public bgm$c(jy ☃, bor ☃, boolean ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
  }
  
  public jy a()
  {
    return this.a;
  }
  
  public bor b()
  {
    return this.b;
  }
  
  public boolean c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ instanceof c))
    {
      c ☃ = (c)☃;
      return (this.a.equals(☃.a)) && (this.b == ☃.b) && (this.c == ☃.c);
    }
    return false;
  }
  
  public int hashCode()
  {
    int ☃ = this.a.hashCode();
    ☃ = 31 * ☃ + (this.b != null ? this.b.hashCode() : 0);
    ☃ = 31 * ☃ + (this.c ? 1 : 0);
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
