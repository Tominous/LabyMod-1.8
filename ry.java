import java.util.Random;

public class ry
  extends rd
{
  private ps a;
  private double b;
  private double c;
  private int d;
  
  public ry(ps ☃)
  {
    this.a = ☃;
    a(3);
  }
  
  public boolean a()
  {
    return this.a.bc().nextFloat() < 0.02F;
  }
  
  public boolean b()
  {
    return this.d >= 0;
  }
  
  public void c()
  {
    double ☃ = 6.283185307179586D * this.a.bc().nextDouble();
    this.b = Math.cos(☃);
    this.c = Math.sin(☃);
    this.d = (20 + this.a.bc().nextInt(20));
  }
  
  public void e()
  {
    this.d -= 1;
    this.a.p().a(this.a.s + this.b, this.a.t + this.a.aS(), this.a.u + this.c, 10.0F, this.a.bQ());
  }
}
