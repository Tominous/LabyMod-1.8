import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

class ama$a
  extends aly
{
  private final afh a;
  private final ImmutableMap<amo, Comparable> b;
  private ImmutableTable<amo, Comparable, alz> c;
  
  private ama$a(afh ☃, ImmutableMap<amo, Comparable> ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public Collection<amo> a()
  {
    return Collections.unmodifiableCollection(b.keySet());
  }
  
  public <T extends Comparable<T>> T b(amo<T> ☃)
  {
    if (!b.containsKey(☃)) {
      throw new IllegalArgumentException("Cannot get property " + ☃ + " as it does not exist in " + a.P());
    }
    return (Comparable)☃.b().cast(b.get(☃));
  }
  
  public <T extends Comparable<T>, V extends T> alz a(amo<T> ☃, V ☃)
  {
    if (!b.containsKey(☃)) {
      throw new IllegalArgumentException("Cannot set property " + ☃ + " as it does not exist in " + a.P());
    }
    if (!☃.c().contains(☃)) {
      throw new IllegalArgumentException("Cannot set property " + ☃ + " to " + ☃ + " on block " + afh.c.c(a) + ", it is not an allowed value");
    }
    if (b.get(☃) == ☃) {
      return this;
    }
    return (alz)c.get(☃, ☃);
  }
  
  public ImmutableMap<amo, Comparable> b()
  {
    return b;
  }
  
  public afh c()
  {
    return a;
  }
  
  public boolean equals(Object ☃)
  {
    return this == ☃;
  }
  
  public int hashCode()
  {
    return b.hashCode();
  }
  
  public void a(Map<Map<amo, Comparable>, a> ☃)
  {
    if (c != null) {
      throw new IllegalStateException();
    }
    Table<amo, Comparable, alz> ☃ = HashBasedTable.create();
    for (Iterator ☃ = b.keySet().iterator(); ☃.hasNext();)
    {
      ☃ = (amo)☃.next();
      for (Comparable ☃ : ☃.c()) {
        if (☃ != b.get(☃)) {
          ☃.put(☃, ☃, ☃.get(b(☃, ☃)));
        }
      }
    }
    amo<? extends Comparable> ☃;
    c = ImmutableTable.copyOf(☃);
  }
  
  private Map<amo, Comparable> b(amo ☃, Comparable ☃)
  {
    Map<amo, Comparable> ☃ = Maps.newHashMap(b);
    ☃.put(☃, ☃);
    return ☃;
  }
}
