import io.netty.util.internal.ThreadLocalRandom;
import java.util.UUID;
import org.apache.commons.lang3.Validate;

public class qd
{
  private final double a;
  private final int b;
  private final String c;
  private final UUID d;
  private boolean e = true;
  
  public qd(String ☃, double ☃, int ☃)
  {
    this(ns.a(ThreadLocalRandom.current()), ☃, ☃, ☃);
  }
  
  public qd(UUID ☃, String ☃, double ☃, int ☃)
  {
    d = ☃;
    c = ☃;
    a = ☃;
    b = ☃;
    
    Validate.notEmpty(☃, "Modifier name cannot be empty", new Object[0]);
    Validate.inclusiveBetween(0L, 2L, ☃, "Invalid operation");
  }
  
  public UUID a()
  {
    return d;
  }
  
  public String b()
  {
    return c;
  }
  
  public int c()
  {
    return b;
  }
  
  public double d()
  {
    return a;
  }
  
  public boolean e()
  {
    return e;
  }
  
  public qd a(boolean ☃)
  {
    e = ☃;
    return this;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ == null) || (getClass() != ☃.getClass())) {
      return false;
    }
    qd ☃ = (qd)☃;
    if (d != null ? !d.equals(d) : d != null) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    return d != null ? d.hashCode() : 0;
  }
  
  public String toString()
  {
    return "AttributeModifier{amount=" + a + ", operation=" + b + ", name='" + c + '\'' + ", id=" + d + ", serialize=" + e + '}';
  }
}
