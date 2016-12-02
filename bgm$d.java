import java.util.List;

public class bgm$d
{
  private final String a;
  private final List<bgm.c> b;
  
  public bgm$d(String ☃, List<bgm.c> ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public List<bgm.c> b()
  {
    return b;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if (!(☃ instanceof d)) {
      return false;
    }
    d ☃ = (d)☃;
    if (!a.equals(a)) {
      return false;
    }
    if (!b.equals(b)) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    int ☃ = a.hashCode();
    ☃ = 31 * ☃ + b.hashCode();
    return ☃;
  }
}
