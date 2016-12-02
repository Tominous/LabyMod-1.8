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
    if (this.o.Q().b("doEntityDrops")) {
      oi.a(this.o, this, this);
    }
  }
  
  public zx a(int ☃)
  {
    return this.a[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (this.a[☃] != null)
    {
      if (this.a[☃].b <= ☃)
      {
        zx ☃ = this.a[☃];
        this.a[☃] = null;
        return ☃;
      }
      zx ☃ = this.a[☃].a(☃);
      if (this.a[☃].b == 0) {
        this.a[☃] = null;
      }
      return ☃;
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    if (this.a[☃] != null)
    {
      zx ☃ = this.a[☃];
      this.a[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    this.a[☃] = ☃;
    if ((☃ != null) && (☃.b > q_())) {
      ☃.b = q_();
    }
  }
  
  public void p_() {}
  
  public boolean a(wn ☃)
  {
    if (this.I) {
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
    this.b = false;
    super.c(☃);
  }
  
  public void J()
  {
    if (this.b) {
      oi.a(this.o, this, this);
    }
    super.J();
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    
    du ☃ = new du();
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      if (this.a[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)☃);
        this.a[☃].b(☃);
        ☃.a(☃);
      }
    }
    ☃.a("Items", ☃);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    
    du ☃ = ☃.c("Items", 10);
    this.a = new zx[o_()];
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot") & 0xFF;
      if ((☃ >= 0) && (☃ < this.a.length)) {
        this.a[☃] = zx.a(☃);
      }
    }
  }
  
  public boolean e(wn ☃)
  {
    if (!this.o.D) {
      ☃.a(this);
    }
    return true;
  }
  
  protected void o()
  {
    int ☃ = 15 - xi.b(this);
    float ☃ = 0.98F + ☃ * 0.001F;
    
    this.v *= ☃;
    this.w *= 0.0D;
    this.x *= ☃;
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
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      this.a[☃] = null;
    }
  }
}
