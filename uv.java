import java.util.List;
import java.util.Random;

public class uv
  extends uu
{
  private int b;
  public long a;
  private int c;
  
  public uv(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    b(☃, ☃, ☃, 0.0F, 0.0F);
    this.b = 2;
    this.a = this.V.nextLong();
    this.c = (this.V.nextInt(3) + 1);
    
    cj ☃ = new cj(this);
    if ((!☃.D) && (☃.Q().b("doFireTick")) && ((☃.aa() == oj.c) || (☃.aa() == oj.d)) && (☃.a(☃, 10)))
    {
      if ((☃.p(☃).c().t() == arm.a) && (afi.ab.d(☃, ☃))) {
        ☃.a(☃, afi.ab.Q());
      }
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        cj ☃ = ☃.a(this.V.nextInt(3) - 1, this.V.nextInt(3) - 1, this.V.nextInt(3) - 1);
        if ((☃.p(☃).c().t() == arm.a) && (afi.ab.d(☃, ☃))) {
          ☃.a(☃, afi.ab.Q());
        }
      }
    }
  }
  
  public void t_()
  {
    super.t_();
    if (this.b == 2)
    {
      this.o.a(this.s, this.t, this.u, "ambient.weather.thunder", 10000.0F, 0.8F + this.V.nextFloat() * 0.2F);
      this.o.a(this.s, this.t, this.u, "random.explode", 2.0F, 0.5F + this.V.nextFloat() * 0.2F);
    }
    this.b -= 1;
    if (this.b < 0) {
      if (this.c == 0)
      {
        J();
      }
      else if (this.b < -this.V.nextInt(10))
      {
        this.c -= 1;
        this.b = 1;
        this.a = this.V.nextLong();
        cj ☃ = new cj(this);
        if ((!this.o.D) && (this.o.Q().b("doFireTick")) && (this.o.a(☃, 10)) && 
          (this.o.p(☃).c().t() == arm.a) && (afi.ab.d(this.o, ☃))) {
          this.o.a(☃, afi.ab.Q());
        }
      }
    }
    if (this.b >= 0) {
      if (this.o.D)
      {
        this.o.d(2);
      }
      else
      {
        double ☃ = 3.0D;
        List<pk> ☃ = this.o.b(this, new aug(this.s - ☃, this.t - ☃, this.u - ☃, this.s + ☃, this.t + 6.0D + ☃, this.u + ☃));
        for (int ☃ = 0; ☃ < ☃.size(); ☃++)
        {
          pk ☃ = (pk)☃.get(☃);
          ☃.a(this);
        }
      }
    }
  }
  
  protected void h() {}
  
  protected void a(dn ☃) {}
  
  protected void b(dn ☃) {}
}
