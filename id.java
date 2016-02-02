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
    this.a = ☃;
    this.b = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.c(32767);
    boolean ☃ = ☃.readBoolean();
    if (☃) {
      this.b = ☃.c();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(StringUtils.substring(this.a, 0, 32767));
    boolean ☃ = this.b != null;
    ☃.writeBoolean(☃);
    if (☃) {
      ☃.a(this.b);
    }
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public cj b()
  {
    return this.b;
  }
}
