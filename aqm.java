import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class aqm
  extends aqq
{
  private static final List<ady> d = Arrays.asList(new ady[] { ady.r, ady.G, ady.K, ady.L, ady.v });
  private List<ady.c> f = Lists.newArrayList();
  private int g = 32;
  private int h = 8;
  
  public aqm()
  {
    f.add(new ady.c(wd.class, 1, 1, 1));
  }
  
  public aqm(Map<String, String> ☃)
  {
    this();
    for (Map.Entry<String, String> ☃ : ☃.entrySet()) {
      if (((String)☃.getKey()).equals("distance")) {
        g = ns.a((String)☃.getValue(), g, h + 1);
      }
    }
  }
  
  public String a()
  {
    return "Temple";
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
    Random ☃ = c.a(☃, ☃, 14357617);
    ☃ *= g;
    ☃ *= g;
    ☃ += ☃.nextInt(g - h);
    ☃ += ☃.nextInt(g - h);
    ☃ = ☃;
    ☃ = ☃;
    ady ☃;
    if ((☃ == ☃) && (☃ == ☃))
    {
      ☃ = c.v().a(new cj(☃ * 16 + 8, 0, ☃ * 16 + 8));
      if (☃ == null) {
        return false;
      }
      for (ady ☃ : d) {
        if (☃ == ☃) {
          return true;
        }
      }
    }
    return false;
  }
  
  protected aqu b(int ☃, int ☃)
  {
    return new aqm.a(c, b, ☃, ☃);
  }
  
  public static class a
    extends aqu
  {
    public a() {}
    
    public a(adm ☃, Random ☃, int ☃, int ☃)
    {
      super(☃);
      ady ☃ = ☃.b(new cj(☃ * 16 + 8, 0, ☃ * 16 + 8));
      if ((☃ == ady.K) || (☃ == ady.L))
      {
        aqn.b ☃ = new aqn.b(☃, ☃ * 16, ☃ * 16);
        a.add(☃);
      }
      else if (☃ == ady.v)
      {
        aqn.d ☃ = new aqn.d(☃, ☃ * 16, ☃ * 16);
        a.add(☃);
      }
      else if ((☃ == ady.r) || (☃ == ady.G))
      {
        aqn.a ☃ = new aqn.a(☃, ☃ * 16, ☃ * 16);
        a.add(☃);
      }
      c();
    }
  }
  
  public boolean a(cj ☃)
  {
    aqu ☃ = c(☃);
    if ((☃ == null) || (!(☃ instanceof aqm.a)) || (a.isEmpty())) {
      return false;
    }
    aqt ☃ = (aqt)a.getFirst();
    return ☃ instanceof aqn.d;
  }
  
  public List<ady.c> b()
  {
    return f;
  }
}
