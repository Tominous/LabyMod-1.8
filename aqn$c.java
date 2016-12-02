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
    
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    
    this.m = cq.c.a.a(☃);
    switch (aqn.1.a[this.m.ordinal()])
    {
    case 1: 
    case 2: 
      this.l = new aqe(☃, ☃, ☃, ☃ + ☃ - 1, ☃ + ☃ - 1, ☃ + ☃ - 1);
      break;
    default: 
      this.l = new aqe(☃, ☃, ☃, ☃ + ☃ - 1, ☃ + ☃ - 1, ☃ + ☃ - 1);
    }
  }
  
  protected void a(dn ☃)
  {
    ☃.a("Width", this.a);
    ☃.a("Height", this.b);
    ☃.a("Depth", this.c);
    ☃.a("HPos", this.d);
  }
  
  protected void b(dn ☃)
  {
    this.a = ☃.f("Width");
    this.b = ☃.f("Height");
    this.c = ☃.f("Depth");
    this.d = ☃.f("HPos");
  }
  
  protected boolean a(adm ☃, aqe ☃, int ☃)
  {
    if (this.d >= 0) {
      return true;
    }
    int ☃ = 0;
    int ☃ = 0;
    cj.a ☃ = new cj.a();
    for (int ☃ = this.l.c; ☃ <= this.l.f; ☃++) {
      for (int ☃ = this.l.a; ☃ <= this.l.d; ☃++)
      {
        ☃.c(☃, 64, ☃);
        if (☃.b(☃))
        {
          ☃ += Math.max(☃.r(☃).o(), ☃.t.i());
          ☃++;
        }
      }
    }
    if (☃ == 0) {
      return false;
    }
    this.d = (☃ / ☃);
    this.l.a(0, this.d - this.l.b + ☃, 0);
    return true;
  }
}
