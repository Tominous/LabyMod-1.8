import com.google.common.base.Objects;
import java.util.List;

public class baj
{
  private final bag a;
  private final List<bah> b;
  private final int c;
  
  public baj(bag ☃, List<bah> ☃, int ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public bah a(int ☃)
  {
    if ((☃ < 0) || (☃ >= b.size())) {
      return baf.a;
    }
    return (bah)Objects.firstNonNull(b.get(☃), baf.a);
  }
  
  public int b()
  {
    return c;
  }
}
