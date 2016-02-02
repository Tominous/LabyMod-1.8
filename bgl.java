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
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bgl
{
  private static final Logger f = ;
  static final Gson a = new GsonBuilder().registerTypeAdapter(bgl.class, new bgl.b()).registerTypeAdapter(bgh.class, new bgh.a()).registerTypeAdapter(bgi.class, new bgi.a()).registerTypeAdapter(bgk.class, new bgk.a()).registerTypeAdapter(bgq.class, new bgq.a()).registerTypeAdapter(bgr.class, new bgr.a()).create();
  private final List<bgh> g;
  private final boolean h;
  private final boolean i;
  private bgr j;
  public String b = "";
  protected final Map<String, String> c;
  protected bgl d;
  protected jy e;
  
  public static bgl a(Reader ☃)
  {
    return (bgl)a.fromJson(☃, bgl.class);
  }
  
  public static bgl a(String ☃)
  {
    return a(new StringReader(☃));
  }
  
  protected bgl(List<bgh> ☃, Map<String, String> ☃, boolean ☃, boolean ☃, bgr ☃)
  {
    this(null, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected bgl(jy ☃, Map<String, String> ☃, boolean ☃, boolean ☃, bgr ☃)
  {
    this(☃, Collections.emptyList(), ☃, ☃, ☃, ☃);
  }
  
  private bgl(jy ☃, List<bgh> ☃, Map<String, String> ☃, boolean ☃, boolean ☃, bgr ☃)
  {
    this.g = ☃;
    this.i = ☃;
    this.h = ☃;
    this.c = ☃;
    this.e = ☃;
    this.j = ☃;
  }
  
  public List<bgh> a()
  {
    if (h()) {
      return this.d.a();
    }
    return this.g;
  }
  
  private boolean h()
  {
    return this.d != null;
  }
  
  public boolean b()
  {
    if (h()) {
      return this.d.b();
    }
    return this.i;
  }
  
  public boolean c()
  {
    return this.h;
  }
  
  public boolean d()
  {
    return (this.e == null) || ((this.d != null) && (this.d.d()));
  }
  
  public void a(Map<jy, bgl> ☃)
  {
    if (this.e != null) {
      this.d = ((bgl)☃.get(this.e));
    }
  }
  
  static final class a
  {
    public final bgl a;
    public bgl b;
    
    private a(bgl ☃)
    {
      this.a = ☃;
    }
  }
  
  public boolean b(String ☃)
  {
    return !"missingno".equals(c(☃));
  }
  
  public String c(String ☃)
  {
    if (!d(☃)) {
      ☃ = '#' + ☃;
    }
    return a(☃, new bgl.a(this, null));
  }
  
  private String a(String ☃, bgl.a ☃)
  {
    if (d(☃))
    {
      if (this == ☃.b)
      {
        f.warn("Unable to resolve texture due to upward reference: " + ☃ + " in " + this.b);
        return "missingno";
      }
      String ☃ = (String)this.c.get(☃.substring(1));
      if ((☃ == null) && (h())) {
        ☃ = this.d.a(☃, ☃);
      }
      ☃.b = this;
      if ((☃ != null) && (d(☃))) {
        ☃ = ☃.a.a(☃, ☃);
      }
      if ((☃ == null) || (d(☃))) {
        return "missingno";
      }
      return ☃;
    }
    return ☃;
  }
  
  private boolean d(String ☃)
  {
    return ☃.charAt(0) == '#';
  }
  
  public jy e()
  {
    return this.e;
  }
  
  public bgl f()
  {
    return h() ? this.d.f() : this;
  }
  
  public bgr g()
  {
    bgq ☃ = a(bgr.b.b);
    bgq ☃ = a(bgr.b.c);
    bgq ☃ = a(bgr.b.d);
    bgq ☃ = a(bgr.b.e);
    bgq ☃ = a(bgr.b.f);
    bgq ☃ = a(bgr.b.g);
    return new bgr(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  private bgq a(bgr.b ☃)
  {
    if ((this.d != null) && (!this.j.c(☃))) {
      return this.d.a(☃);
    }
    return this.j.b(☃);
  }
  
  public static class b
    implements JsonDeserializer<bgl>
  {
    public bgl a(JsonElement ☃, Type ☃, JsonDeserializationContext ☃)
      throws JsonParseException
    {
      JsonObject ☃ = ☃.getAsJsonObject();
      
      List<bgh> ☃ = a(☃, ☃);
      String ☃ = c(☃);
      
      boolean ☃ = StringUtils.isEmpty(☃);
      boolean ☃ = ☃.isEmpty();
      if ((☃) && (☃)) {
        throw new JsonParseException("BlockModel requires either elements or parent, found neither");
      }
      if ((!☃) && (!☃)) {
        throw new JsonParseException("BlockModel requires either elements or parent, found both");
      }
      Map<String, String> ☃ = b(☃);
      boolean ☃ = a(☃);
      
      bgr ☃ = bgr.a;
      if (☃.has("display"))
      {
        JsonObject ☃ = ni.s(☃, "display");
        ☃ = (bgr)☃.deserialize(☃, bgr.class);
      }
      if (☃) {
        return new bgl(new jy(☃), ☃, ☃, true, ☃);
      }
      return new bgl(☃, ☃, ☃, true, ☃);
    }
    
    private Map<String, String> b(JsonObject ☃)
    {
      Map<String, String> ☃ = Maps.newHashMap();
      if (☃.has("textures"))
      {
        JsonObject ☃ = ☃.getAsJsonObject("textures");
        for (Map.Entry<String, JsonElement> ☃ : ☃.entrySet()) {
          ☃.put(☃.getKey(), ((JsonElement)☃.getValue()).getAsString());
        }
      }
      return ☃;
    }
    
    private String c(JsonObject ☃)
    {
      return ni.a(☃, "parent", "");
    }
    
    protected boolean a(JsonObject ☃)
    {
      return ni.a(☃, "ambientocclusion", true);
    }
    
    protected List<bgh> a(JsonDeserializationContext ☃, JsonObject ☃)
    {
      List<bgh> ☃ = Lists.newArrayList();
      if (☃.has("elements")) {
        for (JsonElement ☃ : ni.t(☃, "elements")) {
          ☃.add((bgh)☃.deserialize(☃, bgh.class));
        }
      }
      return ☃;
    }
  }
  
  public static void b(Map<jy, bgl> ☃)
  {
    for (bgl ☃ : ☃.values()) {
      try
      {
        bgl ☃ = ☃.d;
        bgl ☃ = ☃.d;
        while (☃ != ☃)
        {
          ☃ = ☃.d;
          ☃ = ☃.d.d;
        }
        throw new bgl.c();
      }
      catch (NullPointerException localNullPointerException) {}
    }
  }
  
  public static class c
    extends RuntimeException
  {}
}
