import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import java.util.Map;

public class bqh
{
  private static final Gson a = new Gson();
  private final String b;
  private String c;
  private Map<String, String> d;
  
  public bqh(String ☃, String ☃)
  {
    this.b = ☃;
    this.c = ☃;
  }
  
  public bqh(String ☃)
  {
    this(☃, null);
  }
  
  public void a(String ☃)
  {
    this.c = ☃;
  }
  
  public String a()
  {
    return this.c == null ? this.b : this.c;
  }
  
  public void a(String ☃, String ☃)
  {
    if (this.d == null) {
      this.d = Maps.newHashMap();
    }
    if (this.d.size() > 50) {
      throw new IllegalArgumentException("Metadata payload is full, cannot add more to it!");
    }
    if (☃ == null) {
      throw new IllegalArgumentException("Metadata payload key cannot be null!");
    }
    if (☃.length() > 255) {
      throw new IllegalArgumentException("Metadata payload key is too long!");
    }
    if (☃ == null) {
      throw new IllegalArgumentException("Metadata payload value cannot be null!");
    }
    if (☃.length() > 255) {
      throw new IllegalArgumentException("Metadata payload value is too long!");
    }
    this.d.put(☃, ☃);
  }
  
  public String b()
  {
    if ((this.d == null) || (this.d.isEmpty())) {
      return null;
    }
    return a.toJson(this.d);
  }
  
  public String c()
  {
    return this.b;
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("name", this.b).add("description", this.c).add("data", b()).toString();
  }
}
