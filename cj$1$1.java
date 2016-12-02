import com.google.common.collect.AbstractIterator;

class cj$1$1
  extends AbstractIterator<cj>
{
  private cj b = null;
  
  cj$1$1(cj.1 param1) {}
  
  protected cj a()
  {
    if (this.b == null)
    {
      this.b = this.a.a;
      return this.b;
    }
    if (this.b.equals(this.a.b)) {
      return (cj)endOfData();
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
    this.b = new cj(☃, ☃, ☃);
    return this.b;
  }
}
