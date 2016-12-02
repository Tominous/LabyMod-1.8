import com.google.common.collect.Lists;
import java.util.List;

public class oq
  implements og
{
  private String a;
  private int b;
  private zx[] c;
  private List<oh> d;
  private boolean e;
  
  public oq(String ☃, boolean ☃, int ☃)
  {
    a = ☃;
    e = ☃;
    b = ☃;
    c = new zx[☃];
  }
  
  public oq(eu ☃, int ☃)
  {
    this(☃.c(), true, ☃);
  }
  
  public void a(oh ☃)
  {
    if (d == null) {
      d = Lists.newArrayList();
    }
    d.add(☃);
  }
  
  public void b(oh ☃)
  {
    d.remove(☃);
  }
  
  public zx a(int ☃)
  {
    if ((☃ < 0) || (☃ >= c.length)) {
      return null;
    }
    return c[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (c[☃] != null)
    {
      if (c[☃].b <= ☃)
      {
        zx ☃ = c[☃];
        c[☃] = null;
        p_();
        return ☃;
      }
      zx ☃ = c[☃].a(☃);
      if (c[☃].b == 0) {
        c[☃] = null;
      }
      p_();
      return ☃;
    }
    return null;
  }
  
  public zx a(zx ☃)
  {
    zx ☃ = ☃.k();
    for (int ☃ = 0; ☃ < b; ☃++)
    {
      zx ☃ = a(☃);
      if (☃ == null)
      {
        a(☃, ☃);
        p_();
        return null;
      }
      if (zx.c(☃, ☃))
      {
        int ☃ = Math.min(q_(), ☃.c());
        int ☃ = Math.min(b, ☃ - b);
        if (☃ > 0)
        {
          b += ☃;
          b -= ☃;
          if (b <= 0)
          {
            p_();
            return null;
          }
        }
      }
    }
    if (b != b) {
      p_();
    }
    return ☃;
  }
  
  public zx b(int ☃)
  {
    if (c[☃] != null)
    {
      zx ☃ = c[☃];
      c[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    c[☃] = ☃;
    if ((☃ != null) && (b > q_())) {
      b = q_();
    }
    p_();
  }
  
  public int o_()
  {
    return b;
  }
  
  public String e_()
  {
    return a;
  }
  
  public boolean l_()
  {
    return e;
  }
  
  public void a(String ☃)
  {
    e = true;
    a = ☃;
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
  
  public void p_()
  {
    if (d != null) {
      for (int ☃ = 0; ☃ < d.size(); ☃++) {
        ((oh)d.get(☃)).a(this);
      }
    }
  }
  
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
    for (int ☃ = 0; ☃ < c.length; ☃++) {
      c[☃] = null;
    }
  }
}
