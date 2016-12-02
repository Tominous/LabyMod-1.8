import com.google.common.base.Predicate;

public class amc
{
  private final adm a;
  private final cj b;
  private final boolean c;
  private alz d;
  private akw e;
  private boolean f;
  
  public amc(adm ☃, cj ☃, boolean ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public alz a()
  {
    if ((d == null) && ((c) || (a.e(b)))) {
      d = a.p(b);
    }
    return d;
  }
  
  public akw b()
  {
    if ((e == null) && (!f))
    {
      e = a.s(b);
      f = true;
    }
    return e;
  }
  
  public cj d()
  {
    return b;
  }
  
  public static Predicate<amc> a(Predicate<alz> ☃)
  {
    new Predicate()
    {
      public boolean a(amc ☃)
      {
        return (☃ != null) && (a.apply(☃.a()));
      }
    };
  }
}
