import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class kc
  extends IOException
{
  private final List<kc.a> a = Lists.newArrayList();
  private final String b;
  
  public kc(String ☃)
  {
    this.a.add(new kc.a(null));
    this.b = ☃;
  }
  
  public kc(String ☃, Throwable ☃)
  {
    super(☃);
    this.a.add(new kc.a(null));
    this.b = ☃;
  }
  
  public void a(String ☃)
  {
    kc.a.a((kc.a)this.a.get(0), ☃);
  }
  
  public void b(String ☃)
  {
    kc.a.b((kc.a)this.a.get(0), ☃);
    this.a.add(0, new kc.a(null));
  }
  
  public String getMessage()
  {
    return "Invalid " + ((kc.a)this.a.get(this.a.size() - 1)).toString() + ": " + this.b;
  }
  
  public static kc a(Exception ☃)
  {
    if ((☃ instanceof kc)) {
      return (kc)☃;
    }
    String ☃ = ☃.getMessage();
    if ((☃ instanceof FileNotFoundException)) {
      ☃ = "File not found";
    }
    return new kc(☃, ☃);
  }
  
  public static class a
  {
    private String a = null;
    private final List<String> b = Lists.newArrayList();
    
    private void a(String ☃)
    {
      this.b.add(0, ☃);
    }
    
    public String b()
    {
      return StringUtils.join(this.b, "->");
    }
    
    public String toString()
    {
      if (this.a != null)
      {
        if (!this.b.isEmpty()) {
          return this.a + " " + b();
        }
        return this.a;
      }
      if (!this.b.isEmpty()) {
        return "(Unknown file) " + b();
      }
      return "(Unknown file)";
    }
  }
}
