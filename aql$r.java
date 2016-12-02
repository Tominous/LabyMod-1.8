public abstract class aql$r
  extends aqt
{
  protected static final alz a = afi.cI.a(aiu.b);
  protected static final alz b = afi.cI.a(aiu.N);
  protected static final alz c = afi.cI.a(aiu.O);
  protected static final alz d = b;
  protected static final alz e = afi.cJ.Q();
  protected static final alz f = afi.j.Q();
  protected static final int g = b(2, 0, 0);
  protected static final int h = b(2, 2, 0);
  protected static final int i = b(0, 1, 0);
  protected static final int j = b(4, 1, 0);
  protected aql.v k;
  
  protected static final int b(int ☃, int ☃, int ☃)
  {
    return ☃ * 25 + ☃ * 5 + ☃;
  }
  
  public aql$r()
  {
    super(0);
  }
  
  public aql$r(int ☃)
  {
    super(☃);
  }
  
  public aql$r(cq ☃, aqe ☃)
  {
    super(1);
    m = ☃;
    l = ☃;
  }
  
  protected aql$r(int ☃, cq ☃, aql.v ☃, int ☃, int ☃, int ☃)
  {
    super(☃);
    m = ☃;
    k = ☃;
    
    int ☃ = a;
    int ☃ = ☃ % 5;
    int ☃ = ☃ / 5 % 5;
    int ☃ = ☃ / 25;
    if ((☃ == cq.c) || (☃ == cq.d)) {
      l = new aqe(0, 0, 0, ☃ * 8 - 1, ☃ * 4 - 1, ☃ * 8 - 1);
    } else {
      l = new aqe(0, 0, 0, ☃ * 8 - 1, ☃ * 4 - 1, ☃ * 8 - 1);
    }
    switch (aql.1.a[☃.ordinal()])
    {
    case 1: 
      l.a(☃ * 8, ☃ * 4, -(☃ + ☃) * 8 + 1);
      break;
    case 2: 
      l.a(☃ * 8, ☃ * 4, ☃ * 8);
      break;
    case 3: 
      l.a(-(☃ + ☃) * 8 + 1, ☃ * 4, ☃ * 8);
      break;
    default: 
      l.a(☃ * 8, ☃ * 4, ☃ * 8);
    }
  }
  
  protected void a(dn ☃) {}
  
  protected void b(dn ☃) {}
  
  protected void a(adm ☃, aqe ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++) {
          if ((!☃) || (a(☃, ☃, ☃, ☃, ☃).c().t() != arm.a)) {
            if (d(☃) >= ☃.F()) {
              a(☃, afi.a.Q(), ☃, ☃, ☃, ☃);
            } else {
              a(☃, f, ☃, ☃, ☃, ☃);
            }
          }
        }
      }
    }
  }
  
  protected void a(adm ☃, aqe ☃, int ☃, int ☃, boolean ☃)
  {
    if (☃)
    {
      a(☃, ☃, ☃ + 0, 0, ☃ + 0, ☃ + 2, 0, ☃ + 8 - 1, a, a, false);
      a(☃, ☃, ☃ + 5, 0, ☃ + 0, ☃ + 8 - 1, 0, ☃ + 8 - 1, a, a, false);
      a(☃, ☃, ☃ + 3, 0, ☃ + 0, ☃ + 4, 0, ☃ + 2, a, a, false);
      a(☃, ☃, ☃ + 3, 0, ☃ + 5, ☃ + 4, 0, ☃ + 8 - 1, a, a, false);
      
      a(☃, ☃, ☃ + 3, 0, ☃ + 2, ☃ + 4, 0, ☃ + 2, b, b, false);
      a(☃, ☃, ☃ + 3, 0, ☃ + 5, ☃ + 4, 0, ☃ + 5, b, b, false);
      a(☃, ☃, ☃ + 2, 0, ☃ + 3, ☃ + 2, 0, ☃ + 4, b, b, false);
      a(☃, ☃, ☃ + 5, 0, ☃ + 3, ☃ + 5, 0, ☃ + 4, b, b, false);
    }
    else
    {
      a(☃, ☃, ☃ + 0, 0, ☃ + 0, ☃ + 8 - 1, 0, ☃ + 8 - 1, a, a, false);
    }
  }
  
  protected void a(adm ☃, aqe ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, alz ☃)
  {
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++) {
          if (a(☃, ☃, ☃, ☃, ☃) == f) {
            a(☃, ☃, ☃, ☃, ☃, ☃);
          }
        }
      }
    }
  }
  
  protected boolean a(aqe ☃, int ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = a(☃, ☃);
    int ☃ = b(☃, ☃);
    int ☃ = a(☃, ☃);
    int ☃ = b(☃, ☃);
    return ☃.a(Math.min(☃, ☃), Math.min(☃, ☃), Math.max(☃, ☃), Math.max(☃, ☃));
  }
  
  protected boolean a(adm ☃, aqe ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = a(☃, ☃);
    int ☃ = d(☃);
    int ☃ = b(☃, ☃);
    if (☃.b(new cj(☃, ☃, ☃)))
    {
      vt ☃ = new vt(☃);
      ☃.a(true);
      ☃.h(☃.bu());
      ☃.b(☃ + 0.5D, ☃, ☃ + 0.5D, 0.0F, 0.0F);
      ☃.a(☃.E(new cj(☃)), null);
      ☃.d(☃);
      return true;
    }
    return false;
  }
}
