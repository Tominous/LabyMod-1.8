import java.util.Random;

public class zs
  extends zw
{
  public final int a = 32;
  private final int b;
  private final float c;
  private final boolean d;
  private boolean k;
  private int l;
  private int m;
  private int n;
  private float o;
  
  public zs(int ☃, float ☃, boolean ☃)
  {
    b = ☃;
    d = ☃;
    c = ☃;
    a(yz.h);
  }
  
  public zs(int ☃, boolean ☃)
  {
    this(☃, 0.6F, ☃);
  }
  
  public zx b(zx ☃, adm ☃, wn ☃)
  {
    b -= 1;
    ☃.cl().a(this, ☃);
    ☃.a(☃, "random.burp", 0.5F, s.nextFloat() * 0.1F + 0.9F);
    
    c(☃, ☃, ☃);
    ☃.b(na.ad[zw.b(this)]);
    
    return ☃;
  }
  
  protected void c(zx ☃, adm ☃, wn ☃)
  {
    if ((!D) && (l > 0) && (s.nextFloat() < o)) {
      ☃.c(new pf(l, m * 20, n));
    }
  }
  
  public int d(zx ☃)
  {
    return 32;
  }
  
  public aba e(zx ☃)
  {
    return aba.b;
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    if (☃.j(k)) {
      ☃.a(☃, d(☃));
    }
    return ☃;
  }
  
  public int h(zx ☃)
  {
    return b;
  }
  
  public float i(zx ☃)
  {
    return c;
  }
  
  public boolean g()
  {
    return d;
  }
  
  public zs a(int ☃, int ☃, int ☃, float ☃)
  {
    l = ☃;
    m = ☃;
    n = ☃;
    o = ☃;
    return this;
  }
  
  public zs h()
  {
    k = true;
    return this;
  }
}
