import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;

public class cx<K, V>
  extends dd<K, V>
  implements cs<V>
{
  protected final ct<V> a = new ct();
  protected final Map<V, K> b;
  
  public cx()
  {
    b = ((BiMap)c).inverse();
  }
  
  public void a(int ☃, K ☃, V ☃)
  {
    a.a(☃, ☃);
    a(☃, ☃);
  }
  
  protected Map<K, V> b()
  {
    return HashBiMap.create();
  }
  
  public V a(K ☃)
  {
    return (V)super.a(☃);
  }
  
  public K c(V ☃)
  {
    return (K)b.get(☃);
  }
  
  public boolean d(K ☃)
  {
    return super.d(☃);
  }
  
  public int b(V ☃)
  {
    return a.b(☃);
  }
  
  public V a(int ☃)
  {
    return (V)a.a(☃);
  }
  
  public Iterator<V> iterator()
  {
    return a.iterator();
  }
}
