import com.google.common.collect.Lists;
import java.util.List;

public abstract class afe
  extends afh
{
  protected final boolean a;
  
  public class a
  {
    private final adm b;
    private final cj c;
    private final afe d;
    private alz e;
    private final boolean f;
    private final List<cj> g = Lists.newArrayList();
    
    public a(adm ☃, cj ☃, alz ☃)
    {
      b = ☃;
      c = ☃;
      e = ☃;
      d = ((afe)☃.c());
      afe.b ☃ = (afe.b)☃.b(n());
      f = d.a;
      a(☃);
    }
    
    private void a(afe.b ☃)
    {
      g.clear();
      switch (afe.1.a[☃.ordinal()])
      {
      case 1: 
        g.add(c.c());
        g.add(c.d());
        break;
      case 2: 
        g.add(c.e());
        g.add(c.f());
        break;
      case 3: 
        g.add(c.e());
        g.add(c.f().a());
        break;
      case 4: 
        g.add(c.e().a());
        g.add(c.f());
        break;
      case 5: 
        g.add(c.c().a());
        g.add(c.d());
        break;
      case 6: 
        g.add(c.c());
        g.add(c.d().a());
        break;
      case 7: 
        g.add(c.f());
        g.add(c.d());
        break;
      case 8: 
        g.add(c.e());
        g.add(c.d());
        break;
      case 9: 
        g.add(c.e());
        g.add(c.c());
        break;
      case 10: 
        g.add(c.f());
        g.add(c.c());
      }
    }
    
    private void c()
    {
      for (int ☃ = 0; ☃ < g.size(); ☃++)
      {
        a ☃ = b((cj)g.get(☃));
        if ((☃ == null) || (!☃.a(this))) {
          g.remove(☃--);
        } else {
          g.set(☃, c);
        }
      }
    }
    
    private boolean a(cj ☃)
    {
      return (afe.e(b, ☃)) || (afe.e(b, ☃.a())) || (afe.e(b, ☃.b()));
    }
    
    private a b(cj ☃)
    {
      cj ☃ = ☃;
      alz ☃ = b.p(☃);
      if (afe.d(☃)) {
        return new a(afe.this, b, ☃, ☃);
      }
      ☃ = ☃.a();
      ☃ = b.p(☃);
      if (afe.d(☃)) {
        return new a(afe.this, b, ☃, ☃);
      }
      ☃ = ☃.b();
      ☃ = b.p(☃);
      if (afe.d(☃)) {
        return new a(afe.this, b, ☃, ☃);
      }
      return null;
    }
    
    private boolean a(a ☃)
    {
      return c(c);
    }
    
    private boolean c(cj ☃)
    {
      for (int ☃ = 0; ☃ < g.size(); ☃++)
      {
        cj ☃ = (cj)g.get(☃);
        if ((☃.n() == ☃.n()) && (☃.p() == ☃.p())) {
          return true;
        }
      }
      return false;
    }
    
    protected int a()
    {
      int ☃ = 0;
      for (cq ☃ : cq.c.a) {
        if (a(c.a(☃))) {
          ☃++;
        }
      }
      return ☃;
    }
    
    private boolean b(a ☃)
    {
      return (a(☃)) || (g.size() != 2);
    }
    
    private void c(a ☃)
    {
      g.add(c);
      
      cj ☃ = c.c();
      cj ☃ = c.d();
      cj ☃ = c.e();
      cj ☃ = c.f();
      
      boolean ☃ = c(☃);
      boolean ☃ = c(☃);
      boolean ☃ = c(☃);
      boolean ☃ = c(☃);
      
      afe.b ☃ = null;
      if ((☃) || (☃)) {
        ☃ = afe.b.a;
      }
      if ((☃) || (☃)) {
        ☃ = afe.b.b;
      }
      if (!f)
      {
        if ((☃) && (☃) && (!☃) && (!☃)) {
          ☃ = afe.b.g;
        }
        if ((☃) && (☃) && (!☃) && (!☃)) {
          ☃ = afe.b.h;
        }
        if ((☃) && (☃) && (!☃) && (!☃)) {
          ☃ = afe.b.i;
        }
        if ((☃) && (☃) && (!☃) && (!☃)) {
          ☃ = afe.b.j;
        }
      }
      if (☃ == afe.b.a)
      {
        if (afe.e(b, ☃.a())) {
          ☃ = afe.b.e;
        }
        if (afe.e(b, ☃.a())) {
          ☃ = afe.b.f;
        }
      }
      if (☃ == afe.b.b)
      {
        if (afe.e(b, ☃.a())) {
          ☃ = afe.b.c;
        }
        if (afe.e(b, ☃.a())) {
          ☃ = afe.b.d;
        }
      }
      if (☃ == null) {
        ☃ = afe.b.a;
      }
      e = e.a(d.n(), ☃);
      b.a(c, e, 3);
    }
    
    private boolean d(cj ☃)
    {
      a ☃ = b(☃);
      if (☃ == null) {
        return false;
      }
      ☃.c();
      return ☃.b(this);
    }
    
    public a a(boolean ☃, boolean ☃)
    {
      cj ☃ = c.c();
      cj ☃ = c.d();
      cj ☃ = c.e();
      cj ☃ = c.f();
      
      boolean ☃ = d(☃);
      boolean ☃ = d(☃);
      boolean ☃ = d(☃);
      boolean ☃ = d(☃);
      
      afe.b ☃ = null;
      if (((☃) || (☃)) && (!☃) && (!☃)) {
        ☃ = afe.b.a;
      }
      if (((☃) || (☃)) && (!☃) && (!☃)) {
        ☃ = afe.b.b;
      }
      if (!f)
      {
        if ((☃) && (☃) && (!☃) && (!☃)) {
          ☃ = afe.b.g;
        }
        if ((☃) && (☃) && (!☃) && (!☃)) {
          ☃ = afe.b.h;
        }
        if ((☃) && (☃) && (!☃) && (!☃)) {
          ☃ = afe.b.i;
        }
        if ((☃) && (☃) && (!☃) && (!☃)) {
          ☃ = afe.b.j;
        }
      }
      if (☃ == null)
      {
        if ((☃) || (☃)) {
          ☃ = afe.b.a;
        }
        if ((☃) || (☃)) {
          ☃ = afe.b.b;
        }
        if (!f) {
          if (☃)
          {
            if ((☃) && (☃)) {
              ☃ = afe.b.g;
            }
            if ((☃) && (☃)) {
              ☃ = afe.b.h;
            }
            if ((☃) && (☃)) {
              ☃ = afe.b.j;
            }
            if ((☃) && (☃)) {
              ☃ = afe.b.i;
            }
          }
          else
          {
            if ((☃) && (☃)) {
              ☃ = afe.b.i;
            }
            if ((☃) && (☃)) {
              ☃ = afe.b.j;
            }
            if ((☃) && (☃)) {
              ☃ = afe.b.h;
            }
            if ((☃) && (☃)) {
              ☃ = afe.b.g;
            }
          }
        }
      }
      if (☃ == afe.b.a)
      {
        if (afe.e(b, ☃.a())) {
          ☃ = afe.b.e;
        }
        if (afe.e(b, ☃.a())) {
          ☃ = afe.b.f;
        }
      }
      if (☃ == afe.b.b)
      {
        if (afe.e(b, ☃.a())) {
          ☃ = afe.b.c;
        }
        if (afe.e(b, ☃.a())) {
          ☃ = afe.b.d;
        }
      }
      if (☃ == null) {
        ☃ = afe.b.a;
      }
      a(☃);
      e = e.a(d.n(), ☃);
      if ((☃) || (b.p(c) != e))
      {
        b.a(c, e, 3);
        for (int ☃ = 0; ☃ < g.size(); ☃++)
        {
          a ☃ = b((cj)g.get(☃));
          if (☃ != null)
          {
            ☃.c();
            if (☃.b(this)) {
              ☃.c(this);
            }
          }
        }
      }
      return this;
    }
    
    public alz b()
    {
      return e;
    }
  }
  
  public static boolean e(adm ☃, cj ☃)
  {
    return d(☃.p(☃));
  }
  
  public static boolean d(alz ☃)
  {
    afh ☃ = ☃.c();
    return (☃ == afi.av) || (☃ == afi.D) || (☃ == afi.E) || (☃ == afi.cs);
  }
  
  protected afe(boolean ☃)
  {
    super(arm.q);
    a = ☃;
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    a(yz.e);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public auh a(adm ☃, cj ☃, aui ☃, aui ☃)
  {
    a(☃, ☃);
    return super.a(☃, ☃, ☃, ☃);
  }
  
  public void a(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    afe.b ☃ = ☃.c() == this ? (afe.b)☃.b(n()) : null;
    if ((☃ != null) && (☃.c())) {
      a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
    } else {
      a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    if (adm.a(☃, ☃.b())) {
      return true;
    }
    return false;
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    if (!D)
    {
      ☃ = a(☃, ☃, ☃, true);
      if (a) {
        a(☃, ☃, ☃, this);
      }
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (D) {
      return;
    }
    afe.b ☃ = (afe.b)☃.b(n());
    boolean ☃ = false;
    if (!adm.a(☃, ☃.b())) {
      ☃ = true;
    }
    if ((☃ == afe.b.c) && (!adm.a(☃, ☃.f()))) {
      ☃ = true;
    } else if ((☃ == afe.b.d) && (!adm.a(☃, ☃.e()))) {
      ☃ = true;
    } else if ((☃ == afe.b.e) && (!adm.a(☃, ☃.c()))) {
      ☃ = true;
    } else if ((☃ == afe.b.f) && (!adm.a(☃, ☃.d()))) {
      ☃ = true;
    }
    if (☃)
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
    }
    else
    {
      b(☃, ☃, ☃, ☃);
    }
  }
  
  protected void b(adm ☃, cj ☃, alz ☃, afh ☃) {}
  
  protected alz a(adm ☃, cj ☃, alz ☃, boolean ☃)
  {
    if (D) {
      return ☃;
    }
    return new afe.a(☃, ☃, ☃).a(☃.z(☃), ☃).b();
  }
  
  public int k()
  {
    return 0;
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    super.b(☃, ☃, ☃);
    if (((afe.b)☃.b(n())).c()) {
      ☃.c(☃.a(), this);
    }
    if (a)
    {
      ☃.c(☃, this);
      ☃.c(☃.b(), this);
    }
  }
  
  public abstract amo<afe.b> n();
  
  public static enum b
    implements nw
  {
    private static final b[] k;
    private final int l;
    private final String m;
    
    static
    {
      k = new b[values().length];
      for (b ☃ : values()) {
        k[☃.a()] = ☃;
      }
    }
    
    private b(int ☃, String ☃)
    {
      l = ☃;
      m = ☃;
    }
    
    public int a()
    {
      return l;
    }
    
    public String toString()
    {
      return m;
    }
    
    public boolean c()
    {
      return (this == e) || (this == c) || (this == f) || (this == d);
    }
    
    public static b a(int ☃)
    {
      if ((☃ < 0) || (☃ >= k.length)) {
        ☃ = 0;
      }
      return k[☃];
    }
    
    public String l()
    {
      return m;
    }
  }
}
