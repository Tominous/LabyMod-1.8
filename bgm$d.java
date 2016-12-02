import java.util.List;

public class bgm$d
{
  private final String a;
  private final List<bgm.c> b;
  
  public bgm$d(String ☃, List<bgm.c> ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public List<bgm.c> b()
  {
    return this.b;
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
    if (!this.a.equals(☃.a)) {
      return false;
    }
    if (!this.b.equals(☃.b)) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    int ☃ = this.a.hashCode();
    ☃ = 31 * ☃ + this.b.hashCode();
    return ☃;
  }
}
