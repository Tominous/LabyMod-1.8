import com.google.common.collect.Maps;
import java.util.Map;

public class bez
  extends oq
  implements oo
{
  private String a;
  private Map<Integer, Integer> b = Maps.newHashMap();
  
  public bez(String ☃, eu ☃, int ☃)
  {
    super(☃, ☃);
    a = ☃;
  }
  
  public int a_(int ☃)
  {
    if (b.containsKey(Integer.valueOf(☃))) {
      return ((Integer)b.get(Integer.valueOf(☃))).intValue();
    }
    return 0;
  }
  
  public void b(int ☃, int ☃)
  {
    b.put(Integer.valueOf(☃), Integer.valueOf(☃));
  }
  
  public int g()
  {
    return b.size();
  }
  
  public boolean r_()
  {
    return false;
  }
  
  public void a(on ☃) {}
  
  public on i()
  {
    return on.a;
  }
  
  public String k()
  {
    return a;
  }
  
  public xi a(wm ☃, wn ☃)
  {
    throw new UnsupportedOperationException();
  }
}
