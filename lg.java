import net.minecraft.server.MinecraftServer;

public class lg
{
  public adm a;
  public lf b;
  private adp.a c = adp.a.a;
  private boolean d;
  private int e;
  private cj f = cj.a;
  private int g;
  private boolean h;
  private cj i = cj.a;
  private int j;
  private int k = -1;
  
  public lg(adm ☃)
  {
    this.a = ☃;
  }
  
  public void a(adp.a ☃)
  {
    this.c = ☃;
    
    ☃.a(this.b.bA);
    
    this.b.t();
    this.b.b.ap().a(new gz(gz.a.b, new lf[] { this.b }));
  }
  
  public adp.a b()
  {
    return this.c;
  }
  
  public boolean c()
  {
    return this.c.e();
  }
  
  public boolean d()
  {
    return this.c.d();
  }
  
  public void b(adp.a ☃)
  {
    if (this.c == adp.a.a) {
      this.c = ☃;
    }
    a(this.c);
  }
  
  public void a()
  {
    this.g += 1;
    if (this.h)
    {
      int ☃ = this.g - this.j;
      afh ☃ = this.a.p(this.i).c();
      if (☃.t() == arm.a)
      {
        this.h = false;
      }
      else
      {
        float ☃ = ☃.a(this.b, this.b.o, this.i) * (☃ + 1);
        int ☃ = (int)(☃ * 10.0F);
        if (☃ != this.k)
        {
          this.a.c(this.b.F(), this.i, ☃);
          this.k = ☃;
        }
        if (☃ >= 1.0F)
        {
          this.h = false;
          b(this.i);
        }
      }
    }
    else if (this.d)
    {
      afh ☃ = this.a.p(this.f).c();
      if (☃.t() == arm.a)
      {
        this.a.c(this.b.F(), this.f, -1);
        this.k = -1;
        this.d = false;
      }
      else
      {
        int ☃ = this.g - this.e;
        float ☃ = ☃.a(this.b, this.b.o, this.i) * (☃ + 1);
        int ☃ = (int)(☃ * 10.0F);
        if (☃ != this.k)
        {
          this.a.c(this.b.F(), this.f, ☃);
          this.k = ☃;
        }
      }
    }
  }
  
  public void a(cj ☃, cq ☃)
  {
    if (d())
    {
      if (!this.a.a(null, ☃, ☃)) {
        b(☃);
      }
      return;
    }
    afh ☃ = this.a.p(☃).c();
    if (this.c.c())
    {
      if (this.c == adp.a.e) {
        return;
      }
      if (!this.b.cn())
      {
        zx ☃ = this.b.bZ();
        if (☃ == null) {
          return;
        }
        if (!☃.c(☃)) {
          return;
        }
      }
    }
    this.a.a(null, ☃, ☃);
    this.e = this.g;
    float ☃ = 1.0F;
    if (☃.t() != arm.a)
    {
      ☃.a(this.a, ☃, this.b);
      ☃ = ☃.a(this.b, this.b.o, ☃);
    }
    if ((☃.t() != arm.a) && (☃ >= 1.0F))
    {
      b(☃);
    }
    else
    {
      this.d = true;
      this.f = ☃;
      
      int ☃ = (int)(☃ * 10.0F);
      this.a.c(this.b.F(), ☃, ☃);
      this.k = ☃;
    }
  }
  
  public void a(cj ☃)
  {
    if (☃.equals(this.f))
    {
      int ☃ = this.g - this.e;
      
      afh ☃ = this.a.p(☃).c();
      if (☃.t() != arm.a)
      {
        float ☃ = ☃.a(this.b, this.b.o, ☃) * (☃ + 1);
        if (☃ >= 0.7F)
        {
          this.d = false;
          this.a.c(this.b.F(), ☃, -1);
          b(☃);
        }
        else if (!this.h)
        {
          this.d = false;
          this.h = true;
          this.i = ☃;
          this.j = this.e;
        }
      }
    }
  }
  
  public void e()
  {
    this.d = false;
    
    this.a.c(this.b.F(), this.f, -1);
  }
  
  private boolean c(cj ☃)
  {
    alz ☃ = this.a.p(☃);
    
    ☃.c().a(this.a, ☃, ☃, this.b);
    
    boolean ☃ = this.a.g(☃);
    if (☃) {
      ☃.c().d(this.a, ☃, ☃);
    }
    return ☃;
  }
  
  public boolean b(cj ☃)
  {
    if ((this.c.d()) && 
      (this.b.bA() != null) && ((this.b.bA().b() instanceof aay))) {
      return false;
    }
    alz ☃ = this.a.p(☃);
    akw ☃ = this.a.s(☃);
    if (this.c.c())
    {
      if (this.c == adp.a.e) {
        return false;
      }
      if (!this.b.cn())
      {
        zx ☃ = this.b.bZ();
        if (☃ == null) {
          return false;
        }
        if (!☃.c(☃.c())) {
          return false;
        }
      }
    }
    this.a.a(this.b, 2001, ☃, afh.f(☃));
    
    boolean ☃ = c(☃);
    if (d())
    {
      this.b.a.a(new fv(this.a, ☃));
    }
    else
    {
      zx ☃ = this.b.bZ();
      boolean ☃ = this.b.b(☃.c());
      if (☃ != null)
      {
        ☃.a(this.a, ☃.c(), ☃, this.b);
        if (☃.b == 0) {
          this.b.ca();
        }
      }
      if ((☃) && (☃)) {
        ☃.c().a(this.a, this.b, ☃, ☃, ☃);
      }
    }
    return ☃;
  }
  
  public boolean a(wn ☃, adm ☃, zx ☃)
  {
    if (this.c == adp.a.e) {
      return false;
    }
    int ☃ = ☃.b;
    int ☃ = ☃.i();
    zx ☃ = ☃.a(☃, ☃);
    if ((☃ != ☃) || ((☃ != null) && ((☃.b != ☃) || (☃.l() > 0) || (☃.i() != ☃))))
    {
      ☃.bi.a[☃.bi.c] = ☃;
      if (d())
      {
        ☃.b = ☃;
        if (☃.e()) {
          ☃.b(☃);
        }
      }
      if (☃.b == 0) {
        ☃.bi.a[☃.bi.c] = null;
      }
      if (!☃.bS()) {
        ((lf)☃).a(☃.bj);
      }
      return true;
    }
    return false;
  }
  
  public boolean a(wn ☃, adm ☃, zx ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (this.c == adp.a.e)
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof oo))
      {
        afh ☃ = ☃.p(☃).c();
        oo ☃ = (oo)☃;
        if (((☃ instanceof aky)) && ((☃ instanceof afs))) {
          ☃ = ((afs)☃).f(☃, ☃);
        }
        if (☃ != null)
        {
          ☃.a(☃);
          return true;
        }
      }
      else if ((☃ instanceof og))
      {
        ☃.a((og)☃);
        return true;
      }
      return false;
    }
    if ((!☃.av()) || (☃.bA() == null))
    {
      alz ☃ = ☃.p(☃);
      if (☃.c().a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃)) {
        return true;
      }
    }
    if (☃ == null) {
      return false;
    }
    if (d())
    {
      int ☃ = ☃.i();
      int ☃ = ☃.b;
      boolean ☃ = ☃.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      ☃.b(☃);
      ☃.b = ☃;
      return ☃;
    }
    return ☃.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(le ☃)
  {
    this.a = ☃;
  }
}
