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
          return ☃.a() == this.a;
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
    this.l = ☃;
    this.m = ☃;
    this.n = ☃;
    this.o = ☃;
  }
  
  public agw.b a()
  {
    return this.l;
  }
  
  public int b()
  {
    return this.m;
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
    return this.n;
  }
  
  public String l()
  {
    return this.n;
  }
  
  public String d()
  {
    return this.o;
  }
}
