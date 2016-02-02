import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class bha
  extends bhd<aku>
{
  private static final Map<String, bha.a> c = ;
  private static final jy d = new jy("textures/entity/banner_base.png");
  private bau e;
  
  public bha()
  {
    this.e = new bau();
  }
  
  public void a(aku ☃, double ☃, double ☃, double ☃, float ☃, int ☃)
  {
    boolean ☃ = ☃.z() != null;
    boolean ☃ = (!☃) || (☃.w() == afi.cK);
    int ☃ = ☃ ? ☃.u() : 0;
    long ☃ = ☃ ? ☃.z().K() : 0L;
    
    bfl.E();
    float ☃ = 0.6666667F;
    if (☃)
    {
      bfl.b((float)☃ + 0.5F, (float)☃ + 0.75F * ☃, (float)☃ + 0.5F);
      float ☃ = ☃ * 360 / 16.0F;
      bfl.b(-☃, 0.0F, 1.0F, 0.0F);
      this.e.b.j = true;
    }
    else
    {
      int ☃ = ☃;
      float ☃ = 0.0F;
      if (☃ == 2) {
        ☃ = 180.0F;
      }
      if (☃ == 4) {
        ☃ = 90.0F;
      }
      if (☃ == 5) {
        ☃ = -90.0F;
      }
      bfl.b((float)☃ + 0.5F, (float)☃ - 0.25F * ☃, (float)☃ + 0.5F);
      bfl.b(-☃, 0.0F, 1.0F, 0.0F);
      bfl.b(0.0F, -0.3125F, -0.4375F);
      
      this.e.b.j = false;
    }
    cj ☃ = ☃.v();
    float ☃ = ☃.n() * 7 + ☃.o() * 9 + ☃.p() * 13 + (float)☃ + ☃;
    this.e.a.f = ((-0.0125F + 0.01F * ns.b(☃ * 3.1415927F * 0.02F)) * 3.1415927F);
    
    bfl.B();
    jy ☃ = a(☃);
    if (☃ != null)
    {
      a(☃);
      
      bfl.E();
      bfl.a(☃, -☃, -☃);
      this.e.a();
      bfl.F();
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.F();
  }
  
  private jy a(aku ☃)
  {
    String ☃ = ☃.g();
    if (☃.isEmpty()) {
      return null;
    }
    bha.a ☃ = (bha.a)c.get(☃);
    if (☃ == null)
    {
      if (c.size() >= 256)
      {
        long ☃ = System.currentTimeMillis();
        Iterator<String> ☃ = c.keySet().iterator();
        while (☃.hasNext())
        {
          String ☃ = (String)☃.next();
          bha.a ☃ = (bha.a)c.get(☃);
          if (☃ - ☃.a > 60000L)
          {
            ave.A().P().c(☃.b);
            ☃.remove();
          }
        }
        if (c.size() >= 256) {
          return null;
        }
      }
      List<aku.a> ☃ = ☃.c();
      List<zd> ☃ = ☃.e();
      
      List<String> ☃ = Lists.newArrayList();
      for (aku.a ☃ : ☃) {
        ☃.add("textures/entity/banner/" + ☃.a() + ".png");
      }
      ☃ = new bha.a(null);
      ☃.b = new jy(☃);
      ave.A().P().a(☃.b, new bmc(d, ☃, ☃));
      c.put(☃, ☃);
    }
    ☃.a = System.currentTimeMillis();
    return ☃.b;
  }
  
  static class a
  {
    public long a;
    public jy b;
  }
}
