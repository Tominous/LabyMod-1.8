import java.util.List;
import java.util.Random;

public class sg
  extends rd
{
  private wi a;
  private ty b;
  private int c;
  private boolean d;
  
  public sg(wi ☃)
  {
    a = ☃;
    a(3);
  }
  
  public boolean a()
  {
    if (a.l() >= 0) {
      return false;
    }
    if (!a.o.w()) {
      return false;
    }
    List<ty> ☃ = a.o.a(ty.class, a.aR().b(6.0D, 2.0D, 6.0D));
    if (☃.isEmpty()) {
      return false;
    }
    for (ty ☃ : ☃) {
      if (☃.cm() > 0)
      {
        b = ☃;
        break;
      }
    }
    return b != null;
  }
  
  public boolean b()
  {
    return b.cm() > 0;
  }
  
  public void c()
  {
    c = a.bc().nextInt(320);
    d = false;
    b.s().n();
  }
  
  public void d()
  {
    b = null;
    a.s().n();
  }
  
  public void e()
  {
    a.p().a(b, 30.0F, 30.0F);
    if (b.cm() == c)
    {
      a.s().a(b, 0.5D);
      d = true;
    }
    if ((d) && 
      (a.h(b) < 4.0D))
    {
      b.a(false);
      a.s().n();
    }
  }
}
