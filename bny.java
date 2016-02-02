import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class bny
{
  private final db<String, bny.a<? extends bnw>> a = new dd();
  private final GsonBuilder b = new GsonBuilder();
  private Gson c;
  
  public bny()
  {
    this.b.registerTypeHierarchyAdapter(eu.class, new eu.a());
    this.b.registerTypeHierarchyAdapter(ez.class, new ez.a());
    this.b.registerTypeAdapterFactory(new nr());
  }
  
  public <T extends bnw> void a(bnx<T> ☃, Class<T> ☃)
  {
    this.a.a(☃.a(), new bny.a(☃, ☃, null));
    this.b.registerTypeAdapter(☃, ☃);
    this.c = null;
  }
  
  public <T extends bnw> T a(String ☃, JsonObject ☃)
  {
    if (☃ == null) {
      throw new IllegalArgumentException("Metadata section name cannot be null");
    }
    if (!☃.has(☃)) {
      return null;
    }
    if (!☃.get(☃).isJsonObject()) {
      throw new IllegalArgumentException("Invalid metadata for '" + ☃ + "' - expected object, found " + ☃.get(☃));
    }
    bny.a<?> ☃ = (bny.a)this.a.a(☃);
    if (☃ == null) {
      throw new IllegalArgumentException("Don't know how to handle metadata section '" + ☃ + "'");
    }
    return (bnw)a().fromJson(☃.getAsJsonObject(☃), ☃.b);
  }
  
  private Gson a()
  {
    if (this.c == null) {
      this.c = this.b.create();
    }
    return this.c;
  }
  
  class a<T extends bnw>
  {
    final bnx<T> a;
    final Class<T> b;
    
    private a(Class<T> ☃)
    {
      this.a = ☃;
      this.b = ☃;
    }
  }
}
