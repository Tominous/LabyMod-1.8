import com.google.common.collect.Lists;
import java.util.List;

public class bae
  implements bag
{
  private final List<bah> a = Lists.newArrayList();
  
  public bae()
  {
    a.add(new bak());
    a.add(new bal());
  }
  
  public List<bah> a()
  {
    return a;
  }
  
  public eu b()
  {
    return new fa("Press a key to select a command, and again to use it.");
  }
}
