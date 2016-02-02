import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ama
{
  private static final Joiner a = Joiner.on(", ");
  private static final Function<amo, String> b = new Function()
  {
    public String a(amo ☃)
    {
      return ☃ == null ? "<NULL>" : ☃.a();
    }
  };
  private final afh c;
  private final ImmutableList<amo> d;
  private final ImmutableList<alz> e;
  
  public ama(afh ☃, amo... ☃)
  {
    this.c = ☃;
    
    Arrays.sort(☃, new Comparator()
    {
      public int a(amo ☃, amo ☃)
      {
        return ☃.a().compareTo(☃.a());
      }
    });
    this.d = ImmutableList.copyOf(☃);
    
    Map<Map<amo, Comparable>, ama.a> ☃ = Maps.newLinkedHashMap();
    List<ama.a> ☃ = Lists.newArrayList();
    
    Iterable<List<Comparable>> ☃ = cm.a(e());
    for (List<Comparable> ☃ : ☃)
    {
      Map<amo, Comparable> ☃ = cw.b(this.d, ☃);
      ama.a ☃ = new ama.a(☃, ImmutableMap.copyOf(☃), null);
      
      ☃.put(☃, ☃);
      ☃.add(☃);
    }
    for (ama.a ☃ : ☃) {
      ☃.a(☃);
    }
    this.e = ImmutableList.copyOf(☃);
  }
  
  public ImmutableList<alz> a()
  {
    return this.e;
  }
  
  private List<Iterable<Comparable>> e()
  {
    List<Iterable<Comparable>> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < this.d.size(); ☃++) {
      ☃.add(((amo)this.d.get(☃)).c());
    }
    return ☃;
  }
  
  public alz b()
  {
    return (alz)this.e.get(0);
  }
  
  public afh c()
  {
    return this.c;
  }
  
  public Collection<amo> d()
  {
    return this.d;
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("block", afh.c.c(this.c)).add("properties", Iterables.transform(this.d, b)).toString();
  }
  
  static class a
    extends aly
  {
    private final afh a;
    private final ImmutableMap<amo, Comparable> b;
    private ImmutableTable<amo, Comparable, alz> c;
    
    private a(afh ☃, ImmutableMap<amo, Comparable> ☃)
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
}
