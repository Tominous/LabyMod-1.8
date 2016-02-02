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
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
    this.f = ☃;
  }
  
  public jy a()
  {
    return this.c;
  }
  
  public InputStream b()
  {
    return this.d;
  }
  
  public boolean c()
  {
    return this.e != null;
  }
  
  public <T extends bnw> T a(String ☃)
  {
    if (!c()) {
      return null;
    }
    if ((this.h == null) && (!this.g))
    {
      this.g = true;
      
      BufferedReader ☃ = null;
      try
      {
        ☃ = new BufferedReader(new InputStreamReader(this.e));
        this.h = new JsonParser().parse(☃).getAsJsonObject();
      }
      finally
      {
        IOUtils.closeQuietly(☃);
      }
    }
    T ☃ = (bnw)this.a.get(☃);
    if (☃ == null) {
      ☃ = this.f.a(☃, this.h);
    }
    return ☃;
  }
  
  public String d()
  {
    return this.b;
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
    if (this.c != null ? !this.c.equals(☃.c) : ☃.c != null) {
      return false;
    }
    if (this.b != null ? !this.b.equals(☃.b) : ☃.b != null) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    int ☃ = this.b != null ? this.b.hashCode() : 0;
    ☃ = 31 * ☃ + (this.c != null ? this.c.hashCode() : 0);
    return ☃;
  }
}
