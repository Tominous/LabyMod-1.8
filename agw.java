import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public abstract class agw
  extends afm
{
  protected amm<agw.a> a;
  
  protected agw()
  {
    j(M.b().a(n(), l() == agw.b.b ? agw.a.b : agw.a.a));
  }
  
  public int a(alz ☃)
  {
    return ((agw.a)☃.b(n())).b();
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    for (agw.a ☃ : agw.a.a(l())) {
      ☃.add(new zx(☃, 1, ☃.b()));
    }
  }
  
  public alz a(int ☃)
  {
    return Q().a(n(), agw.a.a(l(), ☃));
  }
  
  public abstract agw.b l();
  
  public amo<agw.a> n()
  {
    if (a == null) {
      a = amm.a("type", agw.a.class, new Predicate()
      {
        public boolean a(agw.a ☃)
        {
          return ☃.a() == l();
        }
      });
    }
    return a;
  }
  
  public int c(alz ☃)
  {
    return ((agw.a)☃.b(n())).b();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { n() });
  }
  
  public static enum b
  {
    private b() {}
    
    public agw a()
    {
      if (this == a) {
        return afi.N;
      }
      return afi.O;
    }
  }
  
  public static enum a
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
    
    private a(agw.b ☃, int ☃, String ☃)
    {
      this(☃, ☃, ☃, ☃);
    }
    
    private a(agw.b ☃, int ☃, String ☃, String ☃)
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
  
  public afh.a R()
  {
    return afh.a.b;
  }
}
