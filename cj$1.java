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
        if (this.b == null)
        {
          this.b = cj.1.this.a;
          return this.b;
        }
        if (this.b.equals(cj.1.this.b)) {
          return (cj)endOfData();
        }
        int ☃ = this.b.n();
        int ☃ = this.b.o();
        int ☃ = this.b.p();
        if (☃ < cj.1.this.b.n())
        {
          ☃++;
        }
        else if (☃ < cj.1.this.b.o())
        {
          ☃ = cj.1.this.a.n();
          ☃++;
        }
        else if (☃ < cj.1.this.b.p())
        {
          ☃ = cj.1.this.a.n();
          ☃ = cj.1.this.a.o();
          ☃++;
        }
        this.b = new cj(☃, ☃, ☃);
        return this.b;
      }
    };
  }
}
