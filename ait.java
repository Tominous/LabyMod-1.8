import java.util.List;

public class ait
  extends afd
{
  public static final amk a = amk.a("powered");
  private final ait.a b;
  
  protected ait(arm ☃, ait.a ☃)
  {
    super(☃);
    j(M.b().a(a, Boolean.valueOf(false)));
    b = ☃;
  }
  
  protected int e(alz ☃)
  {
    return ((Boolean)☃.b(a)).booleanValue() ? 15 : 0;
  }
  
  protected alz a(alz ☃, int ☃)
  {
    return ☃.a(a, Boolean.valueOf(☃ > 0));
  }
  
  protected int f(adm ☃, cj ☃)
  {
    aug ☃ = a(☃);
    List<? extends pk> ☃;
    switch (ait.1.a[b.ordinal()])
    {
    case 1: 
      ☃ = ☃.b(null, ☃);
      break;
    case 2: 
      ☃ = ☃.a(pr.class, ☃);
      break;
    default: 
      return 0;
    }
    if (!☃.isEmpty()) {
      for (pk ☃ : ☃) {
        if (!☃.aI()) {
          return 15;
        }
      }
    }
    return 0;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Boolean.valueOf(☃ == 1));
  }
  
  public int c(alz ☃)
  {
    return ((Boolean)☃.b(a)).booleanValue() ? 1 : 0;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public static enum a
  {
    private a() {}
  }
}
