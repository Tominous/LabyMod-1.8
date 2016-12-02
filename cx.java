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
    this.b = ((BiMap)this.c).inverse();
  }
  
  public void a(int ☃, K ☃, V ☃)
  {
    this.a.a(☃, ☃);
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
    return (K)this.b.get(☃);
  }
  
  public boolean d(K ☃)
  {
    return super.d(☃);
  }
  
  public int b(V ☃)
  {
    return this.a.b(☃);
  }
  
  public V a(int ☃)
  {
    return (V)this.a.a(☃);
  }
  
  public Iterator<V> iterator()
  {
    return this.a.iterator();
  }
}
