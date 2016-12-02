import org.apache.commons.lang3.Validate;

public class co<K, V>
  extends cx<K, V>
{
  private final K d;
  private V e;
  
  public co(K ☃)
  {
    this.d = ☃;
  }
  
  public void a(int ☃, K ☃, V ☃)
  {
    if (this.d.equals(☃)) {
      this.e = ☃;
    }
    super.a(☃, ☃, ☃);
  }
  
  public void a()
  {
    Validate.notNull(this.d);
  }
  
  public V a(K ☃)
  {
    V ☃ = super.a(☃);
    return (V)(☃ == null ? this.e : ☃);
  }
  
  public V a(int ☃)
  {
    V ☃ = super.a(☃);
    return (V)(☃ == null ? this.e : ☃);
  }
}
