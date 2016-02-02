import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

public class amh
  implements Predicate<alz>
{
  private final ama a;
  private final Map<amo, Predicate> b = Maps.newHashMap();
  
  private amh(ama ☃)
  {
    this.a = ☃;
  }
  
  public static amh a(afh ☃)
  {
    return new amh(☃.P());
  }
  
  public boolean a(alz ☃)
  {
    if ((☃ == null) || (!☃.c().equals(this.a.c()))) {
      return false;
    }
    for (Map.Entry<amo, Predicate> ☃ : this.b.entrySet())
    {
      Object ☃ = ☃.b((amo)☃.getKey());
      if (!((Predicate)☃.getValue()).apply(☃)) {
        return false;
      }
    }
    return true;
  }
  
  public <V extends Comparable<V>> amh a(amo<V> ☃, Predicate<? extends V> ☃)
  {
    if (!this.a.d().contains(☃)) {
      throw new IllegalArgumentException(this.a + " cannot support property " + ☃);
    }
    this.b.put(☃, ☃);
    return this;
  }
}
