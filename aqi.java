import com.google.common.collect.Lists;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class aqi
  extends aqq
{
  private List<ady.c> d = Lists.newArrayList();
  
  public aqi()
  {
    d.add(new ady.c(vl.class, 10, 2, 3));
    d.add(new ady.c(vw.class, 5, 4, 4));
    d.add(new ady.c(wa.class, 10, 4, 4));
    d.add(new ady.c(vu.class, 3, 4, 4));
  }
  
  public String a()
  {
    return "Fortress";
  }
  
  public List<ady.c> b()
  {
    return d;
  }
  
  protected boolean a(int ☃, int ☃)
  {
    int ☃ = ☃ >> 4;
    int ☃ = ☃ >> 4;
    
    b.setSeed(☃ ^ ☃ << 4 ^ c.J());
    b.nextInt();
    if (b.nextInt(3) != 0) {
      return false;
    }
    if (☃ != (☃ << 4) + 4 + b.nextInt(8)) {
      return false;
    }
    if (☃ != (☃ << 4) + 4 + b.nextInt(8)) {
      return false;
    }
    return true;
  }
  
  protected aqu b(int ☃, int ☃)
  {
    return new aqi.a(c, b, ☃, ☃);
  }
  
  public static class a
    extends aqu
  {
    public a() {}
    
    public a(adm ☃, Random ☃, int ☃, int ☃)
    {
      super(☃);
      
      aqj.q ☃ = new aqj.q(☃, (☃ << 4) + 2, (☃ << 4) + 2);
      a.add(☃);
      ☃.a(☃, a, ☃);
      
      List<aqt> ☃ = e;
      while (!☃.isEmpty())
      {
        int ☃ = ☃.nextInt(☃.size());
        aqt ☃ = (aqt)☃.remove(☃);
        ☃.a(☃, a, ☃);
      }
      c();
      a(☃, ☃, 48, 70);
    }
  }
}
