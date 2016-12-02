import com.google.common.base.Function;
import java.util.Map.Entry;

final class aly$1
  implements Function<Map.Entry<amo, Comparable>, String>
{
  public String a(Map.Entry<amo, Comparable> ☃)
  {
    if (☃ == null) {
      return "<NULL>";
    }
    amo ☃ = (amo)☃.getKey();
    return ☃.a() + "=" + ☃.a((Comparable)☃.getValue());
  }
}
