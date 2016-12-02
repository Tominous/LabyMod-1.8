import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class aul
  extends auq
{
  private final auo a;
  private final String b;
  private final Set<String> c = Sets.newHashSet();
  private String d;
  private String e = "";
  private String f = "";
  private boolean g = true;
  private boolean h = true;
  private auq.a i = auq.a.a;
  private auq.a j = auq.a.a;
  private a k = a.v;
  
  public aul(auo ☃, String ☃)
  {
    a = ☃;
    b = ☃;
    d = ☃;
  }
  
  public String b()
  {
    return b;
  }
  
  public String c()
  {
    return d;
  }
  
  public void a(String ☃)
  {
    if (☃ == null) {
      throw new IllegalArgumentException("Name cannot be null");
    }
    d = ☃;
    a.b(this);
  }
  
  public Collection<String> d()
  {
    return c;
  }
  
  public String e()
  {
    return e;
  }
  
  public void b(String ☃)
  {
    if (☃ == null) {
      throw new IllegalArgumentException("Prefix cannot be null");
    }
    e = ☃;
    a.b(this);
  }
  
  public String f()
  {
    return f;
  }
  
  public void c(String ☃)
  {
    f = ☃;
    a.b(this);
  }
  
  public String d(String ☃)
  {
    return e() + ☃ + f();
  }
  
  public static String a(auq ☃, String ☃)
  {
    if (☃ == null) {
      return ☃;
    }
    return ☃.d(☃);
  }
  
  public boolean g()
  {
    return g;
  }
  
  public void a(boolean ☃)
  {
    g = ☃;
    a.b(this);
  }
  
  public boolean h()
  {
    return h;
  }
  
  public void b(boolean ☃)
  {
    h = ☃;
    a.b(this);
  }
  
  public auq.a i()
  {
    return i;
  }
  
  public auq.a j()
  {
    return j;
  }
  
  public void a(auq.a ☃)
  {
    i = ☃;
    a.b(this);
  }
  
  public void b(auq.a ☃)
  {
    j = ☃;
    a.b(this);
  }
  
  public int k()
  {
    int ☃ = 0;
    if (g()) {
      ☃ |= 0x1;
    }
    if (h()) {
      ☃ |= 0x2;
    }
    return ☃;
  }
  
  public void a(int ☃)
  {
    a((☃ & 0x1) > 0);
    b((☃ & 0x2) > 0);
  }
  
  public void a(a ☃)
  {
    k = ☃;
  }
  
  public a l()
  {
    return k;
  }
}
