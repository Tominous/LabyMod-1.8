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
        if (this.b == null)
        {
          this.b = new cj.a(cj.2.this.a.n(), cj.2.this.a.o(), cj.2.this.a.p());
          return this.b;
        }
        if (this.b.equals(cj.2.this.b)) {
          return (cj.a)endOfData();
        }
        int ☃ = this.b.n();
        int ☃ = this.b.o();
        int ☃ = this.b.p();
        if (☃ < cj.2.this.b.n())
        {
          ☃++;
        }
        else if (☃ < cj.2.this.b.o())
        {
          ☃ = cj.2.this.a.n();
          ☃++;
        }
        else if (☃ < cj.2.this.b.p())
        {
          ☃ = cj.2.this.a.n();
          ☃ = cj.2.this.a.o();
          ☃++;
        }
        cj.a.a(this.b, ☃);
        cj.a.b(this.b, ☃);
        cj.a.c(this.b, ☃);
        return this.b;
      }
    };
  }
}
