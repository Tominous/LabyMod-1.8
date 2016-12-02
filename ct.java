import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class ct<T>
  implements cs<T>
{
  private final IdentityHashMap<T, Integer> a = new IdentityHashMap(512);
  private final List<T> b = Lists.newArrayList();
  
  public void a(T ☃, int ☃)
  {
    this.a.put(☃, Integer.valueOf(☃));
    while (this.b.size() <= ☃) {
      this.b.add(null);
    }
    this.b.set(☃, ☃);
  }
  
  public int b(T ☃)
  {
    Integer ☃ = (Integer)this.a.get(☃);
    return ☃ == null ? -1 : ☃.intValue();
  }
  
  public final T a(int ☃)
  {
    if ((☃ >= 0) && (☃ < this.b.size())) {
      return (T)this.b.get(☃);
    }
    return null;
  }
  
  public Iterator<T> iterator()
  {
    return Iterators.filter(this.b.iterator(), Predicates.notNull());
  }
}
