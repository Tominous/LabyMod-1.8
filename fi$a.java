import java.util.EnumSet;
import java.util.Set;

public enum fi$a
{
  private int f;
  
  private fi$a(int ☃)
  {
    f = ☃;
  }
  
  private int a()
  {
    return 1 << f;
  }
  
  private boolean b(int ☃)
  {
    return (☃ & a()) == a();
  }
  
  public static Set<a> a(int ☃)
  {
    Set<a> ☃ = EnumSet.noneOf(a.class);
    for (a ☃ : values()) {
      if (☃.b(☃)) {
        ☃.add(☃);
      }
    }
    return ☃;
  }
  
  public static int a(Set<a> ☃)
  {
    int ☃ = 0;
    for (a ☃ : ☃) {
      ☃ |= ☃.a();
    }
    return ☃;
  }
}
