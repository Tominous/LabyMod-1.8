import com.google.common.base.Predicate;

class sp$1
  implements Predicate<T>
{
  sp$1(sp paramsp, Predicate paramPredicate) {}
  
  public boolean a(T ☃)
  {
    if ((this.a != null) && (!this.a.apply(☃))) {
      return false;
    }
    if ((☃ instanceof wn))
    {
      double ☃ = this.b.f();
      if (☃.av()) {
        ☃ *= 0.800000011920929D;
      }
      if (☃.ax())
      {
        float ☃ = ((wn)☃).bY();
        if (☃ < 0.1F) {
          ☃ = 0.1F;
        }
        ☃ *= 0.7F * ☃;
      }
      if (☃.g(this.b.e) > ☃) {
        return false;
      }
    }
    return this.b.a(☃, false);
  }
}
