import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aqp
{
  public static void a()
  {
    aqr.a(aqp.a.class, "SHCC");
    aqr.a(aqp.b.class, "SHFC");
    aqr.a(aqp.c.class, "SH5C");
    aqr.a(aqp.d.class, "SHLT");
    aqr.a(aqp.e.class, "SHLi");
    aqr.a(aqp.g.class, "SHPR");
    aqr.a(aqp.h.class, "SHPH");
    aqr.a(aqp.i.class, "SHRT");
    aqr.a(aqp.j.class, "SHRC");
    aqr.a(aqp.l.class, "SHSD");
    aqr.a(aqp.m.class, "SHStart");
    aqr.a(aqp.n.class, "SHS");
    aqr.a(aqp.o.class, "SHSSD");
  }
  
  static class f
  {
    public Class<? extends aqp.p> a;
    public final int b;
    public int c;
    public int d;
    
    public f(Class<? extends aqp.p> ☃, int ☃, int ☃)
    {
      a = ☃;
      b = ☃;
      d = ☃;
    }
    
    public boolean a(int ☃)
    {
      return (d == 0) || (c < d);
    }
    
    public boolean a()
    {
      return (d == 0) || (c < d);
    }
  }
  
  private static final aqp.f[] b = { new aqp.f(aqp.n.class, 40, 0), new aqp.f(aqp.h.class, 5, 5), new aqp.f(aqp.d.class, 20, 0), new aqp.f(aqp.i.class, 20, 0), new aqp.f(aqp.j.class, 10, 6), new aqp.f(aqp.o.class, 5, 5), new aqp.f(aqp.l.class, 5, 5), new aqp.f(aqp.c.class, 5, 4), new aqp.f(aqp.a.class, 5, 4), new aqp.f(aqp.e.class, 10, 2)new aqp.f
  {
    public boolean a(int ☃)
    {
      return (super.a(☃)) && (☃ > 4);
    }
  }, new aqp.f(aqp.g.class, 20, 1)
  {
    public boolean a(int ☃)
    {
      return (super.a(☃)) && (☃ > 5);
    }
  } };
  private static List<aqp.f> c;
  private static Class<? extends aqp.p> d;
  static int a;
  
  public static void b()
  {
    c = Lists.newArrayList();
    for (aqp.f ☃ : b)
    {
      c = 0;
      c.add(☃);
    }
    d = null;
  }
  
  private static boolean d()
  {
    boolean ☃ = false;
    a = 0;
    for (aqp.f ☃ : c)
    {
      if ((d > 0) && (c < d)) {
        ☃ = true;
      }
      a += b;
    }
    return ☃;
  }
  
  private static aqp.p a(Class<? extends aqp.p> ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqp.p ☃ = null;
    if (☃ == aqp.n.class) {
      ☃ = aqp.n.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    } else if (☃ == aqp.h.class) {
      ☃ = aqp.h.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    } else if (☃ == aqp.d.class) {
      ☃ = aqp.d.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    } else if (☃ == aqp.i.class) {
      ☃ = aqp.i.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    } else if (☃ == aqp.j.class) {
      ☃ = aqp.j.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    } else if (☃ == aqp.o.class) {
      ☃ = aqp.o.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    } else if (☃ == aqp.l.class) {
      ☃ = aqp.l.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    } else if (☃ == aqp.c.class) {
      ☃ = aqp.c.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    } else if (☃ == aqp.a.class) {
      ☃ = aqp.a.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    } else if (☃ == aqp.e.class) {
      ☃ = aqp.e.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    } else if (☃ == aqp.g.class) {
      ☃ = aqp.g.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
    return ☃;
  }
  
  private static aqp.p b(aqp.m ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    if (!d()) {
      return null;
    }
    if (d != null)
    {
      aqp.p ☃ = a(d, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
      d = null;
      if (☃ != null) {
        return ☃;
      }
    }
    int ☃ = 0;
    int ☃;
    while (☃ < 5)
    {
      ☃++;
      
      ☃ = ☃.nextInt(a);
      for (aqp.f ☃ : c)
      {
        ☃ -= b;
        if (☃ < 0)
        {
          if ((!☃.a(☃)) || (☃ == a)) {
            break;
          }
          aqp.p ☃ = a(a, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
          if (☃ != null)
          {
            c += 1;
            a = ☃;
            if (!☃.a()) {
              c.remove(☃);
            }
            return ☃;
          }
        }
      }
    }
    aqe ☃ = aqp.b.a(☃, ☃, ☃, ☃, ☃, ☃);
    if ((☃ != null) && (b > 1)) {
      return new aqp.b(☃, ☃, ☃, ☃);
    }
    return null;
  }
  
  private static aqt c(aqp.m ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    if (☃ > 50) {
      return null;
    }
    if ((Math.abs(☃ - ca) > 112) || (Math.abs(☃ - cc) > 112)) {
      return null;
    }
    aqt ☃ = b(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃ + 1);
    if (☃ != null)
    {
      ☃.add(☃);
      c.add(☃);
    }
    return ☃;
  }
  
  static abstract class p
    extends aqt
  {
    protected aqp.p.a d = aqp.p.a.a;
    
    public p() {}
    
    protected p(int ☃)
    {
      super();
    }
    
    protected void a(dn ☃)
    {
      ☃.a("EntryDoor", d.name());
    }
    
    protected void b(dn ☃)
    {
      d = aqp.p.a.valueOf(☃.j("EntryDoor"));
    }
    
    protected void a(adm ☃, Random ☃, aqe ☃, aqp.p.a ☃, int ☃, int ☃, int ☃)
    {
      switch (aqp.3.a[☃.ordinal()])
      {
      case 1: 
      default: 
        a(☃, ☃, ☃, ☃, ☃, ☃ + 3 - 1, ☃ + 3 - 1, ☃, afi.a.Q(), afi.a.Q(), false);
        break;
      case 2: 
        a(☃, afi.bf.Q(), ☃, ☃, ☃, ☃);
        a(☃, afi.bf.Q(), ☃, ☃ + 1, ☃, ☃);
        a(☃, afi.bf.Q(), ☃, ☃ + 2, ☃, ☃);
        a(☃, afi.bf.Q(), ☃ + 1, ☃ + 2, ☃, ☃);
        a(☃, afi.bf.Q(), ☃ + 2, ☃ + 2, ☃, ☃);
        a(☃, afi.bf.Q(), ☃ + 2, ☃ + 1, ☃, ☃);
        a(☃, afi.bf.Q(), ☃ + 2, ☃, ☃, ☃);
        a(☃, afi.ao.Q(), ☃ + 1, ☃, ☃, ☃);
        a(☃, afi.ao.a(8), ☃ + 1, ☃ + 1, ☃, ☃);
        break;
      case 3: 
        a(☃, afi.a.Q(), ☃ + 1, ☃, ☃, ☃);
        a(☃, afi.a.Q(), ☃ + 1, ☃ + 1, ☃, ☃);
        a(☃, afi.bi.Q(), ☃, ☃, ☃, ☃);
        a(☃, afi.bi.Q(), ☃, ☃ + 1, ☃, ☃);
        a(☃, afi.bi.Q(), ☃, ☃ + 2, ☃, ☃);
        a(☃, afi.bi.Q(), ☃ + 1, ☃ + 2, ☃, ☃);
        a(☃, afi.bi.Q(), ☃ + 2, ☃ + 2, ☃, ☃);
        a(☃, afi.bi.Q(), ☃ + 2, ☃ + 1, ☃, ☃);
        a(☃, afi.bi.Q(), ☃ + 2, ☃, ☃, ☃);
        break;
      case 4: 
        a(☃, afi.bf.Q(), ☃, ☃, ☃, ☃);
        a(☃, afi.bf.Q(), ☃, ☃ + 1, ☃, ☃);
        a(☃, afi.bf.Q(), ☃, ☃ + 2, ☃, ☃);
        a(☃, afi.bf.Q(), ☃ + 1, ☃ + 2, ☃, ☃);
        a(☃, afi.bf.Q(), ☃ + 2, ☃ + 2, ☃, ☃);
        a(☃, afi.bf.Q(), ☃ + 2, ☃ + 1, ☃, ☃);
        a(☃, afi.bf.Q(), ☃ + 2, ☃, ☃, ☃);
        a(☃, afi.aA.Q(), ☃ + 1, ☃, ☃, ☃);
        a(☃, afi.aA.a(8), ☃ + 1, ☃ + 1, ☃, ☃);
        a(☃, afi.aG.a(a(afi.aG, 4)), ☃ + 2, ☃ + 1, ☃ + 1, ☃);
        a(☃, afi.aG.a(a(afi.aG, 3)), ☃ + 2, ☃ + 1, ☃ - 1, ☃);
      }
    }
    
    protected aqp.p.a a(Random ☃)
    {
      int ☃ = ☃.nextInt(5);
      switch (☃)
      {
      case 0: 
      case 1: 
      default: 
        return aqp.p.a.a;
      case 2: 
        return aqp.p.a.b;
      case 3: 
        return aqp.p.a.c;
      }
      return aqp.p.a.d;
    }
    
    protected aqt a(aqp.m ☃, List<aqt> ☃, Random ☃, int ☃, int ☃)
    {
      if (m != null) {
        switch (aqp.3.b[m.ordinal()])
        {
        case 1: 
          return aqp.a(☃, ☃, ☃, l.a + ☃, l.b + ☃, l.c - 1, m, d());
        case 2: 
          return aqp.a(☃, ☃, ☃, l.a + ☃, l.b + ☃, l.f + 1, m, d());
        case 3: 
          return aqp.a(☃, ☃, ☃, l.a - 1, l.b + ☃, l.c + ☃, m, d());
        case 4: 
          return aqp.a(☃, ☃, ☃, l.d + 1, l.b + ☃, l.c + ☃, m, d());
        }
      }
      return null;
    }
    
    protected aqt b(aqp.m ☃, List<aqt> ☃, Random ☃, int ☃, int ☃)
    {
      if (m != null) {
        switch (aqp.3.b[m.ordinal()])
        {
        case 1: 
          return aqp.a(☃, ☃, ☃, l.a - 1, l.b + ☃, l.c + ☃, cq.e, d());
        case 2: 
          return aqp.a(☃, ☃, ☃, l.a - 1, l.b + ☃, l.c + ☃, cq.e, d());
        case 3: 
          return aqp.a(☃, ☃, ☃, l.a + ☃, l.b + ☃, l.c - 1, cq.c, d());
        case 4: 
          return aqp.a(☃, ☃, ☃, l.a + ☃, l.b + ☃, l.c - 1, cq.c, d());
        }
      }
      return null;
    }
    
    protected aqt c(aqp.m ☃, List<aqt> ☃, Random ☃, int ☃, int ☃)
    {
      if (m != null) {
        switch (aqp.3.b[m.ordinal()])
        {
        case 1: 
          return aqp.a(☃, ☃, ☃, l.d + 1, l.b + ☃, l.c + ☃, cq.f, d());
        case 2: 
          return aqp.a(☃, ☃, ☃, l.d + 1, l.b + ☃, l.c + ☃, cq.f, d());
        case 3: 
          return aqp.a(☃, ☃, ☃, l.a + ☃, l.b + ☃, l.f + 1, cq.d, d());
        case 4: 
          return aqp.a(☃, ☃, ☃, l.a + ☃, l.b + ☃, l.f + 1, cq.d, d());
        }
      }
      return null;
    }
    
    protected static boolean a(aqe ☃)
    {
      return (☃ != null) && (b > 10);
    }
    
    public static enum a
    {
      private a() {}
    }
  }
  
  public static class b
    extends aqp.p
  {
    private int a;
    
    public b() {}
    
    public b(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      m = ☃;
      l = ☃;
      a = ((☃ == cq.c) || (☃ == cq.d) ? ☃.e() : ☃.c());
    }
    
    protected void a(dn ☃)
    {
      super.a(☃);
      ☃.a("Steps", a);
    }
    
    protected void b(dn ☃)
    {
      super.b(☃);
      a = ☃.f("Steps");
    }
    
    public static aqe a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
    {
      int ☃ = 3;
      
      aqe ☃ = aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, 4, ☃);
      
      aqt ☃ = aqt.a(☃, ☃);
      if (☃ == null) {
        return null;
      }
      if (cb == b) {
        for (int ☃ = 3; ☃ >= 1; ☃--)
        {
          ☃ = aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, ☃ - 1, ☃);
          if (!☃.c().a(☃)) {
            return aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, ☃, ☃);
          }
        }
      }
      return null;
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      for (int ☃ = 0; ☃ < a; ☃++)
      {
        a(☃, afi.bf.Q(), 0, 0, ☃, ☃);
        a(☃, afi.bf.Q(), 1, 0, ☃, ☃);
        a(☃, afi.bf.Q(), 2, 0, ☃, ☃);
        a(☃, afi.bf.Q(), 3, 0, ☃, ☃);
        a(☃, afi.bf.Q(), 4, 0, ☃, ☃);
        for (int ☃ = 1; ☃ <= 3; ☃++)
        {
          a(☃, afi.bf.Q(), 0, ☃, ☃, ☃);
          a(☃, afi.a.Q(), 1, ☃, ☃, ☃);
          a(☃, afi.a.Q(), 2, ☃, ☃, ☃);
          a(☃, afi.a.Q(), 3, ☃, ☃, ☃);
          a(☃, afi.bf.Q(), 4, ☃, ☃, ☃);
        }
        a(☃, afi.bf.Q(), 0, 4, ☃, ☃);
        a(☃, afi.bf.Q(), 1, 4, ☃, ☃);
        a(☃, afi.bf.Q(), 2, 4, ☃, ☃);
        a(☃, afi.bf.Q(), 3, 4, ☃, ☃);
        a(☃, afi.bf.Q(), 4, 4, ☃, ☃);
      }
      return true;
    }
  }
  
  public static class l
    extends aqp.p
  {
    private boolean a;
    
    public l() {}
    
    public l(int ☃, Random ☃, int ☃, int ☃)
    {
      super();
      
      a = true;
      m = cq.c.a.a(☃);
      d = aqp.p.a.a;
      switch (aqp.3.b[m.ordinal()])
      {
      case 1: 
      case 2: 
        l = new aqe(☃, 64, ☃, ☃ + 5 - 1, 74, ☃ + 5 - 1);
        break;
      default: 
        l = new aqe(☃, 64, ☃, ☃ + 5 - 1, 74, ☃ + 5 - 1);
      }
    }
    
    public l(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      a = false;
      m = ☃;
      d = a(☃);
      l = ☃;
    }
    
    protected void a(dn ☃)
    {
      super.a(☃);
      ☃.a("Source", a);
    }
    
    protected void b(dn ☃)
    {
      super.b(☃);
      a = ☃.n("Source");
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      if (a) {
        aqp.a(aqp.c.class);
      }
      a((aqp.m)☃, ☃, ☃, 1, 1);
    }
    
    public static l a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
    {
      aqe ☃ = aqe.a(☃, ☃, ☃, -1, -7, 0, 5, 11, 5, ☃);
      if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
        return null;
      }
      return new l(☃, ☃, ☃, ☃);
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      a(☃, ☃, 0, 0, 0, 4, 10, 4, true, ☃, aqp.c());
      
      a(☃, ☃, ☃, d, 1, 7, 0);
      
      a(☃, ☃, ☃, aqp.p.a.a, 1, 1, 4);
      
      a(☃, afi.bf.Q(), 2, 6, 1, ☃);
      a(☃, afi.bf.Q(), 1, 5, 1, ☃);
      a(☃, afi.U.a(akb.a.a.a()), 1, 6, 1, ☃);
      a(☃, afi.bf.Q(), 1, 5, 2, ☃);
      a(☃, afi.bf.Q(), 1, 4, 3, ☃);
      a(☃, afi.U.a(akb.a.a.a()), 1, 5, 3, ☃);
      a(☃, afi.bf.Q(), 2, 4, 3, ☃);
      a(☃, afi.bf.Q(), 3, 3, 3, ☃);
      a(☃, afi.U.a(akb.a.a.a()), 3, 4, 3, ☃);
      a(☃, afi.bf.Q(), 3, 3, 2, ☃);
      a(☃, afi.bf.Q(), 3, 2, 1, ☃);
      a(☃, afi.U.a(akb.a.a.a()), 3, 3, 1, ☃);
      a(☃, afi.bf.Q(), 2, 2, 1, ☃);
      a(☃, afi.bf.Q(), 1, 1, 1, ☃);
      a(☃, afi.U.a(akb.a.a.a()), 1, 2, 1, ☃);
      a(☃, afi.bf.Q(), 1, 1, 2, ☃);
      a(☃, afi.U.a(akb.a.a.a()), 1, 1, 3, ☃);
      
      return true;
    }
  }
  
  public static class m
    extends aqp.l
  {
    public aqp.f a;
    public aqp.g b;
    public List<aqt> c = Lists.newArrayList();
    
    public m() {}
    
    public m(int ☃, Random ☃, int ☃, int ☃)
    {
      super(☃, ☃, ☃);
    }
    
    public cj a()
    {
      if (b != null) {
        return b.a();
      }
      return super.a();
    }
  }
  
  public static class n
    extends aqp.p
  {
    private boolean a;
    private boolean b;
    
    public n() {}
    
    public n(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      m = ☃;
      d = a(☃);
      l = ☃;
      
      a = (☃.nextInt(2) == 0);
      b = (☃.nextInt(2) == 0);
    }
    
    protected void a(dn ☃)
    {
      super.a(☃);
      ☃.a("Left", a);
      ☃.a("Right", b);
    }
    
    protected void b(dn ☃)
    {
      super.b(☃);
      a = ☃.n("Left");
      b = ☃.n("Right");
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      a((aqp.m)☃, ☃, ☃, 1, 1);
      if (a) {
        b((aqp.m)☃, ☃, ☃, 1, 2);
      }
      if (b) {
        c((aqp.m)☃, ☃, ☃, 1, 2);
      }
    }
    
    public static n a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
    {
      aqe ☃ = aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, 7, ☃);
      if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
        return null;
      }
      return new n(☃, ☃, ☃, ☃);
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      a(☃, ☃, 0, 0, 0, 4, 4, 6, true, ☃, aqp.c());
      
      a(☃, ☃, ☃, d, 1, 1, 0);
      
      a(☃, ☃, ☃, aqp.p.a.a, 1, 1, 6);
      
      a(☃, ☃, ☃, 0.1F, 1, 2, 1, afi.aa.Q());
      a(☃, ☃, ☃, 0.1F, 3, 2, 1, afi.aa.Q());
      a(☃, ☃, ☃, 0.1F, 1, 2, 5, afi.aa.Q());
      a(☃, ☃, ☃, 0.1F, 3, 2, 5, afi.aa.Q());
      if (a) {
        a(☃, ☃, 0, 1, 2, 0, 3, 4, afi.a.Q(), afi.a.Q(), false);
      }
      if (b) {
        a(☃, ☃, 4, 1, 2, 4, 3, 4, afi.a.Q(), afi.a.Q(), false);
      }
      return true;
    }
  }
  
  public static class a
    extends aqp.p
  {
    private static final List<ob> a = Lists.newArrayList(new ob[] { new ob(zy.bu, 0, 1, 1, 10), new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 5), new ob(zy.l, 0, 1, 1, 5), new ob(zy.Z, 0, 1, 1, 5), new ob(zy.Y, 0, 1, 1, 5), new ob(zy.aa, 0, 1, 1, 5), new ob(zy.ab, 0, 1, 1, 5), new ob(zy.ao, 0, 1, 1, 1), new ob(zy.aA, 0, 1, 1, 1), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
    private boolean b;
    
    public a() {}
    
    public a(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      m = ☃;
      d = a(☃);
      l = ☃;
    }
    
    protected void a(dn ☃)
    {
      super.a(☃);
      ☃.a("Chest", b);
    }
    
    protected void b(dn ☃)
    {
      super.b(☃);
      b = ☃.n("Chest");
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      a((aqp.m)☃, ☃, ☃, 1, 1);
    }
    
    public static a a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
    {
      aqe ☃ = aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, 7, ☃);
      if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
        return null;
      }
      return new a(☃, ☃, ☃, ☃);
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      a(☃, ☃, 0, 0, 0, 4, 4, 6, true, ☃, aqp.c());
      
      a(☃, ☃, ☃, d, 1, 1, 0);
      
      a(☃, ☃, ☃, aqp.p.a.a, 1, 1, 6);
      
      a(☃, ☃, 3, 1, 2, 3, 1, 4, afi.bf.Q(), afi.bf.Q(), false);
      a(☃, afi.U.a(akb.a.f.a()), 3, 1, 1, ☃);
      a(☃, afi.U.a(akb.a.f.a()), 3, 1, 5, ☃);
      a(☃, afi.U.a(akb.a.f.a()), 3, 2, 2, ☃);
      a(☃, afi.U.a(akb.a.f.a()), 3, 2, 4, ☃);
      for (int ☃ = 2; ☃ <= 4; ☃++) {
        a(☃, afi.U.a(akb.a.f.a()), 2, 1, ☃, ☃);
      }
      if ((!b) && 
        (☃.b(new cj(a(3, 3), d(2), b(3, 3)))))
      {
        b = true;
        a(☃, ☃, ☃, 3, 2, 3, ob.a(a, new ob[] { zy.cd.b(☃) }), 2 + ☃.nextInt(2));
      }
      return true;
    }
  }
  
  public static class o
    extends aqp.p
  {
    public o() {}
    
    public o(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      m = ☃;
      d = a(☃);
      l = ☃;
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      a((aqp.m)☃, ☃, ☃, 1, 1);
    }
    
    public static o a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
    {
      aqe ☃ = aqe.a(☃, ☃, ☃, -1, -7, 0, 5, 11, 8, ☃);
      if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
        return null;
      }
      return new o(☃, ☃, ☃, ☃);
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      a(☃, ☃, 0, 0, 0, 4, 10, 7, true, ☃, aqp.c());
      
      a(☃, ☃, ☃, d, 1, 7, 0);
      
      a(☃, ☃, ☃, aqp.p.a.a, 1, 1, 7);
      
      int ☃ = a(afi.aw, 2);
      for (int ☃ = 0; ☃ < 6; ☃++)
      {
        a(☃, afi.aw.a(☃), 1, 6 - ☃, 1 + ☃, ☃);
        a(☃, afi.aw.a(☃), 2, 6 - ☃, 1 + ☃, ☃);
        a(☃, afi.aw.a(☃), 3, 6 - ☃, 1 + ☃, ☃);
        if (☃ < 5)
        {
          a(☃, afi.bf.Q(), 1, 5 - ☃, 1 + ☃, ☃);
          a(☃, afi.bf.Q(), 2, 5 - ☃, 1 + ☃, ☃);
          a(☃, afi.bf.Q(), 3, 5 - ☃, 1 + ☃, ☃);
        }
      }
      return true;
    }
  }
  
  public static class d
    extends aqp.p
  {
    public d() {}
    
    public d(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      m = ☃;
      d = a(☃);
      l = ☃;
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      if ((m == cq.c) || (m == cq.f)) {
        b((aqp.m)☃, ☃, ☃, 1, 1);
      } else {
        c((aqp.m)☃, ☃, ☃, 1, 1);
      }
    }
    
    public static d a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
    {
      aqe ☃ = aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, 5, ☃);
      if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
        return null;
      }
      return new d(☃, ☃, ☃, ☃);
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      a(☃, ☃, 0, 0, 0, 4, 4, 4, true, ☃, aqp.c());
      
      a(☃, ☃, ☃, d, 1, 1, 0);
      if ((m == cq.c) || (m == cq.f)) {
        a(☃, ☃, 0, 1, 1, 0, 3, 3, afi.a.Q(), afi.a.Q(), false);
      } else {
        a(☃, ☃, 4, 1, 1, 4, 3, 3, afi.a.Q(), afi.a.Q(), false);
      }
      return true;
    }
  }
  
  public static class i
    extends aqp.d
  {
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      if ((m == cq.c) || (m == cq.f)) {
        c((aqp.m)☃, ☃, ☃, 1, 1);
      } else {
        b((aqp.m)☃, ☃, ☃, 1, 1);
      }
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      a(☃, ☃, 0, 0, 0, 4, 4, 4, true, ☃, aqp.c());
      
      a(☃, ☃, ☃, d, 1, 1, 0);
      if ((m == cq.c) || (m == cq.f)) {
        a(☃, ☃, 4, 1, 1, 4, 3, 3, afi.a.Q(), afi.a.Q(), false);
      } else {
        a(☃, ☃, 0, 1, 1, 0, 3, 3, afi.a.Q(), afi.a.Q(), false);
      }
      return true;
    }
  }
  
  public static class j
    extends aqp.p
  {
    private static final List<ob> b = Lists.newArrayList(new ob[] { new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.h, 0, 3, 8, 10), new ob(zy.P, 0, 1, 3, 15), new ob(zy.e, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 1) });
    protected int a;
    
    public j() {}
    
    public j(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      m = ☃;
      d = a(☃);
      l = ☃;
      a = ☃.nextInt(5);
    }
    
    protected void a(dn ☃)
    {
      super.a(☃);
      ☃.a("Type", a);
    }
    
    protected void b(dn ☃)
    {
      super.b(☃);
      a = ☃.f("Type");
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      a((aqp.m)☃, ☃, ☃, 4, 1);
      b((aqp.m)☃, ☃, ☃, 1, 4);
      c((aqp.m)☃, ☃, ☃, 1, 4);
    }
    
    public static j a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
    {
      aqe ☃ = aqe.a(☃, ☃, ☃, -4, -1, 0, 11, 7, 11, ☃);
      if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
        return null;
      }
      return new j(☃, ☃, ☃, ☃);
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      a(☃, ☃, 0, 0, 0, 10, 6, 10, true, ☃, aqp.c());
      
      a(☃, ☃, ☃, d, 4, 1, 0);
      
      a(☃, ☃, 4, 1, 10, 6, 3, 10, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, 0, 1, 4, 0, 3, 6, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, 10, 1, 4, 10, 3, 6, afi.a.Q(), afi.a.Q(), false);
      switch (a)
      {
      default: 
        break;
      case 0: 
        a(☃, afi.bf.Q(), 5, 1, 5, ☃);
        a(☃, afi.bf.Q(), 5, 2, 5, ☃);
        a(☃, afi.bf.Q(), 5, 3, 5, ☃);
        a(☃, afi.aa.Q(), 4, 3, 5, ☃);
        a(☃, afi.aa.Q(), 6, 3, 5, ☃);
        a(☃, afi.aa.Q(), 5, 3, 4, ☃);
        a(☃, afi.aa.Q(), 5, 3, 6, ☃);
        a(☃, afi.U.Q(), 4, 1, 4, ☃);
        a(☃, afi.U.Q(), 4, 1, 5, ☃);
        a(☃, afi.U.Q(), 4, 1, 6, ☃);
        a(☃, afi.U.Q(), 6, 1, 4, ☃);
        a(☃, afi.U.Q(), 6, 1, 5, ☃);
        a(☃, afi.U.Q(), 6, 1, 6, ☃);
        a(☃, afi.U.Q(), 5, 1, 4, ☃);
        a(☃, afi.U.Q(), 5, 1, 6, ☃);
        break;
      case 1: 
        for (int ☃ = 0; ☃ < 5; ☃++)
        {
          a(☃, afi.bf.Q(), 3, 1, 3 + ☃, ☃);
          a(☃, afi.bf.Q(), 7, 1, 3 + ☃, ☃);
          a(☃, afi.bf.Q(), 3 + ☃, 1, 3, ☃);
          a(☃, afi.bf.Q(), 3 + ☃, 1, 7, ☃);
        }
        a(☃, afi.bf.Q(), 5, 1, 5, ☃);
        a(☃, afi.bf.Q(), 5, 2, 5, ☃);
        a(☃, afi.bf.Q(), 5, 3, 5, ☃);
        a(☃, afi.i.Q(), 5, 4, 5, ☃);
        break;
      case 2: 
        for (int ☃ = 1; ☃ <= 9; ☃++)
        {
          a(☃, afi.e.Q(), 1, 3, ☃, ☃);
          a(☃, afi.e.Q(), 9, 3, ☃, ☃);
        }
        for (int ☃ = 1; ☃ <= 9; ☃++)
        {
          a(☃, afi.e.Q(), ☃, 3, 1, ☃);
          a(☃, afi.e.Q(), ☃, 3, 9, ☃);
        }
        a(☃, afi.e.Q(), 5, 1, 4, ☃);
        a(☃, afi.e.Q(), 5, 1, 6, ☃);
        a(☃, afi.e.Q(), 5, 3, 4, ☃);
        a(☃, afi.e.Q(), 5, 3, 6, ☃);
        a(☃, afi.e.Q(), 4, 1, 5, ☃);
        a(☃, afi.e.Q(), 6, 1, 5, ☃);
        a(☃, afi.e.Q(), 4, 3, 5, ☃);
        a(☃, afi.e.Q(), 6, 3, 5, ☃);
        for (int ☃ = 1; ☃ <= 3; ☃++)
        {
          a(☃, afi.e.Q(), 4, ☃, 4, ☃);
          a(☃, afi.e.Q(), 6, ☃, 4, ☃);
          a(☃, afi.e.Q(), 4, ☃, 6, ☃);
          a(☃, afi.e.Q(), 6, ☃, 6, ☃);
        }
        a(☃, afi.aa.Q(), 5, 3, 5, ☃);
        for (int ☃ = 2; ☃ <= 8; ☃++)
        {
          a(☃, afi.f.Q(), 2, 3, ☃, ☃);
          a(☃, afi.f.Q(), 3, 3, ☃, ☃);
          if ((☃ <= 3) || (☃ >= 7))
          {
            a(☃, afi.f.Q(), 4, 3, ☃, ☃);
            a(☃, afi.f.Q(), 5, 3, ☃, ☃);
            a(☃, afi.f.Q(), 6, 3, ☃, ☃);
          }
          a(☃, afi.f.Q(), 7, 3, ☃, ☃);
          a(☃, afi.f.Q(), 8, 3, ☃, ☃);
        }
        a(☃, afi.au.a(a(afi.au, cq.e.a())), 9, 1, 3, ☃);
        a(☃, afi.au.a(a(afi.au, cq.e.a())), 9, 2, 3, ☃);
        a(☃, afi.au.a(a(afi.au, cq.e.a())), 9, 3, 3, ☃);
        
        a(☃, ☃, ☃, 3, 4, 8, ob.a(b, new ob[] { zy.cd.b(☃) }), 1 + ☃.nextInt(4));
      }
      return true;
    }
  }
  
  public static class h
    extends aqp.p
  {
    public h() {}
    
    public h(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      m = ☃;
      d = a(☃);
      l = ☃;
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      a((aqp.m)☃, ☃, ☃, 1, 1);
    }
    
    public static h a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
    {
      aqe ☃ = aqe.a(☃, ☃, ☃, -1, -1, 0, 9, 5, 11, ☃);
      if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
        return null;
      }
      return new h(☃, ☃, ☃, ☃);
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      a(☃, ☃, 0, 0, 0, 8, 4, 10, true, ☃, aqp.c());
      
      a(☃, ☃, ☃, d, 1, 1, 0);
      
      a(☃, ☃, 1, 1, 10, 3, 3, 10, afi.a.Q(), afi.a.Q(), false);
      
      a(☃, ☃, 4, 1, 1, 4, 3, 1, false, ☃, aqp.c());
      a(☃, ☃, 4, 1, 3, 4, 3, 3, false, ☃, aqp.c());
      a(☃, ☃, 4, 1, 7, 4, 3, 7, false, ☃, aqp.c());
      a(☃, ☃, 4, 1, 9, 4, 3, 9, false, ☃, aqp.c());
      
      a(☃, ☃, 4, 1, 4, 4, 3, 6, afi.bi.Q(), afi.bi.Q(), false);
      a(☃, ☃, 5, 1, 5, 7, 3, 5, afi.bi.Q(), afi.bi.Q(), false);
      
      a(☃, afi.bi.Q(), 4, 3, 2, ☃);
      a(☃, afi.bi.Q(), 4, 3, 8, ☃);
      a(☃, afi.aA.a(a(afi.aA, 3)), 4, 1, 2, ☃);
      a(☃, afi.aA.a(a(afi.aA, 3) + 8), 4, 2, 2, ☃);
      a(☃, afi.aA.a(a(afi.aA, 3)), 4, 1, 8, ☃);
      a(☃, afi.aA.a(a(afi.aA, 3) + 8), 4, 2, 8, ☃);
      
      return true;
    }
  }
  
  public static class e
    extends aqp.p
  {
    private static final List<ob> a = Lists.newArrayList(new ob[] { new ob(zy.aL, 0, 1, 3, 20), new ob(zy.aK, 0, 2, 7, 20), new ob(zy.bV, 0, 1, 1, 1), new ob(zy.aQ, 0, 1, 1, 1) });
    private boolean b;
    
    public e() {}
    
    public e(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      m = ☃;
      d = a(☃);
      l = ☃;
      b = (☃.d() > 6);
    }
    
    protected void a(dn ☃)
    {
      super.a(☃);
      ☃.a("Tall", b);
    }
    
    protected void b(dn ☃)
    {
      super.b(☃);
      b = ☃.n("Tall");
    }
    
    public static e a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
    {
      aqe ☃ = aqe.a(☃, ☃, ☃, -4, -1, 0, 14, 11, 15, ☃);
      if ((!a(☃)) || (aqt.a(☃, ☃) != null))
      {
        ☃ = aqe.a(☃, ☃, ☃, -4, -1, 0, 14, 6, 15, ☃);
        if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
          return null;
        }
      }
      return new e(☃, ☃, ☃, ☃);
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      int ☃ = 11;
      if (!b) {
        ☃ = 6;
      }
      a(☃, ☃, 0, 0, 0, 13, ☃ - 1, 14, true, ☃, aqp.c());
      
      a(☃, ☃, ☃, d, 4, 1, 0);
      
      a(☃, ☃, ☃, 0.07F, 2, 1, 1, 11, 4, 13, afi.G.Q(), afi.G.Q(), false);
      
      int ☃ = 1;
      int ☃ = 12;
      for (int ☃ = 1; ☃ <= 13; ☃++) {
        if ((☃ - 1) % 4 == 0)
        {
          a(☃, ☃, 1, 1, ☃, 1, 4, ☃, afi.f.Q(), afi.f.Q(), false);
          a(☃, ☃, 12, 1, ☃, 12, 4, ☃, afi.f.Q(), afi.f.Q(), false);
          
          a(☃, afi.aa.Q(), 2, 3, ☃, ☃);
          a(☃, afi.aa.Q(), 11, 3, ☃, ☃);
          if (b)
          {
            a(☃, ☃, 1, 6, ☃, 1, 9, ☃, afi.f.Q(), afi.f.Q(), false);
            a(☃, ☃, 12, 6, ☃, 12, 9, ☃, afi.f.Q(), afi.f.Q(), false);
          }
        }
        else
        {
          a(☃, ☃, 1, 1, ☃, 1, 4, ☃, afi.X.Q(), afi.X.Q(), false);
          a(☃, ☃, 12, 1, ☃, 12, 4, ☃, afi.X.Q(), afi.X.Q(), false);
          if (b)
          {
            a(☃, ☃, 1, 6, ☃, 1, 9, ☃, afi.X.Q(), afi.X.Q(), false);
            a(☃, ☃, 12, 6, ☃, 12, 9, ☃, afi.X.Q(), afi.X.Q(), false);
          }
        }
      }
      for (int ☃ = 3; ☃ < 12; ☃ += 2)
      {
        a(☃, ☃, 3, 1, ☃, 4, 3, ☃, afi.X.Q(), afi.X.Q(), false);
        a(☃, ☃, 6, 1, ☃, 7, 3, ☃, afi.X.Q(), afi.X.Q(), false);
        a(☃, ☃, 9, 1, ☃, 10, 3, ☃, afi.X.Q(), afi.X.Q(), false);
      }
      if (b)
      {
        a(☃, ☃, 1, 5, 1, 3, 5, 13, afi.f.Q(), afi.f.Q(), false);
        a(☃, ☃, 10, 5, 1, 12, 5, 13, afi.f.Q(), afi.f.Q(), false);
        a(☃, ☃, 4, 5, 1, 9, 5, 2, afi.f.Q(), afi.f.Q(), false);
        a(☃, ☃, 4, 5, 12, 9, 5, 13, afi.f.Q(), afi.f.Q(), false);
        
        a(☃, afi.f.Q(), 9, 5, 11, ☃);
        a(☃, afi.f.Q(), 8, 5, 11, ☃);
        a(☃, afi.f.Q(), 9, 5, 10, ☃);
        
        a(☃, ☃, 3, 6, 2, 3, 6, 12, afi.aO.Q(), afi.aO.Q(), false);
        a(☃, ☃, 10, 6, 2, 10, 6, 10, afi.aO.Q(), afi.aO.Q(), false);
        a(☃, ☃, 4, 6, 2, 9, 6, 2, afi.aO.Q(), afi.aO.Q(), false);
        a(☃, ☃, 4, 6, 12, 8, 6, 12, afi.aO.Q(), afi.aO.Q(), false);
        a(☃, afi.aO.Q(), 9, 6, 11, ☃);
        a(☃, afi.aO.Q(), 8, 6, 11, ☃);
        a(☃, afi.aO.Q(), 9, 6, 10, ☃);
        
        int ☃ = a(afi.au, 3);
        a(☃, afi.au.a(☃), 10, 1, 13, ☃);
        a(☃, afi.au.a(☃), 10, 2, 13, ☃);
        a(☃, afi.au.a(☃), 10, 3, 13, ☃);
        a(☃, afi.au.a(☃), 10, 4, 13, ☃);
        a(☃, afi.au.a(☃), 10, 5, 13, ☃);
        a(☃, afi.au.a(☃), 10, 6, 13, ☃);
        a(☃, afi.au.a(☃), 10, 7, 13, ☃);
        
        int ☃ = 7;
        int ☃ = 7;
        a(☃, afi.aO.Q(), ☃ - 1, 9, ☃, ☃);
        a(☃, afi.aO.Q(), ☃, 9, ☃, ☃);
        a(☃, afi.aO.Q(), ☃ - 1, 8, ☃, ☃);
        a(☃, afi.aO.Q(), ☃, 8, ☃, ☃);
        a(☃, afi.aO.Q(), ☃ - 1, 7, ☃, ☃);
        a(☃, afi.aO.Q(), ☃, 7, ☃, ☃);
        
        a(☃, afi.aO.Q(), ☃ - 2, 7, ☃, ☃);
        a(☃, afi.aO.Q(), ☃ + 1, 7, ☃, ☃);
        a(☃, afi.aO.Q(), ☃ - 1, 7, ☃ - 1, ☃);
        a(☃, afi.aO.Q(), ☃ - 1, 7, ☃ + 1, ☃);
        a(☃, afi.aO.Q(), ☃, 7, ☃ - 1, ☃);
        a(☃, afi.aO.Q(), ☃, 7, ☃ + 1, ☃);
        
        a(☃, afi.aa.Q(), ☃ - 2, 8, ☃, ☃);
        a(☃, afi.aa.Q(), ☃ + 1, 8, ☃, ☃);
        a(☃, afi.aa.Q(), ☃ - 1, 8, ☃ - 1, ☃);
        a(☃, afi.aa.Q(), ☃ - 1, 8, ☃ + 1, ☃);
        a(☃, afi.aa.Q(), ☃, 8, ☃ - 1, ☃);
        a(☃, afi.aa.Q(), ☃, 8, ☃ + 1, ☃);
      }
      a(☃, ☃, ☃, 3, 3, 5, ob.a(a, new ob[] { zy.cd.a(☃, 1, 5, 2) }), 1 + ☃.nextInt(4));
      if (b)
      {
        a(☃, afi.a.Q(), 12, 9, 1, ☃);
        a(☃, ☃, ☃, 12, 8, 1, ob.a(a, new ob[] { zy.cd.a(☃, 1, 5, 2) }), 1 + ☃.nextInt(4));
      }
      return true;
    }
  }
  
  public static class c
    extends aqp.p
  {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean e;
    
    public c() {}
    
    public c(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      m = ☃;
      d = a(☃);
      l = ☃;
      
      a = ☃.nextBoolean();
      b = ☃.nextBoolean();
      c = ☃.nextBoolean();
      e = (☃.nextInt(3) > 0);
    }
    
    protected void a(dn ☃)
    {
      super.a(☃);
      ☃.a("leftLow", a);
      ☃.a("leftHigh", b);
      ☃.a("rightLow", c);
      ☃.a("rightHigh", e);
    }
    
    protected void b(dn ☃)
    {
      super.b(☃);
      a = ☃.n("leftLow");
      b = ☃.n("leftHigh");
      c = ☃.n("rightLow");
      e = ☃.n("rightHigh");
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      int ☃ = 3;
      int ☃ = 5;
      if ((m == cq.e) || (m == cq.c))
      {
        ☃ = 8 - ☃;
        ☃ = 8 - ☃;
      }
      a((aqp.m)☃, ☃, ☃, 5, 1);
      if (a) {
        b((aqp.m)☃, ☃, ☃, ☃, 1);
      }
      if (b) {
        b((aqp.m)☃, ☃, ☃, ☃, 7);
      }
      if (c) {
        c((aqp.m)☃, ☃, ☃, ☃, 1);
      }
      if (e) {
        c((aqp.m)☃, ☃, ☃, ☃, 7);
      }
    }
    
    public static c a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
    {
      aqe ☃ = aqe.a(☃, ☃, ☃, -4, -3, 0, 10, 9, 11, ☃);
      if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
        return null;
      }
      return new c(☃, ☃, ☃, ☃);
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      a(☃, ☃, 0, 0, 0, 9, 8, 10, true, ☃, aqp.c());
      
      a(☃, ☃, ☃, d, 4, 3, 0);
      if (a) {
        a(☃, ☃, 0, 3, 1, 0, 5, 3, afi.a.Q(), afi.a.Q(), false);
      }
      if (c) {
        a(☃, ☃, 9, 3, 1, 9, 5, 3, afi.a.Q(), afi.a.Q(), false);
      }
      if (b) {
        a(☃, ☃, 0, 5, 7, 0, 7, 9, afi.a.Q(), afi.a.Q(), false);
      }
      if (e) {
        a(☃, ☃, 9, 5, 7, 9, 7, 9, afi.a.Q(), afi.a.Q(), false);
      }
      a(☃, ☃, 5, 1, 10, 7, 3, 10, afi.a.Q(), afi.a.Q(), false);
      
      a(☃, ☃, 1, 2, 1, 8, 2, 6, false, ☃, aqp.c());
      
      a(☃, ☃, 4, 1, 5, 4, 4, 9, false, ☃, aqp.c());
      a(☃, ☃, 8, 1, 5, 8, 4, 9, false, ☃, aqp.c());
      
      a(☃, ☃, 1, 4, 7, 3, 4, 9, false, ☃, aqp.c());
      
      a(☃, ☃, 1, 3, 5, 3, 3, 6, false, ☃, aqp.c());
      a(☃, ☃, 1, 3, 4, 3, 3, 4, afi.U.Q(), afi.U.Q(), false);
      a(☃, ☃, 1, 4, 6, 3, 4, 6, afi.U.Q(), afi.U.Q(), false);
      
      a(☃, ☃, 5, 1, 7, 7, 1, 8, false, ☃, aqp.c());
      a(☃, ☃, 5, 1, 9, 7, 1, 9, afi.U.Q(), afi.U.Q(), false);
      a(☃, ☃, 5, 2, 7, 7, 2, 7, afi.U.Q(), afi.U.Q(), false);
      
      a(☃, ☃, 4, 5, 7, 4, 5, 9, afi.U.Q(), afi.U.Q(), false);
      a(☃, ☃, 8, 5, 7, 8, 5, 9, afi.U.Q(), afi.U.Q(), false);
      a(☃, ☃, 5, 5, 7, 7, 5, 9, afi.T.Q(), afi.T.Q(), false);
      a(☃, afi.aa.Q(), 6, 5, 6, ☃);
      
      return true;
    }
  }
  
  public static class g
    extends aqp.p
  {
    private boolean a;
    
    public g() {}
    
    public g(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      m = ☃;
      l = ☃;
    }
    
    protected void a(dn ☃)
    {
      super.a(☃);
      ☃.a("Mob", a);
    }
    
    protected void b(dn ☃)
    {
      super.b(☃);
      a = ☃.n("Mob");
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      if (☃ != null) {
        b = this;
      }
    }
    
    public static g a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
    {
      aqe ☃ = aqe.a(☃, ☃, ☃, -4, -1, 0, 11, 8, 16, ☃);
      if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
        return null;
      }
      return new g(☃, ☃, ☃, ☃);
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      a(☃, ☃, 0, 0, 0, 10, 7, 15, false, ☃, aqp.c());
      
      a(☃, ☃, ☃, aqp.p.a.c, 4, 1, 0);
      
      int ☃ = 6;
      a(☃, ☃, 1, ☃, 1, 1, ☃, 14, false, ☃, aqp.c());
      a(☃, ☃, 9, ☃, 1, 9, ☃, 14, false, ☃, aqp.c());
      a(☃, ☃, 2, ☃, 1, 8, ☃, 2, false, ☃, aqp.c());
      a(☃, ☃, 2, ☃, 14, 8, ☃, 14, false, ☃, aqp.c());
      
      a(☃, ☃, 1, 1, 1, 2, 1, 4, false, ☃, aqp.c());
      a(☃, ☃, 8, 1, 1, 9, 1, 4, false, ☃, aqp.c());
      a(☃, ☃, 1, 1, 1, 1, 1, 3, afi.k.Q(), afi.k.Q(), false);
      a(☃, ☃, 9, 1, 1, 9, 1, 3, afi.k.Q(), afi.k.Q(), false);
      
      a(☃, ☃, 3, 1, 8, 7, 1, 12, false, ☃, aqp.c());
      a(☃, ☃, 4, 1, 9, 6, 1, 11, afi.k.Q(), afi.k.Q(), false);
      for (int ☃ = 3; ☃ < 14; ☃ += 2)
      {
        a(☃, ☃, 0, 3, ☃, 0, 4, ☃, afi.bi.Q(), afi.bi.Q(), false);
        a(☃, ☃, 10, 3, ☃, 10, 4, ☃, afi.bi.Q(), afi.bi.Q(), false);
      }
      for (int ☃ = 2; ☃ < 9; ☃ += 2) {
        a(☃, ☃, ☃, 3, 15, ☃, 4, 15, afi.bi.Q(), afi.bi.Q(), false);
      }
      int ☃ = a(afi.bv, 3);
      a(☃, ☃, 4, 1, 5, 6, 1, 7, false, ☃, aqp.c());
      a(☃, ☃, 4, 2, 6, 6, 2, 7, false, ☃, aqp.c());
      a(☃, ☃, 4, 3, 7, 6, 3, 7, false, ☃, aqp.c());
      for (int ☃ = 4; ☃ <= 6; ☃++)
      {
        a(☃, afi.bv.a(☃), ☃, 1, 4, ☃);
        a(☃, afi.bv.a(☃), ☃, 2, 5, ☃);
        a(☃, afi.bv.a(☃), ☃, 3, 6, ☃);
      }
      int ☃ = cq.c.b();
      int ☃ = cq.d.b();
      int ☃ = cq.f.b();
      int ☃ = cq.e.b();
      if (m != null) {
        switch (aqp.3.b[m.ordinal()])
        {
        case 2: 
          ☃ = cq.d.b();
          ☃ = cq.c.b();
          break;
        case 4: 
          ☃ = cq.f.b();
          ☃ = cq.e.b();
          ☃ = cq.d.b();
          ☃ = cq.c.b();
          break;
        case 3: 
          ☃ = cq.e.b();
          ☃ = cq.f.b();
          ☃ = cq.d.b();
          ☃ = cq.c.b();
        }
      }
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 4, 3, 8, ☃);
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 5, 3, 8, ☃);
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 6, 3, 8, ☃);
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 4, 3, 12, ☃);
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 5, 3, 12, ☃);
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 6, 3, 12, ☃);
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 3, 3, 9, ☃);
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 3, 3, 10, ☃);
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 3, 3, 11, ☃);
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 7, 3, 9, ☃);
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 7, 3, 10, ☃);
      a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 7, 3, 11, ☃);
      if (!a)
      {
        ☃ = d(3);
        cj ☃ = new cj(a(5, 6), ☃, b(5, 6));
        if (☃.b(☃))
        {
          a = true;
          ☃.a(☃, afi.ac.Q(), 2);
          
          akw ☃ = ☃.s(☃);
          if ((☃ instanceof all)) {
            ((all)☃).b().a("Silverfish");
          }
        }
      }
      return true;
    }
  }
  
  static class k
    extends aqt.a
  {
    public void a(Random ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      if (☃)
      {
        float ☃ = ☃.nextFloat();
        if (☃ < 0.2F) {
          a = afi.bf.a(ajz.O);
        } else if (☃ < 0.5F) {
          a = afi.bf.a(ajz.N);
        } else if (☃ < 0.55F) {
          a = afi.be.a(ahz.a.c.a());
        } else {
          a = afi.bf.Q();
        }
      }
      else
      {
        a = afi.a.Q();
      }
    }
  }
  
  private static final aqp.k e = new aqp.k(null);
}
