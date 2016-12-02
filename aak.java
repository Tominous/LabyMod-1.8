import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class aak
  extends zw
{
  private static final Map<String, aak> b = ;
  public final String a;
  
  protected aak(String ☃)
  {
    this.a = ☃;
    this.h = 1;
    a(yz.f);
    
    b.put("records." + ☃, this);
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    alz ☃ = ☃.p(☃);
    if ((☃.c() == afi.aN) && (!((Boolean)☃.b(ahq.a)).booleanValue()))
    {
      if (☃.D) {
        return true;
      }
      ((ahq)afi.aN).a(☃, ☃, ☃, ☃);
      ☃.a(null, 1005, ☃, zw.b(this));
      ☃.b -= 1;
      ☃.b(na.X);
      return true;
    }
    return false;
  }
  
  public void a(zx ☃, wn ☃, List<String> ☃, boolean ☃)
  {
    ☃.add(g());
  }
  
  public String g()
  {
    return di.a("item.record." + this.a + ".desc");
  }
  
  public aaj g(zx ☃)
  {
    return aaj.c;
  }
  
  public static aak b(String ☃)
  {
    return (aak)b.get(☃);
  }
}
