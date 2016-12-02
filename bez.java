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
    this.a = ☃;
  }
  
  public int a_(int ☃)
  {
    if (this.b.containsKey(Integer.valueOf(☃))) {
      return ((Integer)this.b.get(Integer.valueOf(☃))).intValue();
    }
    return 0;
  }
  
  public void b(int ☃, int ☃)
  {
    this.b.put(Integer.valueOf(☃), Integer.valueOf(☃));
  }
  
  public int g()
  {
    return this.b.size();
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
    return this.a;
  }
  
  public xi a(wm ☃, wn ☃)
  {
    throw new UnsupportedOperationException();
  }
}
