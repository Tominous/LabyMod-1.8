public class bnr
  implements Comparable<bnr>
{
  private final String a;
  private final String b;
  private final String c;
  private final boolean d;
  
  public bnr(String ☃, String ☃, String ☃, boolean ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    return this.d;
  }
  
  public String toString()
  {
    return String.format("%s (%s)", new Object[] { this.c, this.b });
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if (!(☃ instanceof bnr)) {
      return false;
    }
    return this.a.equals(((bnr)☃).a);
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public int a(bnr ☃)
  {
    return this.a.compareTo(☃.a);
  }
}
