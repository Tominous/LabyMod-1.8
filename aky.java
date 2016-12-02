import java.util.List;
import java.util.Random;

public class aky
  extends alk
  implements km, og
{
  private zx[] m = new zx[27];
  public boolean a;
  public aky f;
  public aky g;
  public aky h;
  public aky i;
  public float j;
  public float k;
  public int l;
  private int n;
  private int o;
  private String p;
  
  public aky()
  {
    this.o = -1;
  }
  
  public aky(int ☃)
  {
    this.o = ☃;
  }
  
  public int o_()
  {
    return 27;
  }
  
  public zx a(int ☃)
  {
    return this.m[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (this.m[☃] != null)
    {
      if (this.m[☃].b <= ☃)
      {
        zx ☃ = this.m[☃];
        this.m[☃] = null;
        p_();
        return ☃;
      }
      zx ☃ = this.m[☃].a(☃);
      if (this.m[☃].b == 0) {
        this.m[☃] = null;
      }
      p_();
      return ☃;
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    if (this.m[☃] != null)
    {
      zx ☃ = this.m[☃];
      this.m[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    this.m[☃] = ☃;
    if ((☃ != null) && (☃.b > q_())) {
      ☃.b = q_();
    }
    p_();
  }
  
  public String e_()
  {
    return l_() ? this.p : "container.chest";
  }
  
  public boolean l_()
  {
    return (this.p != null) && (this.p.length() > 0);
  }
  
  public void a(String ☃)
  {
    this.p = ☃;
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    du ☃ = ☃.c("Items", 10);
    this.m = new zx[o_()];
    if (☃.b("CustomName", 8)) {
      this.p = ☃.j("CustomName");
    }
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot") & 0xFF;
      if ((☃ >= 0) && (☃ < this.m.length)) {
        this.m[☃] = zx.a(☃);
      }
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    du ☃ = new du();
    for (int ☃ = 0; ☃ < this.m.length; ☃++) {
      if (this.m[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)☃);
        this.m[☃].b(☃);
        ☃.a(☃);
      }
    }
    ☃.a("Items", ☃);
    if (l_()) {
      ☃.a("CustomName", this.p);
    }
  }
  
  public int q_()
  {
    return 64;
  }
  
  public boolean a(wn ☃)
  {
    if (this.b.s(this.c) != this) {
      return false;
    }
    if (☃.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
      return false;
    }
    return true;
  }
  
  public void E()
  {
    super.E();
    this.a = false;
  }
  
  private void a(aky ☃, cq ☃)
  {
    if (☃.x()) {
      this.a = false;
    } else if (this.a) {
      switch (aky.1.a[☃.ordinal()])
      {
      case 1: 
        if (this.f != ☃) {
          this.a = false;
        }
        break;
      case 2: 
        if (this.i != ☃) {
          this.a = false;
        }
        break;
      case 3: 
        if (this.g != ☃) {
          this.a = false;
        }
        break;
      case 4: 
        if (this.h != ☃) {
          this.a = false;
        }
        break;
      }
    }
  }
  
  public void m()
  {
    if (this.a) {
      return;
    }
    this.a = true;
    this.h = a(cq.e);
    this.g = a(cq.f);
    this.f = a(cq.c);
    this.i = a(cq.d);
  }
  
  protected aky a(cq ☃)
  {
    cj ☃ = this.c.a(☃);
    if (b(☃))
    {
      akw ☃ = this.b.s(☃);
      if ((☃ instanceof aky))
      {
        aky ☃ = (aky)☃;
        ☃.a(this, ☃.d());
        
        return ☃;
      }
    }
    return null;
  }
  
  private boolean b(cj ☃)
  {
    if (this.b == null) {
      return false;
    }
    afh ☃ = this.b.p(☃).c();
    
    return ((☃ instanceof afs)) && (((afs)☃).b == n());
  }
  
  public void c()
  {
    m();
    
    int ☃ = this.c.n();
    int ☃ = this.c.o();
    int ☃ = this.c.p();
    
    this.n += 1;
    if ((!this.b.D) && (this.l != 0) && ((this.n + ☃ + ☃ + ☃) % 200 == 0))
    {
      this.l = 0;
      
      float ☃ = 5.0F;
      List<wn> ☃ = this.b.a(wn.class, new aug(☃ - ☃, ☃ - ☃, ☃ - ☃, ☃ + 1 + ☃, ☃ + 1 + ☃, ☃ + 1 + ☃));
      for (wn ☃ : ☃) {
        if ((☃.bk instanceof xo))
        {
          og ☃ = ((xo)☃.bk).e();
          if ((☃ == this) || (((☃ instanceof of)) && (((of)☃).a(this)))) {
            this.l += 1;
          }
        }
      }
    }
    this.k = this.j;
    
    float ☃ = 0.1F;
    if ((this.l > 0) && (this.j == 0.0F) && 
      (this.f == null) && (this.h == null))
    {
      double ☃ = ☃ + 0.5D;
      double ☃ = ☃ + 0.5D;
      if (this.i != null) {
        ☃ += 0.5D;
      }
      if (this.g != null) {
        ☃ += 0.5D;
      }
      this.b.a(☃, ☃ + 0.5D, ☃, "random.chestopen", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
    }
    if (((this.l == 0) && (this.j > 0.0F)) || ((this.l > 0) && (this.j < 1.0F)))
    {
      float ☃ = this.j;
      if (this.l > 0) {
        this.j += ☃;
      } else {
        this.j -= ☃;
      }
      if (this.j > 1.0F) {
        this.j = 1.0F;
      }
      float ☃ = 0.5F;
      if ((this.j < ☃) && (☃ >= ☃) && 
        (this.f == null) && (this.h == null))
      {
        double ☃ = ☃ + 0.5D;
        double ☃ = ☃ + 0.5D;
        if (this.i != null) {
          ☃ += 0.5D;
        }
        if (this.g != null) {
          ☃ += 0.5D;
        }
        this.b.a(☃, ☃ + 0.5D, ☃, "random.chestclosed", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
      }
      if (this.j < 0.0F) {
        this.j = 0.0F;
      }
    }
  }
  
  public boolean c(int ☃, int ☃)
  {
    if (☃ == 1)
    {
      this.l = ☃;
      return true;
    }
    return super.c(☃, ☃);
  }
  
  public void b(wn ☃)
  {
    if (!☃.v())
    {
      if (this.l < 0) {
        this.l = 0;
      }
      this.l += 1;
      this.b.c(this.c, w(), 1, this.l);
      this.b.c(this.c, w());
      this.b.c(this.c.b(), w());
    }
  }
  
  public void c(wn ☃)
  {
    if ((!☃.v()) && 
      ((w() instanceof afs)))
    {
      this.l -= 1;
      this.b.c(this.c, w(), 1, this.l);
      this.b.c(this.c, w());
      this.b.c(this.c.b(), w());
    }
  }
  
  public boolean b(int ☃, zx ☃)
  {
    return true;
  }
  
  public void y()
  {
    super.y();
    E();
    m();
  }
  
  public int n()
  {
    if (this.o == -1) {
      if ((this.b != null) && ((w() instanceof afs))) {
        this.o = ((afs)w()).b;
      } else {
        return 0;
      }
    }
    return this.o;
  }
  
  public String k()
  {
    return "minecraft:chest";
  }
  
  public xi a(wm ☃, wn ☃)
  {
    return new xo(☃, this, ☃);
  }
  
  public int a_(int ☃)
  {
    return 0;
  }
  
  public void b(int ☃, int ☃) {}
  
  public int g()
  {
    return 0;
  }
  
  public void l()
  {
    for (int ☃ = 0; ☃ < this.m.length; ☃++) {
      this.m[☃] = null;
    }
  }
}
