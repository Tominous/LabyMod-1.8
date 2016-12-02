import java.util.Random;

abstract class aqn$c
  extends aqt
{
  protected int a;
  protected int b;
  protected int c;
  protected int d = -1;
  
  public aqn$c() {}
  
  protected aqn$c(Random ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    super(0);
    
    a = ☃;
    b = ☃;
    c = ☃;
    
    m = cq.c.a.a(☃);
    switch (aqn.1.a[m.ordinal()])
    {
    case 1: 
    case 2: 
      l = new aqe(☃, ☃, ☃, ☃ + ☃ - 1, ☃ + ☃ - 1, ☃ + ☃ - 1);
      break;
    default: 
      l = new aqe(☃, ☃, ☃, ☃ + ☃ - 1, ☃ + ☃ - 1, ☃ + ☃ - 1);
    }
  }
  
  protected void a(dn ☃)
  {
    ☃.a("Width", a);
    ☃.a("Height", b);
    ☃.a("Depth", c);
    ☃.a("HPos", d);
  }
  
  protected void b(dn ☃)
  {
    a = ☃.f("Width");
    b = ☃.f("Height");
    c = ☃.f("Depth");
    d = ☃.f("HPos");
  }
  
  protected boolean a(adm ☃, aqe ☃, int ☃)
  {
    if (d >= 0) {
      return true;
    }
    int ☃ = 0;
    int ☃ = 0;
    cj.a ☃ = new cj.a();
    for (int ☃ = l.c; ☃ <= l.f; ☃++) {
      for (int ☃ = l.a; ☃ <= l.d; ☃++)
      {
        ☃.c(☃, 64, ☃);
        if (☃.b(☃))
        {
          ☃ += Math.max(☃.r(☃).o(), t.i());
          ☃++;
        }
      }
    }
    if (☃ == 0) {
      return false;
    }
    d = (☃ / ☃);
    l.a(0, d - l.b + ☃, 0);
    return true;
  }
}
