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
      ☃.i += 1;
    }
  }
  
  public static void a(int ☃, boolean ☃)
  {
    if (☃ == 0) {
      return;
    }
    avb ☃ = (avb)b.a(☃);
    if (☃ != null) {
      ☃.h = ☃;
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
      b.a(☃.g, ☃);
    }
  }
  
  public static Set<String> c()
  {
    return c;
  }
  
  public avb(String ☃, int ☃, String ☃)
  {
    this.d = ☃;
    this.g = ☃;
    this.e = ☃;
    this.f = ☃;
    
    a.add(this);
    b.a(☃, this);
    c.add(☃);
  }
  
  public boolean d()
  {
    return this.h;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    if (this.i == 0) {
      return false;
    }
    this.i -= 1;
    return true;
  }
  
  private void j()
  {
    this.i = 0;
    this.h = false;
  }
  
  public String g()
  {
    return this.d;
  }
  
  public int h()
  {
    return this.e;
  }
  
  public int i()
  {
    return this.g;
  }
  
  public void b(int ☃)
  {
    this.g = ☃;
  }
  
  public int a(avb ☃)
  {
    int ☃ = bnq.a(this.f, new Object[0]).compareTo(bnq.a(☃.f, new Object[0]));
    if (☃ == 0) {
      ☃ = bnq.a(this.d, new Object[0]).compareTo(bnq.a(☃.d, new Object[0]));
    }
    return ☃;
  }
}
