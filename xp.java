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
    a = new zx[☃];
    d = ☃;
    b = ☃;
    c = ☃;
  }
  
  public int o_()
  {
    return a.length;
  }
  
  public zx a(int ☃)
  {
    if (☃ >= o_()) {
      return null;
    }
    return a[☃];
  }
  
  public zx c(int ☃, int ☃)
  {
    if ((☃ < 0) || (☃ >= b) || (☃ < 0) || (☃ > c)) {
      return null;
    }
    return a(☃ + ☃ * b);
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
    if (a[☃] != null)
    {
      zx ☃ = a[☃];
      a[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public zx a(int ☃, int ☃)
  {
    if (a[☃] != null)
    {
      if (a[☃].b <= ☃)
      {
        zx ☃ = a[☃];
        a[☃] = null;
        d.a(this);
        return ☃;
      }
      zx ☃ = a[☃].a(☃);
      if (a[☃].b == 0) {
        a[☃] = null;
      }
      d.a(this);
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    a[☃] = ☃;
    d.a(this);
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
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      a[☃] = null;
    }
  }
  
  public int h()
  {
    return c;
  }
  
  public int i()
  {
    return b;
  }
}
