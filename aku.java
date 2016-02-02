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
      this.N = ☃;
      this.O = ☃;
    }
    
    private a(String ☃, String ☃, zx ☃)
    {
      this(☃, ☃);
      this.Q = ☃;
    }
    
    private a(String ☃, String ☃, String ☃, String ☃, String ☃)
    {
      this(☃, ☃);
      this.P[0] = ☃;
      this.P[1] = ☃;
      this.P[2] = ☃;
    }
    
    public String a()
    {
      return this.N;
    }
    
    public String b()
    {
      return this.O;
    }
    
    public String[] c()
    {
      return this.P;
    }
    
    public boolean d()
    {
      return (this.Q != null) || (this.P[0] != null);
    }
    
    public boolean e()
    {
      return this.Q != null;
    }
    
    public zx f()
    {
      return this.Q;
    }
    
    public static a a(String ☃)
    {
      for (a ☃ : ) {
        if (☃.O.equals(☃)) {
          return ☃;
        }
      }
      return null;
    }
  }
  
  public void a(zx ☃)
  {
    this.f = null;
    if ((☃.n()) && (☃.o().b("BlockEntityTag", 10)))
    {
      dn ☃ = ☃.o().m("BlockEntityTag");
      if (☃.c("Patterns")) {
        this.f = ((du)☃.c("Patterns", 10).b());
      }
      if (☃.b("Base", 99)) {
        this.a = ☃.f("Base");
      } else {
        this.a = (☃.i() & 0xF);
      }
    }
    else
    {
      this.a = (☃.i() & 0xF);
    }
    this.h = null;
    this.i = null;
    this.j = "";
    this.g = true;
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    a(☃, this.a, this.f);
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
    
    this.a = ☃.f("Base");
    this.f = ☃.c("Patterns", 10);
    
    this.h = null;
    this.i = null;
    this.j = null;
    this.g = true;
  }
  
  public ff y_()
  {
    dn ☃ = new dn();
    b(☃);
    return new ft(this.c, 6, ☃);
  }
  
  public int b()
  {
    return this.a;
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
    return this.h;
  }
  
  public du d()
  {
    return this.f;
  }
  
  public List<zd> e()
  {
    h();
    return this.i;
  }
  
  public String g()
  {
    h();
    return this.j;
  }
  
  private void h()
  {
    if ((this.h != null) && (this.i != null) && (this.j != null)) {
      return;
    }
    if (!this.g)
    {
      this.j = "";
      return;
    }
    this.h = Lists.newArrayList();
    this.i = Lists.newArrayList();
    
    this.h.add(aku.a.a);
    this.i.add(zd.a(this.a));
    this.j = ("b" + this.a);
    if (this.f != null) {
      for (int ☃ = 0; ☃ < this.f.c(); ☃++)
      {
        dn ☃ = this.f.b(☃);
        aku.a ☃ = aku.a.a(☃.j("Pattern"));
        if (☃ != null)
        {
          this.h.add(☃);
          int ☃ = ☃.f("Color");
          this.i.add(zd.a(☃));
          
          this.j = (this.j + ☃.b() + ☃);
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
