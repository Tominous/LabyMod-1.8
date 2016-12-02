import java.util.List;

public class akp
  extends afd
{
  public static final amn a = amn.a("power", 0, 15);
  private final int b;
  
  protected akp(arm ☃, int ☃)
  {
    this(☃, ☃, ☃.r());
  }
  
  protected akp(arm ☃, int ☃, arn ☃)
  {
    super(☃, ☃);
    j(this.M.b().a(a, Integer.valueOf(0)));
    this.b = ☃;
  }
  
  protected int f(adm ☃, cj ☃)
  {
    int ☃ = Math.min(☃.a(pk.class, a(☃)).size(), this.b);
    if (☃ > 0)
    {
      float ☃ = Math.min(this.b, ☃) / this.b;
      return ns.f(☃ * 15.0F);
    }
    return 0;
  }
  
  protected int e(alz ☃)
  {
    return ((Integer)☃.b(a)).intValue();
  }
  
  protected alz a(alz ☃, int ☃)
  {
    return ☃.a(a, Integer.valueOf(☃));
  }
  
  public int a(adm ☃)
  {
    return 10;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Integer.valueOf(☃));
  }
  
  public int c(alz ☃)
  {
    return ((Integer)☃.b(a)).intValue();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
