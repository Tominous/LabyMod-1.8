import java.util.Random;

public class qz
  extends rd
{
  private py a;
  private double b;
  private double c;
  private double d;
  private double e;
  private adm f;
  
  public qz(py ☃, double ☃)
  {
    a = ☃;
    e = ☃;
    f = o;
    a(1);
  }
  
  public boolean a()
  {
    if (!f.w()) {
      return false;
    }
    if (!a.at()) {
      return false;
    }
    if (!f.i(new cj(a.s, a.aR().b, a.u))) {
      return false;
    }
    aui ☃ = f();
    if (☃ == null) {
      return false;
    }
    b = a;
    c = b;
    d = c;
    return true;
  }
  
  public boolean b()
  {
    return !a.s().m();
  }
  
  public void c()
  {
    a.s().a(b, c, d, e);
  }
  
  private aui f()
  {
    Random ☃ = a.bc();
    cj ☃ = new cj(a.s, a.aR().b, a.u);
    for (int ☃ = 0; ☃ < 10; ☃++)
    {
      cj ☃ = ☃.a(☃.nextInt(20) - 10, ☃.nextInt(6) - 3, ☃.nextInt(20) - 10);
      if ((!f.i(☃)) && (a.a(☃) < 0.0F)) {
        return new aui(☃.n(), ☃.o(), ☃.p());
      }
    }
    return null;
  }
}
