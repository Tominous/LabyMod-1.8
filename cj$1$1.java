import com.google.common.collect.AbstractIterator;

class cj$1$1
  extends AbstractIterator<cj>
{
  private cj b = null;
  
  cj$1$1(cj.1 param1) {}
  
  protected cj a()
  {
    if (b == null)
    {
      b = a.a;
      return b;
    }
    if (b.equals(a.b)) {
      return (cj)endOfData();
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
    b = new cj(☃, ☃, ☃);
    return b;
  }
}
