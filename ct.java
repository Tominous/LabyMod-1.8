import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class ct
  implements cs
{
  private final IdentityHashMap a = new IdentityHashMap(512);
  private final List b = Lists.newArrayList();
  private static final String __OBFID = "CL_00001203";
  
  public void a(Object key, int value)
  {
    a.put(key, Integer.valueOf(value));
    while (b.size() <= value) {
      b.add((Object)null);
    }
    b.set(value, key);
  }
  
  public int b(Object key)
  {
    Integer var2 = (Integer)a.get(key);
    return var2 == null ? -1 : var2.intValue();
  }
  
  public final Object a(int value)
  {
    return (value >= 0) && (value < b.size()) ? b.get(value) : null;
  }
  
  public Iterator iterator()
  {
    return Iterators.filter(b.iterator(), Predicates.notNull());
  }
  
  public List getObjectList()
  {
    return b;
  }
}
