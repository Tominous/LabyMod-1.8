import java.util.List;

public abstract class yz
{
  public static final yz[] a = new yz[12];
  public static final yz b = new yz(0, "buildingBlocks")
  {
    public zw e()
    {
      return zw.a(afi.V);
    }
  };
  public static final yz c = new yz(1, "decorations")
  {
    public zw e()
    {
      return zw.a(afi.cF);
    }
    
    public int f()
    {
      return agi.b.f.a();
    }
  };
  public static final yz d = new yz(2, "redstone")
  {
    public zw e()
    {
      return zy.aC;
    }
  };
  public static final yz e = new yz(3, "transportation")
  {
    public zw e()
    {
      return zw.a(afi.D);
    }
  };
  public static final yz f = new yz(4, "misc")
  {
    public zw e()
    {
      return zy.ay;
    }
  }.a(new acj[] { acj.a });
  public static final yz g = new yz(5, "search")
  {
    public zw e()
    {
      return zy.aQ;
    }
  }.a("item_search.png");
  public static final yz h = new yz(6, "food")
  {
    public zw e()
    {
      return zy.e;
    }
  };
  public static final yz i = new yz(7, "tools")
  {
    public zw e()
    {
      return zy.c;
    }
  }.a(new acj[] { acj.h, acj.i, acj.j });
  public static final yz j = new yz(8, "combat")
  {
    public zw e()
    {
      return zy.B;
    }
  }.a(new acj[] { acj.b, acj.c, acj.f, acj.d, acj.e, acj.k, acj.g });
  public static final yz k = new yz(9, "brewing")
  {
    public zw e()
    {
      return zy.bz;
    }
  };
  public static final yz l = new yz(10, "materials")
  {
    public zw e()
    {
      return zy.y;
    }
  };
  public static final yz m = new yz(11, "inventory")
  {
    public zw e()
    {
      return zw.a(afi.ae);
    }
  }.a("inventory.png").k().i();
  private final int n;
  private final String o;
  private String p = "items.png";
  private boolean q = true;
  private boolean r = true;
  private acj[] s;
  private zx t;
  
  public yz(int ☃, String ☃)
  {
    n = ☃;
    o = ☃;
    
    a[☃] = this;
  }
  
  public int a()
  {
    return n;
  }
  
  public String b()
  {
    return o;
  }
  
  public String c()
  {
    return "itemGroup." + b();
  }
  
  public zx d()
  {
    if (t == null) {
      t = new zx(e(), 1, f());
    }
    return t;
  }
  
  public abstract zw e();
  
  public int f()
  {
    return 0;
  }
  
  public String g()
  {
    return p;
  }
  
  public yz a(String ☃)
  {
    p = ☃;
    return this;
  }
  
  public boolean h()
  {
    return r;
  }
  
  public yz i()
  {
    r = false;
    return this;
  }
  
  public boolean j()
  {
    return q;
  }
  
  public yz k()
  {
    q = false;
    return this;
  }
  
  public int l()
  {
    return n % 6;
  }
  
  public boolean m()
  {
    return n < 6;
  }
  
  public acj[] n()
  {
    return s;
  }
  
  public yz a(acj... ☃)
  {
    s = ☃;
    return this;
  }
  
  public boolean a(acj ☃)
  {
    if (s == null) {
      return false;
    }
    for (acj ☃ : s) {
      if (☃ == ☃) {
        return true;
      }
    }
    return false;
  }
  
  public void a(List<zx> ☃)
  {
    for (zw ☃ : zw.e) {
      if ((☃ != null) && 
        (☃.c() == this)) {
        ☃.a(☃, this, ☃);
      }
    }
    if (n() != null) {
      a(☃, n());
    }
  }
  
  public void a(List<zx> ☃, acj... ☃)
  {
    for (aci ☃ : aci.b) {
      if ((☃ != null) && (C != null))
      {
        boolean ☃ = false;
        for (int ☃ = 0; (☃ < ☃.length) && (!☃); ☃++) {
          if (C == ☃[☃]) {
            ☃ = true;
          }
        }
        if (☃) {
          ☃.add(zy.cd.a(new acl(☃, ☃.b())));
        }
      }
    }
  }
}
