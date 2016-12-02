import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;

public abstract class amj<T extends Comparable<T>>
  implements amo<T>
{
  private final Class<T> a;
  private final String b;
  
  protected amj(String ☃, Class<T> ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public String a()
  {
    return b;
  }
  
  public Class<T> b()
  {
    return a;
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("name", b).add("clazz", a).add("values", c()).toString();
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ == null) || (getClass() != ☃.getClass())) {
      return false;
    }
    amj ☃ = (amj)☃;
    return (a.equals(a)) && (b.equals(b));
  }
  
  public int hashCode()
  {
    return 31 * a.hashCode() + b.hashCode();
  }
}
