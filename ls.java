import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class ls<T>
  extends ma<T>
{
  public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
  protected final Date b;
  protected final String c;
  protected final Date d;
  protected final String e;
  
  public ls(T ☃, Date ☃, String ☃, Date ☃, String ☃)
  {
    super(☃);
    b = (☃ == null ? new Date() : ☃);
    c = (☃ == null ? "(Unknown)" : ☃);
    d = ☃;
    e = (☃ == null ? "Banned by an operator." : ☃);
  }
  
  protected ls(T ☃, JsonObject ☃)
  {
    super(☃, ☃);
    Date ☃;
    try
    {
      ☃ = ☃.has("created") ? a.parse(☃.get("created").getAsString()) : new Date();
    }
    catch (ParseException ☃)
    {
      ☃ = new Date();
    }
    b = ☃;
    c = (☃.has("source") ? ☃.get("source").getAsString() : "(Unknown)");
    Date ☃;
    try
    {
      ☃ = ☃.has("expires") ? a.parse(☃.get("expires").getAsString()) : null;
    }
    catch (ParseException ☃)
    {
      ☃ = null;
    }
    d = ☃;
    e = (☃.has("reason") ? ☃.get("reason").getAsString() : "Banned by an operator.");
  }
  
  public Date c()
  {
    return d;
  }
  
  public String d()
  {
    return e;
  }
  
  boolean e()
  {
    if (d == null) {
      return false;
    }
    return d.before(new Date());
  }
  
  protected void a(JsonObject ☃)
  {
    ☃.addProperty("created", a.format(b));
    ☃.addProperty("source", c);
    ☃.addProperty("expires", d == null ? "forever" : a.format(d));
    ☃.addProperty("reason", e);
  }
}
