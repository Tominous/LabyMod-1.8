import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.lwjgl.util.vector.Vector3f;

public class bgr
{
  public static final bgr a = new bgr();
  public static float b = 0.0F;
  public static float c = 0.0F;
  public static float d = 0.0F;
  public static float e = 0.0F;
  public static float f = 0.0F;
  public static float g = 0.0F;
  public static float h = 0.0F;
  public static float i = 0.0F;
  public static float j = 0.0F;
  public final bgq k;
  public final bgq l;
  public final bgq m;
  public final bgq n;
  public final bgq o;
  public final bgq p;
  
  private bgr()
  {
    this(bgq.a, bgq.a, bgq.a, bgq.a, bgq.a, bgq.a);
  }
  
  public bgr(bgr ☃)
  {
    k = k;
    l = l;
    m = m;
    n = n;
    o = o;
    p = p;
  }
  
  public bgr(bgq ☃, bgq ☃, bgq ☃, bgq ☃, bgq ☃, bgq ☃)
  {
    k = ☃;
    l = ☃;
    m = ☃;
    n = ☃;
    o = ☃;
    p = ☃;
  }
  
  public void a(bgr.b ☃)
  {
    bgq ☃ = b(☃);
    if (☃ != bgq.a)
    {
      bfl.b(c.x + b, c.y + c, c.z + d);
      bfl.b(b.y + f, 0.0F, 1.0F, 0.0F);
      bfl.b(b.x + e, 1.0F, 0.0F, 0.0F);
      bfl.b(b.z + g, 0.0F, 0.0F, 1.0F);
      bfl.a(d.x + h, d.y + i, d.z + j);
    }
  }
  
  public bgq b(bgr.b ☃)
  {
    switch (bgr.1.a[☃.ordinal()])
    {
    case 1: 
      return k;
    case 2: 
      return l;
    case 3: 
      return m;
    case 4: 
      return n;
    case 5: 
      return o;
    case 6: 
      return p;
    }
    return bgq.a;
  }
  
  public boolean c(bgr.b ☃)
  {
    return !b(☃).equals(bgq.a);
  }
  
  static class a
    implements JsonDeserializer<bgr>
  {
    public bgr a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
      throws JsonParseException
    {
      JsonObject ☃ = ☃.getAsJsonObject();
      
      bgq ☃ = a(☃, ☃, "thirdperson");
      bgq ☃ = a(☃, ☃, "firstperson");
      bgq ☃ = a(☃, ☃, "head");
      bgq ☃ = a(☃, ☃, "gui");
      bgq ☃ = a(☃, ☃, "ground");
      bgq ☃ = a(☃, ☃, "fixed");
      
      return new bgr(☃, ☃, ☃, ☃, ☃, ☃);
    }
    
    private bgq a(JsonDeserializationContext ☃, JsonObject ☃, String ☃)
    {
      if (☃.has(☃)) {
        return (bgq)☃.deserialize(☃.get(☃), bgq.class);
      }
      return bgq.a;
    }
  }
  
  public static enum b
  {
    private b() {}
  }
}
