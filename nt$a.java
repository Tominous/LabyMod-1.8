public final class nt$a
  implements Comparable<a>
{
  public double a;
  public double b;
  public String c;
  
  public nt$a(String p_i1554_1_, double p_i1554_2_, double p_i1554_4_)
  {
    this.c = p_i1554_1_;
    this.a = p_i1554_2_;
    this.b = p_i1554_4_;
  }
  
  public int a(a p_compareTo_1_)
  {
    return p_compareTo_1_.a > this.a ? 1 : p_compareTo_1_.a < this.a ? -1 : p_compareTo_1_.c.compareTo(this.c);
  }
  
  public int a()
  {
    return (this.c.hashCode() & 0xAAAAAA) + 4473924;
  }
}
