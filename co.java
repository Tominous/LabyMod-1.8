import org.apache.commons.lang3.Validate;

public class co<K, V>
  extends cx<K, V>
{
  private final K d;
  private V e;
  
  public co(K ☃)
  {
    d = ☃;
  }
  
  public void a(int ☃, K ☃, V ☃)
  {
    if (d.equals(☃)) {
      e = ☃;
    }
    super.a(☃, ☃, ☃);
  }
  
  public void a()
  {
    Validate.notNull(d);
  }
  
  public V a(K ☃)
  {
    V ☃ = super.a(☃);
    return (V)(☃ == null ? e : ☃);
  }
  
  public V a(int ☃)
  {
    V ☃ = super.a(☃);
    return (V)(☃ == null ? e : ☃);
  }
}
