import com.google.common.collect.Lists;
import java.util.List;

public class aku
  extends akw
{
  private int a;
  private du f;
  private boolean g;
  private List<aku.a> h;
  private List<zd> i;
  private String j;
  
  public static enum a
  {
    private String N;
    private String O;
    private String[] P = new String[3];
    private zx Q;
    
    private a(String ☃, String ☃)
    {
      N = ☃;
      O = ☃;
    }
    
    private a(String ☃, String ☃, zx ☃)
    {
      this(☃, ☃);
      Q = ☃;
    }
    
    private a(String ☃, String ☃, String ☃, String ☃, String ☃)
    {
      this(☃, ☃);
      P[0] = ☃;
      P[1] = ☃;
      P[2] = ☃;
    }
    
    public String a()
    {
      return N;
    }
    
    public String b()
    {
      return O;
    }
    
    public String[] c()
    {
      return P;
    }
    
    public boolean d()
    {
      return (Q != null) || (P[0] != null);
    }
    
    public boolean e()
    {
      return Q != null;
    }
    
    public zx f()
    {
      return Q;
    }
    
    public static a a(String ☃)
    {
      for (a ☃ : ) {
        if (O.equals(☃)) {
          return ☃;
        }
      }
      return null;
    }
  }
  
  public void a(zx ☃)
  {
    f = null;
    if ((☃.n()) && (☃.o().b("BlockEntityTag", 10)))
    {
      dn ☃ = ☃.o().m("BlockEntityTag");
      if (☃.c("Patterns")) {
        f = ((du)☃.c("Patterns", 10).b());
      }
      if (☃.b("Base", 99)) {
        a = ☃.f("Base");
      } else {
        a = (☃.i() & 0xF);
      }
    }
    else
    {
      a = (☃.i() & 0xF);
    }
    h = null;
    i = null;
    j = "";
    g = true;
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    a(☃, a, f);
  }
  
  public static void a(dn ☃, int ☃, du ☃)
  {
    ☃.a("Base", ☃);
    if (☃ != null) {
      ☃.a("Patterns", ☃);
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    a = ☃.f("Base");
    f = ☃.c("Patterns", 10);
    
    h = null;
    i = null;
    j = null;
    g = true;
  }
  
  public ff y_()
  {
    dn ☃ = new dn();
    b(☃);
    return new ft(c, 6, ☃);
  }
  
  public int b()
  {
    return a;
  }
  
  public static int b(zx ☃)
  {
    dn ☃ = ☃.a("BlockEntityTag", false);
    if ((☃ != null) && (☃.c("Base"))) {
      return ☃.f("Base");
    }
    return ☃.i();
  }
  
  public static int c(zx ☃)
  {
    dn ☃ = ☃.a("BlockEntityTag", false);
    if ((☃ != null) && (☃.c("Patterns"))) {
      return ☃.c("Patterns", 10).c();
    }
    return 0;
  }
  
  public List<aku.a> c()
  {
    h();
    return h;
  }
  
  public du d()
  {
    return f;
  }
  
  public List<zd> e()
  {
    h();
    return i;
  }
  
  public String g()
  {
    h();
    return j;
  }
  
  private void h()
  {
    if ((h != null) && (i != null) && (j != null)) {
      return;
    }
    if (!g)
    {
      j = "";
      return;
    }
    h = Lists.newArrayList();
    i = Lists.newArrayList();
    
    h.add(aku.a.a);
    i.add(zd.a(a));
    j = ("b" + a);
    if (f != null) {
      for (int ☃ = 0; ☃ < f.c(); ☃++)
      {
        dn ☃ = f.b(☃);
        aku.a ☃ = aku.a.a(☃.j("Pattern"));
        if (☃ != null)
        {
          h.add(☃);
          int ☃ = ☃.f("Color");
          i.add(zd.a(☃));
          
          j = (j + ☃.b() + ☃);
        }
      }
    }
  }
  
  public static void e(zx ☃)
  {
    dn ☃ = ☃.a("BlockEntityTag", false);
    if ((☃ == null) || (!☃.b("Patterns", 9))) {
      return;
    }
    du ☃ = ☃.c("Patterns", 10);
    if (☃.c() <= 0) {
      return;
    }
    ☃.a(☃.c() - 1);
    if (☃.c_())
    {
      ☃.o().o("BlockEntityTag");
      if (☃.o().c_()) {
        ☃.d(null);
      }
    }
  }
}
