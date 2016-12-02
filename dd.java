import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class dd<K, V>
  implements db<K, V>
{
  private static final Logger a = ;
  protected final Map<K, V> c = b();
  
  protected Map<K, V> b()
  {
    return Maps.newHashMap();
  }
  
  public V a(K ☃)
  {
    return (V)c.get(☃);
  }
  
  public void a(K ☃, V ☃)
  {
    Validate.notNull(☃);
    Validate.notNull(☃);
    if (c.containsKey(☃)) {
      a.debug("Adding duplicate key '" + ☃ + "' to registry");
    }
    c.put(☃, ☃);
  }
  
  public Set<K> c()
  {
    return Collections.unmodifiableSet(c.keySet());
  }
  
  public boolean d(K ☃)
  {
    return c.containsKey(☃);
  }
  
  public Iterator<V> iterator()
  {
    return c.values().iterator();
  }
}
