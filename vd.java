public abstract class vd
  extends va
  implements oo
{
  private zx[] a = new zx[36];
  private boolean b = true;
  
  public vd(adm ☃)
  {
    super(☃);
  }
  
  public vd(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃);
  }
  
  public void a(ow ☃)
  {
    super.a(☃);
    if (o.Q().b("doEntityDrops")) {
      oi.a(o, this, this);
    }
  }
  
  public zx a(int ☃)
  {
    return a[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (a[☃] != null)
    {
      if (a[☃].b <= ☃)
      {
        zx ☃ = a[☃];
        a[☃] = null;
        return ☃;
      }
      zx ☃ = a[☃].a(☃);
      if (a[☃].b == 0) {
        a[☃] = null;
      }
      return ☃;
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    if (a[☃] != null)
    {
      zx ☃ = a[☃];
      a[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    a[☃] = ☃;
    if ((☃ != null) && (b > q_())) {
      b = q_();
    }
  }
  
  public void p_() {}
  
  public boolean a(wn ☃)
  {
    if (I) {
      return false;
    }
    if (☃.h(this) > 64.0D) {
      return false;
    }
    return true;
  }
  
  public void b(wn ☃) {}
  
  public void c(wn ☃) {}
  
  public boolean b(int ☃, zx ☃)
  {
    return true;
  }
  
  public String e_()
  {
    return l_() ? aM() : "container.minecart";
  }
  
  public int q_()
  {
    return 64;
  }
  
  public void c(int ☃)
  {
    b = false;
    super.c(☃);
  }
  
  public void J()
  {
    if (b) {
      oi.a(o, this, this);
    }
    super.J();
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    
    du ☃ = new du();
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      if (a[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)☃);
        a[☃].b(☃);
        ☃.a(☃);
      }
    }
    ☃.a("Items", ☃);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    
    du ☃ = ☃.c("Items", 10);
    a = new zx[o_()];
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot") & 0xFF;
      if ((☃ >= 0) && (☃ < a.length)) {
        a[☃] = zx.a(☃);
      }
    }
  }
  
  public boolean e(wn ☃)
  {
    if (!o.D) {
      ☃.a(this);
    }
    return true;
  }
  
  protected void o()
  {
    int ☃ = 15 - xi.b(this);
    float ☃ = 0.98F + ☃ * 0.001F;
    
    v *= ☃;
    w *= 0.0D;
    x *= ☃;
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
  
  public boolean r_()
  {
    return false;
  }
  
  public void a(on ☃) {}
  
  public on i()
  {
    return on.a;
  }
  
  public void l()
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      a[☃] = null;
    }
  }
}
