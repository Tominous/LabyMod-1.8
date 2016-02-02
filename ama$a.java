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
    this.a = ☃;
    this.b = ☃;
  }
  
  public Collection<amo> a()
  {
    return Collections.unmodifiableCollection(this.b.keySet());
  }
  
  public <T extends Comparable<T>> T b(amo<T> ☃)
  {
    if (!this.b.containsKey(☃)) {
      throw new IllegalArgumentException("Cannot get property " + ☃ + " as it does not exist in " + this.a.P());
    }
    return (Comparable)☃.b().cast(this.b.get(☃));
  }
  
  public <T extends Comparable<T>, V extends T> alz a(amo<T> ☃, V ☃)
  {
    if (!this.b.containsKey(☃)) {
      throw new IllegalArgumentException("Cannot set property " + ☃ + " as it does not exist in " + this.a.P());
    }
    if (!☃.c().contains(☃)) {
      throw new IllegalArgumentException("Cannot set property " + ☃ + " to " + ☃ + " on block " + afh.c.c(this.a) + ", it is not an allowed value");
    }
    if (this.b.get(☃) == ☃) {
      return this;
    }
    return (alz)this.c.get(☃, ☃);
  }
  
  public ImmutableMap<amo, Comparable> b()
  {
    return this.b;
  }
  
  public afh c()
  {
    return this.a;
  }
  
  public boolean equals(Object ☃)
  {
    return this == ☃;
  }
  
  public int hashCode()
  {
    return this.b.hashCode();
  }
  
  public void a(Map<Map<amo, Comparable>, a> ☃)
  {
    if (this.c != null) {
      throw new IllegalStateException();
    }
    Table<amo, Comparable, alz> ☃ = HashBasedTable.create();
    for (Iterator ☃ = this.b.keySet().iterator(); ☃.hasNext();)
    {
      ☃ = (amo)☃.next();
      for (Comparable ☃ : ☃.c()) {
        if (☃ != this.b.get(☃)) {
          ☃.put(☃, ☃, ☃.get(b(☃, ☃)));
        }
      }
    }
    amo<? extends Comparable> ☃;
    this.c = ImmutableTable.copyOf(☃);
  }
  
  private Map<amo, Comparable> b(amo ☃, Comparable ☃)
  {
    Map<amo, Comparable> ☃ = Maps.newHashMap(this.b);
    ☃.put(☃, ☃);
    return ☃;
  }
}
