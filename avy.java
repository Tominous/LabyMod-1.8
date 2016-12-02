import com.google.common.collect.Lists;
import java.util.List;

public class avy
  extends avp
{
  protected int a = 200;
  protected int f = 20;
  public int g;
  public int h;
  private List<String> k;
  public int i;
  private boolean l;
  public boolean j = true;
  private boolean m;
  private int n;
  private int o;
  private int p;
  private int q;
  private avn r;
  private int s;
  
  public avy(avn ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    r = ☃;
    i = ☃;
    g = ☃;
    h = ☃;
    a = ☃;
    f = ☃;
    k = Lists.newArrayList();
    l = false;
    m = false;
    n = ☃;
    o = -1;
    p = -1;
    q = -1;
    s = 0;
  }
  
  public void a(String ☃)
  {
    k.add(bnq.a(☃, new Object[0]));
  }
  
  public avy a()
  {
    l = true;
    return this;
  }
  
  public void a(ave ☃, int ☃, int ☃)
  {
    if (!j) {
      return;
    }
    bfl.l();
    bfl.a(770, 771, 1, 0);
    
    b(☃, ☃, ☃);
    int ☃ = h + f / 2 + s / 2;
    int ☃ = ☃ - k.size() * 10 / 2;
    for (int ☃ = 0; ☃ < k.size(); ☃++) {
      if (l) {
        a(r, (String)k.get(☃), g + a / 2, ☃ + ☃ * 10, n);
      } else {
        c(r, (String)k.get(☃), g, ☃ + ☃ * 10, n);
      }
    }
  }
  
  protected void b(ave ☃, int ☃, int ☃)
  {
    if (m)
    {
      int ☃ = a + s * 2;
      int ☃ = f + s * 2;
      int ☃ = g - s;
      int ☃ = h - s;
      a(☃, ☃, ☃ + ☃, ☃ + ☃, o);
      a(☃, ☃ + ☃, ☃, p);
      a(☃, ☃ + ☃, ☃ + ☃, q);
      b(☃, ☃, ☃ + ☃, p);
      b(☃ + ☃, ☃, ☃ + ☃, q);
    }
  }
}
