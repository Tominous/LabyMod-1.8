import com.google.common.collect.AbstractIterator;
import java.util.Iterator;

final class cj$1
  implements Iterable<cj>
{
  cj$1(cj paramcj1, cj paramcj2) {}
  
  public Iterator<cj> iterator()
  {
    new AbstractIterator()
    {
      private cj b = null;
      
      protected cj a()
      {
        if (b == null)
        {
          b = a;
          return b;
        }
        if (b.equals(b)) {
          return (cj)endOfData();
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
        b = new cj(☃, ☃, ☃);
        return b;
      }
    };
  }
}
