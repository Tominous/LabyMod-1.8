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
    o = -1;
  }
  
  public aky(int ☃)
  {
    o = ☃;
  }
  
  public int o_()
  {
    return 27;
  }
  
  public zx a(int ☃)
  {
    return m[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (m[☃] != null)
    {
      if (m[☃].b <= ☃)
      {
        zx ☃ = m[☃];
        m[☃] = null;
        p_();
        return ☃;
      }
      zx ☃ = m[☃].a(☃);
      if (m[☃].b == 0) {
        m[☃] = null;
      }
      p_();
      return ☃;
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    if (m[☃] != null)
    {
      zx ☃ = m[☃];
      m[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    m[☃] = ☃;
    if ((☃ != null) && (b > q_())) {
      b = q_();
    }
    p_();
  }
  
  public String e_()
  {
    return l_() ? p : "container.chest";
  }
  
  public boolean l_()
  {
    return (p != null) && (p.length() > 0);
  }
  
  public void a(String ☃)
  {
    p = ☃;
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    du ☃ = ☃.c("Items", 10);
    m = new zx[o_()];
    if (☃.b("CustomName", 8)) {
      p = ☃.j("CustomName");
    }
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot") & 0xFF;
      if ((☃ >= 0) && (☃ < m.length)) {
        m[☃] = zx.a(☃);
      }
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    du ☃ = new du();
    for (int ☃ = 0; ☃ < m.length; ☃++) {
      if (m[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)☃);
        m[☃].b(☃);
        ☃.a(☃);
      }
    }
    ☃.a("Items", ☃);
    if (l_()) {
      ☃.a("CustomName", p);
    }
  }
  
  public int q_()
  {
    return 64;
  }
  
  public boolean a(wn ☃)
  {
    if (b.s(c) != this) {
      return false;
    }
    if (☃.e(c.n() + 0.5D, c.o() + 0.5D, c.p() + 0.5D) > 64.0D) {
      return false;
    }
    return true;
  }
  
  public void E()
  {
    super.E();
    a = false;
  }
  
  private void a(aky ☃, cq ☃)
  {
    if (☃.x()) {
      a = false;
    } else if (a) {
      switch (aky.1.a[☃.ordinal()])
      {
      case 1: 
        if (f != ☃) {
          a = false;
        }
        break;
      case 2: 
        if (i != ☃) {
          a = false;
        }
        break;
      case 3: 
        if (g != ☃) {
          a = false;
        }
        break;
      case 4: 
        if (h != ☃) {
          a = false;
        }
        break;
      }
    }
  }
  
  public void m()
  {
    if (a) {
      return;
    }
    a = true;
    h = a(cq.e);
    g = a(cq.f);
    f = a(cq.c);
    i = a(cq.d);
  }
  
  protected aky a(cq ☃)
  {
    cj ☃ = c.a(☃);
    if (b(☃))
    {
      akw ☃ = b.s(☃);
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
    if (b == null) {
      return false;
    }
    afh ☃ = b.p(☃).c();
    
    return ((☃ instanceof afs)) && (b == n());
  }
  
  public void c()
  {
    m();
    
    int ☃ = c.n();
    int ☃ = c.o();
    int ☃ = c.p();
    
    n += 1;
    if ((!b.D) && (l != 0) && ((n + ☃ + ☃ + ☃) % 200 == 0))
    {
      l = 0;
      
      float ☃ = 5.0F;
      List<wn> ☃ = b.a(wn.class, new aug(☃ - ☃, ☃ - ☃, ☃ - ☃, ☃ + 1 + ☃, ☃ + 1 + ☃, ☃ + 1 + ☃));
      for (wn ☃ : ☃) {
        if ((bk instanceof xo))
        {
          og ☃ = ((xo)bk).e();
          if ((☃ == this) || (((☃ instanceof of)) && (((of)☃).a(this)))) {
            l += 1;
          }
        }
      }
    }
    k = j;
    
    float ☃ = 0.1F;
    if ((l > 0) && (j == 0.0F) && 
      (f == null) && (h == null))
    {
      double ☃ = ☃ + 0.5D;
      double ☃ = ☃ + 0.5D;
      if (i != null) {
        ☃ += 0.5D;
      }
      if (g != null) {
        ☃ += 0.5D;
      }
      b.a(☃, ☃ + 0.5D, ☃, "random.chestopen", 0.5F, b.s.nextFloat() * 0.1F + 0.9F);
    }
    if (((l == 0) && (j > 0.0F)) || ((l > 0) && (j < 1.0F)))
    {
      float ☃ = j;
      if (l > 0) {
        j += ☃;
      } else {
        j -= ☃;
      }
      if (j > 1.0F) {
        j = 1.0F;
      }
      float ☃ = 0.5F;
      if ((j < ☃) && (☃ >= ☃) && 
        (f == null) && (h == null))
      {
        double ☃ = ☃ + 0.5D;
        double ☃ = ☃ + 0.5D;
        if (i != null) {
          ☃ += 0.5D;
        }
        if (g != null) {
          ☃ += 0.5D;
        }
        b.a(☃, ☃ + 0.5D, ☃, "random.chestclosed", 0.5F, b.s.nextFloat() * 0.1F + 0.9F);
      }
      if (j < 0.0F) {
        j = 0.0F;
      }
    }
  }
  
  public boolean c(int ☃, int ☃)
  {
    if (☃ == 1)
    {
      l = ☃;
      return true;
    }
    return super.c(☃, ☃);
  }
  
  public void b(wn ☃)
  {
    if (!☃.v())
    {
      if (l < 0) {
        l = 0;
      }
      l += 1;
      b.c(c, w(), 1, l);
      b.c(c, w());
      b.c(c.b(), w());
    }
  }
  
  public void c(wn ☃)
  {
    if ((!☃.v()) && 
      ((w() instanceof afs)))
    {
      l -= 1;
      b.c(c, w(), 1, l);
      b.c(c, w());
      b.c(c.b(), w());
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
    if (o == -1) {
      if ((b != null) && ((w() instanceof afs))) {
        o = wb;
      } else {
        return 0;
      }
    }
    return o;
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
    for (int ☃ = 0; ☃ < m.length; ☃++) {
      m[☃] = null;
    }
  }
}
