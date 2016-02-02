import com.google.common.base.Function;

public class aae
  extends yo
{
  protected final afh b;
  protected final Function<zx, String> c;
  
  public aae(afh ☃, afh ☃, Function<zx, String> ☃)
  {
    super(☃);
    
    this.b = ☃;
    this.c = ☃;
    
    d(0);
    a(true);
  }
  
  public aae(afh ☃, afh ☃, String[] ☃)
  {
    this(☃, ☃, new Function()
    {
      public String a(zx ☃)
      {
        int ☃ = ☃.i();
        if ((☃ < 0) || (☃ >= aae.this.length)) {
          ☃ = 0;
        }
        return aae.this[☃];
      }
    });
  }
  
  public int a(int ☃)
  {
    return ☃;
  }
  
  public String e_(zx ☃)
  {
    return super.a() + "." + (String)this.c.apply(☃);
  }
}
