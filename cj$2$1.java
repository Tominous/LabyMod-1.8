import com.google.common.collect.AbstractIterator;

class cj$2$1
  extends AbstractIterator<cj.a>
{
  private cj.a b = null;
  
  cj$2$1(cj.2 param2) {}
  
  protected cj.a a()
  {
    if (b == null)
    {
      b = new cj.a(a.a.n(), a.a.o(), a.a.p());
      return b;
    }
    if (b.equals(a.b)) {
      return (cj.a)endOfData();
    }
    int ☃ = b.n();
    int ☃ = b.o();
    int ☃ = b.p();
    if (☃ < a.b.n())
    {
      ☃++;
    }
    else if (☃ < a.b.o())
    {
      ☃ = a.a.n();
      ☃++;
    }
    else if (☃ < a.b.p())
    {
      ☃ = a.a.n();
      ☃ = a.a.o();
      ☃++;
    }
    cj.a.a(b, ☃);
    cj.a.b(b, ☃);
    cj.a.c(b, ☃);
    return b;
  }
}
