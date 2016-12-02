public class ayi$b
  implements awd.a
{
  private final avb b;
  private final String c;
  private final avs d;
  private final avs e;
  
  private ayi$b(ayi paramayi, avb ☃)
  {
    this.b = ☃;
    this.c = bnq.a(☃.g(), new Object[0]);
    this.d = new avs(0, 0, 0, 75, 20, bnq.a(☃.g(), new Object[0]));
    this.e = new avs(0, 0, 0, 50, 20, bnq.a("controls.reset", new Object[0]));
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    boolean ☃ = ayi.b(this.a).f == this.b;
    ayi.a(this.a).k.a(this.c, ☃ + 90 - ayi.c(this.a), ☃ + ☃ / 2 - ayi.a(this.a).k.a / 2, 16777215);
    
    this.e.h = (☃ + 190);
    this.e.i = ☃;
    this.e.l = (this.b.i() != this.b.h());
    this.e.a(ayi.a(this.a), ☃, ☃);
    
    this.d.h = (☃ + 105);
    this.d.i = ☃;
    this.d.j = avh.c(this.b.i());
    
    boolean ☃ = false;
    if (this.b.i() != 0) {
      for (avb ☃ : ayi.a(this.a).t.aw) {
        if ((☃ != this.b) && (☃.i() == this.b.i()))
        {
          ☃ = true;
          break;
        }
      }
    }
    if (☃) {
      this.d.j = (a.p + "> " + a.o + this.d.j + a.p + " <");
    } else if (☃) {
      this.d.j = (a.m + this.d.j);
    }
    this.d.a(ayi.a(this.a), ☃, ☃);
  }
  
  public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if (this.d.c(ayi.a(this.a), ☃, ☃))
    {
      ayi.b(this.a).f = this.b;
      return true;
    }
    if (this.e.c(ayi.a(this.a), ☃, ☃))
    {
      ayi.a(this.a).t.a(this.b, this.b.h());
      avb.b();
      return true;
    }
    return false;
  }
  
  public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    this.d.a(☃, ☃);
    this.e.a(☃, ☃);
  }
  
  public void a(int ☃, int ☃, int ☃) {}
}
