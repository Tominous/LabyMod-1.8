import com.google.common.collect.ImmutableSet;
import java.util.Collection;

public class amk
  extends amj<Boolean>
{
  private final ImmutableSet<Boolean> a;
  
  protected amk(String ☃)
  {
    super(☃, Boolean.class);
    this.a = ImmutableSet.of(Boolean.valueOf(true), Boolean.valueOf(false));
  }
  
  public Collection<Boolean> c()
  {
    return this.a;
  }
  
  public static amk a(String ☃)
  {
    return new amk(☃);
  }
  
  public String a(Boolean ☃)
  {
    return ☃.toString();
  }
}
