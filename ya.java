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
    c = ☃;
    a = ☃;
  }
  
  public int o_()
  {
    return b.length;
  }
  
  public zx a(int ☃)
  {
    return b[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (b[☃] != null)
    {
      if (☃ == 2)
      {
        zx ☃ = b[☃];
        b[☃] = null;
        return ☃;
      }
      if (b[☃].b <= ☃)
      {
        zx ☃ = b[☃];
        b[☃] = null;
        if (e(☃)) {
          h();
        }
        return ☃;
      }
      zx ☃ = b[☃].a(☃);
      if (b[☃].b == 0) {
        b[☃] = null;
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
    if (b[☃] != null)
    {
      zx ☃ = b[☃];
      b[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    b[☃] = ☃;
    if ((☃ != null) && (b > q_())) {
      b = q_();
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
    return a.v_() == ☃;
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
    d = null;
    
    zx ☃ = b[0];
    zx ☃ = b[1];
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
      ada ☃ = a.b_(c);
      if (☃ != null)
      {
        acz ☃ = ☃.a(☃, ☃, e);
        if ((☃ != null) && (!☃.h()))
        {
          d = ☃;
          a(2, ☃.d().k());
        }
        else if (☃ != null)
        {
          ☃ = ☃.a(☃, ☃, e);
          if ((☃ != null) && (!☃.h()))
          {
            d = ☃;
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
    a.a_(a(2));
  }
  
  public acz i()
  {
    return d;
  }
  
  public void d(int ☃)
  {
    e = ☃;
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
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      b[☃] = null;
    }
  }
}
