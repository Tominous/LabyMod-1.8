public class aaz
  extends yo
{
  private final afh b;
  private String[] c;
  
  public aaz(afh ☃, boolean ☃)
  {
    super(☃);
    this.b = ☃;
    if (☃)
    {
      d(0);
      a(true);
    }
  }
  
  public int a(zx ☃, int ☃)
  {
    return this.b.h(this.b.a(☃.i()));
  }
  
  public int a(int ☃)
  {
    return ☃;
  }
  
  public aaz a(String[] ☃)
  {
    this.c = ☃;
    return this;
  }
  
  public String e_(zx ☃)
  {
    if (this.c == null) {
      return super.e_(☃);
    }
    int ☃ = ☃.i();
    if ((☃ >= 0) && (☃ < this.c.length)) {
      return super.e_(☃) + "." + this.c[☃];
    }
    return super.e_(☃);
  }
}
