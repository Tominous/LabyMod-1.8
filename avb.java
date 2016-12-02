import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class avb
  implements Comparable<avb>
{
  private static final List<avb> a = ;
  private static final nm<avb> b = new nm();
  private static final Set<String> c = Sets.newHashSet();
  private final String d;
  private final int e;
  private final String f;
  private int g;
  private boolean h;
  private int i;
  
  public static void a(int ☃)
  {
    if (☃ == 0) {
      return;
    }
    avb ☃ = (avb)b.a(☃);
    if (☃ != null) {
      i += 1;
    }
  }
  
  public static void a(int ☃, boolean ☃)
  {
    if (☃ == 0) {
      return;
    }
    avb ☃ = (avb)b.a(☃);
    if (☃ != null) {
      h = ☃;
    }
  }
  
  public static void a()
  {
    for (avb ☃ : a) {
      ☃.j();
    }
  }
  
  public static void b()
  {
    b.c();
    for (avb ☃ : a) {
      b.a(g, ☃);
    }
  }
  
  public static Set<String> c()
  {
    return c;
  }
  
  public avb(String ☃, int ☃, String ☃)
  {
    d = ☃;
    g = ☃;
    e = ☃;
    f = ☃;
    
    a.add(this);
    b.a(☃, this);
    c.add(☃);
  }
  
  public boolean d()
  {
    return h;
  }
  
  public String e()
  {
    return f;
  }
  
  public boolean f()
  {
    if (i == 0) {
      return false;
    }
    i -= 1;
    return true;
  }
  
  private void j()
  {
    i = 0;
    h = false;
  }
  
  public String g()
  {
    return d;
  }
  
  public int h()
  {
    return e;
  }
  
  public int i()
  {
    return g;
  }
  
  public void b(int ☃)
  {
    g = ☃;
  }
  
  public int a(avb ☃)
  {
    int ☃ = bnq.a(f, new Object[0]).compareTo(bnq.a(f, new Object[0]));
    if (☃ == 0) {
      ☃ = bnq.a(d, new Object[0]).compareTo(bnq.a(d, new Object[0]));
    }
    return ☃;
  }
}
