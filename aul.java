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
    this.a = ☃;
    this.b = ☃;
    this.d = ☃;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public void a(String ☃)
  {
    if (☃ == null) {
      throw new IllegalArgumentException("Name cannot be null");
    }
    this.d = ☃;
    this.a.b(this);
  }
  
  public Collection<String> d()
  {
    return this.c;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public void b(String ☃)
  {
    if (☃ == null) {
      throw new IllegalArgumentException("Prefix cannot be null");
    }
    this.e = ☃;
    this.a.b(this);
  }
  
  public String f()
  {
    return this.f;
  }
  
  public void c(String ☃)
  {
    this.f = ☃;
    this.a.b(this);
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
    return this.g;
  }
  
  public void a(boolean ☃)
  {
    this.g = ☃;
    this.a.b(this);
  }
  
  public boolean h()
  {
    return this.h;
  }
  
  public void b(boolean ☃)
  {
    this.h = ☃;
    this.a.b(this);
  }
  
  public auq.a i()
  {
    return this.i;
  }
  
  public auq.a j()
  {
    return this.j;
  }
  
  public void a(auq.a ☃)
  {
    this.i = ☃;
    this.a.b(this);
  }
  
  public void b(auq.a ☃)
  {
    this.j = ☃;
    this.a.b(this);
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
    this.k = ☃;
  }
  
  public a l()
  {
    return this.k;
  }
}
