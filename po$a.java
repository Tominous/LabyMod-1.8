import com.google.common.base.Predicate;

public class po$a
  implements Predicate<pk>
{
  private final zx a;
  
  public po$a(zx ☃)
  {
    a = ☃;
  }
  
  public boolean a(pk ☃)
  {
    if (!☃.ai()) {
      return false;
    }
    if (!(☃ instanceof pr)) {
      return false;
    }
    pr ☃ = (pr)☃;
    if (☃.p(ps.c(a)) != null) {
      return false;
    }
    if ((☃ instanceof ps)) {
      return ((ps)☃).bY();
    }
    if ((☃ instanceof um)) {
      return true;
    }
    if ((☃ instanceof wn)) {
      return true;
    }
    return false;
  }
}
