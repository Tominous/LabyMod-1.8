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
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
  }
  
  public alz a()
  {
    if ((this.d == null) && ((this.c) || (this.a.e(this.b)))) {
      this.d = this.a.p(this.b);
    }
    return this.d;
  }
  
  public akw b()
  {
    if ((this.e == null) && (!this.f))
    {
      this.e = this.a.s(this.b);
      this.f = true;
    }
    return this.e;
  }
  
  public cj d()
  {
    return this.b;
  }
  
  public static Predicate<amc> a(Predicate<alz> ☃)
  {
    new Predicate()
    {
      public boolean a(amc ☃)
      {
        return (☃ != null) && (this.a.apply(☃.a()));
      }
    };
  }
}
