import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class aqk
  extends aqq
{
  private int f = 32;
  private int g = 5;
  public static final List<ady> d = Arrays.asList(new ady[] { ady.p, ady.N, ady.w, ady.z, ady.A });
  private static final List<ady.c> h = Lists.newArrayList();
  
  static
  {
    h.add(new ady.c(vt.class, 1, 2, 4));
  }
  
  public aqk(Map<String, String> ☃)
  {
    this();
    for (Map.Entry<String, String> ☃ : ☃.entrySet()) {
      if (((String)☃.getKey()).equals("spacing")) {
        f = ns.a((String)☃.getValue(), f, 1);
      } else if (((String)☃.getKey()).equals("separation")) {
        g = ns.a((String)☃.getValue(), g, 1);
      }
    }
  }
  
  public String a()
  {
    return "Monument";
  }
  
  protected boolean a(int ☃, int ☃)
  {
    int ☃ = ☃;
    int ☃ = ☃;
    if (☃ < 0) {
      ☃ -= f - 1;
    }
    if (☃ < 0) {
      ☃ -= f - 1;
    }
    int ☃ = ☃ / f;
    int ☃ = ☃ / f;
    
    Random ☃ = c.a(☃, ☃, 10387313);
    ☃ *= f;
    ☃ *= f;
    ☃ += (☃.nextInt(f - g) + ☃.nextInt(f - g)) / 2;
    ☃ += (☃.nextInt(f - g) + ☃.nextInt(f - g)) / 2;
    
    ☃ = ☃;
    ☃ = ☃;
    if ((☃ == ☃) && (☃ == ☃))
    {
      if (c.v().a(new cj(☃ * 16 + 8, 64, ☃ * 16 + 8), null) != ady.N) {
        return false;
      }
      boolean ☃ = c.v().a(☃ * 16 + 8, ☃ * 16 + 8, 29, d);
      if (☃) {
        return true;
      }
    }
    return false;
  }
  
  protected aqu b(int ☃, int ☃)
  {
    return new aqk.a(c, b, ☃, ☃);
  }
  
  public static class a
    extends aqu
  {
    private Set<adg> c = Sets.newHashSet();
    private boolean d;
    
    public a() {}
    
    public a(adm ☃, Random ☃, int ☃, int ☃)
    {
      super(☃);
      b(☃, ☃, ☃, ☃);
    }
    
    private void b(adm ☃, Random ☃, int ☃, int ☃)
    {
      ☃.setSeed(☃.J());
      long ☃ = ☃.nextLong();
      long ☃ = ☃.nextLong();
      long ☃ = ☃ * ☃;
      long ☃ = ☃ * ☃;
      ☃.setSeed(☃ ^ ☃ ^ ☃.J());
      
      int ☃ = ☃ * 16 + 8 - 29;
      int ☃ = ☃ * 16 + 8 - 29;
      cq ☃ = cq.c.a.a(☃);
      
      a.add(new aql.h(☃, ☃, ☃, ☃));
      c();
      
      d = true;
    }
    
    public void a(adm ☃, Random ☃, aqe ☃)
    {
      if (!d)
      {
        a.clear();
        b(☃, ☃, e(), f());
      }
      super.a(☃, ☃, ☃);
    }
    
    public boolean a(adg ☃)
    {
      if (c.contains(☃)) {
        return false;
      }
      return super.a(☃);
    }
    
    public void b(adg ☃)
    {
      super.b(☃);
      
      c.add(☃);
    }
    
    public void a(dn ☃)
    {
      super.a(☃);
      
      du ☃ = new du();
      for (adg ☃ : c)
      {
        dn ☃ = new dn();
        ☃.a("X", a);
        ☃.a("Z", b);
        ☃.a(☃);
      }
      ☃.a("Processed", ☃);
    }
    
    public void b(dn ☃)
    {
      super.b(☃);
      if (☃.b("Processed", 9))
      {
        du ☃ = ☃.c("Processed", 10);
        for (int ☃ = 0; ☃ < ☃.c(); ☃++)
        {
          dn ☃ = ☃.b(☃);
          c.add(new adg(☃.f("X"), ☃.f("Z")));
        }
      }
    }
  }
  
  public List<ady.c> b()
  {
    return h;
  }
  
  public aqk() {}
}
