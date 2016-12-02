import java.util.Arrays;
import java.util.Set;
import org.apache.commons.lang3.ArrayUtils;

public class ayi
  extends awd
{
  private final ayj u;
  private final ave v;
  private final awd.a[] w;
  private int x = 0;
  
  public ayi(ayj ☃, ave ☃)
  {
    super(☃, l, m, 63, m - 32, 20);
    u = ☃;
    v = ☃;
    
    avb[] ☃ = (avb[])ArrayUtils.clone(t.aw);
    w = new awd.a[☃.length + avb.c().size()];
    
    Arrays.sort(☃);
    
    int ☃ = 0;
    String ☃ = null;
    for (avb ☃ : ☃)
    {
      String ☃ = ☃.e();
      if (!☃.equals(☃))
      {
        ☃ = ☃;
        w[(☃++)] = new ayi.a(☃);
      }
      int ☃ = k.a(bnq.a(☃.g(), new Object[0]));
      if (☃ > x) {
        x = ☃;
      }
      w[(☃++)] = new ayi.b(☃, null);
    }
  }
  
  protected int b()
  {
    return w.length;
  }
  
  public awd.a b(int ☃)
  {
    return w[☃];
  }
  
  public class a
    implements awd.a
  {
    private final String b;
    private final int c;
    
    public a(String ☃)
    {
      b = bnq.a(☃, new Object[0]);
      c = ak.a(b);
    }
    
    public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      ak.a(b, am.l / 2 - c / 2, ☃ + ☃ - ak.a - 1, 16777215);
    }
    
    public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      return false;
    }
    
    public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃) {}
    
    public void a(int ☃, int ☃, int ☃) {}
  }
  
  public class b
    implements awd.a
  {
    private final avb b;
    private final String c;
    private final avs d;
    private final avs e;
    
    private b(avb ☃)
    {
      b = ☃;
      c = bnq.a(☃.g(), new Object[0]);
      d = new avs(0, 0, 0, 75, 20, bnq.a(☃.g(), new Object[0]));
      e = new avs(0, 0, 0, 50, 20, bnq.a("controls.reset", new Object[0]));
    }
    
    public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      boolean ☃ = bf == b;
      ak.a(c, ☃ + 90 - ayi.c(ayi.this), ☃ + ☃ / 2 - ak.a / 2, 16777215);
      
      e.h = (☃ + 190);
      e.i = ☃;
      e.l = (b.i() != b.h());
      e.a(ayi.a(ayi.this), ☃, ☃);
      
      d.h = (☃ + 105);
      d.i = ☃;
      d.j = avh.c(b.i());
      
      boolean ☃ = false;
      if (b.i() != 0) {
        for (avb ☃ : at.aw) {
          if ((☃ != b) && (☃.i() == b.i()))
          {
            ☃ = true;
            break;
          }
        }
      }
      if (☃) {
        d.j = (a.p + "> " + a.o + d.j + a.p + " <");
      } else if (☃) {
        d.j = (a.m + d.j);
      }
      d.a(ayi.a(ayi.this), ☃, ☃);
    }
    
    public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      if (d.c(ayi.a(ayi.this), ☃, ☃))
      {
        bf = b;
        return true;
      }
      if (e.c(ayi.a(ayi.this), ☃, ☃))
      {
        at.a(b, b.h());
        avb.b();
        return true;
      }
      return false;
    }
    
    public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      d.a(☃, ☃);
      e.a(☃, ☃);
    }
    
    public void a(int ☃, int ☃, int ☃) {}
  }
  
  protected int d()
  {
    return super.d() + 15;
  }
  
  public int c()
  {
    return super.c() + 32;
  }
}
