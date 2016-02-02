import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class lu
  extends mb<String, lv>
{
  public lu(File ☃)
  {
    super(☃);
  }
  
  protected ma<String> a(JsonObject ☃)
  {
    return new lv(☃);
  }
  
  public boolean a(SocketAddress ☃)
  {
    String ☃ = c(☃);
    return d(☃);
  }
  
  public lv b(SocketAddress ☃)
  {
    String ☃ = c(☃);
    return (lv)b(☃);
  }
  
  private String c(SocketAddress ☃)
  {
    String ☃ = ☃.toString();
    if (☃.contains("/")) {
      ☃ = ☃.substring(☃.indexOf('/') + 1);
    }
    if (☃.contains(":")) {
      ☃ = ☃.substring(0, ☃.indexOf(':'));
    }
    return ☃;
  }
}
