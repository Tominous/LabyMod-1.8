import java.util.Random;

public class uf
  extends pk
{
  public int a;
  public int b;
  
  public uf(adm ☃)
  {
    super(☃);
    this.k = true;
    a(2.0F, 2.0F);
    this.b = 5;
    
    this.a = this.V.nextInt(100000);
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
    this.ac.a(8, Integer.valueOf(this.b));
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    this.a += 1;
    
    this.ac.b(8, Integer.valueOf(this.b));
    
    int ☃ = ns.c(this.s);
    int ☃ = ns.c(this.t);
    int ☃ = ns.c(this.u);
    if (((this.o.t instanceof anp)) && (this.o.p(new cj(☃, ☃, ☃)).c() != afi.ab)) {
      this.o.a(new cj(☃, ☃, ☃), afi.ab.Q());
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
    if ((!this.I) && (!this.o.D))
    {
      this.b = 0;
      if (this.b <= 0)
      {
        J();
        if (!this.o.D) {
          this.o.a(null, this.s, this.t, this.u, 6.0F, true);
        }
      }
    }
    return true;
  }
}
