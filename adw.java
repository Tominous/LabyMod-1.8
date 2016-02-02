public class adw
  implements Comparable<adw>
{
  private static long d;
  private final afh e;
  public final cj a;
  public long b;
  public int c;
  private long f = d++;
  
  public adw(cj ☃, afh ☃)
  {
    this.a = ☃;
    this.e = ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if ((☃ instanceof adw))
    {
      adw ☃ = (adw)☃;
      return (this.a.equals(☃.a)) && (afh.a(this.e, ☃.e));
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public adw a(long ☃)
  {
    this.b = ☃;
    return this;
  }
  
  public void a(int ☃)
  {
    this.c = ☃;
  }
  
  public int a(adw ☃)
  {
    if (this.b < ☃.b) {
      return -1;
    }
    if (this.b > ☃.b) {
      return 1;
    }
    if (this.c != ☃.c) {
      return this.c - ☃.c;
    }
    if (this.f < ☃.f) {
      return -1;
    }
    if (this.f > ☃.f) {
      return 1;
    }
    return 0;
  }
  
  public String toString()
  {
    return afh.a(this.e) + ": " + this.a + ", " + this.b + ", " + this.c + ", " + this.f;
  }
  
  public afh a()
  {
    return this.e;
  }
}
