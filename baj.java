import com.google.common.base.Objects;
import java.util.List;

public class baj
{
  private final bag a;
  private final List<bah> b;
  private final int c;
  
  public baj(bag ☃, List<bah> ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
  }
  
  public bah a(int ☃)
  {
    if ((☃ < 0) || (☃ >= this.b.size())) {
      return baf.a;
    }
    return (bah)Objects.firstNonNull(this.b.get(☃), baf.a);
  }
  
  public int b()
  {
    return this.c;
  }
}
