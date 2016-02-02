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
    this.b = ☃;
    this.d = ☃;
    this.c = ☃;
    a(yz.h);
  }
  
  public zs(int ☃, boolean ☃)
  {
    this(☃, 0.6F, ☃);
  }
  
  public zx b(zx ☃, adm ☃, wn ☃)
  {
    ☃.b -= 1;
    ☃.cl().a(this, ☃);
    ☃.a(☃, "random.burp", 0.5F, ☃.s.nextFloat() * 0.1F + 0.9F);
    
    c(☃, ☃, ☃);
    ☃.b(na.ad[zw.b(this)]);
    
    return ☃;
  }
  
  protected void c(zx ☃, adm ☃, wn ☃)
  {
    if ((!☃.D) && (this.l > 0) && (☃.s.nextFloat() < this.o)) {
      ☃.c(new pf(this.l, this.m * 20, this.n));
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
    if (☃.j(this.k)) {
      ☃.a(☃, d(☃));
    }
    return ☃;
  }
  
  public int h(zx ☃)
  {
    return this.b;
  }
  
  public float i(zx ☃)
  {
    return this.c;
  }
  
  public boolean g()
  {
    return this.d;
  }
  
  public zs a(int ☃, int ☃, int ☃, float ☃)
  {
    this.l = ☃;
    this.m = ☃;
    this.n = ☃;
    this.o = ☃;
    return this;
  }
  
  public zs h()
  {
    this.k = true;
    return this;
  }
}
