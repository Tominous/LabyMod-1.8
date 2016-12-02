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
