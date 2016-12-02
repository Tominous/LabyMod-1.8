import java.util.Random;

class wb$e
  extends rd
{
  private wb a;
  private float b;
  private int c;
  
  public wb$e(wb ☃)
  {
    a = ☃;
    a(2);
  }
  
  public boolean a()
  {
    return (a.u() == null) && ((a.C) || (a.V()) || (a.ab()));
  }
  
  public void e()
  {
    if (--c <= 0)
    {
      c = (40 + a.bc().nextInt(60));
      b = a.bc().nextInt(360);
    }
    ((wb.d)a.q()).a(b, false);
  }
}
