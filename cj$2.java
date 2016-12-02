import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

final class cj$2
  implements Iterable<cj.a>
{
  cj$2(cj paramcj1, cj paramcj2) {}
  
  public Iterator<cj.a> iterator()
  {
    new AbstractIterator()
    {
      private cj.a b = null;
      
      protected cj.a a()
      {
        if (b == null)
        {
          b = new cj.a(a.n(), a.o(), a.p());
          return b;
        }
        if (b.equals(b)) {
          return (cj.a)endOfData();
        }
        int ☃ = b.n();
        int ☃ = b.o();
        int ☃ = b.p();
        if (☃ < b.n())
        {
          ☃++;
        }
        else if (☃ < b.o())
        {
          ☃ = a.n();
          ☃++;
        }
        else if (☃ < b.p())
        {
          ☃ = a.n();
          ☃ = a.o();
          ☃++;
        }
        cj.a.a(b, ☃);
        cj.a.b(b, ☃);
        cj.a.c(b, ☃);
        return b;
      }
    };
  }
}
