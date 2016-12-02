import com.google.common.collect.AbstractIterator;

class cj$2$1
  extends AbstractIterator<cj.a>
{
  private cj.a b = null;
  
  cj$2$1(cj.2 param2) {}
  
  protected cj.a a()
  {
    if (this.b == null)
    {
      this.b = new cj.a(this.a.a.n(), this.a.a.o(), this.a.a.p());
      return this.b;
    }
    if (this.b.equals(this.a.b)) {
      return (cj.a)endOfData();
    }
    int ☃ = this.b.n();
    int ☃ = this.b.o();
    int ☃ = this.b.p();
    if (☃ < this.a.b.n())
    {
      ☃++;
    }
    else if (☃ < this.a.b.o())
    {
      ☃ = this.a.a.n();
      ☃++;
    }
    else if (☃ < this.a.b.p())
    {
      ☃ = this.a.a.n();
      ☃ = this.a.a.o();
      ☃++;
    }
    cj.a.a(this.b, ☃);
    cj.a.b(this.b, ☃);
    cj.a.c(this.b, ☃);
    return this.b;
  }
}
