import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public enum cy
{
  private final String Q;
  private final int R;
  private final boolean S;
  private final int T;
  private static final Map<Integer, cy> U;
  private static final String[] V;
  
  static
  {
    U = Maps.newHashMap();
    
    List<String> ☃ = Lists.newArrayList();
    for (cy ☃ : values())
    {
      U.put(Integer.valueOf(☃.c()), ☃);
      if (!☃.b().endsWith("_")) {
        ☃.add(☃.b());
      }
    }
    V = (String[])☃.toArray(new String[☃.size()]);
  }
  
  private cy(String ☃, int ☃, boolean ☃, int ☃)
  {
    Q = ☃;
    R = ☃;
    S = ☃;
    T = ☃;
  }
  
  private cy(String ☃, int ☃, boolean ☃)
  {
    this(☃, ☃, ☃, 0);
  }
  
  public static String[] a()
  {
    return V;
  }
  
  public String b()
  {
    return Q;
  }
  
  public int c()
  {
    return R;
  }
  
  public int d()
  {
    return T;
  }
  
  public boolean e()
  {
    return S;
  }
  
  public boolean f()
  {
    return T > 0;
  }
  
  public static cy a(int ☃)
  {
    return (cy)U.get(Integer.valueOf(☃));
  }
}
