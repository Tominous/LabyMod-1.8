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
    this.e = name;
    this.f = plane;
  }
  
  public static a a(String name)
  {
    return name == null ? null : (a)d.get(name.toLowerCase());
  }
  
  public String a()
  {
    return this.e;
  }
  
  public boolean b()
  {
    return this.f == cq.c.b;
  }
  
  public boolean c()
  {
    return this.f == cq.c.a;
  }
  
  public String toString()
  {
    return this.e;
  }
  
  public boolean a(cq facing)
  {
    return (facing != null) && (facing.k() == this);
  }
  
  public cq.c d()
  {
    return this.f;
  }
  
  public String l()
  {
    return this.e;
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
