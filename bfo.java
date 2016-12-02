import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;

public class bfo
{
  private final Map<Integer, bov> a = Maps.newHashMap();
  private final Map<Integer, boq> b = Maps.newHashMap();
  private final Map<zw, bfp> c = Maps.newHashMap();
  private final bou d;
  
  public bfo(bou ☃)
  {
    this.d = ☃;
  }
  
  public bmi a(zw ☃)
  {
    return a(☃, 0);
  }
  
  public bmi a(zw ☃, int ☃)
  {
    return a(new zx(☃, 1, ☃)).e();
  }
  
  public boq a(zx ☃)
  {
    zw ☃ = ☃.b();
    
    boq ☃ = b(☃, b(☃));
    if (☃ == null)
    {
      bfp ☃ = (bfp)this.c.get(☃);
      if (☃ != null) {
        ☃ = this.d.a(☃.a(☃));
      }
    }
    if (☃ == null) {
      ☃ = this.d.a();
    }
    return ☃;
  }
  
  protected int b(zx ☃)
  {
    return ☃.e() ? 0 : ☃.i();
  }
  
  protected boq b(zw ☃, int ☃)
  {
    return (boq)this.b.get(Integer.valueOf(c(☃, ☃)));
  }
  
  private int c(zw ☃, int ☃)
  {
    return zw.b(☃) << 16 | ☃;
  }
  
  public void a(zw ☃, int ☃, bov ☃)
  {
    this.a.put(Integer.valueOf(c(☃, ☃)), ☃);
    this.b.put(Integer.valueOf(c(☃, ☃)), this.d.a(☃));
  }
  
  public void a(zw ☃, bfp ☃)
  {
    this.c.put(☃, ☃);
  }
  
  public bou a()
  {
    return this.d;
  }
  
  public void b()
  {
    this.b.clear();
    for (Map.Entry<Integer, bov> ☃ : this.a.entrySet()) {
      this.b.put(☃.getKey(), this.d.a((bov)☃.getValue()));
    }
  }
}
