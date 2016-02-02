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
    this.Q = ☃;
    this.R = ☃;
    this.S = ☃;
    this.T = ☃;
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
    return this.Q;
  }
  
  public int c()
  {
    return this.R;
  }
  
  public int d()
  {
    return this.T;
  }
  
  public boolean e()
  {
    return this.S;
  }
  
  public boolean f()
  {
    return this.T > 0;
  }
  
  public static cy a(int ☃)
  {
    return (cy)U.get(Integer.valueOf(☃));
  }
}
