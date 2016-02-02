import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

abstract class aqj$m
  extends aqt
{
  protected static final List<ob> a = Lists.newArrayList(new ob[] { new ob(zy.i, 0, 1, 3, 5), new ob(zy.j, 0, 1, 5, 5), new ob(zy.k, 0, 1, 3, 15), new ob(zy.B, 0, 1, 1, 5), new ob(zy.ah, 0, 1, 1, 5), new ob(zy.d, 0, 1, 1, 5), new ob(zy.by, 0, 3, 7, 5), new ob(zy.aA, 0, 1, 1, 10), new ob(zy.cl, 0, 1, 1, 8), new ob(zy.ck, 0, 1, 1, 5), new ob(zy.cm, 0, 1, 1, 3), new ob(zw.a(afi.Z), 0, 2, 4, 2) });
  
  public aqj$m() {}
  
  protected aqj$m(int ☃)
  {
    super(☃);
  }
  
  protected void b(dn ☃) {}
  
  protected void a(dn ☃) {}
  
  private int a(List<aqj.n> ☃)
  {
    boolean ☃ = false;
    int ☃ = 0;
    for (aqj.n ☃ : ☃)
    {
      if ((☃.d > 0) && (☃.c < ☃.d)) {
        ☃ = true;
      }
      ☃ += ☃.b;
    }
    return ☃ ? ☃ : -1;
  }
  
  private m a(aqj.q ☃, List<aqj.n> ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    int ☃ = a(☃);
    boolean ☃ = (☃ > 0) && (☃ <= 30);
    
    int ☃ = 0;
    int ☃;
    while ((☃ < 5) && (☃))
    {
      ☃++;
      
      ☃ = ☃.nextInt(☃);
      for (aqj.n ☃ : ☃)
      {
        ☃ -= ☃.b;
        if (☃ < 0)
        {
          if ((!☃.a(☃)) || ((☃ == ☃.b) && (!☃.e))) {
            break;
          }
          m ☃ = aqj.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
          if (☃ != null)
          {
            ☃.c += 1;
            ☃.b = ☃;
            if (!☃.a()) {
              ☃.remove(☃);
            }
            return ☃;
          }
        }
      }
    }
    return aqj.b.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  private aqt a(aqj.q ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃, boolean ☃)
  {
    if ((Math.abs(☃ - ☃.c().a) > 112) || (Math.abs(☃ - ☃.c().c) > 112)) {
      return aqj.b.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
    List<aqj.n> ☃ = ☃.c;
    if (☃) {
      ☃ = ☃.d;
    }
    aqt ☃ = a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃ + 1);
    if (☃ != null)
    {
      ☃.add(☃);
      ☃.e.add(☃);
    }
    return ☃;
  }
  
  protected aqt a(aqj.q ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, boolean ☃)
  {
    if (this.m != null) {
      switch (aqj.1.a[this.m.ordinal()])
      {
      case 1: 
        return a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃, this.l.c - 1, this.m, d(), ☃);
      case 2: 
        return a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃, this.l.f + 1, this.m, d(), ☃);
      case 3: 
        return a(☃, ☃, ☃, this.l.a - 1, this.l.b + ☃, this.l.c + ☃, this.m, d(), ☃);
      case 4: 
        return a(☃, ☃, ☃, this.l.d + 1, this.l.b + ☃, this.l.c + ☃, this.m, d(), ☃);
      }
    }
    return null;
  }
  
  protected aqt b(aqj.q ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, boolean ☃)
  {
    if (this.m != null) {
      switch (aqj.1.a[this.m.ordinal()])
      {
      case 1: 
        return a(☃, ☃, ☃, this.l.a - 1, this.l.b + ☃, this.l.c + ☃, cq.e, d(), ☃);
      case 2: 
        return a(☃, ☃, ☃, this.l.a - 1, this.l.b + ☃, this.l.c + ☃, cq.e, d(), ☃);
      case 3: 
        return a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃, this.l.c - 1, cq.c, d(), ☃);
      case 4: 
        return a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃, this.l.c - 1, cq.c, d(), ☃);
      }
    }
    return null;
  }
  
  protected aqt c(aqj.q ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, boolean ☃)
  {
    if (this.m != null) {
      switch (aqj.1.a[this.m.ordinal()])
      {
      case 1: 
        return a(☃, ☃, ☃, this.l.d + 1, this.l.b + ☃, this.l.c + ☃, cq.f, d(), ☃);
      case 2: 
        return a(☃, ☃, ☃, this.l.d + 1, this.l.b + ☃, this.l.c + ☃, cq.f, d(), ☃);
      case 3: 
        return a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃, this.l.f + 1, cq.d, d(), ☃);
      case 4: 
        return a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃, this.l.f + 1, cq.d, d(), ☃);
      }
    }
    return null;
  }
  
  protected static boolean a(aqe ☃)
  {
    return (☃ != null) && (☃.b > 10);
  }
}
