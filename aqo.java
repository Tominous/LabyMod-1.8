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
    this.d = Lists.newArrayList();
    for (ady ☃ : ady.n()) {
      if ((☃ != null) && (☃.an > 0.0F)) {
        this.d.add(☃);
      }
    }
  }
  
  public aqo(Map<String, String> ☃)
  {
    this();
    for (Map.Entry<String, String> ☃ : ☃.entrySet()) {
      if (((String)☃.getKey()).equals("distance")) {
        this.h = ns.a((String)☃.getValue(), this.h, 1.0D);
      } else if (((String)☃.getKey()).equals("count")) {
        this.g = new adg[ns.a((String)☃.getValue(), this.g.length, 1)];
      } else if (((String)☃.getKey()).equals("spread")) {
        this.i = ns.a((String)☃.getValue(), this.i, 1);
      }
    }
  }
  
  public String a()
  {
    return "Stronghold";
  }
  
  protected boolean a(int ☃, int ☃)
  {
    if (!this.f)
    {
      Random ☃ = new Random();
      
      ☃.setSeed(this.c.J());
      
      double ☃ = ☃.nextDouble() * 3.141592653589793D * 2.0D;
      int ☃ = 1;
      for (int ☃ = 0; ☃ < this.g.length; ☃++)
      {
        double ☃ = (1.25D * ☃ + ☃.nextDouble()) * (this.h * ☃);
        int ☃ = (int)Math.round(Math.cos(☃) * ☃);
        int ☃ = (int)Math.round(Math.sin(☃) * ☃);
        
        cj ☃ = this.c.v().a((☃ << 4) + 8, (☃ << 4) + 8, 112, this.d, ☃);
        if (☃ != null)
        {
          ☃ = ☃.n() >> 4;
          ☃ = ☃.p() >> 4;
        }
        this.g[☃] = new adg(☃, ☃);
        
        ☃ += 6.283185307179586D * ☃ / this.i;
        if (☃ == this.i)
        {
          ☃ += 2 + ☃.nextInt(5);
          this.i += 1 + ☃.nextInt(2);
        }
      }
      this.f = true;
    }
    for (adg ☃ : this.g) {
      if ((☃ == ☃.a) && (☃ == ☃.b)) {
        return true;
      }
    }
    return false;
  }
  
  protected List<cj> z_()
  {
    List<cj> ☃ = Lists.newArrayList();
    for (adg ☃ : this.g) {
      if (☃ != null) {
        ☃.add(☃.a(64));
      }
    }
    return ☃;
  }
  
  protected aqu b(int ☃, int ☃)
  {
    aqo.a ☃ = new aqo.a(this.c, this.b, ☃, ☃);
    while ((☃.b().isEmpty()) || (((aqp.m)☃.b().get(0)).b == null)) {
      ☃ = new aqo.a(this.c, this.b, ☃, ☃);
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
      this.a.add(☃);
      ☃.a(☃, this.a, ☃);
      
      List<aqt> ☃ = ☃.c;
      while (!☃.isEmpty())
      {
        int ☃ = ☃.nextInt(☃.size());
        aqt ☃ = (aqt)☃.remove(☃);
        ☃.a(☃, this.a, ☃);
      }
      c();
      a(☃, ☃, 10);
    }
  }
}
