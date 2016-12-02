import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class boa
  implements bnw
{
  private final List<bnz> a;
  private final int b;
  private final int c;
  private final int d;
  private final boolean e;
  
  public boa(List<bnz> ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
  }
  
  public int a()
  {
    return c;
  }
  
  public int b()
  {
    return b;
  }
  
  public int c()
  {
    return a.size();
  }
  
  public int d()
  {
    return d;
  }
  
  public boolean e()
  {
    return e;
  }
  
  private bnz d(int ☃)
  {
    return (bnz)a.get(☃);
  }
  
  public int a(int ☃)
  {
    bnz ☃ = d(☃);
    if (☃.a()) {
      return d;
    }
    return ☃.b();
  }
  
  public boolean b(int ☃)
  {
    return !((bnz)a.get(☃)).a();
  }
  
  public int c(int ☃)
  {
    return ((bnz)a.get(☃)).c();
  }
  
  public Set<Integer> f()
  {
    Set<Integer> ☃ = Sets.newHashSet();
    for (bnz ☃ : a) {
      ☃.add(Integer.valueOf(☃.c()));
    }
    return ☃;
  }
}
