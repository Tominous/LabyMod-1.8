import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class bno
  implements bnh
{
  private final Map<String, bnw> a = Maps.newHashMap();
  private final String b;
  private final jy c;
  private final InputStream d;
  private final InputStream e;
  private final bny f;
  private boolean g;
  private JsonObject h;
  
  public bno(String ☃, jy ☃, InputStream ☃, InputStream ☃, bny ☃)
  {
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
    f = ☃;
  }
  
  public jy a()
  {
    return c;
  }
  
  public InputStream b()
  {
    return d;
  }
  
  public boolean c()
  {
    return e != null;
  }
  
  public <T extends bnw> T a(String ☃)
  {
    if (!c()) {
      return null;
    }
    if ((h == null) && (!g))
    {
      g = true;
      
      BufferedReader ☃ = null;
      try
      {
        ☃ = new BufferedReader(new InputStreamReader(e));
        h = new JsonParser().parse(☃).getAsJsonObject();
      }
      finally
      {
        IOUtils.closeQuietly(☃);
      }
    }
    T ☃ = (bnw)a.get(☃);
    if (☃ == null) {
      ☃ = f.a(☃, h);
    }
    return ☃;
  }
  
  public String d()
  {
    return b;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if (!(☃ instanceof bno)) {
      return false;
    }
    bno ☃ = (bno)☃;
    if (c != null ? !c.equals(c) : c != null) {
      return false;
    }
    if (b != null ? !b.equals(b) : b != null) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    int ☃ = b != null ? b.hashCode() : 0;
    ☃ = 31 * ☃ + (c != null ? c.hashCode() : 0);
    return ☃;
  }
}
