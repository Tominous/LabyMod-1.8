public class ya
  implements og
{
  private final acy a;
  private zx[] b = new zx[3];
  private final wn c;
  private acz d;
  private int e;
  
  public ya(wn ☃, acy ☃)
  {
    this.c = ☃;
    this.a = ☃;
  }
  
  public int o_()
  {
    return this.b.length;
  }
  
  public zx a(int ☃)
  {
    return this.b[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (this.b[☃] != null)
    {
      if (☃ == 2)
      {
        zx ☃ = this.b[☃];
        this.b[☃] = null;
        return ☃;
      }
      if (this.b[☃].b <= ☃)
      {
        zx ☃ = this.b[☃];
        this.b[☃] = null;
        if (e(☃)) {
          h();
        }
        return ☃;
      }
      zx ☃ = this.b[☃].a(☃);
      if (this.b[☃].b == 0) {
        this.b[☃] = null;
      }
      if (e(☃)) {
        h();
      }
      return ☃;
    }
    return null;
  }
  
  private boolean e(int ☃)
  {
    return (☃ == 0) || (☃ == 1);
  }
  
  public zx b(int ☃)
  {
    if (this.b[☃] != null)
    {
      zx ☃ = this.b[☃];
      this.b[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    this.b[☃] = ☃;
    if ((☃ != null) && (☃.b > q_())) {
      ☃.b = q_();
    }
    if (e(☃)) {
      h();
    }
  }
  
  public String e_()
  {
    return "mob.villager";
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
  
  public int q_()
  {
    return 64;
  }
  
  public boolean a(wn ☃)
  {
    return this.a.v_() == ☃;
  }
  
  public void b(wn ☃) {}
  
  public void c(wn ☃) {}
  
  public boolean b(int ☃, zx ☃)
  {
    return true;
  }
  
  public void p_()
  {
    h();
  }
  
  public void h()
  {
    this.d = null;
    
    zx ☃ = this.b[0];
    zx ☃ = this.b[1];
    if (☃ == null)
    {
      ☃ = ☃;
      ☃ = null;
    }
    if (☃ == null)
    {
      a(2, null);
    }
    else
    {
      ada ☃ = this.a.b_(this.c);
      if (☃ != null)
      {
        acz ☃ = ☃.a(☃, ☃, this.e);
        if ((☃ != null) && (!☃.h()))
        {
          this.d = ☃;
          a(2, ☃.d().k());
        }
        else if (☃ != null)
        {
          ☃ = ☃.a(☃, ☃, this.e);
          if ((☃ != null) && (!☃.h()))
          {
            this.d = ☃;
            a(2, ☃.d().k());
          }
          else
          {
            a(2, null);
          }
        }
        else
        {
          a(2, null);
        }
      }
    }
    this.a.a_(a(2));
  }
  
  public acz i()
  {
    return this.d;
  }
  
  public void d(int ☃)
  {
    this.e = ☃;
    h();
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
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      this.b[☃] = null;
    }
  }
}
