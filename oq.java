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
    this.a = ☃;
    this.e = ☃;
    this.b = ☃;
    this.c = new zx[☃];
  }
  
  public oq(eu ☃, int ☃)
  {
    this(☃.c(), true, ☃);
  }
  
  public void a(oh ☃)
  {
    if (this.d == null) {
      this.d = Lists.newArrayList();
    }
    this.d.add(☃);
  }
  
  public void b(oh ☃)
  {
    this.d.remove(☃);
  }
  
  public zx a(int ☃)
  {
    if ((☃ < 0) || (☃ >= this.c.length)) {
      return null;
    }
    return this.c[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (this.c[☃] != null)
    {
      if (this.c[☃].b <= ☃)
      {
        zx ☃ = this.c[☃];
        this.c[☃] = null;
        p_();
        return ☃;
      }
      zx ☃ = this.c[☃].a(☃);
      if (this.c[☃].b == 0) {
        this.c[☃] = null;
      }
      p_();
      return ☃;
    }
    return null;
  }
  
  public zx a(zx ☃)
  {
    zx ☃ = ☃.k();
    for (int ☃ = 0; ☃ < this.b; ☃++)
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
        int ☃ = Math.min(☃.b, ☃ - ☃.b);
        if (☃ > 0)
        {
          ☃.b += ☃;
          ☃.b -= ☃;
          if (☃.b <= 0)
          {
            p_();
            return null;
          }
        }
      }
    }
    if (☃.b != ☃.b) {
      p_();
    }
    return ☃;
  }
  
  public zx b(int ☃)
  {
    if (this.c[☃] != null)
    {
      zx ☃ = this.c[☃];
      this.c[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    this.c[☃] = ☃;
    if ((☃ != null) && (☃.b > q_())) {
      ☃.b = q_();
    }
    p_();
  }
  
  public int o_()
  {
    return this.b;
  }
  
  public String e_()
  {
    return this.a;
  }
  
  public boolean l_()
  {
    return this.e;
  }
  
  public void a(String ☃)
  {
    this.e = true;
    this.a = ☃;
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
    if (this.d != null) {
      for (int ☃ = 0; ☃ < this.d.size(); ☃++) {
        ((oh)this.d.get(☃)).a(this);
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
    for (int ☃ = 0; ☃ < this.c.length; ☃++) {
      this.c[☃] = null;
    }
  }
}
