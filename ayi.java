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
    super(☃, ☃.l, ☃.m, 63, ☃.m - 32, 20);
    this.u = ☃;
    this.v = ☃;
    
    avb[] ☃ = (avb[])ArrayUtils.clone(☃.t.aw);
    this.w = new awd.a[☃.length + avb.c().size()];
    
    Arrays.sort(☃);
    
    int ☃ = 0;
    String ☃ = null;
    for (avb ☃ : ☃)
    {
      String ☃ = ☃.e();
      if (!☃.equals(☃))
      {
        ☃ = ☃;
        this.w[(☃++)] = new ayi.a(☃);
      }
      int ☃ = ☃.k.a(bnq.a(☃.g(), new Object[0]));
      if (☃ > this.x) {
        this.x = ☃;
      }
      this.w[(☃++)] = new ayi.b(☃, null);
    }
  }
  
  protected int b()
  {
    return this.w.length;
  }
  
  public awd.a b(int ☃)
  {
    return this.w[☃];
  }
  
  public class a
    implements awd.a
  {
    private final String b;
    private final int c;
    
    public a(String ☃)
    {
      this.b = bnq.a(☃, new Object[0]);
      this.c = ayi.a(ayi.this).k.a(this.b);
    }
    
    public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      ayi.a(ayi.this).k.a(this.b, ayi.a(ayi.this).m.l / 2 - this.c / 2, ☃ + ☃ - ayi.a(ayi.this).k.a - 1, 16777215);
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
      this.b = ☃;
      this.c = bnq.a(☃.g(), new Object[0]);
      this.d = new avs(0, 0, 0, 75, 20, bnq.a(☃.g(), new Object[0]));
      this.e = new avs(0, 0, 0, 50, 20, bnq.a("controls.reset", new Object[0]));
    }
    
    public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      boolean ☃ = ayi.b(ayi.this).f == this.b;
      ayi.a(ayi.this).k.a(this.c, ☃ + 90 - ayi.c(ayi.this), ☃ + ☃ / 2 - ayi.a(ayi.this).k.a / 2, 16777215);
      
      this.e.h = (☃ + 190);
      this.e.i = ☃;
      this.e.l = (this.b.i() != this.b.h());
      this.e.a(ayi.a(ayi.this), ☃, ☃);
      
      this.d.h = (☃ + 105);
      this.d.i = ☃;
      this.d.j = avh.c(this.b.i());
      
      boolean ☃ = false;
      if (this.b.i() != 0) {
        for (avb ☃ : ayi.a(ayi.this).t.aw) {
          if ((☃ != this.b) && (☃.i() == this.b.i()))
          {
            ☃ = true;
            break;
          }
        }
      }
      if (☃) {
        this.d.j = (a.p + "> " + a.o + this.d.j + a.p + " <");
      } else if (☃) {
        this.d.j = (a.m + this.d.j);
      }
      this.d.a(ayi.a(ayi.this), ☃, ☃);
    }
    
    public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      if (this.d.c(ayi.a(ayi.this), ☃, ☃))
      {
        ayi.b(ayi.this).f = this.b;
        return true;
      }
      if (this.e.c(ayi.a(ayi.this), ☃, ☃))
      {
        ayi.a(ayi.this).t.a(this.b, this.b.h());
        avb.b();
        return true;
      }
      return false;
    }
    
    public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      this.d.a(☃, ☃);
      this.e.a(☃, ☃);
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
