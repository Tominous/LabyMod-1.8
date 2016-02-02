import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Date;

public class lv
  extends ls<String>
{
  public lv(String ☃)
  {
    this(☃, null, null, null, null);
  }
  
  public lv(String ☃, Date ☃, String ☃, Date ☃, String ☃)
  {
    super(☃, ☃, ☃, ☃, ☃);
  }
  
  public lv(JsonObject ☃)
  {
    super(b(☃), ☃);
  }
  
  private static String b(JsonObject ☃)
  {
    return ☃.has("ip") ? ☃.get("ip").getAsString() : null;
  }
  
  protected void a(JsonObject ☃)
  {
    if (f() == null) {
      return;
    }
    ☃.addProperty("ip", (String)f());
    super.a(☃);
  }
}
