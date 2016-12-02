import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class aqv
  extends aqq
{
  public static final List<ady> d = Arrays.asList(new ady[] { ady.q, ady.r, ady.Y });
  private int f;
  private int g = 32;
  private int h = 8;
  
  public aqv() {}
  
  public aqv(Map<String, String> ☃)
  {
    this();
    for (Map.Entry<String, String> ☃ : ☃.entrySet()) {
      if (((String)☃.getKey()).equals("size")) {
        f = ns.a((String)☃.getValue(), f, 0);
      } else if (((String)☃.getKey()).equals("distance")) {
        g = ns.a((String)☃.getValue(), g, h + 1);
      }
    }
  }
  
  public String a()
  {
    return "Village";
  }
  
  protected boolean a(int ☃, int ☃)
  {
    int ☃ = ☃;
    int ☃ = ☃;
    if (☃ < 0) {
      ☃ -= g - 1;
    }
    if (☃ < 0) {
      ☃ -= g - 1;
    }
    int ☃ = ☃ / g;
    int ☃ = ☃ / g;
    Random ☃ = c.a(☃, ☃, 10387312);
    ☃ *= g;
    ☃ *= g;
    ☃ += ☃.nextInt(g - h);
    ☃ += ☃.nextInt(g - h);
    ☃ = ☃;
    ☃ = ☃;
    if ((☃ == ☃) && (☃ == ☃))
    {
      boolean ☃ = c.v().a(☃ * 16 + 8, ☃ * 16 + 8, 0, d);
      if (☃) {
        return true;
      }
    }
    return false;
  }
  
  protected aqu b(int ☃, int ☃)
  {
    return new aqv.a(c, b, ☃, ☃, f);
  }
  
  public static class a
    extends aqu
  {
    private boolean c;
    
    public a() {}
    
    public a(adm ☃, Random ☃, int ☃, int ☃, int ☃)
    {
      super(☃);
      
      List<aqw.e> ☃ = aqw.a(☃, ☃);
      
      aqw.k ☃ = new aqw.k(☃.v(), 0, ☃, (☃ << 4) + 2, (☃ << 4) + 2, ☃, ☃);
      a.add(☃);
      ☃.a(☃, a, ☃);
      
      List<aqt> ☃ = g;
      List<aqt> ☃ = f;
      while ((!☃.isEmpty()) || (!☃.isEmpty())) {
        if (☃.isEmpty())
        {
          int ☃ = ☃.nextInt(☃.size());
          aqt ☃ = (aqt)☃.remove(☃);
          ☃.a(☃, a, ☃);
        }
        else
        {
          int ☃ = ☃.nextInt(☃.size());
          aqt ☃ = (aqt)☃.remove(☃);
          ☃.a(☃, a, ☃);
        }
      }
      c();
      
      int ☃ = 0;
      for (aqt ☃ : a) {
        if (!(☃ instanceof aqw.o)) {
          ☃++;
        }
      }
      c = (☃ > 2);
    }
    
    public boolean d()
    {
      return c;
    }
    
    public void a(dn ☃)
    {
      super.a(☃);
      
      ☃.a("Valid", c);
    }
    
    public void b(dn ☃)
    {
      super.b(☃);
      c = ☃.n("Valid");
    }
  }
}
