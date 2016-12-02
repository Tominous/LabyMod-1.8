import java.util.Random;

public class uf
  extends pk
{
  public int a;
  public int b;
  
  public uf(adm ☃)
  {
    super(☃);
    k = true;
    a(2.0F, 2.0F);
    b = 5;
    
    a = V.nextInt(100000);
  }
  
  public uf(adm ☃, double ☃, double ☃, double ☃)
  {
    this(☃);
    b(☃, ☃, ☃);
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  protected void h()
  {
    ac.a(8, Integer.valueOf(b));
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    a += 1;
    
    ac.b(8, Integer.valueOf(b));
    
    int ☃ = ns.c(s);
    int ☃ = ns.c(t);
    int ☃ = ns.c(u);
    if (((o.t instanceof anp)) && (o.p(new cj(☃, ☃, ☃)).c() != afi.ab)) {
      o.a(new cj(☃, ☃, ☃), afi.ab.Q());
    }
  }
  
  protected void b(dn ☃) {}
  
  protected void a(dn ☃) {}
  
  public boolean ad()
  {
    return true;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if ((!I) && (!o.D))
    {
      b = 0;
      if (b <= 0)
      {
        J();
        if (!o.D) {
          o.a(null, s, t, u, 6.0F, true);
        }
      }
    }
    return true;
  }
}
