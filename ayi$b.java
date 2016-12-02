public class ayi$b
  implements awd.a
{
  private final avb b;
  private final String c;
  private final avs d;
  private final avs e;
  
  private ayi$b(ayi paramayi, avb ☃)
  {
    b = ☃;
    c = bnq.a(☃.g(), new Object[0]);
    d = new avs(0, 0, 0, 75, 20, bnq.a(☃.g(), new Object[0]));
    e = new avs(0, 0, 0, 50, 20, bnq.a("controls.reset", new Object[0]));
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    boolean ☃ = ba).f == b;
    aa).k.a(c, ☃ + 90 - ayi.c(a), ☃ + ☃ / 2 - aa).k.a / 2, 16777215);
    
    e.h = (☃ + 190);
    e.i = ☃;
    e.l = (b.i() != b.h());
    e.a(ayi.a(a), ☃, ☃);
    
    d.h = (☃ + 105);
    d.i = ☃;
    d.j = avh.c(b.i());
    
    boolean ☃ = false;
    if (b.i() != 0) {
      for (avb ☃ : aa).t.aw) {
        if ((☃ != b) && (☃.i() == b.i()))
        {
          ☃ = true;
          break;
        }
      }
    }
    if (☃) {
      d.j = (a.p + "> " + a.o + d.j + a.p + " <");
    } else if (☃) {
      d.j = (a.m + d.j);
    }
    d.a(ayi.a(a), ☃, ☃);
  }
  
  public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if (d.c(ayi.a(a), ☃, ☃))
    {
      ba).f = b;
      return true;
    }
    if (e.c(ayi.a(a), ☃, ☃))
    {
      aa).t.a(b, b.h());
      avb.b();
      return true;
    }
    return false;
  }
  
  public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    d.a(☃, ☃);
    e.a(☃, ☃);
  }
  
  public void a(int ☃, int ☃, int ☃) {}
}
