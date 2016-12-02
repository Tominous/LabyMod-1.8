import java.util.Random;

public class qu
  extends qx
{
  private int g;
  private int h = -1;
  
  public qu(ps ☃)
  {
    super(☃);
  }
  
  public boolean a()
  {
    if (!super.a()) {
      return false;
    }
    if (!a.o.Q().b("mobGriefing")) {
      return false;
    }
    return !agh.f(a.o, b);
  }
  
  public void c()
  {
    super.c();
    g = 0;
  }
  
  public boolean b()
  {
    double ☃ = a.b(b);
    return (g <= 240) && (!agh.f(a.o, b)) && (☃ < 4.0D);
  }
  
  public void d()
  {
    super.d();
    a.o.c(a.F(), b, -1);
  }
  
  public void e()
  {
    super.e();
    if (a.bc().nextInt(20) == 0) {
      a.o.b(1010, b, 0);
    }
    g += 1;
    
    int ☃ = (int)(g / 240.0F * 10.0F);
    if (☃ != h)
    {
      a.o.c(a.F(), b, ☃);
      h = ☃;
    }
    if ((g == 240) && 
      (a.o.aa() == oj.d))
    {
      a.o.g(b);
      a.o.b(1012, b, 0);
      a.o.b(2001, b, afh.a(c));
    }
  }
}
