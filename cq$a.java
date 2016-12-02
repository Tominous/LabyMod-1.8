import com.google.common.base.Predicate;
import com.google.common.collect.Maps;
import java.util.Map;

public enum cq$a
  implements Predicate, nw
{
  private static final Map d;
  private final String e;
  private final cq.c f;
  private static final a[] g;
  private static final String __OBFID = "CL_00002321";
  
  private cq$a(String p_i46015_1_, int p_i46015_2_, String name, cq.c plane)
  {
    e = name;
    f = plane;
  }
  
  public static a a(String name)
  {
    return name == null ? null : (a)d.get(name.toLowerCase());
  }
  
  public String a()
  {
    return e;
  }
  
  public boolean b()
  {
    return f == cq.c.b;
  }
  
  public boolean c()
  {
    return f == cq.c.a;
  }
  
  public String toString()
  {
    return e;
  }
  
  public boolean a(cq facing)
  {
    return (facing != null) && (facing.k() == this);
  }
  
  public cq.c d()
  {
    return f;
  }
  
  public String l()
  {
    return e;
  }
  
  public boolean apply(Object p_apply_1_)
  {
    return a((cq)p_apply_1_);
  }
  
  static
  {
    d = Maps.newHashMap();
    
    g = new a[] { a, b, c };
    
    a[] var0 = values();
    int var1 = var0.length;
    for (int var2 = 0; var2 < var1; var2++)
    {
      a var3 = var0[var2];
      d.put(var3.a().toLowerCase(), var3);
    }
  }
}
