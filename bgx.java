import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class bgx
  extends bgu
{
  private final amo<?> a;
  private final String c;
  private final List<amo<?>> d;
  
  private bgx(amo<?> ☃, String ☃, List<amo<?>> ☃)
  {
    a = ☃;
    c = ☃;
    d = ☃;
  }
  
  protected bov a(alz ☃)
  {
    Map<amo, Comparable> ☃ = Maps.newLinkedHashMap(☃.b());
    String ☃;
    String ☃;
    if (a == null) {
      ☃ = ((jy)afh.c.c(☃.c())).toString();
    } else {
      ☃ = a.a((Comparable)☃.remove(a));
    }
    if (c != null) {
      ☃ = ☃ + c;
    }
    for (amo<?> ☃ : d) {
      ☃.remove(☃);
    }
    return new bov(☃, a(☃));
  }
  
  public static class a
  {
    private amo<?> a;
    private String b;
    private final List<amo<?>> c = Lists.newArrayList();
    
    public a a(amo<?> ☃)
    {
      a = ☃;
      return this;
    }
    
    public a a(String ☃)
    {
      b = ☃;
      return this;
    }
    
    public a a(amo<?>... ☃)
    {
      Collections.addAll(c, ☃);
      return this;
    }
    
    public bgx a()
    {
      return new bgx(a, b, c, null);
    }
  }
}
