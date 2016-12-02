import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class fr
  implements ff<fj>
{
  private Map<mw, Integer> a;
  
  public fr() {}
  
  public fr(Map<mw, Integer> ☃)
  {
    a = ☃;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    int ☃ = ☃.e();
    a = Maps.newHashMap();
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      mw ☃ = na.a(☃.c(32767));
      int ☃ = ☃.e();
      if (☃ != null) {
        a.put(☃, Integer.valueOf(☃));
      }
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a.size());
    for (Map.Entry<mw, Integer> ☃ : a.entrySet())
    {
      ☃.a(getKeye);
      ☃.b(((Integer)☃.getValue()).intValue());
    }
  }
  
  public Map<mw, Integer> a()
  {
    return a;
  }
}
