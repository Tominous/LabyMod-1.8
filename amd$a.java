import com.google.common.cache.CacheLoader;

class amd$a
  extends CacheLoader<cj, amc>
{
  private final adm a;
  private final boolean b;
  
  public amd$a(adm ☃, boolean ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public amc a(cj ☃)
    throws Exception
  {
    return new amc(this.a, ☃, this.b);
  }
}
