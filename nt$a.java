public final class nt$a
  implements Comparable<a>
{
  public double a;
  public double b;
  public String c;
  
  public nt$a(String p_i1554_1_, double p_i1554_2_, double p_i1554_4_)
  {
    c = p_i1554_1_;
    a = p_i1554_2_;
    b = p_i1554_4_;
  }
  
  public int a(a p_compareTo_1_)
  {
    return a > a ? 1 : a < a ? -1 : c.compareTo(c);
  }
  
  public int a()
  {
    return (c.hashCode() & 0xAAAAAA) + 4473924;
  }
}
