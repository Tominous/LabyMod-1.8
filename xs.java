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
      a(this);
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
    i = ☃;
    j = ☃;
    f = d.cj();
    a(new yg(a, 0, 15, 47)
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
    a(new yg(a, 1, 35, 47)
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
    
    ☃.a(this, 0, g[0]);
    ☃.a(this, 1, g[1]);
    ☃.a(this, 2, g[2]);
    ☃.a(this, 3, f & 0xFFFFFFF0);
    ☃.a(this, 4, h[0]);
    ☃.a(this, 5, h[1]);
    ☃.a(this, 6, h[2]);
  }
  
  public void b()
  {
    super.b();
    for (int ☃ = 0; ☃ < e.size(); ☃++)
    {
      xn ☃ = (xn)e.get(☃);
      ☃.a(this, 0, g[0]);
      ☃.a(this, 1, g[1]);
      ☃.a(this, 2, g[2]);
      ☃.a(this, 3, f & 0xFFFFFFF0);
      ☃.a(this, 4, h[0]);
      ☃.a(this, 5, h[1]);
      ☃.a(this, 6, h[2]);
    }
  }
  
  public void b(int ☃, int ☃)
  {
    if ((☃ >= 0) && (☃ <= 2)) {
      g[☃] = ☃;
    } else if (☃ == 3) {
      f = ☃;
    } else if ((☃ >= 4) && (☃ <= 6)) {
      h[(☃ - 4)] = ☃;
    } else {
      super.b(☃, ☃);
    }
  }
  
  public void a(og ☃)
  {
    if (☃ == a)
    {
      zx ☃ = ☃.a(0);
      if ((☃ == null) || (!☃.v()))
      {
        for (int ☃ = 0; ☃ < 3; ☃++)
        {
          g[☃] = 0;
          h[☃] = -1;
        }
      }
      else if (!i.D)
      {
        int ☃ = 0;
        for (int ☃ = -1; ☃ <= 1; ☃++) {
          for (int ☃ = -1; ☃ <= 1; ☃++) {
            if ((☃ != 0) || (☃ != 0)) {
              if ((i.d(j.a(☃, 0, ☃))) && (i.d(j.a(☃, 1, ☃))))
              {
                if (i.p(j.a(☃ * 2, 0, ☃ * 2)).c() == afi.X) {
                  ☃++;
                }
                if (i.p(j.a(☃ * 2, 1, ☃ * 2)).c() == afi.X) {
                  ☃++;
                }
                if ((☃ != 0) && (☃ != 0))
                {
                  if (i.p(j.a(☃ * 2, 0, ☃)).c() == afi.X) {
                    ☃++;
                  }
                  if (i.p(j.a(☃ * 2, 1, ☃)).c() == afi.X) {
                    ☃++;
                  }
                  if (i.p(j.a(☃, 0, ☃ * 2)).c() == afi.X) {
                    ☃++;
                  }
                  if (i.p(j.a(☃, 1, ☃ * 2)).c() == afi.X) {
                    ☃++;
                  }
                }
              }
            }
          }
        }
        k.setSeed(f);
        for (int ☃ = 0; ☃ < 3; ☃++)
        {
          g[☃] = ack.a(k, ☃, ☃, ☃);
          h[☃] = -1;
          if (g[☃] < ☃ + 1) {
            g[☃] = 0;
          }
        }
        for (int ☃ = 0; ☃ < 3; ☃++) {
          if (g[☃] > 0)
          {
            List<acl> ☃ = a(☃, ☃, g[☃]);
            if ((☃ != null) && (!☃.isEmpty()))
            {
              acl ☃ = (acl)☃.get(k.nextInt(☃.size()));
              h[☃] = (b.B | c << 8);
            }
          }
        }
        b();
      }
    }
  }
  
  public boolean a(wn ☃, int ☃)
  {
    zx ☃ = a.a(0);
    zx ☃ = a.a(1);
    
    int ☃ = ☃ + 1;
    if (((☃ == null) || (b < ☃)) && (!bA.d)) {
      return false;
    }
    if ((g[☃] > 0) && (☃ != null) && (((bB >= ☃) && (bB >= g[☃])) || (bA.d)))
    {
      if (!i.D)
      {
        List<acl> ☃ = a(☃, ☃, g[☃]);
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
              ☃.a(b, c);
            }
          }
          if (!bA.d)
          {
            b -= ☃;
            if (b <= 0) {
              a.a(1, null);
            }
          }
          ☃.b(na.W);
          a.p_();
          f = ☃.cj();
          a(a);
        }
      }
      return true;
    }
    return false;
  }
  
  private List<acl> a(zx ☃, int ☃, int ☃)
  {
    k.setSeed(f + ☃);
    
    List<acl> ☃ = ack.b(k, ☃, ☃);
    if ((☃.b() == zy.aL) && (☃ != null) && (☃.size() > 1)) {
      ☃.remove(k.nextInt(☃.size()));
    }
    return ☃;
  }
  
  public int e()
  {
    zx ☃ = a.a(1);
    if (☃ == null) {
      return 0;
    }
    return b;
  }
  
  public void b(wn ☃)
  {
    super.b(☃);
    if (i.D) {
      return;
    }
    for (int ☃ = 0; ☃ < a.o_(); ☃++)
    {
      zx ☃ = a.b(☃);
      if (☃ != null) {
        ☃.a(☃, false);
      }
    }
  }
  
  public boolean a(wn ☃)
  {
    if (i.p(j).c() != afi.bC) {
      return false;
    }
    if (☃.e(j.n() + 0.5D, j.o() + 0.5D, j.p() + 0.5D) > 64.0D) {
      return false;
    }
    return true;
  }
  
  public zx b(wn ☃, int ☃)
  {
    zx ☃ = null;
    yg ☃ = (yg)c.get(☃);
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
      else if ((!((yg)c.get(0)).e()) && (((yg)c.get(0)).a(☃)))
      {
        if ((☃.n()) && (b == 1))
        {
          ((yg)c.get(0)).d(☃.k());
          b = 0;
        }
        else if (b >= 1)
        {
          ((yg)c.get(0)).d(new zx(☃.b(), 1, ☃.i()));
          b -= 1;
        }
      }
      else {
        return null;
      }
      if (b == 0) {
        ☃.d(null);
      } else {
        ☃.f();
      }
      if (b == b) {
        return null;
      }
      ☃.a(☃, ☃);
    }
    return ☃;
  }
}
