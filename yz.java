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
  
  public yz(int index, String label)
  {
    this.n = index;
    this.o = label;
    a[index] = this;
  }
  
  public int a()
  {
    return this.n;
  }
  
  public String b()
  {
    return this.o;
  }
  
  public String c()
  {
    return "itemGroup." + b();
  }
  
  public zx d()
  {
    if (this.t == null) {
      this.t = new zx(e(), 1, f());
    }
    return this.t;
  }
  
  public abstract zw e();
  
  public int f()
  {
    return 0;
  }
  
  public String g()
  {
    return this.p;
  }
  
  public yz a(String texture)
  {
    this.p = texture;
    return this;
  }
  
  public boolean h()
  {
    return this.r;
  }
  
  public yz i()
  {
    this.r = false;
    return this;
  }
  
  public boolean j()
  {
    return this.q;
  }
  
  public yz k()
  {
    this.q = false;
    return this;
  }
  
  public int l()
  {
    return this.n % 6;
  }
  
  public boolean m()
  {
    return this.n < 6;
  }
  
  public acj[] n()
  {
    return this.s;
  }
  
  public yz a(acj... types)
  {
    this.s = types;
    return this;
  }
  
  public boolean a(acj enchantmentType)
  {
    if (this.s == null) {
      return false;
    }
    for (acj enumenchantmenttype : this.s) {
      if (enumenchantmenttype == enchantmentType) {
        return true;
      }
    }
    return false;
  }
  
  public void a(List<zx> p_78018_1_)
  {
    for (zw item : zw.e) {
      if ((item != null) && (item.c() == this)) {
        item.a(item, this, p_78018_1_);
      }
    }
    if (n() != null) {
      a(p_78018_1_, n());
    }
  }
  
  public void a(List<zx> itemList, acj... enchantmentType)
  {
    for (aci enchantment : aci.b) {
      if ((enchantment != null) && (enchantment.C != null))
      {
        boolean flag = false;
        for (int i = 0; (i < enchantmentType.length) && (!flag); i++) {
          if (enchantment.C == enchantmentType[i]) {
            flag = true;
          }
        }
        if (flag) {
          itemList.add(zy.cd.a(new acl(enchantment, enchantment.b())));
        }
      }
    }
  }
}
