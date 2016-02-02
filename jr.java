import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;

public class jr
  implements ff<jp>
{
  private static final Gson a = new GsonBuilder().registerTypeAdapter(js.c.class, new js.c.a()).registerTypeAdapter(js.a.class, new js.a.a()).registerTypeAdapter(js.class, new js.b()).registerTypeHierarchyAdapter(eu.class, new eu.a()).registerTypeHierarchyAdapter(ez.class, new ez.a()).registerTypeAdapterFactory(new nr()).create();
  private js b;
  
  public jr() {}
  
  public jr(js ☃)
  {
    this.b = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.b = ((js)a.fromJson(☃.c(32767), js.class));
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a.toJson(this.b));
  }
  
  public void a(jp ☃)
  {
    ☃.a(this);
  }
  
  public js a()
  {
    return this.b;
  }
}
