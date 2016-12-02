import java.util.Random;

public class rt
  extends rd
{
  private ty a;
  private wi b;
  private int c;
  
  public rt(ty ☃)
  {
    a = ☃;
    a(3);
  }
  
  public boolean a()
  {
    if (!a.o.w()) {
      return false;
    }
    if (a.bc().nextInt(8000) != 0) {
      return false;
    }
    b = ((wi)a.o.a(wi.class, a.aR().b(6.0D, 2.0D, 6.0D), a));
    return b != null;
  }
  
  public boolean b()
  {
    return c > 0;
  }
  
  public void c()
  {
    c = 400;
    a.a(true);
  }
  
  public void d()
  {
    a.a(false);
    b = null;
  }
  
  public void e()
  {
    a.p().a(b, 30.0F, 30.0F);
    c -= 1;
  }
}
