import java.util.Random;

public class sl
  extends st
{
  ty a;
  pr b;
  
  public sl(ty ☃)
  {
    super(☃, false, true);
    a = ☃;
    a(1);
  }
  
  public boolean a()
  {
    tf ☃ = a.n();
    if (☃ == null) {
      return false;
    }
    b = ☃.b(a);
    if ((b instanceof vn)) {
      return false;
    }
    if (!a(b, false))
    {
      if (e.bc().nextInt(20) == 0)
      {
        b = ☃.c(a);
        return a(b, false);
      }
      return false;
    }
    return true;
  }
  
  public void c()
  {
    a.d(b);
    super.c();
  }
}
