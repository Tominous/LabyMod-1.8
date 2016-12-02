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
    this.a = ☃;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    int ☃ = ☃.e();
    this.a = Maps.newHashMap();
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      mw ☃ = na.a(☃.c(32767));
      int ☃ = ☃.e();
      if (☃ != null) {
        this.a.put(☃, Integer.valueOf(☃));
      }
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a.size());
    for (Map.Entry<mw, Integer> ☃ : this.a.entrySet())
    {
      ☃.a(((mw)☃.getKey()).e);
      ☃.b(((Integer)☃.getValue()).intValue());
    }
  }
  
  public Map<mw, Integer> a()
  {
    return this.a;
  }
}
