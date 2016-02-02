public class xp
  implements og
{
  private final zx[] a;
  private final int b;
  private final int c;
  private final xi d;
  
  public xp(xi ☃, int ☃, int ☃)
  {
    int ☃ = ☃ * ☃;
    this.a = new zx[☃];
    this.d = ☃;
    this.b = ☃;
    this.c = ☃;
  }
  
  public int o_()
  {
    return this.a.length;
  }
  
  public zx a(int ☃)
  {
    if (☃ >= o_()) {
      return null;
    }
    return this.a[☃];
  }
  
  public zx c(int ☃, int ☃)
  {
    if ((☃ < 0) || (☃ >= this.b) || (☃ < 0) || (☃ > this.c)) {
      return null;
    }
    return a(☃ + ☃ * this.b);
  }
  
  public String e_()
  {
    return "container.crafting";
  }
  
  public boolean l_()
  {
    return false;
  }
  
  public eu f_()
  {
    if (l_()) {
      return new fa(e_());
    }
    return new fb(e_(), new Object[0]);
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
  
  public zx a(int ☃, int ☃)
  {
    if (this.a[☃] != null)
    {
      if (this.a[☃].b <= ☃)
      {
        zx ☃ = this.a[☃];
        this.a[☃] = null;
        this.d.a(this);
        return ☃;
      }
      zx ☃ = this.a[☃].a(☃);
      if (this.a[☃].b == 0) {
        this.a[☃] = null;
      }
      this.d.a(this);
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    this.a[☃] = ☃;
    this.d.a(this);
  }
  
  public int q_()
  {
    return 64;
  }
  
  public void p_() {}
  
  public boolean a(wn ☃)
  {
    return true;
  }
  
  public void b(wn ☃) {}
  
  public void c(wn ☃) {}
  
  public boolean b(int ☃, zx ☃)
  {
    return true;
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
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      this.a[☃] = null;
    }
  }
  
  public int h()
  {
    return this.c;
  }
  
  public int i()
  {
    return this.b;
  }
}
