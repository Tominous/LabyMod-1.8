import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class aqo
  extends aqq
{
  private List<ady> d;
  private boolean f;
  private adg[] g = new adg[3];
  private double h = 32.0D;
  private int i = 3;
  
  public aqo()
  {
    d = Lists.newArrayList();
    for (ady ☃ : ady.n()) {
      if ((☃ != null) && (an > 0.0F)) {
        d.add(☃);
      }
    }
  }
  
  public aqo(Map<String, String> ☃)
  {
    this();
    for (Map.Entry<String, String> ☃ : ☃.entrySet()) {
      if (((String)☃.getKey()).equals("distance")) {
        h = ns.a((String)☃.getValue(), h, 1.0D);
      } else if (((String)☃.getKey()).equals("count")) {
        g = new adg[ns.a((String)☃.getValue(), g.length, 1)];
      } else if (((String)☃.getKey()).equals("spread")) {
        i = ns.a((String)☃.getValue(), i, 1);
      }
    }
  }
  
  public String a()
  {
    return "Stronghold";
  }
  
  protected boolean a(int ☃, int ☃)
  {
    if (!f)
    {
      Random ☃ = new Random();
      
      ☃.setSeed(c.J());
      
      double ☃ = ☃.nextDouble() * 3.141592653589793D * 2.0D;
      int ☃ = 1;
      for (int ☃ = 0; ☃ < g.length; ☃++)
      {
        double ☃ = (1.25D * ☃ + ☃.nextDouble()) * (h * ☃);
        int ☃ = (int)Math.round(Math.cos(☃) * ☃);
        int ☃ = (int)Math.round(Math.sin(☃) * ☃);
        
        cj ☃ = c.v().a((☃ << 4) + 8, (☃ << 4) + 8, 112, d, ☃);
        if (☃ != null)
        {
          ☃ = ☃.n() >> 4;
          ☃ = ☃.p() >> 4;
        }
        g[☃] = new adg(☃, ☃);
        
        ☃ += 6.283185307179586D * ☃ / i;
        if (☃ == i)
        {
          ☃ += 2 + ☃.nextInt(5);
          i += 1 + ☃.nextInt(2);
        }
      }
      f = true;
    }
    for (adg ☃ : g) {
      if ((☃ == a) && (☃ == b)) {
        return true;
      }
    }
    return false;
  }
  
  protected List<cj> z_()
  {
    List<cj> ☃ = Lists.newArrayList();
    for (adg ☃ : g) {
      if (☃ != null) {
        ☃.add(☃.a(64));
      }
    }
    return ☃;
  }
  
  protected aqu b(int ☃, int ☃)
  {
    aqo.a ☃ = new aqo.a(c, b, ☃, ☃);
    while ((☃.b().isEmpty()) || (bget0b == null)) {
      ☃ = new aqo.a(c, b, ☃, ☃);
    }
    return ☃;
  }
  
  public static class a
    extends aqu
  {
    public a() {}
    
    public a(adm ☃, Random ☃, int ☃, int ☃)
    {
      super(☃);
      
      aqp.b();
      
      aqp.m ☃ = new aqp.m(0, ☃, (☃ << 4) + 2, (☃ << 4) + 2);
      a.add(☃);
      ☃.a(☃, a, ☃);
      
      List<aqt> ☃ = c;
      while (!☃.isEmpty())
      {
        int ☃ = ☃.nextInt(☃.size());
        aqt ☃ = (aqt)☃.remove(☃);
        ☃.a(☃, a, ☃);
      }
      c();
      a(☃, ☃, 10);
    }
  }
}
