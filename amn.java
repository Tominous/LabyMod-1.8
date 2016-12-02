import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class amn
  extends amj<Integer>
{
  private final ImmutableSet<Integer> a;
  
  protected amn(String ☃, int ☃, int ☃)
  {
    super(☃, Integer.class);
    if (☃ < 0) {
      throw new IllegalArgumentException("Min value of " + ☃ + " must be 0 or greater");
    }
    if (☃ <= ☃) {
      throw new IllegalArgumentException("Max value of " + ☃ + " must be greater than min (" + ☃ + ")");
    }
    Set<Integer> ☃ = Sets.newHashSet();
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      ☃.add(Integer.valueOf(☃));
    }
    a = ImmutableSet.copyOf(☃);
  }
  
  public Collection<Integer> c()
  {
    return a;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ == null) || (getClass() != ☃.getClass())) {
      return false;
    }
    if (!super.equals(☃)) {
      return false;
    }
    amn ☃ = (amn)☃;
    return a.equals(a);
  }
  
  public int hashCode()
  {
    int ☃ = super.hashCode();
    ☃ = 31 * ☃ + a.hashCode();
    return ☃;
  }
  
  public static amn a(String ☃, int ☃, int ☃)
  {
    return new amn(☃, ☃, ☃);
  }
  
  public String a(Integer ☃)
  {
    return ☃.toString();
  }
}
