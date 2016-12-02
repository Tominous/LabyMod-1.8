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
    b = 2;
    a = V.nextLong();
    c = (V.nextInt(3) + 1);
    
    cj ☃ = new cj(this);
    if ((!D) && (☃.Q().b("doFireTick")) && ((☃.aa() == oj.c) || (☃.aa() == oj.d)) && (☃.a(☃, 10)))
    {
      if ((☃.p(☃).c().t() == arm.a) && (afi.ab.d(☃, ☃))) {
        ☃.a(☃, afi.ab.Q());
      }
      for (int ☃ = 0; ☃ < 4; ☃++)
      {
        cj ☃ = ☃.a(V.nextInt(3) - 1, V.nextInt(3) - 1, V.nextInt(3) - 1);
        if ((☃.p(☃).c().t() == arm.a) && (afi.ab.d(☃, ☃))) {
          ☃.a(☃, afi.ab.Q());
        }
      }
    }
  }
  
  public void t_()
  {
    super.t_();
    if (b == 2)
    {
      o.a(s, t, u, "ambient.weather.thunder", 10000.0F, 0.8F + V.nextFloat() * 0.2F);
      o.a(s, t, u, "random.explode", 2.0F, 0.5F + V.nextFloat() * 0.2F);
    }
    b -= 1;
    if (b < 0) {
      if (c == 0)
      {
        J();
      }
      else if (b < -V.nextInt(10))
      {
        c -= 1;
        b = 1;
        a = V.nextLong();
        cj ☃ = new cj(this);
        if ((!o.D) && (o.Q().b("doFireTick")) && (o.a(☃, 10)) && 
          (o.p(☃).c().t() == arm.a) && (afi.ab.d(o, ☃))) {
          o.a(☃, afi.ab.Q());
        }
      }
    }
    if (b >= 0) {
      if (o.D)
      {
        o.d(2);
      }
      else
      {
        double ☃ = 3.0D;
        List<pk> ☃ = o.b(this, new aug(s - ☃, t - ☃, u - ☃, s + ☃, t + 6.0D + ☃, u + ☃));
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
