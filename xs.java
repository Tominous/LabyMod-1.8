import java.util.List;
import java.util.Random;

public class xs
  extends xi
{
  public og a = new oq("Enchant", true, 2)
  {
    public int q_()
    {
      return 64;
    }
    
    public void p_()
    {
      super.p_();
      xs.this.a(this);
    }
  };
  private adm i;
  private cj j;
  private Random k = new Random();
  public int f;
  public int[] g = new int[3];
  public int[] h = { -1, -1, -1 };
  
  public xs(wm ☃, adm ☃)
  {
    this(☃, ☃, cj.a);
  }
  
  public xs(wm ☃, adm ☃, cj ☃)
  {
    this.i = ☃;
    this.j = ☃;
    this.f = ☃.d.cj();
    a(new yg(this.a, 0, 15, 47)
    {
      public boolean a(zx ☃)
      {
        return true;
      }
      
      public int a()
      {
        return 1;
      }
    });
    a(new yg(this.a, 1, 35, 47)
    {
      public boolean a(zx ☃)
      {
        return (☃.b() == zy.aW) && (zd.a(☃.i()) == zd.l);
      }
    });
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃ + ☃ * 9 + 9, 8 + ☃ * 18, 84 + ☃ * 18));
      }
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(new yg(☃, ☃, 8 + ☃ * 18, 142));
    }
  }
  
  public void a(xn ☃)
  {
    super.a(☃);
    
    ☃.a(this, 0, this.g[0]);
    ☃.a(this, 1, this.g[1]);
    ☃.a(this, 2, this.g[2]);
    ☃.a(this, 3, this.f & 0xFFFFFFF0);
    ☃.a(this, 4, this.h[0]);
    ☃.a(this, 5, this.h[1]);
    ☃.a(this, 6, this.h[2]);
  }
  
  public void b()
  {
    super.b();
    for (int ☃ = 0; ☃ < this.e.size(); ☃++)
    {
      xn ☃ = (xn)this.e.get(☃);
      ☃.a(this, 0, this.g[0]);
      ☃.a(this, 1, this.g[1]);
      ☃.a(this, 2, this.g[2]);
      ☃.a(this, 3, this.f & 0xFFFFFFF0);
      ☃.a(this, 4, this.h[0]);
      ☃.a(this, 5, this.h[1]);
      ☃.a(this, 6, this.h[2]);
    }
  }
  
  public void b(int ☃, int ☃)
  {
    if ((☃ >= 0) && (☃ <= 2)) {
      this.g[☃] = ☃;
    } else if (☃ == 3) {
      this.f = ☃;
    } else if ((☃ >= 4) && (☃ <= 6)) {
      this.h[(☃ - 4)] = ☃;
    } else {
      super.b(☃, ☃);
    }
  }
  
  public void a(og ☃)
  {
    if (☃ == this.a)
    {
      zx ☃ = ☃.a(0);
      if ((☃ == null) || (!☃.v()))
      {
        for (int ☃ = 0; ☃ < 3; ☃++)
        {
          this.g[☃] = 0;
          this.h[☃] = -1;
        }
      }
      else if (!this.i.D)
      {
        int ☃ = 0;
        for (int ☃ = -1; ☃ <= 1; ☃++) {
          for (int ☃ = -1; ☃ <= 1; ☃++) {
            if ((☃ != 0) || (☃ != 0)) {
              if ((this.i.d(this.j.a(☃, 0, ☃))) && (this.i.d(this.j.a(☃, 1, ☃))))
              {
                if (this.i.p(this.j.a(☃ * 2, 0, ☃ * 2)).c() == afi.X) {
                  ☃++;
                }
                if (this.i.p(this.j.a(☃ * 2, 1, ☃ * 2)).c() == afi.X) {
                  ☃++;
                }
                if ((☃ != 0) && (☃ != 0))
                {
                  if (this.i.p(this.j.a(☃ * 2, 0, ☃)).c() == afi.X) {
                    ☃++;
                  }
                  if (this.i.p(this.j.a(☃ * 2, 1, ☃)).c() == afi.X) {
                    ☃++;
                  }
                  if (this.i.p(this.j.a(☃, 0, ☃ * 2)).c() == afi.X) {
                    ☃++;
                  }
                  if (this.i.p(this.j.a(☃, 1, ☃ * 2)).c() == afi.X) {
                    ☃++;
                  }
                }
              }
            }
          }
        }
        this.k.setSeed(this.f);
        for (int ☃ = 0; ☃ < 3; ☃++)
        {
          this.g[☃] = ack.a(this.k, ☃, ☃, ☃);
          this.h[☃] = -1;
          if (this.g[☃] < ☃ + 1) {
            this.g[☃] = 0;
          }
        }
        for (int ☃ = 0; ☃ < 3; ☃++) {
          if (this.g[☃] > 0)
          {
            List<acl> ☃ = a(☃, ☃, this.g[☃]);
            if ((☃ != null) && (!☃.isEmpty()))
            {
              acl ☃ = (acl)☃.get(this.k.nextInt(☃.size()));
              this.h[☃] = (☃.b.B | ☃.c << 8);
            }
          }
        }
        b();
      }
    }
  }
  
  public boolean a(wn ☃, int ☃)
  {
    zx ☃ = this.a.a(0);
    zx ☃ = this.a.a(1);
    
    int ☃ = ☃ + 1;
    if (((☃ == null) || (☃.b < ☃)) && (!☃.bA.d)) {
      return false;
    }
    if ((this.g[☃] > 0) && (☃ != null) && (((☃.bB >= ☃) && (☃.bB >= this.g[☃])) || (☃.bA.d)))
    {
      if (!this.i.D)
      {
        List<acl> ☃ = a(☃, ☃, this.g[☃]);
        boolean ☃ = ☃.b() == zy.aL;
        if (☃ != null)
        {
          ☃.b(☃);
          if (☃) {
            ☃.a(zy.cd);
          }
          for (int ☃ = 0; ☃ < ☃.size(); ☃++)
          {
            acl ☃ = (acl)☃.get(☃);
            if (☃) {
              zy.cd.a(☃, ☃);
            } else {
              ☃.a(☃.b, ☃.c);
            }
          }
          if (!☃.bA.d)
          {
            ☃.b -= ☃;
            if (☃.b <= 0) {
              this.a.a(1, null);
            }
          }
          ☃.b(na.W);
          this.a.p_();
          this.f = ☃.cj();
          a(this.a);
        }
      }
      return true;
    }
    return false;
  }
  
  private List<acl> a(zx ☃, int ☃, int ☃)
  {
    this.k.setSeed(this.f + ☃);
    
    List<acl> ☃ = ack.b(this.k, ☃, ☃);
    if ((☃.b() == zy.aL) && (☃ != null) && (☃.size() > 1)) {
      ☃.remove(this.k.nextInt(☃.size()));
    }
    return ☃;
  }
  
  public int e()
  {
    zx ☃ = this.a.a(1);
    if (☃ == null) {
      return 0;
    }
    return ☃.b;
  }
  
  public void b(wn ☃)
  {
    super.b(☃);
    if (this.i.D) {
      return;
    }
    for (int ☃ = 0; ☃ < this.a.o_(); ☃++)
    {
      zx ☃ = this.a.b(☃);
      if (☃ != null) {
        ☃.a(☃, false);
      }
    }
  }
  
  public boolean a(wn ☃)
  {
    if (this.i.p(this.j).c() != afi.bC) {
      return false;
    }
    if (☃.e(this.j.n() + 0.5D, this.j.o() + 0.5D, this.j.p() + 0.5D) > 64.0D) {
      return false;
    }
    return true;
  }
  
  public zx b(wn ☃, int ☃)
  {
    zx ☃ = null;
    yg ☃ = (yg)this.c.get(☃);
    if ((☃ != null) && (☃.e()))
    {
      zx ☃ = ☃.d();
      ☃ = ☃.k();
      if (☃ == 0)
      {
        if (!a(☃, 2, 38, true)) {
          return null;
        }
      }
      else if (☃ == 1)
      {
        if (!a(☃, 2, 38, true)) {
          return null;
        }
      }
      else if ((☃.b() == zy.aW) && (zd.a(☃.i()) == zd.l))
      {
        if (!a(☃, 1, 2, true)) {
          return null;
        }
      }
      else if ((!((yg)this.c.get(0)).e()) && (((yg)this.c.get(0)).a(☃)))
      {
        if ((☃.n()) && (☃.b == 1))
        {
          ((yg)this.c.get(0)).d(☃.k());
          ☃.b = 0;
        }
        else if (☃.b >= 1)
        {
          ((yg)this.c.get(0)).d(new zx(☃.b(), 1, ☃.i()));
          ☃.b -= 1;
        }
      }
      else {
        return null;
      }
      if (☃.b == 0) {
        ☃.d(null);
      } else {
        ☃.f();
      }
      if (☃.b == ☃.b) {
        return null;
      }
      ☃.a(☃, ☃);
    }
    return ☃;
  }
}
