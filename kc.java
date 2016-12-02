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
    a.add(new kc.a(null));
    b = ☃;
  }
  
  public kc(String ☃, Throwable ☃)
  {
    super(☃);
    a.add(new kc.a(null));
    b = ☃;
  }
  
  public void a(String ☃)
  {
    kc.a.a((kc.a)a.get(0), ☃);
  }
  
  public void b(String ☃)
  {
    kc.a.b((kc.a)a.get(0), ☃);
    a.add(0, new kc.a(null));
  }
  
  public String getMessage()
  {
    return "Invalid " + ((kc.a)a.get(a.size() - 1)).toString() + ": " + b;
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
      b.add(0, ☃);
    }
    
    public String b()
    {
      return StringUtils.join(b, "->");
    }
    
    public String toString()
    {
      if (a != null)
      {
        if (!b.isEmpty()) {
          return a + " " + b();
        }
        return a;
      }
      if (!b.isEmpty()) {
        return "(Unknown file) " + b();
      }
      return "(Unknown file)";
    }
  }
}
