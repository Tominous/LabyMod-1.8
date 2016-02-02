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
        this.f = ns.a((String)☃.getValue(), this.f, 0);
      } else if (((String)☃.getKey()).equals("distance")) {
        this.g = ns.a((String)☃.getValue(), this.g, this.h + 1);
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
      ☃ -= this.g - 1;
    }
    if (☃ < 0) {
      ☃ -= this.g - 1;
    }
    int ☃ = ☃ / this.g;
    int ☃ = ☃ / this.g;
    Random ☃ = this.c.a(☃, ☃, 10387312);
    ☃ *= this.g;
    ☃ *= this.g;
    ☃ += ☃.nextInt(this.g - this.h);
    ☃ += ☃.nextInt(this.g - this.h);
    ☃ = ☃;
    ☃ = ☃;
    if ((☃ == ☃) && (☃ == ☃))
    {
      boolean ☃ = this.c.v().a(☃ * 16 + 8, ☃ * 16 + 8, 0, d);
      if (☃) {
        return true;
      }
    }
    return false;
  }
  
  protected aqu b(int ☃, int ☃)
  {
    return new aqv.a(this.c, this.b, ☃, ☃, this.f);
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
      this.a.add(☃);
      ☃.a(☃, this.a, ☃);
      
      List<aqt> ☃ = ☃.g;
      List<aqt> ☃ = ☃.f;
      while ((!☃.isEmpty()) || (!☃.isEmpty())) {
        if (☃.isEmpty())
        {
          int ☃ = ☃.nextInt(☃.size());
          aqt ☃ = (aqt)☃.remove(☃);
          ☃.a(☃, this.a, ☃);
        }
        else
        {
          int ☃ = ☃.nextInt(☃.size());
          aqt ☃ = (aqt)☃.remove(☃);
          ☃.a(☃, this.a, ☃);
        }
      }
      c();
      
      int ☃ = 0;
      for (aqt ☃ : this.a) {
        if (!(☃ instanceof aqw.o)) {
          ☃++;
        }
      }
      this.c = (☃ > 2);
    }
    
    public boolean d()
    {
      return this.c;
    }
    
    public void a(dn ☃)
    {
      super.a(☃);
      
      ☃.a("Valid", this.c);
    }
    
    public void b(dn ☃)
    {
      super.b(☃);
      this.c = ☃.n("Valid");
    }
  }
}
