import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

public class id
  implements ff<ic>
{
  private String a;
  private cj b;
  
  public id() {}
  
  public id(String ☃)
  {
    this(☃, null);
  }
  
  public id(String ☃, cj ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.c(32767);
    boolean ☃ = ☃.readBoolean();
    if (☃) {
      b = ☃.c();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(StringUtils.substring(a, 0, 32767));
    boolean ☃ = b != null;
    ☃.writeBoolean(☃);
    if (☃) {
      ☃.a(b);
    }
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return a;
  }
  
  public cj b()
  {
    return b;
  }
}
