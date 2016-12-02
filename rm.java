import java.util.Random;

public class rm
  extends rd
{
  private int d = -1;
  private int c = -1;
  private te b;
  private py a;
  
  public rm(py ☃)
  {
    a = ☃;
    a(1);
  }
  
  public boolean a()
  {
    cj ☃ = new cj(a);
    if (((a.o.w()) && ((!a.o.S()) || (a.o.b(☃).e()))) || (a.o.t.o())) {
      return false;
    }
    if (a.bc().nextInt(50) != 0) {
      return false;
    }
    if ((c != -1) && (a.e(c, a.t, d) < 4.0D)) {
      return false;
    }
    tf ☃ = a.o.ae().a(☃, 14);
    if (☃ == null) {
      return false;
    }
    b = ☃.c(☃);
    return b != null;
  }
  
  public boolean b()
  {
    return !a.s().m();
  }
  
  public void c()
  {
    c = -1;
    cj ☃ = b.e();
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    if (a.b(☃) > 256.0D)
    {
      aui ☃ = tc.a(a, 14, 3, new aui(☃ + 0.5D, ☃, ☃ + 0.5D));
      if (☃ != null) {
        a.s().a(a, b, c, 1.0D);
      }
    }
    else
    {
      a.s().a(☃ + 0.5D, ☃, ☃ + 0.5D, 1.0D);
    }
  }
  
  public void d()
  {
    c = b.e().n();
    d = b.e().p();
    b = null;
  }
}
