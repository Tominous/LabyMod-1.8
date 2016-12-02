import java.util.List;
import java.util.Random;

abstract class aqp$p
  extends aqt
{
  protected aqp.p.a d = aqp.p.a.a;
  
  public aqp$p() {}
  
  protected aqp$p(int ☃)
  {
    super(☃);
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
