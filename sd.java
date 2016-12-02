import java.util.Random;

public class sd
  extends rd
{
  private tp a;
  private double b;
  private double c;
  private double d;
  private double e;
  
  public sd(tp ☃, double ☃)
  {
    a = ☃;
    b = ☃;
    a(1);
  }
  
  public boolean a()
  {
    if ((a.co()) || (a.l == null)) {
      return false;
    }
    aui ☃ = tc.a(a, 5, 4);
    if (☃ == null) {
      return false;
    }
    c = a;
    d = b;
    e = c;
    return true;
  }
  
  public void c()
  {
    a.s().a(c, d, e, b);
  }
  
  public boolean b()
  {
    return (!a.s().m()) && (a.l != null);
  }
  
  public void e()
  {
    if (a.bc().nextInt(50) == 0)
    {
      if ((a.l instanceof wn))
      {
        int ☃ = a.cC();
        int ☃ = a.cI();
        if ((☃ > 0) && (a.bc().nextInt(☃) < ☃))
        {
          a.h((wn)a.l);
          a.o.a(a, (byte)7);
          return;
        }
        a.u(5);
      }
      a.l.a(null);
      a.l = null;
      a.cW();
      a.o.a(a, (byte)6);
    }
  }
}
