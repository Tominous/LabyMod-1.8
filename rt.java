import java.util.Random;

public class rt
  extends rd
{
  private ty a;
  private wi b;
  private int c;
  
  public rt(ty ☃)
  {
    this.a = ☃;
    a(3);
  }
  
  public boolean a()
  {
    if (!this.a.o.w()) {
      return false;
    }
    if (this.a.bc().nextInt(8000) != 0) {
      return false;
    }
    this.b = ((wi)this.a.o.a(wi.class, this.a.aR().b(6.0D, 2.0D, 6.0D), this.a));
    return this.b != null;
  }
  
  public boolean b()
  {
    return this.c > 0;
  }
  
  public void c()
  {
    this.c = 400;
    this.a.a(true);
  }
  
  public void d()
  {
    this.a.a(false);
    this.b = null;
  }
  
  public void e()
  {
    this.a.p().a(this.b, 30.0F, 30.0F);
    this.c -= 1;
  }
}
