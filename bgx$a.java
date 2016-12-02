import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

public class bgx$a
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
