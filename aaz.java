public class aaz
  extends yo
{
  private final afh b;
  private String[] c;
  
  public aaz(afh ☃, boolean ☃)
  {
    super(☃);
    b = ☃;
    if (☃)
    {
      d(0);
      a(true);
    }
  }
  
  public int a(zx ☃, int ☃)
  {
    return b.h(b.a(☃.i()));
  }
  
  public int a(int ☃)
  {
    return ☃;
  }
  
  public aaz a(String[] ☃)
  {
    c = ☃;
    return this;
  }
  
  public String e_(zx ☃)
  {
    if (c == null) {
      return super.e_(☃);
    }
    int ☃ = ☃.i();
    if ((☃ >= 0) && (☃ < c.length)) {
      return super.e_(☃) + "." + c[☃];
    }
    return super.e_(☃);
  }
}
