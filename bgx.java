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
    this.a = ☃;
    this.c = ☃;
    this.d = ☃;
  }
  
  protected bov a(alz ☃)
  {
    Map<amo, Comparable> ☃ = Maps.newLinkedHashMap(☃.b());
    String ☃;
    String ☃;
    if (this.a == null) {
      ☃ = ((jy)afh.c.c(☃.c())).toString();
    } else {
      ☃ = this.a.a((Comparable)☃.remove(this.a));
    }
    if (this.c != null) {
      ☃ = ☃ + this.c;
    }
    for (amo<?> ☃ : this.d) {
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
      this.a = ☃;
      return this;
    }
    
    public a a(String ☃)
    {
      this.b = ☃;
      return this;
    }
    
    public a a(amo<?>... ☃)
    {
      Collections.addAll(this.c, ☃);
      return this;
    }
    
    public bgx a()
    {
      return new bgx(this.a, this.b, this.c, null);
    }
  }
}
