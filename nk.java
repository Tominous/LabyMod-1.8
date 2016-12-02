import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class nk<V>
  implements Map<String, V>
{
  private final Map<String, V> a = Maps.newLinkedHashMap();
  
  public int size()
  {
    return a.size();
  }
  
  public boolean isEmpty()
  {
    return a.isEmpty();
  }
  
  public boolean containsKey(Object ☃)
  {
    return a.containsKey(☃.toString().toLowerCase());
  }
  
  public boolean containsValue(Object ☃)
  {
    return a.containsKey(☃);
  }
  
  public V get(Object ☃)
  {
    return (V)a.get(☃.toString().toLowerCase());
  }
  
  public V a(String ☃, V ☃)
  {
    return (V)a.put(☃.toLowerCase(), ☃);
  }
  
  public V remove(Object ☃)
  {
    return (V)a.remove(☃.toString().toLowerCase());
  }
  
  public void putAll(Map<? extends String, ? extends V> ☃)
  {
    for (Map.Entry<? extends String, ? extends V> ☃ : ☃.entrySet()) {
      a((String)☃.getKey(), ☃.getValue());
    }
  }
  
  public void clear()
  {
    a.clear();
  }
  
  public Set<String> keySet()
  {
    return a.keySet();
  }
  
  public Collection<V> values()
  {
    return a.values();
  }
  
  public Set<Map.Entry<String, V>> entrySet()
  {
    return a.entrySet();
  }
}
