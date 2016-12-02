import com.google.common.collect.Maps;
import java.util.Map;

public class nb
{
  protected final Map<mw, my> a = Maps.newConcurrentMap();
  
  public boolean a(mq ☃)
  {
    return a(☃) > 0;
  }
  
  public boolean b(mq ☃)
  {
    return (☃.c == null) || (a(☃.c));
  }
  
  public int c(mq ☃)
  {
    if (a(☃)) {
      return 0;
    }
    int ☃ = 0;
    mq ☃ = ☃.c;
    while ((☃ != null) && (!a(☃)))
    {
      ☃ = ☃.c;
      ☃++;
    }
    return ☃;
  }
  
  public void b(wn ☃, mw ☃, int ☃)
  {
    if ((☃.d()) && (!b((mq)☃))) {
      return;
    }
    a(☃, ☃, a(☃) + ☃);
  }
  
  public void a(wn ☃, mw ☃, int ☃)
  {
    my ☃ = (my)this.a.get(☃);
    if (☃ == null)
    {
      ☃ = new my();
      this.a.put(☃, ☃);
    }
    ☃.a(☃);
  }
  
  public int a(mw ☃)
  {
    my ☃ = (my)this.a.get(☃);
    return ☃ == null ? 0 : ☃.a();
  }
  
  public <T extends mz> T b(mw ☃)
  {
    my ☃ = (my)this.a.get(☃);
    if (☃ != null) {
      return ☃.b();
    }
    return null;
  }
  
  public <T extends mz> T a(mw ☃, T ☃)
  {
    my ☃ = (my)this.a.get(☃);
    if (☃ == null)
    {
      ☃ = new my();
      this.a.put(☃, ☃);
    }
    ☃.a(☃);
    
    return ☃;
  }
}
