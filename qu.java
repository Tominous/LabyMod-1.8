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
    if (!this.a.o.Q().b("mobGriefing")) {
      return false;
    }
    return !agh.f(this.a.o, this.b);
  }
  
  public void c()
  {
    super.c();
    this.g = 0;
  }
  
  public boolean b()
  {
    double ☃ = this.a.b(this.b);
    return (this.g <= 240) && (!agh.f(this.a.o, this.b)) && (☃ < 4.0D);
  }
  
  public void d()
  {
    super.d();
    this.a.o.c(this.a.F(), this.b, -1);
  }
  
  public void e()
  {
    super.e();
    if (this.a.bc().nextInt(20) == 0) {
      this.a.o.b(1010, this.b, 0);
    }
    this.g += 1;
    
    int ☃ = (int)(this.g / 240.0F * 10.0F);
    if (☃ != this.h)
    {
      this.a.o.c(this.a.F(), this.b, ☃);
      this.h = ☃;
    }
    if ((this.g == 240) && 
      (this.a.o.aa() == oj.d))
    {
      this.a.o.g(this.b);
      this.a.o.b(1012, this.b, 0);
      this.a.o.b(2001, this.b, afh.a(this.c));
    }
  }
}
