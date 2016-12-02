import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;

public enum agw$a
  implements nw
{
  private static final a[][] k;
  private final agw.b l;
  private final int m;
  private final String n;
  private final String o;
  
  static
  {
    k = new a[agw.b.values().length][];
    for (agw.b ☃ : agw.b.values())
    {
      Collection<a> ☃ = Collections2.filter(Lists.newArrayList(values()), new Predicate()
      {
        public boolean a(agw.a ☃)
        {
          return ☃.a() == a;
        }
      });
      k[☃.ordinal()] = ((a[])☃.toArray(new a[☃.size()]));
    }
  }
  
  private agw$a(agw.b ☃, int ☃, String ☃)
  {
    this(☃, ☃, ☃, ☃);
  }
  
  private agw$a(agw.b ☃, int ☃, String ☃, String ☃)
  {
    l = ☃;
    m = ☃;
    n = ☃;
    o = ☃;
  }
  
  public agw.b a()
  {
    return l;
  }
  
  public int b()
  {
    return m;
  }
  
  public static a a(agw.b ☃, int ☃)
  {
    a[] ☃ = k[☃.ordinal()];
    if ((☃ < 0) || (☃ >= ☃.length)) {
      ☃ = 0;
    }
    return ☃[☃];
  }
  
  public static a[] a(agw.b ☃)
  {
    return k[☃.ordinal()];
  }
  
  public String toString()
  {
    return n;
  }
  
  public String l()
  {
    return n;
  }
  
  public String d()
  {
    return o;
  }
}
