import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class kc$a
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
