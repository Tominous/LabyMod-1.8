import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class aly
  implements alz
{
  private static final Joiner a = Joiner.on(',');
  private static final Function<Map.Entry<amo, Comparable>, String> b = new Function()
  {
    public String a(Map.Entry<amo, Comparable> ☃)
    {
      if (☃ == null) {
        return "<NULL>";
      }
      amo ☃ = (amo)☃.getKey();
      return ☃.a() + "=" + ☃.a((Comparable)☃.getValue());
    }
  };
  
  public <T extends Comparable<T>> alz a(amo<T> ☃)
  {
    return a(☃, (Comparable)a(☃.c(), b(☃)));
  }
  
  protected static <T> T a(Collection<T> ☃, T ☃)
  {
    Iterator<T> ☃ = ☃.iterator();
    while (☃.hasNext()) {
      if (☃.next().equals(☃))
      {
        if (☃.hasNext()) {
          return (T)☃.next();
        }
        return (T)☃.iterator().next();
      }
    }
    return (T)☃.next();
  }
  
  public String toString()
  {
    StringBuilder ☃ = new StringBuilder();
    ☃.append(afh.c.c(c()));
    if (!b().isEmpty())
    {
      ☃.append("[");
      a.appendTo(☃, Iterables.transform(b().entrySet(), b));
      ☃.append("]");
    }
    return ☃.toString();
  }
}
