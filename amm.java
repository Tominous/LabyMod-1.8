import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;

public class amm<T extends Enum<T>,  extends nw>
  extends amj<T>
{
  private final ImmutableSet<T> a;
  private final Map<String, T> b = Maps.newHashMap();
  
  protected amm(String ☃, Class<T> ☃, Collection<T> ☃)
  {
    super(☃, ☃);
    a = ImmutableSet.copyOf(☃);
    for (T ☃ : ☃)
    {
      String ☃ = ((nw)☃).l();
      if (b.containsKey(☃)) {
        throw new IllegalArgumentException("Multiple values have the same name '" + ☃ + "'");
      }
      b.put(☃, ☃);
    }
  }
  
  public Collection<T> c()
  {
    return a;
  }
  
  public String a(T ☃)
  {
    return ((nw)☃).l();
  }
  
  public static <T extends Enum<T>,  extends nw> amm<T> a(String ☃, Class<T> ☃)
  {
    return a(☃, ☃, Predicates.alwaysTrue());
  }
  
  public static <T extends Enum<T>,  extends nw> amm<T> a(String ☃, Class<T> ☃, Predicate<T> ☃)
  {
    return a(☃, ☃, Collections2.filter(Lists.newArrayList(☃.getEnumConstants()), ☃));
  }
  
  public static <T extends Enum<T>,  extends nw> amm<T> a(String ☃, Class<T> ☃, T... ☃)
  {
    return a(☃, ☃, Lists.newArrayList(☃));
  }
  
  public static <T extends Enum<T>,  extends nw> amm<T> a(String ☃, Class<T> ☃, Collection<T> ☃)
  {
    return new amm(☃, ☃, ☃);
  }
}
